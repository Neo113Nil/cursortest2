package com.bytedance.sdk.openadsdk.fb;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.internal.services.init.i;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class kw implements com.bytedance.sdk.openadsdk.fb.fb.btk {
    private AtomicBoolean btk;
    private Boolean fb;
    private nqi fs;
    private JSONObject hhw;
    private JSONArray nps;
    private JSONArray zg;
    private String zmn;
    private Boolean zn;

    public kw(int i, String str, nqi nqiVar) {
        this.zmn = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.zn = bool;
        this.fb = bool;
        this.btk = new AtomicBoolean(false);
        this.zmn = str;
        this.fs = nqiVar;
        this.hhw = new JSONObject();
        this.nps = new JSONArray();
        this.zg = new JSONArray();
        zmn(this.hhw, "webview_source", Integer.valueOf(i));
    }

    protected kw() {
        this.zmn = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.zn = bool;
        this.fb = bool;
        this.btk = new AtomicBoolean(false);
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.fb
    public void zmn() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.1
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(jSONObject, "render_sequence", Integer.valueOf(kwVar.fs.skn()));
                if (kw.this.fs != null) {
                    if (kw.this.fs.ouf() != null) {
                        if (kw.this.fs.ouf().klz()) {
                            kw.this.zmn(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.btk.btk.zmn().fb()));
                            kw.this.zmn(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.btk.btk.zmn().fb()));
                        } else {
                            kw.this.zmn(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.btk.btk.zmn().zn()));
                            kw.this.zmn(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.btk.btk.zmn().zn()));
                        }
                    } else if (kw.this.fs.rsi() != null) {
                        kw.this.zmn(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.btk.btk.zmn().fb()));
                        kw.this.zmn(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.btk.btk.zmn().fb()));
                    }
                }
                kw kwVar2 = kw.this;
                kwVar2.zmn(kwVar2.hhw, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.fb
    public void fs() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.12
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.fb
    public void zmn(final int i, final String str) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.23
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw.this.zmn(jSONObject, "code", Integer.valueOf(i));
                String str2 = str;
                if (str2 != null) {
                    kw.this.zmn(jSONObject, "reason", str2);
                }
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.fs
    public void zmn(final int i) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.26
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw.this.zmn(jSONObject, "backup_type", Integer.valueOf(i));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zn
    public void zn() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.27
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.hhw
    public void fb() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.28
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.hhw
    public void btk() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.29
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.hhw
    public void zmn(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.30
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                kw.this.zmn(jSONObject2, "ts", Long.valueOf(System.currentTimeMillis()));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zn
    public void hhw() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.31
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zn
    public void nps() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.2
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zn
    public void zg() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.3
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw.this.zmn(jSONObject, "type", "native_enterBackground");
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.nps, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zn
    public void bvs() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.4
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw.this.zmn(jSONObject, "type", "native_enterForeground");
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.nps, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.hhw
    public void zmn(final String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.5
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "start_ts", Long.valueOf(j));
                kw.this.zmn(jSONObject, "end_ts", Long.valueOf(j2));
                kw.this.zmn(jSONObject, "intercept_type", Integer.valueOf(i));
                kw.this.zmn(jSONObject, "type", "intercept_html");
                kw.this.zmn(jSONObject, "url", str);
                kw.this.zmn(jSONObject, IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2 - j));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.zg, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.hhw
    public void fs(final String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.6
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "start_ts", Long.valueOf(j));
                kw.this.zmn(jSONObject, "end_ts", Long.valueOf(j2));
                kw.this.zmn(jSONObject, "intercept_type", Integer.valueOf(i));
                kw.this.zmn(jSONObject, "type", "intercept_js");
                kw.this.zmn(jSONObject, "url", str);
                kw.this.zmn(jSONObject, IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2 - j));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.zg, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.hhw
    public void zmn(final String str) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.7
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw.this.zmn(jSONObject, "jsb", str);
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "webview_jsb_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.hhw
    public void fs(final String str) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.8
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw.this.zmn(jSONObject, "jsb", str);
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.hhw
    public void fs(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.9
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                if (kw.this.hhw == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    kw kwVar = kw.this;
                    kwVar.zmn(kwVar.hhw, next, jSONObject.opt(next));
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.btk
    public void iv() {
        this.zn = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.btk
    public void zmn(boolean z) {
        this.fb = Boolean.valueOf(z);
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.btk
    public void rc() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.10
            @Override // java.lang.Runnable
            public void run() {
                if (kw.this.cyb()) {
                    if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(kw.this.fs) && kw.this.btk.get()) {
                        return;
                    }
                    if (kw.this.nps != null && kw.this.nps.length() != 0) {
                        try {
                            kw.this.hhw.put("native_switchBackgroundAndForeground", kw.this.nps);
                        } catch (Exception unused) {
                        }
                    }
                    if (kw.this.zg != null && kw.this.zg.length() != 0) {
                        try {
                            kw.this.hhw.put("intercept_source", kw.this.zg);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("webview_time_track", kw.this.hhw);
                    } catch (JSONException e) {
                        iqz.zmn("WebviewTimeTrack", "trySendTrackInfo json error", e);
                    }
                    if (com.bytedance.sdk.openadsdk.core.iv.fs().cn() && kw.this.hhw != null) {
                        JSONObject unused3 = kw.this.hhw;
                    }
                    kw.this.btk.set(true);
                    zn.fs(kw.this.fs, kw.this.zmn, "webview_time_track", jSONObject);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean cyb() {
        return this.fb.booleanValue() || this.zn.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(JSONObject jSONObject, String str, Object obj, boolean z) {
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
    public void zmn(JSONObject jSONObject, String str, Object obj) {
        zmn(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zmn
    public void zn(final String str) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.11
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zmn
    public void fs(final int i, final String str) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.13
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw.this.zmn(jSONObject, "code", Integer.valueOf(i));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.fs
    public void klz() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.14
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "native_render_end", jSONObject);
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                kw.this.zmn(jSONObject2, "ts", Long.valueOf(currentTimeMillis2));
                kw kwVar2 = kw.this;
                kwVar2.zmn(kwVar2.hhw, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.fs
    public void mw() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.15
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.fb
    public void rt() {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.16
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.fb
    public void cn() {
        try {
            com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.17
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    kw kwVar = kw.this;
                    kwVar.zmn(kwVar.hhw, "render_did_finish", jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zmn
    public void fb(final String str) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.18
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zmn
    public void zmn(final String str, final boolean z) {
        try {
            com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.19
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    kw.this.zmn(jSONObject, "isReuse", Integer.valueOf(z ? 1 : 0));
                    kw kwVar = kw.this;
                    kwVar.zmn(kwVar.hhw, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zmn
    public void btk(final String str) {
        try {
            com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.20
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    kw kwVar = kw.this;
                    kwVar.zmn(kwVar.hhw, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zmn
    public void hhw(final String str) {
        try {
            com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.21
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    kw kwVar = kw.this;
                    kwVar.zmn(kwVar.hhw, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zmn
    public void zn(final int i, final String str) {
        try {
            com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.22
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    kw.this.zmn(jSONObject, "code", Integer.valueOf(i));
                    kw kwVar = kw.this;
                    kwVar.zmn(kwVar.hhw, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.zmn
    public void nps(final String str) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.24
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.fb.fb.hhw
    public void fs(final int i) {
        com.bytedance.sdk.component.utils.bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.kw.25
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kw.this.zmn(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                kw.this.zmn(jSONObject, "isWebViewCache", Integer.valueOf(i));
                if (kw.this.fs != null) {
                    if (kw.this.fs.sxr()) {
                        kw.this.zmn(jSONObject, "engine_version", "v3");
                    } else {
                        kw.this.zmn(jSONObject, "engine_version", i.a);
                    }
                }
                kw kwVar = kw.this;
                kwVar.zmn(kwVar.hhw, "before_webview_request", jSONObject);
            }
        });
    }
}
