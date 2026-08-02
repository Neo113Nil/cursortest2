package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0428d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f7167b;

    public RunnableC0428d1(C0815s1 c0815s1, String str) {
        this.f7167b = c0815s1;
        this.f7166a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f7167b).b(this.f7166a);
    }
}
