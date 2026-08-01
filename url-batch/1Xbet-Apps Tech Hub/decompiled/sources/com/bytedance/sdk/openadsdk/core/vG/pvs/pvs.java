package com.bytedance.sdk.openadsdk.core.vG.pvs;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.icD.qh;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.model.IP;
import com.bytedance.sdk.openadsdk.utils.Pj;
import java.lang.ref.WeakReference;

/* compiled from: DynamicClickListener.java */
/* loaded from: classes2.dex */
public class pvs extends vG implements com.bytedance.sdk.component.adexpress.dynamic.NB.pvs {
    protected WeakReference<View> icD;
    protected WeakReference<View> pvs;
    private qh vG;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.NB.pvs
    public void pvs(qh qhVar) {
        this.vG = qhVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.NB.pvs
    public void pvs(View view) {
        this.pvs = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.NB.pvs
    public void icD(View view) {
        this.icD = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.icD.vG
    public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
        pvs(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    private void pvs(View view, int i, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray) {
        if (this.vG != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.icD;
            if (weakReference != null) {
                int[] pvs = Pj.pvs(weakReference.get());
                if (pvs != null) {
                    iArr = pvs;
                }
                int[] vG = Pj.vG(this.icD.get());
                if (vG != null) {
                    iArr2 = vG;
                }
            }
            String str = "";
            try {
                if (view.getTag(com.bytedance.sdk.component.adexpress.dynamic.pvs.rCZ) != null) {
                    str = String.valueOf(view.getTag(com.bytedance.sdk.component.adexpress.dynamic.pvs.rCZ));
                }
            } catch (Exception unused) {
            }
            this.vG.pvs(view, i, new IP.pvs().Jd(f).vG(f2).icD(f3).pvs(f4).icD(this.dyT).pvs(this.dX).vG(iArr[0]).Jd(iArr[1]).NB(iArr2[0]).sUS(iArr2[1]).pvs(sparseArray).pvs(this.jlb).pvs(str).pvs());
        }
    }
}
