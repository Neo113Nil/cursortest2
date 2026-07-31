package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 extends b implements RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    public static final v0 f787g = new v0(new Object[0], 0, false);

    /* renamed from: e, reason: collision with root package name */
    public Object[] f788e;

    /* renamed from: f, reason: collision with root package name */
    public int f789f;

    public v0(Object[] objArr, int i, boolean z3) {
        this.f649d = z3;
        this.f788e = objArr;
        this.f789f = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f789f;
        Object[] objArr = this.f788e;
        if (i == objArr.length) {
            this.f788e = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f788e;
        int i8 = this.f789f;
        this.f789f = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.f789f) {
            StringBuilder l3 = a0.q.l("Index:", i, ", Size:");
            l3.append(this.f789f);
            throw new IndexOutOfBoundsException(l3.toString());
        }
    }

    public final v0 c(int i) {
        if (i >= this.f789f) {
            return new v0(Arrays.copyOf(this.f788e, i), this.f789f, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.f788e[i];
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.f788e;
        Object obj = objArr[i];
        if (i < this.f789f - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f789f--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.f788e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f789f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i8;
        a();
        if (i >= 0 && i <= (i8 = this.f789f)) {
            Object[] objArr = this.f788e;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i8 - i);
            } else {
                Object[] objArr2 = new Object[((i8 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f788e, i, objArr2, i + 1, this.f789f - i);
                this.f788e = objArr2;
            }
            this.f788e[i] = obj;
            this.f789f++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder l3 = a0.q.l("Index:", i, ", Size:");
        l3.append(this.f789f);
        throw new IndexOutOfBoundsException(l3.toString());
    }
}
