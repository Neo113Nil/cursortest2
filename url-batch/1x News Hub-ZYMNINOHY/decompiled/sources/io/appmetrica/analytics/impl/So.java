package io.appmetrica.analytics.impl;

import android.app.Activity;

/* loaded from: classes.dex */
public final /* synthetic */ class So implements InterfaceC0544he {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0396bl f6672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f6673c;

    public /* synthetic */ So(C0396bl c0396bl, Activity activity, int i3) {
        this.f6671a = i3;
        this.f6672b = c0396bl;
        this.f6673c = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0544he
    public final void consume(Object obj) {
        switch (this.f6671a) {
            case 0:
                this.f6672b.a(this.f6673c, (C0723oc) obj);
                break;
            default:
                this.f6672b.b(this.f6673c, (C0723oc) obj);
                break;
        }
    }
}
