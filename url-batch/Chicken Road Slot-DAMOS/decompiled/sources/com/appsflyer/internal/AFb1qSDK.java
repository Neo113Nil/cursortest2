package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFb1qSDK {
    public static Uri k_(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1gSDK aFj1gSDK = new AFj1gSDK(intent);
        Uri uri = (Uri) aFj1gSDK.H_("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String AFAdRevenueData = aFj1gSDK.AFAdRevenueData("android.intent.extra.REFERRER_NAME");
        if (AFAdRevenueData != null) {
            return Uri.parse(AFAdRevenueData);
        }
        return null;
    }
}
