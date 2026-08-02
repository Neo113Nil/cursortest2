package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0709j6 implements Fa {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0684i6 f12101a;

    /* renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f12102b;

    /* renamed from: c, reason: collision with root package name */
    public final M9 f12103c;

    public AbstractC0709j6(InterfaceC0684i6 interfaceC0684i6, ICrashTransformer iCrashTransformer, M9 m9) {
        this.f12101a = interfaceC0684i6;
        this.f12102b = iCrashTransformer;
        this.f12103c = m9;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(Throwable th, V v) {
        if (this.f12101a.a(th)) {
            ICrashTransformer iCrashTransformer = this.f12102b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                Qn a3 = Tn.a(th, v, null, (String) this.f12103c.f10638b.a(), (Boolean) this.f12103c.f10639c.a());
                C0612fc c0612fc = (C0612fc) ((Bh) this).f10119d;
                c0612fc.f11215a.a().a(c0612fc.f11834b).a(a3);
            }
        }
    }

    public final InterfaceC0684i6 b() {
        return this.f12101a;
    }

    public final ICrashTransformer a() {
        return this.f12102b;
    }
}
