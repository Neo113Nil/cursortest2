package com.stripe.android.uicore.elements.bottomsheet;

import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final /* synthetic */ class StripeBottomSheetState$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StripeBottomSheetState f$0;

    public /* synthetic */ StripeBottomSheetState$$ExternalSyntheticLambda0(StripeBottomSheetState stripeBottomSheetState, int i) {
        this.$r8$classId = i;
        this.f$0 = stripeBottomSheetState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean isVisible;
        int i = this.$r8$classId;
        StripeBottomSheetState stripeBottomSheetState = this.f$0;
        switch (i) {
            case 0:
                isVisible = stripeBottomSheetState.modalBottomSheetState.isVisible();
                break;
            default:
                isVisible = stripeBottomSheetState.modalBottomSheetState.isVisible();
                break;
        }
        return Boolean.valueOf(isVisible);
    }
}
