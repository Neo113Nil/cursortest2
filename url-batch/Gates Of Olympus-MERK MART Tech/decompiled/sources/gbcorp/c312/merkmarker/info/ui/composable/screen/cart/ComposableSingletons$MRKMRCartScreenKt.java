package gbcorp.c312.merkmarker.info.ui.composable.screen.cart;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.AddKt;
import androidx.compose.material.icons.rounded.RemoveKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.ui.composable.shared.MRKMREmptyViewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MRKMRCartScreen.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MRKMRCartScreenKt {
    public static final ComposableSingletons$MRKMRCartScreenKt INSTANCE = new ComposableSingletons$MRKMRCartScreenKt();

    /* renamed from: lambda$-88862971, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f132lambda$88862971 = ComposableLambdaKt.composableLambdaInstance(-88862971, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.ComposableSingletons$MRKMRCartScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda__88862971$lambda$0;
            lambda__88862971$lambda$0 = ComposableSingletons$MRKMRCartScreenKt.lambda__88862971$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda__88862971$lambda$0;
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1357842788 = ComposableLambdaKt.composableLambdaInstance(1357842788, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.ComposableSingletons$MRKMRCartScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_1357842788$lambda$0;
            lambda_1357842788$lambda$0 = ComposableSingletons$MRKMRCartScreenKt.lambda_1357842788$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_1357842788$lambda$0;
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1468090395 = ComposableLambdaKt.composableLambdaInstance(1468090395, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.ComposableSingletons$MRKMRCartScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_1468090395$lambda$0;
            lambda_1468090395$lambda$0 = ComposableSingletons$MRKMRCartScreenKt.lambda_1468090395$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_1468090395$lambda$0;
        }
    });

    /* renamed from: getLambda$-88862971$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m9533getLambda$88862971$app_release() {
        return f132lambda$88862971;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1357842788$app_release() {
        return lambda$1357842788;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1468090395$app_release() {
        return lambda$1468090395;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__88862971$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C163@7093L54,162@7043L178:MRKMRCartScreen.kt#70tc7e");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-88862971, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.cart.ComposableSingletons$MRKMRCartScreenKt.lambda$-88862971.<anonymous> (MRKMRCartScreen.kt:162)");
            }
            MRKMREmptyViewKt.MRKMREmptyView(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), StringResources_androidKt.stringResource(R.string.cart_state_empty_primary_text, composer, 0), null, null, null, composer, 6, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1357842788$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C228@9370L59,226@9259L250:MRKMRCartScreen.kt#70tc7e");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1357842788, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.cart.ComposableSingletons$MRKMRCartScreenKt.lambda$1357842788.<anonymous> (MRKMRCartScreen.kt:226)");
            }
            IconKt.m2553Iconww6aTOc(RemoveKt.getRemove(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(R.string.decrease_quantity_icon_description, composer, 0), SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(16)), 0L, composer, 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1468090395$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C249@10351L59,247@10243L247:MRKMRCartScreen.kt#70tc7e");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1468090395, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.cart.ComposableSingletons$MRKMRCartScreenKt.lambda$1468090395.<anonymous> (MRKMRCartScreen.kt:247)");
            }
            IconKt.m2553Iconww6aTOc(AddKt.getAdd(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(R.string.increase_quantity_icon_description, composer, 0), SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(16)), 0L, composer, 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
