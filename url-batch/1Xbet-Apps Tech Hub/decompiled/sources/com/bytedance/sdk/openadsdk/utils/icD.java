package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* compiled from: AdUtils.java */
/* loaded from: classes2.dex */
public class icD {
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.cR> pvs;

    public static com.bytedance.sdk.openadsdk.core.model.cR pvs() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.cR> softReference = pvs;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        if (cRVar == null) {
            return;
        }
        pvs = new SoftReference<>(cRVar);
    }
}
