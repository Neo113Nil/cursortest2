package com.appsflyer.internal;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum AFc1aSDK {
    API("api"),
    RC("rc"),
    DEFAULT(BuildConfig.FLAVOR);

    public final String AFInAppEventParameterName;

    AFc1aSDK(String str) {
        this.AFInAppEventParameterName = str;
    }
}
