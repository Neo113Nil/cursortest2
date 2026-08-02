package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0911r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f12641c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f12642d;

    public RunnableC0911r1(C0963t1 c0963t1, String str, String str2, Throwable th) {
        this.f12642d = c0963t1;
        this.f12639a = str;
        this.f12640b = str2;
        this.f12641c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f12642d).reportError(this.f12639a, this.f12640b, this.f12641c);
    }
}
