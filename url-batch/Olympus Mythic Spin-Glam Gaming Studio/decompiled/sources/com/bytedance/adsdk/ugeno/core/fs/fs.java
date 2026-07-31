package com.bytedance.adsdk.ugeno.core.fs;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.cn;
import com.bytedance.adsdk.ugeno.core.iv;
import com.bytedance.adsdk.ugeno.core.mw;
import com.bytedance.adsdk.ugeno.nps.bvs;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class fs implements bvs.zmn {
    private com.bytedance.adsdk.ugeno.fs.zn btk;
    private mw fb;
    private cn fs;
    private Handler hhw = new bvs(Looper.getMainLooper(), this);
    private int zmn;
    private Context zn;

    public fs(Context context, mw mwVar, com.bytedance.adsdk.ugeno.fs.zn znVar) {
        this.zn = context;
        this.fb = mwVar;
        this.btk = znVar;
    }

    public void zmn(cn cnVar) {
        this.fs = cnVar;
    }

    public void zmn() {
        mw mwVar = this.fb;
        if (mwVar == null) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(com.bytedance.adsdk.ugeno.zn.fs.zmn(mwVar.zn().optString(POBCTAOverlayData.KEY_CTA_DELAY), this.btk.klz()));
            this.zmn = parseInt;
            this.hhw.sendEmptyMessageDelayed(1001, parseInt);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.nps.bvs.zmn
    public void zmn(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject zn = this.fb.zn();
        if (TextUtils.equals(zn.optString("type"), "onAnimation")) {
            String optString = zn.optString("nodeId");
            com.bytedance.adsdk.ugeno.fs.zn znVar = this.btk;
            com.bytedance.adsdk.ugeno.fs.zn btk = znVar.fs(znVar).btk(optString);
            new iv(btk.rc(), com.bytedance.adsdk.ugeno.core.zmn.zmn(zn.optJSONObject("animatorSet"), btk)).zmn();
        } else {
            cn cnVar = this.fs;
            if (cnVar != null) {
                mw mwVar = this.fb;
                com.bytedance.adsdk.ugeno.fs.zn znVar2 = this.btk;
                cnVar.zmn(mwVar, znVar2, znVar2);
            }
        }
        this.hhw.removeMessages(1001);
    }
}
