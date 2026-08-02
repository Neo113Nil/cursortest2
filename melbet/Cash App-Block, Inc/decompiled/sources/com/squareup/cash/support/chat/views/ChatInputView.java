package com.squareup.cash.support.chat.views;

import android.view.ContextThemeWrapper;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;

/* loaded from: classes7.dex */
public final class ChatInputView extends AbstractComposeView {
    public final boolean autoKeyboard;
    public final ChatView$$ExternalSyntheticLambda1 onSendClick;
    public final ChatView$$ExternalSyntheticLambda6 onTextChanged;
    public final TextFieldState textFieldState;

    public ChatInputView(ContextThemeWrapper contextThemeWrapper, TextFieldState textFieldState, ChatView$$ExternalSyntheticLambda6 chatView$$ExternalSyntheticLambda6, ChatView$$ExternalSyntheticLambda1 chatView$$ExternalSyntheticLambda1, boolean z) {
        super(contextThemeWrapper, null, 6, 0);
        this.textFieldState = textFieldState;
        this.onTextChanged = chatView$$ExternalSyntheticLambda6;
        this.onSendClick = chatView$$ExternalSyntheticLambda1;
        this.autoKeyboard = z;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-787307112);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1122798419, new ChatInputView$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ChatInputView$$ExternalSyntheticLambda0(this, i);
        }
    }
}
