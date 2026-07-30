package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zm0 {
    public final vn0 a;

    public static final Object a(vn0 vn0Var) {
        Object g = vn0Var.g(null);
        if (g == null) {
            return null;
        }
        if (!(g instanceof mn0)) {
            vn0Var.k(null);
            return g;
        }
        mn0 mn0Var = (mn0) g;
        if (mn0Var.h()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = mn0Var.b - 1;
        Object f = mn0Var.f(i);
        mn0Var.k(i);
        f.getClass();
        if (mn0Var.h()) {
            vn0Var.k(null);
        }
        if (mn0Var.b == 1) {
            vn0Var.m(null, mn0Var.e());
        }
        return f;
    }

    public static final mn0 b(vn0 vn0Var) {
        if (vn0Var.i()) {
            mn0 mn0Var = rq0.b;
            mn0Var.getClass();
            return mn0Var;
        }
        mn0 mn0Var2 = new mn0();
        Object[] objArr = vn0Var.c;
        long[] jArr = vn0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof mn0) {
                                mn0Var2.b((mn0) obj);
                            } else {
                                obj.getClass();
                                mn0Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return mn0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zm0) {
            return this.a.equals(((zm0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
