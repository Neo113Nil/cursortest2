package com.squareup.cash.wallet.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.wallet.viewmodels.CardControlDialogViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final class ArcadeCardControlDialog extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeCardControlDialog(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(CardControlDialogViewModel cardControlDialogViewModel, Function1 function1, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2040601798);
        int i2 = (gapComposer.changedInstance(cardControlDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (cardControlDialogViewModel == null) {
            gapComposer.startReplaceGroup(-600912018);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-600912017);
            String str = cardControlDialogViewModel.title;
            String str2 = str == null ? "" : str;
            String str3 = cardControlDialogViewModel.message;
            String str4 = str3 == null ? "" : str3;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-272533002, new TabToolbarsKt$$ExternalSyntheticLambda3(27, cardControlDialogViewModel, function1), gapComposer);
            CardControlDialogViewModel.Button button = cardControlDialogViewModel.secondaryButton;
            if (button == null) {
                gapComposer.startReplaceGroup(-199856020);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-199856019);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1303412958, new TabToolbarsKt$$ExternalSyntheticLambda3(28, function1, button), gapComposer);
                gapComposer.end(false);
            }
            ModalKt.Modal((Modifier) null, str2, str4, rememberComposableLambda2, rememberComposableLambda, (Function3) null, gapComposer, 3072, 33);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(this, cardControlDialogViewModel, function1, i, 21);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((CardControlDialogViewModel) obj, function1, gapComposer, 0);
    }
}
