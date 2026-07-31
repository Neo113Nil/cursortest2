package gbcorp.c312.merkmarker.info.ui.composable.screen.order;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.ui.composable.shared.MRKMREmptyViewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MRKMROrderScreen.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MRKMROrderScreenKt {
    public static final ComposableSingletons$MRKMROrderScreenKt INSTANCE = new ComposableSingletons$MRKMROrderScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$919176729 = ComposableLambdaKt.composableLambdaInstance(919176729, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.order.ComposableSingletons$MRKMROrderScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_919176729$lambda$0;
            lambda_919176729$lambda$0 = ComposableSingletons$MRKMROrderScreenKt.lambda_919176729$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_919176729$lambda$0;
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$919176729$app_release() {
        return lambda$919176729;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_919176729$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C75@2897L56,74@2847L180:MRKMROrderScreen.kt#4stfok");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(919176729, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.order.ComposableSingletons$MRKMROrderScreenKt.lambda$919176729.<anonymous> (MRKMROrderScreen.kt:74)");
            }
            MRKMREmptyViewKt.MRKMREmptyView(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), StringResources_androidKt.stringResource(R.string.orders_state_empty_primary_text, composer, 0), null, null, null, composer, 6, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
