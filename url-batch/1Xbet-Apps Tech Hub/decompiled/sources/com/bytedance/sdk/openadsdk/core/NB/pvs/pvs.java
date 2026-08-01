package com.bytedance.sdk.openadsdk.core.NB.pvs;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ActivityLifecycleCallbackForSec.java */
/* loaded from: classes2.dex */
public class pvs implements Application.ActivityLifecycleCallbacks {
    private static volatile pvs pvs;
    private final icD icD;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    private pvs(Application application) {
        this.icD = icD.pvs(application);
    }

    public static pvs pvs(Application application) {
        if (pvs == null) {
            synchronized (pvs.class) {
                if (pvs == null) {
                    pvs = new pvs(application);
                    application.registerActivityLifecycleCallbacks(pvs);
                }
            }
        }
        return pvs;
    }

    public String pvs(String str, long j, int i) {
        icD icd = this.icD;
        return icd != null ? icd.pvs(str, j, i) : AbstractJsonLexerKt.NULL;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        icD icd = this.icD;
        if (icd != null) {
            icd.pvs(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        icD icd = this.icD;
        if (icd != null) {
            icd.icD(activity);
        }
    }
}
