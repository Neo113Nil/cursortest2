package com.bytedance.sdk.openadsdk.Wyp.vG;

/* compiled from: LogUploaderImplEmpty.java */
/* loaded from: classes2.dex */
class Jd implements icD {
    private static volatile Jd pvs;

    @Override // com.bytedance.sdk.openadsdk.Wyp.vG.icD
    public void pvs(com.bytedance.sdk.openadsdk.Wyp.icD icd) {
    }

    @Override // com.bytedance.sdk.openadsdk.Wyp.vG.icD
    public void pvs(com.bytedance.sdk.openadsdk.Wyp.icD icd, boolean z) {
    }

    public static Jd pvs() {
        if (pvs == null) {
            synchronized (Jd.class) {
                if (pvs == null) {
                    pvs = new Jd();
                }
            }
        }
        return pvs;
    }

    private Jd() {
    }
}
