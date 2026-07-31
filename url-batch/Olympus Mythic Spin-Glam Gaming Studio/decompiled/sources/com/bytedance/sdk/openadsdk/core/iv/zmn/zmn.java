package com.bytedance.sdk.openadsdk.core.iv.zmn;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.iv.btk;
import com.bytedance.sdk.openadsdk.core.iv.bvs;
import com.bytedance.sdk.openadsdk.core.iv.iv;
import com.bytedance.sdk.openadsdk.core.iv.uqh;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zn.fs;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class zmn {
    protected float btk;
    protected AdSlot bvs;
    protected String fb;
    protected nqi fs;
    protected float hhw;
    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn iv;
    private com.bytedance.sdk.openadsdk.component.reward.zn.fs klz;
    protected Activity nps;
    private PAGExpressAdWrapperListener rc;
    protected Context zg;
    protected uqh zmn;
    protected ViewGroup zn;

    public zmn(ViewGroup viewGroup, nqi nqiVar, String str, Activity activity, Context context, com.bytedance.sdk.openadsdk.component.reward.zn.fs fsVar) {
        this.zn = viewGroup;
        this.fs = nqiVar;
        this.fb = str;
        this.nps = activity;
        this.zg = context;
        this.klz = fsVar;
    }

    public uqh fs() {
        return this.zmn;
    }

    public void zmn(float[] fArr) {
        if (fArr == null || fArr.length != 2) {
            return;
        }
        zmn(fArr[0], fArr[1]);
    }

    public void zmn(float f, float f2) {
        this.btk = f;
        this.hhw = f2;
        this.bvs = new AdSlot.Builder().setCodeId(String.valueOf(this.fs.qvo())).setExpressViewAcceptedSize(this.btk, this.hhw).build();
        this.zmn = new uqh(this.nps, this.zg, this.fs, this.bvs, this.fb);
    }

    public void zn() {
        uqh uqhVar = this.zmn;
        if (uqhVar == null) {
            return;
        }
        uqhVar.setExpressInteractionListener(this.rc);
        fb();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.zn.addView(this.zmn, layoutParams);
        this.zmn.phc();
        this.zmn.rc();
    }

    public void zmn(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.rc = pAGExpressAdWrapperListener;
    }

    public void zmn(btk btkVar) {
        this.zmn.setDislikeClickListener(btkVar);
    }

    protected void fb() {
        Activity activity = this.nps;
        nqi nqiVar = this.fs;
        String str = this.fb;
        iv ivVar = new iv(activity, nqiVar, str, oub.zmn(str));
        ivVar.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.iv.zmn.zmn.1
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
            public void zmn(View view, int i) {
                zmn.this.klz.iv();
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        ivVar.zmn(hashMap);
        Activity activity2 = this.nps;
        nqi nqiVar2 = this.fs;
        String str2 = this.fb;
        bvs bvsVar = new bvs(activity2, nqiVar2, str2, oub.zmn(str2)) { // from class: com.bytedance.sdk.openadsdk.core.iv.zmn.zmn.2
            @Override // com.bytedance.sdk.openadsdk.core.zn.zmn, com.bytedance.sdk.openadsdk.core.zn.fs, com.bytedance.sdk.openadsdk.core.zn.zn
            public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
                super.zmn(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        bvsVar.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.iv.zmn.zmn.3
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
            public void zmn(View view, int i) {
                zmn.this.klz.iv();
            }
        });
        HashMap hashMap2 = new HashMap();
        hashMap2.put("click_scence", 1);
        bvsVar.zmn(hashMap2);
        zmn(ivVar, bvsVar);
    }

    public void zmn(iv ivVar, bvs bvsVar) {
        nqi nqiVar;
        if (this.zmn == null || (nqiVar = this.fs) == null) {
            return;
        }
        this.iv = zmn(nqiVar);
        ivVar.fs(this.zmn);
        ivVar.zmn(this.iv);
        this.zmn.setClickListener(ivVar);
        bvsVar.fs(this.zmn);
        bvsVar.zmn(this.iv);
        this.zmn.setClickCreativeListener(bvsVar);
    }

    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn zmn(nqi nqiVar) {
        if (nqiVar.va() == 4) {
            return com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this.nps, this.fb);
        }
        return null;
    }

    public void btk() {
        uqh uqhVar = this.zmn;
        if (uqhVar != null) {
            uqhVar.klz();
        }
    }

    public void hhw() {
        uqh uqhVar = this.zmn;
        if (uqhVar != null) {
            uqhVar.rc();
        }
    }

    public void nps() {
        uqh uqhVar = this.zmn;
        if (uqhVar != null) {
            uqhVar.mw();
        }
    }
}
