package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class T extends AbstractC0186b implements RandomAccess {

    /* renamed from: l, reason: collision with root package name */
    public static final T f3457l = new T(new Object[0], 0, false);

    /* renamed from: e, reason: collision with root package name */
    public Object[] f3458e;

    /* renamed from: i, reason: collision with root package name */
    public int f3459i;

    public T(Object[] objArr, int i2, boolean z7) {
        this.f3482d = z7;
        this.f3458e = objArr;
        this.f3459i = i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i2 = this.f3459i;
        Object[] objArr = this.f3458e;
        if (i2 == objArr.length) {
            this.f3458e = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3458e;
        int i5 = this.f3459i;
        this.f3459i = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.f3459i) {
            StringBuilder k7 = C4.p.k(i2, "Index:", ", Size:");
            k7.append(this.f3459i);
            throw new IndexOutOfBoundsException(k7.toString());
        }
    }

    public final T c(int i2) {
        if (i2 >= this.f3459i) {
            return new T(Arrays.copyOf(this.f3458e, i2), this.f3459i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        b(i2);
        return this.f3458e[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0186b, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        b(i2);
        Object[] objArr = this.f3458e;
        Object obj = objArr[i2];
        if (i2 < this.f3459i - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.f3459i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        a();
        b(i2);
        Object[] objArr = this.f3458e;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3459i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i5;
        a();
        if (i2 >= 0 && i2 <= (i5 = this.f3459i)) {
            Object[] objArr = this.f3458e;
            if (i5 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i5 - i2);
            } else {
                Object[] objArr2 = new Object[((i5 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                System.arraycopy(this.f3458e, i2, objArr2, i2 + 1, this.f3459i - i2);
                this.f3458e = objArr2;
            }
            this.f3458e[i2] = obj;
            this.f3459i++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder k7 = C4.p.k(i2, "Index:", ", Size:");
        k7.append(this.f3459i);
        throw new IndexOutOfBoundsException(k7.toString());
    }
}
