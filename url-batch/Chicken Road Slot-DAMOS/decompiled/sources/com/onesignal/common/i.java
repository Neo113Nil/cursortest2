package com.onesignal.common;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {
    public static final i INSTANCE = new i();
    private static String sdkType;
    private static String sdkVersion;

    private i() {
    }

    public static final String getSdkType() {
        return sdkType;
    }

    public static final String getSdkVersion() {
        return sdkVersion;
    }

    public static final void setSdkType(String str) {
        sdkType = str;
    }

    public static final void setSdkVersion(String str) {
        sdkVersion = str;
    }

    public static /* synthetic */ void getSdkType$annotations() {
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }
}
