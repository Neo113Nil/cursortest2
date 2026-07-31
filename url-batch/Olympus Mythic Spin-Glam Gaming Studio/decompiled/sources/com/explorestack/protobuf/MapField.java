package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public class MapField implements MutabilityOracle {
    private final Converter converter;
    private volatile boolean isMutable;
    private List listData;
    private MutatabilityAwareMap mapData;
    private volatile StorageMode mode;

    private interface Converter {
        Message convertKeyAndValueToMessage(Object obj, Object obj2);

        void convertMessageToKeyAndValue(Message message, Map map);

        Message getMessageDefaultInstance();
    }

    private enum StorageMode {
        MAP,
        LIST,
        BOTH
    }

    private static class ImmutableMessageConverter implements Converter {
        private final MapEntry defaultEntry;

        public ImmutableMessageConverter(MapEntry mapEntry) {
            this.defaultEntry = mapEntry;
        }

        @Override // com.explorestack.protobuf.MapField.Converter
        public Message convertKeyAndValueToMessage(Object obj, Object obj2) {
            return this.defaultEntry.newBuilderForType().setKey(obj).setValue(obj2).buildPartial();
        }

        @Override // com.explorestack.protobuf.MapField.Converter
        public void convertMessageToKeyAndValue(Message message, Map map) {
            MapEntry mapEntry = (MapEntry) message;
            map.put(mapEntry.getKey(), mapEntry.getValue());
        }

        @Override // com.explorestack.protobuf.MapField.Converter
        public Message getMessageDefaultInstance() {
            return this.defaultEntry;
        }
    }

    private MapField(Converter converter, StorageMode storageMode, Map map) {
        this.converter = converter;
        this.isMutable = true;
        this.mode = storageMode;
        this.mapData = new MutatabilityAwareMap(this, map);
        this.listData = null;
    }

    private MapField(MapEntry mapEntry, StorageMode storageMode, Map map) {
        this(new ImmutableMessageConverter(mapEntry), storageMode, map);
    }

    public static MapField emptyMapField(MapEntry mapEntry) {
        return new MapField(mapEntry, StorageMode.MAP, Collections.emptyMap());
    }

    public static MapField newMapField(MapEntry mapEntry) {
        return new MapField(mapEntry, StorageMode.MAP, new LinkedHashMap());
    }

    private Message convertKeyAndValueToMessage(Object obj, Object obj2) {
        return this.converter.convertKeyAndValueToMessage(obj, obj2);
    }

    private void convertMessageToKeyAndValue(Message message, Map map) {
        this.converter.convertMessageToKeyAndValue(message, map);
    }

    private List convertMapToList(MutatabilityAwareMap mutatabilityAwareMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mutatabilityAwareMap.entrySet()) {
            arrayList.add(convertKeyAndValueToMessage(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private MutatabilityAwareMap convertListToMap(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            convertMessageToKeyAndValue((Message) it.next(), linkedHashMap);
        }
        return new MutatabilityAwareMap(this, linkedHashMap);
    }

    public Map getMap() {
        StorageMode storageMode = this.mode;
        StorageMode storageMode2 = StorageMode.LIST;
        if (storageMode == storageMode2) {
            synchronized (this) {
                try {
                    if (this.mode == storageMode2) {
                        this.mapData = convertListToMap(this.listData);
                        this.mode = StorageMode.BOTH;
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableMap(this.mapData);
    }

    public Map getMutableMap() {
        StorageMode storageMode = this.mode;
        StorageMode storageMode2 = StorageMode.MAP;
        if (storageMode != storageMode2) {
            if (this.mode == StorageMode.LIST) {
                this.mapData = convertListToMap(this.listData);
            }
            this.listData = null;
            this.mode = storageMode2;
        }
        return this.mapData;
    }

    public void mergeFrom(MapField mapField) {
        getMutableMap().putAll(MapFieldLite.copy(mapField.getMap()));
    }

    public void clear() {
        this.mapData = new MutatabilityAwareMap(this, new LinkedHashMap());
        this.mode = StorageMode.MAP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MapField) {
            return MapFieldLite.equals(getMap(), ((MapField) obj).getMap());
        }
        return false;
    }

    public int hashCode() {
        return MapFieldLite.calculateHashCodeForMap(getMap());
    }

    public MapField copy() {
        return new MapField(this.converter, StorageMode.MAP, MapFieldLite.copy(getMap()));
    }

    List getList() {
        StorageMode storageMode = this.mode;
        StorageMode storageMode2 = StorageMode.MAP;
        if (storageMode == storageMode2) {
            synchronized (this) {
                try {
                    if (this.mode == storageMode2) {
                        this.listData = convertMapToList(this.mapData);
                        this.mode = StorageMode.BOTH;
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableList(this.listData);
    }

    List getMutableList() {
        StorageMode storageMode = this.mode;
        StorageMode storageMode2 = StorageMode.LIST;
        if (storageMode != storageMode2) {
            if (this.mode == StorageMode.MAP) {
                this.listData = convertMapToList(this.mapData);
            }
            this.mapData = null;
            this.mode = storageMode2;
        }
        return this.listData;
    }

    Message getMapEntryMessageDefaultInstance() {
        return this.converter.getMessageDefaultInstance();
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    @Override // com.explorestack.protobuf.MutabilityOracle
    public void ensureMutable() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    private static class MutatabilityAwareMap implements Map {
        private final Map delegate;
        private final MutabilityOracle mutabilityOracle;

        MutatabilityAwareMap(MutabilityOracle mutabilityOracle, Map map) {
            this.mutabilityOracle = mutabilityOracle;
            this.delegate = map;
        }

        @Override // java.util.Map
        public int size() {
            return this.delegate.size();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.delegate.isEmpty();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.delegate.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.delegate.containsValue(obj);
        }

        @Override // java.util.Map
        public Object get(Object obj) {
            return this.delegate.get(obj);
        }

        @Override // java.util.Map
        public Object put(Object obj, Object obj2) {
            this.mutabilityOracle.ensureMutable();
            Internal.checkNotNull(obj);
            Internal.checkNotNull(obj2);
            return this.delegate.put(obj, obj2);
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            this.mutabilityOracle.ensureMutable();
            return this.delegate.remove(obj);
        }

        @Override // java.util.Map
        public void putAll(Map map) {
            this.mutabilityOracle.ensureMutable();
            for (Object obj : map.keySet()) {
                Internal.checkNotNull(obj);
                Internal.checkNotNull(map.get(obj));
            }
            this.delegate.putAll(map);
        }

        @Override // java.util.Map
        public void clear() {
            this.mutabilityOracle.ensureMutable();
            this.delegate.clear();
        }

        @Override // java.util.Map
        public Set keySet() {
            return new MutatabilityAwareSet(this.mutabilityOracle, this.delegate.keySet());
        }

        @Override // java.util.Map
        public Collection values() {
            return new MutatabilityAwareCollection(this.mutabilityOracle, this.delegate.values());
        }

        @Override // java.util.Map
        public Set entrySet() {
            return new MutatabilityAwareSet(this.mutabilityOracle, this.delegate.entrySet());
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return this.delegate.equals(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.delegate.hashCode();
        }

        public String toString() {
            return this.delegate.toString();
        }

        private static class MutatabilityAwareCollection implements Collection {
            private final Collection delegate;
            private final MutabilityOracle mutabilityOracle;

            MutatabilityAwareCollection(MutabilityOracle mutabilityOracle, Collection collection) {
                this.mutabilityOracle = mutabilityOracle;
                this.delegate = collection;
            }

            @Override // java.util.Collection
            public int size() {
                return this.delegate.size();
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.delegate.isEmpty();
            }

            @Override // java.util.Collection
            public boolean contains(Object obj) {
                return this.delegate.contains(obj);
            }

            @Override // java.util.Collection, java.lang.Iterable
            public Iterator iterator() {
                return new MutatabilityAwareIterator(this.mutabilityOracle, this.delegate.iterator());
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return this.delegate.toArray();
            }

            @Override // java.util.Collection
            public Object[] toArray(Object[] objArr) {
                return this.delegate.toArray(objArr);
            }

            @Override // java.util.Collection
            public boolean add(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                this.mutabilityOracle.ensureMutable();
                return this.delegate.remove(obj);
            }

            @Override // java.util.Collection
            public boolean containsAll(Collection collection) {
                return this.delegate.containsAll(collection);
            }

            @Override // java.util.Collection
            public boolean addAll(Collection collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection collection) {
                this.mutabilityOracle.ensureMutable();
                return this.delegate.removeAll(collection);
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection collection) {
                this.mutabilityOracle.ensureMutable();
                return this.delegate.retainAll(collection);
            }

            @Override // java.util.Collection
            public void clear() {
                this.mutabilityOracle.ensureMutable();
                this.delegate.clear();
            }

            @Override // java.util.Collection
            public boolean equals(Object obj) {
                return this.delegate.equals(obj);
            }

            @Override // java.util.Collection
            public int hashCode() {
                return this.delegate.hashCode();
            }

            public String toString() {
                return this.delegate.toString();
            }
        }

        private static class MutatabilityAwareSet implements Set {
            private final Set delegate;
            private final MutabilityOracle mutabilityOracle;

            MutatabilityAwareSet(MutabilityOracle mutabilityOracle, Set set) {
                this.mutabilityOracle = mutabilityOracle;
                this.delegate = set;
            }

            @Override // java.util.Set, java.util.Collection
            public int size() {
                return this.delegate.size();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.delegate.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                return this.delegate.contains(obj);
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator iterator() {
                return new MutatabilityAwareIterator(this.mutabilityOracle, this.delegate.iterator());
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return this.delegate.toArray();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray(Object[] objArr) {
                return this.delegate.toArray(objArr);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(Object obj) {
                this.mutabilityOracle.ensureMutable();
                return this.delegate.add(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                this.mutabilityOracle.ensureMutable();
                return this.delegate.remove(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection collection) {
                return this.delegate.containsAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection collection) {
                this.mutabilityOracle.ensureMutable();
                return this.delegate.addAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection collection) {
                this.mutabilityOracle.ensureMutable();
                return this.delegate.retainAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection collection) {
                this.mutabilityOracle.ensureMutable();
                return this.delegate.removeAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.mutabilityOracle.ensureMutable();
                this.delegate.clear();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean equals(Object obj) {
                return this.delegate.equals(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public int hashCode() {
                return this.delegate.hashCode();
            }

            public String toString() {
                return this.delegate.toString();
            }
        }

        private static class MutatabilityAwareIterator implements Iterator {
            private final Iterator delegate;
            private final MutabilityOracle mutabilityOracle;

            MutatabilityAwareIterator(MutabilityOracle mutabilityOracle, Iterator it) {
                this.mutabilityOracle = mutabilityOracle;
                this.delegate = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.delegate.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                return this.delegate.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.mutabilityOracle.ensureMutable();
                this.delegate.remove();
            }

            public boolean equals(Object obj) {
                return this.delegate.equals(obj);
            }

            public int hashCode() {
                return this.delegate.hashCode();
            }

            public String toString() {
                return this.delegate.toString();
            }
        }
    }
}
