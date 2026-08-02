package com.squareup.cash.treehouse.appmessaging;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class RawAppMessagingService$Companion$Adapter$GeneratedOutboundService implements RawAppMessagingService, OutboundService {
    public final OutboundCallHandler callHandler;

    public RawAppMessagingService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // com.squareup.cash.treehouse.appmessaging.RawAppMessagingService
    public final Flow getDisplayActivityInlineMessage() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
        return (Flow) call;
    }
}
