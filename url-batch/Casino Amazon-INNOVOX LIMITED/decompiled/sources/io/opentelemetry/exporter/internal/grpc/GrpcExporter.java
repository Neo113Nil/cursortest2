package io.opentelemetry.exporter.internal.grpc;

import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.exporter.internal.FailedExportException;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.metrics.ExporterInstrumentation;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.InternalTelemetryVersion;
import io.opentelemetry.sdk.internal.StandardComponentId;
import io.opentelemetry.sdk.internal.ThrottlingLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class GrpcExporter<T extends Marshaler> {
    private static final Logger internalLogger = Logger.getLogger(GrpcExporter.class.getName());
    private final ExporterInstrumentation exporterMetrics;
    private final GrpcSender<T> grpcSender;
    private final String type;
    private final ThrottlingLogger logger = new ThrottlingLogger(internalLogger);
    private final AtomicBoolean loggedUnimplemented = new AtomicBoolean();
    private final AtomicBoolean isShutdown = new AtomicBoolean();

    public GrpcExporter(GrpcSender<T> grpcSender, InternalTelemetryVersion internalTelemetryVersion, StandardComponentId standardComponentId, Supplier<MeterProvider> supplier, String str) {
        this.type = standardComponentId.getStandardType().signal().logFriendlyName();
        this.grpcSender = grpcSender;
        this.exporterMetrics = new ExporterInstrumentation(internalTelemetryVersion, supplier, standardComponentId, str);
    }

    public CompletableResultCode export(T t, int i) {
        if (this.isShutdown.get()) {
            return CompletableResultCode.ofFailure();
        }
        final ExporterInstrumentation.Recording startRecordingExport = this.exporterMetrics.startRecordingExport(i);
        final CompletableResultCode completableResultCode = new CompletableResultCode();
        this.grpcSender.send(t, new Consumer() { // from class: io.opentelemetry.exporter.internal.grpc.GrpcExporter$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                GrpcExporter.this.m3919xc46b7dac(completableResultCode, startRecordingExport, (GrpcResponse) obj);
            }
        }, new Consumer() { // from class: io.opentelemetry.exporter.internal.grpc.GrpcExporter$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                GrpcExporter.this.m3920xde86fc4b(completableResultCode, startRecordingExport, (Throwable) obj);
            }
        });
        return completableResultCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onResponse, reason: merged with bridge method [inline-methods] */
    public void m3919xc46b7dac(CompletableResultCode completableResultCode, ExporterInstrumentation.Recording recording, GrpcResponse grpcResponse) {
        int grpcStatusValue = grpcResponse.grpcStatusValue();
        recording.setGrpcStatusCode(grpcStatusValue);
        if (grpcStatusValue == 0) {
            recording.finishSuccessful();
            completableResultCode.succeed();
            return;
        }
        recording.finishFailed(String.valueOf(grpcStatusValue));
        if (grpcStatusValue != 12) {
            if (grpcStatusValue == 14) {
                this.logger.log(Level.SEVERE, "Failed to export " + this.type + "s. Server is UNAVAILABLE. Make sure your collector is running and reachable from this network. Full error message:" + grpcResponse.grpcStatusDescription());
            } else {
                this.logger.log(Level.WARNING, "Failed to export " + this.type + "s. Server responded with gRPC status code " + grpcStatusValue + ". Error message: " + grpcResponse.grpcStatusDescription());
            }
        } else if (this.loggedUnimplemented.compareAndSet(false, true)) {
            GrpcExporterUtil.logUnimplemented(internalLogger, this.type, grpcResponse.grpcStatusDescription());
        }
        completableResultCode.failExceptionally(FailedExportException.grpcFailedWithResponse(grpcResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onError, reason: merged with bridge method [inline-methods] */
    public void m3920xde86fc4b(CompletableResultCode completableResultCode, ExporterInstrumentation.Recording recording, Throwable th) {
        recording.finishFailed(th);
        this.logger.log(Level.SEVERE, "Failed to export " + this.type + "s. The request could not be executed. Error message: " + th.getMessage(), th);
        if (this.logger.isLoggable(Level.FINEST)) {
            this.logger.log(Level.FINEST, "Failed to export " + this.type + "s. Details follow: " + th);
        }
        completableResultCode.failExceptionally(FailedExportException.grpcFailedExceptionally(th));
    }

    public CompletableResultCode shutdown() {
        if (!this.isShutdown.compareAndSet(false, true)) {
            this.logger.log(Level.INFO, "Calling shutdown() multiple times.");
            return CompletableResultCode.ofSuccess();
        }
        return this.grpcSender.shutdown();
    }
}
