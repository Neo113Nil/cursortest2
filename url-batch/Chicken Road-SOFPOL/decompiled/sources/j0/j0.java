package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f3714a = new j0();

    public final void a(c5.x xVar, m0.s sVar, int i) {
        sVar.W(1565826668);
        int i8 = (sVar.f(xVar) ? 4 : 2) | i;
        if (sVar.N(i8 & 1, (i8 & 3) != 2)) {
            r2.o.b((p6.a) xVar.f1737d, (u2.o) xVar.f1739f, u0.h.d(1163527043, new i0(0, xVar), sVar), sVar, 384);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a0.e0(i, 6, this, xVar);
        }
    }
}
