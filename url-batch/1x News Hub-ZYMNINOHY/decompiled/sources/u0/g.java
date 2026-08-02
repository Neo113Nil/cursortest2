package u0;

import e1.C0312c;
import e1.InterfaceC0313d;
import e1.InterfaceC0314e;

/* loaded from: classes.dex */
public final class g implements InterfaceC0313d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f10488a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C0312c f10489b = C0312c.a("networkType");

    /* renamed from: c, reason: collision with root package name */
    public static final C0312c f10490c = C0312c.a("mobileSubtype");

    @Override // e1.InterfaceC0310a
    public final void a(Object obj, Object obj2) {
        InterfaceC0314e interfaceC0314e = (InterfaceC0314e) obj2;
        n nVar = (n) ((v) obj);
        interfaceC0314e.d(f10489b, nVar.f10516a);
        interfaceC0314e.d(f10490c, nVar.f10517b);
    }
}
