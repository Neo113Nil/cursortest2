package com.squareup.cash.support.chat.views.transcript.message;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;

/* loaded from: classes7.dex */
public final class ImagePlaceholderView extends AbstractComposeView {
    public final MessageBodyLayout$$ExternalSyntheticLambda0 onRetryClick;
    public MutableState state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State ERROR;
        public static final State LOADING;

        static {
            State state = new State("LOADING", 0);
            LOADING = state;
            State state2 = new State("ERROR", 1);
            ERROR = state2;
            $VALUES = new State[]{state, state2};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePlaceholderView(Context context, MessageBodyLayout$$ExternalSyntheticLambda0 messageBodyLayout$$ExternalSyntheticLambda0) {
        super(context, null, 6, 0);
        context.getClass();
        this.onRetryClick = messageBodyLayout$$ExternalSyntheticLambda0;
        this.state = Updater.mutableStateOf$default(State.LOADING);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(808683715);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2003021902, new ImagePlaceholderView$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ImagePlaceholderView$$ExternalSyntheticLambda0(this, i);
        }
    }

    public final void setState(MutableState mutableState) {
        mutableState.getClass();
        this.state = mutableState;
    }
}
