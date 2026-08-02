package com.stripe.android.financialconnections.features.manualentry;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextKt;
import androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.room.Room;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.favorites.components.ListFavoritesViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.shopping.views.ProductSearchViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.views.ShoppingWebContainerViewKt$$ExternalSyntheticLambda0;
import com.squareup.scannerview.ScannerView;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.features.reset.ResetScreenKt$$ExternalSyntheticLambda2;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class ManualEntryScreenKt {

    /* renamed from: lambda$-1128705666, reason: not valid java name */
    public static final ComposableLambdaImpl f807lambda$1128705666 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(9), false, -1128705666);

    public static final void AccountForm(boolean z, String str, Integer num, Function1 function1, String str2, Integer num2, Function1 function12, String str3, Integer num3, Function1 function13, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1215456808);
        int i2 = i | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(num) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024) | (gapComposer.changed(str2) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(num2) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function12) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(str3) ? 8388608 : 4194304) | (gapComposer.changed(num3) ? 67108864 : 33554432) | (gapComposer.changedInstance(function13) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer.shouldExecute(i2 & 1, (306783379 & i2) != 306783378)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            int i3 = (i2 & 14) | 24576;
            InputWithError(z, str, num, R.string.stripe_manualentry_routing, "RoutingInput", function1, gapComposer, (i2 & 112) | i3 | (i2 & 896) | ((i2 << 6) & 458752));
            int i4 = i2 >> 9;
            InputWithError(z, str2, num2, R.string.stripe_manualentry_account, "AccountInput", function12, gapComposer, (i4 & 896) | (i4 & 112) | i3 | ((i2 >> 3) & 458752));
            int i5 = i2 >> 18;
            InputWithError(z, str3, num3, R.string.stripe_manualentry_accountconfirm, "ConfirmAccountInput", function13, gapComposer, (i5 & 896) | (i5 & 112) | i3 | ((i2 >> 12) & 458752));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListFavoritesViewKt$$ExternalSyntheticLambda16(z, str, num, function1, str2, num2, function12, str3, num3, function13, i);
        }
    }

    public static final void ErrorMessage(Throwable th, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(672431123);
        int i2 = (gapComposer2.changedInstance(th) ? 4 : 2) | i;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            StripeException stripeException = th instanceof StripeException ? (StripeException) th : null;
            String message = stripeException != null ? stripeException.getMessage() : null;
            if (message == null) {
                message = re$$ExternalSyntheticOutline0.m(gapComposer2, 1961221318, R.string.stripe_error_generic_title, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(1961219706);
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            TextKt.m509Text4IGK_g(message, fillMaxWidth, ((FinancialConnectionsColors) gapComposer2.consume(ThemeKt.LocalColors)).textCritical, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer2.consume(ThemeKt.LocalTypography)).bodyMedium, gapComposer, 48, 0, 65016);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda5(th, i, 14);
        }
    }

    public static final void InputWithError(boolean z, String str, Integer num, int i, String str2, Function1 function1, Composer composer, int i2) {
        String str3;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(221756411);
        int i3 = (gapComposer2.changed(z) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(num) ? 256 : 128;
        }
        int i4 = i3 | (gapComposer2.changed(i) ? 2048 : 1024);
        if ((196608 & i2) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer2.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer2, 6);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 3, 0, (Boolean) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            boolean z2 = num != null;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MarkdownParser$$ExternalSyntheticLambda0(27);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue);
            str3 = str2;
            com.stripe.android.financialconnections.ui.components.TextKt.FinancialConnectionsOutlinedTextField(str, z, TestTagKt.testTag(semantics, str3), function1, z2, keyboardOptions, null, Expect_jvmKt.rememberComposableLambda(777987353, new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i, 15), gapComposer2), null, null, null, gapComposer2, ((i4 >> 3) & 14) | 102236160 | ((i4 << 3) & 112) | ((i4 >> 6) & 7168), 0, 7824);
            gapComposer = gapComposer2;
            if (num != null) {
                gapComposer.startReplaceGroup(716778351);
                TextKt.m509Text4IGK_g(Room.stringResource(gapComposer, num.intValue()), null, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textCritical, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelSmall, gapComposer, 0, 0, 65530);
            } else {
                gapComposer.startReplaceGroup(705264765);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            str3 = str2;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(z, str, num, i, str3, function1, i2);
        }
    }

    public static final void ManualEntryContent(String str, Integer num, String str2, Integer num2, String str3, Integer num3, boolean z, Async async, Async async2, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function0 function02, Composer composer, int i) {
        boolean z2;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1757899721);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(num) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128) | (gapComposer.changed(num2) ? 2048 : 1024);
        boolean changed = gapComposer.changed(str3);
        int i3 = PKIFailureInfo.certRevoked;
        int i4 = i2 | (changed ? 16384 : 8192) | (gapComposer.changed(num3) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(async) ? 8388608 : 4194304) | (gapComposer.changed(async2) ? 67108864 : 33554432) | (gapComposer.changedInstance(function1) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i5 = (gapComposer.changedInstance(function12) ? 4 : 2) | (gapComposer.changedInstance(function13) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(function14) ? 2048 : 1024);
        if (gapComposer.changedInstance(function02)) {
            i3 = 16384;
        }
        int i6 = i5 | i3;
        if (gapComposer.shouldExecute(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
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
            if ((async instanceof Async.Loading) || Intrinsics.areEqual(async, Async.Uninitialized.INSTANCE)) {
                gapComposer.startReplaceGroup(1099807767);
                ListItemKt.FullScreenGenericLoading(gapComposer, 0);
                gapComposer.end(false);
            } else if (async instanceof Async.Fail) {
                gapComposer.startReplaceGroup(1099809406);
                boolean z4 = ((i6 & 7168) == 2048) | ((i4 & 29360128) == 8388608);
                Object rememberedValue = gapComposer.rememberedValue();
                if (z4 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ResetScreenKt$$ExternalSyntheticLambda2(function14, async, 3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                z2 = true;
                ListItemKt.UnclassifiedErrorContent(false, (Function0) rememberedValue, gapComposer, 0, 1);
                gapComposer.end(false);
                gapComposer.end(z2);
            } else {
                if (!(async instanceof Async.Success)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1099806982, false);
                }
                gapComposer.startReplaceGroup(-265529073);
                ManualEntryState.Payload payload = (ManualEntryState.Payload) ((Async.Success) async).value;
                boolean z5 = payload.customManualEntry;
                if (z5) {
                    gapComposer.startReplaceGroup(1099814295);
                    ListItemKt.FullScreenGenericLoading(gapComposer, 0);
                    gapComposer.end(false);
                    z3 = false;
                } else {
                    if (z5) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1099813203, false);
                    }
                    gapComposer.startReplaceGroup(-265420914);
                    int i7 = i4 << 6;
                    int i8 = i6 >> 3;
                    ManualEntryLoaded(payload, async2, str, num, str2, num2, str3, num3, function1, function12, function13, z, function0, function02, gapComposer, (i7 & 896) | ((i4 >> 21) & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | ((i4 >> 3) & 234881024) | ((i6 << 27) & 1879048192), (i6 & 896) | (i8 & 14) | ((i4 >> 15) & 112) | (i8 & 7168));
                    z3 = false;
                    gapComposer.end(false);
                }
                gapComposer.end(z3);
            }
            z2 = true;
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShoppingWebContainerViewKt$$ExternalSyntheticLambda0(str, num, str2, num2, str3, num3, z, async, async2, function1, function12, function13, function0, function14, function02, i);
        }
    }

    public static final void ManualEntryFooter(boolean z, boolean z2, Function0 function0, Composer composer, int i) {
        boolean z3;
        boolean z4;
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1245181295);
        int i2 = (gapComposer.changed(z) ? 4 : 2) | i | (gapComposer.changed(z2) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            int i3 = ((i2 >> 6) & 14) | 1572912;
            int i4 = i2 << 12;
            int i5 = i3 | (57344 & i4) | (i4 & 458752);
            z3 = z;
            z4 = z2;
            function02 = function0;
            com.stripe.android.financialconnections.ui.components.TextKt.FinancialConnectionsButton(function02, SizeKt.fillMaxWidth(companion, 1.0f), null, null, z3, z4, f807lambda$1128705666, gapComposer, i5, 12);
            gapComposer.end(true);
        } else {
            z3 = z;
            z4 = z2;
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProductSearchViewKt$$ExternalSyntheticLambda0(z3, z4, function02, i);
        }
    }

    public static final void ManualEntryLoaded(final ManualEntryState.Payload payload, final Async async, String str, final Integer num, String str2, final Integer num2, final String str3, final Integer num3, final Function1 function1, final Function1 function12, final Function1 function13, boolean z, Function0 function0, final Function0 function02, Composer composer, int i, int i2) {
        int i3;
        String str4;
        String str5;
        int i4;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-877904560);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(payload) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(async) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            str4 = str;
            i3 |= gapComposer2.changed(str4) ? 256 : 128;
        } else {
            str4 = str;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(num) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str5 = str2;
            i3 |= gapComposer2.changed(str5) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            str5 = str2;
        }
        if ((i & 196608) == 0) {
            i3 |= gapComposer2.changed(num2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= gapComposer2.changed(str3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i3 |= gapComposer2.changed(num3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer2.changedInstance(function12) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changedInstance(function13) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(z) ? 32 : 16;
        }
        int i5 = i4 | (gapComposer2.changedInstance(function0) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i5 |= gapComposer2.changedInstance(function02) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            final boolean z2 = async instanceof Async.Loading;
            final String str6 = str5;
            final String str7 = str4;
            gapComposer = gapComposer2;
            LayoutKt.Layout(null, null, false, null, false, ImageKt.rememberScrollState(gapComposer2), Expect_jvmKt.rememberComposableLambda(-1557836879, new ProductSearchViewKt$$ExternalSyntheticLambda0(z, z2, function0), gapComposer2), Expect_jvmKt.rememberComposableLambda(1284592512, new Function3() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((ColumnScope) obj).getClass();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        SpacerKt.Spacer(gapComposer3, SizeKt.m285size3ABfNKs(companion, 8.0f));
                        ManualEntryScreenKt.Title(gapComposer3, 0);
                        SpacerKt.Spacer(gapComposer3, SizeKt.m285size3ABfNKs(companion, 16.0f));
                        ManualEntryState.Payload payload2 = ManualEntryState.Payload.this;
                        if (payload2.verifyWithMicrodeposits) {
                            gapComposer3.startReplaceGroup(1137101123);
                            SpacerKt.Spacer(gapComposer3, SizeKt.m285size3ABfNKs(companion, 8.0f));
                            i6 = 1130751362;
                            TextKt.m509Text4IGK_g(Room.stringResource(gapComposer3, R.string.stripe_manualentry_microdeposits_desc), null, ((FinancialConnectionsColors) gapComposer3.consume(ThemeKt.LocalColors)).textDefault, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer3.consume(ThemeKt.LocalTypography)).bodyMedium, gapComposer3, 0, 0, 65530);
                            gapComposer3 = gapComposer3;
                        } else {
                            i6 = 1130751362;
                            gapComposer3.startReplaceGroup(1130751362);
                        }
                        gapComposer3.end(false);
                        boolean z3 = payload2.testMode;
                        boolean z4 = z2;
                        if (z3) {
                            gapComposer3.startReplaceGroup(1137482702);
                            SpacerKt.Spacer(gapComposer3, SizeKt.m285size3ABfNKs(companion, 8.0f));
                            com.stripe.android.financialconnections.ui.components.TextKt.TestModeBanner(0, gapComposer3, null, Room.stringResource(gapComposer3, R.string.stripe_manualentry_test_banner), null, function02, !z4);
                        } else {
                            gapComposer3.startReplaceGroup(i6);
                        }
                        gapComposer3.end(false);
                        SpacerKt.Spacer(gapComposer3, SizeKt.m285size3ABfNKs(companion, 24.0f));
                        GapComposer gapComposer4 = gapComposer3;
                        ManualEntryScreenKt.AccountForm(!z4, str7, num, function1, str6, num2, function12, str3, num3, function13, gapComposer4, 0);
                        Async async2 = async;
                        if (async2 instanceof Async.Fail) {
                            gapComposer4.startReplaceGroup(1138400798);
                            SpacerKt.Spacer(gapComposer4, SizeKt.m285size3ABfNKs(companion, 16.0f));
                            ManualEntryScreenKt.ErrorMessage(((Async.Fail) async2).error, gapComposer4, 0);
                        } else {
                            gapComposer4.startReplaceGroup(i6);
                        }
                        gapComposer4.end(false);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer, 905969664, 127);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OutlinedTextFieldKt$$ExternalSyntheticLambda3(payload, async, str, num, str2, num2, str3, num3, function1, function12, function13, z, function0, function02, i, i2);
        }
    }

    public static final void ManualEntryScreen(Composer composer, int i) {
        GapComposer gapComposer;
        Async async;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1219089844);
        if (gapComposer2.shouldExecute(i & 1, i != 0)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer2).getViewModel().activityRetainedComponent;
            FinancialConnectionsSessionManifest.Pane pane = ManualEntryViewModel.PANE;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, 5);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(ManualEntryViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer2);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ManualEntryViewModel manualEntryViewModel = (ManualEntryViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(ManualEntryViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer2));
            FinancialConnectionsSheetNativeViewModel parentViewModel = TaskUtil.parentViewModel(gapComposer2);
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(manualEntryViewModel.stateFlow, gapComposer2);
            MutableState collectAsState2 = StateFlowsComposeKt.collectAsState(manualEntryViewModel.form, gapComposer2);
            String str = (String) manualEntryViewModel._routing$delegate.getValue();
            String str2 = str == null ? "" : str;
            Integer routingError = ((ManualEntryFormState) collectAsState2.getValue()).getRoutingError();
            String str3 = (String) manualEntryViewModel._account$delegate.getValue();
            String str4 = str3 == null ? "" : str3;
            Integer accountError = ((ManualEntryFormState) collectAsState2.getValue()).getAccountError();
            String str5 = (String) manualEntryViewModel._accountConfirm$delegate.getValue();
            String str6 = str5 == null ? "" : str5;
            Integer accountConfirmError = ((ManualEntryFormState) collectAsState2.getValue()).getAccountConfirmError();
            ManualEntryFormState manualEntryFormState = (ManualEntryFormState) collectAsState2.getValue();
            boolean z = manualEntryFormState.routing != null && manualEntryFormState.account != null && manualEntryFormState.accountConfirm != null && manualEntryFormState.getRoutingError() == null && manualEntryFormState.getAccountError() == null && manualEntryFormState.getAccountConfirmError() == null;
            Async async2 = ((ManualEntryState) collectAsState.getValue()).payload;
            Async async3 = ((ManualEntryState) collectAsState.getValue()).linkPaymentAccount;
            boolean changedInstance = gapComposer2.changedInstance(manualEntryViewModel);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, manualEntryViewModel, ManualEntryViewModel.class, "onRoutingEntered", "onRoutingEntered(Ljava/lang/String;)V", 0, 7);
                gapComposer2.updateRememberedValue(textFieldUIKt$TextField$4$1);
                rememberedValue = textFieldUIKt$TextField$4$1;
            }
            KFunction kFunction = (KFunction) rememberedValue;
            boolean changedInstance2 = gapComposer2.changedInstance(manualEntryViewModel);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$12 = new TextFieldUIKt$TextField$4$1(1, manualEntryViewModel, ManualEntryViewModel.class, "onAccountEntered", "onAccountEntered(Ljava/lang/String;)V", 0, 8);
                gapComposer2.updateRememberedValue(textFieldUIKt$TextField$4$12);
                rememberedValue2 = textFieldUIKt$TextField$4$12;
            }
            KFunction kFunction2 = (KFunction) rememberedValue2;
            boolean changedInstance3 = gapComposer2.changedInstance(manualEntryViewModel);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$13 = new TextFieldUIKt$TextField$4$1(1, manualEntryViewModel, ManualEntryViewModel.class, "onAccountConfirmEntered", "onAccountConfirmEntered(Ljava/lang/String;)V", 0, 9);
                gapComposer2.updateRememberedValue(textFieldUIKt$TextField$4$13);
                rememberedValue3 = textFieldUIKt$TextField$4$13;
            }
            KFunction kFunction3 = (KFunction) rememberedValue3;
            boolean changedInstance4 = gapComposer2.changedInstance(manualEntryViewModel);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                ScannerView.AnonymousClass1 anonymousClass1 = new ScannerView.AnonymousClass1(0, manualEntryViewModel, ManualEntryViewModel.class, "onSubmit", "onSubmit()V", 0, 22);
                gapComposer2.updateRememberedValue(anonymousClass1);
                rememberedValue4 = anonymousClass1;
            }
            KFunction kFunction4 = (KFunction) rememberedValue4;
            boolean changedInstance5 = gapComposer2.changedInstance(manualEntryViewModel);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changedInstance5 || rememberedValue5 == neverEqualPolicy) {
                ScannerView.AnonymousClass1 anonymousClass12 = new ScannerView.AnonymousClass1(0, manualEntryViewModel, ManualEntryViewModel.class, "onTestFill", "onTestFill()V", 0, 23);
                gapComposer2.updateRememberedValue(anonymousClass12);
                rememberedValue5 = anonymousClass12;
            }
            KFunction kFunction5 = (KFunction) rememberedValue5;
            boolean changedInstance6 = gapComposer2.changedInstance(parentViewModel);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance6 || rememberedValue6 == neverEqualPolicy) {
                async = async3;
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$14 = new TextFieldUIKt$TextField$4$1(1, parentViewModel, FinancialConnectionsSheetNativeViewModel.class, "onCloseFromErrorClick", "onCloseFromErrorClick(Ljava/lang/Throwable;)V", 0, 10);
                gapComposer2.updateRememberedValue(textFieldUIKt$TextField$4$14);
                rememberedValue6 = textFieldUIKt$TextField$4$14;
            } else {
                async = async3;
            }
            String str7 = str2;
            gapComposer = gapComposer2;
            Async async4 = async;
            ManualEntryContent(str7, routingError, str4, accountError, str6, accountConfirmError, z, async2, async4, (Function1) kFunction, (Function1) kFunction2, (Function1) kFunction3, (Function0) kFunction4, (Function1) ((KFunction) rememberedValue6), (Function0) kFunction5, gapComposer, 0);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitViewModel$$ExternalSyntheticLambda0(i, 22);
        }
    }

    public static final void Title(Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(492801228);
        if (gapComposer2.shouldExecute(i & 1, i != 0)) {
            gapComposer = gapComposer2;
            TextKt.m509Text4IGK_g(Room.stringResource(gapComposer2, R.string.stripe_manualentry_title), SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), ((FinancialConnectionsColors) gapComposer2.consume(ThemeKt.LocalColors)).textDefault, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer2.consume(ThemeKt.LocalTypography)).headingXLarge, gapComposer, 48, 0, 65528);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitViewModel$$ExternalSyntheticLambda0(i, 21);
        }
    }
}
