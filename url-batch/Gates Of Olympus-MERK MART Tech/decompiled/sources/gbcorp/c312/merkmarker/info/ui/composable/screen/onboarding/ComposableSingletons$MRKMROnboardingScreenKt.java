package gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.ui.theme.ColorKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRKMROnboardingScreen.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MRKMROnboardingScreenKt {
    public static final ComposableSingletons$MRKMROnboardingScreenKt INSTANCE = new ComposableSingletons$MRKMROnboardingScreenKt();

    /* renamed from: lambda$-926694037, reason: not valid java name */
    private static Function4<PagerScope, Integer, Composer, Integer, Unit> f136lambda$926694037 = ComposableLambdaKt.composableLambdaInstance(-926694037, false, new Function4() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.ComposableSingletons$MRKMROnboardingScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            Unit lambda__926694037$lambda$0;
            lambda__926694037$lambda$0 = ComposableSingletons$MRKMROnboardingScreenKt.lambda__926694037$lambda$0((PagerScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            return lambda__926694037$lambda$0;
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2028476724 = ComposableLambdaKt.composableLambdaInstance(2028476724, false, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.ComposableSingletons$MRKMROnboardingScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit lambda_2028476724$lambda$0;
            lambda_2028476724$lambda$0 = ComposableSingletons$MRKMROnboardingScreenKt.lambda_2028476724$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return lambda_2028476724$lambda$0;
        }
    });

    /* renamed from: getLambda$-926694037$app_release, reason: not valid java name */
    public final Function4<PagerScope, Integer, Composer, Integer, Unit> m9558getLambda$926694037$app_release() {
        return f136lambda$926694037;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2028476724$app_release() {
        return lambda$2028476724;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__926694037$lambda$0(PagerScope HorizontalPager, int i, Composer composer, int i2) {
        List list;
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        ComposerKt.sourceInformation(composer, "CN(page)112@4497L54:MRKMROnboardingScreen.kt#ioy939");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-926694037, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.ComposableSingletons$MRKMROnboardingScreenKt.lambda$-926694037.<anonymous> (MRKMROnboardingScreen.kt:112)");
        }
        list = MRKMROnboardingScreenKt.onboardingPagesContent;
        MRKMROnboardingScreenKt.OnboardingPage((OnboardingContent) list.get(i), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_2028476724$lambda$0(RowScope TextButton, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C145@5735L42,144@5702L186:MRKMROnboardingScreen.kt#ioy939");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2028476724, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.ComposableSingletons$MRKMROnboardingScreenKt.lambda$2028476724.<anonymous> (MRKMROnboardingScreen.kt:144)");
            }
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(R.string.skip_button_title, composer, 0), null, ColorKt.getSlateGreen(), null, 0L, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1573248, 0, 262074);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
