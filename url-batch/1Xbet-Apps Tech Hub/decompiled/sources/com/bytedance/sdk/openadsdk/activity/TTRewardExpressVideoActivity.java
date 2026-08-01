package com.bytedance.sdk.openadsdk.activity;

import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.icD.yiw;
import com.google.android.material.card.MaterialCardViewHelper;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean cR() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void vG() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.core.video.vG.icD
    public boolean pvs(long j, boolean z) {
        yiw yiwVar;
        if (this.icD.dX != null && this.icD.dX.pvs() != null) {
            yiwVar = this.icD.dX.pvs().getAdShowTime();
        } else {
            yiwVar = new yiw();
        }
        this.icD.ny.pvs(this.icD.dX.icD(), yiwVar);
        HashMap hashMap = new HashMap();
        if (this.icD.dX != null) {
            hashMap.put("dynamic_show_type", Integer.valueOf(this.icD.dX.Mxy()));
            JSONObject pvs = this.icD.dX.pvs((JSONObject) null);
            if (pvs != null) {
                Iterator<String> keys = pvs.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        hashMap.put(next, pvs.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        this.icD.ny.pvs(new vG.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.1
            boolean pvs;

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs(long j2, int i) {
                if (this.pvs) {
                    return;
                }
                this.pvs = true;
                TTRewardExpressVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                TTRewardExpressVideoActivity.this.bNS();
                TTRewardExpressVideoActivity.this.icD.ny.pvs(j2, j2);
                TTRewardExpressVideoActivity.this.icD.dX.icD(true);
                if (TTRewardExpressVideoActivity.this.icD.icD.mnm() == 21 && !TTRewardExpressVideoActivity.this.icD.icD.Jd()) {
                    TTRewardExpressVideoActivity.this.icD.icD.icD(true);
                    TTRewardExpressVideoActivity.this.icD.gSd.vA();
                }
                if (TTRewardExpressVideoActivity.this.icD.vG) {
                    if (TTRewardExpressVideoActivity.this.icD.icD.pY()) {
                        if (TTRewardExpressVideoActivity.this.icD.dX.Mxy() == 1) {
                            TTRewardExpressVideoActivity.this.icD.cRf.vG();
                        }
                    } else {
                        TTRewardExpressVideoActivity.this.pvs(false, 5);
                        if (!cR.NB(TTRewardExpressVideoActivity.this.icD.icD)) {
                            TTRewardExpressVideoActivity.this.icD.ny.pvs("skip", true);
                        }
                    }
                } else if (TTRewardExpressVideoActivity.this.icD.icD.pY()) {
                    if (TTRewardExpressVideoActivity.this.icD.dX.Mxy() == 1) {
                        TTRewardExpressVideoActivity.this.icD.cRf.vG();
                    }
                } else {
                    if (!cR.NB(TTRewardExpressVideoActivity.this.icD.icD)) {
                        TTRewardExpressVideoActivity.this.icD.ny.pvs("skip", true);
                    }
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.kj = (int) (System.currentTimeMillis() / 1000);
                TTRewardExpressVideoActivity.this.zM();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void icD(long j2, int i) {
                TTRewardExpressVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                if (TTRewardExpressVideoActivity.this.icD.ny.icD()) {
                    TTRewardExpressVideoActivity.this.Ju();
                    return;
                }
                TTRewardExpressVideoActivity.this.zM();
                TTRewardExpressVideoActivity.this.icD.ny.Ju();
                if (TTRewardExpressVideoActivity.this.icD.vG) {
                    TTRewardExpressVideoActivity.this.pvs(false, 3);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.icD.dX.pvs(true);
                TTRewardExpressVideoActivity.this.icD.ny.pvs(1 ^ (TTRewardExpressVideoActivity.this.icD.ny.CvL() ? 1 : 0), 2);
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs() {
                TTRewardExpressVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                TTRewardExpressVideoActivity.this.bNS();
                TTRewardExpressVideoActivity.this.zM();
                if (TTRewardExpressVideoActivity.this.icD.vG) {
                    TTRewardExpressVideoActivity.this.pvs(false, 6);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.icD.ny.pvs(!TTRewardExpressVideoActivity.this.icD.ny.CvL() ? 1 : 0, !TTRewardExpressVideoActivity.this.icD.ny.CvL() ? 1 : 0);
                TTRewardExpressVideoActivity.this.icD.ny.Ju();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs(long j2, long j3) {
                if (!TTRewardExpressVideoActivity.this.icD.ZsW && TTRewardExpressVideoActivity.this.icD.ny.icD()) {
                    TTRewardExpressVideoActivity.this.icD.ny.bNS();
                }
                if (TTRewardExpressVideoActivity.this.icD.Wyp.get()) {
                    return;
                }
                TTRewardExpressVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                if (j2 != TTRewardExpressVideoActivity.this.icD.ny.so()) {
                    TTRewardExpressVideoActivity.this.bNS();
                }
                if (TTRewardExpressVideoActivity.this.icD.ny.icD()) {
                    TTRewardExpressVideoActivity.this.icD.ny.pvs(j2, j3);
                    int Wyp = mnm.Jd().Wyp(String.valueOf(TTRewardExpressVideoActivity.this.icD.sUS));
                    boolean z2 = TTRewardExpressVideoActivity.this.icD.dX.so() && Wyp >= 0;
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                    long j4 = j2 / 1000;
                    tTRewardExpressVideoActivity.sUS = (int) (tTRewardExpressVideoActivity.icD.ny.Gp() - j4);
                    int i = (int) j4;
                    if ((TTRewardExpressVideoActivity.this.icD.uc.get() || TTRewardExpressVideoActivity.this.icD.qh.get()) && TTRewardExpressVideoActivity.this.icD.ny.icD()) {
                        TTRewardExpressVideoActivity.this.icD.ny.bNS();
                    }
                    if (TTRewardExpressVideoActivity.this.sUS >= 0) {
                        TTRewardExpressVideoActivity.this.icD.cRf.pvs(String.valueOf(TTRewardExpressVideoActivity.this.sUS), null);
                    }
                    TTRewardExpressVideoActivity.this.icD.gSd.NB(i);
                    TTRewardExpressVideoActivity.this.pvs(j2, j3);
                    if (TTRewardExpressVideoActivity.this.icD.dX != null && TTRewardExpressVideoActivity.this.icD.dX.pvs() != null) {
                        TTRewardExpressVideoActivity.this.icD.dX.pvs().pvs(String.valueOf(TTRewardExpressVideoActivity.this.sUS), i, 0, false);
                    }
                    if (TTRewardExpressVideoActivity.this.sUS > 0) {
                        if (z2 && i >= Wyp && TTRewardExpressVideoActivity.this.icD.icD.mnm() != 5 && TTRewardExpressVideoActivity.this.icD.icD.mnm() != 33) {
                            TTRewardExpressVideoActivity.this.icD.pvs(true);
                            TTRewardExpressVideoActivity.this.icD.cRf.pvs(String.valueOf(TTRewardExpressVideoActivity.this.sUS), TTAdDislikeToast.getSkipText());
                            TTRewardExpressVideoActivity.this.icD.cRf.NB(true);
                            return;
                        }
                        TTRewardExpressVideoActivity.this.icD.cRf.pvs(String.valueOf(TTRewardExpressVideoActivity.this.sUS), null);
                    }
                }
            }
        });
        boolean pvs2 = this.icD.ny.pvs(j, z, hashMap, this.vG);
        if (pvs2 && !z) {
            this.qh = (int) (System.currentTimeMillis() / 1000);
        }
        return pvs2;
    }
}
