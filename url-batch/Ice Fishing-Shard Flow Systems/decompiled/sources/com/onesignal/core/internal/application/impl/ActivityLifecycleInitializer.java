package com.onesignal.core.internal.application.impl;

import android.app.Application;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.A;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC0797b;
import v2.f;

@Metadata
/* loaded from: classes.dex */
public final class ActivityLifecycleInitializer implements InterfaceC0797b {
    @Override // o0.InterfaceC0797b
    public List<Class<? extends InterfaceC0797b>> dependencies() {
        return A.f6115d;
    }

    @Override // o0.InterfaceC0797b
    public f create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a c0011a = a.Companion.getInstance();
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            c0011a.attachToApplication(application);
        }
        return c0011a;
    }
}
