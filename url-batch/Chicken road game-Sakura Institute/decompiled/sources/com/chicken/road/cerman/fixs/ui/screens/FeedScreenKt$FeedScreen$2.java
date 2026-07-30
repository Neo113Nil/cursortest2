package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.chicken.road.cerman.fixs.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: FeedScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FeedScreenKt$FeedScreen$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Boolean> $addOpen$delegate;

    FeedScreenKt$FeedScreen$2(MutableState<Boolean> mutableState) {
        this.$addOpen$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-582726816, i, -1, "com.chicken.road.cerman.fixs.ui.screens.FeedScreen.<anonymous> (FeedScreen.kt:63)");
            }
            long amberDeep = ThemeKt.getAmberDeep();
            long onPrimary = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary();
            Function2<Composer, Integer, Unit> m6708getLambda1$app_release = ComposableSingletons$FeedScreenKt.INSTANCE.m6708getLambda1$app_release();
            Function2<Composer, Integer, Unit> m6709getLambda2$app_release = ComposableSingletons$FeedScreenKt.INSTANCE.m6709getLambda2$app_release();
            composer.startReplaceGroup(-1568450168);
            final MutableState<Boolean> mutableState = this.$addOpen$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$FeedScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = FeedScreenKt$FeedScreen$2.invoke$lambda$1$lambda$0(MutableState.this);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            FloatingActionButtonKt.m1803ExtendedFloatingActionButtonElI57k(m6708getLambda1$app_release, m6709getLambda2$app_release, (Function0) rememberedValue, null, false, null, amberDeep, onPrimary, null, null, composer, 1573302, 824);
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
        FeedScreenKt.FeedScreen$lambda$5(mutableState, true);
        return Unit.INSTANCE;
    }
}
