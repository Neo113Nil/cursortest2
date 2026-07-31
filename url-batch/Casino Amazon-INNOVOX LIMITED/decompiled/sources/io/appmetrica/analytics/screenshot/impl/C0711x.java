package io.appmetrica.analytics.screenshot.impl;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0711x implements U {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f1748a;

    public C0711x(ClientContext clientContext) {
        this.f1748a = clientContext;
    }

    public final void a(String str) {
        this.f1748a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.INSTANCE.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(MapsKt.mapOf(TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
