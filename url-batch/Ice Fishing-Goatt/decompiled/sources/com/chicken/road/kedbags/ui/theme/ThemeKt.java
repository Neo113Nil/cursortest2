package com.chicken.road.kedbags.ui.theme;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"CluckColorScheme", "Landroidx/compose/material3/ColorScheme;", "CluckFortuneTheme", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThemeKt {
    private static final ColorScheme CluckColorScheme = ColorSchemeKt.m1599lightColorSchemeCXl9yA$default(ColorKt.getCluckPrimary(), ColorKt.getCluckOnPrimary(), ColorKt.getCluckPrimaryContainer(), ColorKt.getCluckOnPrimaryContainer(), 0, ColorKt.getCluckSecondary(), ColorKt.getCluckOnSecondary(), ColorKt.getCluckSecondaryContainer(), ColorKt.getCluckOnSecondaryContainer(), ColorKt.getCluckTertiary(), ColorKt.getCluckOnTertiary(), 0, 0, ColorKt.getCluckBackground(), ColorKt.getCluckOnBackground(), ColorKt.getCluckSurface(), ColorKt.getCluckOnPrimary(), ColorKt.getCluckSurfaceVariant(), ColorKt.getCluckOnSurfaceVariant(), 0, 0, 0, 0, 0, 0, 0, ColorKt.getCluckOutline(), 0, 0, 0, 0, 0, 0, 0, 0, 0, -67626992, 15, null);

    static final Unit CluckFortuneTheme$lambda$0(Function2 function2, int i, Composer composer, int i2) {
        CluckFortuneTheme(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CluckFortuneTheme(Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        final Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(719998252);
        ComposerKt.sourceInformation(startRestartGroup, "C(CluckFortuneTheme)28@950L119:Theme.kt#jkois0");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            function2 = content;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(719998252, i2, -1, "com.chicken.road.kedbags.ui.theme.CluckFortuneTheme (Theme.kt:27)");
            }
            function2 = content;
            MaterialThemeKt.MaterialTheme(CluckColorScheme, null, TypeKt.getTypography(), function2, startRestartGroup, ((i2 << 9) & 7168) | 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.kedbags.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.CluckFortuneTheme$lambda$0(Function2.this, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
