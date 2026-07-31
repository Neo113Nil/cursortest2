package com.onesignal.notifications.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.google.firebase.messaging.Constants;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.debug.internal.logging.Logging;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ADMMessageHandler.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0014J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0014¨\u0006\u000e"}, d2 = {"Lcom/onesignal/notifications/services/ADMMessageHandler;", "Lcom/amazon/device/messaging/ADMMessageHandlerBase;", "()V", "onMessage", "", "intent", "Landroid/content/Intent;", "onRegistered", "newRegistrationId", "", "onRegistrationError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onUnregistered", "info", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ADMMessageHandler extends ADMMessageHandlerBase {
    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    protected void onMessage(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        OneSignalDispatchers.INSTANCE.prewarm();
        ThreadUtilsKt.suspendifyOnIO(new ADMMessageHandler$onMessage$1(applicationContext, extras, null));
    }

    protected void onRegistered(String newRegistrationId) {
        Intrinsics.checkNotNullParameter(newRegistrationId, "newRegistrationId");
        Logging.info$default("ADM registration ID: " + newRegistrationId, null, 2, null);
        OneSignalDispatchers.INSTANCE.prewarm();
        ThreadUtilsKt.suspendifyOnIO(new ADMMessageHandler$onRegistered$1(newRegistrationId, null));
    }

    protected void onRegistrationError(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Logging.info$default("ADM:onRegistrationError: " + error, null, 2, null);
        if (Intrinsics.areEqual("INVALID_SENDER", error)) {
            Logging.info$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        OneSignalDispatchers.INSTANCE.prewarm();
        ThreadUtilsKt.suspendifyOnIO(new ADMMessageHandler$onRegistrationError$1(null));
    }

    protected void onUnregistered(String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Logging.info$default("ADM:onUnregistered: " + info, null, 2, null);
    }
}
