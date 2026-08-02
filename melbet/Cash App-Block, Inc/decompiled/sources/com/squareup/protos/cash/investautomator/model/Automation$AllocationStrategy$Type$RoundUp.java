package com.squareup.protos.cash.investautomator.model;

import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.squareup.protos.cash.investautomator.model.Automation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Automation$AllocationStrategy$Type$RoundUp extends ImageHeaderParserUtils {
    public final Automation.AllocationStrategy.RoundUp value;

    public Automation$AllocationStrategy$Type$RoundUp(Automation.AllocationStrategy.RoundUp roundUp) {
        roundUp.getClass();
        this.value = roundUp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Automation$AllocationStrategy$Type$RoundUp) && Intrinsics.areEqual(this.value, ((Automation$AllocationStrategy$Type$RoundUp) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RoundUp(value=" + this.value + ")";
    }
}
