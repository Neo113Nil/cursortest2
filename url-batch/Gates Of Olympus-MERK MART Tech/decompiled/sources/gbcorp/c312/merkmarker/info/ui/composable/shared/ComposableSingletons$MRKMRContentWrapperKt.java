package gbcorp.c312.merkmarker.info.ui.composable.shared;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MRKMRContentWrapper.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MRKMRContentWrapperKt {
    public static final ComposableSingletons$MRKMRContentWrapperKt INSTANCE = new ComposableSingletons$MRKMRContentWrapperKt();
    private static Function2<Composer, Integer, Unit> lambda$2108232491 = ComposableLambdaKt.composableLambdaInstance(2108232491, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.shared.ComposableSingletons$MRKMRContentWrapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_2108232491$lambda$0;
            lambda_2108232491$lambda$0 = ComposableSingletons$MRKMRContentWrapperKt.lambda_2108232491$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_2108232491$lambda$0;
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2108232491$app_release() {
        return lambda$2108232491;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_2108232491$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:MRKMRContentWrapper.kt#m5r16l");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2108232491, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.shared.ComposableSingletons$MRKMRContentWrapperKt.lambda$2108232491.<anonymous> (MRKMRContentWrapper.kt:13)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
