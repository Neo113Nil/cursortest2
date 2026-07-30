package com.appsflyer;

import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes3.dex */
public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(String str) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), str);
    }
}
