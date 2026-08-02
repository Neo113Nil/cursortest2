package com.squareup.protos.cash.registrar.api;

import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StatementCoverage$Type$Monthly extends zzko {
    public final StatementCoverage.Monthly value;

    public StatementCoverage$Type$Monthly(StatementCoverage.Monthly monthly) {
        monthly.getClass();
        this.value = monthly;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StatementCoverage$Type$Monthly) && Intrinsics.areEqual(this.value, ((StatementCoverage$Type$Monthly) obj).value);
    }

    public final StatementCoverage.Monthly getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Monthly(value=" + this.value + ")";
    }
}
