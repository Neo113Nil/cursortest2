package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0550d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f11642c;

    public RunnableC0550d1(C0963t1 c0963t1, String str, String str2) {
        this.f11642c = c0963t1;
        this.f11640a = str;
        this.f11641b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f11642c).b(this.f11640a, this.f11641b);
    }
}
