package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class V1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2885pe f38387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U7 f38388b;

    public V1(X1 x12, U7 u7) {
        this.f38387a = x12;
        this.f38388b = u7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38387a.consume(this.f38388b);
    }
}
