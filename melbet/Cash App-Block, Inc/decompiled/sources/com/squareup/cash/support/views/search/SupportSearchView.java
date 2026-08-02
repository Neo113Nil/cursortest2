package com.squareup.cash.support.views.search;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda4;
import com.squareup.cash.support.viewmodels.SupportSearchViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.tax.views.TaxTooltipView$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class SupportSearchView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportSearchView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(SupportSearchViewModel supportSearchViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-146878024);
        int i2 = (gapComposer.changedInstance(supportSearchViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (supportSearchViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1708460403, new TaxTooltipView$$ExternalSyntheticLambda0(22, supportSearchViewModel, function1), gapComposer), gapComposer, 3072, 7);
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(view);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda4(view, 6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue, gapComposer);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda6(this, supportSearchViewModel, function1, i, 28);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((SupportSearchViewModel) obj, function1, gapComposer, 0);
    }
}
