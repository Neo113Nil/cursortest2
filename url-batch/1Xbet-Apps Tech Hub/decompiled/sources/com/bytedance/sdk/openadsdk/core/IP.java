package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* compiled from: InitLifecycleHelper.java */
/* loaded from: classes2.dex */
public class IP {
    private boolean icD;
    private final com.bytedance.sdk.openadsdk.utils.pvs pvs = new com.bytedance.sdk.openadsdk.utils.pvs();

    public static IP pvs() {
        return pvs.pvs;
    }

    /* compiled from: InitLifecycleHelper.java */
    private static class pvs {
        private static final IP pvs = new IP();
    }

    public void icD() {
        try {
            Context pvs2 = mnm.pvs();
            if (pvs2 instanceof Application) {
                ((Application) pvs2).registerActivityLifecycleCallbacks(this.pvs);
                this.icD = true;
            } else {
                if (pvs2 == null || pvs2.getApplicationContext() == null) {
                    return;
                }
                ((Application) pvs2.getApplicationContext()).registerActivityLifecycleCallbacks(this.pvs);
                this.icD = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public boolean vG() {
        return this.icD;
    }

    public boolean Jd() {
        return this.pvs.pvs();
    }

    public boolean pvs(boolean z) {
        return this.pvs.pvs(z);
    }

    public com.bytedance.sdk.openadsdk.utils.pvs NB() {
        return this.pvs;
    }
}
