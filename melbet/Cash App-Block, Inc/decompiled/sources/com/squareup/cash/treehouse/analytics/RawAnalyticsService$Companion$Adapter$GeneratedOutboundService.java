package com.squareup.cash.treehouse.analytics;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;

/* loaded from: classes7.dex */
public final class RawAnalyticsService$Companion$Adapter$GeneratedOutboundService implements RawAnalyticsService, OutboundService {
    public final OutboundCallHandler callHandler;

    public RawAnalyticsService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // com.squareup.cash.treehouse.analytics.RawAnalyticsService
    public final void track(GenericEvent genericEvent) {
        Object call = this.callHandler.call(this, 0, genericEvent);
        call.getClass();
    }
}
