package kotlin.collections.builders;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractMutableSet;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class SetBuilder extends AbstractMutableSet implements Set, Serializable {
    private static final Companion Companion = new Companion(null);
    public static final SetBuilder Empty;
    public final MapBuilder backing;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        MapBuilder.Companion.getClass();
        Empty = new SetBuilder(MapBuilder.Empty);
    }

    public SetBuilder() {
        this.backing = new MapBuilder();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.backing.addKey$kotlin_stdlib(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.backing.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractMutableSet
    public final int getSize() {
        return this.backing.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.backing;
        mapBuilder.getClass();
        return new MapBuilder.KeysItr(mapBuilder, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder mapBuilder = this.backing;
        mapBuilder.checkIsMutable$kotlin_stdlib();
        int findKey = mapBuilder.findKey(obj);
        if (findKey < 0) {
            return false;
        }
        mapBuilder.removeEntryAt(findKey);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }

    public SetBuilder(MapBuilder mapBuilder) {
        mapBuilder.getClass();
        this.backing = mapBuilder;
    }

    public SetBuilder(int i) {
        this.backing = new MapBuilder(i);
    }
}
