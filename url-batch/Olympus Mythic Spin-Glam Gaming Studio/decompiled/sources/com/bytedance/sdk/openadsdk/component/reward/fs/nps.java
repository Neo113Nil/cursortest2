package com.bytedance.sdk.openadsdk.component.reward.fs;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.component.reward.view.zg;
import com.bytedance.sdk.openadsdk.core.model.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.rt;
import com.pubmatic.sdk.video.POBVastError;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class nps extends fs {
    private com.bytedance.sdk.openadsdk.component.reward.view.hhw cn;
    private String cyb;
    private final int mw;
    private ViewGroup rt;

    public nps(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        super(fsVar);
        this.cyb = "fullscreen_interstitial_ad";
        this.mw = this.fs.zq();
    }

    private void kjb() {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout frameLayout = new FrameLayout(this.zmn.nu);
        this.rt = frameLayout;
        frameLayout.setId(olo.hqs);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        this.rt.setLayoutParams(layoutParams2);
        View klz = this.zmn.fkt.klz();
        if (klz != null) {
            layoutParams2.bottomMargin = klz.getHeight();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.hhw hhwVar = new com.bytedance.sdk.openadsdk.component.reward.view.hhw(this.zmn.nu);
        this.cn = hhwVar;
        hhwVar.setId(olo.lgz);
        if (this.zmn.fs.ol() == 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
        }
        layoutParams.gravity = 17;
        this.cn.setLayoutParams(layoutParams);
        this.rt.addView(this.cn);
        zak();
    }

    private void zak() {
        if (this.rt == null) {
            return;
        }
        zmn((View) this.cn);
    }

    private void fs(nqi nqiVar) {
        if (nqiVar == null || this.cn == null) {
            return;
        }
        am();
        zmn((ImageView) this.cn);
    }

    private void am() {
        kgc kgcVar;
        List<kgc> tj = this.fs.tj();
        if (tj == null || tj.size() <= 0 || (kgcVar = tj.get(0)) == null) {
            return;
        }
        try {
            int fs = kgcVar.fs();
            int zn = kgcVar.zn();
            if (fs != 0 && zn != 0) {
                this.cn.setRatio(fs / zn);
                return;
            }
            int i = this.mw;
            if (i == 33) {
                this.cn.setRatio(1.0f);
            } else if (i == 3) {
                this.cn.setRatio(1.91f);
            } else {
                this.cn.setRatio(0.56f);
            }
        } catch (Exception e) {
            iqz.zn("TTAD.RFTI", e.getMessage());
        }
    }

    private void zmn(ImageView imageView) {
        List<kgc> tj;
        kgc kgcVar;
        nqi nqiVar = this.fs;
        if (nqiVar == null || (tj = nqiVar.tj()) == null || tj.size() <= 0 || (kgcVar = tj.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.iv.fb.zmn(tj.get(0)).zn(1).zmn(com.bytedance.sdk.openadsdk.iv.zn.zmn(this.fs, kgcVar.zmn(), imageView));
    }

    protected void zmn(View view) {
        if (view == null || this.zmn.nu == null || this.fs == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.zn.fs fsVar = this.rc;
        if (fsVar == null) {
            Activity activity = this.zmn.nu;
            nqi nqiVar = this.fs;
            String str = this.cyb;
            fsVar = new com.bytedance.sdk.openadsdk.core.zn.zmn(activity, nqiVar, str, oub.zmn(str));
            fsVar.zmn(zn(this.fs));
            HashMap hashMap = new HashMap();
            hashMap.put("click_scence", 1);
            fsVar.zmn(hashMap);
        }
        Activity activity2 = this.zmn.nu;
        if (activity2 != null) {
            fsVar.zmn(activity2);
        }
        view.setOnTouchListener(fsVar);
        view.setOnClickListener(fsVar);
    }

    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn zn(nqi nqiVar) {
        if (nqiVar.va() == 4) {
            return new com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), this.cyb);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public void zmn(FrameLayout frameLayout) {
        try {
            kjb();
            fs(this.fs);
            frameLayout.addView(this.rt);
        } catch (Exception e) {
            Log.e("TTAD.RFTI", "bindAd: ", e);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public void zmn(zg zgVar) {
        rt rtVar;
        if (com.bytedance.sdk.openadsdk.core.model.iqz.fs(this.fs)) {
            fb.zmn(zgVar, this.fs);
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
            rt rtVar2 = fsVar.hwg;
            if (rtVar2 != null) {
                rtVar2.zmn(fsVar, (long) (fsVar.phc.ww() * 1000.0d));
                return;
            }
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.iqz.fb(this.fs) || com.bytedance.sdk.openadsdk.core.model.iqz.zg(this.fs)) {
            fb.fs(zgVar, this.fs);
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.zmn;
            if (fsVar2.rje || (rtVar = fsVar2.hwg) == null) {
                return;
            }
            rtVar.zmn(fsVar2, (long) (fsVar2.phc.ww() * 1000.0d));
            return;
        }
        super.zmn(zgVar);
    }

    public static boolean zmn(nqi nqiVar) {
        return !nqi.btk(nqiVar) && nqiVar.fu() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public boolean fb() {
        return yj();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public boolean btk() {
        return yj();
    }

    private boolean yj() {
        nqi nqiVar = this.fs;
        return nqiVar != null && nqiVar.nkt() == 2;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public void hhw() {
        if (com.bytedance.sdk.openadsdk.core.model.iqz.fs(this.fs)) {
            this.hhw.fs(8);
        }
        this.zg.zn(false);
        this.zg.fb(false);
        if (this.fs.nkt() == 2) {
            this.zg.zmn(false);
            this.hhw.hhw(8);
            return;
        }
        this.zg.zmn(this.fs.bn());
        if (this.zmn.lbc) {
            Message obtain = Message.obtain();
            obtain.what = POBVastError.UNDEFINED_ERROR;
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
            int ww = (int) (fsVar.phc.ww() * 1000.0d);
            fsVar.zg = ww;
            obtain.arg1 = ww;
            this.zmn.jy.sendMessage(obtain);
        }
    }
}
