package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0575e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f11721b;

    public RunnableC0575e1(C0963t1 c0963t1, String str) {
        this.f11721b = c0963t1;
        this.f11720a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f11721b).b(this.f11720a);
    }
}
