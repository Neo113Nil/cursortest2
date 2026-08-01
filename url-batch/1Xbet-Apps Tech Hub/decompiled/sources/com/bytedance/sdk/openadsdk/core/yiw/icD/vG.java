package com.bytedance.sdk.openadsdk.core.yiw.icD;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.component.utils.ny;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.yiw.icD.icD;
import com.bytedance.sdk.openadsdk.core.yiw.icD.pvs;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.ktor.http.LinkHeader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VastTracker.java */
/* loaded from: classes2.dex */
public class vG {
    private static final Map<String, icD> NB = new ConcurrentHashMap();
    private static final AtomicBoolean sUS = new AtomicBoolean(false);
    private boolean Jd;
    private EnumC0088vG icD;
    private final String pvs;
    private boolean vG;

    /* compiled from: VastTracker.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.yiw.icD.vG$vG, reason: collision with other inner class name */
    enum EnumC0088vG {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    static {
        ny.pvs(new ny.pvs() { // from class: com.bytedance.sdk.openadsdk.core.yiw.icD.vG.1
            @Override // com.bytedance.sdk.component.utils.ny.pvs
            public void pvs(Context context, Intent intent, boolean z, int i) {
                if (i == 0 || vG.NB.size() <= 0) {
                    return;
                }
                vG.icD();
            }
        }, mnm.pvs());
    }

    protected vG(String str, EnumC0088vG enumC0088vG, Boolean bool) {
        this.pvs = str;
        this.icD = enumC0088vG;
        this.vG = bool.booleanValue();
    }

    public String vG() {
        return this.pvs;
    }

    public boolean Jd() {
        return this.vG;
    }

    public void k_() {
        this.Jd = true;
    }

    /* compiled from: VastTracker.java */
    public static class pvs {
        private final String pvs;
        private EnumC0088vG icD = EnumC0088vG.TRACKING_URL;
        private boolean vG = false;

        public pvs(String str) {
            this.pvs = str;
        }

        public pvs pvs(boolean z) {
            this.vG = z;
            return this;
        }

        public vG pvs() {
            return new vG(this.pvs, this.icD, Boolean.valueOf(this.vG));
        }
    }

    public boolean NB() {
        return this.Jd;
    }

    public static List<String> pvs(List<vG> list, com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs pvsVar, long j, String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (vG vGVar : list) {
            if (vGVar != null && (!vGVar.NB() || vGVar.Jd())) {
                arrayList.add(vGVar.vG());
                vGVar.k_();
            }
        }
        return new com.bytedance.sdk.openadsdk.core.yiw.vG.vG(arrayList).pvs(pvsVar).pvs(j).pvs(str).pvs();
    }

    public static void pvs(List<vG> list, com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs pvsVar, long j, String str, icD icd) {
        pvs(pvs(list, pvsVar, j, str), icd);
    }

    public static void icD(List<vG> list, com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs pvsVar, long j, String str) {
        pvs(list, pvsVar, j, str, null);
    }

    public static void pvs(List<String> list, icD icd) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                pvs(str, icd, false);
            }
        }
    }

    private static void pvs(final String str, final icD icd, final boolean z) {
        com.bytedance.sdk.component.yiw.icD.icD vG = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().vG();
        if (vG == null) {
            return;
        }
        vG.pvs(true);
        vG.icD(str);
        vG.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.core.yiw.icD.vG.2
            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd2) {
                boolean z2;
                icD icd3 = icD.this;
                if (icd3 == null || icd3.icD == null) {
                    return;
                }
                String str2 = null;
                if (icd2 == null || !icd2.sUS()) {
                    z2 = false;
                    if (icd2 != null) {
                        str2 = icd2.pvs() + ":" + icd2.icD();
                        if (!z && (icd2.pvs() <= 300 || icd2.pvs() >= 400)) {
                            vG.NB.put(str, icD.this);
                        }
                    }
                } else {
                    z2 = true;
                }
                vG.icD(z2, str2, jlb.vG(icD.this.icD.VLm()), icD.this, str, z);
                if (icd2 == null || icd2.pvs() != 200 || vG.NB.size() <= 0) {
                    return;
                }
                vG.icD();
            }

            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
                icD icd2 = icD.this;
                if (icd2 != null && icd2.icD != null) {
                    vG.icD(false, iOException != null ? iOException.getMessage() : null, jlb.vG(icD.this.icD.VLm()), icD.this, str, z);
                }
                if (z || icD.this == null) {
                    return;
                }
                vG.NB.put(str, icD.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD() {
        if (sUS.compareAndSet(false, true)) {
            Map<String, icD> map = NB;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    pvs((String) entry.getKey(), (icD) entry.getValue(), true);
                }
            }
            sUS.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD(final boolean z, final String str, final String str2, final icD icd, final String str3, final boolean z2) {
        com.bytedance.sdk.openadsdk.icD.vG.pvs(new so("dsp_track_link_result") { // from class: com.bytedance.sdk.openadsdk.core.yiw.icD.vG.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(LinkHeader.Parameters.Type, icd.pvs);
                    jSONObject.put(FirebaseAnalytics.Param.SUCCESS, z);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("description", str);
                    }
                    jSONObject.put(ImagesContract.URL, str3);
                    if (icd.vG >= 0.0f) {
                        jSONObject.put("progress", Math.round(icd.vG * 100.0f) / 100.0d);
                    }
                    if (z2) {
                        jSONObject.put("retry", true);
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.icD.vG.icD(icd.icD, str2, "dsp_track_link_result", jSONObject);
            }
        });
    }

    public static JSONArray pvs(List<vG> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i).vG());
        }
        return jSONArray;
    }

    public static List<vG> pvs(JSONArray jSONArray) {
        return pvs(jSONArray, false);
    }

    public static List<vG> pvs(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new pvs(optString).pvs(z).pvs());
                }
            }
        }
        return arrayList;
    }

    public static List<com.bytedance.sdk.openadsdk.core.yiw.icD.icD> icD(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new icD.pvs(optJSONObject.optString(FirebaseAnalytics.Param.CONTENT), (float) optJSONObject.optDouble("trackingFraction", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)).pvs());
                }
            }
        }
        return arrayList;
    }

    public static List<com.bytedance.sdk.openadsdk.core.yiw.icD.pvs> vG(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new pvs.C0087pvs(optJSONObject.optString(FirebaseAnalytics.Param.CONTENT), optJSONObject.optLong("trackingMilliseconds", 0L)).pvs());
                }
            }
        }
        return arrayList;
    }

    /* compiled from: VastTracker.java */
    public static class icD {
        cR icD;
        String pvs;
        float vG;

        public icD(String str, cR cRVar) {
            this(str, cRVar, -1.0f);
        }

        public icD(String str, cR cRVar, float f) {
            this.pvs = str;
            this.icD = cRVar;
            this.vG = f;
        }
    }
}
