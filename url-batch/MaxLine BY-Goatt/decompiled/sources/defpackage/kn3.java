package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kn3 extends bm3 implements RandomAccess, on3, so3 {
    public static final int[] p;
    public static final kn3 q;
    public int[] n;
    public int o;

    static {
        int[] iArr = new int[0];
        p = iArr;
        q = new kn3(iArr, 0, false);
    }

    public kn3(int[] iArr, int i, boolean z) {
        super(z);
        this.n = iArr;
        this.o = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.o)) {
            a.c(tn0.c(this.o, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.n;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.n, 0, iArr2, 0, i);
            System.arraycopy(this.n, i, iArr2, i3, this.o - i);
            this.n = iArr2;
        }
        this.n[i] = intValue;
        this.o++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.bm3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = sn3.a;
        collection.getClass();
        if (!(collection instanceof kn3)) {
            return super.addAll(collection);
        }
        kn3 kn3Var = (kn3) collection;
        int i = kn3Var.o;
        if (i == 0) {
            return false;
        }
        int i2 = this.o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.n;
        if (i3 > iArr.length) {
            this.n = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(kn3Var.n, 0, this.n, this.o, kn3Var.o);
        this.o = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.rn3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kn3 h(int i) {
        if (i >= this.o) {
            return new kn3(i == 0 ? p : Arrays.copyOf(this.n, i), this.o, true);
        }
        b71.t();
        return null;
    }

    public final int c(int i) {
        e(i);
        return this.n[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        a();
        int i2 = this.o;
        int length = this.n.length;
        if (i2 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.n, 0, iArr, 0, this.o);
            this.n = iArr;
        }
        int[] iArr2 = this.n;
        int i3 = this.o;
        this.o = i3 + 1;
        iArr2[i3] = i;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.o) {
            a.c(tn0.c(this.o, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.bm3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn3)) {
            return super.equals(obj);
        }
        kn3 kn3Var = (kn3) obj;
        if (this.o != kn3Var.o) {
            return false;
        }
        int[] iArr = kn3Var.n;
        for (int i = 0; i < this.o; i++) {
            if (this.n[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        e(i);
        return Integer.valueOf(this.n[i]);
    }

    @Override // defpackage.bm3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.o; i2++) {
            i = (i * 31) + this.n[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.n[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.bm3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        e(i);
        int[] iArr = this.n;
        int i2 = iArr[i];
        if (i < this.o - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.o--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            a.c("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.n;
        System.arraycopy(iArr, i2, iArr, i, this.o - i2);
        this.o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        e(i);
        int[] iArr = this.n;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
