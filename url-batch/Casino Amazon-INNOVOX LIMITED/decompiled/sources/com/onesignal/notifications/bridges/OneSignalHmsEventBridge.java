package com.onesignal.notifications.bridges;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.debug.internal.logging.Logging;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneSignalHmsEventBridge.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J \u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/onesignal/notifications/bridges/OneSignalHmsEventBridge;", "", "()V", "HMS_SENT_TIME_KEY", "", "HMS_TTL_KEY", "firstToken", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onMessageReceived", "", "context", "Landroid/content/Context;", "message", "Lcom/huawei/hms/push/RemoteMessage;", "onNewToken", "token", "bundle", "Landroid/os/Bundle;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OneSignalHmsEventBridge {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    public static final OneSignalHmsEventBridge INSTANCE = new OneSignalHmsEventBridge();
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    private OneSignalHmsEventBridge() {
    }

    public final void onNewToken(Context context, String token, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        if (firstToken.compareAndSet(true, false)) {
            Logging.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
            OneSignalDispatchers.INSTANCE.prewarm();
            ThreadUtilsKt.suspendifyOnIO(new OneSignalHmsEventBridge$onNewToken$1(token, null));
            return;
        }
        Logging.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
    }

    @Deprecated(message = "")
    public final void onNewToken(Context context, String token) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        onNewToken(context, token, null);
    }

    public final void onMessageReceived(Context context, RemoteMessage message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        OneSignalDispatchers.INSTANCE.prewarm();
        ThreadUtilsKt.suspendifyOnDefault(new OneSignalHmsEventBridge$onMessageReceived$1(context, message, null));
    }
}
