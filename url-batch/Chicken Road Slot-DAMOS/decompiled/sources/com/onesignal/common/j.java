package com.onesignal.common;

import java.io.File;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {
    public static final j INSTANCE = new j();

    private j() {
    }

    public final boolean isRooted() {
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i3 = 0; i3 < 8; i3++) {
            try {
                if (new File(strArr[i3] + "su").exists()) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
