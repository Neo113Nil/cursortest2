package com.aviatorvaangu.aviapp46.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromoCard.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PromoCardKt {
    public static final ComposableSingletons$PromoCardKt INSTANCE = new ComposableSingletons$PromoCardKt();

    /* renamed from: lambda$-1341740371, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f127lambda$1341740371 = ComposableLambdaKt.composableLambdaInstance(-1341740371, false, new Function3() { // from class: com.aviatorvaangu.aviapp46.components.ComposableSingletons$PromoCardKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PromoCardKt.lambda__1341740371$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1341740371$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7956getLambda$1341740371$app() {
        return f127lambda$1341740371;
    }

    static final Unit lambda__1341740371$lambda$0(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C87@4253L66:PromoCard.kt#xqf9wq");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1341740371, i, -1, "com.aviatorvaangu.aviapp46.components.ComposableSingletons$PromoCardKt.lambda$-1341740371.<anonymous> (PromoCard.kt:87)");
            }
            TextKt.m2714TextNvy7gAk("Learn More", null, 0L, null, TextUnitKt.getSp(12), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597446, 0, 262062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
