package com.bytedance.sdk.openadsdk.component.yiw;

import android.content.Context;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.sUS;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.multipro.icD;
import com.bytedance.sdk.openadsdk.utils.Wyp;
import java.io.File;
import org.json.JSONObject;

/* compiled from: TTAppOpenUtils.java */
/* loaded from: classes2.dex */
public class pvs {
    public static File pvs(String str) {
        return new File(CacheDirFactory.getICacheDir(0).icD() + File.separator + str);
    }

    public static String pvs() {
        return Wyp.pvs();
    }

    public static File icD(String str) {
        return pvs(mnm.pvs(), sUS.pvs(mnm.pvs()).icD(), str);
    }

    public static File pvs(Context context, String str, String str2) {
        return com.bytedance.sdk.component.utils.sUS.pvs(context, icD.vG(), str, str2);
    }

    public static void pvs(File file) {
        if (file == null) {
            return;
        }
        try {
            com.bytedance.sdk.component.utils.sUS.icD(file);
        } catch (Throwable unused) {
        }
    }

    public static void pvs(Context context) {
        try {
            sUS.pvs(context).pvs();
        } catch (Throwable unused) {
        }
    }

    public static String icD() {
        return com.bytedance.sdk.component.utils.sUS.pvs(mnm.pvs(), icD.vG(), sUS.pvs(mnm.pvs()).icD()).getAbsolutePath();
    }

    public static void pvs(JSONObject jSONObject, int i) {
        try {
            String NB = so.icD().NB();
            int sUS = so.icD().sUS();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", NB);
            jSONObject3.put("app_icon_id", "@".concat(String.valueOf(sUS)));
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", mnm.Jd().ny(String.valueOf(i)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (Exception e) {
            Ju.pvs("TTAppOpenUtils", e.getMessage());
        }
    }

    public static int pvs(cR cRVar, int i) {
        return i - cRVar.nS();
    }
}
