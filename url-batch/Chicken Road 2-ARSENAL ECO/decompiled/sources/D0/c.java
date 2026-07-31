package D0;

import t1.C0656c;
import t1.InterfaceC0657d;
import t1.InterfaceC0658e;
import w1.C0713a;

/* loaded from: classes.dex */
public final class c implements InterfaceC0657d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f316a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final C0656c f317b = new C0656c("eventsDroppedCount", C1.c.j(C1.c.i(w1.e.class, new C0713a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final C0656c f318c = new C0656c("reason", C1.c.j(C1.c.i(w1.e.class, new C0713a(3))));

    @Override // t1.InterfaceC0654a
    public final void a(Object obj, Object obj2) {
        G0.d dVar = (G0.d) obj;
        InterfaceC0658e interfaceC0658e = (InterfaceC0658e) obj2;
        interfaceC0658e.e(f317b, dVar.f824a);
        interfaceC0658e.a(f318c, dVar.f825b);
    }
}
