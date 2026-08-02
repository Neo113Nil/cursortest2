package com.squareup.protos.cash.discover.api.app.v1.model;

import array.SortOrder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DetailsPage$PrimaryContent$HeroImage extends SortOrder {
    public final HeroImage value;

    public DetailsPage$PrimaryContent$HeroImage(HeroImage heroImage) {
        heroImage.getClass();
        this.value = heroImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailsPage$PrimaryContent$HeroImage) && Intrinsics.areEqual(this.value, ((DetailsPage$PrimaryContent$HeroImage) obj).value);
    }

    public final HeroImage getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HeroImage(value=" + this.value + ")";
    }
}
