package com.squareup.cash.support.chat.views.input;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.common.PlayerExtensionsKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.payments.views.personalization.ExpressivePaymentsToolbarKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.support.chat.viewmodels.ChatAttachmentViewModel;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InputAreaKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Function f$6;
    public final /* synthetic */ Object f$7;

    public /* synthetic */ InputAreaKt$$ExternalSyntheticLambda0(ComposableLambdaImpl composableLambdaImpl, boolean z, Function1 function1, Modifier modifier, Function2 function2, boolean z2, PaddingValuesImpl paddingValuesImpl, boolean z3, int i) {
        this.f$0 = composableLambdaImpl;
        this.f$2 = z;
        this.f$1 = function1;
        this.f$5 = modifier;
        this.f$6 = function2;
        this.f$3 = z2;
        this.f$7 = paddingValuesImpl;
        this.f$4 = z3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        Function1 function1;
        Colors colors;
        boolean z;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        boolean z2 = this.f$4;
        boolean z3 = this.f$3;
        boolean z4 = this.f$2;
        Object obj3 = this.f$7;
        Function function = this.f$6;
        Object obj4 = this.f$1;
        Object obj5 = this.f$5;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                PlayerExtensionsKt.ChatInputAreaContent((ChatAttachmentViewModel) obj6, (TextFieldState) obj4, this.f$2, this.f$3, this.f$4, (Function0) obj5, (Function0) function, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                KeypadKt.MooncakeSwitch((ComposableLambdaImpl) obj6, this.f$2, (Function1) obj4, (Modifier) obj5, (Function2) function, this.f$3, (PaddingValuesImpl) obj3, this.f$4, (Composer) obj, Updater.updateChangedFlags(1597447));
                return Unit.INSTANCE;
            case 2:
                Modifier modifier = (Modifier) obj6;
                Function0 function0 = (Function0) obj5;
                TouchRecorder touchRecorder = (TouchRecorder) obj4;
                Function1 function12 = (Function1) function;
                String str2 = (String) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Modifier statusBarsPadding = SpacerKt.statusBarsPadding(modifier);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(statusBarsPadding, 16.0f, 4.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    if (z4) {
                        gapComposer.startReplaceGroup(1397982891);
                        ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                        boolean changed = gapComposer.changed(function0);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(17, function0);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        SizeKt.Button((Function0) rememberedValue, null, buttonProminence, false, false, null, AlphaKt.lambda$2054845835, gapComposer, 1573248, 58);
                        gapComposer.end(false);
                        str = str2;
                        function1 = function12;
                        z = true;
                    } else {
                        gapComposer.startReplaceGroup(1398177602);
                        Modifier clip = ClipKt.clip(companion, RoundedCornerShapeKt.CircleShape);
                        str = str2;
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            function1 = function12;
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            function1 = function12;
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                            colors = colors2;
                        }
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, colors.component.titleBar.button.background.transparent, rectangleShapeKt$RectangleShape$1);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13);
                        String stringResource = Room.stringResource(gapComposer, R.string.close_personalization);
                        Role role = new Role(0);
                        boolean changed2 = gapComposer.changed(function0);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new ToViewKt$$ExternalSyntheticLambda2(18, function0);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, stringResource, role, (Function0) rememberedValue3, 4);
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(9);
                            gapComposer.updateRememberedValue(rememberedValue4);
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(m182clickableO2vRcR0$default, false, (Function1) rememberedValue4);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, semantics);
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        Trace.m1191Iconww6aTOc(Icons.NavigationClose, (String) null, SpacerKt.m298padding3ABfNKs(companion, 12.0f), 0L, gapComposer, 438, 8);
                        z = true;
                        gapComposer.end(true);
                        gapComposer.end(false);
                    }
                    SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, z));
                    if (z3) {
                        gapComposer.startReplaceGroup(1398974240);
                        Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(-1699706922, new ExpressivePaymentsToolbarKt$$ExternalSyntheticLambda5(function1, touchRecorder, z2, str), gapComposer), gapComposer, 392, 2);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1399326927);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Modifier modifier2 = (Modifier) obj6;
                Function0 function02 = (Function0) obj5;
                List list = (List) obj4;
                Function1 function13 = (Function1) function;
                String str3 = (String) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute2 = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier2 = gapComposer2.applier;
                if (shouldExecute2) {
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new TouchRecorder(2);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    TouchRecorder touchRecorder2 = (TouchRecorder) rememberedValue5;
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(modifier2, 12.0f);
                    BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer2, 54);
                    int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$18);
                    Modifier m591shadows4CzXII$default = ShadowKt.m591shadows4CzXII$default(companion, 12.0f, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f), false, 28);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors3 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal2);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(m591shadows4CzXII$default, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue6;
                    RippleNodeFactory m3400rippleYJYuY3k2 = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13);
                    String stringResource2 = Room.stringResource(gapComposer2, R.string.close_personalization);
                    Role role2 = new Role(0);
                    boolean changed3 = gapComposer2.changed(function02);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new ToViewKt$$ExternalSyntheticLambda2(19, function02);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    Modifier m182clickableO2vRcR0$default2 = ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU2, mutableInteractionSourceImpl2, m3400rippleYJYuY3k2, false, stringResource2, role2, (Function0) rememberedValue7, 4);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, m182clickableO2vRcR0$default2);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer2, composeUiNode$Companion$SetModifier$17, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                    Trace.m1191Iconww6aTOc(Icons.NavigationClose, (String) null, SpacerKt.m298padding3ABfNKs(companion, 16.0f), 0L, gapComposer2, 438, 8);
                    gapComposer2.end(true);
                    Modifier m591shadows4CzXII$default2 = ShadowKt.m591shadows4CzXII$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), 12.0f, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f), false, 28);
                    Colors colors4 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal2);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(m591shadows4CzXII$default2, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer2, 54);
                    int hashCode5 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer2, composeUiNode$Companion$SetModifier$17, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier5, composeUiNode$Companion$SetModifier$18, 1.0f, true);
                    RowMeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer2, 48);
                    int hashCode6 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer2, m);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy4, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer2, composeUiNode$Companion$SetModifier$17, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer2, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, !z3 ? R.string.header_from_label : R.string.header_to_label), (Map) null, (Function1) null, false);
                    AlphaKt.RecipientsInformation(6, gapComposer2, SpacerKt.m300paddingVpY3zN4$default(companion, 6.0f, RecyclerView.DECELERATION_RATE, 2), list);
                    gapComposer2.end(true);
                    if (z4) {
                        gapComposer2.startReplaceGroup(1842108917);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1841566913);
                        Strings.TouchRecordingLayout(touchRecorder2, null, Expect_jvmKt.rememberComposableLambda(-1692323181, new ExpressivePaymentsToolbarKt$$ExternalSyntheticLambda5(z2, function13, touchRecorder2, str3), gapComposer2), gapComposer2, 392, 2);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ InputAreaKt$$ExternalSyntheticLambda0(Modifier modifier, Function0 function0, boolean z, boolean z2, List list, boolean z3, Function1 function1, String str) {
        this.f$0 = modifier;
        this.f$5 = function0;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$1 = list;
        this.f$4 = z3;
        this.f$6 = function1;
        this.f$7 = str;
    }

    public /* synthetic */ InputAreaKt$$ExternalSyntheticLambda0(Modifier modifier, boolean z, Function0 function0, boolean z2, TouchRecorder touchRecorder, Function1 function1, boolean z3, String str) {
        this.f$0 = modifier;
        this.f$2 = z;
        this.f$5 = function0;
        this.f$3 = z2;
        this.f$1 = touchRecorder;
        this.f$6 = function1;
        this.f$4 = z3;
        this.f$7 = str;
    }

    public /* synthetic */ InputAreaKt$$ExternalSyntheticLambda0(ChatAttachmentViewModel chatAttachmentViewModel, TextFieldState textFieldState, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, Function0 function03, int i) {
        this.f$0 = chatAttachmentViewModel;
        this.f$1 = textFieldState;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = z3;
        this.f$5 = function0;
        this.f$6 = function02;
        this.f$7 = function03;
    }
}
