package gbcorp.c312.merkmarker.info.ui.composable.screen.checkout;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.profileinstaller.ProfileVerifier;
import androidx.window.core.layout.WindowSizeClass;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.data.entity.MRKMROrderEntity;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRCheckoutViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import org.koin.compose.KoinApplicationKt;
import org.koin.viewmodel.CreationExtrasExtKt;
import org.koin.viewmodel.GetViewModelKt;

/* compiled from: MRKMRCheckoutScreen.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0091\u0001\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0018\u001ac\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007¢\u0006\u0002\u0010#¨\u0006$²\u0006\u0010\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"CheckoutScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRCheckoutViewModel;", "onNavigateToOrdersScreen", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRCheckoutViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CheckoutContent", "customerFirstName", "", "customerLastName", "customerEmail", "isEmailInvalid", "", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "isButtonEnabled", "onFirstNameChanged", "Lkotlin/Function1;", "onLastNameChanged", "onEmailChanged", "onPlaceOrderButtonClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusManager;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "CheckoutTextField", "input", "onInputChange", "labelText", "enabled", "isError", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/runtime/Composer;II)V", "app_release", "orderState", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "Lgbcorp/c312/merkmarker/info/data/entity/MRKMROrderEntity;", "emailInvalidState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRCheckoutScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckoutContent$lambda$1(String str, String str2, String str3, boolean z, Modifier modifier, FocusManager focusManager, boolean z2, Function1 function1, Function1 function12, Function1 function13, Function0 function0, int i, int i2, int i3, Composer composer, int i4) {
        CheckoutContent(str, str2, str3, z, modifier, focusManager, z2, function1, function12, function13, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckoutScreen$lambda$8(Modifier modifier, MRKMRCheckoutViewModel mRKMRCheckoutViewModel, Function0 function0, int i, int i2, Composer composer, int i3) {
        CheckoutScreen(modifier, mRKMRCheckoutViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckoutTextField$lambda$1(String str, Function1 function1, String str2, Modifier modifier, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, int i, int i2, Composer composer, int i3) {
        CheckoutTextField(str, function1, str2, modifier, z, z2, keyboardOptions, keyboardActions, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckoutScreen(Modifier modifier, MRKMRCheckoutViewModel mRKMRCheckoutViewModel, final Function0<Unit> onNavigateToOrdersScreen, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        MRKMRCheckoutViewModel mRKMRCheckoutViewModel2;
        final Modifier.Companion companion;
        final MRKMRCheckoutViewModel mRKMRCheckoutViewModel3;
        int i4;
        State collectAsStateWithLifecycle;
        Object rememberedValue;
        boolean changedInstance;
        MRKMRCheckoutScreenKt$CheckoutScreen$1$1 rememberedValue2;
        boolean changedInstance2;
        MRKMRCheckoutScreenKt$CheckoutScreen$2$1 rememberedValue3;
        boolean changedInstance3;
        MRKMRCheckoutScreenKt$CheckoutScreen$3$1 rememberedValue4;
        boolean changedInstance4;
        MRKMRCheckoutScreenKt$CheckoutScreen$4$1 rememberedValue5;
        int i5;
        Intrinsics.checkNotNullParameter(onNavigateToOrdersScreen, "onNavigateToOrdersScreen");
        Composer startRestartGroup = composer.startRestartGroup(-954935683);
        ComposerKt.sourceInformation(startRestartGroup, "C(CheckoutScreen)N(modifier,viewModel,onNavigateToOrdersScreen)44@2011L7,45@2062L29,46@2149L29,48@2207L227,71@3029L34,72@3093L33,73@3153L30,74@3219L21,63@2669L577:MRKMRCheckoutScreen.kt#v79pgw");
        int i6 = i2 & 1;
        if (i6 != 0) {
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
                mRKMRCheckoutViewModel2 = mRKMRCheckoutViewModel;
                if (startRestartGroup.changedInstance(mRKMRCheckoutViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                mRKMRCheckoutViewModel2 = mRKMRCheckoutViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            mRKMRCheckoutViewModel2 = mRKMRCheckoutViewModel;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onNavigateToOrdersScreen) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "41@1907L15");
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                companion = modifier2;
            } else {
                companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1614864554, "CC(koinViewModel)N(qualifier,viewModelStoreOwner,key,extras,scope,parameters)43@1516L7,46@1711L18:ViewModel.kt#m7on9k");
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(MRKMRCheckoutViewModel.class), current.getViewModelStore(), null, CreationExtrasExtKt.defaultExtras(current), null, KoinApplicationKt.currentKoinScope(startRestartGroup, 0), null);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    mRKMRCheckoutViewModel3 = (MRKMRCheckoutViewModel) resolveViewModel;
                    i4 = i3 & (-113);
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-954935683, i4, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.CheckoutScreen (MRKMRCheckoutScreen.kt:43)");
                    }
                    ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localFocusManager);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FocusManager focusManager = (FocusManager) consume;
                    collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(mRKMRCheckoutViewModel3.getOrderState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
                    State collectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(mRKMRCheckoutViewModel3.getEmailInvalidState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1429822848, "CC(remember):MRKMRCheckoutScreen.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.MRKMRCheckoutScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean CheckoutScreen$lambda$2$0;
                                CheckoutScreen$lambda$2$0 = MRKMRCheckoutScreenKt.CheckoutScreen$lambda$2$0(MRKMRCheckoutViewModel.this);
                                return Boolean.valueOf(CheckoutScreen$lambda$2$0);
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    State state = (State) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (!(CheckoutScreen$lambda$0(collectAsStateWithLifecycle) instanceof MRKMRDataUiState.Populated)) {
                        startRestartGroup.startReplaceGroup(1375110548);
                        ComposerKt.sourceInformation(startRestartGroup, "57@2496L161");
                        MRKMRDataUiState<MRKMROrderEntity> CheckoutScreen$lambda$0 = CheckoutScreen$lambda$0(collectAsStateWithLifecycle);
                        Intrinsics.checkNotNull(CheckoutScreen$lambda$0, "null cannot be cast to non-null type gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState.Populated<gbcorp.c312.merkmarker.info.data.entity.MRKMROrderEntity>");
                        CheckoutDialogKt.CheckoutDialog((MRKMROrderEntity) ((MRKMRDataUiState.Populated) CheckoutScreen$lambda$0).getData(), onNavigateToOrdersScreen, startRestartGroup, (i4 >> 3) & 112);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1375280645);
                        startRestartGroup.endReplaceGroup();
                    }
                    String customerFirstName = mRKMRCheckoutViewModel3.getCustomerFirstName();
                    String customerLastName = mRKMRCheckoutViewModel3.getCustomerLastName();
                    String customerEmail = mRKMRCheckoutViewModel3.getCustomerEmail();
                    boolean CheckoutScreen$lambda$1 = CheckoutScreen$lambda$1(collectAsStateWithLifecycle2);
                    boolean CheckoutScreen$lambda$3 = CheckoutScreen$lambda$3(state);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1429848959, "CC(remember):MRKMRCheckoutScreen.kt#9igjgp");
                    changedInstance = startRestartGroup.changedInstance(mRKMRCheckoutViewModel3);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new MRKMRCheckoutScreenKt$CheckoutScreen$1$1(mRKMRCheckoutViewModel3);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Function1 function1 = (Function1) ((KFunction) rememberedValue2);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1429851006, "CC(remember):MRKMRCheckoutScreen.kt#9igjgp");
                    changedInstance2 = startRestartGroup.changedInstance(mRKMRCheckoutViewModel3);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new MRKMRCheckoutScreenKt$CheckoutScreen$2$1(mRKMRCheckoutViewModel3);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Function1 function12 = (Function1) ((KFunction) rememberedValue3);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1429852923, "CC(remember):MRKMRCheckoutScreen.kt#9igjgp");
                    changedInstance3 = startRestartGroup.changedInstance(mRKMRCheckoutViewModel3);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new MRKMRCheckoutScreenKt$CheckoutScreen$3$1(mRKMRCheckoutViewModel3);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Function1 function13 = (Function1) ((KFunction) rememberedValue4);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1429855026, "CC(remember):MRKMRCheckoutScreen.kt#9igjgp");
                    changedInstance4 = startRestartGroup.changedInstance(mRKMRCheckoutViewModel3);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changedInstance4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new MRKMRCheckoutScreenKt$CheckoutScreen$4$1(mRKMRCheckoutViewModel3);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    CheckoutContent(customerFirstName, customerLastName, customerEmail, CheckoutScreen$lambda$1, companion, focusManager, CheckoutScreen$lambda$3, function1, function12, function13, (Function0) ((KFunction) rememberedValue5), startRestartGroup, (i4 << 12) & 57344, 0, 0);
                    startRestartGroup = startRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            i4 = i3;
            mRKMRCheckoutViewModel3 = mRKMRCheckoutViewModel2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localFocusManager2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FocusManager focusManager2 = (FocusManager) consume2;
            collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(mRKMRCheckoutViewModel3.getOrderState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
            State collectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(mRKMRCheckoutViewModel3.getEmailInvalidState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1429822848, "CC(remember):MRKMRCheckoutScreen.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            State state2 = (State) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (!(CheckoutScreen$lambda$0(collectAsStateWithLifecycle) instanceof MRKMRDataUiState.Populated)) {
            }
            String customerFirstName2 = mRKMRCheckoutViewModel3.getCustomerFirstName();
            String customerLastName2 = mRKMRCheckoutViewModel3.getCustomerLastName();
            String customerEmail2 = mRKMRCheckoutViewModel3.getCustomerEmail();
            boolean CheckoutScreen$lambda$12 = CheckoutScreen$lambda$1(collectAsStateWithLifecycle22);
            boolean CheckoutScreen$lambda$32 = CheckoutScreen$lambda$3(state2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1429848959, "CC(remember):MRKMRCheckoutScreen.kt#9igjgp");
            changedInstance = startRestartGroup.changedInstance(mRKMRCheckoutViewModel3);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new MRKMRCheckoutScreenKt$CheckoutScreen$1$1(mRKMRCheckoutViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function1 function14 = (Function1) ((KFunction) rememberedValue2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1429851006, "CC(remember):MRKMRCheckoutScreen.kt#9igjgp");
            changedInstance2 = startRestartGroup.changedInstance(mRKMRCheckoutViewModel3);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue3 = new MRKMRCheckoutScreenKt$CheckoutScreen$2$1(mRKMRCheckoutViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function1 function122 = (Function1) ((KFunction) rememberedValue3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1429852923, "CC(remember):MRKMRCheckoutScreen.kt#9igjgp");
            changedInstance3 = startRestartGroup.changedInstance(mRKMRCheckoutViewModel3);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue4 = new MRKMRCheckoutScreenKt$CheckoutScreen$3$1(mRKMRCheckoutViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function1 function132 = (Function1) ((KFunction) rememberedValue4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1429855026, "CC(remember):MRKMRCheckoutScreen.kt#9igjgp");
            changedInstance4 = startRestartGroup.changedInstance(mRKMRCheckoutViewModel3);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue5 = new MRKMRCheckoutScreenKt$CheckoutScreen$4$1(mRKMRCheckoutViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CheckoutContent(customerFirstName2, customerLastName2, customerEmail2, CheckoutScreen$lambda$12, companion, focusManager2, CheckoutScreen$lambda$32, function14, function122, function132, (Function0) ((KFunction) rememberedValue5), startRestartGroup, (i4 << 12) & 57344, 0, 0);
            startRestartGroup = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            mRKMRCheckoutViewModel3 = mRKMRCheckoutViewModel2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.MRKMRCheckoutScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CheckoutScreen$lambda$8;
                    CheckoutScreen$lambda$8 = MRKMRCheckoutScreenKt.CheckoutScreen$lambda$8(Modifier.this, mRKMRCheckoutViewModel3, onNavigateToOrdersScreen, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CheckoutScreen$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CheckoutScreen$lambda$2$0(MRKMRCheckoutViewModel mRKMRCheckoutViewModel) {
        return mRKMRCheckoutViewModel.getCustomerFirstName().length() > 0 && mRKMRCheckoutViewModel.getCustomerLastName().length() > 0 && mRKMRCheckoutViewModel.getCustomerEmail().length() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CheckoutContent(final String str, final String str2, final String str3, final boolean z, Modifier modifier, final FocusManager focusManager, final boolean z2, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final Function1<? super String, Unit> function13, final Function0<Unit> function0, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str4;
        Modifier modifier2;
        int i5;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1138263020);
        ComposerKt.sourceInformation(startRestartGroup, "C(CheckoutContent)N(customerFirstName,customerLastName,customerEmail,isEmailInvalid,modifier,focusManager,isButtonEnabled,onFirstNameChanged,onLastNameChanged,onEmailChanged,onPlaceOrderButtonClick)95@3776L11,96@3828L21,92@3675L2889:MRKMRCheckoutScreen.kt#v79pgw");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str4 = str3;
            i4 |= startRestartGroup.changed(str4) ? 256 : 128;
        } else {
            str4 = str3;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((196608 & i) == 0) {
                i4 |= startRestartGroup.changedInstance(focusManager) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
            }
            if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
            }
            if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changedInstance(function12) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changedInstance(function13) ? 536870912 : 268435456;
            }
            if ((i2 & 6) != 0) {
                i5 = i2 | (startRestartGroup.changedInstance(function0) ? 4 : 2);
            } else {
                i5 = i2;
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i5 & 3) != 2, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1138263020, i4, i5, "gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.CheckoutContent (MRKMRCheckoutScreen.kt:91)");
                }
                Modifier m929padding3ABfNKs = PaddingKt.m929padding3ABfNKs(ScrollKt.verticalScroll$default(BackgroundKt.m300backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getBackground(), null, 2, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m8227constructorimpl(22));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m929padding3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier4 = companion;
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 620436859, "C101@3974L11,99@3896L190,107@4214L11,105@4095L232,112@4337L41,117@4518L55,114@4388L244,121@4642L41,126@4821L54,123@4693L241,130@4944L41,135@5117L50,132@4995L269,149@5552L41,162@6013L11,163@6079L11,164@6157L11,165@6251L11,161@5952L355,152@5633L99,151@5603L955:MRKMRCheckoutScreen.kt#v79pgw");
                TextKt.m3259TextNvy7gAk("Contact Details", null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), null, TextUnitKt.getSp(26), null, FontWeight.INSTANCE.getExtraBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, 1597446, 0, 262058);
                TextKt.m3259TextNvy7gAk("We'll use these to prepare your collection notification", null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), null, TextUnitKt.getSp(14), null, FontWeight.INSTANCE.getNormal(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, 1597446, 0, 262058);
                SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(28)), startRestartGroup, 6);
                CheckoutTextField(str, function1, StringResources_androidKt.stringResource(R.string.checkout_text_field_first_name, startRestartGroup, 0), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, null, null, startRestartGroup, (i4 & 14) | 3072 | ((i4 >> 18) & 112), 240);
                float f = 14;
                SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f)), startRestartGroup, 6);
                CheckoutTextField(str2, function12, StringResources_androidKt.stringResource(R.string.checkout_text_field_last_name, startRestartGroup, 0), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, null, null, startRestartGroup, ((i4 >> 3) & 14) | 3072 | ((i4 >> 21) & 112), 240);
                SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f)), startRestartGroup, 6);
                int i10 = i5;
                int i11 = i4;
                CheckoutTextField(str4, function13, StringResources_androidKt.stringResource(R.string.checkout_text_field_email, startRestartGroup, 0), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, z, null, null, startRestartGroup, ((i4 >> 6) & 14) | 3072 | ((i4 >> 24) & 112) | ((i4 << 6) & 458752), 208);
                if (z) {
                    startRestartGroup.startReplaceGroup(621748840);
                    ComposerKt.sourceInformation(startRestartGroup, "141@5308L40,144@5466L11,142@5361L171");
                    i8 = 6;
                    SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(4)), startRestartGroup, 6);
                    i6 = 16;
                    i7 = 4;
                    TextKt.m3259TextNvy7gAk("Please enter a valid email address", null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getError(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, 24582, 0, 262122);
                    startRestartGroup.endReplaceGroup();
                } else {
                    i6 = 16;
                    i7 = 4;
                    i8 = 6;
                    startRestartGroup.startReplaceGroup(621987168);
                    startRestartGroup.endReplaceGroup();
                }
                SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(36)), startRestartGroup, i8);
                Modifier m963height3ABfNKs = SizeKt.m963height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(54));
                RoundedCornerShape m1284RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(i6));
                ButtonColors m2064buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2064buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnPrimary(), Color.m5392copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5392copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnPrimary(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), startRestartGroup, ButtonDefaults.$stable << 12, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -118480219, "CC(remember):MRKMRCheckoutScreen.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(focusManager) | ((i10 & 14) == i7);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.MRKMRCheckoutScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit CheckoutContent$lambda$0$0$0;
                            CheckoutContent$lambda$0$0$0 = MRKMRCheckoutScreenKt.CheckoutContent$lambda$0$0$0(FocusManager.this, function0);
                            return CheckoutContent$lambda$0$0$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ButtonKt.Button((Function0) rememberedValue, m963height3ABfNKs, z2, m1284RoundedCornerShape0680j_4, m2064buttonColorsro_MJ88, null, null, null, null, ComposableSingletons$MRKMRCheckoutScreenKt.INSTANCE.getLambda$580370514$app_release(), startRestartGroup, ((i11 >> 12) & 896) | 805306416, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
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
                endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.MRKMRCheckoutScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CheckoutContent$lambda$1;
                        CheckoutContent$lambda$1 = MRKMRCheckoutScreenKt.CheckoutContent$lambda$1(str, str2, str3, z, modifier3, focusManager, z2, function1, function12, function13, function0, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return CheckoutContent$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i5 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckoutContent$lambda$0$0$0(FocusManager focusManager, Function0 function0) {
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckoutTextField(final String input, final Function1<? super String, Unit> onInputChange, final String labelText, Modifier modifier, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        KeyboardOptions keyboardOptions2;
        int i7;
        Composer composer2;
        final KeyboardActions keyboardActions2;
        final Modifier modifier3;
        final boolean z5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(onInputChange, "onInputChange");
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Composer startRestartGroup = composer.startRestartGroup(1319539209);
        ComposerKt.sourceInformation(startRestartGroup, "C(CheckoutTextField)N(input,onInputChange,labelText,modifier,enabled,isError,keyboardOptions,keyboardActions)194@7065L138,206@7489L11,207@7562L11,208@7628L11,209@7698L11,210@7768L11,211@7838L11,212@7905L11,213@7974L11,214@8044L11,205@7431L643,189@6912L1169:MRKMRCheckoutScreen.kt#v79pgw");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(input) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onInputChange) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(labelText) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        keyboardOptions2 = keyboardOptions;
                        i3 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            keyboardActions2 = keyboardActions;
                            modifier3 = modifier2;
                            z5 = z3;
                        } else {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i4 != 0 ? true : z3;
                            boolean z7 = i5 != 0 ? false : z4;
                            KeyboardOptions keyboardOptions3 = i6 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                            KeyboardActions keyboardActions3 = i7 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1319539209, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.CheckoutTextField (MRKMRCheckoutScreen.kt:188)");
                            }
                            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-692994781, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.MRKMRCheckoutScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit CheckoutTextField$lambda$0;
                                    CheckoutTextField$lambda$0 = MRKMRCheckoutScreenKt.CheckoutTextField$lambda$0(labelText, (Composer) obj, ((Integer) obj2).intValue());
                                    return CheckoutTextField$lambda$0;
                                }
                            }, startRestartGroup, 54);
                            RoundedCornerShape m1284RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(14));
                            composer2 = startRestartGroup;
                            int i9 = i3;
                            TextFieldColors m2798colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2798colors0hiis_0(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurface(), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurface(), 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOutline(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, 0, 0, 3072, 2122311372, 4095);
                            int i10 = i9 >> 3;
                            int i11 = (i9 & 14) | 1572864 | (i9 & 112) | (i10 & 896) | (i10 & 7168);
                            int i12 = ((i9 >> 6) & 7168) | 12582912 | (458752 & i10) | (i10 & 3670016);
                            KeyboardActions keyboardActions4 = keyboardActions3;
                            Modifier modifier4 = companion;
                            z4 = z7;
                            keyboardOptions2 = keyboardOptions3;
                            boolean z8 = z6;
                            OutlinedTextFieldKt.OutlinedTextField(input, onInputChange, modifier4, z8, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) rememberComposableLambda, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, z4, (VisualTransformation) null, keyboardOptions2, keyboardActions4, true, 0, 0, (MutableInteractionSource) null, (Shape) m1284RoundedCornerShape0680j_4, m2798colors0hiis_0, composer2, i11, i12, 0, 1859504);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z5 = z8;
                            keyboardActions2 = keyboardActions4;
                        }
                        final boolean z9 = z4;
                        final KeyboardOptions keyboardOptions4 = keyboardOptions2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.MRKMRCheckoutScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit CheckoutTextField$lambda$1;
                                    CheckoutTextField$lambda$1 = MRKMRCheckoutScreenKt.CheckoutTextField$lambda$1(input, onInputChange, labelText, modifier3, z5, z9, keyboardOptions4, keyboardActions2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return CheckoutTextField$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    keyboardOptions2 = keyboardOptions;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    final boolean z92 = z4;
                    final KeyboardOptions keyboardOptions42 = keyboardOptions2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                keyboardOptions2 = keyboardOptions;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                final boolean z922 = z4;
                final KeyboardOptions keyboardOptions422 = keyboardOptions2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            keyboardOptions2 = keyboardOptions;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            final boolean z9222 = z4;
            final KeyboardOptions keyboardOptions4222 = keyboardOptions2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        keyboardOptions2 = keyboardOptions;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        final boolean z92222 = z4;
        final KeyboardOptions keyboardOptions42222 = keyboardOptions2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckoutTextField$lambda$0(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C197@7157L10,195@7079L114:MRKMRCheckoutScreen.kt#v79pgw");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-692994781, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.CheckoutTextField.<anonymous> (MRKMRCheckoutScreen.kt:195)");
            }
            TextKt.m3259TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final MRKMRDataUiState<MRKMROrderEntity> CheckoutScreen$lambda$0(State<? extends MRKMRDataUiState<MRKMROrderEntity>> state) {
        return state.getValue();
    }

    private static final boolean CheckoutScreen$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean CheckoutScreen$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
