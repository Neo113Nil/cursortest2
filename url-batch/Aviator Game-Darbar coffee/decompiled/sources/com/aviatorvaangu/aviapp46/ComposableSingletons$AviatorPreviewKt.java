package com.aviatorvaangu.aviapp46;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AviatorPreview.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class ComposableSingletons$AviatorPreviewKt {
    public static final ComposableSingletons$AviatorPreviewKt INSTANCE = new ComposableSingletons$AviatorPreviewKt();
    private static Function2<Composer, Integer, Unit> lambda$1780062896 = ComposableLambdaKt.composableLambdaInstance(1780062896, false, new Function2() { // from class: com.aviatorvaangu.aviapp46.ComposableSingletons$AviatorPreviewKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AviatorPreviewKt.lambda_1780062896$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1780062896$app() {
        return lambda$1780062896;
    }

    static final Unit lambda_1780062896$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C10@330L23:AviatorPreview.kt#ev6w7u");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1780062896, i, -1, "com.aviatorvaangu.aviapp46.ComposableSingletons$AviatorPreviewKt.lambda$1780062896.<anonymous> (AviatorPreview.kt:10)");
            }
            AviatorFlyingGuideAppKt.AviatorFlyingGuideApp(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
