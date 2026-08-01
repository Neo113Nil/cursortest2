package com.bytedance.sdk.openadsdk.core.ugen.pvs;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenTemplateManager.java */
/* loaded from: classes2.dex */
public class icD {
    private static volatile icD pvs;

    /* compiled from: UGenTemplateManager.java */
    public interface pvs {
        void pvs(int i, String str, String str2);

        void pvs(JSONObject jSONObject, String str);
    }

    public static icD pvs() {
        if (pvs == null) {
            synchronized (icD.class) {
                if (pvs == null) {
                    pvs = new icD();
                }
            }
        }
        return pvs;
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.ugen.NB.pvs pvsVar, String str) {
        if (pvsVar == null) {
            return;
        }
        if (TextUtils.isEmpty(pvsVar.pvs())) {
            Ju.pvs("UGTemplateManager", "save ugen template error : tmpId is empty");
            return;
        }
        final String str2 = str + "_" + pvsVar.pvs();
        final String vG = pvsVar.vG();
        final String icD = pvsVar.icD();
        final String Jd = pvsVar.Jd();
        String NB = pvsVar.NB();
        if (TextUtils.isEmpty(NB) && str.equals("ad")) {
            NB = so.icD().Jd();
        }
        final String str3 = NB;
        ae.pvs(new com.bytedance.sdk.component.so.so("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.1
            @Override // java.lang.Runnable
            public void run() {
                icD.this.pvs(str2, vG, icD, Jd, str3);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(String str, String str2, String str3, String str4, String str5) {
        if (pvs(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            icD(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            pvs(str2, str, str3, str5, (pvs) null);
        } else {
            icD(str2, str3, str5, str4, str);
        }
    }

    public void pvs(String str, String str2, String str3, String str4, String str5, final pvs pvsVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (pvsVar != null) {
                pvsVar.pvs(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String str6 = str + "_" + str3;
        com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs pvs2 = pvs(str6, str4);
        if (pvs2 == null || TextUtils.isEmpty(pvs2.NB())) {
            pvs(str2, str6, str4, str5, new pvs() { // from class: com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.2
                @Override // com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.pvs
                public void pvs(JSONObject jSONObject, String str7) {
                    pvs pvsVar2 = pvsVar;
                    if (pvsVar2 != null) {
                        pvsVar2.pvs(jSONObject, str7);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.pvs
                public void pvs(int i, String str7, String str8) {
                    pvs pvsVar2 = pvsVar;
                    if (pvsVar2 != null) {
                        pvsVar2.pvs(i, str7, str8);
                    }
                }
            });
            return;
        }
        pvs(pvs2);
        if (pvsVar != null) {
            try {
                pvsVar.pvs(new JSONObject(pvs2.NB()), ImagesContract.LOCAL);
            } catch (JSONException unused) {
                pvsVar.pvs(2, "parse json exception data is " + pvs2.NB(), ImagesContract.LOCAL);
            }
        }
    }

    private void pvs(final String str, final String str2, final String str3, final String str4, final pvs pvsVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (pvsVar != null) {
                pvsVar.pvs(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.yiw.icD.icD vG = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().vG();
            vG.icD(str);
            vG.pvs(7);
            vG.pvs("load_ug_t");
            vG.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.3
                @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd) {
                    if (icd == null) {
                        return;
                    }
                    if (icd.sUS()) {
                        String Jd = icd.Jd();
                        if (TextUtils.isEmpty(Jd)) {
                            pvs pvsVar2 = pvsVar;
                            if (pvsVar2 != null) {
                                pvsVar2.pvs(3, "net data is null", "net");
                                return;
                            }
                            return;
                        }
                        vG.pvs().pvs(new com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs().pvs(str2).icD(str3).vG(str).NB(str4).Jd(Jd).pvs(Long.valueOf(System.currentTimeMillis())));
                        icD.this.icD();
                        if (pvsVar != null) {
                            try {
                                pvsVar.pvs(new JSONObject(Jd), "net");
                                return;
                            } catch (JSONException unused) {
                                pvsVar.pvs(2, "parse json exception data is".concat(String.valueOf(Jd)), "net");
                                return;
                            }
                        }
                        return;
                    }
                    pvs pvsVar3 = pvsVar;
                    if (pvsVar3 != null) {
                        pvsVar3.pvs(3, "net code error code is " + icd.pvs() + " message is " + icd.icD(), "net");
                    }
                }

                @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
                    pvs pvsVar2 = pvsVar;
                    if (pvsVar2 != null) {
                        pvsVar2.pvs(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs> pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return vG.pvs().pvs(str);
    }

    public String pvs(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs pvs2 = pvs(str + "_" + str2, str3);
        if (pvs2 == null) {
            return null;
        }
        pvs(pvs2);
        return pvs2.NB();
    }

    private com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs pvs(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return vG.pvs().pvs(str, str2);
    }

    private void icD(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs();
        pvsVar.vG(str).NB(str3).Jd(str4).icD(str2).pvs(str5).pvs(Long.valueOf(System.currentTimeMillis()));
        vG.pvs().pvs(pvsVar);
        icD();
    }

    private void pvs(final com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs pvsVar) {
        pvsVar.pvs(Long.valueOf(System.currentTimeMillis()));
        ae.pvs(new com.bytedance.sdk.component.so.so("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.4
            @Override // java.lang.Runnable
            public void run() {
                vG.pvs().pvs(pvsVar);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD() {
        int Jd = mnm.Jd().Jd();
        if (Jd <= 0) {
            Jd = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs> icD = vG.pvs().icD();
        if (icD == null || icD.isEmpty() || Jd >= icD.size()) {
            if (icD == null) {
                return;
            }
            icD.size();
            return;
        }
        int size = (int) (icD.size() - (Jd * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs pvsVar : icD) {
            treeMap.put(pvsVar.Jd(), pvsVar);
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs pvsVar2 = (com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs) entry.getValue();
                if (pvsVar2 != null) {
                    hashSet.add(pvsVar2.pvs());
                }
            }
        }
        pvs(hashSet);
    }

    public void pvs(Set<String> set) {
        try {
            vG.pvs().pvs(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
