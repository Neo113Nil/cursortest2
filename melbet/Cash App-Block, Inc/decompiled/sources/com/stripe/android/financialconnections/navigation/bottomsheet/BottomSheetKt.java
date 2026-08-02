package com.stripe.android.financialconnections.navigation.bottomsheet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ModalBottomSheetDefaults;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.CashInsetsListenerKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda1;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes8.dex */
public abstract class BottomSheetKt {

    /* renamed from: lambda$-282873092, reason: not valid java name */
    public static final ComposableLambdaImpl f821lambda$282873092 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(26), false, -282873092);

    public static final void LifecycleAwareContent(LifecycleOwner lifecycleOwner, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        lifecycleOwner.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1936346981);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(lifecycleOwner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            boolean changedInstance = gapComposer.changedInstance(lifecycleOwner);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new HeroCardViewKt$$ExternalSyntheticLambda0(23, lifecycleOwner, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.DisposableEffect(lifecycleOwner, (Function1) rememberedValue2, gapComposer);
            Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), AnimatableKt.tween$default(0, 0, null, 7), 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, animateContentSize$default);
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
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1963073450);
                Recorder$$ExternalSyntheticOutline2.m((i2 >> 3) & 14, composableLambdaImpl, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(1961231895);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(lifecycleOwner, composableLambdaImpl, i, 19);
        }
    }

    /* renamed from: ModalBottomSheetLayout-4erKP6g, reason: not valid java name */
    public static final void m4019ModalBottomSheetLayout4erKP6g(final BottomSheetNavigator bottomSheetNavigator, Modifier modifier, final Shape shape, float f, final long j, long j2, final long j3, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        final Modifier modifier2;
        final float f2;
        final long j4;
        int i2;
        Modifier modifier3;
        long j5;
        float f3;
        bottomSheetNavigator.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1849857857);
        int i3 = i | (gapComposer.changedInstance(bottomSheetNavigator) ? 4 : 2) | 48 | (gapComposer.changed(shape) ? 256 : 128) | 1024 | (gapComposer.changed(j) ? 16384 : PKIFailureInfo.certRevoked) | 65536 | (gapComposer.changed(j3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if ((i & 12582912) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 8388608 : 4194304;
        }
        if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                TweenSpec tweenSpec = ModalBottomSheetDefaults.AnimationSpec;
                long m488contentColorForek8zF_U = ColorsKt.m488contentColorForek8zF_U(j, gapComposer);
                i2 = i3 & (-465921);
                modifier3 = Modifier.Companion.$$INSTANCE;
                j5 = m488contentColorForek8zF_U;
                f3 = 16.0f;
            } else {
                gapComposer.skipToGroupEnd();
                i2 = i3 & (-465921);
                modifier3 = modifier;
                f3 = f;
                j5 = j2;
            }
            gapComposer.endDefaults();
            Modifier modifier4 = modifier3;
            int i4 = i2 << 6;
            CardKt.m469ModalBottomSheetLayoutGs3lGvM(bottomSheetNavigator.sheetContent, modifier4, bottomSheetNavigator.sheetState, false, shape, f3, j, j5, j3, composableLambdaImpl, gapComposer, (57344 & i4) | 560 | (3670016 & i4) | (234881024 & i4) | (i4 & 1879048192), 8);
            modifier2 = modifier4;
            f2 = f3;
            j4 = j5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            f2 = f;
            j4 = j2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    BottomSheetKt.m4019ModalBottomSheetLayout4erKP6g(BottomSheetNavigator.this, modifier2, shape, f2, j, j4, j3, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void SheetContentHost(ColumnScope columnScope, NavBackStackEntry navBackStackEntry, ModalBottomSheetState modalBottomSheetState, SaveableStateHolder saveableStateHolder, Function1 function1, Function1 function12, Composer composer, int i) {
        int i2;
        columnScope.getClass();
        modalBottomSheetState.getClass();
        saveableStateHolder.getClass();
        function1.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1038184713);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(navBackStackEntry) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(modalBottomSheetState) : gapComposer.changedInstance(modalBottomSheetState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(saveableStateHolder) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i3 = i2;
        boolean z = true;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            if (navBackStackEntry != null) {
                gapComposer.startReplaceGroup(501621692);
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer);
                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(function12, gapComposer);
                if ((i3 & 896) != 256 && ((i3 & 512) == 0 || !gapComposer.changedInstance(modalBottomSheetState))) {
                    z = false;
                }
                boolean changed = gapComposer.changed(rememberUpdatedState) | z | gapComposer.changedInstance(navBackStackEntry) | gapComposer.changed(rememberUpdatedState2);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    TakeUntil$collectSafely$2 takeUntil$collectSafely$2 = new TakeUntil$collectSafely$2(modalBottomSheetState, navBackStackEntry, rememberUpdatedState, rememberUpdatedState2, null, 29);
                    gapComposer.updateRememberedValue(takeUntil$collectSafely$2);
                    rememberedValue = takeUntil$collectSafely$2;
                }
                Updater.LaunchedEffect(modalBottomSheetState, navBackStackEntry, (Function2) rememberedValue, gapComposer);
                CashInsetsListenerKt.LocalOwnersProvider(navBackStackEntry, saveableStateHolder, Expect_jvmKt.rememberComposableLambda(1012492116, new Radiography$$ExternalSyntheticLambda1(25, navBackStackEntry, columnScope), gapComposer), gapComposer, ((i3 >> 6) & 112) | ((i3 >> 3) & 14) | MLKEMEngine.KyberPolyBytes);
            } else {
                gapComposer.startReplaceGroup(499223129);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(columnScope, navBackStackEntry, modalBottomSheetState, saveableStateHolder, function1, function12, i);
        }
    }
}
