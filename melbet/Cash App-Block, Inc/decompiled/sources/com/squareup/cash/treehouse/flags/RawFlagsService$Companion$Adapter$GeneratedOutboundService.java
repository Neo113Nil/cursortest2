package com.squareup.cash.treehouse.flags;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class RawFlagsService$Companion$Adapter$GeneratedOutboundService implements RawFlagsService, OutboundService {
    public final OutboundCallHandler callHandler;

    public RawFlagsService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 3, new Object[0]);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.flags.RawFlagsService
    public final Flow encodedClientDataFeatureFlags() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
        return (Flow) call;
    }

    @Override // com.squareup.cash.treehouse.flags.RawFlagsService
    public final String get(String str, boolean z) {
        return (String) this.callHandler.call(this, 2, str, Boolean.valueOf(z));
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // com.squareup.cash.treehouse.flags.RawFlagsService
    public final String get(String str) {
        return (String) this.callHandler.call(this, 1, str);
    }
}
