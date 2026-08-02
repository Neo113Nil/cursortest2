package kotlinx.collections.immutable.implementations.immutableList;

import java.util.Arrays;
import java.util.ListIterator;
import okhttp3.Cache;
import okio.Utf8;

/* loaded from: classes9.dex */
public final class PersistentVector extends AbstractPersistentList {
    public final Object[] root;
    public final int rootShift;
    public final int size;
    public final Object[] tail;

    public PersistentVector(int i, int i2, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        this.root = objArr;
        this.tail = objArr2;
        this.size = i;
        this.rootShift = i2;
        if (getSize() > 32) {
            int length = objArr2.length;
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + getSize()).toString());
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List
    public final AbstractPersistentList add(Object obj) {
        int i = this.size;
        int i2 = i - ((i - 1) & (-32));
        int i3 = this.rootShift;
        Object[] objArr = this.root;
        Object[] objArr2 = this.tail;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new PersistentVector(i + 1, i3, objArr, copyOf);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        if ((i >> 5) <= (1 << i3)) {
            return new PersistentVector(i + 1, i3, pushTail$1(objArr, objArr2, i3), objArr3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new PersistentVector(i + 1, i4, pushTail$1(objArr4, objArr2, i4), objArr3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        int i2 = this.size;
        Cache.Companion.checkElementIndex$kotlinx_collections_immutable(i, i2);
        if (((i2 - 1) & (-32)) <= i) {
            objArr = this.tail;
        } else {
            Object[] objArr2 = this.root;
            for (int i3 = this.rootShift; i3 > 0; i3 -= 5) {
                Object[] objArr3 = objArr2[Utf8.indexSegment(i, i3)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        Cache.Companion.checkPositionIndex$kotlinx_collections_immutable(i, this.size);
        return new PersistentVectorIterator(i, this.size, (this.rootShift / 5) + 1, this.root, this.tail);
    }

    public final Object[] pushTail$1(Object[] objArr, Object[] objArr2, int i) {
        int indexSegment = Utf8.indexSegment(getSize() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[indexSegment] = objArr2;
            return copyOf;
        }
        copyOf[indexSegment] = pushTail$1((Object[]) copyOf[indexSegment], objArr2, i - 5);
        return copyOf;
    }
}
