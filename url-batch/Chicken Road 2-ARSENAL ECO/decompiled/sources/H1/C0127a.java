package H1;

import t1.C0656c;
import t1.InterfaceC0657d;
import t1.InterfaceC0658e;
import w1.C0713a;

/* renamed from: H1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127a implements InterfaceC0657d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0127a f932a = new C0127a();

    /* renamed from: b, reason: collision with root package name */
    public static final C0656c f933b = new C0656c("projectNumber", C1.c.j(C1.c.i(w1.e.class, new C0713a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final C0656c f934c = new C0656c("messageId", C1.c.j(C1.c.i(w1.e.class, new C0713a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final C0656c f935d = new C0656c("instanceId", C1.c.j(C1.c.i(w1.e.class, new C0713a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final C0656c f936e = new C0656c("messageType", C1.c.j(C1.c.i(w1.e.class, new C0713a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final C0656c f937f = new C0656c("sdkPlatform", C1.c.j(C1.c.i(w1.e.class, new C0713a(5))));

    /* renamed from: g, reason: collision with root package name */
    public static final C0656c f938g = new C0656c("packageName", C1.c.j(C1.c.i(w1.e.class, new C0713a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final C0656c f939h = new C0656c("collapseKey", C1.c.j(C1.c.i(w1.e.class, new C0713a(7))));

    /* renamed from: i, reason: collision with root package name */
    public static final C0656c f940i = new C0656c("priority", C1.c.j(C1.c.i(w1.e.class, new C0713a(8))));

    /* renamed from: j, reason: collision with root package name */
    public static final C0656c f941j = new C0656c("ttl", C1.c.j(C1.c.i(w1.e.class, new C0713a(9))));

    /* renamed from: k, reason: collision with root package name */
    public static final C0656c f942k = new C0656c("topic", C1.c.j(C1.c.i(w1.e.class, new C0713a(10))));

    /* renamed from: l, reason: collision with root package name */
    public static final C0656c f943l = new C0656c("bulkId", C1.c.j(C1.c.i(w1.e.class, new C0713a(11))));

    /* renamed from: m, reason: collision with root package name */
    public static final C0656c f944m = new C0656c("event", C1.c.j(C1.c.i(w1.e.class, new C0713a(12))));

    /* renamed from: n, reason: collision with root package name */
    public static final C0656c f945n = new C0656c("analyticsLabel", C1.c.j(C1.c.i(w1.e.class, new C0713a(13))));

    /* renamed from: o, reason: collision with root package name */
    public static final C0656c f946o = new C0656c("campaignId", C1.c.j(C1.c.i(w1.e.class, new C0713a(14))));

    /* renamed from: p, reason: collision with root package name */
    public static final C0656c f947p = new C0656c("composerLabel", C1.c.j(C1.c.i(w1.e.class, new C0713a(15))));

    @Override // t1.InterfaceC0654a
    public final void a(Object obj, Object obj2) {
        I1.d dVar = (I1.d) obj;
        InterfaceC0658e interfaceC0658e = (InterfaceC0658e) obj2;
        interfaceC0658e.e(f933b, dVar.f1176a);
        interfaceC0658e.a(f934c, dVar.f1177b);
        interfaceC0658e.a(f935d, dVar.f1178c);
        interfaceC0658e.a(f936e, dVar.f1179d);
        interfaceC0658e.a(f937f, I1.c.ANDROID);
        interfaceC0658e.a(f938g, dVar.f1180e);
        interfaceC0658e.a(f939h, dVar.f1181f);
        interfaceC0658e.d(f940i, 0);
        interfaceC0658e.d(f941j, dVar.f1182g);
        interfaceC0658e.a(f942k, dVar.f1183h);
        interfaceC0658e.e(f943l, 0L);
        interfaceC0658e.a(f944m, I1.a.MESSAGE_DELIVERED);
        interfaceC0658e.a(f945n, dVar.f1184i);
        interfaceC0658e.e(f946o, 0L);
        interfaceC0658e.a(f947p, dVar.f1185j);
    }
}
