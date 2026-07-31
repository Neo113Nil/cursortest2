package J;

import B.C0014o;
import I.C0141c;
import I.C0143d;
import I.C0174t;
import I.H0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final p f3143c = new p(1, 0, 2);

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        C0141c c0141c;
        int c2;
        int d3 = c0014o.d(0);
        if (!(h02.f2700n == 0)) {
            C0143d.w("Cannot move a group while inserting");
            throw null;
        }
        if (!(d3 >= 0)) {
            C0143d.w("Parameter offset is out of bounds");
            throw null;
        }
        if (d3 == 0) {
            return;
        }
        int i3 = h02.f2706t;
        int i4 = h02.f2708v;
        int i5 = h02.f2707u;
        int i6 = i3;
        while (d3 > 0) {
            i6 += h02.f2688b[(h02.p(i6) * 5) + 3];
            if (i6 > i5) {
                C0143d.w("Parameter offset is out of bounds");
                throw null;
            }
            d3--;
        }
        int i7 = h02.f2688b[(h02.p(i6) * 5) + 3];
        int f3 = h02.f(h02.f2688b, h02.p(h02.f2706t));
        int f4 = h02.f(h02.f2688b, h02.p(i6));
        int i8 = i6 + i7;
        int f5 = h02.f(h02.f2688b, h02.p(i8));
        int i9 = f5 - f4;
        h02.s(i9, Math.max(h02.f2706t - 1, 0));
        h02.r(i7);
        int[] iArr = h02.f2688b;
        int p3 = h02.p(i8) * 5;
        S1.k.l0(iArr, iArr, h02.p(i3) * 5, p3, (i7 * 5) + p3);
        if (i9 > 0) {
            Object[] objArr = h02.f2689c;
            S1.k.m0(objArr, objArr, f3, h02.g(f4 + i9), h02.g(f5 + i9));
        }
        int i10 = f4 + i9;
        int i11 = i10 - f3;
        int i12 = h02.f2697k;
        int i13 = h02.f2698l;
        int length = h02.f2689c.length;
        int i14 = h02.f2699m;
        int i15 = i3 + i7;
        int i16 = i3;
        while (i16 < i15) {
            int p4 = h02.p(i16);
            int i17 = i15;
            int i18 = i11;
            iArr[(p4 * 5) + 4] = H0.h(H0.h(h02.f(iArr, p4) - i11, i14 < p4 ? 0 : i12, i13, length), h02.f2697k, h02.f2698l, h02.f2689c.length);
            i16++;
            i11 = i18;
            i15 = i17;
            i12 = i12;
            i13 = i13;
        }
        int i19 = i8 + i7;
        int n3 = h02.n();
        int n4 = C0143d.n(h02.f2690d, i8, n3);
        ArrayList arrayList = new ArrayList();
        if (n4 >= 0) {
            while (n4 < h02.f2690d.size() && (c2 = h02.c((c0141c = (C0141c) h02.f2690d.get(n4)))) >= i8 && c2 < i19) {
                arrayList.add(c0141c);
                h02.f2690d.remove(n4);
            }
        }
        int i20 = i3 - i8;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            C0141c c0141c2 = (C0141c) arrayList.get(i21);
            int c3 = h02.c(c0141c2) + i20;
            if (c3 >= h02.f2693g) {
                c0141c2.f2794a = -(n3 - c3);
            } else {
                c0141c2.f2794a = c3;
            }
            h02.f2690d.add(C0143d.n(h02.f2690d, c3, n3), c0141c2);
        }
        if (h02.B(i8, i7)) {
            C0143d.w("Unexpectedly removed anchors");
            throw null;
        }
        h02.l(i4, h02.f2707u, i3);
        if (i9 > 0) {
            h02.C(i10, i9, i8 - 1);
        }
    }

    @Override // J.C
    public final String b(int i3) {
        return O2.l.Z(i3, 0) ? "offset" : super.b(i3);
    }
}
