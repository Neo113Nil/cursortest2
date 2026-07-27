package io.appmetrica.analytics.screenshot.impl;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import f4.C0430g;
import g4.AbstractC0476u;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;

/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1191x implements U {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f10060a;

    public C1191x(ClientContext clientContext) {
        this.f10060a = clientContext;
    }

    public final void a(String str) {
        this.f10060a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.Companion.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(AbstractC0476u.X(new C0430g(WebViewManager.EVENT_TYPE_KEY, str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
