package com.squareup.protos.cash.aegis.sync_values;

import app.cash.local.primitives.BrandCollectionDataKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class FamilyAccount$Type$Sponsor extends BrandCollectionDataKt {
    public final Sponsor value;

    public FamilyAccount$Type$Sponsor(Sponsor sponsor) {
        sponsor.getClass();
        this.value = sponsor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FamilyAccount$Type$Sponsor) && Intrinsics.areEqual(this.value, ((FamilyAccount$Type$Sponsor) obj).value);
    }

    public final Sponsor getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Sponsor(value=" + this.value + ")";
    }
}
