package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.tp2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFf1qSDK implements AFf1tSDK {
    private String AFInAppEventParameterName;

    private static String AFInAppEventParameterName(Activity activity) {
        Uri AFKeystoreWrapper = AFb1oSDK.AFKeystoreWrapper(activity);
        String obj = AFKeystoreWrapper != null ? AFKeystoreWrapper.toString() : null;
        if (obj == null) {
            obj = BuildConfig.FLAVOR;
        }
        if (values(obj)) {
            return null;
        }
        return obj;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final String AFInAppEventType(Activity activity) {
        Uri AFKeystoreWrapper = AFb1oSDK.AFKeystoreWrapper(activity);
        String obj = AFKeystoreWrapper != null ? AFKeystoreWrapper.toString() : null;
        return obj == null ? BuildConfig.FLAVOR : obj;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final String valueOf(Activity activity) {
        String str = this.AFInAppEventParameterName;
        this.AFInAppEventParameterName = null;
        return (str == null || str.length() == 0) ? AFInAppEventParameterName(activity) : str;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void values(Activity activity) {
        activity.getClass();
        String str = this.AFInAppEventParameterName;
        if (str == null || str.length() == 0) {
            this.AFInAppEventParameterName = AFInAppEventParameterName(activity);
        }
    }

    private static boolean values(String str) {
        return tp2.o(str, "android-app://", false);
    }
}
