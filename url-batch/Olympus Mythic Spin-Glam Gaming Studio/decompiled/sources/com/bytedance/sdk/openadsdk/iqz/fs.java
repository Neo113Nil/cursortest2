package com.bytedance.sdk.openadsdk.iqz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.btk.cyb;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.rt;
import com.bytedance.sdk.component.fs.zmn.zg;
import com.bytedance.sdk.component.fs.zmn.zmn.zmn.iv;
import com.bytedance.sdk.component.nps.zmn;
import com.bytedance.sdk.component.utils.kgc;
import com.bytedance.sdk.openadsdk.core.bjh;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.iqz.zmn.zn;
import com.bytedance.sdk.openadsdk.kgc.fb;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class fs {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile fs zmn;
    private final Map<String, JSONObject> fb = new HashMap();
    private final com.bytedance.sdk.component.nps.zmn fs;
    private zn zn;

    public int zmn() {
        try {
            return btk.zmn("net_time_out", 10000);
        } catch (Throwable unused) {
            return 10000;
        }
    }

    public static fs fs() {
        if (zmn == null) {
            synchronized (fs.class) {
                try {
                    if (zmn == null) {
                        zmn = new fs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private fs() {
        int zmn2 = zmn();
        zmn.C0134zmn c0134zmn = new zmn.C0134zmn();
        long j = zmn2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zmn.C0134zmn zmn3 = c0134zmn.zmn(j, timeUnit).fs(j, timeUnit).zn(j, timeUnit).zmn(new zmn());
        if (com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
            zmn3.zmn(new zmn.fs() { // from class: com.bytedance.sdk.openadsdk.iqz.fs.1
                @Override // com.bytedance.sdk.component.nps.zmn.fs
                public void zmn(fb fbVar) {
                    fbVar.zmn().zn();
                    fbVar.hashCode();
                    com.bytedance.sdk.openadsdk.kgc.zn.zmn(fbVar);
                }

                @Override // com.bytedance.sdk.component.nps.zmn.fs
                public void fs(fb fbVar) {
                    fbVar.zmn().zn();
                    fbVar.hashCode();
                    com.bytedance.sdk.openadsdk.kgc.zn.fs(fbVar);
                }

                @Override // com.bytedance.sdk.component.nps.zmn.fs
                public void zn(fb fbVar) {
                    fbVar.zmn().zn();
                    fbVar.hashCode();
                    com.bytedance.sdk.openadsdk.kgc.zn.zn(fbVar);
                }
            });
        }
        com.bytedance.sdk.component.nps.zmn zmn4 = zmn3.zmn(true).zmn();
        this.fs = zmn4;
        com.bytedance.sdk.component.fs.zmn.zmn.zmn.zmn.zmn(new iv() { // from class: com.bytedance.sdk.openadsdk.iqz.fs.2
            @Override // com.bytedance.sdk.component.fs.zmn.zmn.zmn.iv
            public ExecutorService zmn() {
                if (rc.fs().ax()) {
                    return nu.mw();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.fs.zmn.zmn.zmn.iv
            public boolean fs() {
                return rc.fs().ax();
            }
        });
        com.bytedance.sdk.component.nps.zmn.zmn(new com.bytedance.sdk.component.fs.zmn.zmn.zmn.btk() { // from class: com.bytedance.sdk.openadsdk.iqz.fs.3
            @Override // com.bytedance.sdk.component.fs.zmn.zmn.zmn.btk
            public boolean zmn() {
                return btk.zmn("net_http_protocol", 0) == 1;
            }
        });
        com.bytedance.sdk.component.nps.zmn.zmn(new zmn.zn() { // from class: com.bytedance.sdk.openadsdk.iqz.fs.4
            @Override // com.bytedance.sdk.component.nps.zmn.zn
            public boolean zmn() {
                return com.bytedance.sdk.openadsdk.utils.fs.fs();
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zn
            public boolean fs() {
                return kgc.zg(com.bytedance.sdk.openadsdk.core.kgc.zmn());
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zn
            public void zmn(final String str, final String str2, final String str3, final int i, final String str4, final boolean z, final int i2, final int i3) {
                try {
                    if (!TextUtils.isEmpty(str3) && str3.contains("/api/ad/union/sdk/stats/batch/")) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.cyb.fb.zmn("net_call_fail", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.iqz.fs.4.1
                        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
                        /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
                        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
                        @Override // com.bytedance.sdk.openadsdk.cyb.fs
                        @Nullable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                            String str5;
                            String str6;
                            String str7;
                            Uri parse;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("fail_url", str3);
                            String str8 = "";
                            try {
                                parse = Uri.parse(str3);
                                str5 = parse.getHost();
                            } catch (Throwable unused) {
                                str5 = "";
                            }
                            try {
                                str6 = parse.getPath();
                            } catch (Throwable unused2) {
                                str6 = "";
                                if (!TextUtils.isEmpty(str5)) {
                                }
                                if (!TextUtils.isEmpty(str6)) {
                                }
                                jSONObject.put("error_code", i);
                                jSONObject.put("trace_id", str);
                                jSONObject.put("error_msg", str4);
                                jSONObject.put("is_retry_enabled", z);
                                if (z) {
                                }
                                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("net_call_fail").fs(jSONObject.toString());
                            }
                            if (!TextUtils.isEmpty(str5)) {
                                jSONObject.put("error_domain", str5);
                            }
                            if (!TextUtils.isEmpty(str6)) {
                                jSONObject.put("error_path", str6);
                            }
                            jSONObject.put("error_code", i);
                            jSONObject.put("trace_id", str);
                            jSONObject.put("error_msg", str4);
                            jSONObject.put("is_retry_enabled", z);
                            if (z) {
                                jSONObject.put("primary_url", str2);
                                if (!TextUtils.isEmpty(str2)) {
                                    try {
                                        Uri parse2 = Uri.parse(str2);
                                        str7 = parse2.getHost();
                                        try {
                                            str8 = parse2.getPath();
                                        } catch (Throwable unused3) {
                                        }
                                    } catch (Throwable unused4) {
                                        str7 = "";
                                    }
                                    if (!TextUtils.isEmpty(str7)) {
                                        jSONObject.put("primary_domain", str7);
                                    }
                                    if (!TextUtils.isEmpty(str8)) {
                                        jSONObject.put("primary_path", str8);
                                    }
                                }
                                jSONObject.put("attempt_index", i2);
                                jSONObject.put("total_attempts", i3);
                            }
                            return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("net_call_fail").fs(jSONObject.toString());
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        });
        com.bytedance.sdk.component.nps.zn.zn.zmn().zmn(com.bytedance.sdk.openadsdk.utils.fs.nps());
        com.bytedance.sdk.component.fs.zmn.fb fs = zmn4.zg().fs();
        if (fs != null) {
            fs.zmn(32);
        }
    }

    public class zmn implements zg {
        public zmn() {
        }

        @Override // com.bytedance.sdk.component.fs.zmn.zg
        public rt zmn(zg.zmn zmnVar) throws IOException {
            JSONObject zmn;
            klz zmn2 = zmnVar.zmn();
            if (zmn2.fb() != null && !zmn2.fb().fb().isEmpty()) {
                List<String> fb = zmn2.fb().fb();
                StringBuilder sb = new StringBuilder();
                for (String str : fb) {
                    sb.append("/");
                    sb.append(str);
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    if (sb2.equals("/monitor/collect/c/session")) {
                        return zmnVar.zmn(zmn2);
                    }
                    if (sb2.equals("/api/ad/union/sdk/register_status/") || sb2.equals("/api/ad/union/sdk/compliance_status/")) {
                        return zmnVar.zmn(zmn2);
                    }
                }
            }
            klz.zmn rc = zmn2.rc();
            String fs = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!TextUtils.isEmpty(fs) && (zmn = fs.this.zmn(fs)) != null) {
                rc.fs("transfer-param", zmn.optString("message"));
                if (zmn.optInt("cypher") == 4) {
                    rc.fs("cypher", "4");
                } else {
                    rc.fs("cypher", "3");
                }
            }
            try {
                rc.fs("x-pangle-target-idc", rc.fs().eug());
            } catch (Throwable unused) {
            }
            return zmnVar.zmn(rc.fs());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject zmn(String str) {
        JSONObject jSONObject = this.fb.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ipv6", str);
        } catch (JSONException unused) {
        }
        JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject2, new bjh(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        this.fb.put(str, encryptType4);
        return encryptType4;
    }

    public com.bytedance.sdk.component.nps.zmn zn() {
        return this.fs;
    }

    public zn fb() {
        btk();
        return this.zn;
    }

    public void zmn(String str, int i, int i2, ImageView imageView, nqi nqiVar) {
        com.bytedance.sdk.openadsdk.iv.fb.zmn(str).zmn(i).fs(i2).btk(jy.btk(com.bytedance.sdk.openadsdk.core.kgc.zmn())).fb(jy.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn())).zn(1).zmn(com.bytedance.sdk.openadsdk.iv.zn.zmn(nqiVar, str, imageView));
    }

    public void zmn(int i, final ImageView imageView, final nqi nqiVar) {
        if (nqiVar == null || !TextUtils.isEmpty(nqiVar.phc())) {
            com.bytedance.sdk.openadsdk.iv.fb.zmn(nqiVar.phc()).zmn(i).fs(i).btk(jy.btk(com.bytedance.sdk.openadsdk.core.kgc.zmn())).fb(jy.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn())).zn(1).zmn(com.bytedance.sdk.openadsdk.iv.zn.zmn(nqiVar, nqiVar.phc(), imageView));
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.iqz.fs.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/iqz/fs$5;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view);
                        safedk_fs$5_onClick_aef207795cedf0ce7d1fe8b7a20eb3a3(view);
                    }

                    public void safedk_fs$5_onClick_aef207795cedf0ce7d1fe8b7a20eb3a3(View p0) {
                        if (imageView.getDrawable() != null) {
                            Intent intent = new Intent();
                            String doe = nqiVar.doe();
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse(doe));
                            try {
                                com.bytedance.sdk.component.utils.fs.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), intent, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.model.kgc kgcVar, ImageView imageView, nqi nqiVar) {
        if (kgcVar == null || TextUtils.isEmpty(kgcVar.zmn()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.iv.fb.zmn(kgcVar).zn(1).zmn(com.bytedance.sdk.openadsdk.iv.zn.zmn(nqiVar, kgcVar.zmn(), imageView));
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.model.kgc kgcVar, ImageView imageView, nqi nqiVar, cyb cybVar) {
        if (kgcVar == null || TextUtils.isEmpty(kgcVar.zmn()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.iv.fb.zmn(kgcVar).zn(1).zmn(com.bytedance.sdk.openadsdk.iv.zn.zmn(nqiVar, kgcVar.zmn(), imageView, cybVar));
    }

    public void zmn(String str, View view) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        com.bytedance.sdk.openadsdk.iv.fb.zmn(str).zn(2).zmn(new com.bytedance.sdk.component.btk.zg() { // from class: com.bytedance.sdk.openadsdk.iqz.fs.7
            @Override // com.bytedance.sdk.component.btk.zg
            public Bitmap zmn(Bitmap bitmap) {
                View view2 = (View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return com.bytedance.sdk.component.adexpress.fb.zmn.zmn(view2.getContext(), bitmap, 10);
            }
        }).zmn(new cyb() { // from class: com.bytedance.sdk.openadsdk.iqz.fs.6
            @Override // com.bytedance.sdk.component.btk.cyb
            public void zmn(int i, String str2, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.btk.cyb
            public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
                final View view2;
                if (rcVar == null) {
                    return;
                }
                final Object fs = rcVar.fs();
                if (!(fs instanceof Bitmap) || (view2 = (View) weakReference.get()) == null) {
                    return;
                }
                if (nu.hhw()) {
                    if (view2 instanceof ImageView) {
                        ((ImageView) view2).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) fs));
                        return;
                    } else {
                        view2.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) fs));
                        return;
                    }
                }
                view2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.iqz.fs.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        View view3 = view2;
                        if (view3 instanceof ImageView) {
                            ((ImageView) view3).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) fs));
                        } else {
                            view3.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) fs));
                        }
                    }
                });
            }
        });
    }

    private void btk() {
        if (this.zn == null) {
            this.zn = new zn();
        }
    }
}
