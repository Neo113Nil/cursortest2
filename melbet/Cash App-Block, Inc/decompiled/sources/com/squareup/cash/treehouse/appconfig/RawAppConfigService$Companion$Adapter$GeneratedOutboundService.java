package com.squareup.cash.treehouse.appconfig;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RawAppConfigService$Companion$Adapter$GeneratedOutboundService implements RawAppConfigService, OutboundService {
    public final OutboundCallHandler callHandler;

    public RawAppConfigService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // com.squareup.cash.treehouse.appconfig.RawAppConfigService
    public final ByteString bankingConfigByteString() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
        return (ByteString) call;
    }

    @Override // com.squareup.cash.treehouse.appconfig.RawAppConfigService
    public final Flow bankingConfigByteStringFlow() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
        return (Flow) call;
    }

    @Override // com.squareup.cash.treehouse.appconfig.RawAppConfigService
    public final Flow clientDataByteStringFlow() {
        Object call = this.callHandler.call(this, 2, new Object[0]);
        call.getClass();
        return (Flow) call;
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
}
