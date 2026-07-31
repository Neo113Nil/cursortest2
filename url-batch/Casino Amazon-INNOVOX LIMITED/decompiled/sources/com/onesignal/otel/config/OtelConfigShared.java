package com.onesignal.otel.config;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.sdk.logs.LogLimits;
import io.opentelemetry.sdk.logs.LogRecordProcessor;
import io.opentelemetry.sdk.logs.export.BatchLogRecordProcessor;
import io.opentelemetry.sdk.logs.export.LogRecordExporter;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.resources.ResourceBuilder;
import io.opentelemetry.semconv.ServiceAttributes;
import java.time.Duration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelConfigShared.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigShared;", "", "()V", "LogLimitsConfig", "LogRecordProcessorConfig", "ResourceConfig", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelConfigShared {

    /* compiled from: OtelConfigShared.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigShared$ResourceConfig;", "", "()V", "create", "Lio/opentelemetry/sdk/resources/Resource;", "attributes", "", "", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResourceConfig {
        public static final ResourceConfig INSTANCE = new ResourceConfig();

        private ResourceConfig() {
        }

        public final Resource create(Map<String, String> attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            ResourceBuilder put = Resource.getDefault().toBuilder().put((AttributeKey<AttributeKey<String>>) ServiceAttributes.SERVICE_NAME, (AttributeKey<String>) "OneSignalDeviceSDK");
            Intrinsics.checkNotNullExpressionValue(put, "put(...)");
            Resource build = OtelConfigSharedKt.putAll(put, attributes).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
    }

    /* compiled from: OtelConfigShared.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigShared$LogRecordProcessorConfig;", "", "()V", "EXPORTER_TIMEOUT_SECONDS", "", "MAX_EXPORT_BATCH_SIZE", "", "MAX_QUEUE_SIZE", "SCHEDULE_DELAY_SECONDS", "batchLogRecordProcessor", "Lio/opentelemetry/sdk/logs/LogRecordProcessor;", "logRecordExporter", "Lio/opentelemetry/sdk/logs/export/LogRecordExporter;", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LogRecordProcessorConfig {
        private static final long EXPORTER_TIMEOUT_SECONDS = 30;
        public static final LogRecordProcessorConfig INSTANCE = new LogRecordProcessorConfig();
        private static final int MAX_EXPORT_BATCH_SIZE = 100;
        private static final int MAX_QUEUE_SIZE = 100;
        private static final long SCHEDULE_DELAY_SECONDS = 1;

        private LogRecordProcessorConfig() {
        }

        public final LogRecordProcessor batchLogRecordProcessor(LogRecordExporter logRecordExporter) {
            Intrinsics.checkNotNullParameter(logRecordExporter, "logRecordExporter");
            BatchLogRecordProcessor build = BatchLogRecordProcessor.builder(logRecordExporter).setMaxQueueSize(100).setMaxExportBatchSize(100).setExporterTimeout(Duration.ofSeconds(30L)).setScheduleDelay(Duration.ofSeconds(SCHEDULE_DELAY_SECONDS)).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
    }

    /* compiled from: OtelConfigShared.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigShared$LogLimitsConfig;", "", "()V", "MAX_ATTRIBUTE_VALUE_LENGTH", "", "MAX_NUMBER_OF_ATTRIBUTES", "logLimits", "Lio/opentelemetry/sdk/logs/LogLimits;", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LogLimitsConfig {
        public static final LogLimitsConfig INSTANCE = new LogLimitsConfig();
        private static final int MAX_ATTRIBUTE_VALUE_LENGTH = 32000;
        private static final int MAX_NUMBER_OF_ATTRIBUTES = 128;

        private LogLimitsConfig() {
        }

        public final LogLimits logLimits() {
            LogLimits build = LogLimits.builder().setMaxNumberOfAttributes(128).setMaxAttributeValueLength(MAX_ATTRIBUTE_VALUE_LENGTH).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
    }
}
