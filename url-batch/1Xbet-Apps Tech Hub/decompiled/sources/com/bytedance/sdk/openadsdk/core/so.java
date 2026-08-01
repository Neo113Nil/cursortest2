package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.bannerexpress.pvs;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.utils.jlb;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GlobalInfo.java */
/* loaded from: classes2.dex */
public class so {
    public static final Set<String> icD = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.so.1
        {
            add("8025677");
            add("5001121");
        }
    };
    public static kj pvs = null;
    private static boolean vA = false;
    private Integer IP;
    private String Jd;
    private Bitmap Ju;
    private String Mxy;
    private String NB;
    private volatile ConcurrentHashMap<String, pvs.InterfaceC0073pvs> OT;
    private int Wyp;
    private Integer bNS;
    private int cR;
    private boolean kj;
    private Integer mnm;
    private boolean qh;
    private com.bytedance.sdk.openadsdk.core.video.icD.vG rCZ;
    private int sUS;
    private String so;
    private String uc;
    private boolean vG;
    private boolean yiw;
    private boolean zM;

    public boolean bNS() {
        return true;
    }

    public static void pvs(kj kjVar) {
        pvs = kjVar;
    }

    public boolean pvs() {
        return this.zM;
    }

    public void pvs(boolean z) {
        this.zM = z;
    }

    private so() {
        this.vG = false;
        this.Wyp = 0;
        this.qh = true;
        this.kj = false;
        this.Ju = null;
        this.IP = null;
        this.bNS = null;
        this.mnm = null;
        this.cR = 0;
        this.OT = null;
        try {
            com.bykv.vk.openvk.component.video.api.sUS.pvs.pvs(mnm.pvs());
        } catch (Throwable unused) {
        }
    }

    public static so icD() {
        return pvs.pvs;
    }

    /* compiled from: GlobalInfo.java */
    private static class pvs {
        private static final so pvs = new so();
    }

    public boolean vG() {
        return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_file", "sdk_activate_init", true);
    }

    public void icD(boolean z) {
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_file", "sdk_activate_init", Boolean.valueOf(z));
    }

    public String Jd() {
        if (TextUtils.isEmpty(this.Jd)) {
            String pvs2 = pvs("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(pvs2)) {
                this.Jd = pvs2;
            }
        }
        return this.Jd;
    }

    public void pvs(String str) {
        sUS(str);
        this.Jd = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        pvs("app_id", str);
        com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Jd(7);
    }

    public String NB() {
        if (TextUtils.isEmpty(this.NB)) {
            this.NB = pvs(mnm.pvs());
        }
        return this.NB;
    }

    private String pvs(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public void pvs(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_icon_id", "icon_id", Integer.valueOf(i));
        }
        this.sUS = i;
    }

    public int sUS() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_icon_id", "icon_id", 0);
        }
        return this.sUS;
    }

    public void icD(final int i) {
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.IP;
            if (num == null || num.intValue() != i) {
                this.IP = Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.ae.NB()) {
                    pvs(num, i);
                } else {
                    Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.so.2
                        @Override // java.lang.Runnable
                        public void run() {
                            so.this.pvs(num, i);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(Integer num, int i) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "sdk_coppa", -1) != i) {
                com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "sdk_coppa", Integer.valueOf(i));
                com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(3, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "sdk_coppa", Integer.valueOf(i));
        com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(3, true);
    }

    public int yiw() {
        Integer num = this.IP;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "sdk_coppa", -1);
    }

    public int so() {
        Integer num = this.bNS;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "tt_gdpr", -1);
    }

    public void vG(final int i) {
        if (i == 1) {
            i = 0;
        } else if (i == 0) {
            i = 1;
        }
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.bNS;
            if (num == null || num.intValue() != i) {
                this.bNS = Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.ae.NB()) {
                    icD(num, i);
                } else {
                    Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.so.3
                        @Override // java.lang.Runnable
                        public void run() {
                            so.this.icD(num, i);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(Integer num, int i) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "tt_gdpr", -1) != i) {
                com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "tt_gdpr", Integer.valueOf(i));
                com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(4, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "tt_gdpr", Integer.valueOf(i));
        com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(4, true);
    }

    public void Jd(int i) {
        if (i != 0 && i != 1) {
            i = -99;
        }
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "global_coppa", Integer.valueOf(i));
        this.cR = i;
    }

    public int Mxy() {
        int pvs2 = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "global_coppa", -99);
        this.cR = pvs2;
        if (pvs2 == -99) {
            this.cR = yiw();
        }
        return this.cR;
    }

    public boolean Wyp() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_file", "is_paid", false);
        }
        return this.yiw;
    }

    public String qh() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD("sp_global_file", "keywords", null);
        }
        return this.so;
    }

    public String kj() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD("sp_global_file", "extra_data", null);
        }
        return this.Mxy;
    }

    public void icD(final String str) {
        yiw(str);
        if (com.bytedance.sdk.openadsdk.utils.ae.NB()) {
            Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.so.4
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_file", "extra_data", str);
                    }
                }
            });
        } else if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_file", "extra_data", str);
        }
        this.Mxy = str;
    }

    public void NB(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_file", "title_bar_theme", Integer.valueOf(i));
        }
        this.Wyp = i;
    }

    public int Ju() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_file", "title_bar_theme", 0);
        }
        return this.Wyp;
    }

    private static void sUS(String str) {
        kj kjVar;
        if (TextUtils.isEmpty(str) && (kjVar = pvs) != null) {
            kjVar.fail(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.GlobalInfo", "appid cannot be empty");
    }

    private static void yiw(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        kj kjVar = pvs;
        if (kjVar != null) {
            kjVar.fail(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public com.bytedance.sdk.openadsdk.core.video.icD.vG IP() {
        if (this.rCZ == null) {
            this.rCZ = new com.bytedance.sdk.openadsdk.core.video.icD.vG(10, 8);
        }
        return this.rCZ;
    }

    public Bitmap mnm() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return com.bytedance.sdk.component.utils.Jd.pvs(com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD("sp_global_file", "pause_icon", null));
        }
        return this.Ju;
    }

    public boolean vA() {
        return icD.contains(this.Jd);
    }

    public boolean cR() {
        return "com.union_test.internationad".equals(jlb.NB());
    }

    public String zM() {
        if (!TextUtils.isEmpty(this.uc)) {
            return this.uc;
        }
        String pvs2 = com.bytedance.sdk.openadsdk.utils.Mxy.pvs();
        this.uc = pvs2;
        if (!TextUtils.isEmpty(pvs2)) {
            return this.uc;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.Mxy.pvs(valueOf);
        this.uc = valueOf;
        return valueOf;
    }

    private static JSONObject so(String str) {
        String icD2 = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD("sp_global_file", str, null);
        if (TextUtils.isEmpty(icD2)) {
            return null;
        }
        try {
            return new JSONObject(icD2);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public static void pvs(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.GlobalInfo", e.getMessage());
        }
    }

    public static String pvs(String str, long j) {
        JSONObject so;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            so = so(str);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.GlobalInfo", e.getMessage());
        }
        if (so == null) {
            return null;
        }
        if (System.currentTimeMillis() - so.getLong("time") <= j) {
            return so.getString("value");
        }
        return null;
    }

    public int uc() {
        Integer num = this.mnm;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "global_ccpa", -1);
    }

    public void sUS(final int i) {
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.mnm;
            if (num == null || num.intValue() != i) {
                this.mnm = Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.ae.NB()) {
                    vG(num, i);
                } else {
                    Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.so.5
                        @Override // java.lang.Runnable
                        public void run() {
                            so.this.vG(num, i);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG(Integer num, int i) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "global_ccpa", -1) != i) {
                com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "global_ccpa", Integer.valueOf(i));
                com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(5, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "global_ccpa", Integer.valueOf(i));
        com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(5, true);
    }

    public pvs.InterfaceC0073pvs vG(String str) {
        if (this.OT == null || str == null) {
            return null;
        }
        return this.OT.get(str);
    }

    public void pvs(String str, pvs.InterfaceC0073pvs interfaceC0073pvs) {
        if (TextUtils.isEmpty(str) || interfaceC0073pvs == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            TTDislikeListView.pvs(6, str, interfaceC0073pvs);
            return;
        }
        if (this.OT == null) {
            synchronized (so.class) {
                if (this.OT == null) {
                    this.OT = new ConcurrentHashMap<>();
                }
            }
        }
        this.OT.put(str, interfaceC0073pvs);
    }

    public void Jd(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            TTDislikeListView.pvs(6, str);
        } else if (this.OT != null) {
            this.OT.remove(str);
        }
    }

    public void rCZ() {
        try {
            if (this.OT == null || this.OT.size() != 0) {
                return;
            }
            this.OT = null;
        } catch (NullPointerException e) {
            Object[] objArr = new Object[2];
            e.getMessage();
        }
    }

    public void vG(boolean z) {
        this.vG = z;
    }

    public static boolean OT() {
        return vA;
    }

    public static void ny() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            vA = true;
        }
    }

    public static boolean NB(String str) {
        return (!com.bytedance.sdk.openadsdk.utils.OT.pvs || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }
}
