package com.squareup.cash.support.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.navigation.Navigation;
import com.squareup.cash.sheet.ComposeBottomSheetKt;
import com.squareup.cash.support.viewmodels.SupportArticleIncidentsSheetViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.ArcadeBottomSheetStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SupportArticleIncidentsSheetView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SupportArticleIncidentsSheetViewModel f$0;
    public final /* synthetic */ SupportArticleIncidentsSheetView f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ SupportArticleIncidentsSheetView$$ExternalSyntheticLambda0(SupportArticleIncidentsSheetViewModel supportArticleIncidentsSheetViewModel, SupportArticleIncidentsSheetView supportArticleIncidentsSheetView, Function1 function1) {
        this.f$0 = supportArticleIncidentsSheetViewModel;
        this.f$1 = supportArticleIncidentsSheetView;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        SupportArticleIncidentsSheetView supportArticleIncidentsSheetView = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = SupportArticleIncidentsSheetView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    ArcadeBottomSheetStyle ArcadeBottomSheetStyle = Navigation.ArcadeBottomSheetStyle(supportArticleIncidentsSheetView);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(16, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SupportArticleIncidentsSheetViewModel supportArticleIncidentsSheetViewModel = this.f$0;
                    ComposeBottomSheetKt.BottomSheet(null, supportArticleIncidentsSheetViewModel, (Function0) rememberedValue, false, false, 0, null, ArcadeBottomSheetStyle, Expect_jvmKt.rememberComposableLambda(2074536141, new TabToolbarsKt$$ExternalSyntheticLambda3(13, supportArticleIncidentsSheetViewModel, function1), gapComposer), gapComposer, 117440512, 121);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int i3 = SupportArticleIncidentsSheetView.$r8$clinit;
                supportArticleIncidentsSheetView.Content(this.f$0, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SupportArticleIncidentsSheetView$$ExternalSyntheticLambda0(SupportArticleIncidentsSheetView supportArticleIncidentsSheetView, SupportArticleIncidentsSheetViewModel supportArticleIncidentsSheetViewModel, Function1 function1, int i) {
        this.f$1 = supportArticleIncidentsSheetView;
        this.f$0 = supportArticleIncidentsSheetViewModel;
        this.f$2 = function1;
    }
}
