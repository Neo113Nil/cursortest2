package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jkh extends jjc implements RandomAccess, jkx, jls {
    private static final float[] c;
    public float[] a;
    public int b;

    static {
        float[] fArr = new float[0];
        c = fArr;
        new jkh(fArr, 0, false);
    }

    jkh() {
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
        float floatValue = ((Float) obj).floatValue();
        bM();
        if (i < 0 || i > (i2 = this.b)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        float[] fArr = this.a;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.a, 0, fArr2, 0, i);
            System.arraycopy(this.a, i, fArr2, i3, this.b - i);
            this.a = fArr2;
        }
        this.a[i] = floatValue;
        this.b++;
        this.modCount++;
    }

    @Override // defpackage.jjc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        bM();
        collection.getClass();
        if (!(collection instanceof jkh)) {
            return super.addAll(collection);
        }
        jkh jkhVar = (jkh) collection;
        int i = jkhVar.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.a;
        if (i3 > fArr.length) {
            fArr = Arrays.copyOf(fArr, i3);
            this.a = fArr;
        }
        System.arraycopy(jkhVar.a, 0, fArr, this.b, jkhVar.b);
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
            return new jkh(i == 0 ? c : Arrays.copyOf(this.a, i), this.b, true);
        }
        throw new IllegalArgumentException();
    }

    public final float e(int i) {
        h(i);
        return this.a[i];
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkh)) {
            return super.equals(obj);
        }
        jkh jkhVar = (jkh) obj;
        if (this.b != jkhVar.b) {
            return false;
        }
        float[] fArr = jkhVar.a;
        for (int i = 0; i < this.b; i++) {
            if (Float.floatToIntBits(this.a[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void f(float f) {
        bM();
        int i = this.b;
        float[] fArr = this.a;
        int length = fArr.length;
        if (i == length) {
            fArr = new float[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.a, 0, fArr, 0, this.b);
            this.a = fArr;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        fArr[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(e(i));
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.a[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        bM();
        h(i);
        float[] fArr = this.a;
        float f = fArr[i];
        if (i < this.b - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.b--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        bM();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.a;
        System.arraycopy(fArr, i2, fArr, i, this.b - i2);
        this.b -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        bM();
        h(i);
        float[] fArr = this.a;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    public jkh(float[] fArr, int i, boolean z) {
        super(z);
        this.a = fArr;
        this.b = i;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Float) obj).floatValue());
        return true;
    }
}
