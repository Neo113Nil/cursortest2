package com.bytedance.sdk.openadsdk.klz;

import com.bytedance.sdk.component.adexpress.btk.btk;
import com.bytedance.sdk.component.zmn.iqz;
import com.bytedance.sdk.openadsdk.component.reward.zn.zg;

/* loaded from: classes5.dex */
public class fs extends iqz {
    @Override // com.bytedance.sdk.component.zmn.iqz
    protected void zn() {
        if (this.bvs != null) {
            if (zg.zn()) {
                btk.zmn().fs(this.bvs, this, ((iqz) this).zg);
            } else {
                btk.zmn().zmn(this.bvs, this, ((iqz) this).zg);
            }
        }
    }

    @Override // com.bytedance.sdk.component.zmn.iqz
    protected void fb() {
        if (zg.zn()) {
            btk.zmn().fs(this.bvs, ((iqz) this).zg);
        } else {
            btk.zmn().zmn(this.bvs, ((iqz) this).zg);
        }
    }
}
