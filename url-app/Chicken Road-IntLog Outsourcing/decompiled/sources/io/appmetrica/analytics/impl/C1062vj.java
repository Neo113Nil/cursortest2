package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1062vj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f9479c;

    public C1062vj(String str, String str2, Throwable th) {
        this.f9477a = str;
        this.f9478b = str2;
        this.f9479c = th;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportError(this.f9477a, this.f9478b, this.f9479c);
    }
}
