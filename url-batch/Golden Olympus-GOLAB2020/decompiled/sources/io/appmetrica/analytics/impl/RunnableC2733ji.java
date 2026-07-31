package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2733ji implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f39288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2992ti f39289c;

    public RunnableC2733ji(C2992ti c2992ti, String str, byte[] bArr) {
        this.f39289c = c2992ti;
        this.f39287a = str;
        this.f39288b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f39289c;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).setSessionExtra(this.f39287a, this.f39288b);
    }
}
