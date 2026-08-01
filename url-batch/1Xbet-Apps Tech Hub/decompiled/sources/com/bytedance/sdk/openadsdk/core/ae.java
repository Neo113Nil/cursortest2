package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.icD.icD;
import com.bytedance.sdk.openadsdk.multipro.icD.pvs;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: WebHelper.java */
/* loaded from: classes2.dex */
public class ae {
    private static boolean pvs = false;

    public static void pvs(boolean z) {
        pvs = z;
    }

    private static com.bytedance.sdk.openadsdk.Wyp.pvs.icD pvs(int i, com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        com.bytedance.sdk.openadsdk.Wyp.pvs.icD icd = new com.bytedance.sdk.openadsdk.Wyp.pvs.icD();
        icd.pvs(icD.pvs.pvs);
        icd.pvs(cRVar);
        icd.icD(jlb.pvs(cRVar));
        icd.pvs(i);
        icd.pvs(false);
        icd.icD(cRVar.jhZ());
        return icd;
    }

    public static boolean pvs(Context context, com.bytedance.sdk.openadsdk.core.model.cR cRVar, int i, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str, com.com.bytedance.overseas.sdk.pvs.vG vGVar, boolean z, int i2) {
        String pvs2;
        com.bytedance.sdk.openadsdk.icD.vG.pvs(pvs(-1, cRVar));
        if (context == null || cRVar == null || i == -1) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(pvs(1, cRVar));
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.qh Zm = cRVar.Zm();
        HashMap hashMap = new HashMap();
        if (cRVar.xyK() == 0) {
            hashMap.put("dpl_probability_jump", Boolean.valueOf(i2 >= 11));
        }
        if (i2 != 0 && cRVar.SJ()) {
            hashMap.put("dsp_click_type", Integer.valueOf(i2));
        }
        if (Zm != null && !TextUtils.isEmpty(Zm.pvs())) {
            if (pvs(context, cRVar, i, str, z, hashMap)) {
                com.bytedance.sdk.openadsdk.icD.vG.pvs(pvs(2, cRVar));
                return true;
            }
            if (Zm.vG() != 2 || cRVar.Ye() == 5 || cRVar.Ye() == 15) {
                if (Zm.vG() == 1 && !TextUtils.isEmpty(Zm.icD())) {
                    pvs2 = Zm.icD();
                } else {
                    pvs2 = pvs(cRVar);
                }
            } else if (vGVar != null) {
                if (!vGVar.pvs()) {
                    if (vGVar.NB()) {
                        com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str, "open_fallback_url", hashMap);
                        com.bytedance.sdk.openadsdk.icD.vG.pvs(pvs(3, cRVar));
                        return true;
                    }
                    pvs2 = pvs(Zm, cRVar);
                    com.bytedance.sdk.openadsdk.icD.vG.pvs(pvs(3, cRVar));
                } else {
                    com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str, "open_fallback_url", hashMap);
                    com.bytedance.sdk.openadsdk.icD.vG.pvs(pvs(3, cRVar));
                    return true;
                }
            } else {
                pvs2 = pvs(Zm, cRVar);
            }
            com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str, "open_fallback_url", hashMap);
        } else {
            pvs2 = pvs(cRVar);
        }
        String str2 = pvs2;
        Object[] objArr = new Object[2];
        if (cRVar.xyK() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
            String substring = str2.substring(str2.indexOf("?id=") + 4);
            com.bytedance.sdk.openadsdk.icD.vG.pvs(pvs(4, cRVar));
            return com.com.bytedance.overseas.sdk.pvs.icD.pvs(context, str2, substring, str, cRVar);
        }
        return pvs(context, cRVar, i, pAGNativeAd, pangleAd, str, z, str2);
    }

    private static String pvs(com.bytedance.sdk.openadsdk.core.model.qh qhVar, com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        if (!TextUtils.isEmpty(qhVar.icD())) {
            return qhVar.icD();
        }
        return pvs(cRVar);
    }

    private static String pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        if (!cRVar.SJ() || cRVar.ig() == null) {
            return cRVar.CjQ();
        }
        return cRVar.ig().Mxy();
    }

    public static boolean pvs(Context context, com.bytedance.sdk.openadsdk.core.model.cR cRVar, int i, String str, boolean z, Map<String, Object> map) {
        if (cRVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.qh Zm = cRVar.Zm();
        if (Zm == null || TextUtils.isEmpty(Zm.pvs())) {
            Jd.pvs(cRVar, str, Zm == null ? -1 : -2, Zm != null ? Zm.Jd() : null);
            return false;
        }
        Map<String, Object> hashMap = map == null ? new HashMap<>() : map;
        String pvs2 = Zm.pvs();
        Uri parse = Uri.parse(pvs2);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        if (jlb.so(context)) {
            jlb.icD icD = jlb.icD(context, intent);
            if (icD.icD > 0) {
                if (mnm.Jd().so()) {
                    jlb.pvs(cRVar, str);
                }
                ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                hashMap.put("can_query_install", 1);
                if (resolveActivity != null) {
                    hashMap.put("resolved_activity", resolveActivity.getPackageName() + "/" + resolveActivity.getClassName());
                }
                hashMap.put("matched_count", Integer.valueOf(icD.icD));
                hashMap.put(ImagesContract.URL, pvs2);
                if (icD.pvs != null) {
                    hashMap.put("target_component", icD.pvs.getPackageName() + "/" + icD.pvs.getClassName());
                    intent.setComponent(icD.pvs);
                }
                com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str, "open_url_app", hashMap);
                try {
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.icD.kj.pvs().pvs(hashMap).pvs(cRVar, str);
                    com.bytedance.sdk.openadsdk.icD.vG.pvs("dp_start_act_success", cRVar, str, hashMap);
                    return true;
                } catch (Exception e) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("exception", e.getMessage());
                        jSONObject.put("intent", intent.toString());
                        jSONObject.put("can_query_install", 1);
                    } catch (Exception unused) {
                    }
                    Jd.pvs(cRVar, str, -4, jSONObject);
                    if (!mnm.Jd().so()) {
                        pvs(context, cRVar.CjQ(), cRVar, i, str, z);
                        com.bytedance.sdk.component.utils.Ju.pvs("WebHelper", "openDetailPage() -> context.startActivity(intent) fail :", e);
                    }
                    return false;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("intent", intent.toString());
                jSONObject2.put("can_query_install", 1);
            } catch (Exception unused2) {
            }
            Jd.pvs(cRVar, str, -3, jSONObject2);
        } else {
            try {
                if (mnm.Jd().so()) {
                    jlb.pvs(cRVar, str);
                }
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                hashMap.put("can_query_install", 0);
                com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str, "open_url_app", hashMap);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.icD.kj.pvs().pvs(hashMap).pvs(cRVar, str);
                return true;
            } catch (Throwable unused3) {
            }
        }
        return false;
    }

    public static boolean pvs(Context context, com.bytedance.sdk.openadsdk.core.model.cR cRVar, int i, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str, boolean z, String str2) {
        if (!TextUtils.isEmpty(str2) || com.bytedance.sdk.openadsdk.core.model.rCZ.icD(cRVar)) {
            int jhZ = cRVar.jhZ();
            if (jhZ == 2 || jhZ == 8) {
                return com.bytedance.sdk.openadsdk.utils.cR.pvs(context, str2, cRVar, icD.pvs.pvs);
            }
            com.bytedance.sdk.component.utils.icD.pvs(context, pvs(context, str2, cRVar, i, pAGNativeAd, pangleAd, str, z), null);
            pvs = false;
            return true;
        }
        com.bytedance.sdk.openadsdk.icD.vG.pvs(pvs(5, cRVar));
        return false;
    }

    public static boolean pvs(Context context, String str, com.bytedance.sdk.openadsdk.core.model.cR cRVar, int i, String str2, boolean z) {
        try {
            context.startActivity(pvs(context, str, cRVar, i, (PAGNativeAd) null, (PangleAd) null, str2, z));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean icD(Context context, String str, com.bytedance.sdk.openadsdk.core.model.cR cRVar, int i, String str2, boolean z) {
        try {
            Intent pvs2 = pvs(context, str, cRVar, i, (PAGNativeAd) null, (PangleAd) null, str2, z, true);
            if (!(context instanceof Activity)) {
                pvs2.addFlags(268435456);
            }
            context.startActivity(pvs2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Intent pvs(Context context, String str, com.bytedance.sdk.openadsdk.core.model.cR cRVar, int i, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str2, boolean z) {
        return pvs(context, str, cRVar, i, pAGNativeAd, pangleAd, str2, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent pvs(Context context, String str, com.bytedance.sdk.openadsdk.core.model.cR cRVar, int i, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str2, boolean z, boolean z2) {
        Intent intent;
        if (!z2 && com.bytedance.sdk.openadsdk.core.model.rCZ.icD(cRVar) && (pAGNativeAd != 0 || pangleAd != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            intent.putExtra("ad_pending_download", pvs(cRVar, z));
            String NB = com.bytedance.sdk.openadsdk.core.model.rCZ.NB(cRVar);
            if (!TextUtils.isEmpty(NB)) {
                if (NB.contains("?")) {
                    str = NB + "&orientation=portrait";
                } else {
                    str = NB + "?orientation=portrait";
                }
            }
        } else {
            intent = (z2 || cRVar.jhZ() != 3 || !(cRVar.mnm() == 2 || (cRVar.mnm() == 1 && pvs)) || cRVar.pQ()) ? new Intent(context, (Class<?>) TTLandingPageActivity.class) : new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        }
        intent.putExtra(ImagesContract.URL, str);
        intent.putExtra("gecko_id", cRVar.tQ());
        intent.putExtra("web_title", cRVar.qd());
        intent.putExtra("sdk_version", BuildConfig.VERSION_CODE);
        intent.putExtra("adid", cRVar.neB());
        intent.putExtra("log_extra", cRVar.HWd());
        com.bytedance.sdk.openadsdk.multipro.icD.pvs pvsVar = null;
        intent.putExtra("icon_url", cRVar.ea() == null ? null : cRVar.ea().pvs());
        intent.putExtra("event_tag", str2);
        intent.putExtra(FirebaseAnalytics.Param.SOURCE, i);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, cRVar.wjr().toString());
        } else {
            OT.pvs().sUS();
            OT.pvs().pvs(cRVar);
        }
        if (cRVar.Ye() == 5 || cRVar.Ye() == 15 || cRVar.Ye() == 50) {
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof pvs.InterfaceC0092pvs) {
                    pvsVar = ((pvs.InterfaceC0092pvs) pAGNativeAd).sUS();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.pvs) {
                    pvsVar = ((com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.pvs) pAGNativeAd).icD();
                }
                if (pvsVar != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, pvsVar.pvs().toString());
                }
            }
            if ((pangleAd instanceof com.bytedance.sdk.openadsdk.core.bannerexpress.vG) && (pvsVar = ((com.bytedance.sdk.openadsdk.core.bannerexpress.vG) pangleAd).vG()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, pvsVar.pvs().toString());
            }
            if (pvsVar != null) {
                intent.putExtra("video_is_auto_play", pvsVar.Jd);
                if (com.bytedance.sdk.component.utils.Ju.Jd()) {
                    pvsVar.pvs().toString();
                }
            }
        }
        return intent;
    }

    private static boolean pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar, boolean z) {
        if (z && cRVar != null && cRVar.jhZ() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.rCZ.icD(cRVar);
        }
        return false;
    }
}
