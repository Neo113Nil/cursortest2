package com.bytedance.sdk.openadsdk.core.fs;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.nqi;
import com.bytedance.sdk.openadsdk.kgc.fb;
import com.bytedance.sdk.openadsdk.kgc.zn;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;

/* loaded from: classes12.dex */
public class zmn implements nqi.zmn {
    private final AdSlot fs;
    private final nqi.zmn zmn;
    private final boolean zn;

    public zmn(nqi.zmn zmnVar, AdSlot adSlot, boolean z) {
        this.zmn = zmnVar;
        this.fs = adSlot;
        this.zn = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nqi.zmn
    public void zmn(final int i, final String str) {
        AdSlot adSlot;
        if (this.zmn != null) {
            if (nu.hhw() || ((adSlot = this.fs) != null && adSlot.getDurationSlotType() != 5 && btk.zmn("getads_callback_async", 0) == 1)) {
                this.zmn.zmn(i, str);
            } else {
                nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.zmn.1
                    @Override // java.lang.Runnable
                    public void run() {
                        zmn.this.zmn.zmn(i, str);
                    }
                });
            }
            if (!this.zn || this.fs == null) {
                return;
            }
            zn.zn(new fb() { // from class: com.bytedance.sdk.openadsdk.core.fs.zmn.2
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("load_ad");
                    zmnVar.zn(zmn.this.fs.getCodeId());
                    zmnVar.fb(oub.zn(zmn.this.fs.getDurationSlotType()));
                    zmnVar.nps(oub.zmn(zmn.this.fs).toString());
                    return zmnVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nqi.zmn
    public void zmn(final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, final com.bytedance.sdk.openadsdk.core.model.zn znVar) {
        AdSlot adSlot;
        if (this.zmn != null) {
            if (nu.hhw() || ((adSlot = this.fs) != null && adSlot.getDurationSlotType() != 5 && btk.zmn("getads_callback_async", 0) == 1)) {
                this.zmn.zmn(zmnVar, znVar);
            } else {
                nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.zmn.3
                    @Override // java.lang.Runnable
                    public void run() {
                        zmn.this.zmn.zmn(zmnVar, znVar);
                    }
                });
            }
            if (!this.zn || this.fs == null) {
                return;
            }
            zn.fs(new fb() { // from class: com.bytedance.sdk.openadsdk.core.fs.zmn.4
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar2.fs("load_ad");
                    zmnVar2.zn(zmn.this.fs.getCodeId());
                    zmnVar2.fb(oub.zn(zmn.this.fs.getDurationSlotType()));
                    zmnVar2.nps(oub.zmn(zmn.this.fs).toString());
                    return zmnVar2;
                }
            });
        }
    }
}
