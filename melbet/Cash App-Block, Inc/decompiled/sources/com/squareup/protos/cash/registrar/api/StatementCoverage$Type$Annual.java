package com.squareup.protos.cash.registrar.api;

import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StatementCoverage$Type$Annual extends zzko {
    public final StatementCoverage.Annual value;

    public StatementCoverage$Type$Annual(StatementCoverage.Annual annual) {
        annual.getClass();
        this.value = annual;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StatementCoverage$Type$Annual) && Intrinsics.areEqual(this.value, ((StatementCoverage$Type$Annual) obj).value);
    }

    public final StatementCoverage.Annual getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Annual(value=" + this.value + ")";
    }
}
