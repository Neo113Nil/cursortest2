package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Dj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5905a;

    public Dj(boolean z) {
        this.f5905a = z;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.setDataSendingEnabled(this.f5905a);
    }
}
