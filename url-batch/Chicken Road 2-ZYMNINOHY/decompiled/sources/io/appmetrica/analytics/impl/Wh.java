package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Wh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f11190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0644gi f11191c;

    public Wh(C0644gi c0644gi, String str, byte[] bArr) {
        this.f11191c = c0644gi;
        this.f11189a = str;
        this.f11190b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f11191c;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).setSessionExtra(this.f11189a, this.f11190b);
    }
}
