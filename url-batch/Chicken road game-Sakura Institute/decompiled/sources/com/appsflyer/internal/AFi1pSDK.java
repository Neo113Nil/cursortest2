package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class AFi1pSDK implements AFi1qSDK {
    private String AFInAppEventParameterName;

    @Override // com.appsflyer.internal.AFi1qSDK
    public final void values(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.AFInAppEventParameterName;
        if (str == null || str.length() == 0) {
            this.AFInAppEventParameterName = AFInAppEventType(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final String AFInAppEventParameterName(Activity activity) {
        String str = this.AFInAppEventParameterName;
        this.AFInAppEventParameterName = null;
        String str2 = str;
        return (str2 == null || str2.length() == 0) ? AFInAppEventType(activity) : str;
    }

    private static String AFInAppEventType(Activity activity) {
        Uri AFInAppEventType = AFc1bSDK.AFInAppEventType(activity != null ? activity.getIntent() : null);
        String obj = AFInAppEventType != null ? AFInAppEventType.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (AFInAppEventType(obj)) {
            return null;
        }
        return obj;
    }

    private static boolean AFInAppEventType(String str) {
        return StringsKt.startsWith$default(str, "android-app://", false, 2, (Object) null);
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final String valueOf(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }
}
