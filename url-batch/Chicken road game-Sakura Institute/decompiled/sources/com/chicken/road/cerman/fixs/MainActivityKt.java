package com.chicken.road.cerman.fixs;

import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.PointerIconCompat;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt;
import com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt;
import com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt;
import com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt;
import com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt;
import com.chicken.road.cerman.fixs.ui.screens.HubScreenKt;
import com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"SplashOverlay", "", "(Landroidx/compose/runtime/Composer;I)V", "AppRoot", "app_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRoot$lambda$5(int i, Composer composer, int i2) {
        AppRoot(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SplashOverlay$lambda$1(int i, Composer composer, int i2) {
        SplashOverlay(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SplashOverlay(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1963570307);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1963570307, i, -1, "com.chicken.road.cerman.fixs.SplashOverlay (MainActivity.kt:88)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.splash_background, startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, LocationRequestCompat.QUALITY_LOW_POWER);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.splash_logo, startRestartGroup, 0), (String) null, SizeKt.fillMaxWidth(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0.55f), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, LocationRequestCompat.QUALITY_LOW_POWER);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.MainActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SplashOverlay$lambda$1;
                    SplashOverlay$lambda$1 = MainActivityKt.SplashOverlay$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SplashOverlay$lambda$1;
                }
            });
        }
    }

    public static final void AppRoot(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1068694973);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1068694973, i, -1, "com.chicken.road.cerman.fixs.AppRoot (MainActivity.kt:106)");
            }
            final NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(717105696);
            boolean changedInstance = startRestartGroup.changedInstance(rememberNavController);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.chicken.road.cerman.fixs.MainActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit AppRoot$lambda$4$lambda$3;
                        AppRoot$lambda$4$lambda$3 = MainActivityKt.AppRoot$lambda$4$lambda$3(NavHostController.this, (NavGraphBuilder) obj);
                        return AppRoot$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            NavHostKt.NavHost(rememberNavController, Routes.HUB, null, null, null, null, null, null, null, null, (Function1) rememberedValue, startRestartGroup, 48, 0, PointerIconCompat.TYPE_GRAB);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.MainActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppRoot$lambda$5;
                    AppRoot$lambda$5 = MainActivityKt.AppRoot$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return AppRoot$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRoot$lambda$4$lambda$3(final NavHostController navHostController, NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        NavGraphBuilderKt.composable$default(NavHost, Routes.HUB, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-74185696, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.MainActivityKt$AppRoot$1$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-74185696, i, -1, "com.chicken.road.cerman.fixs.AppRoot.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:109)");
                }
                HubScreenKt.HubScreen(NavHostController.this, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, Routes.FLOCK, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-856321065, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.MainActivityKt$AppRoot$1$1$2
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-856321065, i, -1, "com.chicken.road.cerman.fixs.AppRoot.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:110)");
                }
                FlockScreenKt.FlockScreen(NavHostController.this, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, Routes.CHICKEN, CollectionsKt.listOf(NamedNavArgumentKt.navArgument("id", new Function1() { // from class: com.chicken.road.cerman.fixs.MainActivityKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppRoot$lambda$4$lambda$3$lambda$2;
                AppRoot$lambda$4$lambda$3$lambda$2 = MainActivityKt.AppRoot$lambda$4$lambda$3$lambda$2((NavArgumentBuilder) obj);
                return AppRoot$lambda$4$lambda$3$lambda$2;
            }
        })), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1128757352, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.MainActivityKt$AppRoot$1$1$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry backStack, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(backStack, "backStack");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1128757352, i, -1, "com.chicken.road.cerman.fixs.AppRoot.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:115)");
                }
                Bundle arguments = backStack.getArguments();
                ChickenDetailScreenKt.ChickenDetailScreen(NavHostController.this, arguments != null ? arguments.getLong("id") : 0L, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 252, null);
        NavGraphBuilderKt.composable$default(NavHost, Routes.FEED, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1401193639, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.MainActivityKt$AppRoot$1$1$5
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1401193639, i, -1, "com.chicken.road.cerman.fixs.AppRoot.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:118)");
                }
                FeedScreenKt.FeedScreen(NavHostController.this, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, Routes.EGGS, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1673629926, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.MainActivityKt$AppRoot$1$1$6
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1673629926, i, -1, "com.chicken.road.cerman.fixs.AppRoot.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:119)");
                }
                EggSalesScreenKt.EggSalesScreen(NavHostController.this, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, Routes.HEALTH, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1946066213, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.MainActivityKt$AppRoot$1$1$7
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1946066213, i, -1, "com.chicken.road.cerman.fixs.AppRoot.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:120)");
                }
                HealthScreenKt.HealthScreen(NavHostController.this, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, Routes.STATS, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2076464796, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.MainActivityKt$AppRoot$1$1$8
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2076464796, i, -1, "com.chicken.road.cerman.fixs.AppRoot.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:121)");
                }
                StatsScreenKt.StatsScreen(NavHostController.this, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 254, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRoot$lambda$4$lambda$3$lambda$2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }
}
