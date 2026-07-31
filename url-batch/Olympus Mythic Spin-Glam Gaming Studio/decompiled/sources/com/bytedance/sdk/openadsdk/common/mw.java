package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.nps;

/* loaded from: classes6.dex */
public class mw {
    private ImageView btk;
    private com.bytedance.sdk.component.bvs.nps fb;
    private RelativeLayout fs;
    private final String hhw;
    private doe nps;
    private boolean zg;
    private final nqi zmn;
    private final Context zn;

    public mw(Context context, nqi nqiVar, String str, boolean z) {
        this.zn = context;
        this.zmn = nqiVar;
        this.hhw = str;
        this.zg = z;
        btk();
    }

    private static RelativeLayout zmn(Context context, boolean z) {
        com.bytedance.sdk.component.bvs.nps npsVar;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new bvs(context));
        nps.zn znVar = nps.zn.LANDING_PAGE;
        new com.bytedance.sdk.component.bvs.nps(context, znVar);
        if (z) {
            npsVar = new com.bytedance.sdk.component.bvs.nps(context, nps.zn.PRIVACY);
        } else {
            npsVar = new com.bytedance.sdk.component.bvs.nps(context, znVar);
        }
        npsVar.setId(com.bytedance.sdk.openadsdk.utils.olo.gn);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.olo.obg);
        if (z) {
            relativeLayout.addView(npsVar, layoutParams);
        }
        return relativeLayout;
    }

    private void btk() {
        RelativeLayout zmn = zmn(this.zn, this.zg);
        this.fs = zmn;
        this.fb = (com.bytedance.sdk.component.bvs.nps) zmn.findViewById(com.bytedance.sdk.openadsdk.utils.olo.gn);
        doe doeVar = new doe(this.zn, (RelativeLayout) this.fs.findViewById(com.bytedance.sdk.openadsdk.utils.olo.obg), this.zmn, this.fb, this.hhw, this.zg);
        this.nps = doeVar;
        this.btk = doeVar.btk();
    }

    public void zmn() {
        doe doeVar = this.nps;
        if (doeVar != null) {
            doeVar.fs();
        }
    }

    public void fs() {
        doe doeVar = this.nps;
        if (doeVar != null) {
            doeVar.zn();
        }
    }

    public com.bytedance.sdk.component.bvs.nps zn() {
        return this.fb;
    }

    public View fb() {
        return this.fs;
    }

    public void zmn(WebView webView, nps.zmn zmnVar) {
        doe doeVar = this.nps;
        if (doeVar != null) {
            doeVar.zmn(webView, zmnVar);
        }
    }

    public void zmn(String str) {
        this.nps.zmn(str);
    }

    public void fs(String str) {
        this.nps.fs(str);
    }

    public void zmn(boolean z) {
        this.nps.zmn(z);
    }
}
