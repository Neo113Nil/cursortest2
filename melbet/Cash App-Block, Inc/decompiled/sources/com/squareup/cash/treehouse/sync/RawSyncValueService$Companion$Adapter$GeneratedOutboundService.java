package com.squareup.cash.treehouse.sync;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class RawSyncValueService$Companion$Adapter$GeneratedOutboundService implements RawSyncValueService, OutboundService {
    public final OutboundCallHandler callHandler;

    public RawSyncValueService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 2, new Object[0]);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.sync.RawSyncValueService
    public final Flow encodedAllSyncValues() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
        return (Flow) call;
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // com.squareup.cash.treehouse.sync.RawSyncValueService
    public final Flow getSyncValues(int i) {
        Object call = this.callHandler.call(this, 1, Integer.valueOf(i));
        call.getClass();
        return (Flow) call;
    }
}
