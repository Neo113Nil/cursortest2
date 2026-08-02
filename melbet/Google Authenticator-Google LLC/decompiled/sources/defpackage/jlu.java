package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlu extends jjc implements RandomAccess {
    public static final jlu a;
    private static final Object[] c;
    public Object[] b;
    private int d;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        a = new jlu(objArr, 0, false);
    }

    jlu() {
        this(c, 0, true);
    }

    private final String e(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void f(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        bM();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i3, this.d - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.jkx
    public final /* bridge */ /* synthetic */ jkx d(int i) {
        if (i >= this.d) {
            return new jlu(i == 0 ? c : Arrays.copyOf(this.b, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.d;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof jlu)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.b[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        jlu jluVar = (jlu) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.b[i3].equals(jluVar.b[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f(i);
        return this.b[i];
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.d;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + this.b[i3].hashCode();
        }
        return i2;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        bM();
        f(i);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i < this.d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return obj;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        bM();
        f(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private jlu(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.d = i;
    }

    @Override // defpackage.jjc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        bM();
        int i = this.d;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i == length) {
            objArr = Arrays.copyOf(this.b, Math.max(((length * 3) / 2) + 1, 10));
            this.b = objArr;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
