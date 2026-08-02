package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1122z4 {

    /* renamed from: a, reason: collision with root package name */
    public final Fb f13093a;

    public C1122z4() {
        this(C0817na.k().l());
    }

    public static E4 a(C1070x4 c1070x4) {
        return new E4(new C4(c1070x4), c1070x4);
    }

    public C1122z4(Fb fb) {
        this.f13093a = fb;
    }

    public final C0778ln a(C1070x4 c1070x4, Am am) {
        C0778ln c0778ln = new C0778ln(c1070x4, new Ig(am));
        Fb fb = this.f13093a;
        synchronized (fb) {
            fb.f10277c.add(c0778ln);
        }
        return c0778ln;
    }
}
