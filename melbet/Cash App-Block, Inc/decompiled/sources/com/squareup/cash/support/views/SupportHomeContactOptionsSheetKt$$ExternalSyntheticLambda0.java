package com.squareup.cash.support.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.support.viewmodels.SupportHomeContactOptionsSheetViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SupportHomeContactOptionsSheetKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ SupportHomeContactOptionsSheetViewModel f$1;

    public /* synthetic */ SupportHomeContactOptionsSheetKt$$ExternalSyntheticLambda0(Function1 function1, SupportHomeContactOptionsSheetViewModel supportHomeContactOptionsSheetViewModel) {
        this.$r8$classId = 0;
        this.f$0 = function1;
        this.f$1 = supportHomeContactOptionsSheetViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        SupportHomeContactOptionsSheetViewModel supportHomeContactOptionsSheetViewModel = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(24, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-962058844, new TabToolbarsKt$$ExternalSyntheticLambda3(15, supportHomeContactOptionsSheetViewModel, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.SheetContent(supportHomeContactOptionsSheetViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.OptionCells(supportHomeContactOptionsSheetViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SupportHomeContactOptionsSheetKt$$ExternalSyntheticLambda0(SupportHomeContactOptionsSheetViewModel supportHomeContactOptionsSheetViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = supportHomeContactOptionsSheetViewModel;
        this.f$0 = function1;
    }
}
