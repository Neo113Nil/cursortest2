package com.bytedance.sdk.openadsdk.component;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.bytedance.adsdk.ugeno.bvs.fb.zn$$ExternalSyntheticApiModelOutline0;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.bvs.btk;
import com.bytedance.sdk.openadsdk.component.hhw;
import com.bytedance.sdk.openadsdk.core.hhw.zg;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.cyb;
import com.bytedance.sdk.openadsdk.core.widget.olo;
import com.bytedance.sdk.openadsdk.core.zn.fs;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.kgc;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.io.File;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zn {
    private zg bjh;
    protected final com.bytedance.sdk.openadsdk.component.zmn btk;
    protected View bvs;
    private PAGLogoView cn;
    private zg cyb;
    private float doe;
    protected final FrameLayout fb;
    protected final nqi fs;
    protected final int hhw;
    private zg iqz;
    protected com.bytedance.sdk.openadsdk.core.hhw.fb iv;
    private olo kgc;
    private cyb kjb;
    protected final com.bytedance.sdk.openadsdk.component.zg.zmn klz;
    private zg kw;
    private RelativeLayout mw;
    protected int nps;

    @NonNull
    private final com.bytedance.sdk.openadsdk.component.bvs.zg nqi = new com.bytedance.sdk.openadsdk.component.bvs.zg();
    private ImageView olo;
    private float phc;
    protected zg rc;
    private com.bytedance.sdk.openadsdk.core.hhw.fb rp;
    private ImageView rt;
    private com.bytedance.sdk.openadsdk.component.zg.zn uqh;
    private View zak;
    protected FrameLayout zg;
    protected final Activity zmn;
    protected final boolean zn;

    public void btk() {
    }

    public int fb() {
        return -1;
    }

    public JSONObject zmn(JSONObject jSONObject) {
        return null;
    }

    public zn(Activity activity, nqi nqiVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.zmn zmnVar, int i, boolean z, com.bytedance.sdk.openadsdk.component.zg.zmn zmnVar2) {
        this.zmn = activity;
        this.fs = nqiVar;
        this.fb = frameLayout;
        this.nps = i;
        this.zn = z;
        this.btk = zmnVar;
        this.hhw = nqiVar.qvo();
        this.klz = zmnVar2;
    }

    public void zmn(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.bvs.zn fbVar = new com.bytedance.sdk.openadsdk.component.bvs.fb(this.zmn, this.fs);
        int yo = this.fs.yo();
        if (yo == 5) {
            fbVar = new com.bytedance.sdk.openadsdk.component.bvs.hhw(this.zmn, this.fs);
        } else if (yo == 4) {
            fbVar = new com.bytedance.sdk.openadsdk.component.bvs.btk(this.zmn, this.fs);
        }
        this.mw = fbVar;
        viewGroup.addView(fbVar);
        this.olo = fbVar.getBackImage();
        this.zg = fbVar.getVideoContainer();
        this.rt = fbVar.getImageView();
        this.cyb = fbVar.getClickButton();
        this.cn = fbVar.getAdLogo();
        this.bjh = fbVar.getAdTitleTextView();
        this.rp = fbVar.getAdIconView();
        this.kjb = fbVar.getScoreBar();
        this.zak = fbVar.getOverlayLayout();
        if (this.fs.yj()) {
            this.kgc = fbVar.getIconOnlyView();
            this.kw = fbVar.getTitle();
            this.iqz = fbVar.getContent();
        }
        if (fbVar.getDspAdChoice() != null) {
            fbVar.getDspAdChoice().zmn(14, this.fs);
        }
        if (!this.fs.xup()) {
            this.nqi.zmn(fbVar, this.fs, this.doe, this.phc, this.zn);
        }
        this.bvs = fbVar.getTopDisLike();
        this.iv = fbVar.getTopSkip();
        this.rc = fbVar.getTopCountDown();
        if (fbVar instanceof com.bytedance.sdk.openadsdk.component.bvs.btk) {
            ((com.bytedance.sdk.openadsdk.component.bvs.btk) fbVar).setRenderListener(new btk.zmn() { // from class: com.bytedance.sdk.openadsdk.component.zn.1
                @Override // com.bytedance.sdk.openadsdk.component.bvs.btk.zmn
                public void zmn(View view, int i) {
                    zn.this.btk.btk();
                }
            });
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void zmn() {
        this.cn.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.zn.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/zn$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_zn$2_onClick_a8097780838320fd0a657198983bcb1c(view);
            }

            public void safedk_zn$2_onClick_a8097780838320fd0a657198983bcb1c(View p0) {
                try {
                    if (com.bytedance.sdk.openadsdk.utils.fs.btk() && kgc.fb().am()) {
                        zn znVar = zn.this;
                        IABLandingPageActivity.zmn(znVar.zmn, znVar.fs, "open_ad");
                    } else {
                        zn znVar2 = zn.this;
                        TTWebsiteActivity.zmn(znVar2.zmn, znVar2.fs, "open_ad");
                    }
                } catch (Throwable th) {
                    iqz.zn("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        hhw();
        if (this.fs.xup()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.zmn.zmn zmn2 = com.bytedance.sdk.openadsdk.component.zmn.fs.zmn(this.fs, this.zmn, this.klz);
        zmn2.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.component.zn.3
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
            public void zmn(View view, int i) {
                zn.this.btk.btk();
            }
        });
        zmn2.zmn(this.uqh);
        if (this.fs.tet() == 1) {
            this.mw.setOnClickListener(zmn2);
            this.mw.setOnTouchListener(zmn2);
        }
        this.cyb.setOnClickListener(zmn2);
        this.cyb.setOnTouchListener(zmn2);
    }

    protected void hhw() {
        View view = this.bvs;
        if (view == null || this.iv == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.zn.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/zn$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view2);
                safedk_zn$4_onClick_0ee51c36aeec905d540c2df2a2f7f517(view2);
            }

            public void safedk_zn$4_onClick_0ee51c36aeec905d540c2df2a2f7f517(View p0) {
                com.bytedance.sdk.openadsdk.component.zmn zmnVar = zn.this.btk;
                if (zmnVar != null) {
                    zmnVar.fs(p0);
                }
            }
        });
        this.iv.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.zn.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/zn$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view2);
                safedk_zn$5_onClick_cadaaac79e6e9b6fe61b4cb78229856c(view2);
            }

            public void safedk_zn$5_onClick_cadaaac79e6e9b6fe61b4cb78229856c(View p0) {
                com.bytedance.sdk.openadsdk.component.zmn zmnVar = zn.this.btk;
                if (zmnVar != null) {
                    zmnVar.zmn(p0);
                }
            }
        });
    }

    public void fs() {
        Window window;
        if (!this.fs.xup()) {
            zg();
        } else {
            this.btk.zn();
        }
        Activity activity = this.zmn;
        if (!(activity instanceof TTAppOpenAdTransActivity) || (window = activity.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1E1E1E")));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zg() {
        boolean z;
        cyb cybVar;
        View view;
        this.nqi.zmn();
        this.cyb.setText(this.fs.gt());
        if (this.fs.yj()) {
            bvs();
            return;
        }
        if (this.zn) {
            fs(0);
            zmn(8);
            if (zmn(this.zg)) {
                this.btk.zn();
            } else {
                this.btk.fb();
            }
            hhw.zmn(this.fs, new zmn(this.zmn, this), 25);
        } else {
            fs(8);
            zmn(0);
            iv();
            this.btk.zn();
        }
        boolean z2 = true;
        if (this.bjh != null) {
            if (!TextUtils.isEmpty(this.fs.dey())) {
                this.bjh.setText(this.fs.dey());
            } else if (this.fs.pw() != null) {
                this.bjh.setText(this.fs.pw().fs());
            }
            z = true;
            if (this.rp != null) {
                com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.fs.uaq(), this.rp, this.fs);
            }
            cybVar = this.kjb;
            if (cybVar != null) {
                jy.zmn((TextView) null, cybVar, this.fs);
                if (this.fs.pw() == null || this.fs.pw().fb() < 0.0d) {
                    this.kjb.setVisibility(8);
                }
                view = this.zak;
                if (view != null) {
                    view.setVisibility(z2 ? 0 : 8);
                    return;
                }
                return;
            }
            z2 = z;
            view = this.zak;
            if (view != null) {
            }
        }
        z = false;
        if (this.rp != null) {
        }
        cybVar = this.kjb;
        if (cybVar != null) {
        }
        z2 = z;
        view = this.zak;
        if (view != null) {
        }
    }

    protected boolean zmn(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.zg.zn znVar = new com.bytedance.sdk.openadsdk.component.zg.zn(this.zmn);
        this.uqh = znVar;
        return znVar.zmn(frameLayout, this.btk, this.fs);
    }

    private void fs(int i) {
        jy.zmn((View) this.zg, i);
    }

    private void bvs() {
        if (this.kw != null) {
            if (this.fs.pw() != null && !TextUtils.isEmpty(this.fs.pw().fs())) {
                this.kw.setText(this.fs.pw().fs());
            } else if (!TextUtils.isEmpty(this.fs.dey())) {
                this.kw.setText(this.fs.dey());
            } else {
                this.kw.setVisibility(8);
            }
        }
        if (this.iqz != null) {
            if (!TextUtils.isEmpty(this.fs.db())) {
                this.iqz.setText(this.fs.db());
            } else {
                this.iqz.setVisibility(8);
            }
        }
        if (this.kgc != null && this.fs.uaq() != null && !TextUtils.isEmpty(this.fs.uaq().zmn())) {
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.fs.uaq().zmn(), this.fs.uaq().fs(), this.fs.uaq().zn(), this.kgc, this.fs);
        }
        this.btk.zn();
    }

    private void iv() {
        com.bytedance.sdk.openadsdk.core.model.kgc kgcVar = this.fs.tj().get(0);
        String zmn2 = TextUtils.isEmpty(kgcVar.nps()) ? com.bytedance.sdk.component.utils.btk.zmn(kgcVar.zmn()) : kgcVar.nps();
        if (TextUtils.isEmpty(zmn2) || zmn2.contains("../") || zmn2.contains("/") || zmn2.contains("..")) {
            return;
        }
        File fs2 = com.bytedance.sdk.openadsdk.component.nps.zmn.fs(zmn2);
        com.bytedance.sdk.openadsdk.utils.kgc.zmn(new com.bytedance.sdk.openadsdk.iqz.zmn(kgcVar.zmn(), kgcVar.nps()), kgcVar.fs(), kgcVar.zn(), new fs(this), fs2 != null ? fs2.getParent() : null, 25);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(Object obj) {
        try {
            if (obj instanceof Bitmap) {
                this.olo.setImageDrawable(new BitmapDrawable(kgc.zmn().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            iqz.zn("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    void zmn(com.bytedance.sdk.openadsdk.iqz.zmn.fs fsVar) {
        if (this.rt == null) {
            return;
        }
        if (fsVar.fs() != null) {
            this.rt.setImageBitmap(fsVar.fs());
            return;
        }
        Drawable fb = fsVar.fb();
        if (fb != null) {
            this.rt.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(fb)) {
                zn$$ExternalSyntheticApiModelOutline0.m(fb).start();
            }
            this.rt.setImageDrawable(fb);
            return;
        }
        if (this.fs.tj() == null || this.fs.tj().get(0) == null) {
            return;
        }
        Drawable zmn2 = com.bytedance.sdk.openadsdk.utils.kgc.zmn(fsVar.zn(), this.fs.tj().get(0).fs());
        this.rt.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.rt.setImageDrawable(zmn2);
    }

    void zmn(int i) {
        jy.zmn((View) this.rt, i);
    }

    public static class zmn implements hhw.zn {
        private final WeakReference<zn> fs;
        WeakReference<Activity> zmn;

        zmn(Activity activity, zn znVar) {
            this.zmn = new WeakReference<>(activity);
            this.fs = new WeakReference<>(znVar);
        }

        @Override // com.bytedance.sdk.openadsdk.component.hhw.zn
        public void zmn(Object obj) {
            zn znVar;
            if (this.zmn.get() == null || this.zmn.get().isFinishing() || (znVar = this.fs.get()) == null) {
                return;
            }
            znVar.zmn(obj);
        }
    }

    public void zmn(float f, float f2) {
        this.doe = f;
        this.phc = f2;
    }

    public void zmn(int i, boolean z) {
        zg zgVar;
        if (this.iv == null || (zgVar = this.rc) == null) {
            return;
        }
        if (z) {
            if (zgVar.getVisibility() != 8) {
                this.rc.setVisibility(8);
            }
            if (this.iv.getVisibility() != 0) {
                this.iv.setVisibility(0);
                return;
            }
            return;
        }
        this.rc.setText(i + "s");
        if (this.rc.getVisibility() != 0) {
            this.rc.setVisibility(0);
        }
    }

    public com.bytedance.sdk.openadsdk.component.zg.zn nps() {
        return this.uqh;
    }

    public void zn() {
        com.bytedance.sdk.openadsdk.component.zg.zn znVar = this.uqh;
        if (znVar != null) {
            znVar.klz();
        }
    }

    public static class fs implements kgc.zmn {
        private final WeakReference<zn> zmn;

        @Override // com.bytedance.sdk.openadsdk.utils.kgc.zmn
        public void zmn() {
        }

        public fs(zn znVar) {
            this.zmn = new WeakReference<>(znVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.kgc.zmn
        public void zmn(com.bytedance.sdk.openadsdk.iqz.zmn.fs fsVar) {
            zn znVar;
            if (!fsVar.btk() || (znVar = this.zmn.get()) == null) {
                return;
            }
            znVar.zmn(fsVar);
            if (fsVar.fs() != null) {
                znVar.zmn(fsVar.zmn());
            }
        }
    }
}
