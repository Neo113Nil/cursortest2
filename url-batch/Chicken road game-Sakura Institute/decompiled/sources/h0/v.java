package h0;

import g0.a2;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final v f4636c;

    static {
        int i7 = 1;
        f4636c = new v(0, i7, i7);
    }

    @Override // h0.c0
    public final void a(a0.p pVar, b1.b bVar, a2 a2Var, g0.t tVar) {
        ((ArrayList) tVar.f3894e).add((q6.a) pVar.e(0));
    }

    @Override // h0.c0
    public final String c(int i7) {
        return i7 == 0 ? "effect" : super.c(i7);
    }
}
