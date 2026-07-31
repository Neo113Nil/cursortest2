package com.bytedance.sdk.openadsdk.kgc;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.kgc;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.iv;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes12.dex */
class btk implements fb {
    private int btk;
    private int fb;
    private fb fs;
    private int zmn;
    private int zn;

    public btk(fb fbVar, int i, int i2, int i3) {
        this.zmn = Integer.MIN_VALUE;
        this.fs = fbVar;
        this.zn = i;
        this.fb = i2;
        this.btk = i3;
        Context zmn = zmn.zmn();
        if (zmn != null) {
            this.zmn = kgc.zn(zmn);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.kgc.fb
    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
        JSONObject jsonObjectInit;
        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn = this.fs.zmn();
        zmn.zmn(BuildConfig.VERSION_NAME);
        zmn.zmn(this.zn);
        zmn.fs(this.fb);
        zmn.zn(this.btk);
        zmn.hhw(iv.fs().nps());
        zmn.fb(cn.fb());
        String zn = zmn.zn();
        if (this.zmn != Integer.MIN_VALUE && ("get_ad".equals(zn) || "dislike".equals(zn) || "settings_fetch".equals(zn) || "reward".equals(zn) || "strategy_fetch".equals(zn))) {
            try {
                String mw = zmn.mw();
                if (TextUtils.isEmpty(mw)) {
                    jsonObjectInit = new JSONObject();
                } else {
                    jsonObjectInit = PangleNetworkBridge.jsonObjectInit(mw);
                }
                jsonObjectInit.put("nt", this.zmn);
                zmn.nps(jsonObjectInit.toString());
            } catch (Throwable unused) {
            }
        }
        return zmn;
    }
}
