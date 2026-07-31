package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* loaded from: classes4.dex */
public class cyb {
    private boolean fs;
    private final com.bytedance.sdk.openadsdk.utils.zmn zmn = new com.bytedance.sdk.openadsdk.utils.zmn();

    public static cyb zmn() {
        return zmn.zmn;
    }

    private static class zmn {
        private static final cyb zmn = new cyb();
    }

    public void fs() {
        try {
            Context zmn2 = kgc.zmn();
            if (zmn2 instanceof Application) {
                ((Application) zmn2).registerActivityLifecycleCallbacks(this.zmn);
                this.fs = true;
            } else {
                if (zmn2 == null || zmn2.getApplicationContext() == null) {
                    return;
                }
                ((Application) zmn2.getApplicationContext()).registerActivityLifecycleCallbacks(this.zmn);
                this.fs = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public boolean zn() {
        return this.fs;
    }

    public boolean fb() {
        return this.zmn.zmn();
    }

    public boolean zmn(boolean z) {
        return this.zmn.zmn(z);
    }

    public com.bytedance.sdk.openadsdk.utils.zmn btk() {
        return this.zmn;
    }
}
