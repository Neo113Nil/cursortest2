package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2889pi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2992ti f39624c;

    public RunnableC2889pi(C2992ti c2992ti, String str, String str2) {
        this.f39624c = c2992ti;
        this.f39622a = str;
        this.f39623b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f39624c;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).putAppEnvironmentValue(this.f39622a, this.f39623b);
    }
}
