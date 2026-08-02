package com.squareup.protos.payrollconnector.common;

import com.squareup.cash.clientroutes.DeepLinkSpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PayrollProvider$Type$Platform extends DeepLinkSpec.Companion {
    public final Platform value;

    public PayrollProvider$Type$Platform(Platform platform) {
        platform.getClass();
        this.value = platform;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PayrollProvider$Type$Platform) && Intrinsics.areEqual(this.value, ((PayrollProvider$Type$Platform) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Platform(value=" + this.value + ")";
    }
}
