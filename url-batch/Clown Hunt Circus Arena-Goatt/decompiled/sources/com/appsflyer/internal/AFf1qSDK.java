package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFf1qSDK implements AFf1tSDK {
    private String AFInAppEventParameterName;

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void values(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.AFInAppEventParameterName;
        if (str == null || str.length() == 0) {
            this.AFInAppEventParameterName = AFInAppEventParameterName(activity);
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final String valueOf(Activity activity) {
        String str = this.AFInAppEventParameterName;
        this.AFInAppEventParameterName = null;
        String str2 = str;
        return (str2 == null || str2.length() == 0) ? AFInAppEventParameterName(activity) : str;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final String AFInAppEventType(Activity activity) {
        Uri AFKeystoreWrapper = AFb1oSDK.AFKeystoreWrapper(activity);
        String obj = AFKeystoreWrapper != null ? AFKeystoreWrapper.toString() : null;
        return obj == null ? "" : obj;
    }

    private static String AFInAppEventParameterName(Activity activity) {
        Uri AFKeystoreWrapper = AFb1oSDK.AFKeystoreWrapper(activity);
        String obj = AFKeystoreWrapper != null ? AFKeystoreWrapper.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (!values(obj)) {
            return obj;
        }
        return null;
    }

    private static boolean values(String str) {
        return StringsKt.startsWith$default(str, "android-app://", false, 2, (Object) null);
    }
}
