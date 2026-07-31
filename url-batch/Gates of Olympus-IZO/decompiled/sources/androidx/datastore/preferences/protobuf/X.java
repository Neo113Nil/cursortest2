package androidx.datastore.preferences.protobuf;

import H2.AbstractC0080b;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class X extends AbstractC0191b implements RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    public static final X f3831g;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f3832e;

    /* renamed from: f, reason: collision with root package name */
    public int f3833f;

    static {
        X x3 = new X(new Object[0], 0);
        f3831g = x3;
        x3.f3842d = false;
    }

    public X(Object[] objArr, int i3) {
        this.f3832e = objArr;
        this.f3833f = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0191b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i3 = this.f3833f;
        Object[] objArr = this.f3832e;
        if (i3 == objArr.length) {
            this.f3832e = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3832e;
        int i4 = this.f3833f;
        this.f3833f = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i3) {
        if (i3 < 0 || i3 >= this.f3833f) {
            StringBuilder l3 = AbstractC0080b.l("Index:", i3, ", Size:");
            l3.append(this.f3833f);
            throw new IndexOutOfBoundsException(l3.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0212w
    public final InterfaceC0212w f(int i3) {
        if (i3 >= this.f3833f) {
            return new X(Arrays.copyOf(this.f3832e, i3), this.f3833f);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        c(i3);
        return this.f3832e[i3];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0191b, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        b();
        c(i3);
        Object[] objArr = this.f3832e;
        Object obj = objArr[i3];
        if (i3 < this.f3833f - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f3833f--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        b();
        c(i3);
        Object[] objArr = this.f3832e;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3833f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        b();
        if (i3 >= 0 && i3 <= (i4 = this.f3833f)) {
            Object[] objArr = this.f3832e;
            if (i4 < objArr.length) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, i4 - i3);
            } else {
                Object[] objArr2 = new Object[((i4 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(this.f3832e, i3, objArr2, i3 + 1, this.f3833f - i3);
                this.f3832e = objArr2;
            }
            this.f3832e[i3] = obj;
            this.f3833f++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder l3 = AbstractC0080b.l("Index:", i3, ", Size:");
        l3.append(this.f3833f);
        throw new IndexOutOfBoundsException(l3.toString());
    }
}
