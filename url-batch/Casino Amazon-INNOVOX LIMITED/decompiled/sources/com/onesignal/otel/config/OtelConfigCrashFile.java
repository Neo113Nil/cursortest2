package com.onesignal.otel.config;

import com.onesignal.otel.config.OtelConfigShared;
import io.opentelemetry.contrib.disk.buffering.exporters.LogRecordToDiskExporter;
import io.opentelemetry.contrib.disk.buffering.storage.impl.FileLogRecordStorage;
import io.opentelemetry.contrib.disk.buffering.storage.impl.FileStorageConfiguration;
import io.opentelemetry.sdk.logs.SdkLoggerProvider;
import io.opentelemetry.sdk.logs.export.BatchLogRecordProcessor;
import io.opentelemetry.sdk.resources.Resource;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: OtelConfigCrashFile.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigCrashFile;", "", "()V", "SdkLoggerProviderConfig", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelConfigCrashFile {

    /* compiled from: OtelConfigCrashFile.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigCrashFile$SdkLoggerProviderConfig;", "", "()V", "MAX_FILE_AGE_FOR_WRITE_MILLIS", "", "create", "Lio/opentelemetry/sdk/logs/SdkLoggerProvider;", "resource", "Lio/opentelemetry/sdk/resources/Resource;", "rootDir", "", "minFileAgeForReadMillis", "getFileLogRecordStorage", "Lio/opentelemetry/contrib/disk/buffering/storage/impl/FileLogRecordStorage;", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SdkLoggerProviderConfig {
        public static final SdkLoggerProviderConfig INSTANCE = new SdkLoggerProviderConfig();
        private static final long MAX_FILE_AGE_FOR_WRITE_MILLIS = 2000;

        private SdkLoggerProviderConfig() {
        }

        public final FileLogRecordStorage getFileLogRecordStorage(String rootDir, long minFileAgeForReadMillis) {
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
            File file = new File(rootDir);
            FileStorageConfiguration.Builder minFileAgeForReadMillis2 = FileStorageConfiguration.builder().setMaxFileAgeForWriteMillis(2000L).setMinFileAgeForReadMillis(minFileAgeForReadMillis);
            Duration.Companion companion = Duration.INSTANCE;
            FileLogRecordStorage create = FileLogRecordStorage.create(file, minFileAgeForReadMillis2.setMaxFileAgeForReadMillis(Duration.m5343getInWholeMillisecondsimpl(DurationKt.toDuration(72, DurationUnit.HOURS))).build());
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return create;
        }

        public final SdkLoggerProvider create(Resource resource, String rootDir, long minFileAgeForReadMillis) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
            SdkLoggerProvider build = SdkLoggerProvider.builder().setResource(resource).addLogRecordProcessor(BatchLogRecordProcessor.builder(LogRecordToDiskExporter.builder(getFileLogRecordStorage(rootDir, minFileAgeForReadMillis)).build()).build()).setLogLimits(new OtelConfigCrashFile$SdkLoggerProviderConfig$$ExternalSyntheticLambda0(OtelConfigShared.LogLimitsConfig.INSTANCE)).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
    }
}
