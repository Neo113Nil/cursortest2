package com.onesignal.notifications.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.google.firebase.messaging.Constants;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.debug.internal.logging.Logging;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ADMMessageHandlerJob.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0014J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\u0010"}, d2 = {"Lcom/onesignal/notifications/services/ADMMessageHandlerJob;", "Lcom/amazon/device/messaging/ADMMessageHandlerJobBase;", "()V", "onMessage", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onRegistered", "newRegistrationId", "", "onRegistrationError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onUnregistered", "registrationId", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {
    protected void onMessage(Context context, Intent intent) {
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (context == null || extras == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        OneSignalDispatchers.INSTANCE.prewarm();
        ThreadUtilsKt.suspendifyOnIO(new ADMMessageHandlerJob$onMessage$1(applicationContext, extras, null));
    }

    protected void onRegistered(Context context, String newRegistrationId) {
        Logging.info$default("ADM registration ID: " + newRegistrationId, null, 2, null);
        OneSignalDispatchers.INSTANCE.prewarm();
        ThreadUtilsKt.suspendifyOnIO(new ADMMessageHandlerJob$onRegistered$1(newRegistrationId, null));
    }

    protected void onUnregistered(Context context, String registrationId) {
        Logging.info$default("ADM:onUnregistered: " + registrationId, null, 2, null);
    }

    protected void onRegistrationError(Context context, String error) {
        Logging.info$default("ADM:onRegistrationError: " + error, null, 2, null);
        if (Intrinsics.areEqual("INVALID_SENDER", error)) {
            Logging.info$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        OneSignalDispatchers.INSTANCE.prewarm();
        ThreadUtilsKt.suspendifyOnIO(new ADMMessageHandlerJob$onRegistrationError$1(null));
    }
}
