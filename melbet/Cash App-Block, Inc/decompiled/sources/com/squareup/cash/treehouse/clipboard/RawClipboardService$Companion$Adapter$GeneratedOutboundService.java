package com.squareup.cash.treehouse.clipboard;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;

/* loaded from: classes7.dex */
public final class RawClipboardService$Companion$Adapter$GeneratedOutboundService implements RawClipboardService, OutboundService {
    public final OutboundCallHandler callHandler;

    public RawClipboardService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.clipboard.RawClipboardService
    public final void copy(String str) {
        Object call = this.callHandler.call(this, 0, str);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }
}
