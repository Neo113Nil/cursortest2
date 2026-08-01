package com.appsflyer;

import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), str);
    }
}
