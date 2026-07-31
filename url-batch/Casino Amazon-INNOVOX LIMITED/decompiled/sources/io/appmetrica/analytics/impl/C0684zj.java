package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0684zj implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1600a;

    public C0684zj(boolean z) {
        this.f1600a = z;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa) {
        sa.setDataSendingEnabled(this.f1600a);
    }
}
