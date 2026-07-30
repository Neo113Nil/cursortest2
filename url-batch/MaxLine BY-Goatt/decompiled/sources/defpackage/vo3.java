package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vo3 extends bm3 implements RandomAccess {
    public static final Object[] p;
    public static final vo3 q;
    public Object[] n;
    public int o;

    static {
        Object[] objArr = new Object[0];
        p = objArr;
        q = new vo3(objArr, 0, false);
    }

    public vo3(Object[] objArr, int i, boolean z) {
        super(z);
        this.n = objArr;
        this.o = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.o)) {
            a.c(tn0.c(this.o, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.n;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.n, 0, objArr2, 0, i);
            System.arraycopy(this.n, i, objArr2, i3, this.o - i);
            this.n = objArr2;
        }
        this.n[i] = obj;
        this.o++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.o) {
            a.c(tn0.c(this.o, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.n[i];
    }

    @Override // defpackage.rn3
    public final /* bridge */ /* synthetic */ rn3 h(int i) {
        if (i >= this.o) {
            return new vo3(i == 0 ? p : Arrays.copyOf(this.n, i), this.o, true);
        }
        b71.t();
        return null;
    }

    @Override // defpackage.bm3, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.n;
        Object obj = objArr[i];
        if (i < this.o - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.n;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.o;
        int length = this.n.length;
        if (i == length) {
            this.n = Arrays.copyOf(this.n, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.n;
        int i2 = this.o;
        this.o = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
