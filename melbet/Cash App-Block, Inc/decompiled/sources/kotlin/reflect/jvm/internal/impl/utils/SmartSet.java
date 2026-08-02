package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractMutableSet;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt__SequencesKt$sequenceOf$1$1;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderBaseIterator;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNodeMutableEntriesIterator;

/* loaded from: classes9.dex */
public final class SmartSet<T> extends AbstractMutableSet {
    public static final Companion Companion = new Companion(null);
    public Object data;
    public int size;

    public SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final <T> SmartSet<T> create() {
        return Companion.create();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        Object[] objArr;
        if (size() == 0) {
            this.data = t;
        } else if (size() != 1) {
            int size = size();
            Object obj = this.data;
            if (size < 5) {
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                if (ArraysKt___ArraysKt.contains(objArr2, t)) {
                    return false;
                }
                if (size() == 4) {
                    ?? linkedSetOf = SetsKt__SetsKt.linkedSetOf(Arrays.copyOf(objArr2, objArr2.length));
                    linkedSetOf.add(t);
                    objArr = linkedSetOf;
                } else {
                    Object[] copyOf = Arrays.copyOf(objArr2, size() + 1);
                    copyOf[copyOf.length - 1] = t;
                    objArr = copyOf;
                }
                this.data = objArr;
            } else {
                obj.getClass();
                if (!TypeIntrinsics.asMutableSet(obj).add(t)) {
                    return false;
                }
            }
        } else {
            if (Intrinsics.areEqual(this.data, t)) {
                return false;
            }
            this.data = new Object[]{this.data, t};
        }
        setSize(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.data = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.areEqual(this.data, obj);
        }
        int size = size();
        Object obj2 = this.data;
        if (size < 5) {
            obj2.getClass();
            return ArraysKt___ArraysKt.contains((Object[]) obj2, obj);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new SequencesKt__SequencesKt$sequenceOf$1$1(this.data, 1);
        }
        int size = size();
        Object obj = this.data;
        if (size < 5) {
            obj.getClass();
            return new ArrayIterator((Object[]) obj);
        }
        obj.getClass();
        return TypeIntrinsics.asMutableSet(obj).iterator();
    }

    public void setSize(int i) {
        this.size = i;
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final <T> SmartSet<T> create(Collection<? extends T> collection) {
            collection.getClass();
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(collection);
            return smartSet;
        }

        public final <T> SmartSet<T> create() {
            return new SmartSet<>(null);
        }
    }

    public final class ArrayIterator implements Iterator, KMappedMarker {
        public final /* synthetic */ int $r8$classId = 1;
        public final Object arrayIterator;

        public ArrayIterator(PersistentHashMapBuilder persistentHashMapBuilder) {
            persistentHashMapBuilder.getClass();
            TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
            for (int i = 0; i < 8; i++) {
                trieNodeBaseIteratorArr[i] = new TrieNodeMutableEntriesIterator(this);
            }
            this.arrayIterator = new PersistentHashMapBuilderBaseIterator(persistentHashMapBuilder, trieNodeBaseIteratorArr);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            switch (this.$r8$classId) {
                case 0:
                    return ((kotlin.jvm.internal.ArrayIterator) this.arrayIterator).hasNext();
                case 1:
                    return ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderBaseIterator) this.arrayIterator).hasNext;
                default:
                    return ((PersistentHashMapBuilderBaseIterator) this.arrayIterator).hasNext;
            }
        }

        @Override // java.util.Iterator
        public final Object next() {
            switch (this.$r8$classId) {
                case 0:
                    return ((kotlin.jvm.internal.ArrayIterator) this.arrayIterator).next();
                case 1:
                    return (Map.Entry) ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderBaseIterator) this.arrayIterator).next();
                default:
                    return (Map.Entry) ((PersistentHashMapBuilderBaseIterator) this.arrayIterator).next();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            switch (this.$r8$classId) {
                case 0:
                    throw new UnsupportedOperationException();
                case 1:
                    ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderBaseIterator) this.arrayIterator).remove();
                    return;
                default:
                    ((PersistentHashMapBuilderBaseIterator) this.arrayIterator).remove();
                    return;
            }
        }

        public ArrayIterator(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder persistentHashMapBuilder) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator[8];
            for (int i = 0; i < 8; i++) {
                trieNodeBaseIteratorArr[i] = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeMutableEntriesIterator(this);
            }
            this.arrayIterator = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderBaseIterator(persistentHashMapBuilder, trieNodeBaseIteratorArr);
        }

        public ArrayIterator(Object[] objArr) {
            objArr.getClass();
            this.arrayIterator = new kotlin.jvm.internal.ArrayIterator(objArr);
        }
    }
}
