package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Kj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10538b;

    public Kj(String str, String str2) {
        this.f10537a = str;
        this.f10538b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.putAppEnvironmentValue(this.f10537a, this.f10538b);
    }
}
