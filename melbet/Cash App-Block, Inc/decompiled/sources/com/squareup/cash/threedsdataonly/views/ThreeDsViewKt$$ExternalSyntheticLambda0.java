package com.squareup.cash.threedsdataonly.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.media3.ui.SubtitleViewUtils;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.threedsdataonly.viewmodels.ThreeDsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ThreeDsViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ ThreeDsViewModel f$1;

    public /* synthetic */ ThreeDsViewKt$$ExternalSyntheticLambda0(Function1 function1, ThreeDsViewModel threeDsViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = threeDsViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ThreeDsViewModel threeDsViewModel = this.f$1;
        Function1 function1 = this.f$0;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-706650250, new ThreeDsViewKt$$ExternalSyntheticLambda0(function1, threeDsViewModel, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda5(26, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer2, 0);
                    SubtitleViewUtils.ThreeDsProgress(threeDsViewModel, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
