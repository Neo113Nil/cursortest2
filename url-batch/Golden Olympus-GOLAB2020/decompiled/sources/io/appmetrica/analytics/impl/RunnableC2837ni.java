package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ni, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2837ni implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f39517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f39518b;

    public RunnableC2837ni(C2992ti c2992ti, U u4) {
        this.f39518b = c2992ti;
        this.f39517a = u4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f39518b;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).a(this.f39517a);
    }
}
