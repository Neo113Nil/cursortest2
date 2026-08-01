package com.com.bytedance.overseas.sdk.pvs;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.ae;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.icD.kj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GPDownLoader.java */
/* loaded from: classes2.dex */
public class icD implements vG {
    protected static Boolean NB;
    protected cR icD;
    protected com.bytedance.sdk.openadsdk.core.model.vG pvs;
    private final WeakReference<Context> so;
    protected String vG;
    protected int yiw;
    protected boolean Jd = false;
    protected final AtomicBoolean sUS = new AtomicBoolean(false);
    private boolean Mxy = false;

    public icD(Context context, cR cRVar, String str) {
        this.so = new WeakReference<>(context);
        this.icD = cRVar;
        this.pvs = cRVar.Ca();
        this.vG = str;
        Object[] objArr = new Object[2];
        "====tag===".concat(String.valueOf(str));
        if (mnm.pvs() == null) {
            mnm.pvs(context);
        }
    }

    @Override // com.com.bytedance.overseas.sdk.pvs.vG
    public void pvs(boolean z) {
        this.Mxy = z;
    }

    @Override // com.com.bytedance.overseas.sdk.pvs.vG
    public void pvs(int i) {
        this.yiw = i;
    }

    public boolean pvs(Context context, String str, String str2) {
        return pvs(context, str, str2, this.vG, this.icD);
    }

    public static boolean pvs(Context context, String str, String str2, String str3, cR cRVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            Boolean bool = NB;
            jSONObject.put("storeOpenType", (bool == null || !bool.booleanValue()) ? "webview" : "app");
        } catch (JSONException e) {
            Ju.pvs("GPDownLoader", "gotoGooglePlayByPackageNameAndUrl json error", e);
        }
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, str3, "store_open", jSONObject);
                Object[] objArr = new Object[2];
                jSONObject.toString();
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri parse = Uri.parse("market://details?id=".concat(String.valueOf(str2)));
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
                        context.startActivity(intent3);
                        jSONObject.put("storeOpenType", "app");
                        com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, str3, "store_open", jSONObject);
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

    public static void pvs(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details"));
        try {
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                    NB = Boolean.TRUE;
                    return;
                }
            }
        } catch (Throwable unused) {
            NB = Boolean.FALSE;
        }
        NB = Boolean.FALSE;
    }

    protected Context vG() {
        WeakReference<Context> weakReference = this.so;
        return (weakReference == null || weakReference.get() == null) ? mnm.pvs() : this.so.get();
    }

    @Override // com.com.bytedance.overseas.sdk.pvs.vG
    public void Jd() {
        if (vG() == null) {
            return;
        }
        if (icD()) {
            this.sUS.set(true);
            this.icD.vG(true);
            return;
        }
        if (pvs()) {
            this.icD.vG(true);
            return;
        }
        if (NB()) {
            this.icD.vG(true);
        } else {
            if (this.icD.Ca() != null || this.icD.CjQ() == null) {
                return;
            }
            ae.pvs(vG(), this.icD.CjQ(), this.icD, jlb.pvs(this.vG), this.vG, true);
            this.icD.vG(true);
        }
    }

    public boolean icD() {
        com.bytedance.sdk.openadsdk.core.Jd.pvs(this.icD, this.vG, 1, null);
        if (this.icD.Zm() != null) {
            String pvs = this.icD.Zm().pvs();
            if (!TextUtils.isEmpty(pvs)) {
                Uri parse = Uri.parse(pvs);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                jlb.icD icD = jlb.icD(vG(), intent);
                if (icD.icD > 0) {
                    if (!(vG() instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    try {
                        Map<String, Object> hashMap = new HashMap<>();
                        pvs(hashMap);
                        ComponentName resolveActivity = intent.resolveActivity(vG().getPackageManager());
                        if (resolveActivity != null) {
                            hashMap.put("resolved_activity", resolveActivity.getPackageName() + "/" + resolveActivity.getClassName());
                        }
                        hashMap.put("matched_count", Integer.valueOf(icD.icD));
                        hashMap.put(ImagesContract.URL, pvs);
                        if (icD.pvs != null) {
                            hashMap.put("target_component", icD.pvs.getPackageName() + "/" + icD.pvs.getClassName());
                            intent.setComponent(icD.pvs);
                        }
                        com.bytedance.sdk.openadsdk.icD.vG.pvs(this.icD, this.vG, "open_url_app", hashMap);
                        vG().startActivity(intent);
                        kj.pvs().pvs(hashMap).pvs(this.icD, this.vG);
                        com.bytedance.sdk.openadsdk.icD.vG.pvs("dp_start_act_success", this.icD, this.vG, hashMap);
                        return true;
                    } catch (Throwable th) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("exception", th.getMessage());
                            jSONObject.put("intent", intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (Exception unused) {
                        }
                        com.bytedance.sdk.openadsdk.core.Jd.pvs(this.icD, this.vG, -4, jSONObject);
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("intent", intent.toString());
                        jSONObject2.put("can_query_install", 1);
                    } catch (Exception unused2) {
                    }
                    com.bytedance.sdk.openadsdk.core.Jd.pvs(this.icD, this.vG, -3, jSONObject2);
                }
            } else {
                cR cRVar = this.icD;
                com.bytedance.sdk.openadsdk.core.Jd.pvs(cRVar, this.vG, -2, cRVar.Zm().Jd());
            }
            if (this.Jd && !this.sUS.get()) {
                return false;
            }
            this.Jd = true;
            Map<String, Object> hashMap2 = new HashMap<>();
            pvs(hashMap2);
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.icD, this.vG, "open_fallback_url", hashMap2);
            return false;
        }
        com.bytedance.sdk.openadsdk.core.Jd.pvs(this.icD, this.vG, -1, null);
        return false;
    }

    private void pvs(Map<String, Object> map) {
        cR cRVar = this.icD;
        if (cRVar != null && cRVar.xyK() == 0) {
            cR cRVar2 = this.icD;
            map.put("auto_click", Boolean.valueOf((cRVar2 == null || cRVar2.Jd()) ? false : true));
        }
        cR cRVar3 = this.icD;
        if (cRVar3 != null && cRVar3.xyK() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.yiw >= 11));
        }
        map.put("can_query_install", 1);
    }

    @Override // com.com.bytedance.overseas.sdk.pvs.vG
    public boolean NB() {
        this.sUS.set(true);
        return this.pvs != null && pvs(vG(), this.pvs.pvs(), this.pvs.vG());
    }

    @Override // com.com.bytedance.overseas.sdk.pvs.vG
    public boolean pvs() {
        Intent pvs;
        if (this.pvs == null) {
            return false;
        }
        cR cRVar = this.icD;
        if (cRVar != null && cRVar.EFw() == 0) {
            return false;
        }
        String vG = this.pvs.vG();
        if (TextUtils.isEmpty(vG) || !jlb.icD(vG(), vG) || (pvs = jlb.pvs(vG(), vG)) == null) {
            return false;
        }
        pvs.putExtra("START_ONLY_FOR_ANDROID", true);
        try {
            vG().startActivity(pvs);
            HashMap hashMap = new HashMap();
            pvs(hashMap);
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.icD, this.vG, "click_open", hashMap);
            return true;
        } catch (Throwable th) {
            Ju.pvs("GPDownLoader", th.getMessage());
            return false;
        }
    }
}
