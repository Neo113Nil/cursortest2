package androidx.datastore.preferences.protobuf;

import b2.AbstractC0279e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class T extends AbstractC0207b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final T f4395d = new T(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4396b;

    /* renamed from: c, reason: collision with root package name */
    public int f4397c;

    public T(Object[] objArr, int i2, boolean z) {
        this.f4419a = z;
        this.f4396b = objArr;
        this.f4397c = i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i2 = this.f4397c;
        Object[] objArr = this.f4396b;
        if (i2 == objArr.length) {
            this.f4396b = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4396b;
        int i3 = this.f4397c;
        this.f4397c = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.f4397c) {
            StringBuilder i3 = AbstractC0279e.i(i2, "Index:", ", Size:");
            i3.append(this.f4397c);
            throw new IndexOutOfBoundsException(i3.toString());
        }
    }

    public final T d(int i2) {
        if (i2 >= this.f4397c) {
            return new T(Arrays.copyOf(this.f4396b, i2), this.f4397c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        c(i2);
        return this.f4396b[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207b, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        b();
        c(i2);
        Object[] objArr = this.f4396b;
        Object obj = objArr[i2];
        if (i2 < this.f4397c - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.f4397c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        b();
        c(i2);
        Object[] objArr = this.f4396b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4397c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        b();
        if (i2 >= 0 && i2 <= (i3 = this.f4397c)) {
            Object[] objArr = this.f4396b;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
            } else {
                Object[] objArr2 = new Object[((i3 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                System.arraycopy(this.f4396b, i2, objArr2, i2 + 1, this.f4397c - i2);
                this.f4396b = objArr2;
            }
            this.f4396b[i2] = obj;
            this.f4397c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder i6 = AbstractC0279e.i(i2, "Index:", ", Size:");
        i6.append(this.f4397c);
        throw new IndexOutOfBoundsException(i6.toString());
    }
}
