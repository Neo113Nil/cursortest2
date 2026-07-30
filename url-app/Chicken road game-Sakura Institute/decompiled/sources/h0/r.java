package h0;

import g0.a2;
import g0.u1;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final r f4632c;

    static {
        int i7 = 1;
        f4632c = new r(0, i7, i7);
    }

    @Override // h0.c0
    public final void a(a0.p pVar, b1.b bVar, a2 a2Var, g0.t tVar) {
        ((ArrayList) tVar.f3892c).add((u1) pVar.e(0));
    }

    @Override // h0.c0
    public final String c(int i7) {
        return i7 == 0 ? "value" : super.c(i7);
    }
}
