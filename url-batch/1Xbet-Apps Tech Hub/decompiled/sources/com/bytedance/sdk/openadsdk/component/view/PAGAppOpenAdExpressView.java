package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.component.adexpress.icD.IP;
import com.bytedance.sdk.component.adexpress.icD.Jd;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.ugen.vG.icD;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PAGAppOpenAdExpressView extends NativeExpressView {
    private vG.pvs Jd;
    private FrameLayout icD;
    boolean pvs;
    private com.bytedance.sdk.openadsdk.component.sUS.pvs vG;

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void pvs(int i, String str) {
    }

    public PAGAppOpenAdExpressView(Context context, cR cRVar, AdSlot adSlot, String str) {
        super(context, cRVar, adSlot, str, true, true);
        this.pvs = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected void sUS() {
        this.IP = true;
        this.icD = new FrameLayout(this.so);
        if (!com.bytedance.sdk.openadsdk.core.ugen.vG.pvs(this.qh)) {
            addView(this.icD, new FrameLayout.LayoutParams(-1, -1));
        }
        super.sUS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public int getDynamicShowType() {
        if (this.Gp == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.icD.bNS
    public void pvs(Jd<? extends View> jd, IP ip) {
        this.Gp = jd;
        if (ip != null && ip.vG()) {
            icD(ip);
        }
        super.pvs(jd, ip);
    }

    public void icD(final IP ip) {
        if (ip == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.view.PAGAppOpenAdExpressView.1
            @Override // java.lang.Runnable
            public void run() {
                PAGAppOpenAdExpressView.this.vG(ip);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG(IP ip) {
        if (ip == null) {
            return;
        }
        if (ip.pvs() != null) {
            if (this.pvs) {
                ip.pvs().setTag(com.bytedance.sdk.component.adexpress.dynamic.pvs.sUS, 1);
                ((FrameLayout) ip.pvs()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) ip.pvs();
                this.icD = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.pvs = false;
                return;
            }
            return;
        }
        double sUS = ip.sUS();
        double yiw = ip.yiw();
        double so = ip.so();
        double Mxy = ip.Mxy();
        int icD = Pj.icD(this.so, (float) sUS);
        int icD2 = Pj.icD(this.so, (float) yiw);
        int icD3 = Pj.icD(this.so, (float) so);
        int icD4 = Pj.icD(this.so, (float) Mxy);
        if ((Mxy == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || so == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) && this.Gp.vG() != 7) {
            return;
        }
        if (this.Gp.vG() == 7 && (ip instanceof icD)) {
            FrameLayout mnm = ((icD) ip).mnm();
            if (mnm != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                mnm.addView(this.icD, layoutParams);
                return;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.icD.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(icD3, icD4);
        }
        layoutParams2.width = icD3;
        layoutParams2.height = icD4;
        layoutParams2.topMargin = icD2;
        layoutParams2.leftMargin = icD;
        layoutParams2.setMarginStart(layoutParams2.leftMargin);
        layoutParams2.setMarginEnd(layoutParams2.rightMargin);
        this.icD.setLayoutParams(layoutParams2);
    }

    public void setExpressVideoListenerProxy(vG.pvs pvsVar) {
        this.Jd = pvsVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void pvs() {
        com.bytedance.sdk.openadsdk.component.sUS.pvs pvsVar = this.vG;
        if (pvsVar != null) {
            pvsVar.pvs(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void icD() {
        super.icD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void pvs(int i) {
        super.pvs(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void NB() {
        com.bytedance.sdk.openadsdk.component.sUS.pvs pvsVar = this.vG;
        if (pvsVar != null) {
            pvsVar.icD(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.icD.so
    public void pvs(View view, int i, com.bytedance.sdk.component.adexpress.vG vGVar) {
        if (i != -1 && vGVar != null && i == 3) {
            NB();
        } else {
            super.pvs(view, i, vGVar);
        }
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.sUS.pvs pvsVar) {
        this.vG = pvsVar;
    }

    public FrameLayout getVideoFrameLayout() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.yiw.pvs.pvs(this.qh, mnm.Jd().yiw(String.valueOf(this.qh.yTz())));
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected void pvs(Ju.pvs pvsVar) {
        pvsVar.NB(com.bytedance.sdk.openadsdk.component.yiw.pvs.icD());
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected void pvs(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.component.yiw.pvs.pvs(jSONObject, this.qh == null ? 0 : this.qh.yTz());
    }
}
