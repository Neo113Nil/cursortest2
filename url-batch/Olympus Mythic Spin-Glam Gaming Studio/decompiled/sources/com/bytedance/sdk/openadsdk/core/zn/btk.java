package com.bytedance.sdk.openadsdk.core.zn;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zn.zn;

/* loaded from: classes14.dex */
public abstract class btk extends zmn {
    protected abstract void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, int i, int i2, int i3, boolean z);

    public btk(@NonNull Context context, @NonNull nqi nqiVar, @NonNull String str, int i) {
        super(context, nqiVar, str, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zn.zmn, com.bytedance.sdk.openadsdk.core.zn.fs, com.bytedance.sdk.openadsdk.core.zn.zn
    public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
        if (zmn(view, z)) {
            zmn(view, f, f2, f3, f4, sparseArray, this.zak, this.rp, this.kjb, z);
        }
        super.zmn(view, f, f2, f3, f4, sparseArray, z);
    }
}
