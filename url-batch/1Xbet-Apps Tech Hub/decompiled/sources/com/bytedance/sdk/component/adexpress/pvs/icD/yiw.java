package com.bytedance.sdk.component.adexpress.pvs.icD;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.Ju;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: TmplDiffManager.java */
/* loaded from: classes.dex */
public class yiw {
    private static volatile yiw pvs;
    private AtomicBoolean icD = new AtomicBoolean(false);

    public static yiw pvs() {
        if (pvs == null) {
            synchronized (yiw.class) {
                if (pvs == null) {
                    pvs = new yiw();
                }
            }
        }
        return pvs;
    }

    private yiw() {
    }

    public com.bytedance.sdk.component.adexpress.pvs.vG.icD pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return sUS.pvs().pvs(str);
    }

    public Set<String> icD(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return sUS.pvs().icD(str);
    }

    private void icD() {
        if (com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG() == null) {
            return;
        }
        int pvs2 = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().pvs();
        if (pvs2 <= 0) {
            pvs2 = 100;
        }
        List<com.bytedance.sdk.component.adexpress.pvs.vG.icD> icD = sUS.pvs().icD();
        if (icD == null || icD.isEmpty() || pvs2 >= icD.size()) {
            if (icD == null) {
                return;
            }
            icD.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.pvs.vG.icD icd : icD) {
            treeMap.put(icd.yiw(), icd);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (icD.size() - (pvs2 * 0.75f));
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                ((Long) entry.getKey()).longValue();
                com.bytedance.sdk.component.adexpress.pvs.vG.icD icd2 = (com.bytedance.sdk.component.adexpress.pvs.vG.icD) entry.getValue();
                if (icd2 != null) {
                    hashSet.add(icd2.icD());
                }
            }
        }
        pvs(hashSet);
        this.icD.set(false);
    }

    private JSONObject vG(String str) {
        com.bytedance.sdk.component.adexpress.pvs.pvs.vG vG = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG();
        if (vG == null) {
            return null;
        }
        com.bytedance.sdk.component.yiw.icD.icD yiw = vG.yiw();
        yiw.icD(str);
        com.bytedance.sdk.component.yiw.icD pvs2 = yiw.pvs();
        if (pvs2 != null) {
            try {
                if (pvs2.sUS() && pvs2.Jd() != null) {
                    return new JSONObject(pvs2.Jd());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void pvs(com.bytedance.sdk.component.adexpress.pvs.vG.Jd jd, String str) {
        if (jd == null) {
            Ju.pvs("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final String str2 = jd.pvs;
        final String str3 = jd.vG;
        final String str4 = jd.icD;
        final String str5 = jd.Jd;
        final String str6 = jd.NB;
        final String so = TextUtils.isEmpty(str) ? com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG() != null ? com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().so() : "" : str;
        if (TextUtils.isEmpty(str2)) {
            Ju.pvs("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            com.bytedance.sdk.component.adexpress.Jd.vG.pvs(new com.bytedance.sdk.component.so.so("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.pvs.icD.yiw.1
                @Override // java.lang.Runnable
                public void run() {
                    yiw.this.pvs(str2, str3, str4, str5, str6, so);
                }
            }, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pvs(String str, String str2, String str3, String str4, String str5, String str6) {
        if (pvs(str) != null) {
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                icD(str6, str, str3, str2, str4, str5);
            }
            return;
        } else if (TextUtils.isEmpty(str4)) {
            pvs(str2, str6, str);
        } else if (TextUtils.isEmpty(str3)) {
            pvs(str2, str6, str);
        } else {
            icD(str6, str, str3, str2, str4, str5);
        }
        boolean pvs2 = so.pvs(str5);
        if (!icD.NB() || pvs2) {
            NB.icD().pvs(true);
        }
    }

    private void pvs(String str, String str2, String str3) {
        JSONObject vG;
        if (TextUtils.isEmpty(str) || (vG = vG(str)) == null) {
            return;
        }
        String optString = vG.optString("md5");
        String optString2 = vG.optString("version");
        String optString3 = vG.optString("data");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.pvs.vG.icD pvs2 = new com.bytedance.sdk.component.adexpress.pvs.vG.icD().pvs(str2).icD(str3).vG(optString).Jd(str).NB(optString3).sUS(optString2).pvs(Long.valueOf(System.currentTimeMillis()));
        sUS.pvs().pvs(pvs2, false);
        icD();
        if (so.pvs(optString2)) {
            pvs2.sUS(optString2);
            NB.icD().pvs(true);
        }
    }

    private void icD(String str, String str2, String str3, String str4, String str5, String str6) {
        sUS.pvs().pvs(new com.bytedance.sdk.component.adexpress.pvs.vG.icD().pvs(str).icD(str2).vG(str3).Jd(str4).NB(str5).sUS(str6).pvs(Long.valueOf(System.currentTimeMillis())), false);
        icD();
    }

    public void pvs(Set<String> set) {
        try {
            sUS.pvs().pvs(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
