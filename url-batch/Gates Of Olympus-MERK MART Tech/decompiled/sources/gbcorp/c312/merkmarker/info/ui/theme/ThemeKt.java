package gbcorp.c312.merkmarker.info.ui.theme;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"LightColorScheme", "Landroidx/compose/material3/ColorScheme;", "ProductAppMRKMRTheme", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThemeKt {
    private static final ColorScheme LightColorScheme = ColorSchemeKt.m2232lightColorScheme_VG5OTI$default(ColorKt.getForestGreen(), ColorKt.getPureWhite(), ColorKt.getLeafGreen(), ColorKt.getDarkForest(), 0, ColorKt.getMossGreen(), ColorKt.getPureWhite(), 0, 0, 0, 0, 0, 0, ColorKt.getSageLight(), ColorKt.getDarkInk(), ColorKt.getPureWhite(), ColorKt.getDarkInk(), ColorKt.getParchmentWhite(), ColorKt.getSlateGreen(), 0, 0, 0, 0, 0, 0, 0, ColorKt.getSoftBorder(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -67625072, 65535, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductAppMRKMRTheme$lambda$0(Function2 function2, int i, Composer composer, int i2) {
        ProductAppMRKMRTheme(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ProductAppMRKMRTheme(Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        final Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1401340044);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProductAppMRKMRTheme)N(content)26@708L119:Theme.kt#2u4qcg");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            function2 = content;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1401340044, i2, -1, "gbcorp.c312.merkmarker.info.ui.theme.ProductAppMRKMRTheme (Theme.kt:25)");
            }
            function2 = content;
            MaterialThemeKt.MaterialTheme(LightColorScheme, null, TypeKt.getTypography(), function2, startRestartGroup, ((i2 << 9) & 7168) | 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ProductAppMRKMRTheme$lambda$0;
                    ProductAppMRKMRTheme$lambda$0 = ThemeKt.ProductAppMRKMRTheme$lambda$0(Function2.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ProductAppMRKMRTheme$lambda$0;
                }
            });
        }
    }
}
