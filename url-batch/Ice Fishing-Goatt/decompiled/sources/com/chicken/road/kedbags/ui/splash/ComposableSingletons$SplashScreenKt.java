package com.chicken.road.kedbags.ui.splash;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplashScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$SplashScreenKt {
    public static final ComposableSingletons$SplashScreenKt INSTANCE = new ComposableSingletons$SplashScreenKt();

    /* renamed from: lambda$-2028245546, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f68lambda$2028245546 = ComposableLambdaKt.composableLambdaInstance(-2028245546, false, new Function3() { // from class: com.chicken.road.kedbags.ui.splash.ComposableSingletons$SplashScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SplashScreenKt.lambda__2028245546$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-2028245546$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6566getLambda$2028245546$app() {
        return f68lambda$2028245546;
    }

    static final Unit lambda__2028245546$lambda$0(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C179@6504L24:SplashScreen.kt#w4dag0");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2028245546, i, -1, "com.chicken.road.kedbags.ui.splash.ComposableSingletons$SplashScreenKt.lambda$-2028245546.<anonymous> (SplashScreen.kt:179)");
            }
            TextKt.m2357Text4IGK_g("Try again", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
