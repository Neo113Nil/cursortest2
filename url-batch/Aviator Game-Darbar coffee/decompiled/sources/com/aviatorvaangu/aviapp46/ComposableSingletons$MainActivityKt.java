package com.aviatorvaangu.aviapp46;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.aviatorvaangu.aviapp46.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MainActivity.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class ComposableSingletons$MainActivityKt {
    public static final ComposableSingletons$MainActivityKt INSTANCE = new ComposableSingletons$MainActivityKt();
    private static Function2<Composer, Integer, Unit> lambda$674815025 = ComposableLambdaKt.composableLambdaInstance(674815025, false, new Function2() { // from class: com.aviatorvaangu.aviapp46.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda_674815025$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-520448234, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f125lambda$520448234 = ComposableLambdaKt.composableLambdaInstance(-520448234, false, new Function2() { // from class: com.aviatorvaangu.aviapp46.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda__520448234$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1037818552, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f124lambda$1037818552 = ComposableLambdaKt.composableLambdaInstance(-1037818552, false, new Function2() { // from class: com.aviatorvaangu.aviapp46.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda__1037818552$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1037818552$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7952getLambda$1037818552$app() {
        return f124lambda$1037818552;
    }

    /* renamed from: getLambda$-520448234$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7953getLambda$520448234$app() {
        return f125lambda$520448234;
    }

    public final Function2<Composer, Integer, Unit> getLambda$674815025$app() {
        return lambda$674815025;
    }

    static final Unit lambda__1037818552$lambda$2(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C15@534L184:MainActivity.kt#ev6w7u");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1037818552, i, -1, "com.aviatorvaangu.aviapp46.ComposableSingletons$MainActivityKt.lambda$-1037818552.<anonymous> (MainActivity.kt:15)");
            }
            ThemeKt.AviatorTheme(false, false, f125lambda$520448234, composer, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__520448234$lambda$1(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C16@606L98:MainActivity.kt#ev6w7u");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-520448234, i, -1, "com.aviatorvaangu.aviapp46.ComposableSingletons$MainActivityKt.lambda$-520448234.<anonymous> (MainActivity.kt:16)");
            }
            SurfaceKt.m2571SurfaceT9BRK9s(null, null, ColorKt.Color(4278650631L), 0L, 0.0f, 0.0f, null, lambda$674815025, composer, 12583296, 123);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_674815025$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C17@663L23:MainActivity.kt#ev6w7u");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(674815025, i, -1, "com.aviatorvaangu.aviapp46.ComposableSingletons$MainActivityKt.lambda$674815025.<anonymous> (MainActivity.kt:17)");
            }
            AviatorFlyingGuideAppKt.AviatorFlyingGuideApp(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
