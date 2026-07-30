package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.MessagingAnalytics;
import com.google.firebase.messaging.ServiceStarter;
import defpackage.cv;
import defpackage.dv;
import defpackage.mi2;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends dv {
    private static final String TAG = "FirebaseMessaging";

    private static Intent createServiceIntent(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // defpackage.dv
    public int onMessageReceive(Context context, cv cvVar) {
        try {
            return ((Integer) mi2.d(new FcmBroadcastProcessor(context).process(cvVar.m))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return ServiceStarter.ERROR_UNKNOWN;
        }
    }

    @Override // defpackage.dv
    public void onNotificationDismissed(Context context, Bundle bundle) {
        Intent createServiceIntent = createServiceIntent(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (MessagingAnalytics.shouldUploadScionMetrics(createServiceIntent)) {
            MessagingAnalytics.logNotificationDismiss(createServiceIntent);
        }
    }
}
