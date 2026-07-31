package com.yandex.div.core;

import V1.a;
import android.support.v4.media.session.b;
import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.dagger.ExternalOptional;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.HistogramBridge;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.storage.DivStorageComponent;
import i1.AbstractC2470a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivKitConfiguration {

    @NotNull
    private final a divRequestExecutor;

    @Nullable
    private final a divStorageComponent;

    @NotNull
    private final ExecutorService executorService;

    @NotNull
    private final a histogramConfiguration;

    @Nullable
    private final a sendBeaconConfiguration;

    @Metadata
    public static final class Builder {

        @Nullable
        private a divStorageComponent;

        @Nullable
        private ExecutorService executorService;

        @Nullable
        private a sendBeaconConfiguration;

        @NotNull
        private a histogramConfiguration = new a() { // from class: m1.c
            @Override // V1.a
            public final Object get() {
                HistogramConfiguration histogramConfiguration;
                histogramConfiguration = HistogramConfiguration.DEFAULT;
                return histogramConfiguration;
            }
        };

        @NotNull
        private a divRequestExecutor = new a() { // from class: m1.d
            @Override // V1.a
            public final Object get() {
                DivRequestExecutor divRequestExecutor;
                divRequestExecutor = DivRequestExecutor.STUB;
                return divRequestExecutor;
            }
        };

        @NotNull
        public final DivKitConfiguration build() {
            a aVar = this.sendBeaconConfiguration;
            ExecutorService executorService = this.executorService;
            if (executorService == null) {
                executorService = Executors.newSingleThreadExecutor();
            }
            Intrinsics.checkNotNullExpressionValue(executorService, "executorService ?: Execu…newSingleThreadExecutor()");
            return new DivKitConfiguration(aVar, executorService, this.histogramConfiguration, this.divStorageComponent, this.divRequestExecutor, null);
        }
    }

    public /* synthetic */ DivKitConfiguration(a aVar, ExecutorService executorService, a aVar2, a aVar3, a aVar4, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, executorService, aVar2, aVar3, aVar4);
    }

    @NotNull
    public final CpuUsageHistogramReporter cpuUsageHistogramReporter() {
        Object obj = ((HistogramConfiguration) this.histogramConfiguration.get()).getCpuUsageHistogramReporter().get();
        Intrinsics.checkNotNullExpressionValue(obj, "histogramConfiguration.g…geHistogramReporter.get()");
        return (CpuUsageHistogramReporter) obj;
    }

    @NotNull
    public final DivRequestExecutor divRequestExecutor() {
        Object obj = this.divRequestExecutor.get();
        Intrinsics.checkNotNullExpressionValue(obj, "divRequestExecutor.get()");
        return (DivRequestExecutor) obj;
    }

    @NotNull
    public final ExecutorService executorService() {
        return this.executorService;
    }

    @NotNull
    public final ExternalOptional<DivStorageComponent> externalDivStorageComponent() {
        ExternalOptional.Companion companion = ExternalOptional.Companion;
        a aVar = this.divStorageComponent;
        return companion.ofNullable(aVar != null ? (DivStorageComponent) aVar.get() : null);
    }

    @NotNull
    public final HistogramConfiguration histogramConfiguration() {
        Object obj = this.histogramConfiguration.get();
        Intrinsics.checkNotNullExpressionValue(obj, "histogramConfiguration.get()");
        return (HistogramConfiguration) obj;
    }

    @NotNull
    public final HistogramRecordConfiguration histogramRecordConfiguration() {
        Object obj = this.histogramConfiguration.get();
        Intrinsics.checkNotNullExpressionValue(obj, "histogramConfiguration.get()");
        return (HistogramRecordConfiguration) obj;
    }

    @NotNull
    public final HistogramRecorder histogramRecorder() {
        return new HistogramRecorder((HistogramBridge) ((HistogramConfiguration) this.histogramConfiguration.get()).getHistogramBridge().get());
    }

    @Nullable
    public final AbstractC2470a sendBeaconConfiguration() {
        a aVar = this.sendBeaconConfiguration;
        if (aVar != null) {
            b.a(aVar.get());
        }
        return null;
    }

    private DivKitConfiguration(a aVar, ExecutorService executorService, a aVar2, a aVar3, a aVar4) {
        this.sendBeaconConfiguration = aVar;
        this.executorService = executorService;
        this.histogramConfiguration = aVar2;
        this.divStorageComponent = aVar3;
        this.divRequestExecutor = aVar4;
    }
}
