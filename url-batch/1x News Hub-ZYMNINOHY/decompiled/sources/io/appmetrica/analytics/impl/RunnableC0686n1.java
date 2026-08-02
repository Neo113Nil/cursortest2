package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0686n1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f7920c;

    public RunnableC0686n1(C0815s1 c0815s1, String str, String str2) {
        this.f7920c = c0815s1;
        this.f7918a = str;
        this.f7919b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f7920c).reportEvent(this.f7918a, this.f7919b);
    }
}
