package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.fs;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.fb.fs;
import com.bytedance.sdk.openadsdk.kw.zn.zmn;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class nu {
    private static boolean zmn;

    public static void zmn(boolean z) {
        zmn = z;
    }

    private static com.bytedance.sdk.openadsdk.cyb.zmn.fs zmn(int i, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        com.bytedance.sdk.openadsdk.cyb.zmn.fs fsVar = new com.bytedance.sdk.openadsdk.cyb.zmn.fs();
        fsVar.zmn(fs.zmn.zmn);
        fsVar.zmn(nqiVar);
        fsVar.fs(com.bytedance.sdk.openadsdk.utils.oub.zmn(nqiVar));
        fsVar.zmn(i);
        fsVar.zmn(false);
        fsVar.fs(nqiVar.va());
        return fsVar;
    }

    public static boolean zmn(Context context, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, int i, @Nullable PAGNativeAd pAGNativeAd, @Nullable com.bytedance.sdk.openadsdk.core.fb.zmn zmnVar, String str, @Nullable com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn znVar, boolean z, int i2) {
        String zmn2;
        com.bytedance.sdk.openadsdk.fb.zn.zmn(zmn(-1, nqiVar));
        if (context == null || nqiVar == null || i == -1) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(zmn(1, nqiVar));
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.mw my = nqiVar.my();
        HashMap hashMap = new HashMap();
        if (nqiVar.qj() == 0) {
            hashMap.put("dpl_probability_jump", Boolean.valueOf(i2 >= 11));
        }
        if (i2 != 0 && nqiVar.ch()) {
            hashMap.put("dsp_click_type", Integer.valueOf(i2));
        }
        if (my != null && !TextUtils.isEmpty(my.zmn())) {
            if (zmn(context, nqiVar, i, str, z, hashMap)) {
                com.bytedance.sdk.openadsdk.fb.zn.zmn(zmn(2, nqiVar));
                com.bytedance.sdk.openadsdk.utils.btk.zmn(nqiVar);
                return true;
            }
            if (my.zn() != 2 || nqiVar.zq() == 5 || nqiVar.zq() == 15) {
                if (my.zn() == 1 && !TextUtils.isEmpty(my.fs())) {
                    zmn2 = my.fs();
                } else {
                    zmn2 = zmn(my, nqiVar);
                }
            } else if (znVar != null) {
                if (!znVar.fb(nqiVar)) {
                    if (znVar.zn(nqiVar)) {
                        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, "open_fallback_url", hashMap);
                        com.bytedance.sdk.openadsdk.fb.zn.zmn(zmn(3, nqiVar));
                        com.bytedance.sdk.openadsdk.utils.btk.zmn(nqiVar);
                        return true;
                    }
                    zmn2 = zmn(my, nqiVar);
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(zmn(3, nqiVar));
                } else {
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, "open_fallback_url", hashMap);
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(zmn(3, nqiVar));
                    com.bytedance.sdk.openadsdk.utils.btk.zmn(nqiVar);
                    return true;
                }
            } else {
                zmn2 = zmn(my, nqiVar);
            }
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, "open_fallback_url", hashMap);
        } else {
            zmn2 = zmn(nqiVar);
        }
        String str2 = zmn2;
        if (nqiVar.qj() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
            String substring = str2.substring(str2.indexOf("?id=") + 4);
            com.bytedance.sdk.openadsdk.fb.zn.zmn(zmn(4, nqiVar));
            boolean zmn3 = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs.zmn(context, str2, substring, str, nqiVar);
            if (zmn3) {
                com.bytedance.sdk.openadsdk.utils.btk.zmn(nqiVar);
            }
            return zmn3;
        }
        boolean zmn4 = zmn(context, nqiVar, i, pAGNativeAd, zmnVar, str, z, str2);
        if (zmn4) {
            com.bytedance.sdk.openadsdk.utils.btk.zmn(nqiVar);
        }
        return zmn4;
    }

    private static String zmn(com.bytedance.sdk.openadsdk.core.model.mw mwVar, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (!TextUtils.isEmpty(mwVar.fs())) {
            return mwVar.fs();
        }
        return zmn(nqiVar);
    }

    private static String zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (!nqiVar.ch() || nqiVar.bm() == null) {
            return nqiVar.pl();
        }
        return nqiVar.bm().bvs();
    }

    public static boolean zmn(Context context, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, int i, String str, boolean z, Map<String, Object> map) {
        if (nqiVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.mw my = nqiVar.my();
        if (my == null || TextUtils.isEmpty(my.zmn())) {
            btk.zmn(nqiVar, str, my == null ? -1 : -2, my != null ? my.fb() : null);
            return false;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        return com.bytedance.sdk.openadsdk.phc.zmn.zmn.zmn.zmn(context, my.zmn(), nqiVar, i, map, z);
    }

    public static boolean zmn(Context context, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, int i, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.fb.zmn zmnVar, String str, boolean z, String str2) {
        if (!TextUtils.isEmpty(str2) || com.bytedance.sdk.openadsdk.core.model.am.fs(nqiVar)) {
            int va = nqiVar.va();
            if (va == 2 || va == 8) {
                return com.bytedance.sdk.openadsdk.utils.uqh.zmn(context, str2, nqiVar, fs.zmn.zmn, false);
            }
            com.bytedance.sdk.component.utils.fs.zmn(context, zmn(context, str2, nqiVar, i, pAGNativeAd, zmnVar, str, z), null);
            zmn = false;
            return true;
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(zmn(5, nqiVar));
        return false;
    }

    public static void zmn(Context context, String str, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, int i, String str2, boolean z) {
        com.bytedance.sdk.component.utils.fs.zmn(context, zmn(context, str, nqiVar, i, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.fb.zmn) null, str2, z), null);
    }

    public static void zmn(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, int i, final String str2, boolean z, iqz iqzVar) {
        com.bytedance.sdk.component.utils.fs.zmn(context, zmn(context, str, nqiVar, i, null, null, str2, z, true, iqzVar), new fs.InterfaceC0135fs() { // from class: com.bytedance.sdk.openadsdk.core.nu.1
            @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
            public void zmn() {
                com.bytedance.sdk.openadsdk.fb.zn.zmn(com.bytedance.sdk.openadsdk.core.model.nqi.this, str2, 3, (JSONObject) null);
            }

            @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
            public void zmn(Throwable th) {
                com.bytedance.sdk.openadsdk.fb.zn.zmn(com.bytedance.sdk.openadsdk.core.model.nqi.this, str2, -2, (JSONObject) null);
            }
        });
    }

    private static Intent zmn(Context context, String str, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, int i, @Nullable PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.fb.zmn zmnVar, String str2, boolean z) {
        return zmn(context, str, nqiVar, i, pAGNativeAd, zmnVar, str2, z, false, null);
    }

    public static boolean zmn(Context context, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str, int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", i2);
            com.bytedance.sdk.openadsdk.fb.zn.hhw(nqiVar, str, jSONObject);
            Intent zmn2 = zmn(context, nqiVar, str, i);
            if (zmn2 == null) {
                return false;
            }
            return com.bytedance.sdk.component.utils.fs.zmn(context, zmn2, null, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent zmn(Context context, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str, int i) {
        if (context == null || nqiVar == null || !com.bytedance.sdk.openadsdk.core.model.am.fs(nqiVar)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
        intent.putExtra("ad_pending_download", false);
        String rc = com.bytedance.sdk.openadsdk.core.model.am.rc(nqiVar);
        if (!TextUtils.isEmpty(rc)) {
            if (rc.contains("?")) {
                rc = rc + "&orientation=portrait";
            } else {
                rc = rc + "?orientation=portrait";
            }
        }
        nqiVar.btk(rc);
        nqiVar.hhw(str);
        nqiVar.fb(i);
        intent.putExtra("meta_index", am.zmn().zmn(nqiVar));
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent zmn(Context context, String str, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, int i, @Nullable PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.fb.zmn zmnVar, String str2, boolean z, boolean z2, iqz iqzVar) {
        Intent intent;
        if (!z2 && com.bytedance.sdk.openadsdk.core.model.am.fs(nqiVar) && (pAGNativeAd != 0 || zmnVar != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            boolean zmn2 = zmn(nqiVar, z);
            intent.putExtra("ad_pending_download", zmn2);
            String rc = com.bytedance.sdk.openadsdk.core.model.am.rc(nqiVar);
            if (!TextUtils.isEmpty(rc)) {
                if (rc.contains("?")) {
                    str = rc + "&orientation=portrait";
                } else {
                    str = rc + "?orientation=portrait";
                }
            }
            nqiVar.fs(zmn2);
        } else if (!z2 && nqiVar.va() == 3 && ((nqiVar.cd() == 2 || (nqiVar.cd() == 1 && zmn)) && !nqiVar.omy())) {
            intent = new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        } else if (com.bytedance.sdk.openadsdk.utils.fs.btk() && kgc.fb().am()) {
            intent = new Intent(context, (Class<?>) IABLandingPageActivity.class);
            intent.putExtra("scene", 0);
        } else {
            intent = new Intent(context, (Class<?>) TTLandingPageActivity.class);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (z2 && iqzVar != null) {
            nqiVar.iqz(iqzVar.fs());
            nqiVar.zmn(iqzVar.zmn());
        }
        nqiVar.btk(str);
        nqiVar.hhw(str2);
        nqiVar.fb(i);
        intent.putExtra("meta_index", am.zmn().zmn(nqiVar));
        if (com.bytedance.sdk.openadsdk.utils.fs.btk() && kgc.fb().am()) {
            intent.putExtra("landing_url", nqiVar.rc());
        }
        if (nqiVar.zq() == 5 || nqiVar.zq() == 15 || nqiVar.zq() == 50) {
            com.bytedance.sdk.openadsdk.kw.zn.zmn zmnVar2 = null;
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof zmn.InterfaceC0200zmn) {
                    zmnVar2 = ((zmn.InterfaceC0200zmn) pAGNativeAd).hhw();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.zmn.fs.zmn.fs) {
                    zmnVar2 = ((com.bytedance.sdk.openadsdk.zmn.fs.zmn.fs) pAGNativeAd).fs();
                }
                if (zmnVar2 != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, zmnVar2.zmn().toString());
                }
            }
            if (zmnVar != null && zmnVar.fs() && (zmnVar2 = zmnVar.zn()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, zmnVar2.zmn().toString());
            }
            if (zmnVar2 != null) {
                intent.putExtra("video_is_auto_play", zmnVar2.fb);
                if (com.bytedance.sdk.component.utils.cn.zn()) {
                    zmnVar2.zmn().toString();
                }
            }
        }
        return intent;
    }

    private static boolean zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, boolean z) {
        if (z && nqiVar != null && nqiVar.va() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.am.fs(nqiVar);
        }
        return false;
    }
}
