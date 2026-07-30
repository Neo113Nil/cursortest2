package com.moyoung.dafit.module.common.utils;

import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes4.dex */
public class a {
    private static final String KEY_EMUI_VERSION_CODE = "ro.build.version.emui";
    private static final String KEY_MIUI_INTERNAL_STORAGE = "ro.miui.internal.storage";
    private static final String KEY_MIUI_VERSION_CODE = "ro.miui.ui.version.code";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";

    public static boolean isEMUI() {
        try {
            return j.newInstance().getProperty(KEY_EMUI_VERSION_CODE, null) != null;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isHarmonyOs() {
        try {
            Class.forName("ohos.utils.system.SystemCapability");
            return true;
        } catch (ClassNotFoundException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static boolean isMIUI() {
        return TextUtils.equals(Build.MANUFACTURER, "Xiaomi");
    }
}
