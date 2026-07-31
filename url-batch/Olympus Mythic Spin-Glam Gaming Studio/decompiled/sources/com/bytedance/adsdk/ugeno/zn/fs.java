package com.bytedance.adsdk.ugeno.zn;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.btk;
import com.bytedance.adsdk.ugeno.zn.zmn;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class fs {
    public static String zmn(String str, JSONObject jSONObject) {
        zmn zn;
        zmn.InterfaceC0118zmn zmn;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                return (!str.startsWith("${") || !str.endsWith("}") || (zn = btk.zmn().zn()) == null || (zmn = zn.zmn(str.substring(2, str.length() + (-1)))) == null) ? str : (String) zmn.zmn(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static Object zmn(Object obj, JSONObject jSONObject) {
        if (obj == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        return (valueOf.startsWith("${") && valueOf.endsWith("}")) ? zmn(valueOf, jSONObject) : obj;
    }
}
