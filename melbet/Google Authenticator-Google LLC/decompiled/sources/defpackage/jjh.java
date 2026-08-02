package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jjh extends jjc implements RandomAccess, jkx, jls {
    private static final boolean[] b;
    public int a;
    private boolean[] c;

    static {
        boolean[] zArr = new boolean[0];
        b = zArr;
        new jjh(zArr, 0, false);
    }

    jjh() {
        this(b, 0, true);
    }

    private final String g(int i) {
        return "Index:" + i + ", Size:" + this.a;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.a) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        bM();
        if (i < 0 || i > (i2 = this.a)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.c;
        int length = zArr.length;
        if (i2 < length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, zArr2, 0, i);
            System.arraycopy(this.c, i, zArr2, i3, this.a - i);
            this.c = zArr2;
        }
        this.c[i] = booleanValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.jjc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        bM();
        collection.getClass();
        if (!(collection instanceof jjh)) {
            return super.addAll(collection);
        }
        jjh jjhVar = (jjh) collection;
        int i = jjhVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.c;
        if (i3 > zArr.length) {
            zArr = Arrays.copyOf(zArr, i3);
            this.c = zArr;
        }
        System.arraycopy(jjhVar.c, 0, zArr, this.a, jjhVar.a);
        this.a = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.jkx
    public final /* bridge */ /* synthetic */ jkx d(int i) {
        if (i >= this.a) {
            return new jjh(i == 0 ? b : Arrays.copyOf(this.c, i), this.a, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(boolean z) {
        bM();
        int i = this.a;
        boolean[] zArr = this.c;
        int length = zArr.length;
        if (i == length) {
            zArr = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, zArr, 0, this.a);
            this.c = zArr;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        zArr[i2] = z;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjh)) {
            return super.equals(obj);
        }
        jjh jjhVar = (jjh) obj;
        if (this.a != jjhVar.a) {
            return false;
        }
        boolean[] zArr = jjhVar.c;
        for (int i = 0; i < this.a; i++) {
            if (this.c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean f(int i) {
        h(i);
        return this.c[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Boolean.valueOf(f(i));
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.a; i2++) {
            boolean z = this.c[i2];
            byte[] bArr = jky.a;
            i = (i * 31) + a.m(z);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        bM();
        h(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        if (i < this.a - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        bM();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.c;
        System.arraycopy(zArr, i2, zArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        bM();
        h(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private jjh(boolean[] zArr, int i, boolean z) {
        super(z);
        this.c = zArr;
        this.a = i;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
