package com.facebook.appevents.cloudbridge;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum OtherEventConstants {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");

    private final String rawValue;

    OtherEventConstants(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
