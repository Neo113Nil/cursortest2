package com.onesignal.debug.internal.crash;

import com.onesignal.otel.IOtelLogger;
import com.onesignal.otel.IOtelPlatformProvider;
import com.onesignal.otel.OtelFactory;
import com.onesignal.otel.crash.IOtelAnrDetector;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OtelAnrDetectorKt {
    public static final IOtelAnrDetector createAnrDetector(IOtelPlatformProvider platformProvider, IOtelLogger logger, long j2, long j6) {
        i.e(platformProvider, "platformProvider");
        i.e(logger, "logger");
        return new OtelAnrDetector(OtelFactory.INSTANCE.createCrashLocalTelemetry(platformProvider), logger, j2, j6);
    }

    public static /* synthetic */ IOtelAnrDetector createAnrDetector$default(IOtelPlatformProvider iOtelPlatformProvider, IOtelLogger iOtelLogger, long j2, long j6, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = AnrConstants.DEFAULT_ANR_THRESHOLD_MS;
        }
        long j7 = j2;
        if ((i2 & 8) != 0) {
            j6 = AnrConstants.DEFAULT_CHECK_INTERVAL_MS;
        }
        return createAnrDetector(iOtelPlatformProvider, iOtelLogger, j7, j6);
    }
}
