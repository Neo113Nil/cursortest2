package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1088wj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f9550a;

    public C1088wj(Throwable th) {
        this.f9550a = th;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportUnhandledException(this.f9550a);
    }
}
