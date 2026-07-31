package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class N0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f961a;
    public final /* synthetic */ C0541u1 b;

    public N0(C0541u1 c0541u1, String str) {
        this.b = c0541u1;
        this.f961a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d().b.a(this.f961a, false);
    }
}
