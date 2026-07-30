package com.aviatorvaangu.aviapp46;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.aviatorvaangu.aviapp46.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AviatorPreview.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"AviatorPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class AviatorPreviewKt {
    static final Unit AviatorPreview$lambda$0(int i, Composer composer, int i2) {
        AviatorPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final void AviatorPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-912296130);
        ComposerKt.sourceInformation(startRestartGroup, "C(AviatorPreview)9@266L93:AviatorPreview.kt#ev6w7u");
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-912296130, i, -1, "com.aviatorvaangu.aviapp46.AviatorPreview (AviatorPreview.kt:8)");
            }
            ThemeKt.AviatorTheme(false, false, ComposableSingletons$AviatorPreviewKt.INSTANCE.getLambda$1780062896$app(), startRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.aviatorvaangu.aviapp46.AviatorPreviewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AviatorPreviewKt.AviatorPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
