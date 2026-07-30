package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public enum AFh1zSDK {
    application,
    activity,
    other;

    public static AFh1zSDK AFAdRevenueData(Context context) {
        return context instanceof Activity ? activity : context instanceof Application ? application : other;
    }
}
