package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6250b;

    public L0(C0815s1 c0815s1, String str) {
        this.f6250b = c0815s1;
        this.f6249a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6250b.d().f8160b.a(this.f6249a, false);
    }
}
