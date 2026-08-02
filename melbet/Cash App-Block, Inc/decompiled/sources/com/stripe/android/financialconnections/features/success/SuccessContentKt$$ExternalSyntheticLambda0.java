package com.stripe.android.financialconnections.features.success;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class SuccessContentKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableFloatState f$0;

    public /* synthetic */ SuccessContentKt$$ExternalSyntheticLambda0(MutableFloatState mutableFloatState, int i) {
        this.$r8$classId = i;
        this.f$0 = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float floatValue;
        int i = this.$r8$classId;
        MutableFloatState mutableFloatState = this.f$0;
        switch (i) {
            case 0:
                floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                break;
            default:
                floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                break;
        }
        return Float.valueOf(floatValue);
    }
}
