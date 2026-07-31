package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0509sj implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f1488a;

    public C0509sj(Throwable th) {
        this.f1488a = th;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa) {
        sa.reportUnhandledException(this.f1488a);
    }
}
