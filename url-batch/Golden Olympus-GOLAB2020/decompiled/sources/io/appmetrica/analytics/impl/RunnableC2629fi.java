package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2629fi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f38972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f38973b;

    public RunnableC2629fi(C2992ti c2992ti, boolean z4) {
        this.f38973b = c2992ti;
        this.f38972a = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f38973b;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).setDataSendingEnabled(this.f38972a);
    }
}
