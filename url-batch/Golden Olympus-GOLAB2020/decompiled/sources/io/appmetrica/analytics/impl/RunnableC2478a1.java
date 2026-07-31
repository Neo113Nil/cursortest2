package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2478a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38656b;

    public RunnableC2478a1(C2872p1 c2872p1, String str) {
        this.f38656b = c2872p1;
        this.f38655a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f38656b).a(this.f38655a);
    }
}
