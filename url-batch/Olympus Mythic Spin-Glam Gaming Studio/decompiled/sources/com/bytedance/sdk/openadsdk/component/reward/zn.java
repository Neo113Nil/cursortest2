package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.utils.nu;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class zn extends com.bytedance.sdk.component.zg.fs.zn {
    private final List<? extends com.bytedance.sdk.component.zg.fs.zn> zmn;

    public zn(String str, List<? extends com.bytedance.sdk.component.zg.fs.zn> list) {
        super(str);
        this.zmn = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.zg.fs.zn> list;
        if (com.bytedance.sdk.component.utils.kgc.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn()) != 0 && (list = this.zmn) != null) {
            Iterator<? extends com.bytedance.sdk.component.zg.fs.zn> it = list.iterator();
            while (it.hasNext()) {
                nu.zmn(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.bvs.zmn().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
