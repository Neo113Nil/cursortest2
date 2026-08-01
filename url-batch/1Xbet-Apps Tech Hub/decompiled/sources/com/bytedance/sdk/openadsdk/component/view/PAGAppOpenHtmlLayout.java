package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.vG;
import com.bytedance.sdk.openadsdk.core.widget.DSPAdChoice;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class PAGAppOpenHtmlLayout extends PAGAppOpenBaseLayout {
    pvs IP;

    public interface pvs {
        void pvs(View view, int i);
    }

    public PAGAppOpenHtmlLayout(Context context, cR cRVar) {
        super(context);
        pvs(context, cRVar);
    }

    private void pvs(Context context, cR cRVar) {
        DspHtmlWebView dspHtmlWebView = new DspHtmlWebView(context);
        vG.pvs().vG(dspHtmlWebView);
        dspHtmlWebView.pvs(cRVar, new DspHtmlWebView.icD() { // from class: com.bytedance.sdk.openadsdk.component.view.PAGAppOpenHtmlLayout.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.icD
            public void f_() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.icD
            public void pvs(int i, int i2) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.icD
            public View pvs() {
                if (PAGAppOpenHtmlLayout.this.Mxy != null) {
                    return PAGAppOpenHtmlLayout.this.Mxy.getTopDislike();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.icD
            public View icD() {
                return PAGAppOpenHtmlLayout.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.icD
            public void pvs(View view, int i) {
                if (PAGAppOpenHtmlLayout.this.IP != null) {
                    PAGAppOpenHtmlLayout.this.IP.pvs(view, i);
                }
            }
        }, "open_ad");
        addView(dspHtmlWebView, new ViewGroup.LayoutParams(-1, -1));
        dspHtmlWebView.mnm();
        int icD = Pj.icD(context, 9.0f);
        int icD2 = Pj.icD(context, 10.0f);
        this.Jd = new PAGLogoView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, Pj.icD(context, 14.0f));
        layoutParams.leftMargin = icD2;
        layoutParams.bottomMargin = icD2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.Jd, layoutParams);
        this.Ju = new DSPAdChoice(context);
        this.Ju.setPadding(icD, 0, icD, 0);
        this.Ju.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Pj.icD(context, 32.0f), Pj.icD(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, icD2, icD2);
        addView(this.Ju, layoutParams2);
        if (this.Mxy != null) {
            addView(this.Mxy);
        }
    }

    public void setRenderListener(pvs pvsVar) {
        this.IP = pvsVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.IP = null;
    }
}
