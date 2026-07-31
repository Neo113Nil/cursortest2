package gbcorp.c312.merkmarker.info.ui.composable.approot;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.HistoryKt;
import androidx.compose.material.icons.rounded.SettingsKt;
import androidx.compose.material.icons.rounded.ShoppingBasketKt;
import androidx.compose.material.icons.rounded.StorefrontKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigator;
import androidx.navigation.PopUpToBuilder;
import androidx.navigation.compose.NavHostControllerKt;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.ui.composable.navigation.AppNavHostKt;
import gbcorp.c312.merkmarker.info.ui.composable.navigation.NavRoute;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRAppViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.compose.KoinApplicationKt;
import org.koin.viewmodel.CreationExtrasExtKt;
import org.koin.viewmodel.GetViewModelKt;

/* compiled from: AppRoot.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001ao\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0018H\u0003¢\u0006\u0002\u0010\u001c\u001a\"\u0010\u001d\u001a\u00020\u0014*\u0004\u0018\u00010\u00102\u0014\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0001\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\u0010\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0!X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010$X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"navigationItems", "", "Lgbcorp/c312/merkmarker/info/ui/composable/approot/BottomNavItem;", "topBarHiddenScreens", "Lkotlin/reflect/KClass;", "Lgbcorp/c312/merkmarker/info/ui/composable/navigation/NavRoute;", "bottomBarHiddenScreens", "AppRoot", "", "viewModel", "Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRAppViewModel;", "(Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRAppViewModel;Landroidx/compose/runtime/Composer;II)V", "AppRootContent", "navController", "Landroidx/navigation/NavHostController;", "currentDestination", "Landroidx/navigation/NavDestination;", "itemsInCart", "", "isCartNotEmpty", "", "shouldShowTopBar", "shouldShowBottomBar", "onClearCartIconClick", "Lkotlin/Function0;", "onNavigateToRoute", "Lkotlin/Function1;", "onNavigateBack", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavDestination;IZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "matchesAnyRoute", "routes", "app_release", "cartPopulatedState", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "itemsInCartState", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "shouldShowClearCartDialog"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppRootKt {
    private static final List<BottomNavItem> navigationItems = CollectionsKt.listOf((Object[]) new BottomNavItem[]{new BottomNavItem(R.string.bottom_bar_nav_item_home_title, StorefrontKt.getStorefront(Icons.Rounded.INSTANCE), NavRoute.Home.INSTANCE), new BottomNavItem(R.string.bottom_bar_nav_item_cart_title, ShoppingBasketKt.getShoppingBasket(Icons.Rounded.INSTANCE), NavRoute.Cart.INSTANCE), new BottomNavItem(R.string.bottom_bar_nav_item_orders_title, HistoryKt.getHistory(Icons.Rounded.INSTANCE), NavRoute.Orders.INSTANCE), new BottomNavItem(R.string.bottom_bar_nav_item_settings_title, SettingsKt.getSettings(Icons.Rounded.INSTANCE), NavRoute.Settings.INSTANCE)});
    private static final List<KClass<? extends NavRoute>> topBarHiddenScreens = CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(NavRoute.Splash.class), Reflection.getOrCreateKotlinClass(NavRoute.Onboarding.class), Reflection.getOrCreateKotlinClass(NavRoute.GTSLYPrepScreen.class), Reflection.getOrCreateKotlinClass(NavRoute.GTSLYDetailsScreen.class)});
    private static final List<KClass<? extends NavRoute>> bottomBarHiddenScreens = CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(NavRoute.Splash.class), Reflection.getOrCreateKotlinClass(NavRoute.Onboarding.class), Reflection.getOrCreateKotlinClass(NavRoute.ProductDetails.class), Reflection.getOrCreateKotlinClass(NavRoute.Checkout.class), Reflection.getOrCreateKotlinClass(NavRoute.GTSLYPrepScreen.class), Reflection.getOrCreateKotlinClass(NavRoute.GTSLYDetailsScreen.class)});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRoot$lambda$11(MRKMRAppViewModel mRKMRAppViewModel, int i, int i2, Composer composer, int i3) {
        AppRoot(mRKMRAppViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRootContent$lambda$3(NavHostController navHostController, NavDestination navDestination, int i, boolean z, boolean z2, boolean z3, Function0 function0, Function1 function1, Function0 function02, int i2, Composer composer, int i3) {
        AppRootContent(navHostController, navDestination, i, z, z2, z3, function0, function1, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if ((r24 & 1) != 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppRoot(MRKMRAppViewModel mRKMRAppViewModel, Composer composer, final int i, final int i2) {
        MRKMRAppViewModel mRKMRAppViewModel2;
        int i3;
        final MRKMRAppViewModel mRKMRAppViewModel3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(904479907);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppRoot)N(viewModel)74@2809L16,75@2881L16,77@2923L23,78@2987L30,81@3113L34,86@3352L236,103@3940L36,105@4050L32,96@3594L494:AppRoot.kt#l2omj");
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                mRKMRAppViewModel2 = mRKMRAppViewModel;
                if (startRestartGroup.changedInstance(mRKMRAppViewModel2)) {
                    i4 = 4;
                    i3 = i4 | i;
                }
            } else {
                mRKMRAppViewModel2 = mRKMRAppViewModel;
            }
            i4 = 2;
            i3 = i4 | i;
        } else {
            mRKMRAppViewModel2 = mRKMRAppViewModel;
            i3 = i;
        }
        if (startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "72@2730L15");
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1614864554, "CC(koinViewModel)N(qualifier,viewModelStoreOwner,key,extras,scope,parameters)43@1516L7,46@1711L18:ViewModel.kt#m7on9k");
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(MRKMRAppViewModel.class), current.getViewModelStore(), null, CreationExtrasExtKt.defaultExtras(current), null, KoinApplicationKt.currentKoinScope(startRestartGroup, 0), null);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    mRKMRAppViewModel2 = (MRKMRAppViewModel) resolveViewModel;
                    i3 &= -15;
                }
                mRKMRAppViewModel3 = mRKMRAppViewModel2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(904479907, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppRoot (AppRoot.kt:73)");
                }
                State collectAsState = SnapshotStateKt.collectAsState(mRKMRAppViewModel3.getCartPopulatedState(), null, startRestartGroup, 0, 1);
                State collectAsState2 = SnapshotStateKt.collectAsState(mRKMRAppViewModel3.getItemsInCartState(), null, startRestartGroup, 0, 1);
                final NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], startRestartGroup, 0);
                NavBackStackEntry AppRoot$lambda$2 = AppRoot$lambda$2(NavHostControllerKt.currentBackStackEntryAsState(rememberNavController, startRestartGroup, 0));
                NavDestination destination = AppRoot$lambda$2 != null ? AppRoot$lambda$2.getDestination() : null;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1621810661, "CC(remember):AppRoot.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final MutableState mutableState = (MutableState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                boolean z = !matchesAnyRoute(destination, bottomBarHiddenScreens);
                boolean z2 = !matchesAnyRoute(destination, topBarHiddenScreens);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1621818511, "CC(remember):AppRoot.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(rememberNavController);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit AppRoot$lambda$6$0;
                            AppRoot$lambda$6$0 = AppRootKt.AppRoot$lambda$6$0(NavHostController.this, (BottomNavItem) obj);
                            return AppRoot$lambda$6$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                Function1 function1 = (Function1) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int AppRoot$lambda$1 = AppRoot$lambda$1(collectAsState2);
                boolean z3 = AppRoot$lambda$0(collectAsState) instanceof MRKMRDataUiState.Populated;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1621837127, "CC(remember):AppRoot.kt#9igjgp");
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit AppRoot$lambda$7$0;
                            AppRoot$lambda$7$0 = AppRootKt.AppRoot$lambda$7$0(MutableState.this);
                            return AppRoot$lambda$7$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                Function0 function0 = (Function0) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1621840643, "CC(remember):AppRoot.kt#9igjgp");
                boolean changedInstance2 = startRestartGroup.changedInstance(rememberNavController);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit AppRoot$lambda$8$0;
                            AppRoot$lambda$8$0 = AppRootKt.AppRoot$lambda$8$0(NavHostController.this);
                            return AppRoot$lambda$8$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AppRootContent(rememberNavController, destination, AppRoot$lambda$1, z3, z2, z, function0, function1, (Function0) rememberedValue4, startRestartGroup, 1572864);
                if (AppRoot$lambda$4(mutableState)) {
                    startRestartGroup.startReplaceGroup(-1262466986);
                    ComposerKt.sourceInformation(startRestartGroup, "111@4239L103,110@4176L37,109@4135L217");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1621846762, "CC(remember):AppRoot.kt#9igjgp");
                    boolean changedInstance3 = startRestartGroup.changedInstance(mRKMRAppViewModel3);
                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit AppRoot$lambda$9$0;
                                AppRoot$lambda$9$0 = AppRootKt.AppRoot$lambda$9$0(MRKMRAppViewModel.this, mutableState);
                                return AppRoot$lambda$9$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function02 = (Function0) rememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1621844680, "CC(remember):AppRoot.kt#9igjgp");
                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit AppRoot$lambda$10$0;
                                AppRoot$lambda$10$0 = AppRootKt.AppRoot$lambda$10$0(MutableState.this);
                                return AppRoot$lambda$10$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ClearCartDialogKt.ClearCartDialog(null, function02, (Function0) rememberedValue6, startRestartGroup, 384, 1);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1262243073);
                    startRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            mRKMRAppViewModel3 = mRKMRAppViewModel2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppRoot$lambda$11;
                    AppRoot$lambda$11 = AppRootKt.AppRoot$lambda$11(MRKMRAppViewModel.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AppRoot$lambda$11;
                }
            });
        }
    }

    private static final boolean AppRoot$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void AppRoot$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRoot$lambda$6$0(NavHostController navHostController, BottomNavItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        navHostController.navigate((NavHostController) item.getRoute(), new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppRoot$lambda$6$0$0;
                AppRoot$lambda$6$0$0 = AppRootKt.AppRoot$lambda$6$0$0((NavOptionsBuilder) obj);
                return AppRoot$lambda$6$0$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRoot$lambda$6$0$0(NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.popUpTo((NavOptionsBuilder) NavRoute.Home.INSTANCE, new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppRoot$lambda$6$0$0$0;
                AppRoot$lambda$6$0$0$0 = AppRootKt.AppRoot$lambda$6$0$0$0((PopUpToBuilder) obj);
                return AppRoot$lambda$6$0$0$0;
            }
        });
        navigate.setLaunchSingleTop(true);
        navigate.setRestoreState(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRoot$lambda$6$0$0$0(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setSaveState(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRoot$lambda$7$0(MutableState mutableState) {
        AppRoot$lambda$5(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRoot$lambda$8$0(NavHostController navHostController) {
        navHostController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRoot$lambda$10$0(MutableState mutableState) {
        AppRoot$lambda$5(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRoot$lambda$9$0(MRKMRAppViewModel mRKMRAppViewModel, MutableState mutableState) {
        mRKMRAppViewModel.clearCart();
        AppRoot$lambda$5(mutableState, false);
        return Unit.INSTANCE;
    }

    private static final void AppRootContent(final NavHostController navHostController, final NavDestination navDestination, final int i, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> function0, final Function1<? super BottomNavItem, Unit> function1, final Function0<Unit> function02, Composer composer, final int i2) {
        int i3;
        final boolean z4;
        boolean z5;
        Function0<Unit> function03;
        Function0<Unit> function04;
        Composer composer2;
        final NavDestination navDestination2 = navDestination;
        Composer startRestartGroup = composer.startRestartGroup(-1507854290);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppRootContent)N(navController,currentDestination,itemsInCart,isCartNotEmpty,shouldShowTopBar,shouldShowBottomBar,onClearCartIconClick,onNavigateToRoute,onNavigateBack)132@4750L338,143@5111L334,153@5486L11,154@5516L201,131@4723L994:AppRoot.kt#l2omj");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(navHostController) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(navDestination2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            z4 = z;
            i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
        } else {
            z4 = z;
        }
        if ((i2 & 24576) == 0) {
            z5 = z2;
            i3 |= startRestartGroup.changed(z5) ? 16384 : 8192;
        } else {
            z5 = z2;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            function03 = function0;
            i3 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        } else {
            function03 = function0;
        }
        if ((12582912 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            function04 = function02;
            i3 |= startRestartGroup.changedInstance(function04) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            function04 = function02;
        }
        if (!startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1507854290, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootContent (AppRoot.kt:130)");
            }
            final boolean z6 = z5;
            final Function0<Unit> function05 = function03;
            final Function0<Unit> function06 = function04;
            navDestination2 = navDestination;
            composer2 = startRestartGroup;
            ScaffoldKt.m2876ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(545167082, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppRootContent$lambda$0;
                    AppRootContent$lambda$0 = AppRootKt.AppRootContent$lambda$0(z6, navDestination, z4, function05, function06, (Composer) obj, ((Integer) obj2).intValue());
                    return AppRootContent$lambda$0;
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1495508023, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppRootContent$lambda$1;
                    AppRootContent$lambda$1 = AppRootKt.AppRootContent$lambda$1(z3, i, navDestination2, function1, (Composer) obj, ((Integer) obj2).intValue());
                    return AppRootContent$lambda$1;
                }
            }, startRestartGroup, 54), null, null, 0, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getBackground(), 0L, null, ComposableLambdaKt.rememberComposableLambda(1520807871, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit AppRootContent$lambda$2;
                    AppRootContent$lambda$2 = AppRootKt.AppRootContent$lambda$2(NavHostController.this, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return AppRootContent$lambda$2;
                }
            }, startRestartGroup, 54), composer2, 805306800, 441);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppRootContent$lambda$3;
                    AppRootContent$lambda$3 = AppRootKt.AppRootContent$lambda$3(NavHostController.this, navDestination2, i, z, z2, z3, function0, function1, function02, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AppRootContent$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppRootContent$lambda$0(boolean z, NavDestination navDestination, boolean z2, Function0 function0, Function0 function02, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:AppRoot.kt#l2omj");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(545167082, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootContent.<anonymous> (AppRoot.kt:133)");
            }
            if (z) {
                composer.startReplaceGroup(1801238452);
                ComposerKt.sourceInformation(composer, "134@4804L260");
                AppTopBarKt.AppTopBar(navDestination, z2, function0, function02, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1801519064);
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
    public static final Unit AppRootContent$lambda$1(boolean z, int i, NavDestination navDestination, Function1 function1, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C:AppRoot.kt#l2omj");
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1495508023, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootContent.<anonymous> (AppRoot.kt:144)");
            }
            if (z) {
                composer.startReplaceGroup(-983704260);
                ComposerKt.sourceInformation(composer, "145@5168L253");
                AppBottomBarKt.AppBottomBar(i, navDestination, navigationItems, function1, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-983430375);
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
    public static final Unit AppRootContent$lambda$2(NavHostController navHostController, PaddingValues paddingValues, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation(composer, "CN(paddingValues)155@5543L168:AppRoot.kt#l2omj");
        if ((i & 6) == 0) {
            i |= composer.changed(paddingValues) ? 4 : 2;
        }
        if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1520807871, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.AppRootContent.<anonymous> (AppRoot.kt:155)");
            }
            AppNavHostKt.AppNavHost(navHostController, PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean matchesAnyRoute(NavDestination navDestination, List<? extends KClass<? extends NavRoute>> routes) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        if (navDestination != null) {
            List<? extends KClass<? extends NavRoute>> list = routes;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (NavDestination.INSTANCE.hasRoute(navDestination, (KClass) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final MRKMRDataUiState<Unit> AppRoot$lambda$0(State<? extends MRKMRDataUiState<Unit>> state) {
        return state.getValue();
    }

    private static final int AppRoot$lambda$1(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final NavBackStackEntry AppRoot$lambda$2(State<NavBackStackEntry> state) {
        return state.getValue();
    }
}
