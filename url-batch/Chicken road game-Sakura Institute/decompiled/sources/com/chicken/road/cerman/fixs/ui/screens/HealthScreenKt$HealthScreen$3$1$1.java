package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.material3.TabKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: HealthScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HealthScreenKt$HealthScreen$3$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Integer> $tab$delegate;

    HealthScreenKt$HealthScreen$3$1$1(MutableState<Integer> mutableState) {
        this.$tab$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
        HealthScreenKt.HealthScreen$lambda$6(mutableState, 0);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int HealthScreen$lambda$5;
        int HealthScreen$lambda$52;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-115924166, i, -1, "com.chicken.road.cerman.fixs.ui.screens.HealthScreen.<anonymous>.<anonymous>.<anonymous> (HealthScreen.kt:93)");
        }
        HealthScreen$lambda$5 = HealthScreenKt.HealthScreen$lambda$5(this.$tab$delegate);
        boolean z = HealthScreen$lambda$5 == 0;
        composer.startReplaceGroup(-95378115);
        final MutableState<Integer> mutableState = this.$tab$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = HealthScreenKt$HealthScreen$3$1$1.invoke$lambda$1$lambda$0(MutableState.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        TabKt.m2259TabwqdebIU(z, (Function0) rememberedValue, null, false, ComposableSingletons$HealthScreenKt.INSTANCE.m6733getLambda2$app_release(), null, 0L, 0L, null, composer, 24624, 492);
        HealthScreen$lambda$52 = HealthScreenKt.HealthScreen$lambda$5(this.$tab$delegate);
        boolean z2 = HealthScreen$lambda$52 == 1;
        composer.startReplaceGroup(-95375011);
        final MutableState<Integer> mutableState2 = this.$tab$delegate;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$3$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = HealthScreenKt$HealthScreen$3$1$1.invoke$lambda$3$lambda$2(MutableState.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        TabKt.m2259TabwqdebIU(z2, (Function0) rememberedValue2, null, false, ComposableSingletons$HealthScreenKt.INSTANCE.m6734getLambda3$app_release(), null, 0L, 0L, null, composer, 24624, 492);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(MutableState mutableState) {
        HealthScreenKt.HealthScreen$lambda$6(mutableState, 1);
        return Unit.INSTANCE;
    }
}
