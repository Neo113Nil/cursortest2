package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.widget.pvs.sUS;
import com.bytedance.sdk.openadsdk.utils.kj;

/* compiled from: LandingPageNewStyleManager.java */
/* loaded from: classes2.dex */
public class so {
    private SSWebView Jd;
    private ImageView NB;
    private RelativeLayout icD;
    private final cR pvs;
    private final String sUS;
    private Mxy so;
    private final Context vG;
    private qh yiw;

    public so(Context context, cR cRVar, String str) {
        this.vG = context;
        this.pvs = cRVar;
        this.sUS = str;
        sUS();
    }

    private static RelativeLayout pvs(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new LandingPageBrowserNewTitleBar(context));
        SSWebView sSWebView = new SSWebView(context);
        sSWebView.setId(kj.sq);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, kj.Ca);
        relativeLayout.addView(sSWebView, layoutParams);
        LandingPageBrowserNewBottomBar landingPageBrowserNewBottomBar = new LandingPageBrowserNewBottomBar(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(landingPageBrowserNewBottomBar.getLayoutParams());
        layoutParams2.addRule(12);
        relativeLayout.addView(landingPageBrowserNewBottomBar, layoutParams2);
        return relativeLayout;
    }

    private void sUS() {
        RelativeLayout pvs = pvs(this.vG);
        this.icD = pvs;
        this.Jd = (SSWebView) pvs.findViewById(kj.sq);
        qh qhVar = new qh(this.vG, (RelativeLayout) this.icD.findViewById(kj.Ca), this.pvs);
        this.yiw = qhVar;
        this.NB = qhVar.vG();
        this.so = new Mxy(this.vG, (LinearLayout) this.icD.findViewById(kj.tQ), this.Jd, this.pvs, this.sUS);
    }

    public void pvs() {
        qh qhVar = this.yiw;
        if (qhVar != null) {
            qhVar.pvs();
        }
        Mxy mxy = this.so;
        if (mxy != null) {
            mxy.pvs();
        }
    }

    public void icD() {
        qh qhVar = this.yiw;
        if (qhVar != null) {
            qhVar.icD();
        }
        Mxy mxy = this.so;
        if (mxy != null) {
            mxy.icD();
        }
    }

    public ImageView vG() {
        return this.NB;
    }

    public SSWebView Jd() {
        return this.Jd;
    }

    public View NB() {
        return this.icD;
    }

    public void pvs(WebView webView, int i, sUS.pvs pvsVar) {
        qh qhVar = this.yiw;
        if (qhVar != null) {
            qhVar.pvs(i);
        }
        Mxy mxy = this.so;
        if (mxy != null) {
            mxy.pvs(webView, pvsVar);
        }
    }
}
