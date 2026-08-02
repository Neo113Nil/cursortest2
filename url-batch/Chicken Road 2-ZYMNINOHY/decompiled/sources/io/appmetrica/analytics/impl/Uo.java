package io.appmetrica.analytics.impl;

import android.app.Activity;

/* loaded from: classes.dex */
public final /* synthetic */ class Uo implements InterfaceC0485ae {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Wk f11072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f11073c;

    public /* synthetic */ Uo(Wk wk, Activity activity, int i4) {
        this.f11071a = i4;
        this.f11072b = wk;
        this.f11073c = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0485ae
    public final void consume(Object obj) {
        switch (this.f11071a) {
            case 0:
                this.f11072b.a(this.f11073c, (C0664hc) obj);
                break;
            default:
                this.f11072b.b(this.f11073c, (C0664hc) obj);
                break;
        }
    }
}
