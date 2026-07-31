package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class btk {
    private static long fs;
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.nqi> zmn;
    private static boolean zn;

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        com.bytedance.sdk.openadsdk.core.model.hhw pw = nqiVar.pw();
        if (pw == null || TextUtils.isEmpty(pw.zmn())) {
            return;
        }
        zmn = new WeakReference<>(nqiVar);
    }

    public static void zmn(long j) {
        fs(j);
    }

    private static void fs(final long j) {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.nqi> weakReference = zmn;
        if (weakReference == null || j <= 0 || (nqiVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, nqiVar.btk(), "store_duration", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.utils.btk.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        zmn = null;
        zn = false;
    }

    public static void zmn() {
        if (zmn == null || zn) {
            return;
        }
        if (fs > 0) {
            fs(SystemClock.elapsedRealtime() - fs);
        }
        zmn = null;
        fs = 0L;
    }

    public static void fs() {
        if (zmn == null || zn) {
            return;
        }
        fs = SystemClock.elapsedRealtime();
    }

    public static boolean zn() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.nqi> weakReference = zmn;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        zn = true;
        return true;
    }
}
