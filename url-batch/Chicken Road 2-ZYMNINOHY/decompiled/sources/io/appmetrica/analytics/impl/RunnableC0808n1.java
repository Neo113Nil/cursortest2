package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0808n1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f12389b;

    public RunnableC0808n1(C0963t1 c0963t1, String str) {
        this.f12389b = c0963t1;
        this.f12388a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f12389b).reportEvent(this.f12388a);
    }
}
