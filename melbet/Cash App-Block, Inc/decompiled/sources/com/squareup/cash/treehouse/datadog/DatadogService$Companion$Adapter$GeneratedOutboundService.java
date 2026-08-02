package com.squareup.cash.treehouse.datadog;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import java.util.Map;

/* loaded from: classes7.dex */
public final class DatadogService$Companion$Adapter$GeneratedOutboundService implements DatadogService, OutboundService {
    public final OutboundCallHandler callHandler;

    public DatadogService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 5, new Object[0]);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.datadog.DatadogService
    public final void endSpan(String str, String str2, Map map) {
        Object call = this.callHandler.call(this, 1, str, str2, map);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // com.squareup.cash.treehouse.datadog.DatadogService
    public final void reportError(String str, Throwable th) {
        Object call = this.callHandler.call(this, 2, str, th);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.datadog.DatadogService
    public final void startSpan(String str, String str2, Map map) {
        Object call = this.callHandler.call(this, 0, str, str2, map);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.datadog.DatadogService
    public final void startTrackingView(String str, String str2, Map map) {
        Object call = this.callHandler.call(this, 3, str, str2, map);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.datadog.DatadogService
    public final void stopTrackingView(String str, Map map) {
        Object call = this.callHandler.call(this, 4, str, map);
        call.getClass();
    }
}
