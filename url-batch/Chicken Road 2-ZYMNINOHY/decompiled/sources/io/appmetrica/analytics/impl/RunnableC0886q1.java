package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0886q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f12603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f12604c;

    public RunnableC0886q1(C0963t1 c0963t1, String str, Throwable th) {
        this.f12604c = c0963t1;
        this.f12602a = str;
        this.f12603b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f12604c).reportError(this.f12602a, this.f12603b);
    }
}
