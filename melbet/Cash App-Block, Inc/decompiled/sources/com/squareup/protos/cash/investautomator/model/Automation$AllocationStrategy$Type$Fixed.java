package com.squareup.protos.cash.investautomator.model;

import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.squareup.protos.cash.investautomator.model.Automation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Automation$AllocationStrategy$Type$Fixed extends ImageHeaderParserUtils {
    public final Automation.AllocationStrategy.Fixed value;

    public Automation$AllocationStrategy$Type$Fixed(Automation.AllocationStrategy.Fixed fixed) {
        fixed.getClass();
        this.value = fixed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Automation$AllocationStrategy$Type$Fixed) && Intrinsics.areEqual(this.value, ((Automation$AllocationStrategy$Type$Fixed) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Fixed(value=" + this.value + ")";
    }
}
