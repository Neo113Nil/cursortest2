package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0834o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f12483c;

    public RunnableC0834o1(C0963t1 c0963t1, String str, String str2) {
        this.f12483c = c0963t1;
        this.f12481a = str;
        this.f12482b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f12483c).reportEvent(this.f12481a, this.f12482b);
    }
}
