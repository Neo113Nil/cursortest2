package com.stripe.android.challenge.confirmation;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda32;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public abstract class IntentConfirmationChallengeUIKt {
    public static final ComposableLambdaImpl lambda$84067298 = new ComposableLambdaImpl(new KotterKnifeKt$$ExternalSyntheticLambda0(19), false, 84067298);

    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IntentConfirmationChallengeUI(Modifier modifier, String str, ConfirmationChallengeBridgeHandler confirmationChallengeBridgeHandler, boolean z, Function0 function0, Function0 function02, Function1 function1, Composer composer, int i) {
        Function1 function12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        BoxScopeInstance boxScopeInstance;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        Modifier.Companion companion;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        boolean z2;
        Object obj;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        float f;
        Object obj2;
        Object rememberedValue;
        str.getClass();
        confirmationChallengeBridgeHandler.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1409523466);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(str) ? 256 : 128) | (gapComposer.changed(confirmationChallengeBridgeHandler) ? 2048 : 1024) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | 12582912;
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            Object rememberedValue2 = gapComposer.rememberedValue();
            Object obj3 = Composer.Companion.Empty;
            if (rememberedValue2 == obj3) {
                rememberedValue2 = new StripePaymentController$$ExternalSyntheticLambda1(24);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function13 = (Function1) rememberedValue2;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m574initimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$18);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-1435541434);
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                obj = obj3;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                boxScopeInstance = boxScopeInstance2;
                companion = companion2;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                f = 1.0f;
                z2 = false;
                ProgressIndicatorKt.m496CircularProgressIndicatorLxG7B9w(TestTagKt.testTag(boxScopeInstance2.align(companion2, Alignment.Companion.Center), "intent_confirmation_challenge_loader"), 0L, RecyclerView.DECELERATION_RATE, 0L, 0, gapComposer, 0, 30);
                gapComposer = gapComposer;
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                boxScopeInstance = boxScopeInstance2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                companion = companion2;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                z2 = false;
                obj = obj3;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                f = 1.0f;
                gapComposer.startReplaceGroup(-1436997442);
            }
            gapComposer.end(z2);
            Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxSize(companion, f), "intent_confirmation_challenge_webview");
            boolean z3 = ((i2 & 7168) != 2048 ? z2 : true) | ((3670016 & i2) == 1048576 ? true : z2) | ((i2 & 896) == 256 ? true : z2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z3) {
                obj2 = obj;
            } else {
                obj2 = obj;
                if (rememberedValue3 != obj2) {
                    function12 = function13;
                    Function1 function14 = (Function1) rememberedValue3;
                    rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == obj2) {
                        rememberedValue = new StripePaymentController$$ExternalSyntheticLambda1(25);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    GapComposer gapComposer2 = gapComposer;
                    AndroidView_androidKt.AndroidView(function14, testTag, (Function1) rememberedValue, gapComposer2, 432, 0);
                    gapComposer = gapComposer2;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.statusBarsPadding(companion), f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z2);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.useNode();
                    } else {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    CardKt.IconButton(((i2 >> 15) & 14) | 24576, 12, gapComposer, lambda$84067298, TestTagKt.testTag(boxScopeInstance.align(companion, Alignment.Companion.CenterStart), "intent_confirmation_challenge_close_button"), function0, false);
                    gapComposer.end(true);
                    gapComposer.end(true);
                }
            }
            rememberedValue3 = new OpenSourceKt$$ExternalSyntheticLambda9(14, function13, function02, confirmationChallengeBridgeHandler, str);
            function12 = function13;
            gapComposer.updateRememberedValue(rememberedValue3);
            Function1 function142 = (Function1) rememberedValue3;
            rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == obj2) {
            }
            GapComposer gapComposer22 = gapComposer;
            AndroidView_androidKt.AndroidView(function142, testTag, (Function1) rememberedValue, gapComposer22, 432, 0);
            gapComposer = gapComposer22;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.statusBarsPadding(companion), f);
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z2);
            int hashCode22 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy22, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope22, composeUiNode$Companion$SetModifier$12);
            SVG$Unit$EnumUnboxingLocalUtility.m(hashCode22, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier22, composeUiNode$Companion$SetModifier$14);
            CardKt.IconButton(((i2 >> 15) & 14) | 24576, 12, gapComposer, lambda$84067298, TestTagKt.testTag(boxScopeInstance.align(companion, Alignment.Companion.CenterStart), "intent_confirmation_challenge_close_button"), function0, false);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            function12 = function1;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabUIKt$$ExternalSyntheticLambda32(modifier, str, confirmationChallengeBridgeHandler, z, function0, function02, function12, i);
        }
    }
}
