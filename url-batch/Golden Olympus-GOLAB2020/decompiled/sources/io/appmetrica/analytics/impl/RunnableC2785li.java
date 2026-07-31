package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2785li implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Nn f39403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f39404b;

    public RunnableC2785li(C2992ti c2992ti, Nn nn) {
        this.f39404b = c2992ti;
        this.f39403a = nn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f39404b;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).a(this.f39403a);
    }
}
