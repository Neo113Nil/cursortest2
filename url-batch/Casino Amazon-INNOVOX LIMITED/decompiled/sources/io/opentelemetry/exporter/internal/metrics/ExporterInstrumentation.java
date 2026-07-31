package io.opentelemetry.exporter.internal.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.exporter.internal.metrics.ExporterMetrics;
import io.opentelemetry.sdk.common.InternalTelemetryVersion;
import io.opentelemetry.sdk.internal.SemConvAttributes;
import io.opentelemetry.sdk.internal.Signal;
import io.opentelemetry.sdk.internal.StandardComponentId;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.function.Supplier;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public class ExporterInstrumentation {
    private final ExporterMetrics implementation;

    public ExporterInstrumentation(InternalTelemetryVersion internalTelemetryVersion, Supplier<MeterProvider> supplier, StandardComponentId standardComponentId, String str) {
        ExporterMetrics exporterMetrics;
        ExporterMetrics semConvExporterMetrics;
        Signal signal = standardComponentId.getStandardType().signal();
        int i = AnonymousClass1.$SwitchMap$io$opentelemetry$sdk$common$InternalTelemetryVersion[internalTelemetryVersion.ordinal()];
        if (i == 1) {
            if (LegacyExporterMetrics.isSupportedType(standardComponentId.getStandardType())) {
                exporterMetrics = new LegacyExporterMetrics(supplier, standardComponentId.getStandardType());
            } else {
                exporterMetrics = NoopExporterMetrics.INSTANCE;
            }
            this.implementation = exporterMetrics;
            return;
        }
        if (i == 2) {
            if (signal == Signal.PROFILE) {
                semConvExporterMetrics = NoopExporterMetrics.INSTANCE;
            } else {
                semConvExporterMetrics = new SemConvExporterMetrics(supplier, signal, standardComponentId, extractServerAttributes(str));
            }
            this.implementation = semConvExporterMetrics;
            return;
        }
        throw new IllegalStateException("Unhandled case: " + internalTelemetryVersion);
    }

    /* renamed from: io.opentelemetry.exporter.internal.metrics.ExporterInstrumentation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$sdk$common$InternalTelemetryVersion;

        static {
            int[] iArr = new int[InternalTelemetryVersion.values().length];
            $SwitchMap$io$opentelemetry$sdk$common$InternalTelemetryVersion = iArr;
            try {
                iArr[InternalTelemetryVersion.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$common$InternalTelemetryVersion[InternalTelemetryVersion.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static Attributes extractServerAttributes(String str) {
        try {
            URI uri = new URI(str);
            AttributesBuilder builder = Attributes.builder();
            String host = uri.getHost();
            if (host != null) {
                builder.put((AttributeKey<AttributeKey<String>>) SemConvAttributes.SERVER_ADDRESS, (AttributeKey<String>) host);
            }
            int port = uri.getPort();
            if (port == -1) {
                String scheme = uri.getScheme();
                if ("https".equals(scheme)) {
                    port = 443;
                } else if ("http".equals(scheme)) {
                    port = 80;
                }
            }
            if (port != -1) {
                builder.put(SemConvAttributes.SERVER_PORT, port);
            }
            return builder.build();
        } catch (URISyntaxException unused) {
            return Attributes.empty();
        }
    }

    public Recording startRecordingExport(int i) {
        return new Recording(this.implementation.startRecordingExport(i), null);
    }

    public static class Recording {
        private final ExporterMetrics.Recording delegate;

        @Nullable
        private Long grpcStatusCode;

        @Nullable
        private Long httpStatusCode;

        /* synthetic */ Recording(ExporterMetrics.Recording recording, AnonymousClass1 anonymousClass1) {
            this(recording);
        }

        private Recording(ExporterMetrics.Recording recording) {
            this.delegate = recording;
        }

        public void setHttpStatusCode(long j) {
            if (this.grpcStatusCode != null) {
                throw new IllegalStateException("gRPC status code already set, can only set either gRPC or HTTP");
            }
            this.httpStatusCode = Long.valueOf(j);
        }

        public void setGrpcStatusCode(long j) {
            if (this.httpStatusCode != null) {
                throw new IllegalStateException("HTTP status code already set, can only set either gRPC or HTTP");
            }
            this.grpcStatusCode = Long.valueOf(j);
        }

        public void finishSuccessful() {
            this.delegate.finishSuccessful(buildRequestAttributes());
        }

        public void finishFailed(Throwable th) {
            finishFailed(th.getClass().getName());
        }

        public void finishFailed(String str) {
            this.delegate.finishFailed(str, buildRequestAttributes());
        }

        private Attributes buildRequestAttributes() {
            if (this.httpStatusCode != null) {
                return Attributes.of(SemConvAttributes.HTTP_RESPONSE_STATUS_CODE, this.httpStatusCode);
            }
            if (this.grpcStatusCode != null) {
                return Attributes.of(SemConvAttributes.RPC_GRPC_STATUS_CODE, this.grpcStatusCode);
            }
            return Attributes.empty();
        }
    }
}
