package com.squareup.cash.wallet.views;

import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.broadway.ui.compose.SecureScreenKt;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.local.views.internal.CartItemCounterViewKt$CartItemCounterView$1$1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieAnimatableKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.CheckboxKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewModel$WalletScheme;
import com.squareup.util.Strings;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class WalletHomeViewKt {
    public static final void CardHomeActionButton(String str, Icons icons, boolean z, Function0 function0, Composer composer, int i) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(304130763);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(icons.ordinal()) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(companion, 48.0f, RecyclerView.DECELERATION_RATE, 2), 52.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean z2 = !z;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier testTag = TestTagKt.testTag(ImageKt.m184combinedClickableauXiCPI$default(m279heightInVpY3zN4$default, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9), z2, str, new Role(0), null, null, PlatformKt.withHaptics(function0, null, gapComposer, (i2 >> 12) & 14, 1), 480), "LockDevices");
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, testTag);
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
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 40.0f), RoundedCornerShapeKt.CircleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, clip);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
            if (z) {
                gapComposer.startReplaceGroup(-731286232);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.icon.disabled;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-731213320);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.component.titleBar.keypad.icon.f219default;
                gapComposer.end(false);
            }
            Trace.m1191Iconww6aTOc(icons, str, m285size3ABfNKs, j, gapComposer, ((i2 >> 6) & 14) | MLKEMEngine.KyberPolyBytes | (i2 & 112), 0);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HeroCardViewKt$$ExternalSyntheticLambda32(str, icons, z, function0, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardHomeCopyActionButton(String str, Icons icons, boolean z, int i, Function0 function0, Composer composer, int i2) {
        boolean z2;
        Object rememberedValue;
        boolean z3;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        long j;
        Object rememberedValue4;
        boolean z4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2094571214);
        Applier applier = gapComposer.applier;
        int i3 = i2 | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(icons.ordinal()) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(i) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Object rememberedValue5 = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue5 == obj) {
                rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState = (MutableState) rememberedValue5;
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m1524boximpl(LottieCompositionSpec.RawRes.m1525constructorimpl(Strings.getColors(gapComposer).isLight ? R.raw.copy_code_light : R.raw.copy_code_dark)), null, null, null, null, null, gapComposer, 0, 62);
            gapComposer = gapComposer;
            LottieAnimatable rememberLottieAnimatable = LottieAnimatableKt.rememberLottieAnimatable(gapComposer, 0);
            if (!((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                String str2 = Build.FINGERPRINT;
                str2.getClass();
                if (!StringsKt.contains((CharSequence) str2, (CharSequence) "layoutlib", false) && !str2.equals("robolectric")) {
                    z2 = false;
                    rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == obj) {
                        rememberedValue = Boxes$$ExternalSyntheticOutline1.m(i, gapComposer);
                    }
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
                    Integer valueOf = Integer.valueOf(i);
                    z3 = (i3 & 7168) != 2048;
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (!z3 || rememberedValue2 == obj) {
                        rememberedValue2 = new CartItemCounterViewKt$CartItemCounterView$1$1(i, mutableState, parcelableSnapshotMutableIntState, null);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
                    Boolean bool = (Boolean) mutableState.getValue();
                    bool.getClass();
                    LottieComposition lottieComposition = (LottieComposition) rememberLottieComposition.getValue();
                    changed = gapComposer.changed(rememberLottieComposition) | gapComposer.changed(rememberLottieAnimatable);
                    rememberedValue3 = gapComposer.rememberedValue();
                    if (!changed || rememberedValue3 == obj) {
                        rememberedValue3 = new WalletHomeViewKt$CardHomeCopyActionButton$2$1(rememberLottieAnimatable, mutableState, rememberLottieComposition, null);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(bool, lottieComposition, (Function2) rememberedValue3, gapComposer);
                    if (z) {
                        gapComposer.startReplaceGroup(1456776953);
                        j = Strings.getColors(gapComposer).component.titleBar.keypad.icon.f219default;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1456774778);
                        j = Strings.getColors(gapComposer).semantic.icon.disabled;
                        gapComposer.end(false);
                    }
                    long j2 = j;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(companion, 48.0f, RecyclerView.DECELERATION_RATE, 2), 52.0f, RecyclerView.DECELERATION_RATE, 2);
                    boolean z5 = !z;
                    rememberedValue4 = gapComposer.rememberedValue();
                    if (rememberedValue4 == obj) {
                        rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    Modifier testTag = TestTagKt.testTag(ImageKt.m184combinedClickableauXiCPI$default(m279heightInVpY3zN4$default, (MutableInteractionSourceImpl) rememberedValue4, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9), z5, str, new Role(0), null, null, PlatformKt.withHaptics(function0, null, gapComposer, (i3 >> 12) & 14, 1), 480), "CopyCardNumber");
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, testTag);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier != null) {
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
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf2, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 40.0f), RoundedCornerShapeKt.CircleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, clip);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    if (((LottieComposition) rememberLottieComposition.getValue()) == null || z2) {
                        z4 = true;
                        gapComposer.startReplaceGroup(-750846180);
                        Trace.m1191Iconww6aTOc(((Boolean) mutableState.getValue()).booleanValue() ? Icons.Check24 : icons, str, SizeKt.m285size3ABfNKs(companion, 24.0f), j2, gapComposer, ((i3 << 3) & 112) | MLKEMEngine.KyberPolyBytes, 0);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-751025608);
                        LottieComposition lottieComposition2 = (LottieComposition) rememberLottieComposition.getValue();
                        boolean changed2 = gapComposer.changed(rememberLottieAnimatable);
                        Object rememberedValue6 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue6 == obj) {
                            rememberedValue6 = new CheckboxKt$$ExternalSyntheticLambda5(rememberLottieAnimatable, 3);
                            gapComposer.updateRememberedValue(rememberedValue6);
                        }
                        z4 = true;
                        LottieAnimationKt.LottieAnimation(lottieComposition2, (Function0) rememberedValue6, SizeKt.m285size3ABfNKs(companion, 24.0f), false, false, false, false, null, false, null, null, null, false, false, null, null, false, gapComposer, MLKEMEngine.KyberPolyBytes, 0, 131064);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                    gapComposer.end(z4);
                    gapComposer.end(z4);
                }
            }
            z2 = true;
            rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == obj) {
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue;
            Integer valueOf3 = Integer.valueOf(i);
            if ((i3 & 7168) != 2048) {
            }
            rememberedValue2 = gapComposer.rememberedValue();
            if (!z3) {
            }
            rememberedValue2 = new CartItemCounterViewKt$CartItemCounterView$1$1(i, mutableState, parcelableSnapshotMutableIntState2, null);
            gapComposer.updateRememberedValue(rememberedValue2);
            Updater.LaunchedEffect(gapComposer, valueOf3, (Function2) rememberedValue2);
            Boolean bool2 = (Boolean) mutableState.getValue();
            bool2.getClass();
            LottieComposition lottieComposition3 = (LottieComposition) rememberLottieComposition.getValue();
            changed = gapComposer.changed(rememberLottieComposition) | gapComposer.changed(rememberLottieAnimatable);
            rememberedValue3 = gapComposer.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new WalletHomeViewKt$CardHomeCopyActionButton$2$1(rememberLottieAnimatable, mutableState, rememberLottieComposition, null);
            gapComposer.updateRememberedValue(rememberedValue3);
            Updater.LaunchedEffect(bool2, lottieComposition3, (Function2) rememberedValue3, gapComposer);
            if (z) {
            }
            long j22 = j;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m279heightInVpY3zN4$default2 = SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(companion2, 48.0f, RecyclerView.DECELERATION_RATE, 2), 52.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean z52 = !z;
            rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj) {
            }
            Modifier testTag2 = TestTagKt.testTag(ImageKt.m184combinedClickableauXiCPI$default(m279heightInVpY3zN4$default2, (MutableInteractionSourceImpl) rememberedValue4, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9), z52, str, new Role(0), null, null, PlatformKt.withHaptics(function0, null, gapComposer, (i3 >> 12) & 14, 1), 480), "CopyCardNumber");
            BiasAlignment biasAlignment2 = Alignment.Companion.Center;
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, testTag2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier != null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(str, icons, z, i, function0, i2);
        }
    }

    public static final void CombinedCardHomeActions(TitleBarActionScope titleBarActionScope, List list, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1529352601);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(titleBarActionScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            TransactorKt.CustomAction(titleBarActionScope, null, null, Expect_jvmKt.rememberComposableLambda(194737492, new InfoSectionKt$$ExternalSyntheticLambda0(i3, function1, list), gapComposer), gapComposer, (i2 & 14) | 3072, 3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(titleBarActionScope, list, function1, i, 29);
        }
    }

    public static final void WalletHome(RealImageLoader realImageLoader, RealImageLoader realImageLoader2, ElementBoundsRegistry elementBoundsRegistry, WalletHomeViewModel$WalletScheme walletHomeViewModel$WalletScheme, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        walletHomeViewModel$WalletScheme.getClass();
        CardSchemeViewModel cardSchemeViewModel = walletHomeViewModel$WalletScheme.cardSchemeViewModel;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1826627469);
        int i2 = i | (gapComposer2.changedInstance(realImageLoader) ? 4 : 2) | (gapComposer2.changedInstance(realImageLoader2) ? 32 : 16) | (gapComposer2.changedInstance(elementBoundsRegistry) ? 256 : 128) | (gapComposer2.changedInstance(walletHomeViewModel$WalletScheme) ? 2048 : 1024) | (gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            SecureScreenKt.SecureScreen(!(cardSchemeViewModel instanceof CardSchemeViewModel.CardNullStateBooklet), gapComposer2, 0);
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new CardAppletTile$$ExternalSyntheticLambda0(24);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(m177backgroundbw27NRU, false, (Function1) rememberedValue), "WalletHome");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, testTag);
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
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i3 = i2 & 57344;
            boolean z = i3 == 16384;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ViewGroups$$ExternalSyntheticLambda0(12, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer2, 0);
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            Unit unit = Unit.INSTANCE;
            boolean changed = (i3 == 16384) | gapComposer2.changed(rememberScrollState);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new WalletHomeViewKt$WalletHome$2$2$1(rememberScrollState, function1, null, 0);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue3);
            CardSchemeViewModel.Content content = cardSchemeViewModel instanceof CardSchemeViewModel.Content ? (CardSchemeViewModel.Content) cardSchemeViewModel : null;
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf(content != null && content.scrollToTopForNewTag), gapComposer2);
            boolean changed2 = gapComposer2.changed(rememberUpdatedState) | gapComposer2.changed(rememberScrollState);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new WalletHomeViewKt$WalletHome$2$3$1(rememberUpdatedState, rememberScrollState, null);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer2, rememberScrollState, (Function2) rememberedValue4);
            gapComposer2.startReplaceGroup(-314768120);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1981251927, new WalletHomeViewKt$$ExternalSyntheticLambda2(realImageLoader, rememberScrollState, walletHomeViewModel$WalletScheme, function1, elementBoundsRegistry, realImageLoader2), gapComposer2), gapComposer, 3072, 7);
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(realImageLoader, realImageLoader2, elementBoundsRegistry, walletHomeViewModel$WalletScheme, function1, i, 29);
        }
    }
}
