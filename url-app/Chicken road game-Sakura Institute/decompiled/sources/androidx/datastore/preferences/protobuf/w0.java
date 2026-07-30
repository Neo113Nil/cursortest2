package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w0 extends b implements RandomAccess {

    /* renamed from: i, reason: collision with root package name */
    public static final w0 f919i;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f920g;

    /* renamed from: h, reason: collision with root package name */
    public int f921h;

    static {
        w0 w0Var = new w0(new Object[0], 0);
        f919i = w0Var;
        w0Var.f794f = false;
    }

    public w0(Object[] objArr, int i7) {
        this.f920g = objArr;
        this.f921h = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i7 = this.f921h;
        Object[] objArr = this.f920g;
        if (i7 == objArr.length) {
            this.f920g = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f920g;
        int i8 = this.f921h;
        this.f921h = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final w e(int i7) {
        if (i7 >= this.f921h) {
            return new w0(Arrays.copyOf(this.f920g, i7), this.f921h);
        }
        throw new IllegalArgumentException();
    }

    public final void g(int i7) {
        if (i7 < 0 || i7 >= this.f921h) {
            StringBuilder n8 = a0.m.n(i7, "Index:", ", Size:");
            n8.append(this.f921h);
            throw new IndexOutOfBoundsException(n8.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        g(i7);
        return this.f920g[i7];
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        g(i7);
        Object[] objArr = this.f920g;
        Object obj = objArr[i7];
        if (i7 < this.f921h - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f921h--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a();
        g(i7);
        Object[] objArr = this.f920g;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f921h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        a();
        if (i7 >= 0 && i7 <= (i8 = this.f921h)) {
            Object[] objArr = this.f920g;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
            } else {
                Object[] objArr2 = new Object[((i8 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(this.f920g, i7, objArr2, i7 + 1, this.f921h - i7);
                this.f920g = objArr2;
            }
            this.f920g[i7] = obj;
            this.f921h++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder n8 = a0.m.n(i7, "Index:", ", Size:");
        n8.append(this.f921h);
        throw new IndexOutOfBoundsException(n8.toString());
    }
}
