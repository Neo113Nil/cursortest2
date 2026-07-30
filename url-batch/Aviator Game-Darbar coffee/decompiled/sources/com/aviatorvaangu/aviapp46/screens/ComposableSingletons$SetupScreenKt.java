package com.aviatorvaangu.aviapp46.screens;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SetupScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SetupScreenKt {
    public static final ComposableSingletons$SetupScreenKt INSTANCE = new ComposableSingletons$SetupScreenKt();

    /* renamed from: lambda$-662804118, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f129lambda$662804118 = ComposableLambdaKt.composableLambdaInstance(-662804118, false, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.ComposableSingletons$SetupScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SetupScreenKt.lambda__662804118$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-662804118$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m7958getLambda$662804118$app() {
        return f129lambda$662804118;
    }

    static final Unit lambda__662804118$lambda$0(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C55@2516L30:SetupScreen.kt#5vyur7");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-662804118, i, -1, "com.aviatorvaangu.aviapp46.screens.ComposableSingletons$SetupScreenKt.lambda$-662804118.<anonymous> (SetupScreen.kt:55)");
            }
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(12.0f)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
