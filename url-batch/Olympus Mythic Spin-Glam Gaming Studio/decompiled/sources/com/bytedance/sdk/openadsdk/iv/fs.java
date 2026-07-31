package com.bytedance.sdk.openadsdk.iv;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.btk.cyb;
import com.bytedance.sdk.component.btk.rc;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.C4538a2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class fs<T> implements cyb<T> {
    private final nqi fb;
    private final String fs;
    private final long zmn = SystemClock.elapsedRealtime();
    private final cyb<T> zn;

    public fs(final nqi nqiVar, String str, cyb<T> cybVar) {
        this.zn = cybVar;
        this.fb = nqiVar;
        this.fs = str;
        com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.iv.fs.1
            @Override // com.bytedance.sdk.openadsdk.kgc.fb
            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                zmnVar.fs("load_img");
                nqi nqiVar2 = nqiVar;
                if (nqiVar2 != null) {
                    zmnVar.zn(nqiVar2.so(C4538a2.f));
                    zmnVar.fb(oub.zn(nqiVar.sft()));
                }
                return zmnVar;
            }
        });
    }

    @Override // com.bytedance.sdk.component.btk.cyb
    public void zmn(rc<T> rcVar) {
        cyb<T> cybVar = this.zn;
        if (cybVar != null) {
            cybVar.zmn(rcVar);
        }
        if (this.fb != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime() - this.zmn;
            final int nps = rcVar.nps() / 1024;
            final int i = rcVar.hhw() ? 1 : 0;
            com.bytedance.sdk.openadsdk.cyb.fb.zmn("load_image_success", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.iv.fs.2
                @Override // com.bytedance.sdk.openadsdk.cyb.fs
                @Nullable
                public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, elapsedRealtime);
                    jSONObject.put("url", fs.this.fs);
                    jSONObject.put("preload_size", nps);
                    jSONObject.put("local_cache", i);
                    jSONObject.put("image_mode", fs.this.fb.zq());
                    jSONObject.put("use_new_img", 1);
                    return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("load_image_success").zmn(fs.this.fb.sft()).fs(jSONObject.toString());
                }
            });
            com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.iv.fs.3
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("load_img");
                    if (fs.this.fb != null) {
                        zmnVar.zn(fs.this.fb.so(C4538a2.f));
                        zmnVar.fb(oub.zn(fs.this.fb.sft()));
                    }
                    return zmnVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.btk.cyb
    public void zmn(final int i, final String str, @Nullable final Throwable th) {
        cyb<T> cybVar = this.zn;
        if (cybVar != null) {
            cybVar.zmn(i, str, th);
        }
        nqi nqiVar = this.fb;
        if (nqiVar != null) {
            if (!TextUtils.isEmpty(oub.zmn(nqiVar))) {
                final long elapsedRealtime = SystemClock.elapsedRealtime() - this.zmn;
                com.bytedance.sdk.openadsdk.cyb.fb.zmn("load_image_error", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.iv.fs.4
                    @Override // com.bytedance.sdk.openadsdk.cyb.fs
                    @Nullable
                    public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, elapsedRealtime);
                        jSONObject.put("url", fs.this.fs);
                        jSONObject.put("error_code", i);
                        Throwable th2 = th;
                        if (th2 instanceof NullPointerException) {
                            ApmHelper.reportCustomError("image load fail", "image_load", th2);
                        }
                        jSONObject.put("error_message", str);
                        jSONObject.put("image_mode", fs.this.fb.zq());
                        jSONObject.put("use_new_img", 1);
                        return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("load_image_error").zmn(fs.this.fb.sft()).fs(jSONObject.toString());
                    }
                });
            }
            com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.iv.fs.5
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("load_img");
                    if (fs.this.fb != null) {
                        zmnVar.zn(fs.this.fb.so(C4538a2.f));
                        zmnVar.fb(oub.zn(fs.this.fb.sft()));
                    }
                    return zmnVar;
                }
            });
        }
    }
}
