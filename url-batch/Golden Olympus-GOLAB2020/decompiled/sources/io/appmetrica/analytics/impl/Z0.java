package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38591c;

    public Z0(C2872p1 c2872p1, String str, String str2) {
        this.f38591c = c2872p1;
        this.f38589a = str;
        this.f38590b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f38591c).b(this.f38589a, this.f38590b);
    }
}
