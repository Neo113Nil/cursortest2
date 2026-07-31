package com.bytedance.sdk.openadsdk.component.reward;

import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.oub;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class klz {
    private boolean btk;
    private long fb;
    private long fs;
    private boolean hhw;
    private final JSONObject nps;
    private final zmn zmn;
    private long zn;

    public interface zmn {
        void zmn(int i, boolean z);
    }

    public klz(zmn zmnVar) {
        this.btk = true;
        this.zmn = zmnVar;
        JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.uqh.btk.zmn("reward_callback_backup", (Object) null, com.bytedance.sdk.openadsdk.uqh.fs.zmn);
        this.nps = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.btk = false;
    }

    public static void zmn(nqi nqiVar, boolean z, final int i) {
        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, oub.zmn(nqiVar), z ? "reward_callback" : "reward_fail_callback", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.klz.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reason", i);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public void zmn(long j) {
        if (j <= this.fs) {
            return;
        }
        this.fs = Math.min(30L, j);
    }

    public void zmn() {
        if (!this.btk && this.zn > 0) {
            this.fb += SystemClock.elapsedRealtime() - this.zn;
            this.zn = 0L;
        }
    }

    public void fs() {
        if (this.btk) {
            return;
        }
        this.zn = SystemClock.elapsedRealtime();
    }

    public void zn() {
        this.btk = true;
    }

    public void fb() {
        JSONObject jSONObject;
        if (this.zmn != null) {
            long elapsedRealtime = (this.fb + (this.zn > 0 ? SystemClock.elapsedRealtime() - this.zn : 0L)) / 1000;
            if (this.btk || (jSONObject = this.nps) == null || "off".equals(jSONObject.optString("type"))) {
                return;
            }
            if ("force".equals(this.nps.optString("type"))) {
                if (elapsedRealtime >= this.nps.optInt("value", -1)) {
                    this.hhw = true;
                    this.zmn.zmn(1, true);
                    return;
                }
                return;
            }
            if (Constants.NORMAL.equals(this.nps.optString("type"))) {
                int optInt = this.nps.optInt("value", -1);
                if (optInt < 0 && elapsedRealtime >= this.fs) {
                    this.hhw = false;
                    this.zmn.zmn(1, false);
                } else {
                    if (optInt < 0 || elapsedRealtime < optInt) {
                        return;
                    }
                    this.hhw = false;
                    this.zmn.zmn(1, false);
                }
            }
        }
    }
}
