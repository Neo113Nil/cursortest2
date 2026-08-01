package com.bytedance.sdk.openadsdk.icD;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.google.android.gms.common.internal.ImagesContract;
import io.ktor.http.LinkHeader;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebviewTimeTrack.java */
/* loaded from: classes2.dex */
public class vA implements com.bytedance.sdk.openadsdk.icD.vG.NB {
    private Boolean Jd;
    private Boolean NB;
    private cR icD;
    private String pvs;
    private JSONObject sUS;
    private JSONArray so;
    private Boolean vG;
    private JSONArray yiw;

    public vA(int i, String str, cR cRVar) {
        this.pvs = "embeded_ad";
        this.vG = Boolean.FALSE;
        this.Jd = Boolean.FALSE;
        this.NB = Boolean.FALSE;
        this.pvs = str;
        this.icD = cRVar;
        this.sUS = new JSONObject();
        this.yiw = new JSONArray();
        this.so = new JSONArray();
        pvs(this.sUS, "webview_source", Integer.valueOf(i));
    }

    protected vA() {
        this.pvs = "embeded_ad";
        this.vG = Boolean.FALSE;
        this.Jd = Boolean.FALSE;
        this.NB = Boolean.FALSE;
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.Jd
    public void pvs() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.1
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(jSONObject, "render_sequence", Integer.valueOf(vAVar.icD.dyT()));
                if (vA.this.icD != null && vA.this.icD.gSd() != null) {
                    if (vA.this.icD.gSd().Ju()) {
                        vA.this.pvs(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.NB.NB.pvs().Jd()));
                        vA.this.pvs(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.NB.NB.pvs().Jd()));
                    } else {
                        vA.this.pvs(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.NB.NB.pvs().vG()));
                        vA.this.pvs(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.NB.NB.pvs().vG()));
                    }
                }
                vA vAVar2 = vA.this;
                vAVar2.pvs(vAVar2.sUS, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.Jd
    public void icD() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.12
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.Jd
    public void pvs(final int i, final String str) {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.23
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA.this.pvs(jSONObject, "code", Integer.valueOf(i));
                String str2 = str;
                if (str2 != null) {
                    vA.this.pvs(jSONObject, NotificationCompat.CATEGORY_MESSAGE, str2);
                }
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.icD
    public void vG() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.24
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.vG
    public void Jd() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.25
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.sUS
    public void NB() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.26
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.sUS
    public void sUS() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.27
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.sUS
    public void pvs(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.28
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                vA.this.pvs(jSONObject2, "ts", Long.valueOf(System.currentTimeMillis()));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.vG
    public void yiw() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.29
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.vG
    public void so() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.2
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.vG
    public void Mxy() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.3
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA.this.pvs(jSONObject, LinkHeader.Parameters.Type, "native_enterBackground");
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.yiw, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.vG
    public void Wyp() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.4
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA.this.pvs(jSONObject, LinkHeader.Parameters.Type, "native_enterForeground");
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.yiw, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.sUS
    public void pvs(final String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.5
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "start_ts", Long.valueOf(j));
                vA.this.pvs(jSONObject, "end_ts", Long.valueOf(j2));
                vA.this.pvs(jSONObject, "intercept_type", Integer.valueOf(i));
                vA.this.pvs(jSONObject, LinkHeader.Parameters.Type, "intercept_html");
                vA.this.pvs(jSONObject, ImagesContract.URL, str);
                vA.this.pvs(jSONObject, TypedValues.TransitionType.S_DURATION, Long.valueOf(j2 - j));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.so, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.sUS
    public void icD(final String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.6
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "start_ts", Long.valueOf(j));
                vA.this.pvs(jSONObject, "end_ts", Long.valueOf(j2));
                vA.this.pvs(jSONObject, "intercept_type", Integer.valueOf(i));
                vA.this.pvs(jSONObject, LinkHeader.Parameters.Type, "intercept_js");
                vA.this.pvs(jSONObject, ImagesContract.URL, str);
                vA.this.pvs(jSONObject, TypedValues.TransitionType.S_DURATION, Long.valueOf(j2 - j));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.so, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.sUS
    public void pvs(final String str) {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.7
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA.this.pvs(jSONObject, "jsb", str);
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "webview_jsb_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.sUS
    public void icD(final String str) {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.8
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA.this.pvs(jSONObject, "jsb", str);
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.sUS
    public void icD(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.9
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                if (vA.this.sUS == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    vA vAVar = vA.this;
                    vAVar.pvs(vAVar.sUS, next, jSONObject.opt(next));
                }
                vA.this.Jd = Boolean.TRUE;
                vA.this.kj();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.NB
    public void qh() {
        this.vG = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.NB
    public void pvs(boolean z) {
        this.NB = Boolean.valueOf(z);
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.NB
    public void kj() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.10
            @Override // java.lang.Runnable
            public void run() {
                if (vA.this.mnm()) {
                    if (vA.this.yiw != null && vA.this.yiw.length() != 0) {
                        try {
                            vA.this.sUS.put("native_switchBackgroundAndForeground", vA.this.yiw);
                        } catch (Exception unused) {
                        }
                    }
                    if (vA.this.so != null && vA.this.so.length() != 0) {
                        try {
                            vA.this.sUS.put("intercept_source", vA.this.so);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("webview_time_track", vA.this.sUS);
                    } catch (JSONException e) {
                        com.bytedance.sdk.component.utils.Ju.pvs("WebviewTimeTrack", "trySendTrackInfo json error", e);
                    }
                    if (com.bytedance.sdk.openadsdk.core.so.icD().vA() && vA.this.sUS != null) {
                        JSONObject unused3 = vA.this.sUS;
                    }
                    vG.icD(vA.this.icD, vA.this.pvs, "webview_time_track", jSONObject);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean mnm() {
        if (this.NB.booleanValue()) {
            return true;
        }
        return this.Jd.booleanValue() && this.vG.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(JSONObject jSONObject, String str, Object obj, boolean z) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(JSONObject jSONObject, String str, Object obj) {
        pvs(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.pvs
    public void vG(final String str) {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.11
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.pvs
    public void icD(final int i, final String str) {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.13
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA.this.pvs(jSONObject, "code", Integer.valueOf(i));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.icD
    public void Ju() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.14
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "native_render_end", jSONObject);
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                vA.this.pvs(jSONObject2, "ts", Long.valueOf(currentTimeMillis2));
                vA vAVar2 = vA.this;
                vAVar2.pvs(vAVar2.sUS, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.icD
    public void IP() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.15
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.Jd
    public void bNS() {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.16
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.pvs
    public void Jd(final String str) {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.17
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.pvs
    public void NB(final String str) {
        try {
            com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.18
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    vA vAVar = vA.this;
                    vAVar.pvs(vAVar.sUS, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.pvs
    public void sUS(final String str) {
        try {
            com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.19
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    vA vAVar = vA.this;
                    vAVar.pvs(vAVar.sUS, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.pvs
    public void vG(final int i, final String str) {
        try {
            com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.20
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    vA.this.pvs(jSONObject, "code", Integer.valueOf(i));
                    vA vAVar = vA.this;
                    vAVar.pvs(vAVar.sUS, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.pvs
    public void yiw(final String str) {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.21
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA vAVar = vA.this;
                vAVar.pvs(vAVar.sUS, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.icD.vG.sUS
    public void pvs(final int i) {
        com.bytedance.sdk.component.utils.so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.vA.22
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                vA.this.pvs(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                vA.this.pvs(jSONObject, "isWebViewCache", Integer.valueOf(i));
                if (vA.this.icD != null && vA.this.icD.gSd() != null) {
                    if (!vA.this.icD.gSd().Ju()) {
                        vA.this.pvs(jSONObject, "engine_version", "v1");
                    } else {
                        vA vAVar = vA.this;
                        vAVar.pvs(jSONObject, "engine_version", vAVar.icD.gSd().kj());
                    }
                }
                vA vAVar2 = vA.this;
                vAVar2.pvs(vAVar2.sUS, "before_webview_request", jSONObject);
            }
        });
    }
}
