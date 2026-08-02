package com.squareup.cash.transfers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAddCashDisabledDialogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class BalanceBasedAddCashDisabledDialogView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceBasedAddCashDisabledDialogView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-582936517);
        int i3 = (gapComposer.changedInstance(balanceBasedAddCashDisabledDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (balanceBasedAddCashDisabledDialogViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, balanceBasedAddCashDisabledDialogViewModel, function1, i, i4) { // from class: com.squareup.cash.transfers.views.BalanceBasedAddCashDisabledDialogView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ BalanceBasedAddCashDisabledDialogView f$0;
                        public final /* synthetic */ BalanceBasedAddCashDisabledDialogViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function12 = this.f$2;
                            BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel2 = this.f$1;
                            BalanceBasedAddCashDisabledDialogView balanceBasedAddCashDisabledDialogView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = BalanceBasedAddCashDisabledDialogView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    balanceBasedAddCashDisabledDialogView.Content(balanceBasedAddCashDisabledDialogViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    balanceBasedAddCashDisabledDialogView.Content(balanceBasedAddCashDisabledDialogViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i2 = i;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(112158662, new BalanceBasedAddCashDisabledDialogView$$ExternalSyntheticLambda1(function1, balanceBasedAddCashDisabledDialogViewModel), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = 1;
            final int i6 = i2;
            endRestartGroup2.block = new Function2(this, balanceBasedAddCashDisabledDialogViewModel, function1, i6, i5) { // from class: com.squareup.cash.transfers.views.BalanceBasedAddCashDisabledDialogView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ BalanceBasedAddCashDisabledDialogView f$0;
                public final /* synthetic */ BalanceBasedAddCashDisabledDialogViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function12 = this.f$2;
                    BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel2 = this.f$1;
                    BalanceBasedAddCashDisabledDialogView balanceBasedAddCashDisabledDialogView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = BalanceBasedAddCashDisabledDialogView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            balanceBasedAddCashDisabledDialogView.Content(balanceBasedAddCashDisabledDialogViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            balanceBasedAddCashDisabledDialogView.Content(balanceBasedAddCashDisabledDialogViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((BalanceBasedAddCashDisabledDialogViewModel) obj, function1, gapComposer, 0);
    }
}
