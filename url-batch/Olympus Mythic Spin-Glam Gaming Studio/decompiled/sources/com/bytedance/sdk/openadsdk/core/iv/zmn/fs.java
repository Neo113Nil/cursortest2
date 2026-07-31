package com.bytedance.sdk.openadsdk.core.iv.zmn;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.adexpress.fs.rc;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.hhw;
import com.bytedance.sdk.openadsdk.fb.fb.btk;
import com.bytedance.sdk.openadsdk.mw.bvs;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.oub;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class fs implements bvs {
    private rc btk;
    private com.bytedance.sdk.openadsdk.core.cn.fb.fs bvs;
    private String fb;
    private final nps fs;
    private JSONObject hhw;
    private int iv = -1;
    private btk nps;
    private Activity rc;
    private hhw zg;
    private final fkt zmn;
    private final nqi zn;

    public fs(fkt fktVar, nps npsVar, nqi nqiVar) {
        this.zmn = fktVar;
        this.fs = npsVar;
        this.zn = nqiVar;
    }

    public fs zmn(rc rcVar) {
        this.btk = rcVar;
        return this;
    }

    public fs zmn(btk btkVar) {
        this.nps = btkVar;
        return this;
    }

    public fs zmn(com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        this.bvs = fsVar;
        return this;
    }

    public fs zmn(String str) {
        this.fb = str;
        return this;
    }

    public fs zmn(JSONObject jSONObject) {
        this.hhw = jSONObject;
        return this;
    }

    public fs zmn(hhw hhwVar) {
        this.zg = hhwVar;
        return this;
    }

    public fs zmn(Activity activity) {
        this.rc = activity;
        return this;
    }

    public void zmn() {
        fkt fktVar;
        nps npsVar = this.fs;
        if (npsVar == null || npsVar.getWebView() == null || (fktVar = this.zmn) == null) {
            return;
        }
        fktVar.fs(this.fs).zmn(true).zmn(this.zn).zn(this.zn.ji()).fb(this.zn.ze()).fs(oub.zmn(this.fb)).btk(this.zn.gor()).zmn(new zn(this.fs)).zmn(this.btk).zmn(this.hhw).fs(this.fb).zmn(this.zn.mig()).zmn(this.rc).zmn(this.fs).zmn(this.nps);
        this.zmn.zmn(new fb(this.fs));
    }

    public void fs() {
        this.fs.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.iv.zmn.fs.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (fs.this.fs == null || fs.this.fs.getViewTreeObserver() == null) {
                    return;
                }
                fs.this.fs.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int measuredWidth = fs.this.fs.getMeasuredWidth();
                int measuredHeight = fs.this.fs.getMeasuredHeight();
                if (fs.this.fs.getVisibility() == 0) {
                    fs.this.zmn.zmn(measuredWidth, measuredHeight);
                }
            }
        });
    }

    public void zn() {
        DeviceUtils.AudioInfoReceiver.zmn(this);
        this.iv = DeviceUtils.nps();
    }

    public void fb() {
        DeviceUtils.AudioInfoReceiver.zmn(this);
    }

    @Override // com.bytedance.sdk.openadsdk.mw.bvs
    public void zn(int i) {
        fkt fktVar = this.zmn;
        if (fktVar == null) {
            return;
        }
        int i2 = this.iv;
        if (i2 <= 0 && i > 0) {
            fktVar.nps(false);
        } else if (i2 > 0 && i == 0) {
            fktVar.nps(true);
        }
        this.iv = i;
    }

    public void btk() {
        fkt fktVar = this.zmn;
        if (fktVar == null) {
            return;
        }
        fktVar.zg(false);
    }

    public void hhw() {
        nps npsVar;
        if (this.zmn == null || (npsVar = this.fs) == null || npsVar.getWebView() == null) {
            return;
        }
        this.zmn.zg(this.fs.getVisibility() == 0);
    }
}
