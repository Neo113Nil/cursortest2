package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFb1rSDK {
    public static Uri k_(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1nSDK aFj1nSDK = new AFj1nSDK(intent);
        Uri uri = (Uri) aFj1nSDK.H_("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String mediationNetwork = aFj1nSDK.getMediationNetwork("android.intent.extra.REFERRER_NAME");
        if (mediationNetwork != null) {
            return Uri.parse(mediationNetwork);
        }
        return null;
    }
}
