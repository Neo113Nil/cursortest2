package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public abstract class Ad implements InterfaceC0598eo, InterfaceC0680i2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10041a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10042b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0960so f10043c;

    /* renamed from: d, reason: collision with root package name */
    public final J2 f10044d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f10045e = PublicLogger.getAnonymousInstance();

    public Ad(int i4, String str, InterfaceC0960so interfaceC0960so, J2 j22) {
        this.f10042b = i4;
        this.f10041a = str;
        this.f10043c = interfaceC0960so;
        this.f10044d = j22;
    }

    public final C0624fo a() {
        C0624fo c0624fo = new C0624fo();
        c0624fo.f11891b = this.f10042b;
        c0624fo.f11890a = this.f10041a.getBytes();
        c0624fo.f11893d = new C0676ho();
        c0624fo.f11892c = new C0650go();
        return c0624fo;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0598eo
    public abstract /* synthetic */ void a(Cdo cdo);

    public final J2 b() {
        return this.f10044d;
    }

    public final String c() {
        return this.f10041a;
    }

    public final InterfaceC0960so d() {
        return this.f10043c;
    }

    public final int e() {
        return this.f10042b;
    }

    public final boolean f() {
        C0909qo a3 = this.f10043c.a(this.f10041a);
        if (a3.f12630a) {
            return true;
        }
        this.f10045e.warning("Attribute " + this.f10041a + " of type " + ((String) On.f10779a.get(this.f10042b)) + " is skipped because " + a3.f12631b, new Object[0]);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0598eo
    public final void a(PublicLogger publicLogger) {
        this.f10045e = publicLogger;
    }
}
