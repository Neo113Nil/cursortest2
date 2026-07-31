package com.onesignal.debug.internal.crash;

import android.content.Context;
import c3.InterfaceC0281a;
import f3.C0370c;
import u0.C0675e;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class m {
    public static final m INSTANCE = new m();

    private m() {
    }

    public final InterfaceC0281a createCrashHandler(Context context, c3.c logger, InterfaceC0732a featureManagerProvider) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(logger, "logger");
        kotlin.jvm.internal.i.e(featureManagerProvider, "featureManagerProvider");
        if (!r.INSTANCE.isSupported()) {
            throw new IllegalArgumentException("createCrashHandler called on unsupported SDK (< 26)");
        }
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Creating Otel crash handler (SDK >= 26)", null, 2, null);
        com.onesignal.debug.internal.logging.otel.android.c platformProvider = com.onesignal.debug.internal.logging.otel.android.e.createAndroidOtelPlatformProvider(context, featureManagerProvider);
        kotlin.jvm.internal.i.e(platformProvider, "platformProvider");
        return new C0370c(new C0675e(new c3.k(platformProvider, new a6.d(platformProvider), new V5.g(4, platformProvider)), 10, logger), logger);
    }
}
