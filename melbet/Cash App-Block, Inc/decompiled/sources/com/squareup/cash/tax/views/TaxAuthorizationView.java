package com.squareup.cash.tax.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.broadway.ui.compose.SecureScreenKt;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tax.viewmodels.TaxAuthorizationViewModel$Empty;
import com.squareup.cash.ui.SecureScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class TaxAuthorizationView extends ComposeUiView implements SecureScreen {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxAuthorizationView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(TaxAuthorizationViewModel$Empty taxAuthorizationViewModel$Empty, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1869039497);
        int i2 = (gapComposer.changedInstance(function1) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            SecureScreenKt.SecureScreen(true, gapComposer, 6);
            Unit unit = Unit.INSTANCE;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new TaxAuthorizationView$Content$1$1(function1, (Continuation) null, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda5(24, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer, 0);
            TaxReturnsViewKt.TaxAuthorizationContent(gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(this, taxAuthorizationViewModel$Empty, function1, i, 3);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((TaxAuthorizationViewModel$Empty) obj, function1, gapComposer, 0);
    }
}
