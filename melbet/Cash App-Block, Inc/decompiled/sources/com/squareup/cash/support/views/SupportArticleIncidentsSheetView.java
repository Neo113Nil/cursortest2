package com.squareup.cash.support.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.support.viewmodels.SupportArticleIncidentsSheetViewModel;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class SupportArticleIncidentsSheetView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportArticleIncidentsSheetView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(SupportArticleIncidentsSheetViewModel supportArticleIncidentsSheetViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(165736814);
        int i2 = (gapComposer.changed(supportArticleIncidentsSheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (supportArticleIncidentsSheetViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2086653571, new SupportArticleIncidentsSheetView$$ExternalSyntheticLambda0(supportArticleIncidentsSheetViewModel, this, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SupportArticleIncidentsSheetView$$ExternalSyntheticLambda0(this, supportArticleIncidentsSheetViewModel, function1, i);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((SupportArticleIncidentsSheetViewModel) obj, function1, gapComposer, 0);
    }
}
