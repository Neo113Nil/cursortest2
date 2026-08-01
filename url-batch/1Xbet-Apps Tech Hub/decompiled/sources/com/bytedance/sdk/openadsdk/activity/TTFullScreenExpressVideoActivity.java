package com.bytedance.sdk.openadsdk.activity;

import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.component.reward.icD.so;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.icD.yiw;
import com.google.android.material.card.MaterialCardViewHelper;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean cR() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void vG() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.core.video.vG.icD
    public boolean pvs(long j, boolean z) {
        yiw yiwVar;
        if (this.icD.dX != null && this.icD.dX.pvs() != null) {
            yiwVar = this.icD.dX.pvs().getAdShowTime();
        } else {
            yiwVar = new yiw();
        }
        if (this.vG != null && (this.vG instanceof so) && !this.icD.BSi) {
            this.icD.ny.pvs(((so) this.vG).gA(), yiwVar);
        } else {
            this.icD.ny.pvs(this.icD.dX.icD(), yiwVar);
        }
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
        this.icD.ny.pvs(new vG.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.1
            boolean pvs;

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs(long j2, int i) {
                if (this.pvs) {
                    return;
                }
                this.pvs = true;
                TTFullScreenExpressVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                TTFullScreenExpressVideoActivity.this.bNS();
                TTFullScreenExpressVideoActivity.this.icD.ny.pvs(j2, j2);
                TTFullScreenExpressVideoActivity.this.icD.dX.icD(true);
                if (TTFullScreenExpressVideoActivity.this.icD.icD.mnm() == 21 && !TTFullScreenExpressVideoActivity.this.icD.icD.Jd()) {
                    TTFullScreenExpressVideoActivity.this.icD.icD.icD(true);
                    TTFullScreenExpressVideoActivity.this.icD.gSd.vA();
                }
                if (TTFullScreenExpressVideoActivity.this.icD.vG) {
                    if (TTFullScreenExpressVideoActivity.this.icD.icD.pY()) {
                        if (TTFullScreenExpressVideoActivity.this.icD.dX.Mxy() == 1) {
                            TTFullScreenExpressVideoActivity.this.icD.cRf.vG();
                            return;
                        }
                        return;
                    } else {
                        TTFullScreenExpressVideoActivity.this.pvs(false, 5);
                        if (cR.NB(TTFullScreenExpressVideoActivity.this.icD.icD)) {
                            return;
                        }
                        TTFullScreenExpressVideoActivity.this.icD.ny.pvs("skip", true);
                        return;
                    }
                }
                if (cR.NB(TTFullScreenExpressVideoActivity.this.icD.icD)) {
                    TTFullScreenExpressVideoActivity.this.finish();
                    return;
                }
                if (TTFullScreenExpressVideoActivity.this.icD.dX == null || TTFullScreenExpressVideoActivity.this.icD.dX.pvs() == null) {
                    return;
                }
                TTFullScreenExpressVideoActivity.this.icD.dX.pvs().pvs("0", 0, 0, false);
                if (TTFullScreenExpressVideoActivity.this.icD.dX.so()) {
                    TTFullScreenExpressVideoActivity.this.icD.cRf.pvs("0", "X");
                    TTFullScreenExpressVideoActivity.this.icD.cRf.NB(true);
                    TTFullScreenExpressVideoActivity.this.icD.cRf.vG();
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void icD(long j2, int i) {
                TTFullScreenExpressVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                if (TTFullScreenExpressVideoActivity.this.icD.ny.icD()) {
                    TTFullScreenExpressVideoActivity.this.Ju();
                    return;
                }
                TTFullScreenExpressVideoActivity.this.icD.ny.Ju();
                Ju.pvs("TTAD.FSEVA", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                TTFullScreenExpressVideoActivity.this.icD.dX.pvs(true);
                if (TTFullScreenExpressVideoActivity.this.icD.vG) {
                    TTFullScreenExpressVideoActivity.this.pvs(false, 3);
                    TTFullScreenExpressVideoActivity.this.icD.ny.pvs(!TTFullScreenExpressVideoActivity.this.icD.ny.CvL() ? 1 : 0, 2);
                } else {
                    TTFullScreenExpressVideoActivity.this.finish();
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs() {
                TTFullScreenExpressVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                TTFullScreenExpressVideoActivity.this.bNS();
                Object[] objArr = new Object[2];
                if (TTFullScreenExpressVideoActivity.this.icD.vG) {
                    TTFullScreenExpressVideoActivity.this.pvs(false, 6);
                } else {
                    TTFullScreenExpressVideoActivity.this.finish();
                }
                TTFullScreenExpressVideoActivity.this.icD.ny.pvs(!TTFullScreenExpressVideoActivity.this.icD.ny.CvL() ? 1 : 0, !TTFullScreenExpressVideoActivity.this.icD.ny.CvL() ? 1 : 0);
                TTFullScreenExpressVideoActivity.this.icD.ny.Ju();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs(long j2, long j3) {
                if (!TTFullScreenExpressVideoActivity.this.icD.ZsW && TTFullScreenExpressVideoActivity.this.icD.ny.icD()) {
                    TTFullScreenExpressVideoActivity.this.icD.ny.bNS();
                }
                if (TTFullScreenExpressVideoActivity.this.icD.Wyp.get()) {
                    return;
                }
                TTFullScreenExpressVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                if (j2 != TTFullScreenExpressVideoActivity.this.icD.ny.so()) {
                    TTFullScreenExpressVideoActivity.this.bNS();
                }
                if (TTFullScreenExpressVideoActivity.this.icD.ny.icD()) {
                    TTFullScreenExpressVideoActivity.this.icD.ny.pvs(j2, j3);
                    TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity = TTFullScreenExpressVideoActivity.this;
                    long j4 = j2 / 1000;
                    tTFullScreenExpressVideoActivity.sUS = (int) (tTFullScreenExpressVideoActivity.icD.ny.Gp() - j4);
                    int i = (int) j4;
                    if ((TTFullScreenExpressVideoActivity.this.icD.uc.get() || TTFullScreenExpressVideoActivity.this.icD.qh.get()) && TTFullScreenExpressVideoActivity.this.icD.ny.icD()) {
                        TTFullScreenExpressVideoActivity.this.icD.ny.bNS();
                    }
                    if (TTFullScreenExpressVideoActivity.this.icD.dX != null && TTFullScreenExpressVideoActivity.this.icD.dX.pvs() != null) {
                        TTFullScreenExpressVideoActivity.this.icD.dX.pvs().pvs(String.valueOf(TTFullScreenExpressVideoActivity.this.sUS), i, 0, false);
                    }
                    if (TTFullScreenExpressVideoActivity.this.icD.dX.so() || TTFullScreenExpressVideoActivity.this.icD.icD.OBt()) {
                        TTFullScreenExpressVideoActivity.this.vG(i);
                        if (TTFullScreenExpressVideoActivity.this.sUS >= 0) {
                            TTFullScreenExpressVideoActivity.this.icD.cRf.Jd(true);
                            TTFullScreenExpressVideoActivity.this.icD.cRf.pvs(String.valueOf(TTFullScreenExpressVideoActivity.this.sUS), null);
                        }
                    }
                }
            }
        });
        return this.icD.ny.pvs(j, z, hashMap, this.vG);
    }
}
