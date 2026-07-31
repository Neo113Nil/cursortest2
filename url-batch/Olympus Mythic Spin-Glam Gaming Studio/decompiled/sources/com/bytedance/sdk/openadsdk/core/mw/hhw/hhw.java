package com.bytedance.sdk.openadsdk.core.mw.hhw;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.kgc;
import com.bytedance.sdk.openadsdk.core.kw;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class hhw {
    private final String zmn = "UGenV3OpenLinks";
    private final String fs = "landingStyle";
    private final String zn = "url";
    private final String fb = "fallbackUrl";

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #1 {all -> 0x002e, blocks: (B:5:0x0008, B:10:0x0029, B:12:0x0033, B:13:0x0037, B:17:0x003e), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:5:0x0008, B:10:0x0029, B:12:0x0033, B:13:0x0037, B:17:0x003e), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:5:0x0008, B:10:0x0029, B:12:0x0033, B:13:0x0037, B:17:0x003e), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(Context context, boolean z, nqi nqiVar, String str, Map<String, Object> map, com.bytedance.sdk.openadsdk.core.widget.btk btkVar) {
        int parseInt;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            Object obj = map.get("landingStyle");
            Object obj2 = map.get("url");
            Object obj3 = map.get("fallbackUrl");
            if (obj != null) {
                try {
                    parseInt = Integer.parseInt(String.valueOf(obj));
                } catch (Throwable unused) {
                }
                if (zmn(parseInt, obj2 == null ? String.valueOf(obj2) : null, obj3 != null ? String.valueOf(obj3) : null)) {
                    return;
                }
                kw.zmn(context, z, zmn(map), nqiVar, str, oub.zmn(str), null, btkVar);
                return;
            }
            parseInt = -1;
            if (zmn(parseInt, obj2 == null ? String.valueOf(obj2) : null, obj3 != null ? String.valueOf(obj3) : null)) {
            }
        } catch (Throwable th) {
            iqz.zn("UGenV3OpenLinks", th.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0008, code lost:
    
        if (r4 != 3) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zmn(int i, String str, String str2) {
        if (i != 1) {
            if (i == 2) {
                if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !kgc.zmn(str2)) {
                    return false;
                }
            }
            return true;
        }
        if (!kgc.zmn(str)) {
            return false;
        }
        return true;
    }

    private JSONObject zmn(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        jSONObject.put(entry.getKey(), String.valueOf(value));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
