package o0;

import java.util.NoSuchElementException;
import s.d0;
import s.h0;
import s.n0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f7310a;

    public static final Object a(h0 h0Var) {
        Object g = h0Var.g(null);
        if (g == null) {
            return null;
        }
        if (!(g instanceof d0)) {
            h0Var.k(null);
            return g;
        }
        d0 d0Var = (d0) g;
        if (d0Var.h()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i3 = d0Var.f8285b - 1;
        Object f3 = d0Var.f(i3);
        d0Var.k(i3);
        f3.getClass();
        if (d0Var.h()) {
            h0Var.k(null);
        }
        if (d0Var.f8285b == 1) {
            h0Var.m(null, d0Var.e());
        }
        return f3;
    }

    public static final d0 b(h0 h0Var) {
        if (h0Var.i()) {
            d0 d0Var = n0.f8349b;
            d0Var.getClass();
            return d0Var;
        }
        d0 d0Var2 = new d0();
        Object[] objArr = h0Var.f8314c;
        long[] jArr = h0Var.f8312a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i3 << 3) + i11];
                            if (obj instanceof d0) {
                                d0Var2.c((d0) obj);
                            } else {
                                obj.getClass();
                                d0Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return d0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f7310a.equals(((a) obj).f7310a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7310a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f7310a + ')';
    }
}
