package com.squareup.cash.treehouse.hostview;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class HostViewService$Companion$Adapter$GeneratedOutboundService implements HostViewService, OutboundService {
    public final OutboundCallHandler callHandler;

    public HostViewService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
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

    @Override // com.squareup.cash.treehouse.hostview.HostViewService
    public final StateFlow lifecycleStateFlow() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
        return (StateFlow) call;
    }
}
