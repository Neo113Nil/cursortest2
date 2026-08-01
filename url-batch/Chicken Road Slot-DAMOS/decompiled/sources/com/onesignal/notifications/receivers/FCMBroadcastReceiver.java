package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v9.c;
import xb.b;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class FCMBroadcastReceiver extends BroadcastReceiver {
    public static final a Companion = new a(null);
    private static final String FCM_RECEIVE_ACTION = "com.google.android.c2dm.intent.RECEIVE";
    private static final String FCM_TYPE = "gcm";
    private static final String MESSAGE_TYPE_EXTRA_KEY = "message_type";

    private final void setAbort() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    private final void setSuccessfulResultCode() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Bundle extras = intent.getExtras();
        if (extras == null || "google.com/iid".equals(extras.getString("from"))) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        if (c.b(applicationContext)) {
            b bVar = (b) c.a().getService(b.class);
            if (!Companion.isFCMMessage(intent)) {
                setSuccessfulResultCode();
                return;
            }
            xb.a processBundleFromReceiver = bVar.processBundleFromReceiver(context, extras);
            processBundleFromReceiver.getClass();
            if (processBundleFromReceiver.isWorkManagerProcessing()) {
                setAbort();
            } else {
                setSuccessfulResultCode();
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isFCMMessage(Intent intent) {
            if (!FCMBroadcastReceiver.FCM_RECEIVE_ACTION.equals(intent.getAction())) {
                return false;
            }
            String stringExtra = intent.getStringExtra(FCMBroadcastReceiver.MESSAGE_TYPE_EXTRA_KEY);
            return stringExtra == null || FCMBroadcastReceiver.FCM_TYPE.equals(stringExtra);
        }

        private a() {
        }
    }
}
