package com.aviatorvaangu.aviapp46.screens;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.aviatorvaangu.aviapp46.components.AppColorsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class ComposableSingletons$OnboardingScreenKt {
    public static final ComposableSingletons$OnboardingScreenKt INSTANCE = new ComposableSingletons$OnboardingScreenKt();

    /* renamed from: lambda$-2110299283, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f128lambda$2110299283 = ComposableLambdaKt.composableLambdaInstance(-2110299283, false, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.ComposableSingletons$OnboardingScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$OnboardingScreenKt.lambda__2110299283$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-2110299283$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7957getLambda$2110299283$app() {
        return f128lambda$2110299283;
    }

    static final Unit lambda__2110299283$lambda$0(RowScope TextButton, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C61@3004L61:OnboardingScreen.kt#5vyur7");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2110299283, i, -1, "com.aviatorvaangu.aviapp46.screens.ComposableSingletons$OnboardingScreenKt.lambda$-2110299283.<anonymous> (OnboardingScreen.kt:61)");
            }
            TextKt.m2714TextNvy7gAk("SKIP", null, AppColorsKt.getSoftGrey(), null, 0L, null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1573254, 0, 262074);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
