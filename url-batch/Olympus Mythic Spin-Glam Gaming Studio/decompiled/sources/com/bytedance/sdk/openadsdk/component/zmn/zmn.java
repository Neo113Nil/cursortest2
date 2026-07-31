package com.bytedance.sdk.openadsdk.component.zmn;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes15.dex */
public class zmn extends com.bytedance.sdk.openadsdk.core.zn.zmn {
    private final com.bytedance.sdk.openadsdk.component.zg.zmn zmn;

    public zmn(@NonNull Context context, @NonNull nqi nqiVar, @NonNull String str, int i, com.bytedance.sdk.openadsdk.component.zg.zmn zmnVar) {
        super(context, nqiVar, str, i);
        this.zmn = zmnVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zn.zmn, com.bytedance.sdk.openadsdk.core.zn.fs, com.bytedance.sdk.openadsdk.core.zn.zn
    public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
        if (view.getTag() == "open_ad_click_button_tag") {
            zmn("click_bar");
        } else {
            zmn("click_material");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.zmn.zn()));
        zmn(hashMap);
        super.zmn(view, f, f2, f3, f4, sparseArray, z);
        btk.zmn(((com.bytedance.sdk.openadsdk.core.zn.fs) this).hhw, 9);
    }
}
