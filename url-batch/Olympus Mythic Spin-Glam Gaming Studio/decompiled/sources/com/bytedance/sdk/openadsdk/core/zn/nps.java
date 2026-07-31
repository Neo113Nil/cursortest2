package com.bytedance.sdk.openadsdk.core.zn;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes11.dex */
public abstract class nps extends zn {
    private final com.bytedance.sdk.openadsdk.core.rt.zmn fs;
    private final String zmn;
    private zn zn;

    @Override // com.bytedance.sdk.openadsdk.core.zn.zn, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/zn/nps;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
        return safedk_nps_onTouch_89def8e89cfbcf5140438a76b0430262(view, motionEvent);
    }

    public nps(String str, com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar) {
        this(str, zmnVar, null);
    }

    public nps(String str, com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar, zn znVar) {
        this.zmn = str;
        this.fs = zmnVar;
        this.zn = znVar;
    }

    public void zmn(zn znVar) {
        this.zn = znVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zn.zn
    protected void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
        com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar = this.fs;
        if (zmnVar != null) {
            zmnVar.btk(this.zmn);
        }
        if (view != null) {
            if (view.getId() == olo.btk) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == olo.bvs) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.zmn);
            }
        }
        zn znVar = this.zn;
        if (znVar != null) {
            znVar.uqh = this.uqh;
            znVar.bjh = this.bjh;
            znVar.rp = this.rp;
            int i = this.rp;
            znVar.kjb = i;
            znVar.zak = i;
            znVar.zmn(view, f, f2, f3, f4, sparseArray, z);
        }
    }

    public boolean safedk_nps_onTouch_89def8e89cfbcf5140438a76b0430262(View p0, MotionEvent p1) {
        return super.onTouch(p0, p1);
    }
}
