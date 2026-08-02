package io.appmetrica.analytics.screenshot.impl;

import b2.C0190d;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;

/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040x implements U {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9079a;

    public C1040x(ClientContext clientContext) {
        this.f9079a = clientContext;
    }

    public final void a(String str) {
        this.f9079a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.Companion.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(c2.q.a0(new C0190d("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
