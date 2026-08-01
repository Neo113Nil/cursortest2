package com.bykv.vk.openvk.component.video.pvs;

import android.content.Context;
import com.bykv.vk.openvk.component.video.api.pvs.icD;
import org.json.JSONObject;

/* compiled from: MediaConfig.java */
/* loaded from: classes.dex */
public class pvs {
    public static int Jd = 10;
    private static icD NB = null;
    public static int icD = 10;
    public static int pvs = 10;
    public static int vG = 10;

    public static void pvs(Context context) {
        com.bykv.vk.openvk.component.video.api.sUS.pvs.pvs(context);
    }

    public static void pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            pvs = jSONObject.optInt("splash", 10);
            icD = jSONObject.optInt("reward", 10);
            vG = jSONObject.optInt("brand", 10);
            int optInt = jSONObject.optInt("other", 10);
            Jd = optInt;
            if (pvs < 0) {
                pvs = 10;
            }
            if (icD < 0) {
                icD = 10;
            }
            if (vG < 0) {
                vG = 10;
            }
            if (optInt < 0) {
                Jd = 10;
            }
            Object[] objArr = new Object[8];
            Integer.valueOf(pvs);
            Integer.valueOf(icD);
            Integer.valueOf(vG);
            Integer.valueOf(Jd);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void pvs(icD icd) {
        NB = icd;
    }

    public static void pvs() {
        icD icd = NB;
        if (icd != null) {
            icd.Jd();
        }
    }

    public static int icD() {
        return pvs;
    }

    public static int vG() {
        return icD;
    }

    public static int Jd() {
        return vG;
    }

    public static int NB() {
        return Jd;
    }
}
