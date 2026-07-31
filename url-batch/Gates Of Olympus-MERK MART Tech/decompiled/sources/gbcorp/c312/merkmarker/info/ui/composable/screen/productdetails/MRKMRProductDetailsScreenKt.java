package gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.InfoKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
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
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import coil3.compose.SingletonAsyncImageKt;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.data.model.Product;
import gbcorp.c312.merkmarker.info.ui.composable.shared.MRKMRContentWrapperKt;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRProductDetailsViewModel;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import org.koin.compose.KoinApplicationKt;
import org.koin.viewmodel.CreationExtrasExtKt;
import org.koin.viewmodel.GetViewModelKt;

/* compiled from: MRKMRProductDetailsScreen.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a3\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u008a\u0084\u0002"}, d2 = {"ProductDetailsScreen", "", "productId", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRProductDetailsViewModel;", "(ILandroidx/compose/ui/Modifier;Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRProductDetailsViewModel;Landroidx/compose/runtime/Composer;II)V", "ProductDetailsScreenContent", "productState", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "Lgbcorp/c312/merkmarker/info/data/model/Product;", "onAddToCart", "Lkotlin/Function0;", "(Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRProductDetailsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailsScreen$lambda$3(int i, Modifier modifier, MRKMRProductDetailsViewModel mRKMRProductDetailsViewModel, int i2, int i3, Composer composer, int i4) {
        ProductDetailsScreen(i, modifier, mRKMRProductDetailsViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailsScreenContent$lambda$1(MRKMRDataUiState mRKMRDataUiState, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        ProductDetailsScreenContent(mRKMRDataUiState, modifier, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProductDetailsScreen(final int i, Modifier modifier, MRKMRProductDetailsViewModel mRKMRProductDetailsViewModel, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        MRKMRProductDetailsViewModel mRKMRProductDetailsViewModel2;
        final MRKMRProductDetailsViewModel mRKMRProductDetailsViewModel3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        MRKMRProductDetailsViewModel mRKMRProductDetailsViewModel4;
        boolean changedInstance;
        MRKMRProductDetailsScreenKt$ProductDetailsScreen$1$1 rememberedValue;
        boolean changedInstance2;
        MRKMRProductDetailsScreenKt$ProductDetailsScreen$2$1 rememberedValue2;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-808924314);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProductDetailsScreen)N(productId,modifier,viewModel)52@2386L16,54@2429L58,54@2408L79,61@2610L27,58@2493L150:MRKMRProductDetailsScreen.kt#1r68yl");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    mRKMRProductDetailsViewModel2 = mRKMRProductDetailsViewModel;
                    if (startRestartGroup.changedInstance(mRKMRProductDetailsViewModel2)) {
                        i6 = 256;
                        i4 |= i6;
                    }
                } else {
                    mRKMRProductDetailsViewModel2 = mRKMRProductDetailsViewModel;
                }
                i6 = 128;
                i4 |= i6;
            } else {
                mRKMRProductDetailsViewModel2 = mRKMRProductDetailsViewModel;
            }
            if (!startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "50@2311L15");
                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                } else {
                    Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) != 0) {
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -924953623, "CC(koinViewModel)N(qualifier,viewModelStoreOwner,key,extras,scope,parameters)48@1587L7,51@1782L18:ViewModel.kt#7bazx");
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(MRKMRProductDetailsViewModel.class), current.getViewModelStore(), null, CreationExtrasExtKt.defaultExtras(current), null, KoinApplicationKt.currentKoinScope(startRestartGroup, 0), null);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier modifier3 = companion;
                        i5 = i4 & (-897);
                        mRKMRProductDetailsViewModel4 = (MRKMRProductDetailsViewModel) resolveViewModel;
                        modifier2 = modifier3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-808924314, i5, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails.ProductDetailsScreen (MRKMRProductDetailsScreen.kt:51)");
                        }
                        State collectAsState = SnapshotStateKt.collectAsState(mRKMRProductDetailsViewModel4.getProductDetailsState(), null, startRestartGroup, 0, 1);
                        Unit unit = Unit.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 12822720, "CC(remember):MRKMRProductDetailsScreen.kt#9igjgp");
                        changedInstance = startRestartGroup.changedInstance(mRKMRProductDetailsViewModel4) | ((i5 & 14) == 4);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new MRKMRProductDetailsScreenKt$ProductDetailsScreen$1$1(mRKMRProductDetailsViewModel4, i, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
                        MRKMRDataUiState<Product> ProductDetailsScreen$lambda$0 = ProductDetailsScreen$lambda$0(collectAsState);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 12828481, "CC(remember):MRKMRProductDetailsScreen.kt#9igjgp");
                        changedInstance2 = startRestartGroup.changedInstance(mRKMRProductDetailsViewModel4);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new MRKMRProductDetailsScreenKt$ProductDetailsScreen$2$1(mRKMRProductDetailsViewModel4);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ProductDetailsScreenContent(ProductDetailsScreen$lambda$0, modifier2, (Function0) ((KFunction) rememberedValue2), startRestartGroup, i5 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mRKMRProductDetailsViewModel3 = mRKMRProductDetailsViewModel4;
                    } else {
                        modifier2 = companion;
                    }
                }
                i5 = i4;
                mRKMRProductDetailsViewModel4 = mRKMRProductDetailsViewModel2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                State collectAsState2 = SnapshotStateKt.collectAsState(mRKMRProductDetailsViewModel4.getProductDetailsState(), null, startRestartGroup, 0, 1);
                Unit unit2 = Unit.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 12822720, "CC(remember):MRKMRProductDetailsScreen.kt#9igjgp");
                changedInstance = startRestartGroup.changedInstance(mRKMRProductDetailsViewModel4) | ((i5 & 14) == 4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new MRKMRProductDetailsScreenKt$ProductDetailsScreen$1$1(mRKMRProductDetailsViewModel4, i, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
                MRKMRDataUiState<Product> ProductDetailsScreen$lambda$02 = ProductDetailsScreen$lambda$0(collectAsState2);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 12828481, "CC(remember):MRKMRProductDetailsScreen.kt#9igjgp");
                changedInstance2 = startRestartGroup.changedInstance(mRKMRProductDetailsViewModel4);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue2 = new MRKMRProductDetailsScreenKt$ProductDetailsScreen$2$1(mRKMRProductDetailsViewModel4);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProductDetailsScreenContent(ProductDetailsScreen$lambda$02, modifier2, (Function0) ((KFunction) rememberedValue2), startRestartGroup, i5 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                mRKMRProductDetailsViewModel3 = mRKMRProductDetailsViewModel4;
            } else {
                startRestartGroup.skipToGroupEnd();
                mRKMRProductDetailsViewModel3 = mRKMRProductDetailsViewModel2;
            }
            final Modifier modifier4 = modifier2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails.MRKMRProductDetailsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ProductDetailsScreen$lambda$3;
                        ProductDetailsScreen$lambda$3 = MRKMRProductDetailsScreenKt.ProductDetailsScreen$lambda$3(i, modifier4, mRKMRProductDetailsViewModel3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return ProductDetailsScreen$lambda$3;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        final Modifier modifier42 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ProductDetailsScreenContent(final MRKMRDataUiState<Product> mRKMRDataUiState, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1131915262);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProductDetailsScreenContent)N(productState,modifier,onAddToCart)73@2901L11,71@2817L6364:MRKMRProductDetailsScreen.kt#1r68yl");
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
                i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1131915262, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails.ProductDetailsScreenContent (MRKMRProductDetailsScreen.kt:70)");
                }
                Modifier m300backgroundbw27NRU$default = BackgroundKt.m300backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getBackground(), null, 2, null);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2071519484, "C77@3024L5892,74@2936L6239:MRKMRProductDetailsScreen.kt#1r68yl");
                MRKMRContentWrapperKt.MRKMRContentWrapper(null, mRKMRDataUiState, ComposableLambdaKt.rememberComposableLambda(-515563024, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails.MRKMRProductDetailsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ProductDetailsScreenContent$lambda$0$0;
                        ProductDetailsScreenContent$lambda$0$0 = MRKMRProductDetailsScreenKt.ProductDetailsScreenContent$lambda$0$0(MRKMRDataUiState.this, function0, (Composer) obj, ((Integer) obj2).intValue());
                        return ProductDetailsScreenContent$lambda$0$0;
                    }
                }, startRestartGroup, 54), ComposableSingletons$MRKMRProductDetailsScreenKt.INSTANCE.m9565getLambda$437441935$app_release(), null, startRestartGroup, ((i3 << 3) & 112) | 3456, 17);
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
                endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails.MRKMRProductDetailsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ProductDetailsScreenContent$lambda$1;
                        ProductDetailsScreenContent$lambda$1 = MRKMRProductDetailsScreenKt.ProductDetailsScreenContent$lambda$1(MRKMRDataUiState.this, modifier3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ProductDetailsScreenContent$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailsScreenContent$lambda$0$0(MRKMRDataUiState mRKMRDataUiState, Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C83@3250L21,80@3123L5779:MRKMRProductDetailsScreen.kt#1r68yl");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-515563024, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails.ProductDetailsScreenContent.<anonymous>.<anonymous> (MRKMRProductDetailsScreen.kt:78)");
            }
            Intrinsics.checkNotNull(mRKMRDataUiState, "null cannot be cast to non-null type gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState.Populated<gbcorp.c312.merkmarker.info.data.model.Product>");
            Product product = (Product) ((MRKMRDataUiState.Populated) mRKMRDataUiState).getData();
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, -949943013, "C87@3421L50,85@3314L465,95@3801L5083:MRKMRProductDetailsScreen.kt#1r68yl");
            float f = 28;
            SingletonAsyncImageKt.m9152AsyncImage10Xjiaw(product.getImageUrl(), StringResources_androidKt.stringResource(R.string.product_image_description, composer, 0), ClipKt.clip(SizeKt.m963height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(300)), RoundedCornerShapeKt.m1286RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m8227constructorimpl(f), Dp.m8227constructorimpl(f), 3, null)), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, composer, 1572864, 0, 1976);
            Modifier m929padding3ABfNKs = PaddingKt.m929padding3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(22));
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
            ComposerKt.sourceInformationMarkerStart(composer, 1689080551, "C99@4026L11,96@3870L767,112@4663L41,116@4836L11,114@4730L266,121@5022L41,125@5211L11,123@5089L277,130@5392L41,131@5498L11,131@5458L60,132@5543L41,134@5610L1344,161@6980L41,165@7159L11,163@7047L379,172@7452L41,181@7936L11,182@8018L11,180@7848L222,174@7519L1276,199@8821L41:MRKMRProductDetailsScreen.kt#1r68yl");
            float f2 = 14;
            Modifier m930paddingVpY3zN4 = PaddingKt.m930paddingVpY3zN4(BackgroundKt.m299backgroundbw27NRU(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer(), RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(50))), Dp.m8227constructorimpl(f2), Dp.m8227constructorimpl(5));
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m930paddingVpY3zN4);
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
            Updater.m4651setimpl(m4643constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl3, Integer.valueOf(hashCode3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1756450246, "C105@4341L41,106@4438L11,104@4296L315:MRKMRProductDetailsScreen.kt#1r68yl");
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(product.getCategory().getTitleRes(), composer, 0), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer(), null, TextUnitKt.getSp(12), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597440, 0, 262058);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f2)), composer, 6);
            TextKt.m3259TextNvy7gAk(product.getTitle(), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnBackground(), null, TextUnitKt.getSp(28), null, FontWeight.INSTANCE.getExtraBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597440, 0, 262058);
            float f3 = 10;
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f3)), composer, 6);
            String format = String.format("£%.2f", Arrays.copyOf(new Object[]{Double.valueOf(product.getPrice())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            TextKt.m3259TextNvy7gAk(format, null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), null, TextUnitKt.getSp(24), null, FontWeight.INSTANCE.getExtraBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597440, 0, 262058);
            float f4 = 20;
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f4)), composer, 6);
            DividerKt.m2406HorizontalDivider9IZ8Weo(null, 0.0f, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline(), composer, 0, 3);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f4)), composer, 6);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion);
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
            Updater.m4651setimpl(m4643constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl4, Integer.valueOf(hashCode4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -2037920506, "C140@5915L11,137@5747L784,152@6560L54,155@6761L11,153@6643L285:MRKMRProductDetailsScreen.kt#1r68yl");
            float f5 = 6;
            Modifier m929padding3ABfNKs2 = PaddingKt.m929padding3ABfNKs(BackgroundKt.m299backgroundbw27NRU(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer(), RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m8227constructorimpl(f5));
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer, m929padding3ABfNKs2);
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
            Updater.m4651setimpl(m4643constructorimpl5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl5, Integer.valueOf(hashCode5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1984192077, "C148@6367L11,145@6171L330:MRKMRProductDetailsScreen.kt#1r68yl");
            float f6 = 16;
            IconKt.m2553Iconww6aTOc(InfoKt.getInfo(Icons.Rounded.INSTANCE), (String) null, SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f6)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer(), composer, 432, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(PaddingKt.m931paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8227constructorimpl(f5), 0.0f, 2, null), composer, 6);
            TextKt.m3259TextNvy7gAk("Grower's Notes", null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnBackground(), null, TextUnitKt.getSp(16), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597446, 0, 262058);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f3)), composer, 6);
            TextKt.m3259TextNvy7gAk(product.getDescription(), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, TextUnitKt.getSp(14), null, FontWeight.INSTANCE.getNormal(), null, 0L, null, TextAlign.m8098boximpl(TextAlign.INSTANCE.m8107getJustifye0LSkKk()), TextUnitKt.getSp(23), 0, false, 0, 0, null, null, composer, 1597440, 48, 258986);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(36)), composer, 6);
            ButtonKt.FilledTonalButton(function0, SizeKt.m963height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(54)), false, RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(f6)), ButtonDefaults.INSTANCE.m2068filledTonalButtonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 12), null, null, null, null, ComposableSingletons$MRKMRProductDetailsScreenKt.INSTANCE.m9564getLambda$1852225362$app_release(), composer, 805306416, 484);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f4)), composer, 6);
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

    private static final MRKMRDataUiState<Product> ProductDetailsScreen$lambda$0(State<? extends MRKMRDataUiState<Product>> state) {
        return state.getValue();
    }
}
