package com.squareup.cash.support.chat.views.transcript;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;

/* loaded from: classes7.dex */
public final class StatusView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusView(Context context) {
        super(context, null, 6, 0);
        context.getClass();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        RecomposeScopeImpl endRestartGroup;
        StatusView$$ExternalSyntheticLambda0 statusView$$ExternalSyntheticLambda0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2041194360);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        int i4 = 0;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (this.text == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    statusView$$ExternalSyntheticLambda0 = new StatusView$$ExternalSyntheticLambda0(this, i, i4);
                    endRestartGroup.block = statusView$$ExternalSyntheticLambda0;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2035560083, new StatusView$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 7);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            statusView$$ExternalSyntheticLambda0 = new StatusView$$ExternalSyntheticLambda0(this, i, i2);
            endRestartGroup.block = statusView$$ExternalSyntheticLambda0;
        }
    }
}
