package com.bytedance.sdk.openadsdk.core.zg.zmn;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.fs.rc;
import com.bytedance.sdk.openadsdk.core.model.cyb;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public class zmn extends zn implements com.bytedance.sdk.component.adexpress.dynamic.hhw.zmn {
    private rc fs;
    protected WeakReference<View> zmn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.hhw.zmn
    public void zmn(rc rcVar) {
        this.fs = rcVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.hhw.zmn
    public void zmn(View view) {
        this.zmn = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zn.zn
    public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
        zmn(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    private void zmn(View view, int i, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray) {
        if (this.fs != null) {
            String str = "";
            try {
                int i2 = com.bytedance.sdk.component.adexpress.dynamic.zmn.phc;
                if (view.getTag(i2) != null) {
                    str = String.valueOf(view.getTag(i2));
                }
            } catch (Exception unused) {
            }
            this.fs.zmn(view, i, new cyb.zmn().fb(f).zn(f2).fs(f3).zmn(f4).fs(this.uqh).zmn(this.bjh).zmn(sparseArray).zmn(this.yj).zmn(str).zmn());
        }
    }
}
