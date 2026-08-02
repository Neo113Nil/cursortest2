package com.squareup.cash.support.chat.views.transcript;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final class ErrorRowView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Function0 onRetryClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorRowView(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.onRetryClick = new SheetKt$$ExternalSyntheticLambda9(16);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1939606008);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1931325805, new ErrorRowView$$ExternalSyntheticLambda1(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorRowView$$ExternalSyntheticLambda1(this, i);
        }
    }

    public final void setOnRetryClick(Function0<Unit> function0) {
        function0.getClass();
        this.onRetryClick = function0;
    }
}
