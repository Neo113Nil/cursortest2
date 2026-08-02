package com.squareup.cash.tax.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.tax.viewmodels.TaxTooltipViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.SecureScreen;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class TaxTooltipView extends ComposeUiView implements OutsideTapCloses, SecureScreen {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxTooltipView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(TaxTooltipViewModel taxTooltipViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(118875551);
        int i2 = (gapComposer.changedInstance(taxTooltipViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (taxTooltipViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1694096358, new TaxTooltipView$$ExternalSyntheticLambda0(0, taxTooltipViewModel, function1), gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(this, taxTooltipViewModel, function1, i, 5);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((TaxTooltipViewModel) obj, function1, gapComposer, 0);
    }
}
