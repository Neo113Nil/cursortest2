package gbcorp.c312.merkmarker.info.ui.composable.navigation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryKt;
import gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute;
import gbcorp.c312.merkmarker.info.ui.composable.screen.GTSLYDetailsScreenWrapperKt;
import gbcorp.c312.merkmarker.info.ui.composable.screen.order.MRKMROrderScreenKt;
import gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails.MRKMRProductDetailsScreenKt;
import gbcorp.c312.merkmarker.info.ui.composable.screen.settings.MRKMRSettingsScreenKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: AppNavHost.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AppNavHostKt {
    public static final ComposableSingletons$AppNavHostKt INSTANCE = new ComposableSingletons$AppNavHostKt();
    private static Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> lambda$127523192 = ComposableLambdaKt.composableLambdaInstance(127523192, false, new Function4() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.ComposableSingletons$AppNavHostKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            Unit lambda_127523192$lambda$0;
            lambda_127523192$lambda$0 = ComposableSingletons$AppNavHostKt.lambda_127523192$lambda$0((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            return lambda_127523192$lambda$0;
        }
    });
    private static Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> lambda$1726223348 = ComposableLambdaKt.composableLambdaInstance(1726223348, false, new Function4() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.ComposableSingletons$AppNavHostKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            Unit lambda_1726223348$lambda$0;
            lambda_1726223348$lambda$0 = ComposableSingletons$AppNavHostKt.lambda_1726223348$lambda$0((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            return lambda_1726223348$lambda$0;
        }
    });

    /* renamed from: lambda$-295977007, reason: not valid java name */
    private static Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> f130lambda$295977007 = ComposableLambdaKt.composableLambdaInstance(-295977007, false, new Function4() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.ComposableSingletons$AppNavHostKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            Unit lambda__295977007$lambda$0;
            lambda__295977007$lambda$0 = ComposableSingletons$AppNavHostKt.lambda__295977007$lambda$0((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            return lambda__295977007$lambda$0;
        }
    });

    /* renamed from: lambda$-970043792, reason: not valid java name */
    private static Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> f131lambda$970043792 = ComposableLambdaKt.composableLambdaInstance(-970043792, false, new Function4() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.ComposableSingletons$AppNavHostKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            Unit lambda__970043792$lambda$0;
            lambda__970043792$lambda$0 = ComposableSingletons$AppNavHostKt.lambda__970043792$lambda$0((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            return lambda__970043792$lambda$0;
        }
    });

    /* renamed from: getLambda$-295977007$app_release, reason: not valid java name */
    public final Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> m9526getLambda$295977007$app_release() {
        return f130lambda$295977007;
    }

    /* renamed from: getLambda$-970043792$app_release, reason: not valid java name */
    public final Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> m9527getLambda$970043792$app_release() {
        return f131lambda$970043792;
    }

    public final Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> getLambda$127523192$app_release() {
        return lambda$127523192;
    }

    public final Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> getLambda$1726223348$app_release() {
        return lambda$1726223348;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__295977007$lambda$0(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "CN(it)128@4843L14:AppNavHost.kt#h1e4d0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-295977007, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.navigation.ComposableSingletons$AppNavHostKt.lambda$-295977007.<anonymous> (AppNavHost.kt:128)");
        }
        MRKMROrderScreenKt.OrdersScreen(null, null, composer, 0, 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__970043792$lambda$0(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "CN(it)132@4921L16:AppNavHost.kt#h1e4d0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-970043792, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.navigation.ComposableSingletons$AppNavHostKt.lambda$-970043792.<anonymous> (AppNavHost.kt:132)");
        }
        MRKMRSettingsScreenKt.SettingsScreen(null, composer, 0, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_127523192$lambda$0(AnimatedContentScope composable, NavBackStackEntry backStackEntry, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ComposerKt.sourceInformation(composer, "CN(backStackEntry)53@2410L111:AppNavHost.kt#h1e4d0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(127523192, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.navigation.ComposableSingletons$AppNavHostKt.lambda$127523192.<anonymous> (AppNavHost.kt:52)");
        }
        NavRoute.GTSLYDetailsScreen gTSLYDetailsScreen = (NavRoute.GTSLYDetailsScreen) NavBackStackEntryKt.toRoute(backStackEntry, Reflection.getOrCreateKotlinClass(NavRoute.GTSLYDetailsScreen.class));
        GTSLYDetailsScreenWrapperKt.GTSLYDetailsScreenWrapper(gTSLYDetailsScreen.getUrl(), Modifier.INSTANCE, null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1726223348$lambda$0(AnimatedContentScope composable, NavBackStackEntry backStackEntry, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ComposerKt.sourceInformation(composer, "CN(backStackEntry)104@4178L82:AppNavHost.kt#h1e4d0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1726223348, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.navigation.ComposableSingletons$AppNavHostKt.lambda$1726223348.<anonymous> (AppNavHost.kt:103)");
        }
        MRKMRProductDetailsScreenKt.ProductDetailsScreen(((NavRoute.ProductDetails) NavBackStackEntryKt.toRoute(backStackEntry, Reflection.getOrCreateKotlinClass(NavRoute.ProductDetails.class))).getId(), null, null, composer, 0, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
