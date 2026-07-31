package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ri, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2940ri implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f39738b;

    public RunnableC2940ri(C2992ti c2992ti, String str) {
        this.f39738b = c2992ti;
        this.f39737a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f39738b;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).reportEvent(this.f39737a);
    }
}
