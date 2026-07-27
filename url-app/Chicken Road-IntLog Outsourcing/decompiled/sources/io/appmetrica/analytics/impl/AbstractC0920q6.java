package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0920q6 implements Ma {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0894p6 f9056a;

    /* renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f9057b;

    /* renamed from: c, reason: collision with root package name */
    public final T9 f9058c;

    public AbstractC0920q6(InterfaceC0894p6 interfaceC0894p6, ICrashTransformer iCrashTransformer, T9 t9) {
        this.f9056a = interfaceC0894p6;
        this.f9057b = iCrashTransformer;
        this.f9058c = t9;
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a(Throwable th, V v4) {
        if (this.f9056a.a(th)) {
            ICrashTransformer iCrashTransformer = this.f9057b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                Sn a6 = Vn.a(th, v4, null, (String) this.f9058c.f7524b.a(), (Boolean) this.f9058c.f7525c.a());
                C0822mc c0822mc = (C0822mc) ((Gh) this).f6844d;
                c0822mc.f7759a.a().a(c0822mc.f8785b).a(a6);
            }
        }
    }

    public final InterfaceC0894p6 b() {
        return this.f9056a;
    }

    public final ICrashTransformer a() {
        return this.f9057b;
    }
}
