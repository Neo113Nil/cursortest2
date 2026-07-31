package n0;

import m0.f2;
import m0.i2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t f5296c = new t(0, 3, 1);

    @Override // n0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, m0.c cVar, i2 i2Var, u0.i iVar, k0 k0Var) {
        a0.a0 a0Var;
        f2 f2Var = (f2) kVar.c(1);
        m0.a aVar = (m0.a) kVar.c(0);
        c cVar2 = (c) kVar.c(2);
        i2 e8 = f2Var.e();
        if (k0Var != null) {
            try {
                a0Var = new a0.a0(13, k0Var, i2Var);
            } catch (Throwable th) {
                e8.e(false);
                throw th;
            }
        } else {
            a0Var = null;
        }
        if (!cVar2.f5260c.Z()) {
            m0.t.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar2.f5259b.Y(cVar, e8, iVar, a0Var);
        e8.e(true);
        i2Var.d();
        aVar.getClass();
        i2Var.z(f2Var, f2Var.a(aVar));
        i2Var.k();
    }
}
