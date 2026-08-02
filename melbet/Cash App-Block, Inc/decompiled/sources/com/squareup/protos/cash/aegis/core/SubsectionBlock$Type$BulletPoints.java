package com.squareup.protos.cash.aegis.core;

import app.cash.local.primitives.BrandCardDetailsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubsectionBlock$Type$BulletPoints extends BrandCardDetailsKt {
    public final BulletPoints value;

    public SubsectionBlock$Type$BulletPoints(BulletPoints bulletPoints) {
        bulletPoints.getClass();
        this.value = bulletPoints;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubsectionBlock$Type$BulletPoints) && Intrinsics.areEqual(this.value, ((SubsectionBlock$Type$BulletPoints) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BulletPoints(value=" + this.value + ")";
    }
}
