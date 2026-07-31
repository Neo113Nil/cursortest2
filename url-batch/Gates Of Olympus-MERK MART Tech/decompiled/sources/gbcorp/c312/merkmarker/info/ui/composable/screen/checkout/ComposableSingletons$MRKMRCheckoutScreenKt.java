package gbcorp.c312.merkmarker.info.ui.composable.screen.checkout;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import gbcorp.c312.merkmarker.info.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRKMRCheckoutScreen.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MRKMRCheckoutScreenKt {
    public static final ComposableSingletons$MRKMRCheckoutScreenKt INSTANCE = new ComposableSingletons$MRKMRCheckoutScreenKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$580370514 = ComposableLambdaKt.composableLambdaInstance(580370514, false, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.ComposableSingletons$MRKMRCheckoutScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit lambda_580370514$lambda$0;
            lambda_580370514$lambda$0 = ComposableSingletons$MRKMRCheckoutScreenKt.lambda_580370514$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return lambda_580370514$lambda$0;
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$580370514$app_release() {
        return lambda$580370514;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_580370514$lambda$0(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C169@6362L51,168@6333L215:MRKMRCheckoutScreen.kt#v79pgw");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(580370514, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.ComposableSingletons$MRKMRCheckoutScreenKt.lambda$580370514.<anonymous> (MRKMRCheckoutScreen.kt:168)");
            }
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(R.string.button_confirm_order_label, composer, 0), null, 0L, null, TextUnitKt.getSp(16), null, FontWeight.INSTANCE.getBold(), null, TextUnitKt.getSp(1.5d), null, null, 0L, 0, false, 0, 0, null, null, composer, 102260736, 0, 261806);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
