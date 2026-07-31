package v;

import L1.z;
import R1.i;
import U.k;
import android.graphics.Rect;
import android.view.View;
import e2.AbstractC0381e;
import t0.AbstractC0898f;
import t0.G;
import t0.InterfaceC0904l;
import t0.a0;

/* loaded from: classes.dex */
public final class g implements InterfaceC1012a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0904l f8572d;

    public g(InterfaceC0904l interfaceC0904l) {
        this.f8572d = interfaceC0904l;
    }

    @Override // v.InterfaceC1012a
    public final Object Q(a0 a0Var, Y1.a aVar, i iVar) {
        InterfaceC0904l interfaceC0904l = this.f8572d;
        if (!((k) interfaceC0904l).f3303d.p) {
            AbstractC0381e.N("Cannot get View because the Modifier node is not currently attached.");
            throw null;
        }
        View view = (View) G.a(AbstractC0898f.t(interfaceC0904l));
        long K02 = a0Var.K0(0L);
        a0.d dVar = (a0.d) aVar.b();
        a0.d e3 = dVar != null ? dVar.e(K02) : null;
        if (e3 != null) {
            view.requestRectangleOnScreen(new Rect((int) e3.f3491a, (int) e3.f3492b, (int) e3.f3493c, (int) e3.f3494d), false);
        }
        return z.f2729a;
    }
}
