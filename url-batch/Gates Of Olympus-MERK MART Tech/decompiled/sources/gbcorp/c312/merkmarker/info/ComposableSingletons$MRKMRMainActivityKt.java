package gbcorp.c312.merkmarker.info;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt;
import gbcorp.c312.merkmarker.info.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MRKMRMainActivity.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MRKMRMainActivityKt {
    public static final ComposableSingletons$MRKMRMainActivityKt INSTANCE = new ComposableSingletons$MRKMRMainActivityKt();

    /* renamed from: lambda$-1782019892, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f126lambda$1782019892 = ComposableLambdaKt.composableLambdaInstance(-1782019892, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ComposableSingletons$MRKMRMainActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda__1782019892$lambda$0;
            lambda__1782019892$lambda$0 = ComposableSingletons$MRKMRMainActivityKt.lambda__1782019892$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda__1782019892$lambda$0;
        }
    });

    /* renamed from: lambda$-54678455, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f127lambda$54678455 = ComposableLambdaKt.composableLambdaInstance(-54678455, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ComposableSingletons$MRKMRMainActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda__54678455$lambda$0;
            lambda__54678455$lambda$0 = ComposableSingletons$MRKMRMainActivityKt.lambda__54678455$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda__54678455$lambda$0;
        }
    });

    /* renamed from: getLambda$-1782019892$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m9474getLambda$1782019892$app_release() {
        return f126lambda$1782019892;
    }

    /* renamed from: getLambda$-54678455$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m9475getLambda$54678455$app_release() {
        return f127lambda$54678455;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__54678455$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C25@1024L62:MRKMRMainActivity.kt#rbzdnn");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-54678455, i, -1, "gbcorp.c312.merkmarker.info.ComposableSingletons$MRKMRMainActivityKt.lambda$-54678455.<anonymous> (MRKMRMainActivity.kt:25)");
            }
            ThemeKt.ProductAppMRKMRTheme(f126lambda$1782019892, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1782019892$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C26@1063L9:MRKMRMainActivity.kt#rbzdnn");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1782019892, i, -1, "gbcorp.c312.merkmarker.info.ComposableSingletons$MRKMRMainActivityKt.lambda$-1782019892.<anonymous> (MRKMRMainActivity.kt:26)");
            }
            AppRootKt.AppRoot(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
