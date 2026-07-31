package com.bytedance.sdk.openadsdk.component.reward.zn.fs;

import android.R;
import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class fb {
    private String btk;
    private nqi fb;
    private com.bytedance.sdk.openadsdk.component.reward.zn.zmn fs;
    private final AtomicBoolean hhw = new AtomicBoolean(false);
    private long nps = 0;
    private final com.bytedance.sdk.openadsdk.component.reward.zn.fs zmn;
    private Activity zn;

    public fb(com.bytedance.sdk.openadsdk.component.reward.zn.fs fsVar, Activity activity, nqi nqiVar, String str) {
        this.zmn = fsVar;
        this.zn = activity;
        this.fb = nqiVar;
        this.btk = str;
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.zmn zmnVar) {
        this.fs = zmnVar;
    }

    public boolean zmn() {
        return this.hhw.get();
    }

    public long fs() {
        return this.nps;
    }

    public void zmn(final JSONObject jSONObject) {
        if (!this.hhw.get() && this.hhw.compareAndSet(false, true)) {
            final View findViewById = this.zn.findViewById(R.id.content);
            if (findViewById == null) {
                findViewById = this.zn.getWindow().getDecorView();
            }
            findViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.fs.fb.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject2 = jSONObject;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("width", findViewById.getWidth());
                        jSONObject3.put("height", findViewById.getHeight());
                        jSONObject3.put("alpha", findViewById.getAlpha());
                        jSONObject2.put("root_view", jSONObject3.toString());
                        jSONObject2.put("dynamic_show_type", fb.this.fb.skn());
                    } catch (Throwable th) {
                        iqz.zmn("UnifyReportManager", "run: ", th);
                    }
                    fb.this.zmn(jSONObject, (JSONObject) null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.openadsdk.fb.zn.zmn(this.fb, this.btk, jSONObject, jSONObject2);
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn zmnVar = this.fs;
        if (zmnVar != null) {
            zmnVar.fs();
        }
    }

    public void zmn(boolean z, com.bytedance.sdk.openadsdk.fb.nps npsVar) {
        if (this.zmn == null) {
            return;
        }
        if (!z && this.hhw.get() && this.nps > 0) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(String.valueOf(SystemClock.elapsedRealtime() - this.nps), this.fb, this.btk, npsVar);
            this.nps = 0L;
        } else {
            this.nps = SystemClock.elapsedRealtime();
        }
    }

    public void zmn(boolean z, nqi nqiVar, String str) {
        if (nqiVar != null && z && nqiVar.dv() && !nqiVar.kjb()) {
            nqiVar.nps(true);
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, nqiVar.rfd());
        }
    }
}
