package com.squareup.cash.support.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.support.viewmodels.SupportTransactionConfirmationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SupportTransactionConfirmationView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SupportTransactionConfirmationViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SupportTransactionConfirmationView$$ExternalSyntheticLambda0(SupportTransactionConfirmationViewModel supportTransactionConfirmationViewModel, Function1 function1) {
        this.f$0 = supportTransactionConfirmationViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        SupportTransactionConfirmationViewModel supportTransactionConfirmationViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = SupportTransactionConfirmationView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new SheetKt$$ExternalSyntheticLambda9(29);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(327307437, new SupportTransactionConfirmationView$$ExternalSyntheticLambda3(supportTransactionConfirmationViewModel, function1), gapComposer), gapComposer, 100663302, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.SheetContent(supportTransactionConfirmationViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SupportTransactionConfirmationView$$ExternalSyntheticLambda0(SupportTransactionConfirmationViewModel supportTransactionConfirmationViewModel, Function1 function1, int i) {
        this.f$0 = supportTransactionConfirmationViewModel;
        this.f$1 = function1;
    }
}
