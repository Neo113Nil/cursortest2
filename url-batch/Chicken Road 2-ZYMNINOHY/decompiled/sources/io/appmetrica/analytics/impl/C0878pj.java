package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878pj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f12590b;

    public C0878pj(String str, Throwable th) {
        this.f12589a = str;
        this.f12590b = th;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportError(this.f12589a, this.f12590b);
    }
}
