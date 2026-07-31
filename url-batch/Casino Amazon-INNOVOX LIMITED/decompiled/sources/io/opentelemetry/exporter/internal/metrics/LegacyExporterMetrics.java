package io.opentelemetry.exporter.internal.metrics;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.exporter.internal.metrics.ExporterMetrics;
import io.opentelemetry.exporter.otlp.internal.OtlpConfigUtil;
import io.opentelemetry.sdk.internal.Signal;
import io.opentelemetry.sdk.internal.StandardComponentId;
import java.util.function.Supplier;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public class LegacyExporterMetrics implements ExporterMetrics {

    @Nullable
    private volatile LongCounter exported;
    private final String exporterName;
    private final Attributes failedAttrs;
    private final Supplier<MeterProvider> meterProviderSupplier;

    @Nullable
    private volatile LongCounter seen;
    private final Attributes seenAttrs;
    private final Attributes successAttrs;
    private final String transportName;
    private static final AttributeKey<String> ATTRIBUTE_KEY_TYPE = AttributeKey.stringKey(WebViewManager.EVENT_TYPE_KEY);
    private static final AttributeKey<Boolean> ATTRIBUTE_KEY_SUCCESS = AttributeKey.booleanKey("success");

    LegacyExporterMetrics(Supplier<MeterProvider> supplier, StandardComponentId.ExporterType exporterType) {
        this.meterProviderSupplier = supplier;
        this.exporterName = getExporterName(exporterType);
        this.transportName = getTransportName(exporterType);
        Attributes build = Attributes.builder().put((AttributeKey<AttributeKey<String>>) ATTRIBUTE_KEY_TYPE, (AttributeKey<String>) getTypeString(exporterType.signal())).build();
        this.seenAttrs = build;
        AttributesBuilder builder = build.toBuilder();
        AttributeKey<Boolean> attributeKey = ATTRIBUTE_KEY_SUCCESS;
        this.successAttrs = builder.put((AttributeKey<AttributeKey<Boolean>>) attributeKey, (AttributeKey<Boolean>) true).build();
        this.failedAttrs = build.toBuilder().put((AttributeKey<AttributeKey<Boolean>>) attributeKey, (AttributeKey<Boolean>) false).build();
    }

    public static boolean isSupportedType(StandardComponentId.ExporterType exporterType) {
        switch (AnonymousClass1.$SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[exporterType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: io.opentelemetry.exporter.internal.metrics.LegacyExporterMetrics$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$sdk$internal$Signal;
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType;

        static {
            int[] iArr = new int[Signal.values().length];
            $SwitchMap$io$opentelemetry$sdk$internal$Signal = iArr;
            try {
                iArr[Signal.SPAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$Signal[Signal.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$Signal[Signal.METRIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$Signal[Signal.PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[StandardComponentId.ExporterType.values().length];
            $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType = iArr2;
            try {
                iArr2[StandardComponentId.ExporterType.OTLP_GRPC_SPAN_EXPORTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.OTLP_HTTP_SPAN_EXPORTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.OTLP_HTTP_JSON_SPAN_EXPORTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.ZIPKIN_HTTP_SPAN_EXPORTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.ZIPKIN_HTTP_JSON_SPAN_EXPORTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.OTLP_GRPC_LOG_EXPORTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.OTLP_HTTP_LOG_EXPORTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.OTLP_HTTP_JSON_LOG_EXPORTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.OTLP_GRPC_METRIC_EXPORTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.OTLP_HTTP_METRIC_EXPORTER.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.OTLP_HTTP_JSON_METRIC_EXPORTER.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.OTLP_GRPC_PROFILES_EXPORTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    private static String getTypeString(Signal signal) {
        int i = AnonymousClass1.$SwitchMap$io$opentelemetry$sdk$internal$Signal[signal.ordinal()];
        if (i == 1) {
            return "span";
        }
        if (i == 2) {
            return "log";
        }
        if (i == 3) {
            return "metric";
        }
        if (i == 4) {
            throw new IllegalArgumentException("Profiles are not supported");
        }
        throw new IllegalArgumentException("Unhandled signal type: " + signal);
    }

    private static String getExporterName(StandardComponentId.ExporterType exporterType) {
        switch (AnonymousClass1.$SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[exporterType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return "otlp";
            case 4:
            case 5:
                return "zipkin";
            case 12:
                throw new IllegalArgumentException("Profiles are not supported");
            default:
                throw new IllegalArgumentException("Not a supported exporter type: " + exporterType);
        }
    }

    private static String getTransportName(StandardComponentId.ExporterType exporterType) {
        switch (AnonymousClass1.$SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[exporterType.ordinal()]) {
            case 1:
            case 6:
            case 9:
                return OtlpConfigUtil.PROTOCOL_GRPC;
            case 2:
            case 4:
            case 7:
            case 10:
                return "http";
            case 3:
            case 5:
            case 8:
            case 11:
                return "http-json";
            case 12:
                throw new IllegalArgumentException("Profiles are not supported");
            default:
                throw new IllegalArgumentException("Not a supported exporter type: " + exporterType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSeen(long j) {
        seen().add(j, this.seenAttrs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuccess(long j) {
        exported().add(j, this.successAttrs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFailed(long j) {
        exported().add(j, this.failedAttrs);
    }

    private LongCounter seen() {
        LongCounter longCounter = this.seen;
        if (longCounter != null && !SemConvExporterMetrics.isNoop(longCounter)) {
            return longCounter;
        }
        LongCounter build = meter().counterBuilder(this.exporterName + ".exporter.seen").build();
        this.seen = build;
        return build;
    }

    private LongCounter exported() {
        LongCounter longCounter = this.exported;
        if (longCounter != null && !SemConvExporterMetrics.isNoop(longCounter)) {
            return longCounter;
        }
        LongCounter build = meter().counterBuilder(this.exporterName + ".exporter.exported").build();
        this.exported = build;
        return build;
    }

    private Meter meter() {
        MeterProvider meterProvider = this.meterProviderSupplier.get();
        if (meterProvider == null) {
            meterProvider = MeterProvider.noop();
        }
        return meterProvider.get("io.opentelemetry.exporters." + this.exporterName + TokenBuilder.TOKEN_DELIMITER + this.transportName);
    }

    @Override // io.opentelemetry.exporter.internal.metrics.ExporterMetrics
    public ExporterMetrics.Recording startRecordingExport(int i) {
        return new Recording(this, i, null);
    }

    private class Recording extends ExporterMetrics.Recording {
        private final int itemCount;

        /* synthetic */ Recording(LegacyExporterMetrics legacyExporterMetrics, int i, AnonymousClass1 anonymousClass1) {
            this(i);
        }

        private Recording(int i) {
            this.itemCount = i;
            LegacyExporterMetrics.this.addSeen(i);
        }

        @Override // io.opentelemetry.exporter.internal.metrics.ExporterMetrics.Recording
        protected void doFinish(@Nullable String str, Attributes attributes) {
            if (str != null) {
                LegacyExporterMetrics.this.addFailed(this.itemCount);
            } else {
                LegacyExporterMetrics.this.addSuccess(this.itemCount);
            }
        }
    }
}
