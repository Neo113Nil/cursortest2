package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0402c1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f7113c;

    public RunnableC0402c1(C0815s1 c0815s1, String str, String str2) {
        this.f7113c = c0815s1;
        this.f7111a = str;
        this.f7112b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f7113c).b(this.f7111a, this.f7112b);
    }
}
