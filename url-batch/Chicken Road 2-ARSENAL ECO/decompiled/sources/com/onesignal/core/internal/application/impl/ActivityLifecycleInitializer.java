package com.onesignal.core.internal.application.impl;

import T1.f;
import android.app.Application;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.i;
import l5.C0512p;

/* loaded from: classes.dex */
public final class ActivityLifecycleInitializer implements X.b {
    @Override // X.b
    public List<Class<? extends X.b>> dependencies() {
        return C0512p.f5303f;
    }

    @Override // X.b
    public f create(Context context) {
        i.e(context, "context");
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        a c0012a = a.Companion.getInstance();
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            c0012a.attachToApplication(application);
        }
        return c0012a;
    }
}
