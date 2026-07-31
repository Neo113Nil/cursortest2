package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* loaded from: classes3.dex */
public final class AFb1hSDK {
    private static String AFKeystoreWrapper;
    private static String values;

    static void AFKeystoreWrapper(String str) {
        AFKeystoreWrapper = str;
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        values = sb.toString();
    }

    public static void AFInAppEventType(String str) {
        if (AFKeystoreWrapper == null) {
            AFKeystoreWrapper(AFb1tSDK.AFInAppEventType().values().force().unregisterClient);
        }
        String str2 = AFKeystoreWrapper;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, values));
        }
    }
}
