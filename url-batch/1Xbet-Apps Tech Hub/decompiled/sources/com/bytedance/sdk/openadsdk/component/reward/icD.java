package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.mnm;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.util.Iterator;
import java.util.List;

/* compiled from: ContinueDownloadTask.java */
/* loaded from: classes2.dex */
public class icD extends com.bytedance.sdk.component.so.so {
    private final List<? extends com.bytedance.sdk.component.so.so> pvs;

    public icD(String str, List<? extends com.bytedance.sdk.component.so.so> list) {
        super(str);
        this.pvs = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.so.so> list;
        if (mnm.vG(com.bytedance.sdk.openadsdk.core.mnm.pvs()) != 0 && (list = this.pvs) != null) {
            Iterator<? extends com.bytedance.sdk.component.so.so> it = list.iterator();
            while (it.hasNext()) {
                ae.pvs(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.so.pvs().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
