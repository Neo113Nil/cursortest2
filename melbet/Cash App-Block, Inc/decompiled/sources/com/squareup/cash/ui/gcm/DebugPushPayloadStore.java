package com.squareup.cash.ui.gcm;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes7.dex */
public abstract class DebugPushPayloadStore {
    public static volatile String lastPayload;
    public static final AtomicBoolean enabled = new AtomicBoolean(false);
    public static final SharedFlowImpl payloads = FlowKt.MutableSharedFlow$default(0, 1, null, 5);

    public static void onNotificationTapped() {
        String str;
        if (!enabled.get() || (str = lastPayload) == null) {
            return;
        }
        payloads.tryEmit(str);
        lastPayload = null;
    }
}
