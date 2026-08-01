package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.icD.IP;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.zM;
import com.bytedance.sdk.openadsdk.core.nativeexpress.FullRewardExpressBackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.kj;
import com.bytedance.sdk.openadsdk.core.nativeexpress.vA;
import com.bytedance.sdk.openadsdk.mnm.pvs.NB;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public class FullRewardExpressView extends NativeExpressView {
    public static float pvs = 100.0f;
    private final com.bytedance.sdk.openadsdk.component.reward.pvs.pvs Jd;
    kj icD;
    FullRewardExpressBackupView vG;

    public FullRewardExpressView(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar, AdSlot adSlot, String str) {
        super(pvsVar.od, pvsVar.icD, adSlot, str, pvsVar.ea, !pvsVar.Ayu);
        this.Jd = pvsVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected void sUS() {
        this.IP = true;
        this.kj = new FrameLayout(this.so);
        if (!com.bytedance.sdk.openadsdk.core.ugen.vG.pvs(this.qh)) {
            addView(this.kj, new FrameLayout.LayoutParams(-1, -1));
        }
        super.sUS();
        SSWebView webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        yiw();
    }

    private void yiw() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.icD.vG() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView.1
            @Override // com.bytedance.sdk.component.adexpress.icD.vG
            public boolean pvs(ViewGroup viewGroup, int i) {
                try {
                    ((NativeExpressView) viewGroup).kj();
                    FullRewardExpressView.this.vG = new FullRewardExpressBackupView(viewGroup.getContext());
                    FullRewardExpressView.this.vG.pvs(FullRewardExpressView.this.qh, (NativeExpressView) viewGroup);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.icD.bNS
    public void pvs(com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd, IP ip) {
        this.Gp = jd;
        if (this.qh != null && this.qh.OBt()) {
            super.pvs(jd, ip);
            return;
        }
        if (jd instanceof vA) {
            vA vAVar = (vA) jd;
            if (vAVar.mnm() != null) {
                vAVar.mnm().pvs((kj) this);
            }
        }
        if (ip != null && ip.vG()) {
            icD(ip);
        }
        super.pvs(jd, ip);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected boolean pvs(IP ip) {
        if ((this.qh instanceof zM) && ((zM) this.qh).aSt() && ip.vG() && ip.icD() == 1) {
            return false;
        }
        return super.pvs(ip);
    }

    public void setExpressVideoListenerProxy(kj kjVar) {
        this.icD = kjVar;
    }

    public void icD(final IP ip) {
        if (ip == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                FullRewardExpressView.this.vG(ip);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG(IP ip) {
        if (ip == null) {
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
        if (this.Gp.vG() == 7 && (ip instanceof com.bytedance.sdk.openadsdk.core.ugen.vG.icD)) {
            FrameLayout mnm = ((com.bytedance.sdk.openadsdk.core.ugen.vG.icD) ip).mnm();
            if (mnm != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                mnm.addView(this.kj, layoutParams);
                return;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.kj.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(icD3, icD4);
        }
        layoutParams2.width = icD3;
        layoutParams2.height = icD4;
        layoutParams2.topMargin = icD2;
        layoutParams2.leftMargin = icD;
        layoutParams2.setMarginStart(layoutParams2.leftMargin);
        layoutParams2.setMarginEnd(layoutParams2.rightMargin);
        this.kj.setLayoutParams(layoutParams2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void pvs(boolean z) {
        kj kjVar = this.icD;
        if (kjVar != null) {
            kjVar.pvs(z);
        }
        setSoundMute(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void pvs() {
        kj kjVar = this.icD;
        if (kjVar != null) {
            kjVar.pvs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void icD() {
        kj kjVar = this.icD;
        if (kjVar != null) {
            kjVar.icD();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void pvs(int i) {
        kj kjVar = this.icD;
        if (kjVar != null) {
            kjVar.pvs(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public long vG() {
        kj kjVar = this.icD;
        if (kjVar != null) {
            return kjVar.vG();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public int Jd() {
        kj kjVar = this.icD;
        if (kjVar != null) {
            return kjVar.Jd();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void NB() {
        kj kjVar = this.icD;
        if (kjVar != null) {
            kjVar.NB();
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

    public FrameLayout getVideoFrameLayout() {
        if (Ju()) {
            return this.vG.getVideoContainer();
        }
        return this.kj;
    }

    public View getBackupContainerBackgroundView() {
        if (Ju()) {
            return this.vG.getBackupContainerBackgroundView();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void icD(int i) {
        kj kjVar = this.icD;
        if (kjVar != null) {
            kjVar.icD(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void pvs(int i, String str) {
        kj kjVar = this.icD;
        if (kjVar != null) {
            kjVar.pvs(i, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected NB.pvs vG(int i) {
        NB.pvs vG = super.vG(i);
        if (this.Jd.Ayu && this.Jd.elv != null) {
            vG.icD = this.Jd.elv.Mxy;
        }
        return vG;
    }
}
