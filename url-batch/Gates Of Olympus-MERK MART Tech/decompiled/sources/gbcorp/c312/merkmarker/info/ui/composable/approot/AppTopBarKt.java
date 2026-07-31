package gbcorp.c312.merkmarker.info.ui.composable.approot;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.DeleteSweepKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavDestination;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: AppTopBar.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a;\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0007¢\u0006\u0002\u0010\r\u001a\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u0010\"\u001c\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"canNavigateBackRoutes", "", "Lkotlin/reflect/KClass;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "AppTopBar", "", "currentDestination", "Landroidx/navigation/NavDestination;", "isCartNotEmpty", "", "onClearCartIconClick", "Lkotlin/Function0;", "onNavigateBack", "(Landroidx/navigation/NavDestination;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getTitle", "", "(Landroidx/navigation/NavDestination;)Ljava/lang/Integer;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppTopBarKt {
    private static final List<KClass<? extends NavRoute>> canNavigateBackRoutes = CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(NavRoute.ProductDetails.class), Reflection.getOrCreateKotlinClass(NavRoute.Checkout.class)});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppTopBar$lambda$3(NavDestination navDestination, boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AppTopBar(navDestination, z, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AppTopBar(final NavDestination navDestination, final boolean z, final Function0<Unit> onClearCartIconClick, final Function0<Unit> onNavigateBack, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onClearCartIconClick, "onClearCartIconClick");
        Intrinsics.checkNotNullParameter(onNavigateBack, "onNavigateBack");
        Composer startRestartGroup = composer.startRestartGroup(-1873619540);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppTopBar)N(currentDestination,isCartNotEmpty,onClearCartIconClick,onNavigateBack)81@3099L11,82@3166L11,80@3039L159,42@1699L180,68@2614L387,49@1900L686,41@1659L1546:AppTopBar.kt#l2omj");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(navDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(onClearCartIconClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(onNavigateBack) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1873619540, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppTopBar (AppTopBar.kt:37)");
            }
            boolean z2 = navDestination != null && NavDestination.INSTANCE.hasRoute(navDestination, Reflection.getOrCreateKotlinClass(NavRoute.Cart.class));
            final boolean matchesAnyRoute = AppRootKt.matchesAnyRoute(navDestination, canNavigateBackRoutes);
            final boolean z3 = z2;
            TopAppBarColors m3499topAppBarColors5tl4gsc = TopAppBarDefaults.INSTANCE.m3499topAppBarColors5tl4gsc(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnPrimary(), 0L, 0L, startRestartGroup, TopAppBarDefaults.$stable << 18, 54);
            startRestartGroup = startRestartGroup;
            AppBarKt.m2014CenterAlignedTopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(894747857, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppTopBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppTopBar$lambda$0;
                    AppTopBar$lambda$0 = AppTopBarKt.AppTopBar$lambda$0(NavDestination.this, (Composer) obj, ((Integer) obj2).intValue());
                    return AppTopBar$lambda$0;
                }
            }, startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(1393304659, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppTopBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppTopBar$lambda$1;
                    AppTopBar$lambda$1 = AppTopBarKt.AppTopBar$lambda$1(matchesAnyRoute, onNavigateBack, (Composer) obj, ((Integer) obj2).intValue());
                    return AppTopBar$lambda$1;
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1203021244, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppTopBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit AppTopBar$lambda$2;
                    AppTopBar$lambda$2 = AppTopBarKt.AppTopBar$lambda$2(z3, onClearCartIconClick, z, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return AppTopBar$lambda$2;
                }
            }, startRestartGroup, 54), 0.0f, null, m3499topAppBarColors5tl4gsc, null, startRestartGroup, 3462, 178);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppTopBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppTopBar$lambda$3;
                    AppTopBar$lambda$3 = AppTopBarKt.AppTopBar$lambda$3(NavDestination.this, z, onClearCartIconClick, onNavigateBack, i, (Composer) obj, ((Integer) obj2).intValue());
                    return AppTopBar$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppTopBar$lambda$0(NavDestination navDestination, Composer composer, int i) {
        String stringResource;
        ComposerKt.sourceInformation(composer, "C43@1713L156:AppTopBar.kt#l2omj");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(894747857, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppTopBar.<anonymous> (AppTopBar.kt:43)");
            }
            Integer title = getTitle(navDestination);
            if (title == null) {
                composer.startReplaceGroup(866442134);
                composer.endReplaceGroup();
                stringResource = null;
            } else {
                composer.startReplaceGroup(866442135);
                ComposerKt.sourceInformation(composer, "*44@1778L18");
                stringResource = StringResources_androidKt.stringResource(title.intValue(), composer, 0);
                composer.endReplaceGroup();
            }
            if (stringResource == null) {
                stringResource = "";
            }
            TextKt.m3259TextNvy7gAk(stringResource, null, 0L, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1572864, 0, 262078);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppTopBar$lambda$2(boolean z, final Function0 function0, final boolean z2, RowScope CenterAlignedTopAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(CenterAlignedTopAppBar, "$this$CenterAlignedTopAppBar");
        ComposerKt.sourceInformation(composer, "C:AppTopBar.kt#l2omj");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1203021244, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppTopBar.<anonymous> (AppTopBar.kt:50)");
            }
            if (z) {
                composer.startReplaceGroup(1998813890);
                ComposerKt.sourceInformation(composer, "52@1992L26,54@2084L478,51@1950L612");
                ComposerKt.sourceInformationMarkerStart(composer, 757215830, "CC(remember):AppTopBar.kt#9igjgp");
                boolean changed = composer.changed(function0);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppTopBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit AppTopBar$lambda$2$0$0;
                            AppTopBar$lambda$2$0$0 = AppTopBarKt.AppTopBar$lambda$2$0$0(Function0.this);
                            return AppTopBar$lambda$2$0$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                IconButtonKt.IconButton((Function0) rememberedValue, null, z2, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1460554525, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppTopBarKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AppTopBar$lambda$2$1;
                        AppTopBar$lambda$2$1 = AppTopBarKt.AppTopBar$lambda$2$1(z2, (Composer) obj, ((Integer) obj2).intValue());
                        return AppTopBar$lambda$2$1;
                    }
                }, composer, 54), composer, 1572864, 58);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1999432774);
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
    public static final Unit AppTopBar$lambda$2$0$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppTopBar$lambda$2$1(boolean z, Composer composer, int i) {
        long m5392copywmQWz5c$default;
        ComposerKt.sourceInformation(composer, "C55@2106L438:AppTopBar.kt#l2omj");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1460554525, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppTopBar.<anonymous>.<anonymous> (AppTopBar.kt:55)");
            }
            ImageVector deleteSweep = DeleteSweepKt.getDeleteSweep(Icons.Rounded.INSTANCE);
            Modifier m977size3ABfNKs = SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(26));
            if (z) {
                composer.startReplaceGroup(861417388);
                ComposerKt.sourceInformation(composer, "60@2388L11");
                m5392copywmQWz5c$default = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(861420693);
                ComposerKt.sourceInformation(composer, "62@2481L11");
                m5392copywmQWz5c$default = Color.m5392copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                composer.endReplaceGroup();
            }
            IconKt.m2553Iconww6aTOc(deleteSweep, "Clear Basket", m977size3ABfNKs, m5392copywmQWz5c$default, composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppTopBar$lambda$1(boolean z, Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:AppTopBar.kt#l2omj");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1393304659, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppTopBar.<anonymous> (AppTopBar.kt:69)");
            }
            if (z) {
                composer.startReplaceGroup(1375193049);
                ComposerKt.sourceInformation(composer, "70@2667L310");
                IconButtonKt.IconButton(function0, null, false, null, null, null, ComposableSingletons$AppTopBarKt.INSTANCE.getLambda$332733772$app_release(), composer, 1572864, 62);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1375521711);
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

    private static final Integer getTitle(NavDestination navDestination) {
        if (navDestination == null) {
            return null;
        }
        Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
        while (it.hasNext()) {
            if (NavDestination.INSTANCE.hasRoute(it.next(), Reflection.getOrCreateKotlinClass(NavRoute.Home.class))) {
                return Integer.valueOf(R.string.top_bar_home_title);
            }
        }
        Iterator<NavDestination> it2 = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
        while (it2.hasNext()) {
            if (NavDestination.INSTANCE.hasRoute(it2.next(), Reflection.getOrCreateKotlinClass(NavRoute.ProductDetails.class))) {
                return Integer.valueOf(R.string.top_bar_product_details_title);
            }
        }
        Iterator<NavDestination> it3 = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
        while (it3.hasNext()) {
            if (NavDestination.INSTANCE.hasRoute(it3.next(), Reflection.getOrCreateKotlinClass(NavRoute.Cart.class))) {
                return Integer.valueOf(R.string.top_bar_cart_title);
            }
        }
        Iterator<NavDestination> it4 = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
        while (it4.hasNext()) {
            if (NavDestination.INSTANCE.hasRoute(it4.next(), Reflection.getOrCreateKotlinClass(NavRoute.Checkout.class))) {
                return Integer.valueOf(R.string.top_bar_checkout_title);
            }
        }
        Iterator<NavDestination> it5 = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
        while (it5.hasNext()) {
            if (NavDestination.INSTANCE.hasRoute(it5.next(), Reflection.getOrCreateKotlinClass(NavRoute.Orders.class))) {
                return Integer.valueOf(R.string.top_bar_orders_title);
            }
        }
        Iterator<NavDestination> it6 = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
        while (it6.hasNext()) {
            if (NavDestination.INSTANCE.hasRoute(it6.next(), Reflection.getOrCreateKotlinClass(NavRoute.Settings.class))) {
                return Integer.valueOf(R.string.top_bar_settings_title);
            }
        }
        return null;
    }
}
