package com.squareup.cash.support.chat.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda6;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class ChatLoadingView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatLoadingView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(Unit unit, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1389229477);
        int i2 = i & 1;
        if (gapComposer.shouldExecute(i2, i2 != 0)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, ChatExitPromptViewKt.f675lambda$489485958, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda6(this, unit, function1, i, 6);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((Unit) obj, function1, gapComposer, 0);
    }
}
