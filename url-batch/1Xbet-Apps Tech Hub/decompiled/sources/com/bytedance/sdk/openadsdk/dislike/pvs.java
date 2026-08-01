package com.bytedance.sdk.openadsdk.dislike;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.vA;
import java.util.List;

/* compiled from: DislikeDispatcher.java */
/* loaded from: classes2.dex */
public class pvs {
    private static volatile pvs pvs;
    private final vA<com.bytedance.sdk.openadsdk.icD.pvs> icD = mnm.vG();

    private pvs() {
    }

    public static pvs pvs() {
        if (pvs == null) {
            synchronized (pvs.class) {
                if (pvs == null) {
                    pvs = new pvs();
                }
            }
        }
        return pvs;
    }

    public void pvs(String str, List<FilterWord> list, String str2) {
        pvs(str, list, null, null, str2);
    }

    public void pvs(String str, List<FilterWord> list, String str2, String str3, String str4) {
        this.icD.pvs(str, list, str2, str3, str4);
    }
}
