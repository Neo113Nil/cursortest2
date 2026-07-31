package gbcorp.c312.merkmarker.info.ui.composable.approot;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.rounded.ArrowBackKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AppTopBar.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AppTopBarKt {
    public static final ComposableSingletons$AppTopBarKt INSTANCE = new ComposableSingletons$AppTopBarKt();
    private static Function2<Composer, Integer, Unit> lambda$332733772 = ComposableLambdaKt.composableLambdaInstance(332733772, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.ComposableSingletons$AppTopBarKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_332733772$lambda$0;
            lambda_332733772$lambda$0 = ComposableSingletons$AppTopBarKt.lambda_332733772$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_332733772$lambda$0;
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$332733772$app_release() {
        return lambda$332733772;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_332733772$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C74@2915L11,71@2726L233:AppTopBar.kt#l2omj");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(332733772, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.ComposableSingletons$AppTopBarKt.lambda$332733772.<anonymous> (AppTopBar.kt:71)");
            }
            IconKt.m2553Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Rounded.INSTANCE), "Navigate Back", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
