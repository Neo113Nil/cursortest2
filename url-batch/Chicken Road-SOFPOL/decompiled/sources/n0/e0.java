package n0;

import m0.b2;
import m0.i2;
import m0.t1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f5265c = new e0(1, 0, 2);

    @Override // n0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, m0.c cVar, i2 i2Var, u0.i iVar, k0 k0Var) {
        int b8 = kVar.b(0);
        int i = i2Var.f4972v;
        int M = i2Var.M(i2Var.f4953b, i2Var.r(i));
        int g3 = i2Var.g(i2Var.f4953b, i2Var.r(i + 1));
        for (int max = Math.max(M, g3 - b8); max < g3; max++) {
            Object obj = i2Var.f4954c[i2Var.h(max)];
            if (obj instanceof b2) {
                iVar.e((b2) obj);
            } else if (obj instanceof t1) {
                ((t1) obj).d();
            }
        }
        if (b8 <= 0) {
            m0.t.c("Check failed");
        }
        int i8 = i2Var.f4972v;
        int M2 = i2Var.M(i2Var.f4953b, i2Var.r(i8));
        int g7 = i2Var.g(i2Var.f4953b, i2Var.r(i8 + 1)) - b8;
        if (g7 < M2) {
            m0.t.c("Check failed");
        }
        i2Var.I(g7, b8, i8);
        int i9 = i2Var.i;
        if (i9 >= M2) {
            i2Var.i = i9 - b8;
        }
    }
}
