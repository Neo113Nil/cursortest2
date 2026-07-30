package com.chicken.road.kedbags.ui.quiz;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.chicken.road.kedbags.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NestPairTrialScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$NestPairTrialScreenKt {
    public static final ComposableSingletons$NestPairTrialScreenKt INSTANCE = new ComposableSingletons$NestPairTrialScreenKt();

    /* renamed from: lambda$-1692300229, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f67lambda$1692300229 = ComposableLambdaKt.composableLambdaInstance(-1692300229, false, new Function3() { // from class: com.chicken.road.kedbags.ui.quiz.ComposableSingletons$NestPairTrialScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$NestPairTrialScreenKt.lambda__1692300229$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1033641540, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f66lambda$1033641540 = ComposableLambdaKt.composableLambdaInstance(-1033641540, false, new Function3() { // from class: com.chicken.road.kedbags.ui.quiz.ComposableSingletons$NestPairTrialScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$NestPairTrialScreenKt.lambda__1033641540$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$759964955 = ComposableLambdaKt.composableLambdaInstance(759964955, false, new Function3() { // from class: com.chicken.road.kedbags.ui.quiz.ComposableSingletons$NestPairTrialScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$NestPairTrialScreenKt.lambda_759964955$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1033641540$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6563getLambda$1033641540$app() {
        return f66lambda$1033641540;
    }

    /* renamed from: getLambda$-1692300229$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6564getLambda$1692300229$app() {
        return f67lambda$1692300229;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$759964955$app() {
        return lambda$759964955;
    }

    static final Unit lambda__1692300229$lambda$0(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C82@4080L29,82@4075L35:NestPairTrialScreen.kt#7i8muq");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1692300229, i, -1, "com.chicken.road.kedbags.ui.quiz.ComposableSingletons$NestPairTrialScreenKt.lambda$-1692300229.<anonymous> (NestPairTrialScreen.kt:82)");
            }
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.back, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1033641540$lambda$1(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C85@4464L37,85@4459L43:NestPairTrialScreen.kt#7i8muq");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1033641540, i, -1, "com.chicken.road.kedbags.ui.quiz.ComposableSingletons$NestPairTrialScreenKt.lambda$-1033641540.<anonymous> (NestPairTrialScreen.kt:85)");
            }
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.shuffle_nest, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_759964955$lambda$2(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C90@5130L34,90@5125L40:NestPairTrialScreen.kt#7i8muq");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(759964955, i, -1, "com.chicken.road.kedbags.ui.quiz.ComposableSingletons$NestPairTrialScreenKt.lambda$759964955.<anonymous> (NestPairTrialScreen.kt:90)");
            }
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.try_again, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
