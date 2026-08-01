package com.bytedance.sdk.openadsdk.sUS;

import com.bytedance.sdk.component.NB.Mxy;
import com.bytedance.sdk.component.NB.uc;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: StepTrackImpl.java */
/* loaded from: classes2.dex */
public class NB implements uc {
    private static int pvs;
    private boolean Jd;
    private final String NB;
    private long icD = 0;
    private long vG;

    public NB() {
        pvs++;
        this.NB = "image_request_" + pvs;
    }

    @Override // com.bytedance.sdk.component.NB.uc
    public void pvs(String str, Mxy mxy) {
        if (!this.Jd) {
            mxy.pvs();
            mxy.icD();
            mxy.vG();
            this.Jd = true;
        }
        this.icD = System.currentTimeMillis();
        vG(str, mxy);
    }

    @Override // com.bytedance.sdk.component.NB.uc
    public void icD(String str, Mxy mxy) {
        this.vG += System.currentTimeMillis() - this.icD;
        vG(str, mxy);
    }

    private String vG(String str, Mxy mxy) {
        com.bytedance.sdk.component.NB.vG.pvs cR;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "success":
                    return FirebaseAnalytics.Param.SUCCESS;
                case "raw_cache":
                    return "raw cache";
                case "image_type":
                    return "image type：";
                case "disk_cache":
                    return "disk cache";
                case "decode":
                    return "decode";
                case "failed":
                    if (!(mxy instanceof com.bytedance.sdk.component.NB.vG.vG) || (cR = ((com.bytedance.sdk.component.NB.vG.vG) mxy).cR()) == null) {
                        return "fail";
                    }
                    Throwable vG = cR.vG();
                    return "fail：code:" + cR.pvs() + ", msg:" + cR.icD() + ", exception:" + (vG != null ? vG.getMessage() : "null \r\n");
                case "check_duplicate":
                    return "duplicate request";
                case "memory_cache":
                    return "memory cache";
                case "net_request":
                    return "net request";
                case "generate_key":
                    return "generate key:" + mxy.NB();
                case "cache_policy":
                    return "cache policy";
            }
        }
        return str;
    }
}
