package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f10330b;

    public Gj(String str, byte[] bArr) {
        this.f10329a = str;
        this.f10330b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.setSessionExtra(this.f10329a, this.f10330b);
    }
}
