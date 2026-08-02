package androidx.datastore.preferences.protobuf;

import E.AbstractC0005f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class U extends AbstractC0169b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final U f4594d = new U(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4595b;

    /* renamed from: c, reason: collision with root package name */
    public int f4596c;

    public U(Object[] objArr, int i4, boolean z) {
        this.f4617a = z;
        this.f4595b = objArr;
        this.f4596c = i4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i4 = this.f4596c;
        Object[] objArr = this.f4595b;
        if (i4 == objArr.length) {
            this.f4595b = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4595b;
        int i5 = this.f4596c;
        this.f4596c = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i4) {
        if (i4 < 0 || i4 >= this.f4596c) {
            StringBuilder r4 = AbstractC0005f.r(i4, "Index:", ", Size:");
            r4.append(this.f4596c);
            throw new IndexOutOfBoundsException(r4.toString());
        }
    }

    public final U d(int i4) {
        if (i4 >= this.f4596c) {
            return new U(Arrays.copyOf(this.f4595b, i4), this.f4596c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        c(i4);
        return this.f4595b[i4];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0169b, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        b();
        c(i4);
        Object[] objArr = this.f4595b;
        Object obj = objArr[i4];
        if (i4 < this.f4596c - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f4596c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        b();
        c(i4);
        Object[] objArr = this.f4595b;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4596c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        b();
        if (i4 >= 0 && i4 <= (i5 = this.f4596c)) {
            Object[] objArr = this.f4595b;
            if (i5 < objArr.length) {
                System.arraycopy(objArr, i4, objArr, i4 + 1, i5 - i4);
            } else {
                Object[] objArr2 = new Object[((i5 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i4);
                System.arraycopy(this.f4595b, i4, objArr2, i4 + 1, this.f4596c - i4);
                this.f4595b = objArr2;
            }
            this.f4595b[i4] = obj;
            this.f4596c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder r4 = AbstractC0005f.r(i4, "Index:", ", Size:");
        r4.append(this.f4596c);
        throw new IndexOutOfBoundsException(r4.toString());
    }
}
