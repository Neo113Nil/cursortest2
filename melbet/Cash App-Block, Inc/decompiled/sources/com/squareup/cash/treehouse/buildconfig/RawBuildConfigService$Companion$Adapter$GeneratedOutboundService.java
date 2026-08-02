package com.squareup.cash.treehouse.buildconfig;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RawBuildConfigService$Companion$Adapter$GeneratedOutboundService implements RawBuildConfigService, OutboundService {
    public final OutboundCallHandler callHandler;

    public RawBuildConfigService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 2, new Object[0]);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.buildconfig.RawBuildConfigService
    public final ByteString encodedAppVersion() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
        return (ByteString) call;
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // com.squareup.cash.treehouse.buildconfig.RawBuildConfigService
    public final boolean isDebug() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
        return ((Boolean) call).booleanValue();
    }
}
