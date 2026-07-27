package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Tj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7549b;

    public Tj(String str, String str2) {
        this.f7548a = str;
        this.f7549b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportEvent(this.f7548a, this.f7549b);
    }
}
