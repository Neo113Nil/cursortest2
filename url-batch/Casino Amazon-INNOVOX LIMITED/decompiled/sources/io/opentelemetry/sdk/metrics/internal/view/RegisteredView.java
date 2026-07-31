package io.opentelemetry.sdk.metrics.internal.view;

import io.opentelemetry.sdk.metrics.InstrumentSelector;
import io.opentelemetry.sdk.metrics.View;
import io.opentelemetry.sdk.metrics.internal.debug.SourceInfo;

/* loaded from: classes3.dex */
public abstract class RegisteredView {
    public abstract int getCardinalityLimit();

    public abstract InstrumentSelector getInstrumentSelector();

    public abstract View getView();

    public abstract AttributesProcessor getViewAttributesProcessor();

    public abstract SourceInfo getViewSourceInfo();

    public static RegisteredView create(InstrumentSelector instrumentSelector, View view, AttributesProcessor attributesProcessor, int i, SourceInfo sourceInfo) {
        return new AutoValue_RegisteredView(instrumentSelector, view, attributesProcessor, i, sourceInfo);
    }

    RegisteredView() {
    }

    public final String toString() {
        return "RegisteredView{instrumentSelector=" + getInstrumentSelector() + ", view=" + getView() + "}";
    }
}
