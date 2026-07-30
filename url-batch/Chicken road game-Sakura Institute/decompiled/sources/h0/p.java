package h0;

import g0.a2;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final p f4630c = new p(1, 0, 2);

    @Override // h0.c0
    public final void a(a0.p pVar, b1.b bVar, a2 a2Var, g0.t tVar) {
        g0.c cVar;
        int c4;
        int d8 = pVar.d(0);
        Throwable th = null;
        if (a2Var.f3677n != 0) {
            g0.d.w("Cannot move a group while inserting");
            throw null;
        }
        if (d8 < 0) {
            g0.d.w("Parameter offset is out of bounds");
            throw null;
        }
        if (d8 == 0) {
            return;
        }
        int i7 = a2Var.f3683t;
        int i8 = a2Var.f3685v;
        int i9 = a2Var.f3684u;
        int i10 = i7;
        while (d8 > 0) {
            i10 += a2Var.f3665b[(a2Var.p(i10) * 5) + 3];
            if (i10 > i9) {
                g0.d.w("Parameter offset is out of bounds");
                throw null;
            }
            d8--;
        }
        int i11 = a2Var.f3665b[(a2Var.p(i10) * 5) + 3];
        int f9 = a2Var.f(a2Var.f3665b, a2Var.p(a2Var.f3683t));
        int f10 = a2Var.f(a2Var.f3665b, a2Var.p(i10));
        int i12 = i10 + i11;
        int f11 = a2Var.f(a2Var.f3665b, a2Var.p(i12));
        int i13 = f11 - f10;
        a2Var.s(i13, Math.max(a2Var.f3683t - 1, 0));
        a2Var.r(i11);
        int[] iArr = a2Var.f3665b;
        int p6 = a2Var.p(i12) * 5;
        e6.k.W(iArr, iArr, a2Var.p(i7) * 5, p6, (i11 * 5) + p6);
        if (i13 > 0) {
            Object[] objArr = a2Var.f3666c;
            e6.k.X(objArr, objArr, f9, a2Var.g(f10 + i13), a2Var.g(f11 + i13));
        }
        int i14 = f10 + i13;
        int i15 = i14 - f9;
        int i16 = a2Var.f3674k;
        int i17 = a2Var.f3675l;
        int length = a2Var.f3666c.length;
        int i18 = a2Var.f3676m;
        int i19 = i7 + i11;
        int i20 = i7;
        while (i20 < i19) {
            Throwable th2 = th;
            int p8 = a2Var.p(i20);
            int i21 = i20;
            int i22 = i15;
            iArr[(p8 * 5) + 4] = a2.h(a2.h(a2Var.f(iArr, p8) - i15, i18 < p8 ? 0 : i16, i17, length), a2Var.f3674k, a2Var.f3675l, a2Var.f3666c.length);
            i20 = i21 + 1;
            th = th2;
            i15 = i22;
            i16 = i16;
        }
        Throwable th3 = th;
        int i23 = i12 + i11;
        int n8 = a2Var.n();
        int n9 = g0.d.n(a2Var.f3667d, i12, n8);
        ArrayList arrayList = new ArrayList();
        if (n9 >= 0) {
            while (n9 < a2Var.f3667d.size() && (c4 = a2Var.c((cVar = (g0.c) a2Var.f3667d.get(n9)))) >= i12 && c4 < i23) {
                arrayList.add(cVar);
                a2Var.f3667d.remove(n9);
            }
        }
        int i24 = i7 - i12;
        int size = arrayList.size();
        for (int i25 = 0; i25 < size; i25++) {
            g0.c cVar2 = (g0.c) arrayList.get(i25);
            int c6 = a2Var.c(cVar2) + i24;
            if (c6 >= a2Var.f3670g) {
                cVar2.f3695a = -(n8 - c6);
            } else {
                cVar2.f3695a = c6;
            }
            a2Var.f3667d.add(g0.d.n(a2Var.f3667d, c6, n8), cVar2);
        }
        if (a2Var.B(i12, i11)) {
            g0.d.w("Unexpectedly removed anchors");
            throw th3;
        }
        a2Var.l(i8, a2Var.f3684u, i7);
        if (i13 > 0) {
            a2Var.C(i14, i13, i12 - 1);
        }
    }

    @Override // h0.c0
    public final String b(int i7) {
        return i7 == 0 ? "offset" : super.b(i7);
    }
}
