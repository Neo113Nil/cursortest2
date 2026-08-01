package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.sUS;
import com.bytedance.sdk.openadsdk.component.view.ButtonFlash;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenBaseLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenHtmlLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenIconOnlyLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenOneLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenThreeLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenTwoLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.icD.icD;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.bNS;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.Ju;
import com.bytedance.sdk.openadsdk.utils.Pj;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: AppOpenAdNativeManager.java */
/* loaded from: classes2.dex */
public class vG {
    private static String ny = "Skip";
    private ImageView IP;
    protected final FrameLayout Jd;
    private ButtonFlash Ju;
    protected final com.bytedance.sdk.openadsdk.component.so.pvs Mxy;
    protected final com.bytedance.sdk.openadsdk.component.pvs NB;
    private TextView OT;
    private RelativeLayout Wyp;
    private TTRoundRectImageView bNS;
    private float cR;
    private com.bytedance.sdk.openadsdk.component.so.vG dX;
    private boolean dyT;
    protected final cR icD;
    private PAGLogoView kj;
    private PAGTextView mnm;
    protected final Activity pvs;
    private ImageView qh;
    private TextView rCZ;
    protected final int sUS;
    protected FrameLayout so;
    private PAGTextView vA;
    protected final boolean vG;
    protected int yiw;
    private float zM;
    private final com.bytedance.sdk.openadsdk.component.view.pvs uc = new com.bytedance.sdk.openadsdk.component.view.pvs();
    private boolean ZhG = false;

    public int Jd() {
        return -1;
    }

    public JSONObject pvs(JSONObject jSONObject) {
        return null;
    }

    public vG(Activity activity, cR cRVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.pvs pvsVar, int i, boolean z, com.bytedance.sdk.openadsdk.component.so.pvs pvsVar2) {
        this.pvs = activity;
        this.icD = cRVar;
        this.Jd = frameLayout;
        this.yiw = i;
        this.vG = z;
        this.NB = pvsVar;
        this.sUS = cRVar.yTz();
        this.Mxy = pvsVar2;
    }

    public void pvs(ViewGroup viewGroup) {
        try {
            ny = uc.pvs(mnm.pvs(), "tt_txt_skip");
        } catch (Throwable th) {
            Ju.pvs("AppOpenAdNativeManager", th.getMessage());
        }
        PAGAppOpenBaseLayout pAGAppOpenTwoLayout = new PAGAppOpenTwoLayout(this.pvs);
        int Ju = this.icD.Ju();
        if (Ju == 5) {
            pAGAppOpenTwoLayout = new PAGAppOpenIconOnlyLayout(this.pvs);
        } else if (Ju == 1) {
            pAGAppOpenTwoLayout = new PAGAppOpenOneLayout(this.pvs);
        } else if (Ju == 3) {
            pAGAppOpenTwoLayout = new PAGAppOpenThreeLayout(this.pvs);
        } else if (Ju == 4) {
            pAGAppOpenTwoLayout = new PAGAppOpenHtmlLayout(this.pvs, this.icD);
        }
        if (this.icD.Ju() == 3 && this.yiw != 2) {
            this.yiw = 2;
            this.NB.pvs(2);
        }
        this.Wyp = pAGAppOpenTwoLayout;
        viewGroup.addView(pAGAppOpenTwoLayout);
        this.IP = pAGAppOpenTwoLayout.getBackImage();
        this.so = pAGAppOpenTwoLayout.getVideoContainer();
        this.qh = pAGAppOpenTwoLayout.getImageView();
        this.Ju = pAGAppOpenTwoLayout.getClickButton();
        this.kj = pAGAppOpenTwoLayout.getAdLogo();
        if (this.icD.OUT()) {
            this.bNS = pAGAppOpenTwoLayout.getIconOnlyView();
            this.mnm = pAGAppOpenTwoLayout.getTitle();
            this.vA = pAGAppOpenTwoLayout.getContent();
        }
        if (pAGAppOpenTwoLayout.getDspAdChoice() != null) {
            pAGAppOpenTwoLayout.getDspAdChoice().pvs(14, this.icD);
        }
        if (!this.icD.Mnp()) {
            this.uc.pvs(pAGAppOpenTwoLayout, this.icD, this.zM, this.cR, this.vG);
        }
        this.rCZ = pAGAppOpenTwoLayout.getTopDisLike();
        this.OT = pAGAppOpenTwoLayout.getTopSkip();
        if (pAGAppOpenTwoLayout instanceof PAGAppOpenHtmlLayout) {
            ((PAGAppOpenHtmlLayout) pAGAppOpenTwoLayout).setRenderListener(new PAGAppOpenHtmlLayout.pvs() { // from class: com.bytedance.sdk.openadsdk.component.vG.1
                @Override // com.bytedance.sdk.openadsdk.component.view.PAGAppOpenHtmlLayout.pvs
                public void pvs(View view, int i) {
                    vG.this.NB.NB();
                }
            });
        }
    }

    public void pvs() {
        this.kj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.vG.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.pvs(vG.this.pvs, vG.this.icD, "open_ad");
                } catch (Throwable th) {
                    Ju.pvs("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        this.rCZ.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.vG.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (vG.this.NB != null) {
                    vG.this.NB.icD(view);
                }
            }
        });
        this.OT.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.vG.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (vG.this.NB == null || !vG.this.ZhG) {
                    return;
                }
                vG.this.NB.pvs(view);
            }
        });
        if (this.icD.Mnp()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.pvs.pvs pvs2 = com.bytedance.sdk.openadsdk.component.pvs.icD.pvs(this.icD, this.pvs, this.Mxy);
        pvs2.pvs(new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.component.vG.5
            @Override // com.bytedance.sdk.openadsdk.core.icD.icD.pvs
            public void pvs(View view, int i) {
                vG.this.NB.NB();
            }
        });
        pvs2.pvs(this.dX);
        if (this.icD.kj() == 1) {
            this.Wyp.setOnClickListener(pvs2);
            this.Wyp.setOnTouchListener(pvs2);
        }
        this.Ju.setOnClickListener(pvs2);
        this.Ju.setOnTouchListener(pvs2);
    }

    public void icD() {
        this.dyT = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().ZhG(String.valueOf(this.sUS));
        if (!this.icD.Mnp()) {
            sUS();
        } else {
            this.NB.vG();
        }
    }

    private void sUS() {
        this.uc.pvs();
        this.Ju.setText(this.icD.Cwg());
        if (this.icD.OUT()) {
            yiw();
            return;
        }
        if (this.vG) {
            icD(0);
            pvs(8);
            if (pvs(this.so)) {
                this.NB.vG();
            } else {
                this.NB.Jd();
            }
            sUS.pvs(this.icD, new pvs(this.pvs), 25);
            return;
        }
        icD(8);
        pvs(0);
        so();
        this.NB.vG();
    }

    protected boolean pvs(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.so.vG vGVar = new com.bytedance.sdk.openadsdk.component.so.vG(this.pvs);
        this.dX = vGVar;
        vGVar.pvs(frameLayout, this.icD);
        this.dX.pvs(this.NB);
        try {
            return this.dX.pvs();
        } catch (Throwable th) {
            Ju.pvs("AppOpenAdNativeManager", "open_ad", "ttAppOpenAd playVideo error: " + th.getMessage());
            return false;
        }
    }

    private void icD(int i) {
        Pj.pvs((View) this.so, i);
    }

    private void yiw() {
        PAGTextView pAGTextView = this.mnm;
        if (pAGTextView != null) {
            pAGTextView.setText(this.icD.qd());
        }
        PAGTextView pAGTextView2 = this.vA;
        if (pAGTextView2 != null) {
            pAGTextView2.setText(this.icD.rW());
        }
        if (this.bNS != null && this.icD.ea() != null && !TextUtils.isEmpty(this.icD.ea().pvs())) {
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.icD.ea().pvs(), this.icD.ea().icD(), this.icD.ea().vG(), this.bNS, this.icD);
        }
        this.NB.vG();
    }

    private void so() {
        bNS bns = this.icD.BSi().get(0);
        com.bytedance.sdk.openadsdk.utils.Ju.pvs(new com.bytedance.sdk.openadsdk.qh.pvs(bns.pvs(), bns.yiw()), bns.icD(), bns.vG(), new Ju.pvs() { // from class: com.bytedance.sdk.openadsdk.component.vG.6
            @Override // com.bytedance.sdk.openadsdk.utils.Ju.pvs
            public void pvs() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.Ju.pvs
            public void pvs(com.bytedance.sdk.openadsdk.qh.pvs.icD icd) {
                if (icd.Jd()) {
                    vG.this.pvs(icd);
                    if (icd.icD() != null) {
                        vG.this.pvs(icd.pvs());
                    }
                }
            }
        }, com.bytedance.sdk.openadsdk.component.yiw.pvs.icD(TextUtils.isEmpty(bns.yiw()) ? com.bytedance.sdk.component.utils.NB.pvs(bns.pvs()) : bns.yiw()).getParent(), 25);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                this.IP.setImageDrawable(new BitmapDrawable(mnm.pvs().getResources(), bitmap));
            } catch (Throwable unused) {
                com.bytedance.sdk.component.utils.Ju.pvs("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
            }
        }
    }

    void pvs(com.bytedance.sdk.openadsdk.qh.pvs.icD icd) {
        if (icd.icD() != null) {
            this.qh.setImageBitmap(icd.icD());
            return;
        }
        if (this.icD.BSi() == null || this.icD.BSi().get(0) == null) {
            return;
        }
        Drawable pvs2 = com.bytedance.sdk.openadsdk.utils.Ju.pvs(icd.vG(), this.icD.BSi().get(0).icD());
        this.qh.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.qh.setImageDrawable(pvs2);
    }

    void pvs(int i) {
        Pj.pvs((View) this.qh, i);
    }

    /* compiled from: AppOpenAdNativeManager.java */
    public class pvs implements sUS.Jd {
        WeakReference<Activity> pvs;

        pvs(Activity activity) {
            this.pvs = new WeakReference<>(activity);
        }

        @Override // com.bytedance.sdk.openadsdk.component.sUS.Jd
        public void pvs(Bitmap bitmap) {
            if (this.pvs.get() == null || this.pvs.get().isFinishing()) {
                return;
            }
            vG.this.pvs(bitmap);
        }
    }

    public void pvs(float f, float f2) {
        this.zM = f;
        this.cR = f2;
    }

    public void pvs(int i, int i2, boolean z) {
        if (this.OT != null) {
            String valueOf = String.valueOf(i);
            if (z) {
                this.ZhG = z;
                if (this.dyT) {
                    valueOf = ny;
                } else {
                    valueOf = ((Object) valueOf) + " | " + ny;
                }
            }
            this.OT.setText(valueOf);
        }
    }

    public com.bytedance.sdk.openadsdk.component.so.vG NB() {
        return this.dX;
    }

    public void vG() {
        ButtonFlash buttonFlash = this.Ju;
        if (buttonFlash != null) {
            buttonFlash.pvs();
        }
        com.bytedance.sdk.openadsdk.component.so.vG vGVar = this.dX;
        if (vGVar != null) {
            vGVar.sUS();
        }
    }
}
