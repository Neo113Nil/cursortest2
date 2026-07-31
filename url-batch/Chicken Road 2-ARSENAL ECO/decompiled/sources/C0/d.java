package C0;

import t1.C0656c;
import t1.InterfaceC0657d;
import t1.InterfaceC0658e;

/* loaded from: classes.dex */
public final class d implements InterfaceC0657d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f129a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final C0656c f130b = C0656c.a("clientType");

    /* renamed from: c, reason: collision with root package name */
    public static final C0656c f131c = C0656c.a("androidClientInfo");

    @Override // t1.InterfaceC0654a
    public final void a(Object obj, Object obj2) {
        InterfaceC0658e interfaceC0658e = (InterfaceC0658e) obj2;
        j jVar = (j) ((q) obj);
        jVar.getClass();
        interfaceC0658e.a(f130b, p.f181f);
        interfaceC0658e.a(f131c, jVar.f164a);
    }
}
