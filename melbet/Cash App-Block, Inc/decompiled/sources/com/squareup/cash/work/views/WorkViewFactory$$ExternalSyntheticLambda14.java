package com.squareup.cash.work.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.work.viewmodels.MerchantPickerViewModel;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class WorkViewFactory$$ExternalSyntheticLambda14 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MerchantPickerViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ WorkViewFactory$$ExternalSyntheticLambda14(MerchantPickerViewModel merchantPickerViewModel, Function1 function1) {
        this.f$0 = merchantPickerViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        MerchantPickerViewModel merchantPickerViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    MerchantPickerBottomSheetViewKt.MerchantPickerBottomSheet(merchantPickerViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new PayHomeViewKt$$ExternalSyntheticLambda2(4, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1858377345, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(8, (Object) merchantPickerViewModel, function1), gapComposer2), gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ WorkViewFactory$$ExternalSyntheticLambda14(Function1 function1, MerchantPickerViewModel merchantPickerViewModel) {
        this.f$1 = function1;
        this.f$0 = merchantPickerViewModel;
    }
}
