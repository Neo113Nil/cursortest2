package com.bytedance.sdk.openadsdk.component.reward.zn.fs;

import android.app.Activity;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.component.reward.klz;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.nqi;
import com.bytedance.sdk.openadsdk.core.uqh;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.O6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class hhw implements klz.zmn {
    private String btk;
    private com.bytedance.sdk.openadsdk.component.reward.zn.hhw bvs;
    private Activity fb;
    private String hhw;
    private int nps;
    private long zg;
    private nqi zn;
    private final AtomicBoolean zmn = new AtomicBoolean(false);
    private final AtomicInteger fs = new AtomicInteger(0);

    public hhw(nqi nqiVar, Activity activity, String str, String str2) {
        this.zn = nqiVar;
        this.fb = activity;
        this.btk = str;
        this.hhw = str2;
    }

    public void zmn() {
        if (this.zn != null && this.zmn.get()) {
            this.zn.bvs(true);
        }
    }

    public void fs() {
        nqi nqiVar = this.zn;
        if (nqiVar == null || !nqiVar.jy()) {
            return;
        }
        this.zmn.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.klz.zmn
    public void zmn(int i, boolean z) {
        if (this.zmn.get()) {
            return;
        }
        zmn(0L, 0, 13);
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.hhw hhwVar) {
        this.bvs = hhwVar;
    }

    public void zmn(long j, int i, final int i2) {
        this.nps = i;
        this.zg = j;
        if (this.zmn.get()) {
            return;
        }
        this.zmn.set(true);
        if (kgc.fb().olo(String.valueOf(this.zn.qvo()))) {
            this.fs.set(1);
            com.bytedance.sdk.openadsdk.component.reward.zn.hhw hhwVar = this.bvs;
            if (hhwVar != null) {
                hhwVar.fs(true, this.zn.zi(), this.zn.rje(), 0, "", i2);
                return;
            }
            return;
        }
        kgc.zn().zmn(zn(), new nqi.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.fs.hhw.1
            @Override // com.bytedance.sdk.openadsdk.core.nqi.fs
            public void zmn(int i3, String str) {
                if (hhw.this.bvs != null) {
                    hhw.this.bvs.fs(false, 0, "", i3, str, i2);
                }
                hhw.this.fs.set(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.nqi.fs
            public void zmn(uqh.fs fsVar) {
                boolean z = fsVar.fs;
                int zmn = fsVar.zn.zmn();
                String fs = fsVar.zn.fs();
                if (hhw.this.bvs != null) {
                    hhw.this.bvs.fs(fsVar.fs, zmn, fs, 0, "", i2);
                }
                hhw.this.fs.set(1);
            }
        });
    }

    private JSONObject zn() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.zn.rje());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.zn.zi());
            jSONObject.put("network", com.bytedance.sdk.component.utils.kgc.zn(this.fb.getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int mig = this.zn.mig();
            String str = "unKnow";
            if (mig == 2) {
                str = oub.fs();
            } else if (mig == 1) {
                str = oub.fb();
            }
            jSONObject.put("user_agent", str);
            JSONObject wu = this.zn.wu();
            if (wu != null) {
                wu.put(O6.X0, com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().fs());
            }
            jSONObject.put("extra", wu);
            jSONObject.put("media_extra", this.hhw);
            jSONObject.put("video_duration", this.zn.mrt().hhw());
            jSONObject.put("play_start_ts", this.zg);
            jSONObject.put("play_end_ts", System.currentTimeMillis());
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, this.nps);
            jSONObject.put("user_id", this.btk);
            jSONObject.put("trans_id", kjb.zmn().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            iqz.zmn("RewardFullRewardManager", "", th);
            return null;
        }
    }
}
