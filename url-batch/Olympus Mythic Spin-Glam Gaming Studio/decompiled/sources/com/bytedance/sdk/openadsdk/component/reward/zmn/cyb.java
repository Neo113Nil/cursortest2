package com.bytedance.sdk.openadsdk.component.reward.zmn;

/* loaded from: classes6.dex */
public class cyb extends zmn {
    public cyb(fs fsVar) {
        super(fsVar.nu, fsVar.fs, fsVar.kra, fsVar.btk);
        rc rcVar = fsVar.rp;
        if (rcVar != null) {
            this.btk = rcVar.btk();
        }
    }
}
