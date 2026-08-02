package com.stripe.android.uicore.elements.bottomsheet;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.material.CardKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.tax.applet.views.TaxesAppletTile$$ExternalSyntheticLambda10;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda1;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class StripeBottomSheetStateKt {

    /* renamed from: lambda$-1207274653, reason: not valid java name */
    public static final ComposableLambdaImpl f828lambda$1207274653 = new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda5(29), false, -1207274653);

    public static final void StripeBottomSheetLayout(StripeBottomSheetState stripeBottomSheetState, StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        stripeBottomSheetState.getClass();
        stripeBottomSheetLayoutInfo.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2027717252);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(stripeBottomSheetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(stripeBottomSheetLayoutInfo) ? 32 : 16;
        }
        int i3 = i & MLKEMEngine.KyberPolyBytes;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer2.changed(companion) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer2.changedInstance(stripeBottomSheetState) | ((i2 & 7168) == 2048);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ShimmerModifierKt$shimmer$1$1(stripeBottomSheetState, function0, null, 23);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue);
            Modifier imePadding = SpacerKt.imePadding(SpacerKt.statusBarsPadding(companion));
            long j = stripeBottomSheetLayoutInfo.scrimColor;
            long j2 = stripeBottomSheetLayoutInfo.sheetBackgroundColor;
            gapComposer = gapComposer2;
            CardKt.m469ModalBottomSheetLayoutGs3lGvM(Expect_jvmKt.rememberComposableLambda(-1631825366, new TaxesAppletTile$$ExternalSyntheticLambda10(composableLambdaImpl, 6), gapComposer2), imePadding, stripeBottomSheetState.modalBottomSheetState, false, stripeBottomSheetLayoutInfo.sheetShape, RecyclerView.DECELERATION_RATE, j2, 0L, j, f828lambda$1207274653, gapComposer, 805506566, 128);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda1(stripeBottomSheetState, stripeBottomSheetLayoutInfo, function0, composableLambdaImpl, i);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x004f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object access$repeatUntilSucceededOrLimit(int r5, kotlin.jvm.functions.Function1 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1 r0 = (com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1 r0 = new com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            int r5 = r0.I$1
            int r6 = r0.I$0
            kotlin.jvm.functions.Function1 r2 = r0.L$0
            papa.SafeTrace.throwOnFailure(r7)     // Catch: java.util.concurrent.CancellationException -> L2d
            goto L51
        L2d:
            r7 = r2
            goto L4f
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            bo.app.a$$ExternalSyntheticBUOutline0.m$1(r5)
            r5 = 0
            return r5
        L36:
            papa.SafeTrace.throwOnFailure(r7)
            r7 = 0
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L3e:
            if (r5 >= r6) goto L51
            r0.L$0 = r7     // Catch: java.util.concurrent.CancellationException -> L4f
            r0.I$0 = r6     // Catch: java.util.concurrent.CancellationException -> L4f
            r0.I$1 = r5     // Catch: java.util.concurrent.CancellationException -> L4f
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L4f
            java.lang.Object r5 = r7.invoke(r0)     // Catch: java.util.concurrent.CancellationException -> L4f
            if (r5 != r1) goto L51
            goto L53
        L4f:
            int r5 = r5 + r3
            goto L3e
        L51:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt.access$repeatUntilSucceededOrLimit(int, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final StripeBottomSheetState rememberStripeBottomSheetState(GapComposer gapComposer, int i, int i2) {
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        if ((i2 & 1) != 0) {
            modalBottomSheetValue = ModalBottomSheetValue.Hidden;
        }
        ModalBottomSheetValue modalBottomSheetValue2 = modalBottomSheetValue;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new EncodeKt$$ExternalSyntheticLambda0(15);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        ModalBottomSheetState rememberModalBottomSheetState = CardKt.rememberModalBottomSheetState(modalBottomSheetValue2, AnimatableKt.tween$default(0, 0, null, 7), (Function1) rememberedValue, gapComposer, (i & 14) | 3120, 0);
        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
        AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer).ime;
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf(androidWindowInsets.getInsets$foundation_layout().bottom > 0), gapComposer);
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new StripeBottomSheetKeyboardHandler(delegatingSoftwareKeyboardController, rememberUpdatedState);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        StripeBottomSheetKeyboardHandler stripeBottomSheetKeyboardHandler = (StripeBottomSheetKeyboardHandler) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new StripeBottomSheetState(rememberModalBottomSheetState, stripeBottomSheetKeyboardHandler);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        return (StripeBottomSheetState) rememberedValue3;
    }
}
