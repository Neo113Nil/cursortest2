package com.squareup.cash.treehouse.activity;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;

/* loaded from: classes7.dex */
public final class TimeZoneOffsetDatabase$Companion$Adapter$GeneratedOutboundService implements TimeZoneOffsetDatabase, OutboundService {
    public final OutboundCallHandler callHandler;

    public TimeZoneOffsetDatabase$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
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

    @Override // com.squareup.cash.treehouse.activity.TimeZoneOffsetDatabase
    public final long getTimeZoneOffsetMinutes(double d) {
        Object call = this.callHandler.call(this, 0, Double.valueOf(d));
        call.getClass();
        return ((Long) call).longValue();
    }
}
