package com.aviatorvaangu.aviapp46.components;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArticleComponents.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ArticleComponentsKt {
    public static final ComposableSingletons$ArticleComponentsKt INSTANCE = new ComposableSingletons$ArticleComponentsKt();

    /* renamed from: lambda$-2136503661, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f126lambda$2136503661 = ComposableLambdaKt.composableLambdaInstance(-2136503661, false, new Function3() { // from class: com.aviatorvaangu.aviapp46.components.ComposableSingletons$ArticleComponentsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ArticleComponentsKt.lambda__2136503661$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<ColumnScope, Composer, Integer, Unit> lambda$1069104248 = ComposableLambdaKt.composableLambdaInstance(1069104248, false, new Function3() { // from class: com.aviatorvaangu.aviapp46.components.ComposableSingletons$ArticleComponentsKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ArticleComponentsKt.lambda_1069104248$lambda$1((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-2136503661$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7955getLambda$2136503661$app() {
        return f126lambda$2136503661;
    }

    public final Function3<ColumnScope, Composer, Integer, Unit> getLambda$1069104248$app() {
        return lambda$1069104248;
    }

    static final Unit lambda__2136503661$lambda$0(RowScope TextButton, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C29@1223L61:ArticleComponents.kt#xqf9wq");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2136503661, i, -1, "com.aviatorvaangu.aviapp46.components.ComposableSingletons$ArticleComponentsKt.lambda$-2136503661.<anonymous> (ArticleComponents.kt:29)");
            }
            TextKt.m2714TextNvy7gAk("< Back", null, AppColorsKt.getSkyBlue(), null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1573254, 0, 262074);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1069104248$lambda$1(ColumnScope Card, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation(composer, "C48@1825L321:ArticleComponents.kt#xqf9wq");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1069104248, i, -1, "com.aviatorvaangu.aviapp46.components.ComposableSingletons$ArticleComponentsKt.lambda$1069104248.<anonymous> (ArticleComponents.kt:48)");
            }
            TextKt.m2714TextNvy7gAk("Reminder: this guide is for learning and responsible entertainment. Set limits, avoid chasing losses, and stop when play no longer feels calm.", PaddingKt.m820padding3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(14.0f)), ColorKt.Color(4294956758L), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, TextUnitKt.getSp(21), 0, false, 0, 0, null, null, composer, 25014, 48, 260072);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
