package com.onesignal.notifications.services;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.debug.internal.logging.b;
import com.onesignal.notifications.bridges.a;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class HmsMessageServiceOneSignal extends HmsMessageService {
    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(RemoteMessage remoteMessage) {
        remoteMessage.getClass();
        a.INSTANCE.onMessageReceived((Context) this, remoteMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        b.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:" + str, null, 2, null);
        a.INSTANCE.onNewToken((Context) this, str, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @hd.a
    public void onNewToken(String str) {
        str.getClass();
        b.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:" + str, null, 2, null);
        a.INSTANCE.onNewToken((Context) this, str);
    }
}
