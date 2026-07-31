package gbcorp.c312.merkmarker.info.ui.composable.navigation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.PopUpToBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostKt;
import gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute;
import gbcorp.c312.merkmarker.info.ui.composable.screen.GTSLYPrepScreenKt;
import gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt;
import gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.MRKMRCheckoutScreenKt;
import gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt;
import gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.MRKMROnboardingScreenKt;
import gbcorp.c312.merkmarker.info.ui.composable.screen.splash.MRKMRSplashScreenKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: AppNavHost.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"AppNavHost", "", "navController", "Landroidx/navigation/NavHostController;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/navigation/NavHostController;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppNavHostKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$1(NavHostController navHostController, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AppNavHost(navHostController, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppNavHost(final NavHostController navController, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(-638392400);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppNavHost)N(navController,modifier)29@1395L3558,25@1259L3694:AppNavHost.kt#h1e4d0");
        if ((i & 6) == 0) {
            i3 = i | (startRestartGroup.changedInstance(navController) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-638392400, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHost (AppNavHost.kt:24)");
                }
                NavRoute.GTSLYPrepScreen gTSLYPrepScreen = NavRoute.GTSLYPrepScreen.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 685237942, "CC(remember):AppNavHost.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(navController);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit AppNavHost$lambda$0$0;
                            AppNavHost$lambda$0$0 = AppNavHostKt.AppNavHost$lambda$0$0(NavHostController.this, (NavGraphBuilder) obj);
                            return AppNavHost$lambda$0$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i5 = (i3 & 14) | 48 | ((i3 << 3) & 896);
                modifier3 = companion;
                NavHostKt.NavHost(navController, gTSLYPrepScreen, modifier3, (Alignment) null, (KClass<?>) null, (Map<KType, NavType<?>>) null, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, (Function1<? super NavGraphBuilder, Unit>) rememberedValue, startRestartGroup, i5, 0, 2040);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AppNavHost$lambda$1;
                        AppNavHost$lambda$1 = AppNavHostKt.AppNavHost$lambda$1(NavHostController.this, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return AppNavHost$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0(final NavHostController navHostController, NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        ComposableLambda composableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(1987035855, true, new Function4() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Unit AppNavHost$lambda$0$0$0;
                AppNavHost$lambda$0$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$0(NavHostController.this, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                return AppNavHost$lambda$0$0$0;
            }
        });
        NavGraphBuilderKt.composable(NavHost, Reflection.getOrCreateKotlinClass(NavRoute.GTSLYPrepScreen.class), (Map<KType, NavType<?>>) MapsKt.emptyMap(), (List<NavDeepLink>) CollectionsKt.emptyList(), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, composableLambdaInstance);
        Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> lambda$127523192$app_release = ComposableSingletons$AppNavHostKt.INSTANCE.getLambda$127523192$app_release();
        NavGraphBuilderKt.composable(NavHost, Reflection.getOrCreateKotlinClass(NavRoute.GTSLYDetailsScreen.class), (Map<KType, NavType<?>>) MapsKt.emptyMap(), (List<NavDeepLink>) CollectionsKt.emptyList(), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, lambda$127523192$app_release);
        ComposableLambda composableLambdaInstance2 = ComposableLambdaKt.composableLambdaInstance(-546543593, true, new Function4() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Unit AppNavHost$lambda$0$0$1;
                AppNavHost$lambda$0$0$1 = AppNavHostKt.AppNavHost$lambda$0$0$1(NavHostController.this, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                return AppNavHost$lambda$0$0$1;
            }
        });
        NavGraphBuilderKt.composable(NavHost, Reflection.getOrCreateKotlinClass(NavRoute.Splash.class), (Map<KType, NavType<?>>) MapsKt.emptyMap(), (List<NavDeepLink>) CollectionsKt.emptyList(), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, composableLambdaInstance2);
        ComposableLambda composableLambdaInstance3 = ComposableLambdaKt.composableLambdaInstance(-1220610378, true, new Function4() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Unit AppNavHost$lambda$0$0$2;
                AppNavHost$lambda$0$0$2 = AppNavHostKt.AppNavHost$lambda$0$0$2(NavHostController.this, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                return AppNavHost$lambda$0$0$2;
            }
        });
        NavGraphBuilderKt.composable(NavHost, Reflection.getOrCreateKotlinClass(NavRoute.Onboarding.class), (Map<KType, NavType<?>>) MapsKt.emptyMap(), (List<NavDeepLink>) CollectionsKt.emptyList(), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, composableLambdaInstance3);
        ComposableLambda composableLambdaInstance4 = ComposableLambdaKt.composableLambdaInstance(-1894677163, true, new Function4() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Unit AppNavHost$lambda$0$0$3;
                AppNavHost$lambda$0$0$3 = AppNavHostKt.AppNavHost$lambda$0$0$3(NavHostController.this, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                return AppNavHost$lambda$0$0$3;
            }
        });
        NavGraphBuilderKt.composable(NavHost, Reflection.getOrCreateKotlinClass(NavRoute.Home.class), (Map<KType, NavType<?>>) MapsKt.emptyMap(), (List<NavDeepLink>) CollectionsKt.emptyList(), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, composableLambdaInstance4);
        Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> lambda$1726223348$app_release = ComposableSingletons$AppNavHostKt.INSTANCE.getLambda$1726223348$app_release();
        NavGraphBuilderKt.composable(NavHost, Reflection.getOrCreateKotlinClass(NavRoute.ProductDetails.class), (Map<KType, NavType<?>>) MapsKt.emptyMap(), (List<NavDeepLink>) CollectionsKt.emptyList(), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, lambda$1726223348$app_release);
        ComposableLambda composableLambdaInstance5 = ComposableLambdaKt.composableLambdaInstance(1052156563, true, new Function4() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Unit AppNavHost$lambda$0$0$4;
                AppNavHost$lambda$0$0$4 = AppNavHostKt.AppNavHost$lambda$0$0$4(NavHostController.this, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                return AppNavHost$lambda$0$0$4;
            }
        });
        NavGraphBuilderKt.composable(NavHost, Reflection.getOrCreateKotlinClass(NavRoute.Cart.class), (Map<KType, NavType<?>>) MapsKt.emptyMap(), (List<NavDeepLink>) CollectionsKt.emptyList(), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, composableLambdaInstance5);
        ComposableLambda composableLambdaInstance6 = ComposableLambdaKt.composableLambdaInstance(378089778, true, new Function4() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Unit AppNavHost$lambda$0$0$5;
                AppNavHost$lambda$0$0$5 = AppNavHostKt.AppNavHost$lambda$0$0$5(NavHostController.this, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                return AppNavHost$lambda$0$0$5;
            }
        });
        NavGraphBuilderKt.composable(NavHost, Reflection.getOrCreateKotlinClass(NavRoute.Checkout.class), (Map<KType, NavType<?>>) MapsKt.emptyMap(), (List<NavDeepLink>) CollectionsKt.emptyList(), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, composableLambdaInstance6);
        Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> m9526getLambda$295977007$app_release = ComposableSingletons$AppNavHostKt.INSTANCE.m9526getLambda$295977007$app_release();
        NavGraphBuilderKt.composable(NavHost, Reflection.getOrCreateKotlinClass(NavRoute.Orders.class), (Map<KType, NavType<?>>) MapsKt.emptyMap(), (List<NavDeepLink>) CollectionsKt.emptyList(), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, m9526getLambda$295977007$app_release);
        Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> m9527getLambda$970043792$app_release = ComposableSingletons$AppNavHostKt.INSTANCE.m9527getLambda$970043792$app_release();
        NavGraphBuilderKt.composable(NavHost, Reflection.getOrCreateKotlinClass(NavRoute.Settings.class), (Map<KType, NavType<?>>) MapsKt.emptyMap(), (List<NavDeepLink>) CollectionsKt.emptyList(), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, m9527getLambda$970043792$app_release);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$0(final NavHostController navHostController, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "CN(it)33@1562L327,41@1930L295,31@1456L783:AppNavHost.kt#h1e4d0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1987035855, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHost.<anonymous>.<anonymous>.<anonymous> (AppNavHost.kt:31)");
        }
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(composer, -1718985898, "CC(remember):AppNavHost.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(navHostController);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit AppNavHost$lambda$0$0$0$0$0;
                    AppNavHost$lambda$0$0$0$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$0$0$0(NavHostController.this, (String) obj);
                    return AppNavHost$lambda$0$0$0$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1718974154, "CC(remember):AppNavHost.kt#9igjgp");
        boolean changedInstance2 = composer.changedInstance(navHostController);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit AppNavHost$lambda$0$0$0$1$0;
                    AppNavHost$lambda$0$0$0$1$0 = AppNavHostKt.AppNavHost$lambda$0$0$0$1$0(NavHostController.this);
                    return AppNavHost$lambda$0$0$0$1$0;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        GTSLYPrepScreenKt.GTSLYPrepScreen(fillMaxSize$default, null, function1, (Function0) rememberedValue2, composer, 6, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$0$0$0(final NavHostController navHostController, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        navHostController.navigate((NavHostController) new NavRoute.GTSLYDetailsScreen(url), new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppNavHost$lambda$0$0$0$0$0$0;
                AppNavHost$lambda$0$0$0$0$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$0$0$0$0(NavHostController.this, (NavOptionsBuilder) obj);
                return AppNavHost$lambda$0$0$0$0$0$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$0$0$0$0(NavHostController navHostController, NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.popUpTo(navHostController.getGraph().getStartDestinationId(), new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppNavHost$lambda$0$0$0$0$0$0$0;
                AppNavHost$lambda$0$0$0$0$0$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$0$0$0$0$0((PopUpToBuilder) obj);
                return AppNavHost$lambda$0$0$0$0$0$0$0;
            }
        });
        navigate.setLaunchSingleTop(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$0$0$0$0$0(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$0$1$0(final NavHostController navHostController) {
        navHostController.navigate((NavHostController) NavRoute.Splash.INSTANCE, new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppNavHost$lambda$0$0$0$1$0$0;
                AppNavHost$lambda$0$0$0$1$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$0$1$0$0(NavHostController.this, (NavOptionsBuilder) obj);
                return AppNavHost$lambda$0$0$0$1$0$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$0$1$0$0(NavHostController navHostController, NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.popUpTo(navHostController.getGraph().getStartDestinationId(), new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppNavHost$lambda$0$0$0$1$0$0$0;
                AppNavHost$lambda$0$0$0$1$0$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$0$1$0$0$0((PopUpToBuilder) obj);
                return AppNavHost$lambda$0$0$0$1$0$0$0;
            }
        });
        navigate.setLaunchSingleTop(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$0$1$0$0$0(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$1(final NavHostController navHostController, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "CN(it)60@2637L301,68@2981L307,59@2582L720:AppNavHost.kt#h1e4d0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-546543593, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHost.<anonymous>.<anonymous>.<anonymous> (AppNavHost.kt:59)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1242380252, "CC(remember):AppNavHost.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(navHostController);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit AppNavHost$lambda$0$0$1$0$0;
                    AppNavHost$lambda$0$0$1$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$1$0$0(NavHostController.this);
                    return AppNavHost$lambda$0$0$1$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1242369238, "CC(remember):AppNavHost.kt#9igjgp");
        boolean changedInstance2 = composer.changedInstance(navHostController);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit AppNavHost$lambda$0$0$1$1$0;
                    AppNavHost$lambda$0$0$1$1$0 = AppNavHostKt.AppNavHost$lambda$0$0$1$1$0(NavHostController.this);
                    return AppNavHost$lambda$0$0$1$1$0;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        MRKMRSplashScreenKt.SplashScreen(null, null, function0, (Function0) rememberedValue2, composer, 0, 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$1$0$0(final NavHostController navHostController) {
        navHostController.navigate((NavHostController) NavRoute.Home.INSTANCE, new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppNavHost$lambda$0$0$1$0$0$0;
                AppNavHost$lambda$0$0$1$0$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$1$0$0$0(NavHostController.this, (NavOptionsBuilder) obj);
                return AppNavHost$lambda$0$0$1$0$0$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$1$0$0$0(NavHostController navHostController, NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.popUpTo(navHostController.getGraph().getStartDestinationId(), new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppNavHost$lambda$0$0$1$0$0$0$0;
                AppNavHost$lambda$0$0$1$0$0$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$1$0$0$0$0((PopUpToBuilder) obj);
                return AppNavHost$lambda$0$0$1$0$0$0$0;
            }
        });
        navigate.setLaunchSingleTop(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$1$0$0$0$0(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$1$1$0(final NavHostController navHostController) {
        navHostController.navigate((NavHostController) NavRoute.Onboarding.INSTANCE, new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppNavHost$lambda$0$0$1$1$0$0;
                AppNavHost$lambda$0$0$1$1$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$1$1$0$0(NavHostController.this, (NavOptionsBuilder) obj);
                return AppNavHost$lambda$0$0$1$1$0$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$1$1$0$0(NavHostController navHostController, NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.popUpTo(navHostController.getGraph().getStartDestinationId(), new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppNavHost$lambda$0$0$1$1$0$0$0;
                AppNavHost$lambda$0$0$1$1$0$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$1$1$0$0$0((PopUpToBuilder) obj);
                return AppNavHost$lambda$0$0$1$1$0$0$0;
            }
        });
        navigate.setLaunchSingleTop(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$1$1$0$0$0(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$2(final NavHostController navHostController, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "CN(it)81@3427L274,80@3368L347:AppNavHost.kt#h1e4d0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1220610378, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHost.<anonymous>.<anonymous>.<anonymous> (AppNavHost.kt:80)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -480498840, "CC(remember):AppNavHost.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(navHostController);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit AppNavHost$lambda$0$0$2$0$0;
                    AppNavHost$lambda$0$0$2$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$2$0$0(NavHostController.this);
                    return AppNavHost$lambda$0$0$2$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        MRKMROnboardingScreenKt.OnboardingScreen(null, null, (Function0) rememberedValue, composer, 0, 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$2$0$0(NavHostController navHostController) {
        navHostController.navigate((NavHostController) NavRoute.Home.INSTANCE, new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppNavHost$lambda$0$0$2$0$0$0;
                AppNavHost$lambda$0$0$2$0$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$2$0$0$0((NavOptionsBuilder) obj);
                return AppNavHost$lambda$0$0$2$0$0$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$2$0$0$0(NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.popUpTo((NavOptionsBuilder) NavRoute.Onboarding.INSTANCE, new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppNavHost$lambda$0$0$2$0$0$0$0;
                AppNavHost$lambda$0$0$2$0$0$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$2$0$0$0$0((PopUpToBuilder) obj);
                return AppNavHost$lambda$0$0$2$0$0$0$0;
            }
        });
        navigate.setLaunchSingleTop(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$2$0$0$0$0(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$3(final NavHostController navHostController, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "CN(it)94@3832L161,93@3775L232:AppNavHost.kt#h1e4d0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1894677163, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHost.<anonymous>.<anonymous>.<anonymous> (AppNavHost.kt:93)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 281382294, "CC(remember):AppNavHost.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(navHostController);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit AppNavHost$lambda$0$0$3$0$0;
                    AppNavHost$lambda$0$0$3$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$3$0$0(NavHostController.this, ((Integer) obj).intValue());
                    return AppNavHost$lambda$0$0$3$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        MRKMRHomeScreenKt.HomeScreen(null, null, (Function1) rememberedValue, composer, 0, 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$3$0$0(NavHostController navHostController, int i) {
        NavController.navigate$default(navHostController, new NavRoute.ProductDetails(i), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$4(final NavHostController navHostController, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "CN(it)111@4377L81,110@4320L152:AppNavHost.kt#h1e4d0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052156563, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHost.<anonymous>.<anonymous>.<anonymous> (AppNavHost.kt:110)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1805144836, "CC(remember):AppNavHost.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(navHostController);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit AppNavHost$lambda$0$0$4$0$0;
                    AppNavHost$lambda$0$0$4$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$4$0$0(NavHostController.this);
                    return AppNavHost$lambda$0$0$4$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        MRKMRCartScreenKt.CartScreen(null, null, (Function0) rememberedValue, composer, 0, 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$4$0$0(NavHostController navHostController) {
        NavController.navigate$default(navHostController, NavRoute.Checkout.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$5(final NavHostController navHostController, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "CN(it)119@4595L172,118@4536L245:AppNavHost.kt#h1e4d0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(378089778, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHost.<anonymous>.<anonymous>.<anonymous> (AppNavHost.kt:118)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1727940994, "CC(remember):AppNavHost.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(navHostController);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit AppNavHost$lambda$0$0$5$0$0;
                    AppNavHost$lambda$0$0$5$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$5$0$0(NavHostController.this);
                    return AppNavHost$lambda$0$0$5$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        MRKMRCheckoutScreenKt.CheckoutScreen(null, null, (Function0) rememberedValue, composer, 0, 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$5$0$0(NavHostController navHostController) {
        navHostController.navigate((NavHostController) NavRoute.Orders.INSTANCE, new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppNavHost$lambda$0$0$5$0$0$0;
                AppNavHost$lambda$0$0$5$0$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$5$0$0$0((NavOptionsBuilder) obj);
                return AppNavHost$lambda$0$0$5$0$0$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$5$0$0$0(NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.popUpTo((NavOptionsBuilder) NavRoute.Home.INSTANCE, new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppNavHost$lambda$0$0$5$0$0$0$0;
                AppNavHost$lambda$0$0$5$0$0$0$0 = AppNavHostKt.AppNavHost$lambda$0$0$5$0$0$0$0((PopUpToBuilder) obj);
                return AppNavHost$lambda$0$0$5$0$0$0$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppNavHost$lambda$0$0$5$0$0$0$0(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(false);
        return Unit.INSTANCE;
    }
}
