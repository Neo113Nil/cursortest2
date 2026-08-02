package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0393bi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f7093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0651li f7094c;

    public RunnableC0393bi(C0651li c0651li, String str, byte[] bArr) {
        this.f7094c = c0651li;
        this.f7092a = str;
        this.f7093b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f7094c;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).setSessionExtra(this.f7092a, this.f7093b);
    }
}
