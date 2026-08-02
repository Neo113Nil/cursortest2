package com.stripe.android.financialconnections.features.networkingsavetolinkverification;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.squareup.cash.R;
import com.squareup.cash.blockers.views.SsnViewKt$SsnContent$3$1$1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda8;
import com.squareup.scannerview.ScannerView;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.features.reset.ResetScreenKt$$ExternalSyntheticLambda2;
import com.stripe.android.financialconnections.model.Body$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/* loaded from: classes8.dex */
public abstract class NetworkingSaveToLinkVerificationScreenKt {

    /* renamed from: lambda$-1966495693, reason: not valid java name */
    public static final ComposableLambdaImpl f808lambda$1966495693 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(11), false, -1966495693);
    public static final ComposableLambdaImpl lambda$1291129067 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(12), false, 1291129067);

    public static final void Header(NetworkingSaveToLinkVerificationState.Payload payload, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2107565545);
        int i2 = i | (gapComposer.changedInstance(payload) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer, R.string.stripe_networking_save_to_link_verification_title);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalTypography;
            TextKt.m509Text4IGK_g(stringResource, null, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).headingXLarge, gapComposer, 0, 0, 65530);
            TextKt.m509Text4IGK_g(Room.stringResource(R.string.stripe_networking_verification_desc, new Object[]{payload.phoneNumber}, gapComposer), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, gapComposer, 0, 0, JpegConstants.COM_MARKER);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda5(payload, i, 18);
        }
    }

    public static final void NetworkingSaveToLinkVerificationContent(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState, Function0 function0, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-88973549);
        int i2 = i | (gapComposer.changedInstance(networkingSaveToLinkVerificationState) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Async async = networkingSaveToLinkVerificationState.payload;
            if (Intrinsics.areEqual(async, Async.Uninitialized.INSTANCE) || (async instanceof Async.Loading)) {
                gapComposer.startReplaceGroup(-1787175821);
                ListItemKt.FullScreenGenericLoading(gapComposer, 0);
                gapComposer.end(false);
            } else if (async instanceof Async.Success) {
                gapComposer.startReplaceGroup(432184384);
                NetworkingSaveToLinkVerificationLoaded(networkingSaveToLinkVerificationState.confirmVerification, (NetworkingSaveToLinkVerificationState.Payload) ((Async.Success) async).value, function1, function0, gapComposer, (i2 & 896) | 64 | ((i2 << 6) & 7168));
                gapComposer.end(false);
            } else {
                if (!(async instanceof Async.Fail)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1787177847, false);
                }
                gapComposer.startReplaceGroup(-1787164806);
                boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(async);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ResetScreenKt$$ExternalSyntheticLambda2(function1, async, 7);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                ListItemKt.UnclassifiedErrorContent(false, (Function0) rememberedValue, gapComposer, 0, 1);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0((Object) networkingSaveToLinkVerificationState, (Object) function0, (Object) function1, i, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r18v2 */
    public static final void NetworkingSaveToLinkVerificationLoaded(Async async, NetworkingSaveToLinkVerificationState.Payload payload, Function1 function1, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer;
        boolean z;
        FocusRequester focusRequester;
        Continuation continuation;
        int i2;
        boolean z2;
        boolean z3;
        ?? r18;
        Arrangement$SpacedAligned arrangement$SpacedAligned;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1650371339);
        int i3 = (gapComposer2.changed(async) ? 4 : 2) | i | (gapComposer2.changedInstance(payload) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i3;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
            }
            FocusRequester focusRequester2 = (FocusRequester) rememberedValue;
            Object[] objArr = new Object[0];
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Body$$ExternalSyntheticLambda0(5);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer2, 48);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer2.startReplaceGroup(1722450769);
                Unit unit = Unit.INSTANCE;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new SsnViewKt$SsnContent$3$1$1(focusRequester2, null, 9);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue3);
                z = false;
            } else {
                z = false;
                gapComposer2.startReplaceGroup(1717825879);
            }
            gapComposer2.end(z);
            int i5 = i4 & 14;
            boolean changedInstance = (i5 == 4 ? true : z) | gapComposer2.changedInstance(focusOwnerImpl) | gapComposer2.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                focusRequester = focusRequester2;
                continuation = null;
                i2 = 3;
                rememberedValue4 = new NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1(async, focusOwnerImpl, delegatingSoftwareKeyboardController, null, 1);
                gapComposer2.updateRememberedValue(rememberedValue4);
            } else {
                continuation = null;
                i2 = 3;
                focusRequester = focusRequester2;
            }
            Updater.LaunchedEffect(gapComposer2, async, (Function2) rememberedValue4);
            int i6 = 10;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer2.startReplaceGroup(1722744401);
                Unit unit2 = Unit.INSTANCE;
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new SsnViewKt$SsnContent$3$1$1(focusRequester, continuation, 10);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue5);
                z2 = false;
            } else {
                z2 = false;
                gapComposer2.startReplaceGroup(1717825879);
            }
            gapComposer2.end(z2);
            if (!(async instanceof Async.Fail) || (((Async.Fail) async).error instanceof ConfirmVerification.OTPError)) {
                gapComposer2.startReplaceGroup(1723087385);
                Arrangement$SpacedAligned arrangement$SpacedAligned2 = new Arrangement$SpacedAligned(24.0f, true, new Drop$$ExternalSyntheticBUOutline0(i2));
                if (payload.showNotNowButton) {
                    gapComposer2.startReplaceGroup(1724209182);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1656395436, new ShiftListViewKt$$ExternalSyntheticLambda8(i6, function0), gapComposer2);
                    z3 = false;
                    gapComposer2.end(false);
                    r18 = rememberComposableLambda;
                } else {
                    z3 = false;
                    gapComposer2.startReplaceGroup(1724670803);
                    gapComposer2.end(false);
                    r18 = continuation;
                }
                boolean changed = (((i4 & 112) == 32 || gapComposer2.changedInstance(payload)) ? true : z3) | (i5 == 4 ? true : z3) | gapComposer2.changed(mutableState);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (changed || rememberedValue6 == neverEqualPolicy) {
                    arrangement$SpacedAligned = arrangement$SpacedAligned2;
                    OpenSourceKt$$ExternalSyntheticLambda9 openSourceKt$$ExternalSyntheticLambda9 = new OpenSourceKt$$ExternalSyntheticLambda9(async, payload, focusRequester, mutableState, 18);
                    gapComposer2.updateRememberedValue(openSourceKt$$ExternalSyntheticLambda9);
                    rememberedValue6 = openSourceKt$$ExternalSyntheticLambda9;
                } else {
                    arrangement$SpacedAligned = arrangement$SpacedAligned2;
                }
                LayoutKt.LazyLayout(null, null, false, false, false, arrangement$SpacedAligned, false, rememberLazyListState, r18, (Function1) rememberedValue6, gapComposer2, 196608, 95);
                gapComposer = gapComposer2;
                gapComposer.end(z3);
            } else {
                gapComposer2.startReplaceGroup(1722924821);
                boolean z4 = (i5 == 4) | ((i4 & 896) == 256);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (z4 || rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = new ResetScreenKt$$ExternalSyntheticLambda2(function1, async, 8);
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                ListItemKt.UnclassifiedErrorContent(false, (Function0) rememberedValue7, gapComposer2, 0, 1);
                gapComposer2.end(false);
                gapComposer = gapComposer2;
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda1(async, payload, function1, function0, i, 9);
        }
    }

    public static final void NetworkingSaveToLinkVerificationScreen(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1788942795);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            FinancialConnectionsSessionManifest.Pane pane = NetworkingSaveToLinkVerificationViewModel.PANE;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, 9);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(NetworkingSaveToLinkVerificationViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel = (NetworkingSaveToLinkVerificationViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(NetworkingSaveToLinkVerificationViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            FinancialConnectionsSheetNativeViewModel parentViewModel = TaskUtil.parentViewModel(gapComposer);
            NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState = (NetworkingSaveToLinkVerificationState) StateFlowsComposeKt.collectAsState(networkingSaveToLinkVerificationViewModel.stateFlow, gapComposer).getValue();
            boolean changedInstance = gapComposer.changedInstance(parentViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, parentViewModel, FinancialConnectionsSheetNativeViewModel.class, "onCloseFromErrorClick", "onCloseFromErrorClick(Ljava/lang/Throwable;)V", 0, 13);
                gapComposer.updateRememberedValue(textFieldUIKt$TextField$4$1);
                rememberedValue = textFieldUIKt$TextField$4$1;
            }
            KFunction kFunction = (KFunction) rememberedValue;
            boolean changedInstance2 = gapComposer.changedInstance(networkingSaveToLinkVerificationViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                ScannerView.AnonymousClass1 anonymousClass1 = new ScannerView.AnonymousClass1(0, networkingSaveToLinkVerificationViewModel, NetworkingSaveToLinkVerificationViewModel.class, "onSkipClick", "onSkipClick()V", 0, 28);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue2 = anonymousClass1;
            }
            NetworkingSaveToLinkVerificationContent(networkingSaveToLinkVerificationState, (Function0) ((KFunction) rememberedValue2), (Function1) kFunction, gapComposer, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhoneNumberController$$ExternalSyntheticLambda5(i, 8);
        }
    }
}
