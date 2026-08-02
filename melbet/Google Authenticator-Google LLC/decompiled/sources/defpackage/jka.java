package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jka extends jjc implements RandomAccess, jkx, jls {
    private static final double[] c;
    public double[] a;
    public int b;

    static {
        double[] dArr = new double[0];
        c = dArr;
        new jka(dArr, 0, false);
    }

    jka() {
        this(c, 0, true);
    }

    private final String g(int i) {
        return "Index:" + i + ", Size:" + this.b;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        bM();
        if (i < 0 || i > (i2 = this.b)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i2 < length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.a, 0, dArr2, 0, i);
            System.arraycopy(this.a, i, dArr2, i3, this.b - i);
            this.a = dArr2;
        }
        this.a[i] = doubleValue;
        this.b++;
        this.modCount++;
    }

    @Override // defpackage.jjc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        bM();
        collection.getClass();
        if (!(collection instanceof jka)) {
            return super.addAll(collection);
        }
        jka jkaVar = (jka) collection;
        int i = jkaVar.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.a;
        if (i3 > dArr.length) {
            dArr = Arrays.copyOf(dArr, i3);
            this.a = dArr;
        }
        System.arraycopy(jkaVar.a, 0, dArr, this.b, jkaVar.b);
        this.b = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.jkx
    public final /* bridge */ /* synthetic */ jkx d(int i) {
        if (i >= this.b) {
            return new jka(i == 0 ? c : Arrays.copyOf(this.a, i), this.b, true);
        }
        throw new IllegalArgumentException();
    }

    public final double e(int i) {
        h(i);
        return this.a[i];
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jka)) {
            return super.equals(obj);
        }
        jka jkaVar = (jka) obj;
        if (this.b != jkaVar.b) {
            return false;
        }
        double[] dArr = jkaVar.a;
        for (int i = 0; i < this.b; i++) {
            if (Double.doubleToLongBits(this.a[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void f(double d) {
        bM();
        int i = this.b;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i == length) {
            dArr = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.a, 0, dArr, 0, this.b);
            this.a = dArr;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        dArr[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Double.valueOf(e(i));
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + jky.a(Double.doubleToLongBits(this.a[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        bM();
        h(i);
        double[] dArr = this.a;
        double d = dArr[i];
        if (i < this.b - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.b--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        bM();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.a;
        System.arraycopy(dArr, i2, dArr, i, this.b - i2);
        this.b -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        bM();
        h(i);
        double[] dArr = this.a;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    private jka(double[] dArr, int i, boolean z) {
        super(z);
        this.a = dArr;
        this.b = i;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Double) obj).doubleValue());
        return true;
    }
}
