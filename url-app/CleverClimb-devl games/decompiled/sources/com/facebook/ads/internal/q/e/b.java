package com.facebook.ads.internal.q.e;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.util.Log;
import android.view.Window;
import com.facebook.ads.internal.q.a.x;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5471a = "b";

    public static Map<String, String> a(Context context) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (context == null) {
            Log.v(f5471a, "Null context in window interactive check.");
            return hashMap;
        }
        try {
            hashMap.put("kgr", String.valueOf(c(context)));
        } catch (Exception e) {
            Log.e(f5471a, "Exception in window info check", e);
            com.facebook.ads.internal.q.d.a.a(e, context);
        }
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            if (window != null) {
                int i = window.getAttributes().flags;
                hashMap.put("wt", Integer.toString(window.getAttributes().type));
                hashMap.put("wfdkg", (4194304 & i) > 0 ? "1" : "0");
                hashMap.put("wfswl", (524288 & i) > 0 ? "1" : "0");
                return hashMap;
            }
            str = f5471a;
            str2 = "Invalid window in window interactive check, assuming interactive.";
        } else {
            str = f5471a;
            str2 = "Invalid Activity context in window interactive check, assuming interactive.";
        }
        Log.v(str, str2);
        return hashMap;
    }

    public static boolean b(Context context) {
        return !x.b(a(context));
    }

    public static boolean c(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
