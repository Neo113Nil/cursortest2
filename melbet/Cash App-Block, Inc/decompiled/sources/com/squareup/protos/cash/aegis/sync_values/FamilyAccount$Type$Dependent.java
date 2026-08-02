package com.squareup.protos.cash.aegis.sync_values;

import app.cash.local.primitives.BrandCollectionDataKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class FamilyAccount$Type$Dependent extends BrandCollectionDataKt {
    public final Dependent value;

    public FamilyAccount$Type$Dependent(Dependent dependent) {
        dependent.getClass();
        this.value = dependent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FamilyAccount$Type$Dependent) && Intrinsics.areEqual(this.value, ((FamilyAccount$Type$Dependent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Dependent(value=" + this.value + ")";
    }
}
