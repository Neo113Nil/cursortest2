package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.chicken.road.cerman.fixs.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: HealthScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HealthScreenKt$HealthScreen$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Boolean> $addOpen$delegate;
    final /* synthetic */ MutableState<Integer> $tab$delegate;

    HealthScreenKt$HealthScreen$2(MutableState<Integer> mutableState, MutableState<Boolean> mutableState2) {
        this.$tab$delegate = mutableState;
        this.$addOpen$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int HealthScreen$lambda$5;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(644293216, i, -1, "com.chicken.road.cerman.fixs.ui.screens.HealthScreen.<anonymous> (HealthScreen.kt:82)");
            }
            HealthScreen$lambda$5 = HealthScreenKt.HealthScreen$lambda$5(this.$tab$delegate);
            long brick = HealthScreen$lambda$5 == 0 ? ThemeKt.getBrick() : ThemeKt.getAmberDeep();
            long onPrimary = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary();
            final MutableState<Integer> mutableState = this.$tab$delegate;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(934534476, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$2.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    int HealthScreen$lambda$52;
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(934534476, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.HealthScreen.<anonymous>.<anonymous> (HealthScreen.kt:87)");
                    }
                    HealthScreen$lambda$52 = HealthScreenKt.HealthScreen$lambda$5(mutableState);
                    TextKt.m2373Text4IGK_g(HealthScreen$lambda$52 == 0 ? "Add vaccine" : "Add weight", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            Function2<Composer, Integer, Unit> m6725getLambda1$app_release = ComposableSingletons$HealthScreenKt.INSTANCE.m6725getLambda1$app_release();
            composer.startReplaceGroup(-218792538);
            final MutableState<Boolean> mutableState2 = this.$addOpen$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = HealthScreenKt$HealthScreen$2.invoke$lambda$1$lambda$0(MutableState.this);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            FloatingActionButtonKt.m1803ExtendedFloatingActionButtonElI57k(rememberComposableLambda, m6725getLambda1$app_release, (Function0) rememberedValue, null, false, null, brick, onPrimary, null, null, composer, 438, 824);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
        HealthScreenKt.HealthScreen$lambda$9(mutableState, true);
        return Unit.INSTANCE;
    }
}
