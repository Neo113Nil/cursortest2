package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0296k6 implements Ga {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0270j6 f1336a;
    public final ICrashTransformer b;
    public final N9 c;

    public AbstractC0296k6(InterfaceC0270j6 interfaceC0270j6, ICrashTransformer iCrashTransformer, N9 n9) {
        this.f1336a = interfaceC0270j6;
        this.b = iCrashTransformer;
        this.c = n9;
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(Throwable th, V v) {
        if (this.f1336a.a(th)) {
            ICrashTransformer iCrashTransformer = this.b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                Rn a2 = Un.a(th, v, null, (String) this.c.b.a(), (Boolean) this.c.c.a());
                C0199gc c0199gc = (C0199gc) ((Ch) this).d;
                c0199gc.f1122a.a().a(c0199gc.b).a(a2);
            }
        }
    }

    public final InterfaceC0270j6 b() {
        return this.f1336a;
    }

    public final ICrashTransformer a() {
        return this.b;
    }
}
