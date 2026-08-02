package io.appmetrica.analytics.impl;

import c3.C0295g;

/* loaded from: classes.dex */
public final class Xf implements InterfaceC0952sg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0590eg f11267a;

    public Xf(C0590eg c0590eg) {
        this.f11267a = c0590eg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0952sg
    public final void a(C0823ng c0823ng) {
        C0590eg c0590eg = this.f11267a;
        C0590eg.a(c0590eg, c0823ng, (Wf) ((C0295g) c0590eg.f11797d).a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0952sg
    public final void a(Throwable th) {
        C0590eg c0590eg = this.f11267a;
        C0590eg.a(c0590eg, null, (Wf) ((C0295g) c0590eg.f11797d).a());
    }
}
