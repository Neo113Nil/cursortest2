package com.squareup.cash.support.screenshot;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.ui.MainActivity;
import com.squareup.util.android.AndroidToaster;

/* loaded from: classes.dex */
public final class ScreenshotView extends AbstractComposeView {
    public final ScreenshotEventReceiver screenshotEventReceiver;
    public final RealScreenshotManager screenshotManager;
    public final AndroidToaster toaster;

    public ScreenshotView(MainActivity mainActivity, RealScreenshotManager realScreenshotManager, ScreenshotEventReceiver screenshotEventReceiver, AndroidToaster androidToaster) {
        super(mainActivity, null, 6, 0);
        this.screenshotManager = realScreenshotManager;
        this.screenshotEventReceiver = screenshotEventReceiver;
        this.toaster = androidToaster;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(630261122);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(345662295, new ScreenshotView$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScreenshotView$$ExternalSyntheticLambda0(this, i);
        }
    }
}
