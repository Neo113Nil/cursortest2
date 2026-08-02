package com.squareup.cash.treehouse.preferences;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class RawPreferencesService$Companion$Adapter$GeneratedOutboundService implements RawPreferencesService, OutboundService {
    public final OutboundCallHandler callHandler;

    public RawPreferencesService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 2, new Object[0]);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.preferences.RawPreferencesService
    public final String displayUnit() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
        return (String) call;
    }

    @Override // com.squareup.cash.treehouse.preferences.RawPreferencesService
    public final Flow displayUnitFlow() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
        return (Flow) call;
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }
}
