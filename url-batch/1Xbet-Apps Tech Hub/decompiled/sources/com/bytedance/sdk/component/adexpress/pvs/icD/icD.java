package com.bytedance.sdk.component.adexpress.pvs.icD;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.Jd.so;
import com.bytedance.sdk.component.adexpress.pvs.vG.pvs;
import com.bytedance.sdk.component.utils.Ju;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TTDynamic.java */
/* loaded from: classes.dex */
public class icD {
    static Object pvs = new Object();

    public static void pvs() {
        NB.icD();
    }

    public static void icD() {
        try {
            so.Jd();
            File so = NB.so();
            if (so == null || !so.exists()) {
                return;
            }
            if (so.getParentFile() != null) {
                com.bytedance.sdk.component.utils.sUS.vG(so.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.sUS.vG(so);
            }
        } catch (Throwable unused) {
        }
    }

    public static String vG() {
        return sUS.vG();
    }

    public static com.bytedance.sdk.component.adexpress.pvs.vG.icD pvs(String str) {
        return yiw.pvs().pvs(str);
    }

    public static void pvs(com.bytedance.sdk.component.adexpress.pvs.vG.Jd jd) {
        yiw.pvs().pvs(jd, jd.sUS);
    }

    public static Set<String> icD(String str) {
        return yiw.pvs().icD(str);
    }

    public static com.bytedance.sdk.component.adexpress.pvs.vG.icD vG(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.pvs.vG.icD pvs2 = yiw.pvs().pvs(str);
        if (pvs2 != null) {
            pvs2.pvs(Long.valueOf(System.currentTimeMillis()));
            pvs(pvs2);
        }
        return pvs2;
    }

    private static void pvs(final com.bytedance.sdk.component.adexpress.pvs.vG.icD icd) {
        com.bytedance.sdk.component.adexpress.Jd.vG.pvs(new com.bytedance.sdk.component.so.so("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.pvs.icD.icD.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (icD.pvs) {
                    sUS.pvs().pvs(icd, true);
                }
            }
        }, 10);
    }

    public static com.bytedance.sdk.component.adexpress.pvs.vG.pvs Jd() {
        return NB.icD().sUS();
    }

    @Deprecated
    private static String sUS() {
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs Jd = Jd();
        if (Jd == null) {
            return null;
        }
        return Jd.Jd();
    }

    public static String Jd(String str) {
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar;
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs Jd = Jd();
        if (Jd == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            Map<String, com.bytedance.sdk.component.adexpress.pvs.vG.pvs> pvs2 = Jd.pvs();
            if (pvs2 == null || pvs2.size() <= 0 || (pvsVar = pvs2.get(str)) == null) {
                return null;
            }
            return pvsVar.Jd();
        }
        return sUS();
    }

    public static boolean NB() {
        return NB.icD().NB();
    }

    public static pvs pvs(String str, so.pvs pvsVar, String str2, String str3) {
        File file;
        pvs pvsVar2 = new pvs();
        if (TextUtils.isEmpty(str3)) {
            file = null;
        } else {
            file = icD(str3, str);
            if (file != null) {
                pvsVar2.pvs(1);
            }
        }
        if (file == null && (file = yiw(str)) != null) {
            pvsVar2.pvs(3);
        }
        if (file == null && (file = sUS(str)) != null) {
            pvsVar2.pvs(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!pvs(str, str3)) {
                pvsVar2.pvs(4);
            }
        } else if (!NB(str)) {
            pvsVar2.pvs(6);
        }
        pvsVar2.icD();
        if (file != null) {
            try {
                pvsVar2.pvs(new WebResourceResponse(pvsVar.pvs(), "utf-8", new FileInputStream(file)));
            } catch (Throwable th) {
                Ju.pvs("TTDynamic", "get html WebResourceResponse error", th);
            }
        }
        return pvsVar2;
    }

    private static boolean pvs(String str, String str2) {
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs Jd;
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar;
        if (!NB() || (Jd = Jd()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.pvs.vG.pvs> pvs2 = Jd.pvs();
        if (pvs2.size() == 0 || (pvsVar = pvs2.get(str2)) == null) {
            return false;
        }
        for (pvs.C0043pvs c0043pvs : pvsVar.sUS()) {
            if (c0043pvs != null && TextUtils.equals(str, c0043pvs.pvs())) {
                return true;
            }
        }
        return false;
    }

    private static boolean NB(String str) {
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs Jd;
        List<pvs.C0043pvs> sUS;
        if (!NB() || (Jd = Jd()) == null || (sUS = Jd.sUS()) == null) {
            return false;
        }
        for (pvs.C0043pvs c0043pvs : sUS) {
            if (c0043pvs != null && TextUtils.equals(str, c0043pvs.pvs())) {
                return true;
            }
        }
        return false;
    }

    private static File sUS(String str) {
        if (!NB()) {
            return null;
        }
        for (pvs.C0043pvs c0043pvs : Jd().sUS()) {
            if (c0043pvs.pvs() != null && c0043pvs.pvs().equals(str)) {
                File file = new File(NB.so(), com.bytedance.sdk.component.utils.NB.pvs(c0043pvs.pvs()));
                String pvs2 = com.bytedance.sdk.component.utils.NB.pvs(file);
                if (c0043pvs.icD() == null || !c0043pvs.icD().equals(pvs2)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    private static File yiw(String str) {
        List<Pair<String, String>> icD;
        pvs.icD NB = Jd().NB();
        if (NB == null || (icD = NB.icD()) == null || icD.size() <= 0) {
            return null;
        }
        for (Pair<String, String> pair : icD) {
            if (pair.second != null && ((String) pair.second).equals(str)) {
                return new File(NB.so(), (String) pair.first);
            }
        }
        return null;
    }

    private static File icD(String str, String str2) {
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar;
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs Jd = Jd();
        if (Jd == null || !NB()) {
            return null;
        }
        Map<String, com.bytedance.sdk.component.adexpress.pvs.vG.pvs> pvs2 = Jd.pvs();
        if (pvs2.size() == 0 || (pvsVar = pvs2.get(str)) == null) {
            return null;
        }
        for (pvs.C0043pvs c0043pvs : pvsVar.sUS()) {
            if (c0043pvs.pvs() != null && c0043pvs.pvs().equals(str2)) {
                File file = new File(NB.so(), com.bytedance.sdk.component.utils.NB.pvs(c0043pvs.pvs()));
                String pvs3 = com.bytedance.sdk.component.utils.NB.pvs(file);
                if (c0043pvs.icD() == null || !c0043pvs.icD().equals(pvs3)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    public static boolean pvs(JSONObject jSONObject) {
        Object opt;
        return (jSONObject == null || (opt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) ? false : true;
    }

    public static boolean icD(JSONObject jSONObject) {
        Object opt;
        if (jSONObject == null) {
            return false;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject == null || (opt = optJSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
