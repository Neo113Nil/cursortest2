package io.appmetrica.analytics.screenshot.impl;

import c3.C0292d;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;

/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1165x implements U {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f13509a;

    public C1165x(ClientContext clientContext) {
        this.f13509a = clientContext;
    }

    public final void a(String str) {
        this.f13509a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.Companion.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(d3.u.A(new C0292d("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
