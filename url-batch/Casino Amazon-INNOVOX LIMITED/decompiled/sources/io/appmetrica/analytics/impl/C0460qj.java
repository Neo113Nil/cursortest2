package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0460qj implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1457a;
    public final /* synthetic */ Throwable b;

    public C0460qj(String str, Throwable th) {
        this.f1457a = str;
        this.b = th;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa) {
        sa.reportError(this.f1457a, this.b);
    }
}
