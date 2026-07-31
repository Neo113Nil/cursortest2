package C0;

import t1.C0656c;
import t1.InterfaceC0657d;
import t1.InterfaceC0658e;

/* loaded from: classes.dex */
public final class e implements InterfaceC0657d {

    /* renamed from: a, reason: collision with root package name */
    public static final e f132a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final C0656c f133b = C0656c.a("eventTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final C0656c f134c = C0656c.a("eventCode");

    /* renamed from: d, reason: collision with root package name */
    public static final C0656c f135d = C0656c.a("eventUptimeMs");

    /* renamed from: e, reason: collision with root package name */
    public static final C0656c f136e = C0656c.a("sourceExtension");

    /* renamed from: f, reason: collision with root package name */
    public static final C0656c f137f = C0656c.a("sourceExtensionJsonProto3");

    /* renamed from: g, reason: collision with root package name */
    public static final C0656c f138g = C0656c.a("timezoneOffsetSeconds");

    /* renamed from: h, reason: collision with root package name */
    public static final C0656c f139h = C0656c.a("networkConnectionInfo");

    @Override // t1.InterfaceC0654a
    public final void a(Object obj, Object obj2) {
        InterfaceC0658e interfaceC0658e = (InterfaceC0658e) obj2;
        k kVar = (k) ((r) obj);
        interfaceC0658e.e(f133b, kVar.f165a);
        interfaceC0658e.a(f134c, kVar.f166b);
        interfaceC0658e.e(f135d, kVar.f167c);
        interfaceC0658e.a(f136e, kVar.f168d);
        interfaceC0658e.a(f137f, kVar.f169e);
        interfaceC0658e.e(f138g, kVar.f170f);
        interfaceC0658e.a(f139h, kVar.f171g);
    }
}
