package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlh extends jjc implements RandomAccess, jkw, jls {
    public static final jlh a;
    private static final long[] d;
    public long[] b;
    public int c;

    static {
        long[] jArr = new long[0];
        d = jArr;
        a = new jlh(jArr, 0, false);
    }

    jlh() {
        this(d, 0, true);
    }

    private final String g(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.jkx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jkw d(int i) {
        if (i >= this.c) {
            return new jlh(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        bM();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, jArr2, 0, i);
            System.arraycopy(this.b, i, jArr2, i3, this.c - i);
            this.b = jArr2;
        }
        this.b[i] = longValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.jjc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        bM();
        collection.getClass();
        if (!(collection instanceof jlh)) {
            return super.addAll(collection);
        }
        jlh jlhVar = (jlh) collection;
        int i = jlhVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.b;
        if (i3 > jArr.length) {
            jArr = Arrays.copyOf(jArr, i3);
            this.b = jArr;
        }
        System.arraycopy(jlhVar.b, 0, jArr, this.c, jlhVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.jkw
    public final void e(long j) {
        bM();
        int i = this.c;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i == length) {
            jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, jArr, 0, this.c);
            this.b = jArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        jArr[i2] = j;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlh)) {
            return super.equals(obj);
        }
        jlh jlhVar = (jlh) obj;
        if (this.c != jlhVar.c) {
            return false;
        }
        long[] jArr = jlhVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i) {
        h(i);
        return this.b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(f(i));
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + jky.a(this.b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        bM();
        h(i);
        long[] jArr = this.b;
        long j = jArr[i];
        if (i < this.c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        bM();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i2, jArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        bM();
        h(i);
        long[] jArr = this.b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private jlh(long[] jArr, int i, boolean z) {
        super(z);
        this.b = jArr;
        this.c = i;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
