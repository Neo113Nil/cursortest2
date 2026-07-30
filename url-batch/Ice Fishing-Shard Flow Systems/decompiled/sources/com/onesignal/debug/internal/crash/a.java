package com.onesignal.debug.internal.crash;

import E3.k;
import P0.l;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    public final E3.a createCrashHandler(Context context, E3.c logger, Function0<? extends B2.e> featureManagerProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(featureManagerProvider, "featureManagerProvider");
        if (!f.INSTANCE.isSupported()) {
            throw new IllegalArgumentException("createCrashHandler called on unsupported SDK (< 26)");
        }
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Creating Otel crash handler (SDK >= 26)", null, 2, null);
        com.onesignal.debug.internal.logging.otel.android.c platformProvider = com.onesignal.debug.internal.logging.otel.android.e.createAndroidOtelPlatformProvider(context, featureManagerProvider);
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        k openTelemetryCrash = new k(platformProvider, new B.f(platformProvider), new l2.c((E3.f) platformProvider));
        Intrinsics.checkNotNullParameter(openTelemetryCrash, "openTelemetryCrash");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new H3.c(new l(openTelemetryCrash, logger), logger);
    }
}
