package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911vj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f8527c;

    public C0911vj(String str, String str2, Throwable th) {
        this.f8525a = str;
        this.f8526b = str2;
        this.f8527c = th;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportError(this.f8525a, this.f8526b, this.f8527c);
    }
}
