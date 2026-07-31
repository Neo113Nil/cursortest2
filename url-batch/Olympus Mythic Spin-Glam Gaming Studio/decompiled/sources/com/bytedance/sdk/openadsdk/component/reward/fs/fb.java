package com.bytedance.sdk.openadsdk.component.reward.fs;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.rc;
import com.bytedance.sdk.openadsdk.component.reward.view.zg;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.model.phc;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.rt;

/* loaded from: classes11.dex */
public class fb extends fs {
    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public boolean fb() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public void hhw() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public RFEndCardBackUpLayout nps() {
        return null;
    }

    public fb(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        super(fsVar);
    }

    public static boolean zmn(nqi nqiVar) {
        return iqz.fs(nqiVar) || iqz.fb(nqiVar) || iqz.zg(nqiVar);
    }

    public static void zmn(nqi nqiVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        if (iqz.fs(nqiVar)) {
            zmn(frameLayout, nqiVar);
        } else if (iqz.fb(nqiVar) || iqz.zg(nqiVar)) {
            fs(frameLayout, nqiVar);
        } else {
            fs.zmn(frameLayout, fsVar);
        }
    }

    static void zmn(FrameLayout frameLayout, nqi nqiVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setOrientation(1);
        frameLayout.addView(btkVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar.setId(olo.fkt);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        btkVar.addView(znVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar2.setId(olo.klz);
        znVar.addView(znVar2, new FrameLayout.LayoutParams(-1, -1));
        znVar2.addView(fs.zmn(context));
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar3.setId(olo.kw);
        znVar3.setVisibility(8);
        znVar3.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        znVar2.addView(znVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar.setId(olo.iqz);
        fbVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        znVar3.addView(fbVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.btk.zmn(znVar);
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar4 = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar4.setId(olo.phc);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        btkVar.addView(znVar4, layoutParams3);
        znVar4.addView(zmn(context, nqiVar));
        LinearLayout fs = fs(context);
        fs.setBackgroundColor(Color.parseColor("#70161823"));
        znVar4.addView(fs);
        fs.addView(zn(context));
        com.bytedance.sdk.openadsdk.component.reward.view.btk.zmn(znVar4, nqiVar);
    }

    protected static com.bytedance.sdk.component.bvs.nps zmn(Context context, nqi nqiVar) {
        com.bytedance.sdk.component.bvs.nps fs = com.bytedance.sdk.openadsdk.rt.zn.zmn().fs(nqiVar);
        if (fs != null) {
            fs.setLpPreRender(true);
            ViewGroup viewGroup = (ViewGroup) fs.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(fs);
            }
        } else {
            fs = new com.bytedance.sdk.component.bvs.nps(context, true, nps.zn.LANDING_PAGE_LOADING);
            fs.setLayerType(2, null);
        }
        jy.zmn((View) fs, 0);
        fs.setId(olo.doe);
        fs.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return fs;
    }

    private static LinearLayout fs(Context context) {
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setId(olo.nqi);
        btkVar.setOrientation(1);
        btkVar.setVisibility(8);
        btkVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return btkVar;
    }

    private static ImageView zn(Context context) {
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar.setScaleType(ImageView.ScaleType.FIT_XY);
        fbVar.setImageResource(doe.fb(context, "tt_up_slide"));
        fbVar.setId(olo.uqh);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(jy.fs(context, 18.0f), jy.fs(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = jy.fs(context, 45.0f);
        fbVar.setLayoutParams(layoutParams);
        return fbVar;
    }

    static void fs(FrameLayout frameLayout, nqi nqiVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar.setId(olo.phc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = jy.fs(kgc.zmn(), 58.0f);
        frameLayout.addView(znVar, layoutParams);
        znVar.addView(zmn(context, nqiVar));
        LinearLayout fs = fs(context);
        fs.setBackgroundColor(Color.parseColor("#99161823"));
        znVar.addView(fs);
        fs.addView(zn(context));
        com.bytedance.sdk.openadsdk.component.reward.view.btk.zmn(znVar, nqiVar);
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar2.setId(olo.fkt);
        frameLayout.addView(znVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar3.setId(olo.klz);
        znVar2.addView(znVar3, new FrameLayout.LayoutParams(-1, -1));
        znVar3.addView(fs.zmn(context));
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar4 = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar4.setId(olo.kw);
        znVar4.setVisibility(8);
        znVar4.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        znVar3.addView(znVar4, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar.setId(olo.iqz);
        fbVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        znVar4.addView(fbVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.btk.zmn(znVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public void zmn(zg zgVar) {
        zmn(this.fs, zgVar, this.zmn);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public void rc() {
        rc rcVar;
        iqz iqzVar;
        if (iqz.fs(this.zmn.fs) && (rcVar = this.zmn.fkt) != null && (iqzVar = rcVar.cyb) != null) {
            if (iqzVar.fb()) {
                this.zmn.fkt.fs(0);
                this.zmn.mw.set(true);
            } else {
                this.zmn.rt.set(true);
                zmn(true, false, true, 80);
            }
        }
        if (iqz.fb(this.zmn.fs) || iqz.zg(this.zmn.fs)) {
            zmn(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public void zmn(FrameLayout frameLayout) {
        if (!iqz.fb(this.zmn.fs) || this.zmn.fs.dgt()) {
            return;
        }
        phc uqh = this.zmn.fs.uqh();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
        rt rtVar = fsVar.hwg;
        if (rtVar == null || uqh == null) {
            return;
        }
        rtVar.zmn(fsVar, uqh.fs() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public boolean btk() {
        if (iqz.fs(this.zmn.fs)) {
            return true;
        }
        return (iqz.fb(this.zmn.fs) || iqz.zg(this.zmn.fs)) ? false : true;
    }
}
