package com.onesignal.notifications.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.debug.internal.logging.Logging;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ADMMessageHandler extends ADMMessageHandlerBase {
    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        i.e(intent, "intent");
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        ThreadUtilsKt.suspendifyOnIO(new ADMMessageHandler$onMessage$1(applicationContext, extras, null));
    }

    public void onRegistered(String newRegistrationId) {
        i.e(newRegistrationId, "newRegistrationId");
        Logging.info$default("ADM registration ID: ".concat(newRegistrationId), null, 2, null);
        ThreadUtilsKt.suspendifyOnIO(new ADMMessageHandler$onRegistered$1(newRegistrationId, null));
    }

    public void onRegistrationError(String error) {
        i.e(error, "error");
        Logging.info$default("ADM:onRegistrationError: ".concat(error), null, 2, null);
        if ("INVALID_SENDER".equals(error)) {
            Logging.info$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        ThreadUtilsKt.suspendifyOnIO(new ADMMessageHandler$onRegistrationError$1(null));
    }

    public void onUnregistered(String info) {
        i.e(info, "info");
        Logging.info$default("ADM:onUnregistered: ".concat(info), null, 2, null);
    }
}
