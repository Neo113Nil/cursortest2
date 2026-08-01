package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.utils.CvL;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdSlotSettings.java */
/* loaded from: classes2.dex */
public class vG {
    private static final ConcurrentHashMap<String, icD> pvs = new ConcurrentHashMap<>();

    public static void pvs(boolean z) {
        String pvs2;
        File icD = icD();
        if (!icD.exists()) {
            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                pvs2 = com.bytedance.sdk.openadsdk.multipro.Jd.pvs.icD("tt_sdk_settings", "ad_slot_conf", null);
            } else {
                pvs2 = CvL.pvs("tt_sdk_settings", com.bytedance.sdk.openadsdk.core.mnm.pvs()).pvs("ad_slot_conf", (String) null);
            }
            if (TextUtils.isEmpty(pvs2)) {
                return;
            }
            try {
                HashMap<String, icD> icD2 = icD(new JSONArray(pvs2));
                if (icD2.isEmpty()) {
                    return;
                }
                ConcurrentHashMap<String, icD> concurrentHashMap = pvs;
                concurrentHashMap.clear();
                concurrentHashMap.putAll(icD2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        try {
            HashMap<String, icD> icD3 = icD(new JSONArray(new String(com.bytedance.sdk.component.utils.sUS.Jd(icD))));
            if (icD3.isEmpty()) {
                return;
            }
            for (Map.Entry<String, icD> entry : icD3.entrySet()) {
                String key = entry.getKey();
                icD value = entry.getValue();
                if (value.cRf && !z) {
                    icD icd = pvs.get(key);
                    if (icd != null) {
                        icd.SE = value.jhZ;
                    }
                } else {
                    pvs.put(key, value);
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static HashMap<String, icD> icD(JSONArray jSONArray) {
        HashMap<String, icD> hashMap = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                icD pvs2 = pvs(jSONArray.getJSONObject(i));
                if (pvs2 != null) {
                    hashMap.put(pvs2.pvs, pvs2);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    private static File icD() {
        return new File(com.bytedance.sdk.openadsdk.core.mnm.pvs().getFilesDir(), "tt_ads_conf");
    }

    private static icD pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new icD(jSONObject);
    }

    public static icD pvs(String str) {
        icD icd = pvs.get(str);
        return icd == null ? icD(str) : icd;
    }

    private static icD icD(String str) {
        return new icD(str, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pvs(JSONArray jSONArray) {
        HashMap<String, icD> icD;
        FileWriter fileWriter;
        if (jSONArray == null) {
            return;
        }
        File icD2 = icD();
        File file = new File(icD2.getParent(), icD2.getName() + ".tmp");
        FileWriter fileWriter2 = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                fileWriter = new FileWriter(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            fileWriter.write(jSONArray.toString());
            file.renameTo(icD2);
            CvL.pvs("tt_sdk_settings", com.bytedance.sdk.openadsdk.core.mnm.pvs()).pvs("ad_slot_conf");
            if (file.exists()) {
                file.delete();
            }
            com.bytedance.sdk.openadsdk.utils.Wyp.pvs(fileWriter);
        } catch (Exception e2) {
            e = e2;
            fileWriter2 = fileWriter;
            Log.e("SdkSettings.AdSlot", "saveAdSlotToLocal: ", e);
            if (file.exists()) {
                file.delete();
            }
            com.bytedance.sdk.openadsdk.utils.Wyp.pvs(fileWriter2);
            icD = icD(jSONArray);
            if (icD.isEmpty()) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            if (file.exists()) {
                file.delete();
            }
            com.bytedance.sdk.openadsdk.utils.Wyp.pvs(fileWriter2);
            throw th;
        }
        icD = icD(jSONArray);
        if (icD.isEmpty()) {
            for (Map.Entry<String, icD> entry : icD.entrySet()) {
                String key = entry.getKey();
                icD value = entry.getValue();
                if (value.cRf) {
                    icD icd = pvs.get(key);
                    if (icd != null) {
                        icd.SE = value.jhZ;
                    }
                } else {
                    pvs.put(key, value);
                }
            }
        }
    }

    public static void pvs() {
        File icD = icD();
        if (icD.exists()) {
            icD.delete();
        }
    }
}
