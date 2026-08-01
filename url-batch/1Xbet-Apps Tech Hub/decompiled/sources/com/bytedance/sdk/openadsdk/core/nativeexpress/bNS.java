package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: UGenLoadTemplateListenerImpl.java */
/* loaded from: classes2.dex */
public class bNS implements com.bytedance.sdk.openadsdk.core.ugen.Jd.vG {
    private long pvs = 0;
    private long icD = 0;
    private int vG = 0;
    private String Jd = null;
    private String NB = null;
    private final AtomicBoolean sUS = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.vG
    public void pvs() {
        this.pvs = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.vG
    public void pvs(int i, String str, String str2) {
        this.vG = i;
        this.Jd = str;
        this.NB = str2;
        this.icD = SystemClock.elapsedRealtime();
        this.sUS.set(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.vG
    public void pvs(String str) {
        this.NB = str;
        this.icD = SystemClock.elapsedRealtime();
        this.sUS.set(true);
    }

    public void pvs(cR cRVar, String str) {
        if (this.sUS.get()) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, false, str, FirebaseAnalytics.Param.SUCCESS, this.icD - this.pvs, this.NB, "ad", 0, null);
        } else {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, false, str, "fail", this.icD - this.pvs, this.NB, "ad", this.vG, this.Jd);
        }
    }
}
