package com.withpersona.sdk2.inquiry.steps.ui;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiStepBottomSheet$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BottomSheetBehavior f$0;

    public /* synthetic */ UiStepBottomSheet$$ExternalSyntheticLambda1(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetBehavior;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        BottomSheetBehavior bottomSheetBehavior = this.f$0;
        switch (i) {
            case 0:
                bottomSheetBehavior.setState(3);
                break;
            case 1:
                bottomSheetBehavior.setState(3);
                bottomSheetBehavior.updateImportantForAccessibilityOnSiblings = true;
                break;
            case 2:
                bottomSheetBehavior.setState(3);
                break;
            case 3:
                bottomSheetBehavior.setState(3);
                break;
            case 4:
                bottomSheetBehavior.setState(3);
                break;
            default:
                bottomSheetBehavior.setState(5);
                break;
        }
    }
}
