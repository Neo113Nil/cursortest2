package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0484rj implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1470a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;

    public C0484rj(String str, String str2, Throwable th) {
        this.f1470a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa) {
        sa.reportError(this.f1470a, this.b, this.c);
    }
}
