package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929rj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f12681a;

    public C0929rj(Throwable th) {
        this.f12681a = th;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportUnhandledException(this.f12681a);
    }
}
