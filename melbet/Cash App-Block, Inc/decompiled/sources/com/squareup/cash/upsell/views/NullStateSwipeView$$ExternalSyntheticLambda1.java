package com.squareup.cash.upsell.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.savedstate.SavedStateReaderKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class NullStateSwipeView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NullStateViewModel$SwipeViewModel$Content f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ NullStateSwipeView$$ExternalSyntheticLambda1(NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content, Function1 function1, int i) {
        this.$r8$classId = 2;
        this.f$0 = nullStateViewModel$SwipeViewModel$Content;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        byte b = 0;
        Function1 function1 = this.f$1;
        NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content = this.f$0;
        int i2 = 1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-863770266, new NullStateSwipeView$$ExternalSyntheticLambda1(nullStateViewModel$SwipeViewModel$Content, function1, i2, b), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    SavedStateReaderKt.NullStateSwipeContent(nullStateViewModel$SwipeViewModel$Content, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                SavedStateReaderKt.NullStateSwipeContent(nullStateViewModel$SwipeViewModel$Content, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ NullStateSwipeView$$ExternalSyntheticLambda1(NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = nullStateViewModel$SwipeViewModel$Content;
        this.f$1 = function1;
    }
}
