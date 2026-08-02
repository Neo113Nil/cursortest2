package kotlinx.collections.immutable.implementations.immutableList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArraysKt___ArraysKt;
import okhttp3.Cache;

/* loaded from: classes3.dex */
public final class SmallPersistentVector extends AbstractPersistentList {
    public static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);
    public final Object[] buffer;

    public SmallPersistentVector(Object[] objArr) {
        this.buffer = objArr;
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List
    public final AbstractPersistentList add(Object obj) {
        Object[] objArr = this.buffer;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new SmallPersistentVector(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new PersistentVector(objArr.length + 1, 0, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.List
    public final AbstractPersistentList addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return this;
        }
        Object[] objArr = this.buffer;
        if (collection.size() + objArr.length > 32) {
            PersistentVectorBuilder builder = builder();
            builder.addAll(collection);
            return builder.build();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new SmallPersistentVector(copyOf);
    }

    public final PersistentVectorBuilder builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.buffer;
        Cache.Companion.checkElementIndex$kotlinx_collections_immutable(i, objArr.length);
        return objArr[i];
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.buffer.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return ArraysKt___ArraysKt.indexOf(this.buffer, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return ArraysKt___ArraysKt.lastIndexOf(this.buffer, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.buffer;
        Cache.Companion.checkPositionIndex$kotlinx_collections_immutable(i, objArr.length);
        return new BufferIterator(i, objArr.length, objArr);
    }
}
