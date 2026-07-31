package n0;

import m0.i2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j f5274c = new j(0, 2, 1);

    @Override // n0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, m0.c cVar, i2 i2Var, u0.i iVar, k0 k0Var) {
        int i;
        u0.d dVar = (u0.d) kVar.c(0);
        int c8 = i2Var.c((m0.a) kVar.c(1));
        if (i2Var.f4970t >= c8) {
            m0.t.c("Check failed");
        }
        h0.a.S(i2Var, cVar, c8);
        int i8 = i2Var.f4970t;
        int i9 = i2Var.f4972v;
        while (i9 >= 0 && !i2Var.x(i9)) {
            i9 = i2Var.D(i2Var.f4953b, i9);
        }
        int i10 = i9 + 1;
        int i11 = 0;
        while (i10 < i8) {
            if (i2Var.u(i8, i10)) {
                if (i2Var.x(i10)) {
                    i11 = 0;
                }
                i10++;
            } else {
                i11 += i2Var.x(i10) ? 1 : i2Var.f4953b[(i2Var.r(i10) * 5) + 1] & 67108863;
                i10 += i2Var.t(i10);
            }
        }
        while (true) {
            i = i2Var.f4970t;
            if (i >= c8) {
                break;
            }
            if (i2Var.u(c8, i)) {
                int i12 = i2Var.f4970t;
                if (i12 < i2Var.f4971u && (i2Var.f4953b[(i2Var.r(i12) * 5) + 1] & 1073741824) != 0) {
                    cVar.d(i2Var.C(i2Var.f4970t));
                    i11 = 0;
                }
                i2Var.O();
            } else {
                i11 += i2Var.K();
            }
        }
        if (i != c8) {
            m0.t.c("Check failed");
        }
        dVar.f7143a = i11;
    }
}
