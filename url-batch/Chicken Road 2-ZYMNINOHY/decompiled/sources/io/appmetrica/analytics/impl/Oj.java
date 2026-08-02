package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Oj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10764b;

    public Oj(String str, String str2) {
        this.f10763a = str;
        this.f10764b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportEvent(this.f10763a, this.f10764b);
    }
}
