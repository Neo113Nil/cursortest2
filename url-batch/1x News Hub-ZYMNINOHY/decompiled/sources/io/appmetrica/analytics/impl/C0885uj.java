package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.uj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0885uj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f8466b;

    public C0885uj(String str, Throwable th) {
        this.f8465a = str;
        this.f8466b = th;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportError(this.f8465a, this.f8466b);
    }
}
