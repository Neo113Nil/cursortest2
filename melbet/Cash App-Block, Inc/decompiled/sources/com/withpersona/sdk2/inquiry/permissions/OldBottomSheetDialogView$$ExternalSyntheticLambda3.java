package com.withpersona.sdk2.inquiry.permissions;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class OldBottomSheetDialogView$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ OldBottomSheetDialogView f$0;

    public /* synthetic */ OldBottomSheetDialogView$$ExternalSyntheticLambda3(OldBottomSheetDialogView oldBottomSheetDialogView, int i) {
        this.$r8$classId = i;
        this.f$0 = oldBottomSheetDialogView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        OldBottomSheetDialogView oldBottomSheetDialogView = this.f$0;
        switch (i) {
            case 0:
                oldBottomSheetDialogView.onNegativeButtonClick.invoke();
                break;
            default:
                oldBottomSheetDialogView.onNegativeButtonClick.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
