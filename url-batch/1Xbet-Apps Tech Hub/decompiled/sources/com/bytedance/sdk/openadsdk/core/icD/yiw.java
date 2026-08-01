package com.bytedance.sdk.openadsdk.core.icD;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.utils.kj;

/* compiled from: VastClickListenerWrapper.java */
/* loaded from: classes2.dex */
public abstract class yiw extends vG {
    private final com.bytedance.sdk.openadsdk.core.yiw.pvs icD;
    private final String pvs;
    private vG vG;

    public yiw(String str, com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar) {
        this(str, pvsVar, null);
    }

    public yiw(String str, com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar, vG vGVar) {
        this.pvs = str;
        this.icD = pvsVar;
        this.vG = vGVar;
    }

    public void pvs(vG vGVar) {
        this.vG = vGVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.icD.vG
    protected void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
        com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar = this.icD;
        if (pvsVar != null) {
            pvsVar.NB(this.pvs);
        }
        if (view != null) {
            if (view.getId() == kj.vG) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == kj.yiw) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.pvs);
            }
        }
        vG vGVar = this.vG;
        if (vGVar != null) {
            vGVar.dyT = this.dyT;
            this.vG.dX = this.dX;
            this.vG.CvL = this.CvL;
            this.vG.Gp = this.CvL;
            this.vG.ae = this.CvL;
            this.vG.pvs(view, f, f2, f3, f4, sparseArray, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.icD.vG, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }
}
