package com.onesignal.otel.config;

import android.util.Log;
import com.onesignal.otel.config.OtelConfigRemoteOneSignal;
import com.onesignal.otel.config.OtelConfigShared;
import io.opentelemetry.exporter.otlp.http.logs.OtlpHttpLogRecordExporter;
import io.opentelemetry.exporter.otlp.http.logs.OtlpHttpLogRecordExporterBuilder;
import io.opentelemetry.exporter.otlp.internal.OtlpConfigUtil;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.logs.SdkLoggerProvider;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import io.opentelemetry.sdk.logs.export.LogRecordExporter;
import io.opentelemetry.sdk.resources.Resource;
import java.time.Duration;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: OtelConfigRemoteOneSignal.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\b"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigRemoteOneSignal;", "", "()V", "Companion", "ExporterLoggingConfig", "HttpRecordBatchExporter", "LogRecordExporterConfig", "SdkLoggerProviderConfig", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelConfigRemoteOneSignal {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String OTEL_PATH = "sdk";

    /* compiled from: OtelConfigRemoteOneSignal.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigRemoteOneSignal$Companion;", "", "()V", "OTEL_PATH", "", "buildEndpoint", "apiBaseUrl", "appId", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String buildEndpoint(String apiBaseUrl, String appId) {
            Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
            Intrinsics.checkNotNullParameter(appId, "appId");
            return apiBaseUrl + "sdk/log?app_id=" + appId;
        }
    }

    /* compiled from: OtelConfigRemoteOneSignal.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigRemoteOneSignal$LogRecordExporterConfig;", "", "()V", "EXPORTER_TIMEOUT_SECONDS", "", "otlpHttpLogRecordExporter", "Lio/opentelemetry/sdk/logs/export/LogRecordExporter;", "headers", "", "", "endpoint", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LogRecordExporterConfig {
        private static final long EXPORTER_TIMEOUT_SECONDS = 10;
        public static final LogRecordExporterConfig INSTANCE = new LogRecordExporterConfig();

        private LogRecordExporterConfig() {
        }

        public final LogRecordExporter otlpHttpLogRecordExporter(Map<String, String> headers, String endpoint) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            OtlpHttpLogRecordExporterBuilder builder = OtlpHttpLogRecordExporter.builder();
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                builder.addHeader(entry.getKey(), entry.getValue());
            }
            builder.setEndpoint(endpoint).setTimeout(Duration.ofSeconds(10L));
            OtlpHttpLogRecordExporter build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
    }

    /* compiled from: OtelConfigRemoteOneSignal.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigRemoteOneSignal$SdkLoggerProviderConfig;", "", "()V", "create", "Lio/opentelemetry/sdk/logs/SdkLoggerProvider;", "resource", "Lio/opentelemetry/sdk/resources/Resource;", "extraHttpHeaders", "", "", "appId", "apiBaseUrl", "enableExporterLogging", "", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SdkLoggerProviderConfig {
        public static final SdkLoggerProviderConfig INSTANCE = new SdkLoggerProviderConfig();

        private SdkLoggerProviderConfig() {
        }

        public final SdkLoggerProvider create(Resource resource, Map<String, String> extraHttpHeaders, String appId, String apiBaseUrl, boolean enableExporterLogging) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(extraHttpHeaders, "extraHttpHeaders");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
            SdkLoggerProvider build = SdkLoggerProvider.builder().setResource(resource).addLogRecordProcessor(OtelConfigShared.LogRecordProcessorConfig.INSTANCE.batchLogRecordProcessor(HttpRecordBatchExporter.INSTANCE.create(extraHttpHeaders, appId, apiBaseUrl, enableExporterLogging))).setLogLimits(new OtelConfigCrashFile$SdkLoggerProviderConfig$$ExternalSyntheticLambda0(OtelConfigShared.LogLimitsConfig.INSTANCE)).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
    }

    /* compiled from: OtelConfigRemoteOneSignal.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigRemoteOneSignal$HttpRecordBatchExporter;", "", "()V", "create", "Lio/opentelemetry/sdk/logs/export/LogRecordExporter;", "extraHttpHeaders", "", "", "appId", "apiBaseUrl", "enableExporterLogging", "", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HttpRecordBatchExporter {
        public static final HttpRecordBatchExporter INSTANCE = new HttpRecordBatchExporter();

        private HttpRecordBatchExporter() {
        }

        public final LogRecordExporter create(Map<String, String> extraHttpHeaders, String appId, String apiBaseUrl, boolean enableExporterLogging) {
            Intrinsics.checkNotNullParameter(extraHttpHeaders, "extraHttpHeaders");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
            LogRecordExporter otlpHttpLogRecordExporter = LogRecordExporterConfig.INSTANCE.otlpHttpLogRecordExporter(extraHttpHeaders, OtelConfigRemoteOneSignal.INSTANCE.buildEndpoint(apiBaseUrl, appId));
            return enableExporterLogging ? ExporterLoggingConfig.INSTANCE.loggingExporter(otlpHttpLogRecordExporter) : otlpHttpLogRecordExporter;
        }
    }

    /* compiled from: OtelConfigRemoteOneSignal.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigRemoteOneSignal$ExporterLoggingConfig;", "", "()V", "TAG", "", "loggingExporter", "Lio/opentelemetry/sdk/logs/export/LogRecordExporter;", "delegate", "LoggingLogRecordExporter", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExporterLoggingConfig {
        public static final ExporterLoggingConfig INSTANCE = new ExporterLoggingConfig();
        private static final String TAG = "OneSignalOtel";

        private ExporterLoggingConfig() {
        }

        public final LogRecordExporter loggingExporter(LogRecordExporter delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            return new LoggingLogRecordExporter(delegate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: OtelConfigRemoteOneSignal.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/onesignal/otel/config/OtelConfigRemoteOneSignal$ExporterLoggingConfig$LoggingLogRecordExporter;", "Lio/opentelemetry/sdk/logs/export/LogRecordExporter;", "delegate", "(Lio/opentelemetry/sdk/logs/export/LogRecordExporter;)V", "export", "Lio/opentelemetry/sdk/common/CompletableResultCode;", OtlpConfigUtil.DATA_TYPE_LOGS, "", "Lio/opentelemetry/sdk/logs/data/LogRecordData;", "flush", "resolveHttpFailureMessage", "", "throwable", "", "shutdown", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
        static final class LoggingLogRecordExporter implements LogRecordExporter {
            private final LogRecordExporter delegate;

            public LoggingLogRecordExporter(LogRecordExporter delegate) {
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                this.delegate = delegate;
            }

            private final String resolveHttpFailureMessage(Throwable throwable) {
                String str;
                if (throwable == null) {
                    return "unknown";
                }
                try {
                    String name = throwable.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (!StringsKt.endsWith$default(name, "FailedExportException$HttpExportException", false, 2, (Object) null)) {
                        String message = throwable.getMessage();
                        return message == null ? "unknown" : message;
                    }
                    Object invoke = throwable.getClass().getMethod("getResponse", new Class[0]).invoke(throwable, new Object[0]);
                    if (invoke == null) {
                        String message2 = throwable.getMessage();
                        return message2 == null ? "unknown" : message2;
                    }
                    Object invoke2 = invoke.getClass().getMethod("statusCode", new Class[0]).invoke(invoke, new Object[0]);
                    Object invoke3 = invoke.getClass().getMethod("statusMessage", new Class[0]).invoke(invoke, new Object[0]);
                    Object invoke4 = invoke.getClass().getMethod("responseBody", new Class[0]).invoke(invoke, new Object[0]);
                    byte[] bArr = invoke4 instanceof byte[] ? (byte[]) invoke4 : null;
                    String decodeToString = bArr != null ? StringsKt.decodeToString(bArr) : null;
                    StringBuilder append = new StringBuilder("status=").append(invoke2).append(" message=").append(invoke3);
                    String str2 = decodeToString;
                    if (str2 != null && !StringsKt.isBlank(str2)) {
                        str = " body=" + decodeToString;
                        return append.append(str).toString();
                    }
                    str = "";
                    return append.append(str).toString();
                } catch (Throwable unused) {
                    String message3 = throwable.getMessage();
                    return message3 == null ? "unknown" : message3;
                }
            }

            @Override // io.opentelemetry.sdk.logs.export.LogRecordExporter
            public CompletableResultCode export(Collection<? extends LogRecordData> logs) {
                Intrinsics.checkNotNullParameter(logs, "logs");
                Log.d(ExporterLoggingConfig.TAG, "OTEL export request sent to backend. count=" + logs.size());
                final CompletableResultCode export = this.delegate.export(logs);
                export.whenComplete(new Runnable() { // from class: com.onesignal.otel.config.OtelConfigRemoteOneSignal$ExporterLoggingConfig$LoggingLogRecordExporter$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        OtelConfigRemoteOneSignal.ExporterLoggingConfig.LoggingLogRecordExporter.export$lambda$0(CompletableResultCode.this, this);
                    }
                });
                Intrinsics.checkNotNull(export);
                return export;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void export$lambda$0(CompletableResultCode completableResultCode, LoggingLogRecordExporter this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (completableResultCode.isSuccess()) {
                    Log.d(ExporterLoggingConfig.TAG, "OTEL export response received: success");
                    return;
                }
                Throwable failureThrowable = completableResultCode.getFailureThrowable();
                Log.e(ExporterLoggingConfig.TAG, "OTEL export response received: failed - " + this$0.resolveHttpFailureMessage(failureThrowable), failureThrowable);
            }

            @Override // io.opentelemetry.sdk.logs.export.LogRecordExporter
            public CompletableResultCode flush() {
                CompletableResultCode flush = this.delegate.flush();
                Intrinsics.checkNotNullExpressionValue(flush, "flush(...)");
                return flush;
            }

            @Override // io.opentelemetry.sdk.logs.export.LogRecordExporter
            public CompletableResultCode shutdown() {
                CompletableResultCode shutdown = this.delegate.shutdown();
                Intrinsics.checkNotNullExpressionValue(shutdown, "shutdown(...)");
                return shutdown;
            }
        }
    }
}
