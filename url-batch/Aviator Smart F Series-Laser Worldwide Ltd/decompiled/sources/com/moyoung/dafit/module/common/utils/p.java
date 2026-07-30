package com.moyoung.dafit.module.common.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes4.dex */
public class p {
    private static final String DEFAULT_UUID = "default_uuid";

    private p() {
    }

    @SuppressLint({"HardwareIds"})
    private static String getAndroidId(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    private static String getDefaultUuid() {
        String string = com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(DEFAULT_UUID, "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String replace = UUID.randomUUID().toString().replace("-", "");
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(DEFAULT_UUID, replace);
        return replace;
    }

    public static String getDeviceId(Context context) {
        String androidId = getAndroidId(context);
        return TextUtils.isEmpty(androidId) ? getDefaultUuid() : androidId;
    }
}
