package gbcorp.c312.merkmarker.info.ui.composable.screen.checkout;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MaterialTheme;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckoutDialog.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$CheckoutDialogKt {
    public static final ComposableSingletons$CheckoutDialogKt INSTANCE = new ComposableSingletons$CheckoutDialogKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$840716158 = ComposableLambdaKt.composableLambdaInstance(840716158, false, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.ComposableSingletons$CheckoutDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit lambda_840716158$lambda$0;
            lambda_840716158$lambda$0 = ComposableSingletons$CheckoutDialogKt.lambda_840716158$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return lambda_840716158$lambda$0;
        }
    });

    /* renamed from: lambda$-1119636340, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f133lambda$1119636340 = ComposableLambdaKt.composableLambdaInstance(-1119636340, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.ComposableSingletons$CheckoutDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda__1119636340$lambda$0;
            lambda__1119636340$lambda$0 = ComposableSingletons$CheckoutDialogKt.lambda__1119636340$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda__1119636340$lambda$0;
        }
    });

    /* renamed from: getLambda$-1119636340$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m9540getLambda$1119636340$app_release() {
        return f133lambda$1119636340;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$840716158$app_release() {
        return lambda$840716158;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1119636340$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C30@1146L46,31@1232L11,29@1117L239:CheckoutDialog.kt#v79pgw");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1119636340, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.ComposableSingletons$CheckoutDialogKt.lambda$-1119636340.<anonymous> (CheckoutDialog.kt:29)");
            }
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(R.string.checkout_dialog_title, composer, 0), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnBackground(), null, TextUnitKt.getSp(20), null, FontWeight.INSTANCE.getExtraBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597440, 0, 262058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_840716158$lambda$0(RowScope FilledTonalButton, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(FilledTonalButton, "$this$FilledTonalButton");
        ComposerKt.sourceInformation(composer, "C62@2495L118:CheckoutDialog.kt#v79pgw");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(840716158, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.ComposableSingletons$CheckoutDialogKt.lambda$840716158.<anonymous> (CheckoutDialog.kt:62)");
            }
            TextKt.m3259TextNvy7gAk("View My Orders", null, 0L, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1572870, 0, 262078);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
