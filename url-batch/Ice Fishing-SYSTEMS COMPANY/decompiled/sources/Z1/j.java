package Z1;

import B2.N;
import android.content.Context;
import b2.C0524a;
import g1.C4523c;
import g1.C4524d;
import m.c1;
import p7.InterfaceC4864a;
import w6.C5177d;
import y1.C5240o;
import y1.InterfaceC5244s;
import y1.InterfaceC5245t;
import y1.y;

/* loaded from: classes.dex */
public final class j implements InterfaceC5245t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4228n;

    /* renamed from: u, reason: collision with root package name */
    public Context f4229u;

    public /* synthetic */ j() {
        this.f4228n = 0;
    }

    public C5177d a() {
        Context context = this.f4229u;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C5177d c5177d = new C5177d();
        c5177d.f41693u = C0524a.a(l.f4232a);
        C4523c c4523c = new C4523c(15, context);
        c5177d.f41694v = c4523c;
        c5177d.f41695w = C0524a.a(new S0.c(8, c4523c, new C4523c(13, c4523c)));
        C4523c c4523c2 = (C4523c) c5177d.f41694v;
        c5177d.f41696x = new h4.c(27, c4523c2);
        InterfaceC4864a a9 = C0524a.a(new S0.c(12, (h4.c) c5177d.f41696x, C0524a.a(new C4524d(19, c4523c2))));
        c5177d.f41697y = a9;
        L2.i iVar = new L2.i(18);
        C4523c c4523c3 = (C4523c) c5177d.f41694v;
        Y2.e eVar = new Y2.e(c4523c3, a9, iVar, 25);
        InterfaceC4864a interfaceC4864a = (InterfaceC4864a) c5177d.f41693u;
        InterfaceC4864a interfaceC4864a2 = (InterfaceC4864a) c5177d.f41695w;
        N n9 = new N(interfaceC4864a, interfaceC4864a2, eVar, a9, a9, 6);
        c1 c1Var = new c1(c4523c3, interfaceC4864a2, a9, eVar, interfaceC4864a, a9, a9);
        S0.n nVar = new S0.n();
        nVar.f2914n = interfaceC4864a;
        nVar.f2915u = a9;
        nVar.f2916v = eVar;
        nVar.f2917w = a9;
        c5177d.f41698z = C0524a.a(new Y2.e(n9, c1Var, nVar, 19));
        return c5177d;
    }

    @Override // y1.InterfaceC5245t
    public InterfaceC5244s i(y yVar) {
        switch (this.f4228n) {
            case 1:
                return new C5240o(this.f4229u, 0);
            default:
                return new C5240o(this.f4229u, 2);
        }
    }

    public /* synthetic */ j(Context context, int i) {
        this.f4228n = i;
        this.f4229u = context;
    }
}
