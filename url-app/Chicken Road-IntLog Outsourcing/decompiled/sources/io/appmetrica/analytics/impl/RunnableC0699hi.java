package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0699hi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0802li f8326c;

    public RunnableC0699hi(C0802li c0802li, String str, String str2) {
        this.f8326c = c0802li;
        this.f8324a = str;
        this.f8325b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f8326c;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).putAppEnvironmentValue(this.f8324a, this.f8325b);
    }
}
