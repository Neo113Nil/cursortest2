package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.metrics.ObservableDoubleMeasurement;
import io.opentelemetry.api.metrics.ObservableLongMeasurement;
import io.opentelemetry.sdk.metrics.internal.descriptor.Advice;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.state.CallbackRegistration;
import io.opentelemetry.sdk.metrics.internal.state.SdkObservableMeasurement;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class InstrumentBuilder {
    private final String name;
    private final SdkMeter sdkMeter;
    private InstrumentType type;
    private final InstrumentValueType valueType;
    private Advice.AdviceBuilder adviceBuilder = Advice.builder();
    private String description = "";
    private String unit = "";

    @FunctionalInterface
    interface SwapBuilder<T> {
        T newBuilder(SdkMeter sdkMeter, String str, String str2, String str3, Advice.AdviceBuilder adviceBuilder);
    }

    @FunctionalInterface
    interface SynchronousInstrumentConstructor<I extends AbstractInstrument> {
        I createInstrument(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage);
    }

    InstrumentBuilder(String str, InstrumentType instrumentType, InstrumentValueType instrumentValueType, SdkMeter sdkMeter) {
        this.name = str;
        this.type = instrumentType;
        this.valueType = instrumentValueType;
        this.sdkMeter = sdkMeter;
    }

    InstrumentBuilder setUnit(String str) {
        this.unit = str;
        return this;
    }

    InstrumentBuilder setAdviceBuilder(Advice.AdviceBuilder adviceBuilder) {
        this.adviceBuilder = adviceBuilder;
        return this;
    }

    InstrumentBuilder setDescription(String str) {
        this.description = str;
        return this;
    }

    <T> T swapBuilder(SwapBuilder<T> swapBuilder) {
        return swapBuilder.newBuilder(this.sdkMeter, this.name, this.description, this.unit, this.adviceBuilder);
    }

    <I extends AbstractInstrument> I buildSynchronousInstrument(SynchronousInstrumentConstructor<I> synchronousInstrumentConstructor) {
        InstrumentDescriptor newDescriptor = newDescriptor();
        return synchronousInstrumentConstructor.createInstrument(newDescriptor, this.sdkMeter, this.sdkMeter.registerSynchronousMetricStorage(newDescriptor));
    }

    SdkObservableInstrument buildDoubleAsynchronousInstrument(InstrumentType instrumentType, final Consumer<ObservableDoubleMeasurement> consumer) {
        final SdkObservableMeasurement buildObservableMeasurement = buildObservableMeasurement(instrumentType);
        CallbackRegistration create = CallbackRegistration.create(Collections.singletonList(buildObservableMeasurement), new Runnable() { // from class: io.opentelemetry.sdk.metrics.InstrumentBuilder$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                consumer.accept(buildObservableMeasurement);
            }
        });
        this.sdkMeter.registerCallback(create);
        return new SdkObservableInstrument(this.sdkMeter, create);
    }

    SdkObservableInstrument buildLongAsynchronousInstrument(InstrumentType instrumentType, final Consumer<ObservableLongMeasurement> consumer) {
        final SdkObservableMeasurement buildObservableMeasurement = buildObservableMeasurement(instrumentType);
        CallbackRegistration create = CallbackRegistration.create(Collections.singletonList(buildObservableMeasurement), new Runnable() { // from class: io.opentelemetry.sdk.metrics.InstrumentBuilder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                consumer.accept(buildObservableMeasurement);
            }
        });
        this.sdkMeter.registerCallback(create);
        return new SdkObservableInstrument(this.sdkMeter, create);
    }

    SdkObservableMeasurement buildObservableMeasurement(InstrumentType instrumentType) {
        this.type = instrumentType;
        return this.sdkMeter.registerObservableMeasurement(newDescriptor());
    }

    private InstrumentDescriptor newDescriptor() {
        return InstrumentDescriptor.create(this.name, this.description, this.unit, this.type, this.valueType, this.adviceBuilder.build());
    }

    public String toString() {
        return toStringHelper(getClass().getSimpleName());
    }

    String toStringHelper(String str) {
        return str + "{descriptor=" + newDescriptor() + "}";
    }

    void setAdviceAttributes(List<AttributeKey<?>> list) {
        this.adviceBuilder.setAttributes(list);
    }

    void setExplicitBucketBoundaries(List<Double> list) {
        this.adviceBuilder.setExplicitBucketBoundaries(list);
    }
}
