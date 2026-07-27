package androidx.datastore.preferences.protobuf;

import A.AbstractC0017m;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class X extends AbstractC0436b implements RandomAccess {

    /* renamed from: j, reason: collision with root package name */
    public static final X f5306j;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f5307e;

    /* renamed from: i, reason: collision with root package name */
    public int f5308i;

    static {
        X x2 = new X(new Object[0], 0);
        f5306j = x2;
        x2.f5317d = false;
    }

    public X(Object[] objArr, int i2) {
        this.f5307e = objArr;
        this.f5308i = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0436b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i2 = this.f5308i;
        Object[] objArr = this.f5307e;
        if (i2 == objArr.length) {
            this.f5307e = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5307e;
        int i4 = this.f5308i;
        this.f5308i = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        h(i2);
        return this.f5307e[i2];
    }

    public final void h(int i2) {
        if (i2 < 0 || i2 >= this.f5308i) {
            StringBuilder o4 = AbstractC0017m.o(i2, "Index:", ", Size:");
            o4.append(this.f5308i);
            throw new IndexOutOfBoundsException(o4.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0457w
    public final InterfaceC0457w q(int i2) {
        if (i2 >= this.f5308i) {
            return new X(Arrays.copyOf(this.f5307e, i2), this.f5308i);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0436b, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        e();
        h(i2);
        Object[] objArr = this.f5307e;
        Object obj = objArr[i2];
        if (i2 < this.f5308i - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.f5308i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        e();
        h(i2);
        Object[] objArr = this.f5307e;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5308i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i4;
        e();
        if (i2 >= 0 && i2 <= (i4 = this.f5308i)) {
            Object[] objArr = this.f5307e;
            if (i4 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i4 - i2);
            } else {
                Object[] objArr2 = new Object[((i4 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                System.arraycopy(this.f5307e, i2, objArr2, i2 + 1, this.f5308i - i2);
                this.f5307e = objArr2;
            }
            this.f5307e[i2] = obj;
            this.f5308i++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder o4 = AbstractC0017m.o(i2, "Index:", ", Size:");
        o4.append(this.f5308i);
        throw new IndexOutOfBoundsException(o4.toString());
    }
}
