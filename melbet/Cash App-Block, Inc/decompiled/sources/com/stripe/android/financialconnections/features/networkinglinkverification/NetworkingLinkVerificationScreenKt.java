package com.stripe.android.financialconnections.features.networkinglinkverification;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
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
import androidx.compose.ui.text.TextStyle;
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
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda12;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes8.dex */
public abstract class NetworkingLinkVerificationScreenKt {
    public static final ComposableLambdaImpl lambda$1193599160 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(10), false, 1193599160);

    public static final void Header(NetworkingLinkVerificationState.Payload payload, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1436553127);
        int i2 = i | (gapComposer.changed(payload) ? 4 : 2);
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
            String stringResource = Room.stringResource(gapComposer, R.string.stripe_networking_verification_title);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalTypography;
            TextStyle textStyle = ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).headingXLarge;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ThemeKt.LocalColors;
            TextKt.m509Text4IGK_g(stringResource, null, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal2)).textDefault, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, gapComposer, 0, 0, 65530);
            TextKt.m509Text4IGK_g(Room.stringResource(R.string.stripe_networking_verification_desc, new Object[]{payload.phoneNumber}, gapComposer), null, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal2)).textDefault, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, gapComposer, 0, 0, 65530);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda5(payload, i, 17);
        }
    }

    public static final void NetworkingLinkVerificationContent(NetworkingLinkVerificationState networkingLinkVerificationState, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1923157657);
        int i2 = (gapComposer.changed(networkingLinkVerificationState) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
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
            Async async = networkingLinkVerificationState.payload;
            if (Intrinsics.areEqual(async, Async.Uninitialized.INSTANCE) || (async instanceof Async.Loading)) {
                gapComposer.startReplaceGroup(87673671);
                ListItemKt.FullScreenGenericLoading(gapComposer, 0);
                gapComposer.end(false);
            } else if (async instanceof Async.Success) {
                gapComposer.startReplaceGroup(-1577025027);
                NetworkingLinkVerificationLoaded(networkingLinkVerificationState.confirmVerification, (NetworkingLinkVerificationState.Payload) ((Async.Success) async).value, function1, gapComposer, (i2 << 3) & 896);
                gapComposer.end(false);
            } else {
                if (!(async instanceof Async.Fail)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 87671596, false);
                }
                gapComposer.startReplaceGroup(87683118);
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(async);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ResetScreenKt$$ExternalSyntheticLambda2(function1, async, 5);
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
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(networkingLinkVerificationState, function1, i, 22);
        }
    }

    public static final void NetworkingLinkVerificationLoaded(Async async, NetworkingLinkVerificationState.Payload payload, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Object networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1;
        FocusRequester focusRequester;
        NeverEqualPolicy neverEqualPolicy;
        Arrangement$SpacedAligned arrangement$SpacedAligned;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1781283273);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(async) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer2.changed(payload) : gapComposer2.changedInstance(payload) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
            }
            FocusRequester focusRequester2 = (FocusRequester) rememberedValue;
            Object[] objArr = new Object[0];
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new Body$$ExternalSyntheticLambda0(4);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer2, 48);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer2.startReplaceGroup(-1888598267);
                Unit unit = Unit.INSTANCE;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy2) {
                    rememberedValue3 = new SsnViewKt$SsnContent$3$1$1(focusRequester2, null, 8);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue3);
            } else {
                gapComposer2.startReplaceGroup(-1892807509);
            }
            gapComposer2.end(false);
            int i4 = i3 & 14;
            boolean changedInstance = (i4 == 4) | gapComposer2.changedInstance(focusOwnerImpl) | gapComposer2.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy2) {
                focusRequester = focusRequester2;
                neverEqualPolicy = neverEqualPolicy2;
                networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1 = new NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1(async, focusOwnerImpl, delegatingSoftwareKeyboardController, null, 0);
                gapComposer2.updateRememberedValue(networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1);
            } else {
                focusRequester = focusRequester2;
                networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1 = rememberedValue4;
                neverEqualPolicy = neverEqualPolicy2;
            }
            Updater.LaunchedEffect(gapComposer2, async, (Function2) networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1);
            if (!(async instanceof Async.Fail) || (((Async.Fail) async).error instanceof ConfirmVerification.OTPError)) {
                gapComposer2.startReplaceGroup(-1888109056);
                Arrangement$SpacedAligned arrangement$SpacedAligned2 = new Arrangement$SpacedAligned(24.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                boolean changed = ((i3 & 112) == 32 || ((i3 & 64) != 0 && gapComposer2.changedInstance(payload))) | (i4 == 4) | gapComposer2.changed(mutableState);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (changed || rememberedValue5 == neverEqualPolicy) {
                    arrangement$SpacedAligned = arrangement$SpacedAligned2;
                    OpenSourceKt$$ExternalSyntheticLambda9 openSourceKt$$ExternalSyntheticLambda9 = new OpenSourceKt$$ExternalSyntheticLambda9(async, payload, focusRequester, mutableState, 17);
                    gapComposer2.updateRememberedValue(openSourceKt$$ExternalSyntheticLambda9);
                    rememberedValue5 = openSourceKt$$ExternalSyntheticLambda9;
                } else {
                    arrangement$SpacedAligned = arrangement$SpacedAligned2;
                }
                LayoutKt.LazyLayout(null, null, false, false, false, arrangement$SpacedAligned, false, null, null, (Function1) rememberedValue5, gapComposer2, 196608, 479);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1888243255);
                boolean z = ((i3 & 896) == 256) | (i4 == 4);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (z || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new ResetScreenKt$$ExternalSyntheticLambda2(function1, async, 6);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                ListItemKt.UnclassifiedErrorContent(false, (Function0) rememberedValue6, gapComposer2, 0, 1);
                gapComposer2.end(false);
                gapComposer = gapComposer2;
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12((Object) async, (Object) payload, function1, i, 15);
        }
    }

    public static final void NetworkingLinkVerificationScreen(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1447580445);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            FinancialConnectionsSessionManifest.Pane pane = NetworkingLinkVerificationViewModel.PANE;
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, 8);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(NetworkingLinkVerificationViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel = (NetworkingLinkVerificationViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(NetworkingLinkVerificationViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            FinancialConnectionsSheetNativeViewModel parentViewModel = TaskUtil.parentViewModel(gapComposer);
            NetworkingLinkVerificationState networkingLinkVerificationState = (NetworkingLinkVerificationState) StateFlowsComposeKt.collectAsState(networkingLinkVerificationViewModel.stateFlow, gapComposer).getValue();
            boolean changedInstance = gapComposer.changedInstance(parentViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, parentViewModel, FinancialConnectionsSheetNativeViewModel.class, "onCloseFromErrorClick", "onCloseFromErrorClick(Ljava/lang/Throwable;)V", 0, 12);
                gapComposer.updateRememberedValue(textFieldUIKt$TextField$4$1);
                rememberedValue = textFieldUIKt$TextField$4$1;
            }
            NetworkingLinkVerificationContent(networkingLinkVerificationState, (Function1) ((KFunction) rememberedValue), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhoneNumberController$$ExternalSyntheticLambda5(i, 5);
        }
    }
}
