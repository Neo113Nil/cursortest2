package gbcorp.c312.merkmarker.info.ui.composable.screen.home;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.LocalOfferKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.FilterChipDefaults;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import coil3.compose.SingletonAsyncImageKt;
import gbcorp.c312.merkmarker.info.data.model.Product;
import gbcorp.c312.merkmarker.info.data.model.ProductCategory;
import gbcorp.c312.merkmarker.info.ui.composable.shared.MRKMRContentWrapperKt;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import gbcorp.c312.merkmarker.info.ui.theme.ColorKt;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRProductViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import org.koin.compose.KoinApplicationKt;
import org.koin.viewmodel.CreationExtrasExtKt;
import org.koin.viewmodel.GetViewModelKt;

/* compiled from: MRKMRHomeScreen.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\f\u001aq\u0010\r\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0013\u001a/\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u001c\u001a1\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010 H\u0003¢\u0006\u0002\u0010\"¨\u0006#²\u0006\u0016\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002"}, d2 = {"HomeScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRProductViewModel;", "onNavigateToProductDetails", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "productId", "(Landroidx/compose/ui/Modifier;Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRProductViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "HomeContent", "productsState", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "", "Lgbcorp/c312/merkmarker/info/data/model/Product;", "onAddProductToCart", "(Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "HeroCarousel", "products", "onProductClick", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CategoryChipsRow", "selectedCategory", "Lgbcorp/c312/merkmarker/info/data/model/ProductCategory;", "onCategorySelected", "(Lgbcorp/c312/merkmarker/info/data/model/ProductCategory;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ProductCard", "product", "onClick", "Lkotlin/Function0;", "onAddToCart", "(Lgbcorp/c312/merkmarker/info/data/model/Product;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRHomeScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategoryChipsRow$lambda$1(ProductCategory productCategory, Function1 function1, int i, Composer composer, int i2) {
        CategoryChipsRow(productCategory, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeroCarousel$lambda$2(List list, Function1 function1, int i, Composer composer, int i2) {
        HeroCarousel(list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContent$lambda$1(MRKMRDataUiState mRKMRDataUiState, Modifier modifier, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        HomeContent(mRKMRDataUiState, modifier, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$2(Modifier modifier, MRKMRProductViewModel mRKMRProductViewModel, Function1 function1, int i, int i2, Composer composer, int i3) {
        HomeScreen(modifier, mRKMRProductViewModel, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductCard$lambda$2(Product product, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ProductCard(product, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeScreen(Modifier modifier, MRKMRProductViewModel mRKMRProductViewModel, final Function1<? super Integer, Unit> onNavigateToProductDetails, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        MRKMRProductViewModel mRKMRProductViewModel2;
        final Modifier.Companion companion;
        final MRKMRProductViewModel mRKMRProductViewModel3;
        MRKMRProductViewModel mRKMRProductViewModel4;
        boolean changedInstance;
        MRKMRHomeScreenKt$HomeScreen$1$1 rememberedValue;
        int i4;
        Intrinsics.checkNotNullParameter(onNavigateToProductDetails, "onNavigateToProductDetails");
        Composer startRestartGroup = composer.startRestartGroup(539716866);
        ComposerKt.sourceInformation(startRestartGroup, "C(HomeScreen)N(modifier,viewModel,onNavigateToProductDetails)73@3465L16,79@3662L20,75@3487L202:MRKMRHomeScreen.kt#70wte1");
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
                mRKMRProductViewModel2 = mRKMRProductViewModel;
                if (startRestartGroup.changedInstance(mRKMRProductViewModel2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                mRKMRProductViewModel2 = mRKMRProductViewModel;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            mRKMRProductViewModel2 = mRKMRProductViewModel;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onNavigateToProductDetails) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "70@3337L15");
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                companion = modifier2;
            } else {
                companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1614864554, "CC(koinViewModel)N(qualifier,viewModelStoreOwner,key,extras,scope,parameters)43@1516L7,46@1711L18:ViewModel.kt#m7on9k");
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(MRKMRProductViewModel.class), current.getViewModelStore(), null, CreationExtrasExtKt.defaultExtras(current), null, KoinApplicationKt.currentKoinScope(startRestartGroup, 0), null);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    i3 &= -113;
                    mRKMRProductViewModel4 = (MRKMRProductViewModel) resolveViewModel;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(539716866, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.HomeScreen (MRKMRHomeScreen.kt:72)");
                    }
                    MRKMRDataUiState<List<Product>> HomeScreen$lambda$0 = HomeScreen$lambda$0(SnapshotStateKt.collectAsState(mRKMRProductViewModel4.getProductsState(), null, startRestartGroup, 0, 1));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1023121290, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
                    changedInstance = startRestartGroup.changedInstance(mRKMRProductViewModel4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new MRKMRHomeScreenKt$HomeScreen$1$1(mRKMRProductViewModel4);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    HomeContent(HomeScreen$lambda$0, companion, onNavigateToProductDetails, (Function1) ((KFunction) rememberedValue), startRestartGroup, (i3 & 896) | ((i3 << 3) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mRKMRProductViewModel3 = mRKMRProductViewModel4;
                }
            }
            mRKMRProductViewModel4 = mRKMRProductViewModel2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            MRKMRDataUiState<List<Product>> HomeScreen$lambda$02 = HomeScreen$lambda$0(SnapshotStateKt.collectAsState(mRKMRProductViewModel4.getProductsState(), null, startRestartGroup, 0, 1));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1023121290, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
            changedInstance = startRestartGroup.changedInstance(mRKMRProductViewModel4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new MRKMRHomeScreenKt$HomeScreen$1$1(mRKMRProductViewModel4);
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            HomeContent(HomeScreen$lambda$02, companion, onNavigateToProductDetails, (Function1) ((KFunction) rememberedValue), startRestartGroup, (i3 & 896) | ((i3 << 3) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            mRKMRProductViewModel3 = mRKMRProductViewModel4;
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            mRKMRProductViewModel3 = mRKMRProductViewModel2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeScreen$lambda$2;
                    HomeScreen$lambda$2 = MRKMRHomeScreenKt.HomeScreen$lambda$2(Modifier.this, mRKMRProductViewModel3, onNavigateToProductDetails, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeScreen$lambda$2;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void HomeContent(final MRKMRDataUiState<? extends List<Product>> mRKMRDataUiState, Modifier modifier, final Function1<? super Integer, Unit> function1, final Function1<? super Integer, Unit> function12, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(881356496);
        ComposerKt.sourceInformation(startRestartGroup, "C(HomeContent)N(productsState,modifier,onNavigateToProductDetails,onAddProductToCart)90@3933L3056:MRKMRHomeScreen.kt#70wte1");
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
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(881356496, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.HomeContent (MRKMRHomeScreen.kt:89)");
                }
                Modifier m300backgroundbw27NRU$default = BackgroundKt.m300backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ColorKt.getSageLight(), null, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m300backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1728860855, "C94@4096L2635,91@4007L2976:MRKMRHomeScreen.kt#70wte1");
                MRKMRContentWrapperKt.MRKMRContentWrapper(null, mRKMRDataUiState, ComposableLambdaKt.rememberComposableLambda(-214338750, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HomeContent$lambda$0$0;
                        HomeContent$lambda$0$0 = MRKMRHomeScreenKt.HomeContent$lambda$0$0(MRKMRDataUiState.this, function1, function12, (Composer) obj, ((Integer) obj2).intValue());
                        return HomeContent$lambda$0$0;
                    }
                }, startRestartGroup, 54), ComposableSingletons$MRKMRHomeScreenKt.INSTANCE.getLambda$712416003$app_release(), null, startRestartGroup, ((i3 << 3) & 112) | 3456, 17);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HomeContent$lambda$1;
                        HomeContent$lambda$1 = MRKMRHomeScreenKt.HomeContent$lambda$1(MRKMRDataUiState.this, modifier3, function1, function12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return HomeContent$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContent$lambda$0$0(MRKMRDataUiState mRKMRDataUiState, final Function1 function1, final Function1 function12, Composer composer, int i) {
        final List list;
        ComposerKt.sourceInformation(composer, "C97@4221L51,103@4540L2177,103@4494L2223:MRKMRHomeScreen.kt#70wte1");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-214338750, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.HomeContent.<anonymous>.<anonymous> (MRKMRHomeScreen.kt:95)");
            }
            Intrinsics.checkNotNull(mRKMRDataUiState, "null cannot be cast to non-null type gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState.Populated<kotlin.collections.List<gbcorp.c312.merkmarker.info.data.model.Product>>");
            List list2 = (List) ((MRKMRDataUiState.Populated) mRKMRDataUiState).getData();
            ComposerKt.sourceInformationMarkerStart(composer, 178895509, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (HomeContent$lambda$0$0$1(mutableState) == null) {
                list = list2;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (((Product) obj).getCategory() == HomeContent$lambda$0$0$1(mutableState)) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            final List take = CollectionsKt.take(list2, 4);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 178907843, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(take) | composer.changed(function1) | composer.changedInstance(list) | composer.changed(function12);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit HomeContent$lambda$0$0$4$0;
                        HomeContent$lambda$0$0$4$0 = MRKMRHomeScreenKt.HomeContent$lambda$0$0$4$0(list, take, function1, mutableState, function12, (LazyListScope) obj3);
                        return HomeContent$lambda$0$0$4$0;
                    }
                };
                composer.updateRememberedValue(obj2);
                rememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyColumn(fillMaxSize$default, null, null, false, null, null, null, false, null, (Function1) rememberedValue2, composer, 6, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final ProductCategory HomeContent$lambda$0$0$1(MutableState<ProductCategory> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContent$lambda$0$0$4$0(final List list, final List list2, final Function1 function1, final MutableState mutableState, final Function1 function12, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(839994391, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit HomeContent$lambda$0$0$4$0$0;
                HomeContent$lambda$0$0$4$0$0 = MRKMRHomeScreenKt.HomeContent$lambda$0$0$4$0$0(list2, function1, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return HomeContent$lambda$0$0$4$0$0;
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$MRKMRHomeScreenKt.INSTANCE.getLambda$1891497550$app_release(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1806688079, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit HomeContent$lambda$0$0$4$0$1;
                HomeContent$lambda$0$0$4$0$1 = MRKMRHomeScreenKt.HomeContent$lambda$0$0$4$0$1(MutableState.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return HomeContent$lambda$0$0$4$0$1;
            }
        }), 3, null);
        final MRKMRHomeScreenKt$HomeContent$lambda$0$0$4$0$$inlined$items$default$1 mRKMRHomeScreenKt$HomeContent$lambda$0$0$4$0$$inlined$items$default$1 = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$HomeContent$lambda$0$0$4$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Product product) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Product) obj);
            }
        };
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$HomeContent$lambda$0$0$4$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$HomeContent$lambda$0$0$4$0$$inlined$items$default$4
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
                final Product product = (Product) list.get(i);
                composer.startReplaceGroup(1154079918);
                ComposerKt.sourceInformation(composer, "CN(product)*145@6458L42,146@6544L34,143@6360L245:MRKMRHomeScreen.kt#70wte1");
                ComposerKt.sourceInformationMarkerStart(composer, 729967978, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
                boolean changed = composer.changed(function1) | composer.changed(product);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function13 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$HomeContent$1$1$1$1$3$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function13.invoke(Integer.valueOf(product.getId()));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 729970722, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
                boolean changed2 = composer.changed(function12) | composer.changed(product);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final Function1 function14 = function12;
                    rememberedValue2 = (Function0) new Function0<Unit>() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$HomeContent$1$1$1$1$3$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function14.invoke(Integer.valueOf(product.getId()));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                MRKMRHomeScreenKt.ProductCard(product, function0, (Function0) rememberedValue2, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$MRKMRHomeScreenKt.INSTANCE.getLambda$1721878608$app_release(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContent$lambda$0$0$4$0$0(List list, Function1 function1, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C105@4593L165:MRKMRHomeScreen.kt#70wte1");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(839994391, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.HomeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MRKMRHomeScreen.kt:105)");
            }
            HeroCarousel(list, function1, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContent$lambda$0$0$4$0$1(final MutableState mutableState, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C138@6203L25,136@6071L184:MRKMRHomeScreen.kt#70wte1");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1806688079, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.HomeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MRKMRHomeScreen.kt:136)");
            }
            ProductCategory HomeContent$lambda$0$0$1 = HomeContent$lambda$0$0$1(mutableState);
            ComposerKt.sourceInformationMarkerStart(composer, 1060461416, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HomeContent$lambda$0$0$4$0$1$0$0;
                        HomeContent$lambda$0$0$4$0$1$0$0 = MRKMRHomeScreenKt.HomeContent$lambda$0$0$4$0$1$0$0(MutableState.this, (ProductCategory) obj);
                        return HomeContent$lambda$0$0$4$0$1$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            CategoryChipsRow(HomeContent$lambda$0$0$1, (Function1) rememberedValue, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContent$lambda$0$0$4$0$1$0$0(MutableState mutableState, ProductCategory productCategory) {
        mutableState.setValue(productCategory);
        return Unit.INSTANCE;
    }

    private static final void HeroCarousel(final List<Product> list, final Function1<? super Integer, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-134332322);
        ComposerKt.sourceInformation(startRestartGroup, "C(HeroCarousel)N(products,onProductClick)169@7151L17,169@7120L49,171@7175L2640:MRKMRHomeScreen.kt#70wte1");
        if ((i & 6) == 0) {
            i2 = i | (startRestartGroup.changedInstance(list) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-134332322, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.HeroCarousel (MRKMRHomeScreen.kt:168)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -244338129, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(list);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int size;
                        size = list.size();
                        return Integer.valueOf(size);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            PagerState rememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 3);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 75500454, "C175@7335L1762,172@7228L1869,222@9107L702:MRKMRHomeScreen.kt#70wte1");
            PagerKt.m1222HorizontalPager8jOkeI(rememberPagerState, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1076351559, true, new Function4() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Unit HeroCarousel$lambda$1$0;
                    HeroCarousel$lambda$1$0 = MRKMRHomeScreenKt.HeroCarousel$lambda$1$0(list, function1, (PagerScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
                    return HeroCarousel$lambda$1$0;
                }
            }, startRestartGroup, 54), startRestartGroup, 48, 24576, 16380);
            startRestartGroup = startRestartGroup;
            Modifier m931paddingVpY3zN4$default = PaddingKt.m931paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8227constructorimpl(10), 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m931paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4643constructorimpl2 = Updater.m4643constructorimpl(startRestartGroup);
            Updater.m4651setimpl(m4643constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl2, Integer.valueOf(hashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1096815252, "C:MRKMRHomeScreen.kt#70wte1");
            startRestartGroup.startReplaceGroup(241713527);
            ComposerKt.sourceInformation(startRestartGroup, "*230@9414L371");
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                boolean z = rememberPagerState.getCurrentPage() == i3;
                float f = 6;
                Modifier m963height3ABfNKs = SizeKt.m963height3ABfNKs(PaddingKt.m931paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8227constructorimpl(3), 0.0f, 2, null), Dp.m8227constructorimpl(f));
                if (z) {
                    f = 20;
                }
                BoxKt.Box(BackgroundKt.m300backgroundbw27NRU$default(ClipKt.clip(SizeKt.m982width3ABfNKs(m963height3ABfNKs, Dp.m8227constructorimpl(f)), RoundedCornerShapeKt.RoundedCornerShape(50)), z ? ColorKt.getForestGreen() : Color.m5392copywmQWz5c$default(ColorKt.getSlateGreen(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                i3++;
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
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
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HeroCarousel$lambda$2;
                    HeroCarousel$lambda$2 = MRKMRHomeScreenKt.HeroCarousel$lambda$2(list, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HeroCarousel$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeroCarousel$lambda$1$0(List list, final Function1 function1, PagerScope HorizontalPager, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        ComposerKt.sourceInformation(composer, "CN(page)181@7542L30,177@7398L1689:MRKMRHomeScreen.kt#70wte1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1076351559, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.HeroCarousel.<anonymous>.<anonymous> (MRKMRHomeScreen.kt:176)");
        }
        final Product product = (Product) list.get(i);
        Modifier m963height3ABfNKs = SizeKt.m963height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(220));
        ComposerKt.sourceInformationMarkerStart(composer, -713263483, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
        boolean changed = composer.changed(function1) | composer.changed(product);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit HeroCarousel$lambda$1$0$0$0;
                    HeroCarousel$lambda$1$0$0$0 = MRKMRHomeScreenKt.HeroCarousel$lambda$1$0$0$0(Function1.this, product);
                    return HeroCarousel$lambda$1$0$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier m343clickableoSLSa3U$default = ClickableKt.m343clickableoSLSa3U$default(m963height3ABfNKs, false, null, null, null, (Function0) rememberedValue, 15, null);
        ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m343clickableoSLSa3U$default);
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
        Updater.m4651setimpl(m4643constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m4647initimpl(m4643constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m4649reconcileimpl(m4643constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1451390521, "C183@7606L303,189@7926L464,201@8407L666:MRKMRHomeScreen.kt#70wte1");
        float f = 0;
        SingletonAsyncImageKt.m9152AsyncImage10Xjiaw(product.getImageUrl(), product.getTitle(), ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1286RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m8227constructorimpl(f), Dp.m8227constructorimpl(f), 3, null)), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, composer, 1572864, 0, 1976);
        BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.Companion.m5348verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5383boximpl(Color.m5392copywmQWz5c$default(ColorKt.getForestGreen(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5383boximpl(Color.m5392copywmQWz5c$default(ColorKt.getForestGreen(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer, 6);
        Modifier m929padding3ABfNKs = PaddingKt.m929padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomStart()), Dp.m8227constructorimpl(18));
        ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
        Updater.m4651setimpl(m4643constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4651setimpl(m4643constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m4647initimpl(m4643constructorimpl2, Integer.valueOf(hashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m4649reconcileimpl(m4643constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m4651setimpl(m4643constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 954078214, "C206@8589L217,212@8827L228:MRKMRHomeScreen.kt#70wte1");
        TextKt.m3259TextNvy7gAk(product.getTitle(), null, ColorKt.getPureWhite(), null, TextUnitKt.getSp(20), null, FontWeight.INSTANCE.getExtraBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597824, 0, 262058);
        String format = String.format("£%.2f", Arrays.copyOf(new Object[]{Double.valueOf(product.getPrice())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        TextKt.m3259TextNvy7gAk(format, null, ColorKt.getLeafGreen(), null, TextUnitKt.getSp(16), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597824, 0, 262058);
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
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeroCarousel$lambda$1$0$0$0(Function1 function1, Product product) {
        function1.invoke(Integer.valueOf(product.getId()));
        return Unit.INSTANCE;
    }

    private static final void CategoryChipsRow(final ProductCategory productCategory, final Function1<? super ProductCategory, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(507198872);
        ComposerKt.sourceInformation(startRestartGroup, "C(CategoryChipsRow)N(selectedCategory,onCategorySelected)254@10191L1967,248@9961L2197:MRKMRHomeScreen.kt#70wte1");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(productCategory == null ? -1 : productCategory.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(507198872, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.CategoryChipsRow (MRKMRHomeScreen.kt:247)");
            }
            float f = 8;
            Modifier m931paddingVpY3zN4$default = PaddingKt.m931paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8227constructorimpl(f), 1, null);
            PaddingValues m924PaddingValuesYgX7TsA$default = PaddingKt.m924PaddingValuesYgX7TsA$default(Dp.m8227constructorimpl(16), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical m784spacedBy0680j_4 = Arrangement.INSTANCE.m784spacedBy0680j_4(Dp.m8227constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2086824775, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit CategoryChipsRow$lambda$0$0;
                        CategoryChipsRow$lambda$0$0 = MRKMRHomeScreenKt.CategoryChipsRow$lambda$0$0(ProductCategory.this, function1, (LazyListScope) obj);
                        return CategoryChipsRow$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LazyDslKt.LazyRow(m931paddingVpY3zN4$default, null, m924PaddingValuesYgX7TsA$default, false, m784spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24966, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CategoryChipsRow$lambda$1;
                    CategoryChipsRow$lambda$1 = MRKMRHomeScreenKt.CategoryChipsRow$lambda$1(ProductCategory.this, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CategoryChipsRow$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategoryChipsRow$lambda$0$0(final ProductCategory productCategory, final Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.item$default(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(-1610723307, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit CategoryChipsRow$lambda$0$0$0;
                CategoryChipsRow$lambda$0$0$0 = MRKMRHomeScreenKt.CategoryChipsRow$lambda$0$0$0(ProductCategory.this, function1, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return CategoryChipsRow$lambda$0$0$0;
            }
        }), 3, null);
        final EnumEntries<ProductCategory> entries = ProductCategory.getEntries();
        final MRKMRHomeScreenKt$CategoryChipsRow$lambda$0$0$$inlined$items$default$1 mRKMRHomeScreenKt$CategoryChipsRow$lambda$0$0$$inlined$items$default$1 = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$CategoryChipsRow$lambda$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ProductCategory productCategory2) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ProductCategory) obj);
            }
        };
        LazyRow.items(entries.size(), null, new Function1<Integer, Object>() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$CategoryChipsRow$lambda$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(entries.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$CategoryChipsRow$lambda$0$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final ProductCategory productCategory2 = (ProductCategory) entries.get(i);
                composer.startReplaceGroup(1172198202);
                ComposerKt.sourceInformation(composer, "CN(category)*282@11314L32,283@11372L191,289@11609L239,295@11894L233,280@11219L923:MRKMRHomeScreen.kt#70wte1");
                boolean z = productCategory == productCategory2;
                ComposerKt.sourceInformationMarkerStart(composer, -100732338, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
                boolean changed = composer.changed(function1) | composer.changed(productCategory2.ordinal());
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$CategoryChipsRow$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(productCategory2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ChipKt.FilterChip(z, function0, ComposableLambdaKt.rememberComposableLambda(-708795269, true, new Function2<Composer, Integer, Unit>() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$CategoryChipsRow$1$1$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ComposerKt.sourceInformation(composer2, "C285@11431L33,284@11394L151:MRKMRHomeScreen.kt#70wte1");
                        if (!composer2.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-708795269, i4, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.CategoryChipsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MRKMRHomeScreen.kt:284)");
                        }
                        TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(ProductCategory.this.getTitleRes(), composer2, 0), null, 0L, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 1572864, 0, 262078);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), null, false, null, null, null, FilterChipDefaults.INSTANCE.m2478filterChipColorsXqyqHi0(ColorKt.getPureWhite(), ColorKt.getForestGreen(), 0L, 0L, 0L, 0L, 0L, ColorKt.getForestGreen(), 0L, ColorKt.getPureWhite(), 0L, 0L, composer, 817889334, FilterChipDefaults.$stable << 6, 3452), null, FilterChipDefaults.INSTANCE.m2477filterChipBorder_7El2pE(true, productCategory == productCategory2, ColorKt.getSoftBorder(), ColorKt.getForestGreen(), 0L, 0L, 0.0f, 0.0f, composer, (FilterChipDefaults.$stable << 24) | 3462, 240), null, composer, 384, 0, 2808);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategoryChipsRow$lambda$0$0$0(ProductCategory productCategory, final Function1 function1, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C258@10311L28,265@10614L239,271@10899L229,256@10220L923:MRKMRHomeScreen.kt#70wte1");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1610723307, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.CategoryChipsRow.<anonymous>.<anonymous>.<anonymous> (MRKMRHomeScreen.kt:256)");
            }
            boolean z = productCategory == null;
            ComposerKt.sourceInformationMarkerStart(composer, -1716868079, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
            boolean changed = composer.changed(function1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit CategoryChipsRow$lambda$0$0$0$0$0;
                        CategoryChipsRow$lambda$0$0$0$0$0 = MRKMRHomeScreenKt.CategoryChipsRow$lambda$0$0$0$0$0(Function1.this);
                        return CategoryChipsRow$lambda$0$0$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ChipKt.FilterChip(z, function0, ComposableSingletons$MRKMRHomeScreenKt.INSTANCE.m9548getLambda$987619326$app_release(), null, false, null, null, null, FilterChipDefaults.INSTANCE.m2478filterChipColorsXqyqHi0(ColorKt.getPureWhite(), ColorKt.getForestGreen(), 0L, 0L, 0L, 0L, 0L, ColorKt.getForestGreen(), 0L, ColorKt.getPureWhite(), 0L, 0L, composer, 817889334, FilterChipDefaults.$stable << 6, 3452), null, FilterChipDefaults.INSTANCE.m2477filterChipBorder_7El2pE(true, productCategory == null, ColorKt.getSoftBorder(), ColorKt.getForestGreen(), 0L, 0L, 0.0f, 0.0f, composer, (FilterChipDefaults.$stable << 24) | 3462, 240), null, composer, 384, 0, 2808);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategoryChipsRow$lambda$0$0$0$0$0(Function1 function1) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProductCard(final Product product, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(554853529);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProductCard)N(product,onClick,onAddToCart)317@12477L13,318@12498L4665,312@12283L4880:MRKMRHomeScreen.kt#70wte1");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(product) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(554853529, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.ProductCard (MRKMRHomeScreen.kt:311)");
            }
            RoundedCornerShape m1284RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(24));
            Modifier m930paddingVpY3zN4 = PaddingKt.m930paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(16), Dp.m8227constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 638306118, "CC(remember):MRKMRHomeScreen.kt#9igjgp");
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ProductCard$lambda$0$0;
                        ProductCard$lambda$0$0 = MRKMRHomeScreenKt.ProductCard$lambda$0$0(Function0.this);
                        return ProductCard$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CardKt.ElevatedCard(ClickableKt.m343clickableoSLSa3U$default(m930paddingVpY3zN4, false, null, null, null, (Function0) rememberedValue, 15, null), m1284RoundedCornerShape0680j_4, null, null, ComposableLambdaKt.rememberComposableLambda(244104382, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit ProductCard$lambda$1;
                    ProductCard$lambda$1 = MRKMRHomeScreenKt.ProductCard$lambda$1(Product.this, function02, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return ProductCard$lambda$1;
                }
            }, startRestartGroup, 54), startRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.MRKMRHomeScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ProductCard$lambda$2;
                    ProductCard$lambda$2 = MRKMRHomeScreenKt.ProductCard$lambda$2(Product.this, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ProductCard$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductCard$lambda$0$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final MRKMRDataUiState<List<Product>> HomeScreen$lambda$0(State<? extends MRKMRDataUiState<? extends List<Product>>> state) {
        return (MRKMRDataUiState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductCard$lambda$1(Product product, Function0 function0, ColumnScope ElevatedCard, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(ElevatedCard, "$this$ElevatedCard");
        ComposerKt.sourceInformation(composer, "C319@12508L4649:MRKMRHomeScreen.kt#70wte1");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(244104382, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.ProductCard.<anonymous> (MRKMRHomeScreen.kt:319)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            ComposerKt.sourceInformationMarkerStart(composer, -743401231, "C320@12529L358,335@13093L11,331@12936L200,338@13150L3997:MRKMRHomeScreen.kt#70wte1");
            float f = 24;
            SingletonAsyncImageKt.m9152AsyncImage10Xjiaw(product.getImageUrl(), product.getTitle(), ClipKt.clip(SizeKt.m963height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(180)), RoundedCornerShapeKt.m1286RoundedCornerShapea9UjIt4$default(Dp.m8227constructorimpl(f), Dp.m8227constructorimpl(f), 0.0f, 0.0f, 12, null)), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, composer, 1572864, 0, 1976);
            float f2 = 4;
            BoxKt.Box(BackgroundKt.m300backgroundbw27NRU$default(SizeKt.m963height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(f2)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer(), null, 2, null), composer, 0);
            Modifier m929padding3ABfNKs = PaddingKt.m929padding3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(16));
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
            ComposerKt.sourceInformationMarkerStart(composer, 1646065183, "C339@13211L898,360@14127L40,364@14275L11,362@14185L311,371@14514L40,375@14668L11,373@14572L309,382@14899L41,384@14958L2175:MRKMRHomeScreen.kt#70wte1");
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1174776366, "C346@13524L11,343@13380L711:MRKMRHomeScreen.kt#70wte1");
            Modifier m930paddingVpY3zN4 = PaddingKt.m930paddingVpY3zN4(BackgroundKt.m299backgroundbw27NRU(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer(), RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(50))), Dp.m8227constructorimpl(10), Dp.m8227constructorimpl(3));
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, m930paddingVpY3zN4);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer m4643constructorimpl4 = Updater.m4643constructorimpl(composer);
            Updater.m4651setimpl(m4643constructorimpl4, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl4, Integer.valueOf(hashCode4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1601877844, "C352@13815L41,353@13908L11,351@13774L295:MRKMRHomeScreen.kt#70wte1");
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(product.getCategory().getTitleRes(), composer, 0), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer(), null, TextUnitKt.getSp(11), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597440, 0, 262058);
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
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(8)), composer, 6);
            TextKt.m3259TextNvy7gAk(product.getTitle(), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), null, TextUnitKt.getSp(17), null, FontWeight.INSTANCE.getExtraBold(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8163getEllipsisgIe3tQ8(), false, 1, 0, null, null, composer, 1597440, 24960, 241578);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f2)), composer, 6);
            TextKt.m3259TextNvy7gAk(product.getDescription(), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, TextUnitKt.getSp(17), TextOverflow.INSTANCE.m8163getEllipsisgIe3tQ8(), false, 2, 0, null, null, composer, 24576, 25008, 239594);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(12)), composer, 6);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically2, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default2);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer m4643constructorimpl5 = Updater.m4643constructorimpl(composer);
            Updater.m4651setimpl(m4643constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl5, Integer.valueOf(hashCode5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1314566194, "C389@15197L1200,418@16686L11,419@16764L11,417@16598L214,414@16419L696:MRKMRHomeScreen.kt#70wte1");
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer, companion2);
            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor6);
            } else {
                composer.useNode();
            }
            Composer m4643constructorimpl6 = Updater.m4643constructorimpl(composer);
            Updater.m4651setimpl(m4643constructorimpl6, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl6, Integer.valueOf(hashCode6), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl6, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 888753572, "C393@15431L11,390@15275L734,405@16034L39,408@16220L11,406@16098L277:MRKMRHomeScreen.kt#70wte1");
            float f3 = 6;
            Modifier m929padding3ABfNKs2 = PaddingKt.m929padding3ABfNKs(BackgroundKt.m299backgroundbw27NRU(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer(), RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m8227constructorimpl(f3));
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer, m929padding3ABfNKs2);
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor7);
            } else {
                composer.useNode();
            }
            Composer m4643constructorimpl7 = Updater.m4643constructorimpl(composer);
            Updater.m4651setimpl(m4643constructorimpl7, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl7, Integer.valueOf(hashCode7), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl7, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 2055719482, "C401@15857L11,398@15667L316:MRKMRHomeScreen.kt#70wte1");
            IconKt.m2553Iconww6aTOc(LocalOfferKt.getLocalOffer(Icons.Rounded.INSTANCE), (String) null, SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(14)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer(), composer, 432, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m982width3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f3)), composer, 6);
            String format = String.format("£%.2f", Arrays.copyOf(new Object[]{Double.valueOf(product.getPrice())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            TextKt.m3259TextNvy7gAk(format, null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), null, TextUnitKt.getSp(18), null, FontWeight.INSTANCE.getExtraBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597440, 0, 262058);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.FilledTonalIconButton(function0, SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(36)), false, null, IconButtonDefaults.INSTANCE.m2523filledTonalIconButtonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary(), 0L, 0L, composer, IconButtonDefaults.$stable << 12, 12), null, ComposableSingletons$MRKMRHomeScreenKt.INSTANCE.m9547getLambda$2045724831$app_release(), composer, 1572912, 44);
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
}
