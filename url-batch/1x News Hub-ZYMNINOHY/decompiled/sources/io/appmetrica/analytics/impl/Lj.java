package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Lj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f6291b;

    public Lj(String str, byte[] bArr) {
        this.f6290a = str;
        this.f6291b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.setSessionExtra(this.f6290a, this.f6291b);
    }
}
