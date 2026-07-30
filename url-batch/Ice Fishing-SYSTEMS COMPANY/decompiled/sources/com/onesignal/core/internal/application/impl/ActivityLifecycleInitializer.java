package com.onesignal.core.internal.application.impl;

import android.app.Application;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.h;
import r7.C4985p;
import t4.f;

/* loaded from: classes2.dex */
public final class ActivityLifecycleInitializer implements B0.b {
    @Override // B0.b
    public List<Class<? extends B0.b>> dependencies() {
        return C4985p.f40358n;
    }

    @Override // B0.b
    public f create(Context context) {
        h.e(context, "context");
        a c0180a = a.Companion.getInstance();
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            c0180a.attachToApplication(application);
        }
        return c0180a;
    }
}
