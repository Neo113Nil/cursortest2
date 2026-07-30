package com.facebook.internal;

import defpackage.tp2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InternalSettings {
    public static final InternalSettings INSTANCE = new InternalSettings();
    private static final String UNITY_PREFIX = "Unity.";
    private static volatile String customUserAgent;

    private InternalSettings() {
    }

    public static final String getCustomUserAgent() {
        return customUserAgent;
    }

    public static final boolean isUnityApp() {
        String str = customUserAgent;
        return str != null && tp2.o(str, UNITY_PREFIX, false);
    }

    public static final void setCustomUserAgent(String str) {
        str.getClass();
        customUserAgent = str;
    }

    public static /* synthetic */ void isUnityApp$annotations() {
    }
}
