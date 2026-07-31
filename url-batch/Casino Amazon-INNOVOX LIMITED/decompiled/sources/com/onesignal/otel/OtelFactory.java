package com.onesignal.otel;

import com.onesignal.otel.attributes.OtelFieldsPerEvent;
import com.onesignal.otel.attributes.OtelFieldsTopLevel;
import com.onesignal.otel.crash.OtelCrashHandler;
import com.onesignal.otel.crash.OtelCrashReporter;
import com.onesignal.otel.crash.OtelCrashUploader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelFactory.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/onesignal/otel/OtelFactory;", "", "()V", "createCrashHandler", "Lcom/onesignal/otel/IOtelCrashHandler;", "platformProvider", "Lcom/onesignal/otel/IOtelPlatformProvider;", "logger", "Lcom/onesignal/otel/IOtelLogger;", "createCrashLocalTelemetry", "Lcom/onesignal/otel/IOtelOpenTelemetryCrash;", "createCrashReporter", "Lcom/onesignal/otel/IOtelCrashReporter;", "openTelemetryCrash", "createCrashUploader", "Lcom/onesignal/otel/crash/OtelCrashUploader;", "createRemoteTelemetry", "Lcom/onesignal/otel/IOtelOpenTelemetryRemote;", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelFactory {
    public static final OtelFactory INSTANCE = new OtelFactory();

    private OtelFactory() {
    }

    public final IOtelCrashHandler createCrashHandler(IOtelPlatformProvider platformProvider, IOtelLogger logger) {
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new OtelCrashHandler(createCrashReporter(createCrashLocalTelemetry(platformProvider), logger), logger);
    }

    public final OtelCrashUploader createCrashUploader(IOtelPlatformProvider platformProvider, IOtelLogger logger) {
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new OtelCrashUploader(new OneSignalOpenTelemetryRemote(platformProvider, new OtelFieldsTopLevel(platformProvider), new OtelFieldsPerEvent(platformProvider)), platformProvider, logger);
    }

    public final IOtelOpenTelemetryRemote createRemoteTelemetry(IOtelPlatformProvider platformProvider) {
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        return new OneSignalOpenTelemetryRemote(platformProvider, new OtelFieldsTopLevel(platformProvider), new OtelFieldsPerEvent(platformProvider));
    }

    public final IOtelOpenTelemetryCrash createCrashLocalTelemetry(IOtelPlatformProvider platformProvider) {
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        return new OneSignalOpenTelemetryCrashLocal(platformProvider, new OtelFieldsTopLevel(platformProvider), new OtelFieldsPerEvent(platformProvider));
    }

    public final IOtelCrashReporter createCrashReporter(IOtelOpenTelemetryCrash openTelemetryCrash, IOtelLogger logger) {
        Intrinsics.checkNotNullParameter(openTelemetryCrash, "openTelemetryCrash");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new OtelCrashReporter(openTelemetryCrash, logger);
    }
}
