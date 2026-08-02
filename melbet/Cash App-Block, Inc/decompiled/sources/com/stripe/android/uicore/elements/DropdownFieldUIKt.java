package com.stripe.android.uicore.elements;

import android.content.Context;
import androidx.camera.core.LegacySessionConfig;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.DefaultTextFieldColors;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.datadog.trace.core.LongRunningTracesTracker;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzei;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda11;
import com.squareup.cash.blockers.views.PasscodeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.cdf.cashtagprovisioning.ErrorSource;
import com.squareup.cash.fidesmo.api.CdfErrorSource;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningError;
import com.squareup.cash.fidesmo.presenters.ProvisioningErrorType;
import com.squareup.cash.maps.views.MapMarkerPropertiesKt$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda6;
import com.squareup.util.cash.Countries;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.FormInsets;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.compat.CompatTextFieldKt;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class DropdownFieldUIKt {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropDown(LegacySessionConfig legacySessionConfig, Modifier modifier, boolean z, Composer composer, int i, int i2) {
        boolean z2;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        String str;
        Modifier.Companion companion;
        boolean z4;
        MutableState mutableState;
        Modifier.Companion companion2;
        NeverEqualPolicy neverEqualPolicy;
        long j;
        boolean z5;
        Modifier then;
        legacySessionConfig.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(958043205);
        Applier applier = gapComposer.applier;
        int i3 = (gapComposer.changedInstance(legacySessionConfig) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(true) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 2048 : 1024;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                boolean z6 = i4 != 0 ? true : z2;
                StateFlowImpl stateFlowImpl = (StateFlowImpl) legacySessionConfig.featureSelectionListener;
                boolean z7 = legacySessionConfig.isLegacy;
                StateFlowImpl stateFlowImpl2 = (StateFlowImpl) legacySessionConfig.requiredFeatureGroup;
                MutableState collectAsState = StateFlowsComposeKt.collectAsState(stateFlowImpl, gapComposer);
                MutableState collectAsState2 = StateFlowsComposeKt.collectAsState(stateFlowImpl2, gapComposer);
                ArrayList arrayList = (ArrayList) legacySessionConfig.preferredFeatureGroup;
                arrayList.size();
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy2) {
                    rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState2 = (MutableState) rememberedValue;
                MutableState collectAsState3 = StateFlowsComposeKt.collectAsState((FlowToStateFlow) legacySessionConfig.featureSelectionListenerExecutor, gapComposer);
                boolean changed = gapComposer.changed((Integer) StateFlowsComposeKt.collectAsState(stateFlowImpl2, gapComposer).getValue());
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy2) {
                    Integer num = (Integer) collectAsState2.getValue();
                    if (num != null) {
                        SubtreeManager subtreeManager = (SubtreeManager) legacySessionConfig.effects;
                        Country country = (Country) CollectionsKt.getOrNull(num.intValue(), (ArrayList) subtreeManager.interceptor);
                        if (country != null && (str = (String) ((Function1) subtreeManager.emitActionToParent).invoke(country)) != null) {
                            rememberedValue2 = str;
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                    }
                    rememberedValue2 = "";
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                String str2 = (String) rememberedValue2;
                gapComposer.startReplaceGroup(1008286087);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = StripeThemeKt.LocalColors;
                long j2 = ((StripeColors) gapComposer.consume(staticProvidableCompositionLocal)).onComponent;
                gapComposer.end(false);
                BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion3, biasAlignment, 2);
                long j3 = ((StripeColors) gapComposer.consume(staticProvidableCompositionLocal)).component;
                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                Modifier then2 = ImageKt.m177backgroundbw27NRU(wrapContentSize$default, j3, rectangleShapeKt$RectangleShape$1).then(modifier);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m574initimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                gapComposer.startReplaceGroup(-1404984745);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy2) {
                    companion = companion3;
                    rememberedValue3 = new StripeApiRepository$$ExternalSyntheticLambda5(27);
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    companion = companion3;
                }
                Modifier focusProperties = FocusOwnerImplKt.focusProperties((Function1) rememberedValue3);
                String stringResource = Room.stringResource(gapComposer, R.string.stripe_change);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy2) {
                    rememberedValue4 = new WalletHomeViewKt$$ExternalSyntheticLambda6(20, mutableState2);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(focusProperties, true, stringResource, null, (Function0) rememberedValue4, 12);
                if (((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    gapComposer.startReplaceGroup(1708171278);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy2) {
                        rememberedValue5 = new WalletHomeViewKt$$ExternalSyntheticLambda6(21, mutableState2);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    m183clickableoSLSa3U$default = SelectableKt.m335selectableoSLSa3U$default(m183clickableoSLSa3U$default, false, true, null, (Function0) rememberedValue5, 12);
                    z4 = false;
                    gapComposer.end(false);
                } else {
                    z4 = false;
                    gapComposer.startReplaceGroup(1708414225);
                    gapComposer.end(false);
                }
                Modifier modifier2 = m183clickableoSLSa3U$default;
                gapComposer.end(z4);
                Modifier testTag = TestTagKt.testTag(modifier2, "DropDown:".concat(z7 ? "tiny" : "normal"));
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, testTag);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                if (z7) {
                    gapComposer.startReplaceGroup(-1443747572);
                    mutableState = mutableState2;
                    j = j2;
                    companion2 = companion;
                    neverEqualPolicy = neverEqualPolicy2;
                    m4069TinyDropdownLabel3IgeMak(str2, j, false, z6, gapComposer, i3 & 7168);
                    gapComposer.end(false);
                    z5 = z6;
                } else {
                    mutableState = mutableState2;
                    companion2 = companion;
                    neverEqualPolicy = neverEqualPolicy2;
                    gapComposer.startReplaceGroup(-1443416678);
                    boolean z8 = z6;
                    m4068LargeDropdownLabeluDo3WH8((ResolvableString) collectAsState.getValue(), ((FieldValidationMessage$Error) collectAsState3.getValue()) != null, str2, j2, false, z8, gapComposer, (i3 << 6) & 458752);
                    j = j2;
                    z5 = z8;
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                }
                gapComposer.end(true);
                ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
                boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new WalletHomeViewKt$$ExternalSyntheticLambda6(22, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                then = SizeKt.m290width3ABfNKs(ImageKt.m177backgroundbw27NRU(companion2, ((StripeColors) gapComposer.consume(staticProvidableCompositionLocal)).component, rectangleShapeKt$RectangleShape$1), 280.0f).then(new SizeElement((r13 & 1) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, (r13 & 2) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, (r13 & 4) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, (r13 & 8) != 0 ? Float.NaN : 427.19998f, false));
                GapComposer gapComposer2 = gapComposer;
                AndroidMenu_androidKt.m460DropdownMenu4kj_NE(booleanValue, (Function0) rememberedValue6, then, 0L, rememberScrollState, null, Expect_jvmKt.rememberComposableLambda(1362403838, new DropdownFieldUIKt$$ExternalSyntheticLambda4(arrayList, j, legacySessionConfig, collectAsState2, mutableState, rememberScrollState), gapComposer), gapComposer2, 1572912, 40);
                gapComposer = gapComposer2;
                gapComposer.end(true);
                z3 = z5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new PasscodeKt$$ExternalSyntheticLambda2(legacySessionConfig, modifier, z3, i, i2, 10);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: DropdownMenuItem-T042LqI, reason: not valid java name */
    public static final void m4067DropdownMenuItemT042LqI(String str, boolean z, long j, Modifier modifier, Function0 function0, Composer composer, int i) {
        Modifier then;
        long j2;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-206606);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changed(j) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            then = SizeKt.fillMaxWidth(modifier, 1.0f).then(new SizeElement((r13 & 1) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, (r13 & 2) != 0 ? Float.NaN : 48.0f, (r13 & 4) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, (r13 & 8) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, false));
            boolean z2 = (57344 & i2) == 16384;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda2(22, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(then, false, null, null, (Function0) rememberedValue, 15);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion, 13.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 0.8f);
            if (z) {
                gapComposer.startReplaceGroup(-653914440);
                j2 = ((Colors) gapComposer.consume(ColorsKt.LocalColors)).m485getPrimary0d7_KjU();
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-653849340);
                gapComposer.end(false);
                j2 = j;
            }
            TextKt.m509Text4IGK_g(str, fillMaxWidth, j2, 0L, z ? FontWeight.Bold : FontWeight.Normal, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer, (i2 & 14) | 48, 0, 131032);
            gapComposer = gapComposer;
            if (z) {
                gapComposer.startReplaceGroup(-653614825);
                IconKt.m492Iconww6aTOc(Countries.painterResource(R.drawable.stripe_ic_checkmark, 0, gapComposer), null, SizeKt.m277height3ABfNKs(companion, 24.0f), ((Colors) gapComposer.consume(ColorsKt.LocalColors)).m485getPrimary0d7_KjU(), gapComposer, Painter.$stable | 432, 0);
            } else {
                gapComposer.startReplaceGroup(-664545580);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda11(str, z, j, modifier, function0, i);
        }
    }

    /* renamed from: LargeDropdownLabel-uDo3WH8, reason: not valid java name */
    public static final void m4068LargeDropdownLabeluDo3WH8(final ResolvableString resolvableString, final boolean z, final String str, final long j, final boolean z2, final boolean z3, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer;
        ComposableLambdaImpl composableLambdaImpl;
        FieldDisplayState fieldDisplayState;
        long j2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-27203176);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(resolvableString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(z3) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            FormInsets formInsets = (FormInsets) gapComposer2.consume(StripeThemeKt.LocalTextFieldInsets);
            int i3 = 6;
            TextFieldValue textFieldValue = new TextFieldValue(str == null ? "" : str, 0L, 6);
            if (z2 || !z3) {
                gapComposer2.startReplaceGroup(1339921198);
                gapComposer2.end(false);
                composableLambdaImpl = null;
            } else {
                gapComposer2.startReplaceGroup(1339614546);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1357937345, new MapMarkerPropertiesKt$$ExternalSyntheticLambda1(j, i3), gapComposer2);
                gapComposer2.end(false);
            }
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(formInsets.start, formInsets.top, formInsets.end, formInsets.bottom);
            if (z) {
                fieldDisplayState = FieldDisplayState.ERROR;
            } else {
                if (z) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                fieldDisplayState = FieldDisplayState.NORMAL;
            }
            FieldDisplayState fieldDisplayState2 = fieldDisplayState;
            if (z) {
                gapComposer2.startReplaceGroup(1340255440);
                j2 = ((Colors) gapComposer2.consume(ColorsKt.LocalColors)).m483getError0d7_KjU();
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(1340318649);
                gapComposer2.end(false);
                j2 = Color.Transparent;
            }
            int i4 = (i2 >> 6) & 112;
            int i5 = i2 >> 3;
            DefaultTextFieldColors m4073TextFieldColorszf8z9n0 = TextFieldUIKt.m4073TextFieldColorszf8z9n0(fieldDisplayState2, j, j, j2, gapComposer2, i4 | (i5 & 896), 8);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new StripeApiRepository$$ExternalSyntheticLambda5(28);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            CompatTextFieldKt.CompatTextField(textFieldValue, (Function1) rememberedValue, fillMaxWidth, false, null, Expect_jvmKt.rememberComposableLambda(1236608478, new FieldBinding$$ExternalSyntheticLambda5(resolvableString, 20), gapComposer2), null, composableLambdaImpl, z, null, null, null, null, false, 0, 0, null, null, m4073TextFieldColorszf8z9n0, paddingValuesImpl, gapComposer2, 1576368, (i5 & 14) | 48, 1044912);
            gapComposer = gapComposer2;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.stripe.android.uicore.elements.DropdownFieldUIKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    DropdownFieldUIKt.m4068LargeDropdownLabeluDo3WH8(ResolvableString.this, z, str, j, z2, z3, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: TinyDropdownLabel-3IgeMak, reason: not valid java name */
    public static final void m4069TinyDropdownLabel3IgeMak(final String str, final long j, final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1262178129);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(j) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z2) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextKt.m509Text4IGK_g(str, null, j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer, (i2 & 14) | ((i2 << 3) & 896), 0, 131066);
            gapComposer = gapComposer;
            if (z || !z2) {
                gapComposer.startReplaceGroup(1206126805);
            } else {
                gapComposer.startReplaceGroup(1215637047);
                IconKt.m492Iconww6aTOc(Countries.painterResource(R.drawable.stripe_ic_chevron_down, 0, gapComposer), null, SizeKt.m277height3ABfNKs(companion, 24.0f), ((StripeColors) gapComposer.consume(StripeThemeKt.LocalColors)).placeholderText, gapComposer, Painter.$stable | 432, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.stripe.android.uicore.elements.DropdownFieldUIKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    DropdownFieldUIKt.m4069TinyDropdownLabel3IgeMak(str, j, z, z2, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final ErrorSource access$toProtoErrorSource(CdfErrorSource cdfErrorSource) {
        int ordinal = cdfErrorSource.ordinal();
        if (ordinal == 0) {
            return ErrorSource.CLIENT;
        }
        if (ordinal == 1) {
            return ErrorSource.SERVER;
        }
        if (ordinal == 2) {
            return ErrorSource.FIDESMO_SDK;
        }
        if (ordinal == 3) {
            return ErrorSource.FIDESMO_SERVER;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final ProvisioningErrorType toProvisioningErrorType(FidesmoProvisioningError fidesmoProvisioningError) {
        fidesmoProvisioningError.getClass();
        FidesmoProvisioningError unwrapped = fidesmoProvisioningError.getUnwrapped();
        return ((unwrapped instanceof FidesmoProvisioningError.MissingEncryptedData) || (unwrapped instanceof FidesmoProvisioningError.MissingEphemeralKey)) ? ProvisioningErrorType.MISSING_DEVICE_INFO : unwrapped instanceof FidesmoProvisioningError.TagAlreadyActivated ? ProvisioningErrorType.TAG_ALREADY_ACTIVATED : ((unwrapped instanceof FidesmoProvisioningError.DeviceInfoUnavailable) || (unwrapped instanceof FidesmoProvisioningError.ActivationDataUnavailable) || (unwrapped instanceof FidesmoProvisioningError.ServiceLookupFailed) || (unwrapped instanceof FidesmoProvisioningError.NoServiceAvailable)) ? ProvisioningErrorType.DEVICE_ERROR : unwrapped instanceof FidesmoProvisioningError.FidesmoServiceUnavailable ? ProvisioningErrorType.FIDESMO_SERVICE_UNAVAILABLE : unwrapped instanceof FidesmoProvisioningError.EmailMismatch ? ProvisioningErrorType.EMAIL_MISMATCH : unwrapped instanceof FidesmoProvisioningError.WrongDevice ? ProvisioningErrorType.WRONG_DEVICE : unwrapped instanceof FidesmoProvisioningError.CardDigitizationDeclined ? ProvisioningErrorType.CARD_DIGITIZATION_DECLINED : unwrapped instanceof FidesmoProvisioningError.AppletInstallFailed ? ProvisioningErrorType.APPLET_INSTALL_FAILED : unwrapped instanceof FidesmoProvisioningError.ActivationFailed ? ProvisioningErrorType.ACTIVATION_FAILED : unwrapped instanceof FidesmoProvisioningError.CardNotEligible ? ProvisioningErrorType.CARD_NOT_ELIGIBLE : unwrapped instanceof FidesmoProvisioningError.CardDetailsInvalid ? ProvisioningErrorType.CARD_DETAILS_INVALID : unwrapped instanceof FidesmoProvisioningError.RiskBlocked ? ProvisioningErrorType.RISK_BLOCKED : unwrapped instanceof FidesmoProvisioningError.NotEnoughMemory ? ProvisioningErrorType.NOT_ENOUGH_MEMORY : unwrapped instanceof FidesmoProvisioningError.SdkRetryLimitExceeded ? ProvisioningErrorType.SDK_RETRY_LIMIT_EXCEEDED : ProvisioningErrorType.SERVICE_DELIVERY_FAILED;
    }

    public static int zza(byte[] bArr, int i, LongRunningTracesTracker longRunningTracesTracker) {
        int zzj = zzj(bArr, i, longRunningTracesTracker);
        int i2 = longRunningTracesTracker.maxTrackedTraces;
        if (i2 < 0) {
            TransportImpl$$ExternalSyntheticLambda0.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - zzj) {
            TransportImpl$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            longRunningTracesTracker.healthMetrics = zzdf.zzb;
            return zzj;
        }
        longRunningTracesTracker.healthMetrics = zzdf.zzr(zzj, i2, bArr);
        return zzj + i2;
    }

    public static int zzc(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int zzf(zzge zzgeVar, int i, byte[] bArr, int i2, int i3, zzeo zzeoVar, LongRunningTracesTracker longRunningTracesTracker) {
        Object zze = zzgeVar.zze();
        zzge zzgeVar2 = zzgeVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        LongRunningTracesTracker longRunningTracesTracker2 = longRunningTracesTracker;
        int zzo = zzo(zze, zzgeVar2, bArr2, i2, i4, longRunningTracesTracker2);
        zzgeVar2.zzf(zze);
        longRunningTracesTracker2.healthMetrics = zze;
        zzeoVar.add(zze);
        while (zzo < i4) {
            LongRunningTracesTracker longRunningTracesTracker3 = longRunningTracesTracker2;
            int i5 = i4;
            int zzj = zzj(bArr2, zzo, longRunningTracesTracker3);
            if (i != longRunningTracesTracker3.maxTrackedTraces) {
                break;
            }
            byte[] bArr3 = bArr2;
            zzge zzgeVar3 = zzgeVar2;
            Object zze2 = zzgeVar3.zze();
            zzo = zzo(zze2, zzgeVar3, bArr3, zzj, i5, longRunningTracesTracker3);
            zzgeVar2 = zzgeVar3;
            bArr2 = bArr3;
            i4 = i5;
            longRunningTracesTracker2 = longRunningTracesTracker3;
            zzgeVar2.zzf(zze2);
            longRunningTracesTracker2.healthMetrics = zze2;
            zzeoVar.add(zze2);
        }
        return zzo;
    }

    public static int zzg(byte[] bArr, int i, zzeo zzeoVar, LongRunningTracesTracker longRunningTracesTracker) {
        zzei zzeiVar = (zzei) zzeoVar;
        int zzj = zzj(bArr, i, longRunningTracesTracker);
        int i2 = longRunningTracesTracker.maxTrackedTraces + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, longRunningTracesTracker);
            zzeiVar.zzg(longRunningTracesTracker.maxTrackedTraces);
        }
        if (zzj == i2) {
            return zzj;
        }
        TransportImpl$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int zzi(int i, byte[] bArr, int i2, int i3, zzgt zzgtVar, LongRunningTracesTracker longRunningTracesTracker) {
        if ((i >>> 3) == 0) {
            TransportImpl$$ExternalSyntheticLambda0.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzm = zzm(bArr, i2, longRunningTracesTracker);
            zzgtVar.zzj(i, Long.valueOf(longRunningTracesTracker.lastFlushMilli));
            return zzm;
        }
        if (i4 == 1) {
            zzgtVar.zzj(i, Long.valueOf(zzq(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzj = zzj(bArr, i2, longRunningTracesTracker);
            int i5 = longRunningTracesTracker.maxTrackedTraces;
            if (i5 < 0) {
                TransportImpl$$ExternalSyntheticLambda0.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - zzj) {
                TransportImpl$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                zzgtVar.zzj(i, zzdf.zzb);
            } else {
                zzgtVar.zzj(i, zzdf.zzr(zzj, i5, bArr));
            }
            return zzj + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzgtVar.zzj(i, Integer.valueOf(zzc(i2, bArr)));
                return i2 + 4;
            }
            TransportImpl$$ExternalSyntheticLambda0.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        zzgt zzf = zzgt.zzf();
        int i7 = longRunningTracesTracker.flushPeriodMilli + 1;
        longRunningTracesTracker.flushPeriodMilli = i7;
        if (i7 >= 100) {
            TransportImpl$$ExternalSyntheticLambda0.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzj2 = zzj(bArr, i2, longRunningTracesTracker);
            int i9 = longRunningTracesTracker.maxTrackedTraces;
            if (i9 == i6) {
                i8 = i9;
                i2 = zzj2;
                break;
            }
            i2 = zzi(i9, bArr, zzj2, i3, zzf, longRunningTracesTracker);
            i8 = i9;
        }
        longRunningTracesTracker.flushPeriodMilli--;
        if (i2 > i3 || i8 != i6) {
            TransportImpl$$ExternalSyntheticLambda0.m("Failed to parse the message.");
            return 0;
        }
        zzgtVar.zzj(i, zzf);
        return i2;
    }

    public static int zzj(byte[] bArr, int i, LongRunningTracesTracker longRunningTracesTracker) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzk(b, bArr, i2, longRunningTracesTracker);
        }
        longRunningTracesTracker.maxTrackedTraces = b;
        return i2;
    }

    public static int zzk(int i, byte[] bArr, int i2, LongRunningTracesTracker longRunningTracesTracker) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            longRunningTracesTracker.maxTrackedTraces = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            longRunningTracesTracker.maxTrackedTraces = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            longRunningTracesTracker.maxTrackedTraces = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            longRunningTracesTracker.maxTrackedTraces = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                longRunningTracesTracker.maxTrackedTraces = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int zzl(int i, byte[] bArr, int i2, int i3, zzeo zzeoVar, LongRunningTracesTracker longRunningTracesTracker) {
        zzei zzeiVar = (zzei) zzeoVar;
        int zzj = zzj(bArr, i2, longRunningTracesTracker);
        zzeiVar.zzg(longRunningTracesTracker.maxTrackedTraces);
        while (zzj < i3) {
            int zzj2 = zzj(bArr, zzj, longRunningTracesTracker);
            if (i != longRunningTracesTracker.maxTrackedTraces) {
                break;
            }
            zzj = zzj(bArr, zzj2, longRunningTracesTracker);
            zzeiVar.zzg(longRunningTracesTracker.maxTrackedTraces);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, LongRunningTracesTracker longRunningTracesTracker) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            longRunningTracesTracker.lastFlushMilli = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        longRunningTracesTracker.lastFlushMilli = j2;
        return i3;
    }

    public static int zzn(Object obj, zzge zzgeVar, byte[] bArr, int i, int i2, int i3, LongRunningTracesTracker longRunningTracesTracker) {
        zzfp zzfpVar = (zzfp) zzgeVar;
        int i4 = longRunningTracesTracker.flushPeriodMilli + 1;
        longRunningTracesTracker.flushPeriodMilli = i4;
        if (i4 >= 100) {
            TransportImpl$$ExternalSyntheticLambda0.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int zzc = zzfpVar.zzc(obj, bArr, i, i2, i3, longRunningTracesTracker);
        longRunningTracesTracker.flushPeriodMilli--;
        longRunningTracesTracker.healthMetrics = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzge zzgeVar, byte[] bArr, int i, int i2, LongRunningTracesTracker longRunningTracesTracker) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzk(i4, bArr, i3, longRunningTracesTracker);
            i4 = longRunningTracesTracker.maxTrackedTraces;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            TransportImpl$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i6 = longRunningTracesTracker.flushPeriodMilli + 1;
        longRunningTracesTracker.flushPeriodMilli = i6;
        if (i6 >= 100) {
            TransportImpl$$ExternalSyntheticLambda0.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i7 = i5 + i4;
        zzgeVar.zzh(obj, bArr, i5, i7, longRunningTracesTracker);
        longRunningTracesTracker.flushPeriodMilli--;
        longRunningTracesTracker.healthMetrics = obj;
        return i7;
    }

    public static int zzp(int i, byte[] bArr, int i2, int i3, LongRunningTracesTracker longRunningTracesTracker) {
        if ((i >>> 3) == 0) {
            TransportImpl$$ExternalSyntheticLambda0.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzm(bArr, i2, longRunningTracesTracker);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzj(bArr, i2, longRunningTracesTracker) + longRunningTracesTracker.maxTrackedTraces;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            TransportImpl$$ExternalSyntheticLambda0.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzj(bArr, i2, longRunningTracesTracker);
            i6 = longRunningTracesTracker.maxTrackedTraces;
            if (i6 == i5) {
                break;
            }
            i2 = zzp(i6, bArr, i2, i3, longRunningTracesTracker);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        TransportImpl$$ExternalSyntheticLambda0.m("Failed to parse the message.");
        return 0;
    }

    public static long zzq(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
