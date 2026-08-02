package com.squareup.cash.work.views.clockin;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public abstract class ClockInOverlayTransitionsKt {
    public static final CubicBezierEasing ClockInOverlayEasing = new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);

    public static final void AnimatedClockInOverlayFooter(final Transition transition, final boolean z, final boolean z2, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final Function0 function06, final Function1 function1, Composer composer, int i) {
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        function06.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1430428442);
        int i2 = i | (gapComposer.changed(transition) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changed(z2) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | (gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function03) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function04) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changedInstance(function05) ? 8388608 : 4194304) | (gapComposer.changedInstance(function06) ? 67108864 : 33554432) | (gapComposer.changedInstance(function1) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer.shouldExecute(i2 & 1, (306783379 & i2) != 306783378)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new StripePaymentController$$ExternalSyntheticLambda1(6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            BiasAlignment biasAlignment = Alignment.Companion.TopCenter;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new StripePaymentController$$ExternalSyntheticLambda1(7);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AnimatedContentKt.AnimatedContent(transition, null, function12, biasAlignment, (Function1) rememberedValue2, Expect_jvmKt.rememberComposableLambda(-1973957766, new Function4() { // from class: com.squareup.cash.work.views.clockin.ClockInOverlayTransitionsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3;
                    boolean z3;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = transition.targetState$delegate;
                    ClockInOverlayViewModel.Loaded loaded = (ClockInOverlayViewModel.Loaded) obj2;
                    Composer composer2 = (Composer) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    ((AnimatedContentScopeImpl) obj).getClass();
                    loaded.getClass();
                    boolean z4 = true;
                    if (z || ((loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOut) && (parcelableSnapshotMutableState.getValue() instanceof ClockInOverlayViewModel.Loaded.ClockedIn))) {
                        i3 = intValue;
                        z3 = true;
                    } else {
                        i3 = intValue;
                        z3 = false;
                    }
                    if (!z2 && (!(loaded instanceof ClockInOverlayViewModel.Loaded.OnBreak) || !(parcelableSnapshotMutableState.getValue() instanceof ClockInOverlayViewModel.Loaded.ClockedIn))) {
                        z4 = false;
                    }
                    DisclaimerTextKt.ClockInOverlayFooter(loaded, z3, z4, function0, function02, function03, function04, function05, function06, function1, composer2, (i3 >> 3) & 14);
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, (i2 & 14) | 224640, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotHomeViewKt$$ExternalSyntheticLambda3(transition, z, z2, function0, function02, function03, function04, function05, function06, function1, i);
        }
    }

    public static final void AnimatedClockInOverlaySection(Transition transition, Function0 function0, Function0 function02, Composer composer, int i) {
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-803875783);
        int i2 = i | (gapComposer.changed(transition) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new StripePaymentController$$ExternalSyntheticLambda1(10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            BiasAlignment biasAlignment = Alignment.Companion.TopCenter;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new StripePaymentController$$ExternalSyntheticLambda1(11);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AnimatedContentKt.AnimatedContent(transition, null, function1, biasAlignment, (Function1) rememberedValue2, Expect_jvmKt.rememberComposableLambda(-1856628775, new PoolDetailsViewKt$$ExternalSyntheticLambda41(13, function0, function02), gapComposer), gapComposer, (i2 & 14) | 224640, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0((Object) transition, (Object) function0, (Object) function02, i, 5);
        }
    }

    public static final void AnimatedClockStatusBadge(Transition transition, Modifier modifier, Composer composer, int i) {
        Transition transition2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2024183569);
        int i2 = (gapComposer.changed(transition) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new StripePaymentController$$ExternalSyntheticLambda1(8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new StripePaymentController$$ExternalSyntheticLambda1(9);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            transition2 = transition;
            modifier2 = modifier;
            AnimatedContentKt.AnimatedContent(transition2, modifier2, function1, biasAlignment, (Function1) rememberedValue2, DisclaimerTextKt.lambda$958536369, gapComposer, (i2 & 14) | 224640 | (i2 & 112), 0);
        } else {
            transition2 = transition;
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(transition2, modifier2, i, 26);
        }
    }

    public static final ClockInOverlayStateKey getStateKey(ClockInOverlayViewModel.Loaded loaded) {
        loaded.getClass();
        if (loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOut) {
            return ClockInOverlayStateKey.ClockedOut;
        }
        if (loaded instanceof ClockInOverlayViewModel.Loaded.ClockedIn) {
            return ClockInOverlayStateKey.ClockedIn;
        }
        if (loaded instanceof ClockInOverlayViewModel.Loaded.OnBreak) {
            return ClockInOverlayStateKey.OnBreak;
        }
        if (loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOutSummary) {
            return ClockInOverlayStateKey.ClockedOutSummary;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
