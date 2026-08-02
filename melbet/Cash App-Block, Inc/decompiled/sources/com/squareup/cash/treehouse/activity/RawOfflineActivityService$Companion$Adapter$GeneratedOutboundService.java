package com.squareup.cash.treehouse.activity;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class RawOfflineActivityService$Companion$Adapter$GeneratedOutboundService implements RawOfflineActivityService, OutboundService {
    public final OutboundCallHandler callHandler;

    public RawOfflineActivityService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 3, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // com.squareup.cash.treehouse.activity.RawOfflineActivityService
    public final Flow offlineActivityItems() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
        return (Flow) call;
    }

    @Override // com.squareup.cash.treehouse.activity.RawOfflineActivityService
    public final Flow offlinePendingItems() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
        return (Flow) call;
    }

    @Override // com.squareup.cash.treehouse.activity.RawOfflineActivityService
    public final void retryPendingItems() {
        Object call = this.callHandler.call(this, 2, new Object[0]);
        call.getClass();
    }
}
