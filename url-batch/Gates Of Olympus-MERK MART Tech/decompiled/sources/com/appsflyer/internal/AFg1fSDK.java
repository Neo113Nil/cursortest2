package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFg1fSDK {
    public final String AFKeystoreWrapper;
    public final String valueOf;
    public final Intent values;

    public AFg1fSDK(Activity activity, AFh1iSDK aFh1iSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFh1iSDK, "");
        this.values = activity.getIntent();
        this.valueOf = aFh1iSDK.AFInAppEventType(activity);
        this.AFKeystoreWrapper = aFh1iSDK.AFInAppEventParameterName(activity);
    }
}
