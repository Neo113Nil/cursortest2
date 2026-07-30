package com.aviatorvaangu.aviapp46.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import com.aviatorvaangu.aviapp46.components.AppScaffoldKt;
import com.aviatorvaangu.aviapp46.components.CardsKt;
import com.aviatorvaangu.aviapp46.components.PromoCardKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartScreen.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"StartScreen", "", "onAdClick", "Lkotlin/Function0;", "onStart", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class StartScreenKt {
    static final Unit StartScreen$lambda$5(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        StartScreen(function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void StartScreen(final Function0<Unit> onAdClick, final Function0<Unit> onStart, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onAdClick, "onAdClick");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Composer startRestartGroup = composer.startRestartGroup(-1451032739);
        ComposerKt.sourceInformation(startRestartGroup, "C(StartScreen)N(onAdClick,onStart)25@1119L1258,25@1107L1270:StartScreen.kt#5vyur7");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(onAdClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onStart) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1451032739, i2, -1, "com.aviatorvaangu.aviapp46.screens.StartScreen (StartScreen.kt:24)");
            }
            AppScaffoldKt.AppScaffold(ComposableLambdaKt.rememberComposableLambda(929927529, true, new Function2() { // from class: com.aviatorvaangu.aviapp46.screens.StartScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StartScreenKt.StartScreen$lambda$4(Function0.this, onStart, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.aviatorvaangu.aviapp46.screens.StartScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StartScreenKt.StartScreen$lambda$5(Function0.this, onStart, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit StartScreen$lambda$4(final Function0 function0, final Function0 function02, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C30@1311L1060,26@1129L1242:StartScreen.kt#5vyur7");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(929927529, i, -1, "com.aviatorvaangu.aviapp46.screens.StartScreen.<anonymous> (StartScreen.kt:26)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues m813PaddingValues0680j_4 = PaddingKt.m813PaddingValues0680j_4(Dp.m7522constructorimpl(22.0f));
            Arrangement.HorizontalOrVertical m690spacedBy0680j_4 = Arrangement.INSTANCE.m690spacedBy0680j_4(Dp.m7522constructorimpl(14.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 307165005, "CC(remember):StartScreen.kt#9igjgp");
            boolean changed = composer.changed(function0) | composer.changed(function02);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.aviatorvaangu.aviapp46.screens.StartScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StartScreenKt.StartScreen$lambda$4$lambda$3$lambda$2(Function0.this, function02, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyColumn(fillMaxSize$default, null, m813PaddingValues0680j_4, false, m690spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer, 24966, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit StartScreen$lambda$4$lambda$3$lambda$2(final Function0 function0, final Function0 function02, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$StartScreenKt.INSTANCE.m7959getLambda$119945612$app(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-994215203, true, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.StartScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return StartScreenKt.StartScreen$lambda$4$lambda$3$lambda$2$lambda$0(Function0.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1428178884, true, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.StartScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return StartScreenKt.StartScreen$lambda$4$lambda$3$lambda$2$lambda$1(Function0.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$StartScreenKt.INSTANCE.m7960getLambda$1862142565$app(), 3, null);
        return Unit.INSTANCE;
    }

    static final Unit StartScreen$lambda$4$lambda$3$lambda$2$lambda$0(Function0 function0, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C41@1793L33:StartScreen.kt#5vyur7");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-994215203, i, -1, "com.aviatorvaangu.aviapp46.screens.StartScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StartScreen.kt:41)");
            }
            PromoCardKt.PromoCard(null, function0, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit StartScreen$lambda$4$lambda$3$lambda$2$lambda$1(Function0 function0, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C43@1864L110:StartScreen.kt#5vyur7");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1428178884, i, -1, "com.aviatorvaangu.aviapp46.screens.StartScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StartScreen.kt:43)");
            }
            CardsKt.BigActionCard("Start This App", "Open setup and personalize your guide", function0, composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
