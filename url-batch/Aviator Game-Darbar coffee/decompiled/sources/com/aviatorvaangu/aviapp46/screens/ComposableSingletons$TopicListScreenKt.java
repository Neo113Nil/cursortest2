package com.aviatorvaangu.aviapp46.screens;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.TextUnitKt;
import com.aviatorvaangu.aviapp46.components.AppColorsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopicListScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class ComposableSingletons$TopicListScreenKt {
    public static final ComposableSingletons$TopicListScreenKt INSTANCE = new ComposableSingletons$TopicListScreenKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1656427594 = ComposableLambdaKt.composableLambdaInstance(1656427594, false, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.ComposableSingletons$TopicListScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$TopicListScreenKt.lambda_1656427594$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1656427594$app() {
        return lambda$1656427594;
    }

    static final Unit lambda_1656427594$lambda$0(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C30@1315L123:TopicListScreen.kt#5vyur7");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1656427594, i, -1, "com.aviatorvaangu.aviapp46.screens.ComposableSingletons$TopicListScreenKt.lambda$1656427594.<anonymous> (TopicListScreen.kt:30)");
            }
            TextKt.m2714TextNvy7gAk("Learn everything about Aviator gameplay and safer strategy.", null, AppColorsKt.getSoftGrey(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, TextUnitKt.getSp(22), 0, false, 0, 0, null, null, composer, 24966, 48, 260074);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
