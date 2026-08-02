package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904qj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f12626c;

    public C0904qj(String str, String str2, Throwable th) {
        this.f12624a = str;
        this.f12625b = str2;
        this.f12626c = th;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportError(this.f12624a, this.f12625b, this.f12626c);
    }
}
