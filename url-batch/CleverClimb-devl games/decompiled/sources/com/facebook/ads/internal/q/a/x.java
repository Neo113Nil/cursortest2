package com.facebook.ads.internal.q.a;

import android.app.KeyguardManager;
import android.content.Context;
import android.util.Log;
import java.util.Map;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5441a = "x";

    public static boolean a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }

    public static boolean a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            Log.v(f5441a, "Invalid Window info in window interactive check, assuming is not a Lockscreen.");
            return false;
        }
        String str = map.get("wfdkg");
        String str2 = map.get("wfswl");
        String str3 = map.get("kgr");
        return str != null && str.equals("1") && str2 != null && str2.equals("1") && str3 != null && str3.equals("true");
    }

    public static boolean b(Map<String, String> map) {
        String str;
        if (map == null || map.isEmpty()) {
            Log.v(f5441a, "Invalid Window info in window interactive check, assuming not obstructed by Keyguard.");
            return false;
        }
        String str2 = map.get("wfdkg");
        String str3 = map.get("wfswl");
        return (str2 == null || !str2.equals("1")) && (str3 == null || !str3.equals("1")) && (str = map.get("kgr")) != null && str.equals("true");
    }
}
