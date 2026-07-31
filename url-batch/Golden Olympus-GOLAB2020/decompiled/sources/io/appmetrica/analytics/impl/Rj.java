package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes3.dex */
public final class Rj implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f38214a;

    public Rj(ModuleEvent moduleEvent) {
        this.f38214a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.reportEvent(this.f38214a);
    }
}
