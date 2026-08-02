package com.squareup.cash.support.chat.views.transcript.viewholder;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;

/* loaded from: classes7.dex */
public final class MessageTypingIndicatorComposeView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageTypingIndicatorComposeView(Context context) {
        super(context, null, 6, 0);
        context.getClass();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1786052087);
        int i2 = i & 1;
        if (gapComposer.shouldExecute(i2, i2 != 0)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, ComposableSingletons$MessageTypingIndicatorComposeViewHolderKt.lambda$1078269598, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda6(this, i, 21);
        }
    }
}
