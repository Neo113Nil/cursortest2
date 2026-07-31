package com.bytedance.sdk.openadsdk.cyb;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zn {
    private static volatile boolean btk;
    private static volatile boolean zn;
    private static final HashMap<String, Integer> zmn = new HashMap<>();
    private static volatile int fs = 10000;
    private static volatile boolean fb = true;

    public static void zmn() {
        String zmn2 = btk.zmn("stats_control", "");
        if (!TextUtils.isEmpty(zmn2)) {
            try {
                JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(zmn2);
                fs = jsonObjectInit.optInt("sampling_def", 10000);
                String optString = jsonObjectInit.optString("sampling");
                if (!TextUtils.isEmpty(optString)) {
                    JSONObject jsonObjectInit2 = PangleNetworkBridge.jsonObjectInit(optString);
                    Iterator<String> keys = jsonObjectInit2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        zmn.put(next, Integer.valueOf(jsonObjectInit2.optInt(next, fs)));
                    }
                }
            } catch (Exception unused) {
            }
        }
        fb = false;
        zn = false;
        if (fs == 10000 && zmn.isEmpty()) {
            fb = true;
        } else if (fs == 0 && zmn.isEmpty()) {
            zn = true;
        }
        btk = true;
    }

    public static boolean zmn(String str, int i) {
        if (fb || !btk) {
            return true;
        }
        if (zn) {
            return false;
        }
        if (i < 0) {
            i = fs;
        }
        Integer num = zmn.get(str);
        if (num == null) {
            num = Integer.valueOf(i);
        }
        if (num.intValue() <= 0) {
            return false;
        }
        return num.intValue() >= 10000 || ((int) ((Math.random() * 10000.0d) + 1.0d)) <= num.intValue();
    }

    public static boolean fs() {
        return zn;
    }

    public static int fs(String str, int i) {
        if (zn) {
            return 0;
        }
        if (!btk) {
            return i;
        }
        Integer num = zmn.get(str);
        if (num == null) {
            num = Integer.valueOf(i);
        }
        return num.intValue();
    }
}
