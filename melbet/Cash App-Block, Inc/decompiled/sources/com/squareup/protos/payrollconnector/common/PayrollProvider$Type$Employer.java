package com.squareup.protos.payrollconnector.common;

import com.squareup.cash.clientroutes.DeepLinkSpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PayrollProvider$Type$Employer extends DeepLinkSpec.Companion {
    public final Employer value;

    public PayrollProvider$Type$Employer(Employer employer) {
        employer.getClass();
        this.value = employer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PayrollProvider$Type$Employer) && Intrinsics.areEqual(this.value, ((PayrollProvider$Type$Employer) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Employer(value=" + this.value + ")";
    }
}
