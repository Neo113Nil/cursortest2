package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ICrashTransformer;

/* loaded from: classes3.dex */
public abstract class F6 implements InterfaceC2488ab {

    /* renamed from: a, reason: collision with root package name */
    public final E6 f37510a;

    /* renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f37511b;

    /* renamed from: c, reason: collision with root package name */
    public final C2674ha f37512c;

    public F6(E6 e6, ICrashTransformer iCrashTransformer, C2674ha c2674ha) {
        this.f37510a = e6;
        this.f37511b = iCrashTransformer;
        this.f37512c = c2674ha;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2488ab
    public final void a(Throwable th, @NonNull U u4) {
        if (this.f37510a.a(th)) {
            ICrashTransformer iCrashTransformer = this.f37511b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                Nn a4 = Qn.a(th, u4, null, (String) this.f37512c.f39136b.a(), (Boolean) this.f37512c.f39137c.a());
                Ac ac = (Ac) ((Oh) this).f38086d;
                ac.f38335a.a().a(ac.f37175b).a(a4);
            }
        }
    }

    public final E6 b() {
        return this.f37510a;
    }

    public final ICrashTransformer a() {
        return this.f37511b;
    }
}
