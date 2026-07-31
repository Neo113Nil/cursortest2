package gbcorp.c312.merkmarker.info.ui.composable.screen.cart;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.ShoppingBasketKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonDefaults;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import coil3.compose.SingletonAsyncImageKt;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.ui.composable.shared.MRKMRContentWrapperKt;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRCartItemUiState;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCartViewModel;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.compose.KoinApplicationKt;
import org.koin.viewmodel.CreationExtrasExtKt;
import org.koin.viewmodel.GetViewModelKt;

/* compiled from: MRKMRCartScreen.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001ai\u0010\t\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0015\u001a1\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b²\u0006\u0016\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"CartScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRCartViewModel;", "onNavigateToCheckoutScreen", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRCartViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CartScreenContent", "cartItemsState", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRCartItemUiState;", "totalPrice", "", "onPlusItemClick", "Lkotlin/Function1;", "", "onMinusItemClick", "onCompleteOrderButtonClick", "(Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;Landroidx/compose/ui/Modifier;DLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CartItemRow", "item", "onPlus", "onMinus", "(Lgbcorp/c312/merkmarker/info/ui/state/MRKMRCartItemUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRCartScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CartItemRow$lambda$1(MRKMRCartItemUiState mRKMRCartItemUiState, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        CartItemRow(mRKMRCartItemUiState, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CartScreen$lambda$4(Modifier modifier, MRKMRCartViewModel mRKMRCartViewModel, Function0 function0, int i, int i2, Composer composer, int i3) {
        CartScreen(modifier, mRKMRCartViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CartScreenContent$lambda$1(MRKMRDataUiState mRKMRDataUiState, Modifier modifier, double d, Function1 function1, Function1 function12, Function0 function0, int i, int i2, Composer composer, int i3) {
        CartScreenContent(mRKMRDataUiState, modifier, d, function1, function12, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CartScreen(Modifier modifier, MRKMRCartViewModel mRKMRCartViewModel, final Function0<Unit> onNavigateToCheckoutScreen, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        MRKMRCartViewModel mRKMRCartViewModel2;
        final Modifier.Companion companion;
        final MRKMRCartViewModel mRKMRCartViewModel3;
        final MRKMRCartViewModel mRKMRCartViewModel4;
        boolean changedInstance;
        Object rememberedValue;
        boolean changedInstance2;
        Object rememberedValue2;
        int i4;
        Intrinsics.checkNotNullParameter(onNavigateToCheckoutScreen, "onNavigateToCheckoutScreen");
        Composer startRestartGroup = composer.startRestartGroup(470126717);
        ComposerKt.sourceInformation(startRestartGroup, "C(CartScreen)N(modifier,viewModel,onNavigateToCheckoutScreen)54@2480L29,55@2553L29,57@2610L71,61@2710L68,65@2784L280:MRKMRCartScreen.kt#70tc7e");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                mRKMRCartViewModel2 = mRKMRCartViewModel;
                if (startRestartGroup.changedInstance(mRKMRCartViewModel2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                mRKMRCartViewModel2 = mRKMRCartViewModel;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            mRKMRCartViewModel2 = mRKMRCartViewModel;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onNavigateToCheckoutScreen) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "51@2364L15");
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                companion = modifier2;
            } else {
                companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -924953623, "CC(koinViewModel)N(qualifier,viewModelStoreOwner,key,extras,scope,parameters)48@1587L7,51@1782L18:ViewModel.kt#7bazx");
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(MRKMRCartViewModel.class), current.getViewModelStore(), null, CreationExtrasExtKt.defaultExtras(current), null, KoinApplicationKt.currentKoinScope(startRestartGroup, 0), null);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    mRKMRCartViewModel4 = (MRKMRCartViewModel) resolveViewModel;
                    i3 &= -113;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(470126717, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.cart.CartScreen (MRKMRCartScreen.kt:53)");
                    }
                    State collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(mRKMRCartViewModel4.getCartItemsState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
                    State collectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(mRKMRCartViewModel4.getTotalPrice(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 820219684, "CC(remember):MRKMRCartScreen.kt#9igjgp");
                    changedInstance = startRestartGroup.changedInstance(mRKMRCartViewModel4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit CartScreen$lambda$2$0;
                                CartScreen$lambda$2$0 = MRKMRCartScreenKt.CartScreen$lambda$2$0(MRKMRCartViewModel.this, ((Integer) obj).intValue());
                                return CartScreen$lambda$2$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 820222881, "CC(remember):MRKMRCartScreen.kt#9igjgp");
                    changedInstance2 = startRestartGroup.changedInstance(mRKMRCartViewModel4);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit CartScreen$lambda$3$0;
                                CartScreen$lambda$3$0 = MRKMRCartScreenKt.CartScreen$lambda$3$0(MRKMRCartViewModel.this, ((Integer) obj).intValue());
                                return CartScreen$lambda$3$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    MRKMRCartViewModel mRKMRCartViewModel5 = mRKMRCartViewModel4;
                    CartScreenContent(CartScreen$lambda$0(collectAsStateWithLifecycle), companion, CartScreen$lambda$1(collectAsStateWithLifecycle2), function1, (Function1) rememberedValue2, onNavigateToCheckoutScreen, startRestartGroup, ((i3 << 9) & 458752) | ((i3 << 3) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mRKMRCartViewModel3 = mRKMRCartViewModel5;
                }
            }
            mRKMRCartViewModel4 = mRKMRCartViewModel2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            State collectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(mRKMRCartViewModel4.getCartItemsState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
            State collectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(mRKMRCartViewModel4.getTotalPrice(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 820219684, "CC(remember):MRKMRCartScreen.kt#9igjgp");
            changedInstance = startRestartGroup.changedInstance(mRKMRCartViewModel4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit CartScreen$lambda$2$0;
                    CartScreen$lambda$2$0 = MRKMRCartScreenKt.CartScreen$lambda$2$0(MRKMRCartViewModel.this, ((Integer) obj).intValue());
                    return CartScreen$lambda$2$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            Function1 function12 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 820222881, "CC(remember):MRKMRCartScreen.kt#9igjgp");
            changedInstance2 = startRestartGroup.changedInstance(mRKMRCartViewModel4);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue2 = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit CartScreen$lambda$3$0;
                    CartScreen$lambda$3$0 = MRKMRCartScreenKt.CartScreen$lambda$3$0(MRKMRCartViewModel.this, ((Integer) obj).intValue());
                    return CartScreen$lambda$3$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MRKMRCartViewModel mRKMRCartViewModel52 = mRKMRCartViewModel4;
            CartScreenContent(CartScreen$lambda$0(collectAsStateWithLifecycle3), companion, CartScreen$lambda$1(collectAsStateWithLifecycle22), function12, (Function1) rememberedValue2, onNavigateToCheckoutScreen, startRestartGroup, ((i3 << 9) & 458752) | ((i3 << 3) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            mRKMRCartViewModel3 = mRKMRCartViewModel52;
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            mRKMRCartViewModel3 = mRKMRCartViewModel2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CartScreen$lambda$4;
                    CartScreen$lambda$4 = MRKMRCartScreenKt.CartScreen$lambda$4(Modifier.this, mRKMRCartViewModel3, onNavigateToCheckoutScreen, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CartScreen$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CartScreen$lambda$2$0(MRKMRCartViewModel mRKMRCartViewModel, int i) {
        mRKMRCartViewModel.incrementProductInCart(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CartScreen$lambda$3$0(MRKMRCartViewModel mRKMRCartViewModel, int i) {
        mRKMRCartViewModel.decrementItemInCart(i);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CartScreenContent(final MRKMRDataUiState<? extends List<MRKMRCartItemUiState>> mRKMRDataUiState, Modifier modifier, final double d, final Function1<? super Integer, Unit> function1, final Function1<? super Integer, Unit> function12, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        double d2;
        Function1<? super Integer, Unit> function13;
        Function1<? super Integer, Unit> function14;
        Function0<Unit> function02;
        final Modifier.Companion companion;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1132741784);
        ComposerKt.sourceInformation(startRestartGroup, "C(CartScreenContent)N(cartItemsState,modifier,totalPrice,onPlusItemClick,onMinusItemClick,onCompleteOrderButtonClick)84@3427L11,84@3361L3891:MRKMRCartScreen.kt#70tc7e");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(mRKMRDataUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                d2 = d;
                i3 |= startRestartGroup.changed(d2) ? 256 : 128;
            } else {
                d2 = d;
            }
            if ((i & 3072) != 0) {
                function13 = function1;
                i3 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
            } else {
                function13 = function1;
            }
            if ((i & 24576) != 0) {
                function14 = function12;
                i3 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
            } else {
                function14 = function12;
            }
            if ((196608 & i) != 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
            } else {
                function02 = function0;
            }
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            } else {
                companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1132741784, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.cart.CartScreenContent (MRKMRCartScreen.kt:83)");
                }
                Modifier m300backgroundbw27NRU$default = BackgroundKt.m300backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getBackground(), null, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m300backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = i3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4643constructorimpl = Updater.m4643constructorimpl(startRestartGroup);
                Updater.m4651setimpl(m4643constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m4647initimpl(m4643constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m4649reconcileimpl(m4643constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1990520403, "C88@3552L3446,85@3462L3784:MRKMRCartScreen.kt#70tc7e");
                final double d3 = d2;
                final Function1<? super Integer, Unit> function15 = function13;
                final Function1<? super Integer, Unit> function16 = function14;
                final Function0<Unit> function03 = function02;
                MRKMRContentWrapperKt.MRKMRContentWrapper(null, mRKMRDataUiState, ComposableLambdaKt.rememberComposableLambda(-861904922, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CartScreenContent$lambda$0$0;
                        CartScreenContent$lambda$0$0 = MRKMRCartScreenKt.CartScreenContent$lambda$0$0(MRKMRDataUiState.this, function15, function16, function03, d3, (Composer) obj, ((Integer) obj2).intValue());
                        return CartScreenContent$lambda$0$0;
                    }
                }, startRestartGroup, 54), ComposableSingletons$MRKMRCartScreenKt.INSTANCE.m9533getLambda$88862971$app_release(), null, startRestartGroup, ((i5 << 3) & 112) | 3456, 17);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CartScreenContent$lambda$1;
                        CartScreenContent$lambda$1 = MRKMRCartScreenKt.CartScreenContent$lambda$1(MRKMRDataUiState.this, companion, d, function1, function12, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return CartScreenContent$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CartScreenContent$lambda$0$0(MRKMRDataUiState mRKMRDataUiState, final Function1 function1, final Function1 function12, Function0 function0, final double d, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C91@3651L3333:MRKMRCartScreen.kt#70tc7e");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-861904922, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.cart.CartScreenContent.<anonymous>.<anonymous> (MRKMRCartScreen.kt:89)");
            }
            Intrinsics.checkNotNull(mRKMRDataUiState, "null cannot be cast to non-null type gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState.Populated<kotlin.collections.List<gbcorp.c312.merkmarker.info.ui.state.MRKMRCartItemUiState>>");
            final List list = (List) ((MRKMRDataUiState.Populated) mRKMRDataUiState).getData();
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m4643constructorimpl = Updater.m4643constructorimpl(composer);
            Updater.m4651setimpl(m4643constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -760280000, "C97@3983L370,92@3715L638,111@4569L11,108@4419L2547:MRKMRCartScreen.kt#70tc7e");
            float f = 16;
            Modifier m930paddingVpY3zN4 = PaddingKt.m930paddingVpY3zN4(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m8227constructorimpl(f), Dp.m8227constructorimpl(8));
            Arrangement.HorizontalOrVertical m784spacedBy0680j_4 = Arrangement.INSTANCE.m784spacedBy0680j_4(Dp.m8227constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart(composer, 391122530, "CC(remember):MRKMRCartScreen.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(list) | composer.changed(function1) | composer.changed(function12);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit CartScreenContent$lambda$0$0$0$0$0;
                        CartScreenContent$lambda$0$0$0$0$0 = MRKMRCartScreenKt.CartScreenContent$lambda$0$0$0$0$0(list, function1, function12, (LazyListScope) obj);
                        return CartScreenContent$lambda$0$0$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyColumn(m930paddingVpY3zN4, null, null, false, m784spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer, 24576, 494);
            Modifier m929padding3ABfNKs = PaddingKt.m929padding3ABfNKs(BackgroundKt.m300backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), null, 2, null), Dp.m8227constructorimpl(22));
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m929padding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m4643constructorimpl2 = Updater.m4643constructorimpl(composer);
            Updater.m4651setimpl(m4643constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl2, Integer.valueOf(hashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1299682260, "C114@4683L907,132@5615L41,140@6091L11,141@6173L11,139@6014L211,143@6253L691,133@5681L1263:MRKMRCartScreen.kt#70tc7e");
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m4643constructorimpl3 = Updater.m4643constructorimpl(composer);
            Updater.m4651setimpl(m4643constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl3, Integer.valueOf(hashCode3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1997080621, "C121@5077L11,119@4962L279,127@5397L11,125@5270L294:MRKMRCartScreen.kt#70tc7e");
            TextKt.m3259TextNvy7gAk("Basket Total", null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), null, TextUnitKt.getSp(18), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597446, 0, 262058);
            String format = String.format("£%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            TextKt.m3259TextNvy7gAk(format, null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), null, TextUnitKt.getSp(20), null, FontWeight.INSTANCE.getExtraBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597440, 0, 262058);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f)), composer, 6);
            ButtonKt.Button(function0, SizeKt.m963height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(54)), false, RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(f)), ButtonDefaults.INSTANCE.m2064buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 12), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1236055414, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit CartScreenContent$lambda$0$0$0$1$1;
                    CartScreenContent$lambda$0$0$0$1$1 = MRKMRCartScreenKt.CartScreenContent$lambda$0$0$0$1$1(d, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return CartScreenContent$lambda$0$0$0$1$1;
                }
            }, composer, 54), composer, 805306416, 484);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CartScreenContent$lambda$0$0$0$1$1(double d, RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C144@6283L235,149@6547L39,151@6660L61,150@6615L303:MRKMRCartScreen.kt#70tc7e");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1236055414, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.cart.CartScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MRKMRCartScreen.kt:144)");
            }
            IconKt.m2553Iconww6aTOc(ShoppingBasketKt.getShoppingBasket(Icons.Rounded.INSTANCE), (String) null, SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(20)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m982width3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(8)), composer, 6);
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(R.string.button_place_order_label, new Object[]{Double.valueOf(d)}, composer, 0), null, 0L, null, TextUnitKt.getSp(15), null, FontWeight.INSTANCE.getBold(), null, TextUnitKt.getSp(1), null, null, 0L, 0, false, 0, 0, null, null, composer, 102260736, 0, 261806);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CartItemRow(final MRKMRCartItemUiState mRKMRCartItemUiState, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1653897085);
        ComposerKt.sourceInformation(startRestartGroup, "C(CartItemRow)N(item,onPlus,onMinus)180@7489L3049,177@7382L3156:MRKMRCartScreen.kt#70tc7e");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(mRKMRCartItemUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1653897085, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.cart.CartItemRow (MRKMRCartScreen.kt:176)");
            }
            CardKt.ElevatedCard(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(20)), null, null, ComposableLambdaKt.rememberComposableLambda(-930196354, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit CartItemRow$lambda$0;
                    CartItemRow$lambda$0 = MRKMRCartScreenKt.CartItemRow$lambda$0(MRKMRCartItemUiState.this, function02, function0, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return CartItemRow$lambda$0;
                }
            }, startRestartGroup, 54), startRestartGroup, 24582, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CartItemRow$lambda$1;
                    CartItemRow$lambda$1 = MRKMRCartScreenKt.CartItemRow$lambda$1(MRKMRCartItemUiState.this, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CartItemRow$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CartItemRow$lambda$0(MRKMRCartItemUiState mRKMRCartItemUiState, Function0 function0, Function0 function02, ColumnScope ElevatedCard, Composer composer, int i) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(ElevatedCard, "$this$ElevatedCard");
        ComposerKt.sourceInformation(composer2, "C181@7499L3033:MRKMRCartScreen.kt#70tc7e");
        if (composer2.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-930196354, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.cart.CartItemRow.<anonymous> (MRKMRCartScreen.kt:181)");
            }
            float f = 14;
            Modifier m929padding3ABfNKs = PaddingKt.m929padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(f));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m929padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m4643constructorimpl = Updater.m4643constructorimpl(composer2);
            Updater.m4651setimpl(m4643constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -214276692, "C199@8142L607,215@8763L1759:MRKMRCartScreen.kt#70tc7e");
            String productImageUrl = mRKMRCartItemUiState.getProductImageUrl();
            if (productImageUrl == null) {
                composer2.startReplaceGroup(-214329766);
                composer2.endReplaceGroup();
                str2 = "C101@5233L9:Row.kt#2w3rfo";
                str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                i2 = 14;
                z = 6;
                str3 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
                str4 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
            } else {
                composer2.startReplaceGroup(-214329765);
                ComposerKt.sourceInformation(composer2, "*188@7741L316,196@8074L40");
                z = 6;
                str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                str2 = "C101@5233L9:Row.kt#2w3rfo";
                str3 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
                str4 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
                i2 = 14;
                SingletonAsyncImageKt.m9152AsyncImage10Xjiaw(productImageUrl, mRKMRCartItemUiState.getProductTitle(), ClipKt.clip(SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(72)), RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(f))), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, composer, 1572864, 0, 1976);
                composer2 = composer;
                SpacerKt.Spacer(SizeKt.m982width3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f)), composer2, 6);
                Unit unit = Unit.INSTANCE;
                composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            String str5 = str4;
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, str5);
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            String str6 = str;
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, str6);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m4643constructorimpl2 = Updater.m4643constructorimpl(composer2);
            Updater.m4651setimpl(m4643constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl2, Integer.valueOf(hashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 48675795, "C202@8293L11,200@8199L222,206@8438L40,209@8605L11,207@8495L240:MRKMRCartScreen.kt#70tc7e");
            TextKt.m3259TextNvy7gAk(mRKMRCartItemUiState.getProductTitle(), null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), null, TextUnitKt.getSp(15), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597440, 0, 262058);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(2)), composer, 6);
            String format = String.format("£%.2f", Arrays.copyOf(new Object[]{Double.valueOf(mRKMRCartItemUiState.getProductPrice())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            TextKt.m3259TextNvy7gAk(format, null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), null, TextUnitKt.getSp(i2), null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597440, 0, 262058);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, str3);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, str5);
            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, str6);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m4643constructorimpl3 = Updater.m4643constructorimpl(composer);
            Updater.m4651setimpl(m4643constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl3, Integer.valueOf(hashCode3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, str2);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -2125743919, "C222@9089L11,223@9170L11,221@9016L201,218@8864L663,234@9645L11,232@9544L298,243@10083L11,244@10157L11,242@10010L191,239@9859L649:MRKMRCartScreen.kt#70tc7e");
            float f2 = 32;
            IconButtonKt.IconButton(function0, SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f2)), false, IconButtonDefaults.INSTANCE.m2525iconButtonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnBackground(), 0L, 0L, composer, IconButtonDefaults.$stable << 12, 12), null, null, ComposableSingletons$MRKMRCartScreenKt.INSTANCE.getLambda$1357842788$app_release(), composer, 1572912, 52);
            TextKt.m3259TextNvy7gAk(String.valueOf(mRKMRCartItemUiState.getQuantity()), PaddingKt.m931paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8227constructorimpl(12), 0.0f, 2, null), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), null, TextUnitKt.getSp(15), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597488, 0, 262056);
            IconButtonKt.IconButton(function02, SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f2)), false, IconButtonDefaults.INSTANCE.m2525iconButtonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary(), 0L, 0L, composer, IconButtonDefaults.$stable << 12, 12), null, null, ComposableSingletons$MRKMRCartScreenKt.INSTANCE.getLambda$1468090395$app_release(), composer, 1572912, 52);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final MRKMRDataUiState<List<MRKMRCartItemUiState>> CartScreen$lambda$0(State<? extends MRKMRDataUiState<? extends List<MRKMRCartItemUiState>>> state) {
        return (MRKMRDataUiState) state.getValue();
    }

    private static final double CartScreen$lambda$1(State<Double> state) {
        return state.getValue().doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CartScreenContent$lambda$0$0$0$0$0(final List list, final Function1 function1, final Function1 function12, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final MRKMRCartScreenKt$CartScreenContent$lambda$0$0$0$0$0$$inlined$items$default$1 mRKMRCartScreenKt$CartScreenContent$lambda$0$0$0$0$0$$inlined$items$default$1 = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$CartScreenContent$lambda$0$0$0$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(MRKMRCartItemUiState mRKMRCartItemUiState) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((MRKMRCartItemUiState) obj);
            }
        };
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$CartScreenContent$lambda$0$0$0$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$CartScreenContent$lambda$0$0$0$0$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final MRKMRCartItemUiState mRKMRCartItemUiState = (MRKMRCartItemUiState) list.get(i);
                composer.startReplaceGroup(-435175836);
                ComposerKt.sourceInformation(composer, "CN(item)*101@4159L35,102@4238L36,99@4060L245:MRKMRCartScreen.kt#70tc7e");
                ComposerKt.sourceInformationMarkerStart(composer, 1371438349, "CC(remember):MRKMRCartScreen.kt#9igjgp");
                boolean changed = composer.changed(function1) | composer.changed(mRKMRCartItemUiState);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function13 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$CartScreenContent$1$1$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function13.invoke(Integer.valueOf(mRKMRCartItemUiState.getProductId()));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 1371440878, "CC(remember):MRKMRCartScreen.kt#9igjgp");
                boolean changed2 = composer.changed(function12) | composer.changed(mRKMRCartItemUiState);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final Function1 function14 = function12;
                    rememberedValue2 = (Function0) new Function0<Unit>() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.cart.MRKMRCartScreenKt$CartScreenContent$1$1$1$1$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function14.invoke(Integer.valueOf(mRKMRCartItemUiState.getProductId()));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                MRKMRCartScreenKt.CartItemRow(mRKMRCartItemUiState, function0, (Function0) rememberedValue2, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
