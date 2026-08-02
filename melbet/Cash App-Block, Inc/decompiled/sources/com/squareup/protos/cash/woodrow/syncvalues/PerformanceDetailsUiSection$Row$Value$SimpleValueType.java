package com.squareup.protos.cash.woodrow.syncvalues;

import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiSection;

/* loaded from: classes8.dex */
public final class PerformanceDetailsUiSection$Row$Value$SimpleValueType extends zzlu {
    public final PerformanceDetailsUiSection.Row.ValueType value;

    public PerformanceDetailsUiSection$Row$Value$SimpleValueType(PerformanceDetailsUiSection.Row.ValueType valueType) {
        valueType.getClass();
        this.value = valueType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PerformanceDetailsUiSection$Row$Value$SimpleValueType) && this.value == ((PerformanceDetailsUiSection$Row$Value$SimpleValueType) obj).value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SimpleValueType(value=" + this.value + ")";
    }
}
