package com.google.firebase.messaging;

import a2.C0172a;
import k2.C0598d;
import k2.EnumC0595a;
import k2.EnumC0597c;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311a implements X1.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0311a f4479a = new C0311a();

    /* renamed from: b, reason: collision with root package name */
    public static final X1.c f4480b = new X1.c("projectNumber", C4.p.n(C4.p.m(a2.e.class, new C0172a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final X1.c f4481c = new X1.c("messageId", C4.p.n(C4.p.m(a2.e.class, new C0172a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final X1.c f4482d = new X1.c("instanceId", C4.p.n(C4.p.m(a2.e.class, new C0172a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final X1.c f4483e = new X1.c("messageType", C4.p.n(C4.p.m(a2.e.class, new C0172a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final X1.c f4484f = new X1.c("sdkPlatform", C4.p.n(C4.p.m(a2.e.class, new C0172a(5))));

    /* renamed from: g, reason: collision with root package name */
    public static final X1.c f4485g = new X1.c("packageName", C4.p.n(C4.p.m(a2.e.class, new C0172a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final X1.c f4486h = new X1.c("collapseKey", C4.p.n(C4.p.m(a2.e.class, new C0172a(7))));

    /* renamed from: i, reason: collision with root package name */
    public static final X1.c f4487i = new X1.c("priority", C4.p.n(C4.p.m(a2.e.class, new C0172a(8))));
    public static final X1.c j = new X1.c("ttl", C4.p.n(C4.p.m(a2.e.class, new C0172a(9))));

    /* renamed from: k, reason: collision with root package name */
    public static final X1.c f4488k = new X1.c("topic", C4.p.n(C4.p.m(a2.e.class, new C0172a(10))));

    /* renamed from: l, reason: collision with root package name */
    public static final X1.c f4489l = new X1.c("bulkId", C4.p.n(C4.p.m(a2.e.class, new C0172a(11))));

    /* renamed from: m, reason: collision with root package name */
    public static final X1.c f4490m = new X1.c("event", C4.p.n(C4.p.m(a2.e.class, new C0172a(12))));

    /* renamed from: n, reason: collision with root package name */
    public static final X1.c f4491n = new X1.c("analyticsLabel", C4.p.n(C4.p.m(a2.e.class, new C0172a(13))));

    /* renamed from: o, reason: collision with root package name */
    public static final X1.c f4492o = new X1.c("campaignId", C4.p.n(C4.p.m(a2.e.class, new C0172a(14))));

    /* renamed from: p, reason: collision with root package name */
    public static final X1.c f4493p = new X1.c("composerLabel", C4.p.n(C4.p.m(a2.e.class, new C0172a(15))));

    @Override // X1.a
    public final void a(Object obj, Object obj2) {
        C0598d c0598d = (C0598d) obj;
        X1.e eVar = (X1.e) obj2;
        eVar.b(f4480b, c0598d.f6043a);
        eVar.e(f4481c, c0598d.f6044b);
        eVar.e(f4482d, c0598d.f6045c);
        eVar.e(f4483e, c0598d.f6046d);
        eVar.e(f4484f, EnumC0597c.ANDROID);
        eVar.e(f4485g, c0598d.f6047e);
        eVar.e(f4486h, c0598d.f6048f);
        eVar.a(f4487i, c0598d.f6049g);
        eVar.a(j, c0598d.f6050h);
        eVar.e(f4488k, c0598d.f6051i);
        eVar.b(f4489l, 0L);
        eVar.e(f4490m, EnumC0595a.MESSAGE_DELIVERED);
        eVar.e(f4491n, c0598d.j);
        eVar.b(f4492o, 0L);
        eVar.e(f4493p, c0598d.f6052k);
    }
}
