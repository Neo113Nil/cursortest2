package com.bytedance.sdk.openadsdk.zmn.fs.zmn;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.iv.iqz;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.model.nqi;

/* loaded from: classes15.dex */
public class fs extends zn {
    public fs(@NonNull Context context, nqi nqiVar, AdSlot adSlot) {
        super(context, nqiVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.fs.zmn.zn
    protected void zmn() {
        iqz iqzVar = new iqz(((zn) this).zg, this.fs, ((zn) this).bvs, this.rc, false);
        this.iv = iqzVar;
        this.zmn.zmn(iqzVar.getVideoController());
        zn();
    }

    public com.bytedance.sdk.openadsdk.kw.zn.zmn fs() {
        phc phcVar = this.iv;
        if (phcVar != null) {
            return ((iqz) phcVar).getVideoModel();
        }
        return null;
    }
}
