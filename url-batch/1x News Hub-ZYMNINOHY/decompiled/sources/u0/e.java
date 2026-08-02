package u0;

import e1.C0312c;
import e1.InterfaceC0313d;
import e1.InterfaceC0314e;

/* loaded from: classes.dex */
public final class e implements InterfaceC0313d {

    /* renamed from: a, reason: collision with root package name */
    public static final e f10474a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final C0312c f10475b = C0312c.a("eventTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final C0312c f10476c = C0312c.a("eventCode");

    /* renamed from: d, reason: collision with root package name */
    public static final C0312c f10477d = C0312c.a("eventUptimeMs");

    /* renamed from: e, reason: collision with root package name */
    public static final C0312c f10478e = C0312c.a("sourceExtension");
    public static final C0312c f = C0312c.a("sourceExtensionJsonProto3");

    /* renamed from: g, reason: collision with root package name */
    public static final C0312c f10479g = C0312c.a("timezoneOffsetSeconds");

    /* renamed from: h, reason: collision with root package name */
    public static final C0312c f10480h = C0312c.a("networkConnectionInfo");

    @Override // e1.InterfaceC0310a
    public final void a(Object obj, Object obj2) {
        InterfaceC0314e interfaceC0314e = (InterfaceC0314e) obj2;
        k kVar = (k) ((r) obj);
        interfaceC0314e.a(f10475b, kVar.f10504a);
        interfaceC0314e.d(f10476c, kVar.f10505b);
        interfaceC0314e.a(f10477d, kVar.f10506c);
        interfaceC0314e.d(f10478e, kVar.f10507d);
        interfaceC0314e.d(f, kVar.f10508e);
        interfaceC0314e.a(f10479g, kVar.f);
        interfaceC0314e.d(f10480h, kVar.f10509g);
    }
}
