package com.onesignal.notifications.bridges;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.debug.internal.logging.Logging;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OneSignalHmsEventBridge {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    public static final OneSignalHmsEventBridge INSTANCE = new OneSignalHmsEventBridge();
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    private OneSignalHmsEventBridge() {
    }

    public final void onMessageReceived(Context context, RemoteMessage message) {
        i.e(context, "context");
        i.e(message, "message");
        ThreadUtilsKt.suspendifyOnDefault(new OneSignalHmsEventBridge$onMessageReceived$1(context, message, null));
    }

    public final void onNewToken(Context context, String token, Bundle bundle) {
        i.e(context, "context");
        i.e(token, "token");
        if (!firstToken.compareAndSet(true, false)) {
            Logging.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
            return;
        }
        Logging.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
        ThreadUtilsKt.suspendifyOnIO(new OneSignalHmsEventBridge$onNewToken$1(token, null));
    }

    public final void onNewToken(Context context, String token) {
        i.e(context, "context");
        i.e(token, "token");
        onNewToken(context, token, null);
    }
}
