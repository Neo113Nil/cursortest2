package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class AFb1mSDK {
    private static String AFInAppEventParameterName;
    private static String AFKeystoreWrapper;

    public static void AFKeystoreWrapper(String str) {
        if (AFKeystoreWrapper == null) {
            valueOf(AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().i().AFLogger);
        }
        String str2 = AFKeystoreWrapper;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, AFInAppEventParameterName));
        }
    }

    public static void valueOf(String str) {
        AFKeystoreWrapper = str;
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (i2 == 0 || i2 == str.length() - 1) {
                sb.append(str.charAt(i2));
            } else {
                sb.append("*");
            }
        }
        AFInAppEventParameterName = sb.toString();
    }
}
