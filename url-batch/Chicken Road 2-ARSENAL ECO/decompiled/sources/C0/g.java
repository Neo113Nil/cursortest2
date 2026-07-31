package C0;

import t1.C0656c;
import t1.InterfaceC0657d;
import t1.InterfaceC0658e;

/* loaded from: classes.dex */
public final class g implements InterfaceC0657d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f148a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C0656c f149b = C0656c.a("networkType");

    /* renamed from: c, reason: collision with root package name */
    public static final C0656c f150c = C0656c.a("mobileSubtype");

    @Override // t1.InterfaceC0654a
    public final void a(Object obj, Object obj2) {
        InterfaceC0658e interfaceC0658e = (InterfaceC0658e) obj2;
        n nVar = (n) ((v) obj);
        interfaceC0658e.a(f149b, nVar.f179a);
        interfaceC0658e.a(f150c, nVar.f180b);
    }
}
