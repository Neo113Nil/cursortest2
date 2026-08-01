package com.bytedance.sdk.openadsdk.icD.pvs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.Wyp.vG.vG;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OverSeaEventUploadImpl.java */
/* loaded from: classes2.dex */
public class Wyp implements com.bytedance.sdk.component.sUS.pvs.icD.vG {
    private final vG icD = vG.pvs();
    public vA<com.bytedance.sdk.openadsdk.icD.pvs> pvs;

    @Override // com.bytedance.sdk.component.sUS.pvs.icD.vG
    public void pvs(final List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list, final com.bytedance.sdk.component.sUS.pvs.icD.icD icd) {
        com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar;
        if (list == null || list.isEmpty() || (pvsVar = list.get(0)) == null) {
            return;
        }
        byte Jd = pvsVar.Jd();
        final ArrayList arrayList = new ArrayList();
        if (Jd == 0) {
            ae.pvs(new com.bytedance.sdk.component.so.vG.icD(7, "upload_ad_event") { // from class: com.bytedance.sdk.openadsdk.icD.pvs.Wyp.1
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = Wyp.this.Jd(list).entrySet().iterator();
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.Ju.pvs("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    if (it == null) {
                        com.bytedance.sdk.component.sUS.pvs.icD.icD icd2 = icd;
                        if (icd2 != null) {
                            icd2.pvs(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        try {
                            pvs.pvs(pvs.Jd);
                            List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list2 = (List) ((Map.Entry) it.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.icD.pvs(pvsVar2.vG(), pvsVar2.yiw()));
                            }
                            com.bytedance.sdk.openadsdk.icD.NB pvs = Wyp.this.pvs(arrayList2);
                            if (icd != null && pvs != null) {
                                boolean z = pvs.Jd;
                                if (Wyp.this.pvs(arrayList2, pvs)) {
                                    z = true;
                                }
                                arrayList.add(new com.bytedance.sdk.component.sUS.pvs.icD.vG.pvs(new com.bytedance.sdk.component.sUS.pvs.icD.vG.icD(pvs.pvs, pvs.icD, pvs.vG, z, ""), list2));
                                if (pvs.icD == 200) {
                                    pvs.pvs(pvs.Jd, true);
                                } else if (z) {
                                    pvs.pvs(pvs.Jd, false);
                                }
                            }
                        } catch (Throwable th2) {
                            com.bytedance.sdk.component.utils.Ju.pvs("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.sUS.pvs.icD.icD icd3 = icd;
                    if (icd3 != null) {
                        icd3.pvs(arrayList);
                    }
                }
            });
            return;
        }
        if (Jd == 1) {
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar2 : list) {
                arrayList2.add(new vG.pvs(pvsVar2.vG(), pvsVar2.yiw()));
            }
            pvs.pvs(pvs.NB);
            if (arrayList2.size() > 0) {
                ae.pvs(new com.bytedance.sdk.component.so.vG.icD(6, "upload_stats_event") { // from class: com.bytedance.sdk.openadsdk.icD.pvs.Wyp.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.icD.NB icD = Wyp.this.icD(arrayList2);
                        if (icd == null || icD == null) {
                            return;
                        }
                        arrayList.add(new com.bytedance.sdk.component.sUS.pvs.icD.vG.pvs(new com.bytedance.sdk.component.sUS.pvs.icD.vG.icD(icD.pvs, icD.icD, icD.vG, icD.Jd, ""), list));
                        icd.pvs(arrayList);
                        if (icD.icD == 200) {
                            pvs.pvs(pvs.NB, true);
                        } else if (icD.Jd) {
                            pvs.pvs(pvs.NB, false);
                        }
                    }
                });
            }
        }
    }

    private boolean vG(List<com.bytedance.sdk.openadsdk.icD.pvs> list) {
        JSONObject vG;
        if (list == null || list.size() == 0 || (vG = list.get(0).vG()) == null) {
            return true;
        }
        return TextUtils.isEmpty(vG.optString("app_log_url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pvs(List<com.bytedance.sdk.openadsdk.icD.pvs> list, com.bytedance.sdk.openadsdk.icD.NB nb) {
        return !vG(list) && nb.icD >= 400 && nb.icD < 500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs>> Jd(List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list) {
        HashMap<String, List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs>> hashMap = new HashMap<>();
        new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar = list.get(i);
            JSONObject yiw = pvsVar.yiw();
            if (yiw != null) {
                String optString = yiw.optString("app_log_url");
                List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list2 = hashMap.get(optString);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    hashMap.put(optString, list2);
                }
                list2.add(pvsVar);
            }
        }
        return hashMap;
    }

    public com.bytedance.sdk.openadsdk.icD.NB pvs(List<com.bytedance.sdk.openadsdk.icD.pvs> list) {
        if (this.pvs == null) {
            this.pvs = mnm.vG();
        }
        if (this.pvs == null) {
            return null;
        }
        int Ye = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Ye();
        if (3 == Ye) {
            return this.pvs.pvs(this.icD.pvs(this.icD.pvs(list, false), System.currentTimeMillis(), this.icD.icD(), true), this.icD.pvs(list), true);
        }
        if (2 == Ye) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject icD = this.icD.icD();
            this.pvs.pvs(this.icD.pvs(this.icD.pvs(list, true), currentTimeMillis, icD, true), this.icD.pvs(list), true);
            return this.pvs.pvs(this.icD.pvs(this.icD.icD(list), currentTimeMillis, icD, false), this.icD.pvs(list), false);
        }
        return this.pvs.pvs(this.icD.pvs(list, System.currentTimeMillis(), this.icD.icD(), false), this.icD.pvs(list), false);
    }

    public com.bytedance.sdk.openadsdk.icD.NB icD(List<vG.pvs> list) {
        if (this.pvs == null) {
            this.pvs = mnm.vG();
        }
        if (list == null || list.size() == 0 || !com.bytedance.sdk.openadsdk.core.settings.kj.pvs()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<vG.pvs> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().icD);
            }
            jSONObject.put("stats_list", jSONArray);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", currentTimeMillis);
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.NB.pvs(String.valueOf(currentTimeMillis).concat("stats_list")));
        } catch (Exception unused) {
        }
        return this.pvs.pvs(jSONObject);
    }
}
