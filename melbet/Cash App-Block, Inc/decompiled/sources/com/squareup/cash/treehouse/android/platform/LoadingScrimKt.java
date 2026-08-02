package com.squareup.cash.treehouse.android.platform;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.tabs.views.ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public abstract class LoadingScrimKt {

    /* renamed from: lambda$-1979329545, reason: not valid java name */
    public static final ComposableLambdaImpl f740lambda$1979329545 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(24), false, -1979329545);

    public static final void LoadingScrim(int i, Composer composer, Modifier modifier, boolean z) {
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1503233171);
        int i2 = (gapComposer.changed(z) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            z2 = z;
            AnimatedContentKt.AnimatedVisibility(z2, SizeKt.fillMaxSize(companion, 1.0f), EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(90, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4), 2), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-1270284395, new MoneyTabUIKt$$ExternalSyntheticLambda38(z, 10), gapComposer), (Composer) gapComposer, (i2 & 14) | 200064, 16);
            modifier = companion;
        } else {
            z2 = z;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LoadingScrimKt$$ExternalSyntheticLambda1(z2, modifier, i);
        }
    }
}
