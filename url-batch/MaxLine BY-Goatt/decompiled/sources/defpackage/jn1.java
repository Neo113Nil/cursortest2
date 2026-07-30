package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jn1 {
    public Object[] a;
    public int b;

    public jn1(int i) {
        this.a = i == 0 ? ot1.a : new Object[i];
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            l(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            l(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void c() {
        ni.k(0, this.b, null, this.a);
        this.b = 0;
    }

    public final Object d() {
        if (!g()) {
            return this.a[0];
        }
        ch2.k("ObjectList is empty.");
        return null;
    }

    public final Object e(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        m(i);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jn1) {
            jn1 jn1Var = (jn1) obj;
            int i = jn1Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = jn1Var.a;
                IntRange f = d.f(0, i2);
                int i3 = f.m;
                int i4 = f.n;
                if (i3 > i4) {
                    return true;
                }
                while (Intrinsics.b(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean g() {
        return this.b == 0;
    }

    public final boolean h() {
        return this.b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final boolean i(Object obj) {
        int f = f(obj);
        if (f < 0) {
            return false;
        }
        j(f);
        return true;
    }

    public final Object j(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            m(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            ni.e(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void k(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.b);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                ni.e(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            ni.k(i5, i4, null, this.a);
            this.b = i5;
        }
    }

    public final void l(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        ni.e(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final void m(int i) {
        StringBuilder n = in1.n(i, "Index ", " must be in 0..");
        n.append(this.b - 1);
        throw new IndexOutOfBoundsException(n.toString());
    }

    public final String toString() {
        j6 j6Var = new j6(26, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) j6Var.invoke(obj));
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ jn1() {
        this(16);
    }
}
