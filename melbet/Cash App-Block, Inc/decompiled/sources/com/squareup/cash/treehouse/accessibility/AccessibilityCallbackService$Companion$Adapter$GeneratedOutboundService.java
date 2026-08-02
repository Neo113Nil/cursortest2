package com.squareup.cash.treehouse.accessibility;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class AccessibilityCallbackService$Companion$Adapter$GeneratedOutboundService implements AccessibilityCallbackService, OutboundService {
    public final OutboundCallHandler callHandler;

    public AccessibilityCallbackService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // com.squareup.cash.treehouse.accessibility.AccessibilityCallbackService
    public final Flow callbacks() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
        return (Flow) call;
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
}
