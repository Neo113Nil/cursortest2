package com.bytedance.sdk.openadsdk.phc.zmn.zmn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.cyb;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.hhw;
import com.bytedance.sdk.openadsdk.core.model.mw;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.model.zak;
import com.bytedance.sdk.openadsdk.fb.fs;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.btk;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.uqh;
import com.facebook.share.internal.ShareConstants;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import io.bidmachine.util.network.NetworkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class fs implements zn {
    protected int fs;
    protected String zmn;
    private final WeakReference<Context> zn;

    private static boolean fs() {
        return false;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.u);
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.u);
        p0.startActivity(p1);
    }

    public fs(Context context, String str) {
        this.zn = new WeakReference<>(context);
        this.zmn = str;
        "====tag===".concat(String.valueOf(str));
        if (kgc.zmn() == null) {
            kgc.fs(context);
        }
    }

    public static boolean zmn(Context context, String str, String str2, String str3, nqi nqiVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, str3, "store_open", (JSONObject) null);
                btk.zmn(nqiVar);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri parse = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(parse);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(parse);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent3);
                        com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, str3, "store_open", (JSONObject) null);
                        btk.zmn(nqiVar);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th);
            }
        }
        return false;
    }

    public static boolean zmn(nqi nqiVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent zmn;
        if (nqiVar != null && nqiVar.tuj() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (zmn = oub.zmn(context, str)) == null) {
                return false;
            }
            zmn.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                zmn.addFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, zmn);
            if (map == null) {
                map = new HashMap<>();
            }
            if (nqiVar != null && nqiVar.qj() == 0) {
                map.put("auto_click", Boolean.valueOf(!nqiVar.kw()));
            }
            map.put("can_query_install", Integer.valueOf(fs() ? 1 : 0));
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn
    public void zmn(int i) {
        this.fs = i;
    }

    public boolean zmn(Context context, nqi nqiVar, String str, String str2) {
        return zmn(context, str, str2, this.zmn, nqiVar);
    }

    protected Context zmn() {
        WeakReference<Context> weakReference = this.zn;
        return (weakReference == null || weakReference.get() == null) ? kgc.zmn() : this.zn.get();
    }

    @Override // com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn
    public void zmn(final nqi nqiVar) {
        if (zmn() == null || nqiVar == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("gp_downloader_async", 0) == 1) {
            nu.bvs().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs.1
                @Override // java.lang.Runnable
                public void run() {
                    fs.this.btk(nqiVar);
                }
            });
        } else {
            btk(nqiVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btk(nqi nqiVar) {
        if (fs(nqiVar)) {
            nqiVar.hhw(true);
            btk.zmn(nqiVar);
            return;
        }
        if (fb(nqiVar)) {
            nqiVar.hhw(true);
            btk.zmn(nqiVar);
            return;
        }
        if (zmn(nqiVar, false)) {
            btk.zmn(nqiVar);
            return;
        }
        if (zn(nqiVar)) {
            nqiVar.hhw(true);
            btk.zmn(nqiVar);
        } else {
            if (nqiVar.pw() != null || nqiVar.pl() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.nu.zmn(zmn(), nqiVar.pl(), nqiVar, oub.zmn(this.zmn), this.zmn, true);
            nqiVar.hhw(true);
            btk.zmn(nqiVar);
        }
    }

    public boolean fs(nqi nqiVar) {
        mw my = nqiVar.my();
        if (my == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        zmn(nqiVar, hashMap);
        if (zmn.zmn(zmn(), my.zmn(), nqiVar, oub.fs(nqiVar), hashMap, true)) {
            return true;
        }
        if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("dpl_fallback_enable", 0) != 1 || !uqh.zmn(zmn(), my.fs(), nqiVar, fs.zmn.zmn, true)) {
            return false;
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, this.zmn, "open_fallback_url", hashMap);
        return true;
    }

    private void zmn(nqi nqiVar, Map<String, Object> map) {
        if (nqiVar != null && nqiVar.qj() == 0) {
            map.put("auto_click", Boolean.valueOf(!nqiVar.kw()));
        }
        if (nqiVar != null && nqiVar.qj() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.fs >= 11));
        }
        map.put("can_query_install", Integer.valueOf(fs() ? 1 : 0));
    }

    @Override // com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn
    public boolean zn(nqi nqiVar) {
        hhw pw;
        if (nqiVar == null || (pw = nqiVar.pw()) == null) {
            return false;
        }
        return zmn(zmn(), nqiVar, pw.zmn(), pw.zn());
    }

    @Override // com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn
    public boolean fb(nqi nqiVar) {
        hhw pw;
        if (nqiVar == null || (pw = nqiVar.pw()) == null || nqiVar.tuj() == 0) {
            return false;
        }
        String zn = pw.zn();
        if (TextUtils.isEmpty(zn)) {
            return false;
        }
        return zmn(nqiVar, zn, zmn(), this.zmn, new HashMap());
    }

    public boolean zmn(nqi nqiVar, boolean z) {
        return fs(nqiVar, zmn(), z);
    }

    private static void zmn(final JSONObject jSONObject, nqi nqiVar, String str, final int i) {
        try {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, str, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs.2
                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject zmn() {
                    try {
                        jSONObject.put("status", i);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static boolean zmn(nqi nqiVar, Context context, boolean z) {
        if (nqiVar != null && nqiVar.rvx() != null && nqiVar.rvx().bvs() && !TextUtils.isEmpty(nqiVar.rvx().iv()) && context != null) {
            try {
                zak rvx = nqiVar.rvx();
                String zmn = oub.zmn(nqiVar);
                final JSONObject rc = rvx.rc();
                rc.put("from_web", z ? 1 : 0);
                rc.put("is_w2a", nqiVar.kgc());
                com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, zmn, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs.3
                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject zmn() {
                        try {
                            rc.put("status", 0);
                        } catch (Throwable unused) {
                        }
                        return rc;
                    }
                });
                Intent zmn2 = zmn(context, rvx);
                if (zmn2 == null) {
                    zmn(rc, nqiVar, zmn, -2);
                    return false;
                }
                if (context instanceof Activity) {
                    if (!uqh.zmn((Activity) context)) {
                        context = null;
                    }
                } else {
                    Activity fs = cyb.zmn().btk().fs();
                    if (fs != null && uqh.zmn(fs)) {
                        context = fs;
                    }
                }
                if (!(context instanceof Activity)) {
                    zmn(rc, nqiVar, zmn, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || zmn2.resolveActivity(packageManager) == null) {
                    zmn(rc, nqiVar, zmn, -4);
                    return false;
                }
                try {
                    safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221((Activity) context, zmn2, 0);
                    zmn(rc, nqiVar, zmn, 1);
                    return true;
                } catch (Throwable unused) {
                    zmn(rc, nqiVar, zmn, -3);
                    return false;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    private static Intent zmn(Context context, zak zakVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String fb = zakVar.fb();
            if (!TextUtils.isEmpty(fb)) {
                intent.setPackage(fb);
            } else {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(zakVar.iv()));
            boolean z = true;
            if (zakVar.fs() != 1) {
                z = false;
            }
            intent.putExtra("overlay", z);
            if (TextUtils.isEmpty(zakVar.zn())) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", zakVar.zn());
            }
            zakVar.zmn(intent);
            return intent;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static boolean fs(nqi nqiVar, Context context, boolean z) {
        String zn;
        IPBroadcastReceiver zmn;
        if (nqiVar != null && context != null) {
            try {
                zak rvx = nqiVar.rvx();
                if (rvx != null && !TextUtils.isEmpty(rvx.iv())) {
                    if (rvx.bvs() && zmn(nqiVar, context, z)) {
                        return true;
                    }
                    if (rvx.nps() || rvx.zg()) {
                        if (nqiVar.kgc() == 1) {
                            zn = rvx.zmn();
                        } else {
                            zn = (nqiVar.pw() == null || TextUtils.isEmpty(nqiVar.pw().zn())) ? null : nqiVar.pw().zn();
                        }
                        if (!TextUtils.isEmpty(zn) && (zmn = IPBroadcastReceiver.zmn(context, nqiVar)) != null) {
                            zmn.zmn(zn, nqiVar);
                        }
                    }
                    final boolean zmn2 = zmn.zmn(context, rvx.iv(), nqiVar, oub.fs(nqiVar), zmn(nqiVar, z, rvx), true);
                    nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs.4
                        @Override // java.lang.Runnable
                        public void run() {
                            if (zmn2) {
                                iv.zmn("oem_store", "1");
                            } else {
                                iv.zmn("oem_store", "-2");
                            }
                        }
                    });
                    return zmn2;
                }
            } catch (Throwable th) {
                iqz.zn("GPDownLoader", th.getMessage());
            }
        }
        return false;
    }

    @NonNull
    private static Map<String, Object> zmn(nqi nqiVar, boolean z, zak zakVar) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", zakVar.hhw());
            jSONObject.put("from_web", z ? 1 : 0);
            jSONObject.put("is_w2a", nqiVar.kgc());
            hashMap.put("pag_json_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public static boolean zmn(String str, nqi nqiVar) {
        String queryParameter;
        if (str != null && !str.isEmpty()) {
            try {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                if (NetworkUtils.PROTOCOL_MARKET.equals(scheme) && "details".equals(host)) {
                    return true;
                }
                if ((!"http".equals(scheme) && !"https".equals(scheme)) || (!POBCommonConstants.PLAY_STORE_DOMAIN.equals(host) && !"market.android.com".equals(host))) {
                    if (NetworkUtils.PROTOCOL_MARKET.equals(scheme) && "webstoreredirect".equals(host) && (queryParameter = parse.getQueryParameter(ShareConstants.MEDIA_URI)) != null) {
                        return zmn(queryParameter, nqiVar);
                    }
                }
                return true;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    public static boolean zmn(nqi nqiVar, String str) {
        if (nqiVar == null || nqiVar.rvx() == null) {
            return false;
        }
        String btk = nqiVar.rvx().btk();
        if (TextUtils.isEmpty(btk)) {
            return false;
        }
        return Pattern.compile(btk).matcher(str).matches();
    }
}
