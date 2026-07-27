package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Rh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f7379b;

    public Rh(C0802li c0802li, String str) {
        this.f7379b = c0802li;
        this.f7378a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7379b;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).setUserProfileID(this.f7378a);
    }
}
