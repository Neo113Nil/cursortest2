package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.activity.TTFullWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.component.reward.mw;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.kjb;
import java.util.Map;

/* loaded from: classes8.dex */
class zg extends PAGInterstitialAd {
    private final mw fb;
    private com.bytedance.sdk.openadsdk.zmn.zn.fs fs;
    private final com.bytedance.sdk.openadsdk.core.model.zmn zmn;
    private final String zn = kjb.zmn();

    zg(Context context, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        this.zmn = zmnVar;
        this.fb = new mw(context, zmnVar, "fullscreen_interstitial_ad", new mw.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zg.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.mw.zmn
            public Intent zmn(Context context2, nqi nqiVar, @Nullable Activity activity) {
                if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(nqiVar)) {
                    return new Intent(context2, (Class<?>) TTFullWebActivity.class);
                }
                if (nqiVar.dgt()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                if (nqiVar.hhw()) {
                    return new Intent(context2, (Class<?>) TTFullScreenExpressVideoActivity.class);
                }
                return new Intent(context2, (Class<?>) TTFullScreenVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.mw.zmn
            public void zmn(Intent intent, @Nullable Activity activity, nqi nqiVar, boolean z) {
                com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(intent, activity, zg.this.fb.zn(), zg.this.zmn, zg.this.zn);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.mw.zmn
            public void zmn(boolean z) {
                if (zg.this.fs == null) {
                    return;
                }
                if (z) {
                    am.zmn().zmn(zg.this.zn, (String) zg.this.fs);
                } else {
                    am.zmn().zmn(zg.this.fs);
                }
                zg.this.fs = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.mw.zmn
            public void zmn(nqi nqiVar) {
                fs.zmn(nqiVar, zg.this.fb.zn(), false);
            }
        });
    }

    public void zmn() {
        this.fb.zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.fs = new com.bytedance.sdk.openadsdk.component.zn.zmn(pAGInterstitialAdInteractionListener, this.zmn);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.fs = new com.bytedance.sdk.openadsdk.component.zn.zmn(pAGInterstitialAdInteractionCallback, this.zmn);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        this.fb.zmn(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.fb.fs();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.fb.zmn(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        this.fb.zmn(d);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        this.fb.zmn(d, str, str2);
    }
}
