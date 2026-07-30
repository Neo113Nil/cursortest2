package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class co3 extends bm3 implements RandomAccess, qn3, so3 {
    public static final long[] p;
    public static final co3 q;
    public long[] n;
    public int o;

    static {
        long[] jArr = new long[0];
        p = jArr;
        q = new co3(jArr, 0, false);
    }

    public co3(long[] jArr, int i, boolean z) {
        super(z);
        this.n = jArr;
        this.o = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.o)) {
            a.c(tn0.c(this.o, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.n;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.n, 0, jArr2, 0, i);
            System.arraycopy(this.n, i, jArr2, i3, this.o - i);
            this.n = jArr2;
        }
        this.n[i] = longValue;
        this.o++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.bm3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = sn3.a;
        collection.getClass();
        if (!(collection instanceof co3)) {
            return super.addAll(collection);
        }
        co3 co3Var = (co3) collection;
        int i = co3Var.o;
        if (i == 0) {
            return false;
        }
        int i2 = this.o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.n;
        if (i3 > jArr.length) {
            this.n = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(co3Var.n, 0, this.n, this.o, co3Var.o);
        this.o = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long b(int i) {
        e(i);
        return this.n[i];
    }

    @Override // defpackage.rn3
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final co3 h(int i) {
        if (i >= this.o) {
            return new co3(i == 0 ? p : Arrays.copyOf(this.n, i), this.o, true);
        }
        b71.t();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j) {
        a();
        int i = this.o;
        int length = this.n.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.n, 0, jArr, 0, this.o);
            this.n = jArr;
        }
        long[] jArr2 = this.n;
        int i2 = this.o;
        this.o = i2 + 1;
        jArr2[i2] = j;
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
        if (!(obj instanceof co3)) {
            return super.equals(obj);
        }
        co3 co3Var = (co3) obj;
        if (this.o != co3Var.o) {
            return false;
        }
        long[] jArr = co3Var.n;
        for (int i = 0; i < this.o; i++) {
            if (this.n[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        e(i);
        return Long.valueOf(this.n[i]);
    }

    @Override // defpackage.bm3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.o; i2++) {
            long j = this.n[i2];
            Charset charset = sn3.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.n[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.bm3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        e(i);
        long[] jArr = this.n;
        long j = jArr[i];
        if (i < this.o - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.o--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            a.c("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.n;
        System.arraycopy(jArr, i2, jArr, i, this.o - i2);
        this.o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        e(i);
        long[] jArr = this.n;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
