package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.AdSlot;

/* loaded from: classes6.dex */
public class rt implements Runnable {
    AdSlot fs;
    boolean zmn;

    public rt(boolean z, AdSlot adSlot) {
        this.zmn = z;
        this.fs = adSlot;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.zmn) {
            if (com.bytedance.sdk.openadsdk.utils.fs.zn()) {
                kgc.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()).zmn(this.fs);
                return;
            } else {
                olo.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()).zmn(this.fs);
                return;
            }
        }
        if (com.bytedance.sdk.openadsdk.utils.fs.zn()) {
            nps.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()).zmn(this.fs);
        } else {
            hhw.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()).zmn(this.fs);
        }
    }
}
