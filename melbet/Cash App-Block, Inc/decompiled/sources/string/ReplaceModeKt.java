package string;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.RelationUtil;
import app.cash.molecule.PlatformKt;
import bo.app.n3$$ExternalSyntheticLambda0;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.backend.api.MoneybotParsingErrorFactory;
import com.squareup.cash.moneybot.backend.api.mappers.ClientRenderableMappersKt;
import com.squareup.cash.moneybot.backend.api.model.chat.Widget;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotWidgetManager;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.pools.views.StartPoolAmountKt$$ExternalSyntheticLambda7;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.protos.cash.kgoose.api.v3.ClientKickoffParams;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import com.squareup.protos.cash.kgoose.api.v3.RenderedWidget;
import com.squareup.util.compose.SharedViewEventsKt;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.savings.action.SavingsAction;
import string.ReplaceModeKt;

/* loaded from: classes7.dex */
public abstract class ReplaceModeKt {
    /* JADX WARN: Removed duplicated region for block: B:113:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    /* renamed from: AmountKeypad-VjY4oTo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4397AmountKeypadVjY4oTo(final AmountKeypadState amountKeypadState, final Function1 function1, final Modifier modifier, final long j, final long j2, Function3 function3, final Function3 function32, int i, long j3, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        GapComposer gapComposer;
        final Function3 function33;
        final long j4;
        final int i8;
        RecomposeScopeImpl endRestartGroup;
        Function3 function34;
        int i9;
        long j5;
        int i10;
        NeverEqualPolicy neverEqualPolicy;
        Modifier wrapContentHeight;
        boolean z;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z2;
        boolean changed;
        Object n3__externalsyntheticlambda0;
        boolean z3;
        int i11;
        amountKeypadState.getClass();
        AmountConfig amountConfig = amountKeypadState.config;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(473549203);
        Applier applier = gapComposer2.applier;
        if ((i2 & 6) == 0) {
            i4 = (gapComposer2.changed(amountKeypadState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= gapComposer2.changed(j2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i12 = 196608 | i4;
        int i13 = i3 & 64;
        if (i13 != 0) {
            i12 = 1769472 | i4;
        } else if ((1572864 & i2) == 0) {
            i12 |= gapComposer2.changedInstance(function3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            if ((12582912 & i2) == 0) {
                i12 |= gapComposer2.changedInstance(function32) ? 8388608 : 4194304;
            }
            if ((100663296 & i2) != 0) {
                if ((i3 & 256) == 0) {
                    i5 = i;
                    if (gapComposer2.changed(i5)) {
                        i11 = 67108864;
                        i12 |= i11;
                    }
                } else {
                    i5 = i;
                }
                i11 = 33554432;
                i12 |= i11;
            } else {
                i5 = i;
            }
            i6 = i3 & 512;
            if (i6 == 0) {
                i12 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                i7 = i6;
                i12 |= gapComposer2.changed(j3) ? PKIFailureInfo.duplicateCertReq : 268435456;
                if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) != 306783378)) {
                    gapComposer2.startDefaults();
                    if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                        Function3 function35 = i13 != 0 ? null : function3;
                        if ((i3 & 256) != 0) {
                            i12 &= -234881025;
                            i5 = 3;
                        }
                        if (i7 != 0) {
                            int i14 = i12;
                            function34 = function35;
                            i9 = i14;
                            i10 = i5;
                            j5 = Room.getSp(96);
                        } else {
                            int i15 = i12;
                            function34 = function35;
                            i9 = i15;
                            j5 = j3;
                            i10 = i5;
                        }
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i3 & 256) != 0) {
                            i12 &= -234881025;
                        }
                        j5 = j3;
                        i9 = i12;
                        i10 = i5;
                        function34 = function3;
                    }
                    gapComposer2.endDefaults();
                    int i16 = i9 >> 3;
                    MutableState rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer2);
                    int i17 = i9 >> 15;
                    MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(null, gapComposer2);
                    String str = amountKeypadState.initialAmount;
                    int i18 = i9;
                    int i19 = i18 & 14;
                    boolean changed2 = gapComposer2.changed(rememberUpdatedState) | (i19 == 4) | gapComposer2.changed(rememberUpdatedState2);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
                    if (changed2 || rememberedValue == neverEqualPolicy3) {
                        rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(21, rememberUpdatedState, amountKeypadState, rememberUpdatedState2);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(amountConfig, str, (Function1) rememberedValue, gapComposer2, 0);
                    boolean changed3 = gapComposer2.changed(rememberAmountDisplayState);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue2 == neverEqualPolicy3) {
                        rememberedValue2 = new AmountDisplayKeypadListener(rememberAmountDisplayState);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    AmountDisplayKeypadListener amountDisplayKeypadListener = (AmountDisplayKeypadListener) rememberedValue2;
                    List list = amountConfig.getTotalFractionalDigitCount() > 0 ? KeypadViewModel.keysWithSeparator : KeypadViewModel.keysWithoutSeparator;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Object obj = ColumnScopeInstance.INSTANCE;
                    if (function34 == null) {
                        gapComposer2.startReplaceGroup(-407708872);
                    } else {
                        gapComposer2.startReplaceGroup(125395433);
                        function34.invoke(obj, gapComposer2, Integer.valueOf(6 | (i17 & 112)));
                    }
                    gapComposer2.end(false);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Function3 function36 = function34;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed4 = gapComposer2.changed(rememberAmountDisplayState);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue3 == neverEqualPolicy3) {
                        neverEqualPolicy = neverEqualPolicy3;
                        rememberedValue3 = new ContextKt$$ExternalSyntheticLambda1(rememberAmountDisplayState, 14);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    } else {
                        neverEqualPolicy = neverEqualPolicy3;
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, true, (Function1) rememberedValue3);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, semantics);
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    int i20 = i18 >> 18;
                    ConnectionPoolKt.m1177AmountDisplaykNX22eY(rememberAmountDisplayState, SharedViewEventsKt.shakeWith(wrapContentHeight, amountKeypadState.shaker), j, j5, 0, i10, gapComposer2, (i16 & 896) | (i20 & 7168) | ((i18 >> 9) & 458752), 16);
                    long j6 = j5;
                    int i21 = i10;
                    gapComposer = gapComposer2;
                    gapComposer.end(true);
                    if (function32 == null) {
                        gapComposer.startReplaceGroup(-407135496);
                        z = false;
                    } else {
                        z = false;
                        gapComposer.startReplaceGroup(125413929);
                        function32.invoke(obj, gapComposer, Integer.valueOf(6 | (i20 & 112)));
                    }
                    gapComposer.end(z);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changedInstance = gapComposer.changedInstance(amountDisplayKeypadListener);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changedInstance) {
                        neverEqualPolicy2 = neverEqualPolicy;
                    } else {
                        neverEqualPolicy2 = neverEqualPolicy;
                        if (rememberedValue4 != neverEqualPolicy2) {
                            z2 = true;
                            Function0 function0 = (Function0) rememberedValue4;
                            boolean changedInstance2 = gapComposer.changedInstance(amountDisplayKeypadListener);
                            if (i19 == 4) {
                                z = z2;
                            }
                            changed = changedInstance2 | z | gapComposer.changed(rememberAmountDisplayState) | gapComposer.changed(rememberUpdatedState2);
                            Object rememberedValue5 = gapComposer.rememberedValue();
                            if (!changed || rememberedValue5 == neverEqualPolicy2) {
                                z3 = z2;
                                n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0(amountDisplayKeypadListener, amountKeypadState, rememberAmountDisplayState, rememberUpdatedState2, 21);
                                gapComposer.updateRememberedValue(n3__externalsyntheticlambda0);
                            } else {
                                n3__externalsyntheticlambda0 = rememberedValue5;
                                z3 = z2;
                            }
                            RelationUtil.m1189KeypadViewww6aTOc(fillMaxWidth2, new KeypadViewModel(list, false, function0, (Function1) n3__externalsyntheticlambda0, 2), null, j2, gapComposer, (i16 & 7168) | 6, 4);
                            gapComposer.end(z3);
                            j4 = j6;
                            i8 = i21;
                            function33 = function36;
                        }
                    }
                    z2 = true;
                    rememberedValue4 = new StartPoolAmountKt$$ExternalSyntheticLambda7(amountDisplayKeypadListener, 1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                    Function0 function02 = (Function0) rememberedValue4;
                    boolean changedInstance22 = gapComposer.changedInstance(amountDisplayKeypadListener);
                    if (i19 == 4) {
                    }
                    changed = changedInstance22 | z | gapComposer.changed(rememberAmountDisplayState) | gapComposer.changed(rememberUpdatedState2);
                    Object rememberedValue52 = gapComposer.rememberedValue();
                    if (changed) {
                    }
                    z3 = z2;
                    n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0(amountDisplayKeypadListener, amountKeypadState, rememberAmountDisplayState, rememberUpdatedState2, 21);
                    gapComposer.updateRememberedValue(n3__externalsyntheticlambda0);
                    RelationUtil.m1189KeypadViewww6aTOc(fillMaxWidth2, new KeypadViewModel(list, false, function02, (Function1) n3__externalsyntheticlambda0, 2), null, j2, gapComposer, (i16 & 7168) | 6, 4);
                    gapComposer.end(z3);
                    j4 = j6;
                    i8 = i21;
                    function33 = function36;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    function33 = function3;
                    j4 = j3;
                    i8 = i5;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.amountchooser.views.AmountKeypadKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                            ReplaceModeKt.m4397AmountKeypadVjY4oTo(AmountKeypadState.this, function1, modifier, j, j2, function33, function32, i8, j4, (Composer) obj2, updateChangedFlags, i3);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i7 = i6;
            if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) != 306783378)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((12582912 & i2) == 0) {
        }
        if ((100663296 & i2) != 0) {
        }
        i6 = i3 & 512;
        if (i6 == 0) {
        }
        i7 = i6;
        if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) != 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final String replace(int i, String str, String str2, String str3) {
        if (i <= 0) {
            return str;
        }
        return replace(i - 1, StringsKt__StringsJVMKt.replaceFirst(str, str2, str3, false), str2, str3);
    }

    public static final Widget toWidget(RealMoneybotWidgetManager realMoneybotWidgetManager, RenderedWidget renderedWidget, Set set) {
        renderedWidget.getClass();
        set.getClass();
        MoneybotParsingErrorFactory moneybotParsingErrorFactory = MoneybotParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(renderedWidget, moneybotParsingErrorFactory, realMoneybotWidgetManager);
            String str = renderedWidget.widget_id;
            ProtoValidationScope.required(str, "widget_id");
            Long l = renderedWidget.created_at;
            ClientRenderable clientRenderable = renderedWidget.client_renderable;
            ProtoValidationScope.required(clientRenderable, "client_renderable");
            com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable clientRenderable$default = ClientRenderableMappersKt.toClientRenderable$default(protoValidationScope, clientRenderable, null, null, set, 14);
            String str2 = renderedWidget.session_id;
            ClientKickoffParams clientKickoffParams = renderedWidget.kickoff_params;
            return new Widget(str, l, clientRenderable$default, str2, clientKickoffParams != null ? SavingsAction.Action.toChatKickoffParams(protoValidationScope, clientKickoffParams) : null, Intrinsics.areEqual(renderedWidget.permanent, Boolean.TRUE));
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(RenderedWidget.class), moneybotParsingErrorFactory, null);
        }
    }

    public static final void writeParameter(CaptureRequest.Builder builder, Object obj, Object obj2) {
        builder.getClass();
        if (obj == null || !(obj instanceof CaptureRequest.Key)) {
            return;
        }
        try {
            builder.set((CaptureRequest.Key) obj, obj2);
        } catch (IllegalArgumentException e) {
            Log.w("CXCP", "Failed to set [" + ((CaptureRequest.Key) obj).getName() + ": " + obj2 + "] on CaptureRequest.Builder", e);
        }
    }

    public static final void writeParameters(CaptureRequest.Builder builder, Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            writeParameter(builder, entry.getKey(), entry.getValue());
        }
    }
}
