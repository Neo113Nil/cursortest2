package D0;

import t1.C0656c;
import t1.InterfaceC0657d;
import t1.InterfaceC0658e;
import w1.C0713a;

/* loaded from: classes.dex */
public final class d implements InterfaceC0657d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f319a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final C0656c f320b = new C0656c("logSource", C1.c.j(C1.c.i(w1.e.class, new C0713a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final C0656c f321c = new C0656c("logEventDropped", C1.c.j(C1.c.i(w1.e.class, new C0713a(2))));

    @Override // t1.InterfaceC0654a
    public final void a(Object obj, Object obj2) {
        G0.e eVar = (G0.e) obj;
        InterfaceC0658e interfaceC0658e = (InterfaceC0658e) obj2;
        interfaceC0658e.a(f320b, eVar.f827a);
        interfaceC0658e.a(f321c, eVar.f828b);
    }
}
