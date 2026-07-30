package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class Serialization {

    static final class FieldSetter<T> {
        private final Field field;

        void set(T t7, Object obj) {
            try {
                this.field.set(t7, obj);
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            }
        }

        private FieldSetter(Field field) {
            this.field = field;
            field.setAccessible(true);
        }

        void set(T t7, int i8) {
            try {
                this.field.set(t7, Integer.valueOf(i8));
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    private Serialization() {
    }

    static <T> FieldSetter<T> getFieldSetter(Class<T> cls, String str) {
        try {
            return new FieldSetter<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e8) {
            throw new AssertionError(e8);
        }
    }

    static <K, V> void populateMap(Map<K, V> map, ObjectInputStream objectInputStream) {
        populateMap(map, objectInputStream, objectInputStream.readInt());
    }

    static <K, V> void populateMultimap(Multimap<K, V> multimap, ObjectInputStream objectInputStream) {
        populateMultimap(multimap, objectInputStream, objectInputStream.readInt());
    }

    static <E> void populateMultiset(Multiset<E> multiset, ObjectInputStream objectInputStream) {
        populateMultiset(multiset, objectInputStream, objectInputStream.readInt());
    }

    static int readCount(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    static <K, V> void writeMap(Map<K, V> map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    static <K, V> void writeMultimap(Multimap<K, V> multimap, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(multimap.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : multimap.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    static <E> void writeMultiset(Multiset<E> multiset, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(multiset.entrySet().size());
        for (Multiset.Entry<E> entry : multiset.entrySet()) {
            objectOutputStream.writeObject(entry.getElement());
            objectOutputStream.writeInt(entry.getCount());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void populateMap(Map<K, V> map, ObjectInputStream objectInputStream, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void populateMultimap(Multimap<K, V> multimap, ObjectInputStream objectInputStream, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            Collection collection = multimap.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i10 = 0; i10 < readInt; i10++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> void populateMultiset(Multiset<E> multiset, ObjectInputStream objectInputStream, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            multiset.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }
}
