package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdj;
import com.squareup.protos.payrollconnector.common.PayrollProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedPayrollProvider extends zzdj {
    public final PayrollProvider value;

    public SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedPayrollProvider(PayrollProvider payrollProvider) {
        payrollProvider.getClass();
        this.value = payrollProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedPayrollProvider) && Intrinsics.areEqual(this.value, ((SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedPayrollProvider) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectedPayrollProvider(value=" + this.value + ")";
    }
}
