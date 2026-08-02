package com.squareup.cash.support.chat.views.transcript.message;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investing.components.InvestingHomeView$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.components.teengraduation.StocksTransferStatusTileView$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class UnknownMessageBodyView extends AbstractComposeView {
    public final /* synthetic */ int $r8$classId = 1;
    public final Function0 onUpdateClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownMessageBodyView(Context context, InvestingHomeView$$ExternalSyntheticLambda2 investingHomeView$$ExternalSyntheticLambda2) {
        super(context, null, 6, 0);
        context.getClass();
        investingHomeView$$ExternalSyntheticLambda2.getClass();
        this.onUpdateClick = investingHomeView$$ExternalSyntheticLambda2;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        switch (this.$r8$classId) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(1532722101);
                int i2 = i | (gapComposer.changed(this) ? 4 : 2);
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1211701824, new UnknownMessageBodyView$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new UnknownMessageBodyView$$ExternalSyntheticLambda0(this, i);
                    break;
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(-582742966);
                int i3 = i | (gapComposer2.changed(this) ? 4 : 2);
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
                    ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(484474415, new StocksTransferStatusTileView$$ExternalSyntheticLambda0(this), gapComposer2), gapComposer2, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new StocksTransferStatusTileView$$ExternalSyntheticLambda0(this, i);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownMessageBodyView(Context context, Function0 function0) {
        super(context, null, 6, 0);
        context.getClass();
        function0.getClass();
        this.onUpdateClick = function0;
    }
}
