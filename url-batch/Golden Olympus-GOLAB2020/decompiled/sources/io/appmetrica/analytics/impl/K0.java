package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class K0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f37857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f37858b;

    public K0(C2872p1 c2872p1, String str) {
        this.f37858b = c2872p1;
        this.f37857a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f37858b).b(this.f37857a);
    }
}
