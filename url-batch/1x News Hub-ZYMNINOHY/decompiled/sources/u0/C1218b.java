package u0;

import e1.C0312c;
import e1.InterfaceC0313d;
import e1.InterfaceC0314e;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1218b implements InterfaceC0313d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1218b f10457a = new C1218b();

    /* renamed from: b, reason: collision with root package name */
    public static final C0312c f10458b = C0312c.a("sdkVersion");

    /* renamed from: c, reason: collision with root package name */
    public static final C0312c f10459c = C0312c.a(CommonUrlParts.MODEL);

    /* renamed from: d, reason: collision with root package name */
    public static final C0312c f10460d = C0312c.a("hardware");

    /* renamed from: e, reason: collision with root package name */
    public static final C0312c f10461e = C0312c.a("device");
    public static final C0312c f = C0312c.a("product");

    /* renamed from: g, reason: collision with root package name */
    public static final C0312c f10462g = C0312c.a("osBuild");

    /* renamed from: h, reason: collision with root package name */
    public static final C0312c f10463h = C0312c.a(CommonUrlParts.MANUFACTURER);

    /* renamed from: i, reason: collision with root package name */
    public static final C0312c f10464i = C0312c.a("fingerprint");

    /* renamed from: j, reason: collision with root package name */
    public static final C0312c f10465j = C0312c.a(CommonUrlParts.LOCALE);

    /* renamed from: k, reason: collision with root package name */
    public static final C0312c f10466k = C0312c.a("country");

    /* renamed from: l, reason: collision with root package name */
    public static final C0312c f10467l = C0312c.a("mccMnc");

    /* renamed from: m, reason: collision with root package name */
    public static final C0312c f10468m = C0312c.a("applicationBuild");

    @Override // e1.InterfaceC0310a
    public final void a(Object obj, Object obj2) {
        InterfaceC0314e interfaceC0314e = (InterfaceC0314e) obj2;
        h hVar = (h) ((AbstractC1217a) obj);
        interfaceC0314e.d(f10458b, hVar.f10491a);
        interfaceC0314e.d(f10459c, hVar.f10492b);
        interfaceC0314e.d(f10460d, hVar.f10493c);
        interfaceC0314e.d(f10461e, hVar.f10494d);
        interfaceC0314e.d(f, hVar.f10495e);
        interfaceC0314e.d(f10462g, hVar.f);
        interfaceC0314e.d(f10463h, hVar.f10496g);
        interfaceC0314e.d(f10464i, hVar.f10497h);
        interfaceC0314e.d(f10465j, hVar.f10498i);
        interfaceC0314e.d(f10466k, hVar.f10499j);
        interfaceC0314e.d(f10467l, hVar.f10500k);
        interfaceC0314e.d(f10468m, hVar.f10501l);
    }
}
