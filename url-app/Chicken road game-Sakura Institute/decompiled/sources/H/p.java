package H;

import A.C0020p;
import B1.C0097d;
import G.C0190c;
import G.C0192d;
import G.C0223t;
import G.H0;
import java.util.ArrayList;
import z2.C1436t;

/* loaded from: classes.dex */
public final class p extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final p f3213c = new p(1, 0, 2);

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        C0190c c0190c;
        int c4;
        int d4 = c0020p.d(0);
        if (!(h02.f2698n == 0)) {
            C0192d.w("Cannot move a group while inserting");
            throw null;
        }
        if (!(d4 >= 0)) {
            C0192d.w("Parameter offset is out of bounds");
            throw null;
        }
        if (d4 == 0) {
            return;
        }
        int i2 = h02.f2704t;
        int i4 = h02.f2706v;
        int i5 = h02.f2705u;
        int i6 = i2;
        while (d4 > 0) {
            i6 += h02.f2686b[(h02.p(i6) * 5) + 3];
            if (i6 > i5) {
                C0192d.w("Parameter offset is out of bounds");
                throw null;
            }
            d4--;
        }
        int i7 = h02.f2686b[(h02.p(i6) * 5) + 3];
        int f4 = h02.f(h02.f2686b, h02.p(h02.f2704t));
        int f5 = h02.f(h02.f2686b, h02.p(i6));
        int i8 = i6 + i7;
        int f6 = h02.f(h02.f2686b, h02.p(i8));
        int i9 = f6 - f5;
        h02.s(i9, Math.max(h02.f2704t - 1, 0));
        h02.r(i7);
        int[] iArr = h02.f2686b;
        int p4 = h02.p(i8) * 5;
        C1436t.e(iArr, iArr, h02.p(i2) * 5, p4, (i7 * 5) + p4);
        if (i9 > 0) {
            Object[] objArr = h02.f2687c;
            C1436t.f(objArr, objArr, f4, h02.g(f5 + i9), h02.g(f6 + i9));
        }
        int i10 = f5 + i9;
        int i11 = i10 - f4;
        int i12 = h02.f2695k;
        int i13 = h02.f2696l;
        int length = h02.f2687c.length;
        int i14 = h02.f2697m;
        int i15 = i2 + i7;
        int i16 = i2;
        while (i16 < i15) {
            int p5 = h02.p(i16);
            int i17 = i15;
            int i18 = i11;
            iArr[(p5 * 5) + 4] = H0.h(H0.h(h02.f(iArr, p5) - i11, i14 < p5 ? 0 : i12, i13, length), h02.f2695k, h02.f2696l, h02.f2687c.length);
            i16++;
            i11 = i18;
            i15 = i17;
            i12 = i12;
            i13 = i13;
        }
        int i19 = i8 + i7;
        int n2 = h02.n();
        int n4 = C0192d.n(h02.f2688d, i8, n2);
        ArrayList arrayList = new ArrayList();
        if (n4 >= 0) {
            while (n4 < h02.f2688d.size() && (c4 = h02.c((c0190c = (C0190c) h02.f2688d.get(n4)))) >= i8 && c4 < i19) {
                arrayList.add(c0190c);
                h02.f2688d.remove(n4);
            }
        }
        int i20 = i2 - i8;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            C0190c c0190c2 = (C0190c) arrayList.get(i21);
            int c5 = h02.c(c0190c2) + i20;
            if (c5 >= h02.f2691g) {
                c0190c2.f2791a = -(n2 - c5);
            } else {
                c0190c2.f2791a = c5;
            }
            h02.f2688d.add(C0192d.n(h02.f2688d, c5, n2), c0190c2);
        }
        if (h02.B(i8, i7)) {
            C0192d.w("Unexpectedly removed anchors");
            throw null;
        }
        h02.l(i4, h02.f2705u, i2);
        if (i9 > 0) {
            h02.C(i10, i9, i8 - 1);
        }
    }

    @Override // H.C
    public final String b(int i2) {
        return u3.l.a0(i2, 0) ? "offset" : super.b(i2);
    }
}
