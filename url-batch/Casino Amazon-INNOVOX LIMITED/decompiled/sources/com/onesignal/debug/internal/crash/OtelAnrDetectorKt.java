package com.onesignal.debug.internal.crash;

import com.onesignal.core.BuildConfig;
import com.onesignal.otel.IOtelLogger;
import com.onesignal.otel.IOtelPlatformProvider;
import com.onesignal.otel.OtelFactory;
import com.onesignal.otel.crash.IOtelAnrDetector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelAnrDetector.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0000¨\u0006\n"}, d2 = {"createAnrDetector", "Lcom/onesignal/otel/crash/IOtelAnrDetector;", "platformProvider", "Lcom/onesignal/otel/IOtelPlatformProvider;", "logger", "Lcom/onesignal/otel/IOtelLogger;", "anrThresholdMs", "", "checkIntervalMs", "backgroundThresholdMs", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelAnrDetectorKt {
    public static final IOtelAnrDetector createAnrDetector(final IOtelPlatformProvider platformProvider, IOtelLogger logger, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new OtelAnrDetector(OtelFactory.INSTANCE.createCrashLocalTelemetry(platformProvider), logger, j, j2, j3, new Function0<Boolean>() { // from class: com.onesignal.debug.internal.crash.OtelAnrDetectorKt$createAnrDetector$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(!Intrinsics.areEqual(IOtelPlatformProvider.this.getAppState(), "background"));
            }
        }, null, 64, null);
    }
}
