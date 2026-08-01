package com.google.firebase.messaging;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements p8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3087a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final p8.c f3088b = new p8.c("projectNumber", v4.a.s(v4.a.r(s8.e.class, new s8.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final p8.c f3089c = new p8.c("messageId", v4.a.s(v4.a.r(s8.e.class, new s8.a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final p8.c f3090d = new p8.c("instanceId", v4.a.s(v4.a.r(s8.e.class, new s8.a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final p8.c f3091e = new p8.c("messageType", v4.a.s(v4.a.r(s8.e.class, new s8.a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final p8.c f3092f = new p8.c("sdkPlatform", v4.a.s(v4.a.r(s8.e.class, new s8.a(5))));
    public static final p8.c g = new p8.c("packageName", v4.a.s(v4.a.r(s8.e.class, new s8.a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final p8.c f3093h = new p8.c("collapseKey", v4.a.s(v4.a.r(s8.e.class, new s8.a(7))));

    /* renamed from: i, reason: collision with root package name */
    public static final p8.c f3094i = new p8.c("priority", v4.a.s(v4.a.r(s8.e.class, new s8.a(8))));
    public static final p8.c j = new p8.c("ttl", v4.a.s(v4.a.r(s8.e.class, new s8.a(9))));

    /* renamed from: k, reason: collision with root package name */
    public static final p8.c f3095k = new p8.c("topic", v4.a.s(v4.a.r(s8.e.class, new s8.a(10))));

    /* renamed from: l, reason: collision with root package name */
    public static final p8.c f3096l = new p8.c("bulkId", v4.a.s(v4.a.r(s8.e.class, new s8.a(11))));

    /* renamed from: m, reason: collision with root package name */
    public static final p8.c f3097m = new p8.c("event", v4.a.s(v4.a.r(s8.e.class, new s8.a(12))));

    /* renamed from: n, reason: collision with root package name */
    public static final p8.c f3098n = new p8.c("analyticsLabel", v4.a.s(v4.a.r(s8.e.class, new s8.a(13))));

    /* renamed from: o, reason: collision with root package name */
    public static final p8.c f3099o = new p8.c("campaignId", v4.a.s(v4.a.r(s8.e.class, new s8.a(14))));

    /* renamed from: p, reason: collision with root package name */
    public static final p8.c f3100p = new p8.c("composerLabel", v4.a.s(v4.a.r(s8.e.class, new s8.a(15))));

    @Override // p8.a
    public final void a(Object obj, Object obj2) {
        c9.d dVar = (c9.d) obj;
        p8.e eVar = (p8.e) obj2;
        eVar.c(f3088b, dVar.f2026a);
        eVar.a(f3089c, dVar.f2027b);
        eVar.a(f3090d, dVar.f2028c);
        eVar.a(f3091e, dVar.f2029d);
        eVar.a(f3092f, c9.c.ANDROID);
        eVar.a(g, dVar.f2030e);
        eVar.a(f3093h, dVar.f2031f);
        eVar.e(f3094i, dVar.g);
        eVar.e(j, dVar.f2032h);
        eVar.a(f3095k, dVar.f2033i);
        eVar.c(f3096l, 0L);
        eVar.a(f3097m, c9.a.MESSAGE_DELIVERED);
        eVar.a(f3098n, dVar.j);
        eVar.c(f3099o, 0L);
        eVar.a(f3100p, dVar.f2034k);
    }
}
