package gbcorp.c312.merkmarker.info.ui.composable.approot;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.NavigationBarItemDefaults;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavDestination;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: AppBottomBar.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"AppBottomBar", "", "itemsInCart", "", "currentDestination", "Landroidx/navigation/NavDestination;", "navigationItems", "", "Lgbcorp/c312/merkmarker/info/ui/composable/approot/BottomNavItem;", "onNavigateToRoute", "Lkotlin/Function1;", "(ILandroidx/navigation/NavDestination;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "isSelectedDestination", "", FirebaseAnalytics.Param.DESTINATION, "route", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppBottomBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBottomBar$lambda$1(int i, NavDestination navDestination, List list, Function1 function1, int i2, Composer composer, int i3) {
        AppBottomBar(i, navDestination, list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void AppBottomBar(final int i, final NavDestination navDestination, final List<BottomNavItem> navigationItems, final Function1<? super BottomNavItem, Unit> onNavigateToRoute, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(navigationItems, "navigationItems");
        Intrinsics.checkNotNullParameter(onNavigateToRoute, "onNavigateToRoute");
        Composer startRestartGroup = composer.startRestartGroup(-2017220222);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppBottomBar)N(itemsInCart,currentDestination,navigationItems,onNavigateToRoute)38@1372L11,39@1430L11,40@1459L1901,37@1318L2042:AppBottomBar.kt#l2omj");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(navDestination) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(navigationItems) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onNavigateToRoute) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2017220222, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBar (AppBottomBar.kt:35)");
            }
            NavigationBarKt.m2695NavigationBarHsRjFd4(null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnPrimary(), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(804058555, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit AppBottomBar$lambda$0;
                    AppBottomBar$lambda$0 = AppBottomBarKt.AppBottomBar$lambda$0(navigationItems, navDestination, onNavigateToRoute, i, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return AppBottomBar$lambda$0;
                }
            }, startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 25);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBarKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppBottomBar$lambda$1;
                    AppBottomBar$lambda$1 = AppBottomBarKt.AppBottomBar$lambda$1(i, navDestination, navigationItems, onNavigateToRoute, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AppBottomBar$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBottomBar$lambda$0(List list, NavDestination navDestination, final Function1 function1, final int i, RowScope rowScope, Composer composer, int i2) {
        int i3;
        RowScope NavigationBar = rowScope;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(NavigationBar, "$this$NavigationBar");
        ComposerKt.sourceInformation(composer2, "C*45@1643L27,47@1696L1040,73@2763L82,78@2961L11,79@3038L11,81@3173L11,82@3271L11,77@2899L431,42@1515L1829:AppBottomBar.kt#l2omj");
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer2.changed(NavigationBar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        boolean z = true;
        if (!composer2.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(804058555, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBar.<anonymous> (AppBottomBar.kt:41)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final BottomNavItem bottomNavItem = (BottomNavItem) it.next();
                boolean isSelectedDestination = isSelectedDestination(navDestination, bottomNavItem.getRoute());
                ComposerKt.sourceInformationMarkerStart(composer2, 1472256322, "CC(remember):AppBottomBar.kt#9igjgp");
                boolean changed = composer2.changed(function1) | composer2.changed(bottomNavItem);
                Object rememberedValue = composer2.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit AppBottomBar$lambda$0$0$0$0;
                            AppBottomBar$lambda$0$0$0$0 = AppBottomBarKt.AppBottomBar$lambda$0$0$0$0(Function1.this, bottomNavItem);
                            return AppBottomBar$lambda$0$0$0$0;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-754788318, z, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AppBottomBar$lambda$0$0$1;
                        AppBottomBar$lambda$0$0$1 = AppBottomBarKt.AppBottomBar$lambda$0$0$1(BottomNavItem.this, i, (Composer) obj, ((Integer) obj2).intValue());
                        return AppBottomBar$lambda$0$0$1;
                    }
                }, composer2, 54);
                ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-2052471515, z, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBarKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AppBottomBar$lambda$0$0$2;
                        AppBottomBar$lambda$0$0$2 = AppBottomBarKt.AppBottomBar$lambda$0$0$2(BottomNavItem.this, (Composer) obj, ((Integer) obj2).intValue());
                        return AppBottomBar$lambda$0$0$2;
                    }
                }, composer2, 54);
                int i4 = i3;
                composer2 = composer;
                NavigationBarKt.NavigationBarItem(NavigationBar, isSelectedDestination, (Function0) rememberedValue, rememberComposableLambda, null, false, rememberComposableLambda2, false, NavigationBarItemDefaults.INSTANCE.m2690colors69fazGs(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnPrimary(), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnPrimary(), Color.INSTANCE.m5428getTransparent0d7_KjU(), Color.m5392copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnPrimary(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5392copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnPrimary(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, composer, (NavigationBarItemDefaults.$stable << 21) | 384, 96), null, composer2, (i4 & 14) | 1575936, 344);
                NavigationBar = rowScope;
                i3 = i4;
                z = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBottomBar$lambda$0$0$0$0(Function1 function1, BottomNavItem bottomNavItem) {
        function1.invoke(bottomNavItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBottomBar$lambda$0$0$1(final BottomNavItem bottomNavItem, final int i, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C:AppBottomBar.kt#l2omj");
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-754788318, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBar.<anonymous>.<anonymous>.<anonymous> (AppBottomBar.kt:48)");
            }
            if (Intrinsics.areEqual(bottomNavItem.getRoute(), NavRoute.Cart.INSTANCE)) {
                composer.startReplaceGroup(-1744911057);
                ComposerKt.sourceInformation(composer, "50@1824L271,57@2122L296,49@1777L641");
                BadgeKt.BadgedBox(ComposableLambdaKt.rememberComposableLambda(919163333, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBarKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit AppBottomBar$lambda$0$0$1$0;
                        AppBottomBar$lambda$0$0$1$0 = AppBottomBarKt.AppBottomBar$lambda$0$0$1$0(i, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return AppBottomBar$lambda$0$0$1$0;
                    }
                }, composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-740134653, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBarKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit AppBottomBar$lambda$0$0$1$1;
                        AppBottomBar$lambda$0$0$1$1 = AppBottomBarKt.AppBottomBar$lambda$0$0$1$1(BottomNavItem.this, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return AppBottomBar$lambda$0$0$1$1;
                    }
                }, composer, 54), composer, 390, 2);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1744234544);
                ComposerKt.sourceInformation(composer, "67@2580L29,65@2472L224");
                IconKt.m2553Iconww6aTOc(bottomNavItem.getIcon(), StringResources_androidKt.stringResource(bottomNavItem.getTitleRes(), composer, 0), SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(26)), 0L, composer, 384, 8);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBottomBar$lambda$0$0$1$0(final int i, BoxScope BadgedBox, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
        ComposerKt.sourceInformation(composer, "C:AppBottomBar.kt#l2omj");
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(919163333, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppBottomBar.kt:51)");
            }
            if (i > 0) {
                composer.startReplaceGroup(-1916565565);
                ComposerKt.sourceInformation(composer, "52@1923L108,52@1917L114");
                BadgeKt.m2038BadgeeopBjH0(null, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(949179149, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBarKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit AppBottomBar$lambda$0$0$1$0$0;
                        AppBottomBar$lambda$0$0$1$0$0 = AppBottomBarKt.AppBottomBar$lambda$0$0$1$0$0(i, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return AppBottomBar$lambda$0$0$1$0$0;
                    }
                }, composer, 54), composer, 3072, 7);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1916386819);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBottomBar$lambda$0$0$1$0$0(int i, RowScope Badge, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(Badge, "$this$Badge");
        ComposerKt.sourceInformation(composer, "C53@1965L28:AppBottomBar.kt#l2omj");
        if (!composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(949179149, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppBottomBar.kt:53)");
            }
            TextKt.m3259TextNvy7gAk(String.valueOf(i), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBottomBar$lambda$0$0$1$1(BottomNavItem bottomNavItem, BoxScope BadgedBox, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
        ComposerKt.sourceInformation(composer, "C60@2268L29,58@2152L240:AppBottomBar.kt#l2omj");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740134653, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppBottomBar.kt:58)");
            }
            IconKt.m2553Iconww6aTOc(bottomNavItem.getIcon(), StringResources_androidKt.stringResource(bottomNavItem.getTitleRes(), composer, 0), SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(26)), 0L, composer, 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBottomBar$lambda$0$0$2(BottomNavItem bottomNavItem, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C74@2797L29,74@2785L42:AppBottomBar.kt#l2omj");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2052471515, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppBottomBar.<anonymous>.<anonymous>.<anonymous> (AppBottomBar.kt:74)");
            }
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(bottomNavItem.getTitleRes(), composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final boolean isSelectedDestination(NavDestination navDestination, NavRoute navRoute) {
        if (navDestination != null) {
            Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
            while (it.hasNext()) {
                if (NavDestination.INSTANCE.hasRoute(it.next(), Reflection.getOrCreateKotlinClass(navRoute.getClass()))) {
                    return true;
                }
            }
        }
        return false;
    }
}
