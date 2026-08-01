package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.IP;
import com.bytedance.sdk.openadsdk.core.model.bNS;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle001001Layout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle002003HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle002003Layout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle003002HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle003002Layout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle009016HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle009016VLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle016009HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle016009VLayout;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.kj;
import java.util.List;

/* loaded from: classes2.dex */
public class FullInteractionStyleView extends BackupView {
    private int IP;
    private boolean Ju;
    private int bNS;
    private View cR;
    private int mnm;
    private float pvs;
    private com.bytedance.sdk.openadsdk.core.icD.NB uc;
    private View vA;
    private FrameLayout zM;

    public View getInteractionStyleRootView() {
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void pvs(View view, int i, IP ip) {
    }

    public FullInteractionStyleView(Context context, String str) {
        super(context, str);
        this.mnm = 1;
        this.icD = context;
    }

    public void pvs(cR cRVar, float f, int i, int i2, int i3) {
        this.pvs = f;
        this.mnm = i;
        this.vG = cRVar;
        this.sUS = "fullscreen_interstitial_ad";
        this.IP = i2;
        this.bNS = i3;
        pvs(this.Mxy);
        icD();
    }

    private void icD() {
        this.yiw = Pj.icD(this.icD, this.IP);
        this.so = Pj.icD(this.icD, this.bNS);
        int i = (int) (this.pvs * 1000.0f);
        if (this.mnm == 1) {
            if (i == 666) {
                NB();
                return;
            }
            if (i == 1000) {
                vG();
                return;
            }
            if (i == 1500) {
                qh();
                return;
            } else if (i == 1777) {
                Ju();
                return;
            } else {
                pvs(0.562f);
                kj();
                return;
            }
        }
        if (i == 562) {
            Mxy();
            return;
        }
        if (i == 666) {
            yiw();
            return;
        }
        if (i == 1000) {
            vG();
        } else if (i == 1500) {
            so();
        } else {
            pvs(1.777f);
            Wyp();
        }
    }

    private void vG() {
        TTInteractionStyle001001Layout tTInteractionStyle001001Layout = new TTInteractionStyle001001Layout(this.icD);
        this.vA = tTInteractionStyle001001Layout;
        icD(tTInteractionStyle001001Layout);
        Jd();
        sUS();
    }

    private void icD(View view) {
        if (view.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            view.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            addView(view);
        }
    }

    private void Jd() {
        this.zM = (FrameLayout) this.vA.findViewById(kj.Tdd);
        ImageView imageView = (ImageView) this.vA.findViewById(kj.Mnp);
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) this.vA.findViewById(kj.EFw);
        TextView textView = (TextView) this.vA.findViewById(kj.SJ);
        TextView textView2 = (TextView) this.vA.findViewById(kj.sR);
        View findViewById = this.vA.findViewById(520093739);
        if (!TextUtils.isEmpty(this.vG.Cwg())) {
            textView2.setText(this.vG.Cwg());
        }
        pvs(this.zM, imageView);
        if (this.vG.ea() != null && !TextUtils.isEmpty(this.vG.ea().pvs())) {
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.vG.ea().pvs(), this.vG.ea().icD(), this.vG.ea().vG(), tTRoundRectImageView, this.vG);
        }
        textView.setText(getTitle());
        vG(this.zM);
        vG(imageView);
        vG(tTRoundRectImageView);
        vG(textView);
        vG(textView2);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.pvs(FullInteractionStyleView.this.icD, FullInteractionStyleView.this.vG, FullInteractionStyleView.this.sUS);
                } catch (Throwable th) {
                    Ju.pvs("FullInteractionStyleView", th.getMessage());
                }
            }
        });
    }

    private void NB() {
        TTInteractionStyle002003Layout tTInteractionStyle002003Layout = new TTInteractionStyle002003Layout(this.icD);
        this.vA = tTInteractionStyle002003Layout;
        icD(tTInteractionStyle002003Layout);
        Jd();
        sUS();
    }

    private void sUS() {
        TextView textView = (TextView) this.vA.findViewById(kj.ig);
        if (textView != null) {
            textView.setText(getDescription());
            vG(textView);
        }
    }

    private void yiw() {
        TTInteractionStyle002003HLayout tTInteractionStyle002003HLayout = new TTInteractionStyle002003HLayout(this.icD);
        this.vA = tTInteractionStyle002003HLayout;
        icD(tTInteractionStyle002003HLayout);
        Jd();
        sUS();
    }

    private void so() {
        TTInteractionStyle003002HLayout tTInteractionStyle003002HLayout = new TTInteractionStyle003002HLayout(this.icD);
        this.vA = tTInteractionStyle003002HLayout;
        icD(tTInteractionStyle003002HLayout);
        Jd();
    }

    private void Mxy() {
        TTInteractionStyle009016HLayout tTInteractionStyle009016HLayout = new TTInteractionStyle009016HLayout(this.icD);
        this.vA = tTInteractionStyle009016HLayout;
        icD(tTInteractionStyle009016HLayout);
        Jd();
        sUS();
    }

    private void Wyp() {
        TTInteractionStyle016009HLayout tTInteractionStyle016009HLayout = new TTInteractionStyle016009HLayout(this.icD);
        this.vA = tTInteractionStyle016009HLayout;
        icD(tTInteractionStyle016009HLayout);
        Jd();
    }

    private void qh() {
        View tTInteractionStyle003002Layout = new TTInteractionStyle003002Layout(this.icD);
        this.vA = tTInteractionStyle003002Layout;
        icD(tTInteractionStyle003002Layout);
        this.zM = (FrameLayout) this.vA.findViewById(kj.Tdd);
        ImageView imageView = (ImageView) this.vA.findViewById(kj.ABo);
        TextView textView = (TextView) this.vA.findViewById(kj.RKd);
        View findViewById = this.vA.findViewById(520093739);
        pvs(this.zM, imageView);
        textView.setText(getDescription());
        vG(this.zM);
        vG(imageView);
        vG(textView);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.pvs(FullInteractionStyleView.this.icD, FullInteractionStyleView.this.vG, FullInteractionStyleView.this.sUS);
                } catch (Throwable th) {
                    Ju.pvs("FullInteractionStyleView", th.getMessage());
                }
            }
        });
    }

    private void pvs(FrameLayout frameLayout, ImageView imageView) {
        if (this.vG == null) {
            return;
        }
        boolean NB = cR.NB(this.vG);
        if (this.vG.od() != null && NB) {
            Pj.pvs((View) imageView, 8);
            Pj.pvs((View) frameLayout, 0);
        } else {
            pvs(imageView);
            Pj.pvs((View) imageView, 0);
            Pj.pvs((View) frameLayout, 8);
        }
    }

    private void pvs(ImageView imageView) {
        List<bNS> BSi;
        bNS bns;
        if (this.vG == null || (BSi = this.vG.BSi()) == null || BSi.size() <= 0 || (bns = BSi.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.sUS.Jd.pvs(bns).vG(2).pvs(com.bytedance.sdk.openadsdk.sUS.vG.pvs(this.vG, bns.pvs(), imageView));
    }

    private void kj() {
        TTInteractionStyle009016VLayout tTInteractionStyle009016VLayout = new TTInteractionStyle009016VLayout(this.icD);
        this.vA = tTInteractionStyle009016VLayout;
        icD(tTInteractionStyle009016VLayout);
        Jd();
    }

    private void Ju() {
        TTInteractionStyle016009VLayout tTInteractionStyle016009VLayout = new TTInteractionStyle016009VLayout(this.icD);
        this.vA = tTInteractionStyle016009VLayout;
        icD(tTInteractionStyle016009VLayout);
        Jd();
        sUS();
    }

    private void vG(View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.icD.icD icd = this.uc;
        if (icd == null) {
            icd = new com.bytedance.sdk.openadsdk.core.icD.pvs(this.icD, this.vG, this.sUS, jlb.pvs(this.sUS));
            icd.pvs(pvs(this.vG, this.icD));
        }
        view.setOnTouchListener(icd);
        view.setOnClickListener(icd);
    }

    private com.com.bytedance.overseas.sdk.pvs.vG pvs(cR cRVar, Context context) {
        if (cRVar != null && cRVar.jhZ() == 4) {
            return new com.com.bytedance.overseas.sdk.pvs.icD(context, cRVar, this.sUS);
        }
        return null;
    }

    public void setIsMute(boolean z) {
        this.Ju = z;
        View view = this.cR;
        if (view != null && (view instanceof NativeVideoTsView)) {
            ((NativeVideoTsView) view).setIsQuiet(z);
        }
    }

    public FrameLayout getVideoContainer() {
        return this.zM;
    }

    public void setDownloadListener(com.bytedance.sdk.openadsdk.core.icD.NB nb) {
        this.uc = nb;
    }

    private float getHeightDp() {
        return Pj.vG(this.icD, Pj.Mxy(this.icD));
    }

    private float getWidthDp() {
        return Pj.vG(this.icD, Pj.Wyp(this.icD));
    }

    private void pvs(float f) {
        float min;
        float max;
        int max2;
        int i;
        int i2;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.mnm == 2) {
            min = Math.max(heightDp, widthDp);
            max = Math.min(heightDp, widthDp);
        } else {
            min = Math.min(heightDp, widthDp);
            max = Math.max(heightDp, widthDp);
        }
        if (this.mnm != 2 && Pj.vG((Activity) this.icD)) {
            max -= Pj.vG(this.icD, Pj.pvs());
        }
        int i3 = 20;
        if (this.mnm != 2) {
            if (f != 0.0f && f != 100.0f) {
                i2 = (int) Math.max((max - (((min - 20.0f) - 20.0f) / f)) / 2.0f, 0.0f);
                max2 = 20;
                i = 20;
                i3 = i2;
            }
            i3 = 0;
            i2 = 0;
            max2 = 0;
            i = 0;
        } else {
            if (f != 0.0f && f != 100.0f) {
                max2 = (int) Math.max((min - (((max - 20.0f) - 20.0f) * f)) / 2.0f, 0.0f);
                i = max2;
                i2 = 20;
            }
            i3 = 0;
            i2 = 0;
            max2 = 0;
            i = 0;
        }
        ((Activity) this.icD).getWindow().getDecorView().setPadding(Pj.icD(this.icD, max2), Pj.icD(this.icD, i3), Pj.icD(this.icD, i), Pj.icD(this.icD, i2));
    }
}
