package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public enum AFh1vSDK {
    application,
    activity,
    other;

    public static AFh1vSDK getMediationNetwork(Context context) {
        return context instanceof Activity ? activity : context instanceof Application ? application : other;
    }
}
