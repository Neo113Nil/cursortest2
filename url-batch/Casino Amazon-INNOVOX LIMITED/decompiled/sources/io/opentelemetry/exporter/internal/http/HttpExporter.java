package io.opentelemetry.exporter.internal.http;

import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.exporter.internal.FailedExportException;
import io.opentelemetry.exporter.internal.grpc.GrpcExporterUtil;
import io.opentelemetry.exporter.internal.http.HttpSender;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.metrics.ExporterInstrumentation;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.InternalTelemetryVersion;
import io.opentelemetry.sdk.internal.StandardComponentId;
import io.opentelemetry.sdk.internal.ThrottlingLogger;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class HttpExporter<T extends Marshaler> {
    private static final Logger internalLogger = Logger.getLogger(HttpExporter.class.getName());
    private final ExporterInstrumentation exporterMetrics;
    private final HttpSender httpSender;
    private final String type;
    private final ThrottlingLogger logger = new ThrottlingLogger(internalLogger);
    private final AtomicBoolean isShutdown = new AtomicBoolean();

    public HttpExporter(StandardComponentId standardComponentId, HttpSender httpSender, Supplier<MeterProvider> supplier, InternalTelemetryVersion internalTelemetryVersion, String str) {
        this.type = standardComponentId.getStandardType().signal().logFriendlyName();
        this.httpSender = httpSender;
        this.exporterMetrics = new ExporterInstrumentation(internalTelemetryVersion, supplier, standardComponentId, str);
    }

    public CompletableResultCode export(T t, int i) {
        if (this.isShutdown.get()) {
            return CompletableResultCode.ofFailure();
        }
        final ExporterInstrumentation.Recording startRecordingExport = this.exporterMetrics.startRecordingExport(i);
        final CompletableResultCode completableResultCode = new CompletableResultCode();
        this.httpSender.send(t, t.getBinarySerializedSize(), new Consumer() { // from class: io.opentelemetry.exporter.internal.http.HttpExporter$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                HttpExporter.this.m3923x42046fec(completableResultCode, startRecordingExport, (HttpSender.Response) obj);
            }
        }, new Consumer() { // from class: io.opentelemetry.exporter.internal.http.HttpExporter$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                HttpExporter.this.m3924x5c1fee8b(completableResultCode, startRecordingExport, (Throwable) obj);
            }
        });
        return completableResultCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onResponse, reason: merged with bridge method [inline-methods] */
    public void m3923x42046fec(CompletableResultCode completableResultCode, ExporterInstrumentation.Recording recording, HttpSender.Response response) {
        byte[] bArr;
        int statusCode = response.statusCode();
        recording.setHttpStatusCode(statusCode);
        if (statusCode >= 200 && statusCode < 300) {
            recording.finishSuccessful();
            completableResultCode.succeed();
            return;
        }
        recording.finishFailed(String.valueOf(statusCode));
        try {
            bArr = response.responseBody();
        } catch (IOException e) {
            this.logger.log(Level.FINE, "Unable to obtain response body", e);
            bArr = null;
        }
        this.logger.log(Level.WARNING, "Failed to export " + this.type + "s. Server responded with HTTP status code " + statusCode + ". Error message: " + extractErrorStatus(response.statusMessage(), bArr));
        completableResultCode.failExceptionally(FailedExportException.httpFailedWithResponse(response));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onError, reason: merged with bridge method [inline-methods] */
    public void m3924x5c1fee8b(CompletableResultCode completableResultCode, ExporterInstrumentation.Recording recording, Throwable th) {
        recording.finishFailed(th);
        this.logger.log(Level.SEVERE, "Failed to export " + this.type + "s. The request could not be executed. Full error message: " + th.getMessage(), th);
        completableResultCode.failExceptionally(FailedExportException.httpFailedExceptionally(th));
    }

    public CompletableResultCode shutdown() {
        if (!this.isShutdown.compareAndSet(false, true)) {
            this.logger.log(Level.INFO, "Calling shutdown() multiple times.");
            return CompletableResultCode.ofSuccess();
        }
        return this.httpSender.shutdown();
    }

    private static String extractErrorStatus(String str, @Nullable byte[] bArr) {
        if (bArr == null) {
            return "Response body missing, HTTP status message: " + str;
        }
        try {
            return GrpcExporterUtil.getStatusMessage(bArr);
        } catch (IOException unused) {
            return "Unable to parse response body, HTTP status message: " + str;
        }
    }
}
