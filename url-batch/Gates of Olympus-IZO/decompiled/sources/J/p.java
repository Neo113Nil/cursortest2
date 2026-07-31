package J;

import D1.C0014b;
import I.C0087c;
import I.C0089d;
import I.C0120t;
import I.I0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final p f2568c = new p(1, 0, 2);

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        C0087c c0087c;
        int c3;
        int b2 = d3.b(0);
        if (!(i02.f2146n == 0)) {
            C0089d.w("Cannot move a group while inserting");
            throw null;
        }
        if (!(b2 >= 0)) {
            C0089d.w("Parameter offset is out of bounds");
            throw null;
        }
        if (b2 == 0) {
            return;
        }
        int i3 = i02.f2151t;
        int i4 = i02.f2153v;
        int i5 = i02.f2152u;
        int i6 = i3;
        while (b2 > 0) {
            i6 += i02.f2134b[(i02.p(i6) * 5) + 3];
            if (i6 > i5) {
                C0089d.w("Parameter offset is out of bounds");
                throw null;
            }
            b2--;
        }
        int i7 = i02.f2134b[(i02.p(i6) * 5) + 3];
        int f3 = i02.f(i02.f2134b, i02.p(i02.f2151t));
        int f4 = i02.f(i02.f2134b, i02.p(i6));
        int i8 = i6 + i7;
        int f5 = i02.f(i02.f2134b, i02.p(i8));
        int i9 = f5 - f4;
        i02.s(i9, Math.max(i02.f2151t - 1, 0));
        i02.r(i7);
        int[] iArr = i02.f2134b;
        int p = i02.p(i8) * 5;
        M1.k.W(iArr, iArr, i02.p(i3) * 5, p, (i7 * 5) + p);
        if (i9 > 0) {
            Object[] objArr = i02.f2135c;
            M1.k.X(objArr, objArr, f3, i02.g(f4 + i9), i02.g(f5 + i9));
        }
        int i10 = f4 + i9;
        int i11 = i10 - f3;
        int i12 = i02.f2143k;
        int i13 = i02.f2144l;
        int length = i02.f2135c.length;
        int i14 = i02.f2145m;
        int i15 = i3 + i7;
        int i16 = i3;
        while (i16 < i15) {
            int p3 = i02.p(i16);
            int i17 = i15;
            int i18 = i11;
            iArr[(p3 * 5) + 4] = I0.h(I0.h(i02.f(iArr, p3) - i11, i14 < p3 ? 0 : i12, i13, length), i02.f2143k, i02.f2144l, i02.f2135c.length);
            i16++;
            i11 = i18;
            i15 = i17;
            i12 = i12;
            i13 = i13;
        }
        int i19 = i8 + i7;
        int n3 = i02.n();
        int n4 = C0089d.n(i02.f2136d, i8, n3);
        ArrayList arrayList = new ArrayList();
        if (n4 >= 0) {
            while (n4 < i02.f2136d.size() && (c3 = i02.c((c0087c = (C0087c) i02.f2136d.get(n4)))) >= i8 && c3 < i19) {
                arrayList.add(c0087c);
                i02.f2136d.remove(n4);
            }
        }
        int i20 = i3 - i8;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            C0087c c0087c2 = (C0087c) arrayList.get(i21);
            int c4 = i02.c(c0087c2) + i20;
            if (c4 >= i02.f2139g) {
                c0087c2.f2237a = -(n3 - c4);
            } else {
                c0087c2.f2237a = c4;
            }
            i02.f2136d.add(C0089d.n(i02.f2136d, c4, n3), c0087c2);
        }
        if (i02.B(i8, i7)) {
            C0089d.w("Unexpectedly removed anchors");
            throw null;
        }
        i02.l(i4, i02.f2152u, i3);
        if (i9 > 0) {
            i02.C(i10, i9, i8 - 1);
        }
    }

    @Override // J.C
    public final String b(int i3) {
        return I2.l.v(i3, 0) ? "offset" : super.b(i3);
    }
}
