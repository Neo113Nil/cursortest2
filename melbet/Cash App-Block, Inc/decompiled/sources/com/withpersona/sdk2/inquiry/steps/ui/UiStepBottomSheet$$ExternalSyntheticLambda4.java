package com.withpersona.sdk2.inquiry.steps.ui;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiStepBottomSheet$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BottomSheetBehavior f$0;

    public /* synthetic */ UiStepBottomSheet$$ExternalSyntheticLambda4(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetBehavior;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        BottomSheetBehavior bottomSheetBehavior = this.f$0;
        switch (i) {
            case 0:
                bottomSheetBehavior.setState(5);
                break;
            default:
                bottomSheetBehavior.setState(3);
                break;
        }
        return Unit.INSTANCE;
    }
}
