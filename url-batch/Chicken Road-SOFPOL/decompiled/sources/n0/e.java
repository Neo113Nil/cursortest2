package n0;

import m0.b2;
import m0.i2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f5264c = new e(0, 2, 1);

    @Override // n0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, m0.c cVar, i2 i2Var, u0.i iVar, k0 k0Var) {
        m0.a aVar = (m0.a) kVar.c(0);
        Object c8 = kVar.c(1);
        if (c8 instanceof b2) {
            b2 b2Var = (b2) c8;
            iVar.f7158e.b(b2Var);
            iVar.f7157d.a(b2Var);
        }
        if (i2Var.f4964n != 0) {
            m0.t.c("Can only append a slot if not current inserting");
        }
        int i = i2Var.i;
        int i8 = i2Var.f4960j;
        int c9 = i2Var.c(aVar);
        int g3 = i2Var.g(i2Var.f4953b, i2Var.r(c9 + 1));
        i2Var.i = g3;
        i2Var.f4960j = g3;
        i2Var.w(1, c9);
        if (i >= g3) {
            i++;
            i8++;
        }
        i2Var.f4954c[g3] = c8;
        i2Var.i = i;
        i2Var.f4960j = i8;
    }
}
