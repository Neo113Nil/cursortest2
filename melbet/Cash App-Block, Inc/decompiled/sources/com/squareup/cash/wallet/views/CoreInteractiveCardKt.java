package com.squareup.cash.wallet.views;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.presenters.LocalAddBrandsPresenter$models$2$1;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.views.effect.SwampGLEffectKt$SwampGLEffect$6$1;
import com.squareup.cash.instruments.views.CardArtImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.views.DistributionWheelGesturesKt$handleGestures$1$1$1;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1;
import com.squareup.cash.wallet.views.LockAnimationColorTreatment;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.compose.MotionKt;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import timber.log.Timber;

/* loaded from: classes7.dex */
public abstract class CoreInteractiveCardKt {
    public static final Quat MESH_EXPIRED_RESTING = new Quat((float) Math.toRadians(60.0d), new float[]{1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE}).times(Hero3DCardViewKt.FORWARD_RESTING);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdaptiveInteractiveCard(final Modifier modifier, final InteractiveCardState interactiveCardState, final CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, final boolean z, final Function1 function1, final Function1 function12, Function1 function13, Function0 function0, final Function0 function02, boolean z2, boolean z3, Composer composer, final int i, final int i2, final int i3) {
        Function1 function14;
        int i4;
        Function0 function03;
        int i5;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        boolean z5;
        int i10;
        final boolean z6;
        final Function0 function04;
        final boolean z7;
        RecomposeScopeImpl endRestartGroup;
        Function0 function05;
        Function1 function15;
        Function0 function06;
        boolean z8;
        Function0 function07;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(63921421);
        int i11 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(interactiveCardState) ? 32 : 16) | (gapComposer.changedInstance(heroCardDetails) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024);
        int i12 = i3 & 64;
        if (i12 != 0) {
            i11 |= 1572864;
        } else if ((i & 1572864) == 0) {
            function14 = function13;
            i11 |= gapComposer.changedInstance(function14) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            i4 = i3 & 128;
            if (i4 == 0) {
                i5 = i11 | 12582912;
                function03 = function0;
            } else {
                function03 = function0;
                i5 = i11 | (gapComposer.changedInstance(function03) ? 8388608 : 4194304);
            }
            i6 = i3 & 512;
            if (i6 == 0) {
                i7 = i5 | 805306368;
                z4 = z2;
            } else {
                z4 = z2;
                i7 = i5 | (gapComposer.changed(z4) ? PKIFailureInfo.duplicateCertReq : 268435456);
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
                i9 = 1572864;
                i10 = 6;
                z5 = z3;
            } else if ((i2 & 6) == 0) {
                i9 = 1572864;
                z5 = z3;
                i10 = i2 | (gapComposer.changed(z5) ? 4 : 2);
            } else {
                i9 = 1572864;
                z5 = z3;
                i10 = i2;
            }
            if (gapComposer.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i10 & 3) != 2)) {
                gapComposer.skipToGroupEnd();
                Function0 function08 = function03;
                z6 = z5;
                function04 = function08;
                z7 = z4;
            } else {
                gapComposer.startDefaults();
                int i13 = 21;
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    Function1 function16 = i12 != 0 ? null : function14;
                    if (i4 != 0) {
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda0(i13);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        function05 = (Function0) rememberedValue;
                    } else {
                        function05 = function03;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    }
                    if (i8 != 0) {
                        function15 = function16;
                        z8 = false;
                        function06 = function05;
                    } else {
                        function15 = function16;
                        function06 = function05;
                        z8 = z5;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    z8 = z5;
                    function15 = function14;
                    function06 = function03;
                }
                boolean z9 = z4;
                gapComposer.endDefaults();
                if (z) {
                    gapComposer.startReplaceGroup(1613050866);
                    int i14 = i7 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO;
                    int i15 = i7 >> 6;
                    boolean z10 = z8;
                    InteractiveCardEffect(modifier, interactiveCardState, heroCardDetails, function12, function15, function06, function02, z9, z10, gapComposer, (i15 & 29360128) | i14 | 3072 | (57344 & i15) | (458752 & i15) | i9 | ((i10 << 24) & 234881024), 0);
                    function14 = function15;
                    function07 = function06;
                    z9 = z9;
                    z8 = z10;
                    gapComposer.end(false);
                } else {
                    function14 = function15;
                    function07 = function06;
                    gapComposer.startReplaceGroup(1613407707);
                    int i16 = (i7 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | 3072;
                    int i17 = i7 >> 9;
                    Hero3DCardViewKt.InteractiveCard(modifier, interactiveCardState, heroCardDetails, function1, function07, function02, z9, z8, gapComposer, (i17 & 3670016) | i16 | (i17 & 57344) | 196608 | (29360128 & (i10 << 21)));
                    gapComposer.end(false);
                }
                function04 = function07;
                z7 = z9;
                z6 = z8;
            }
            final Function1 function17 = function14;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.wallet.views.CoreInteractiveCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                        int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                        CoreInteractiveCardKt.AdaptiveInteractiveCard(Modifier.this, interactiveCardState, heroCardDetails, z, function1, function12, function17, function04, function02, z7, z6, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        function14 = function13;
        i4 = i3 & 128;
        if (i4 == 0) {
        }
        i6 = i3 & 512;
        if (i6 == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i10 & 3) != 2)) {
        }
        final Function1 function172 = function14;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0e93  */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0e7d  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0081  */
    /* JADX WARN: Type inference failed for: r12v42, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.squareup.cash.wallet.views.InteractiveCardState] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r6v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v74, types: [kotlinx.coroutines.channels.BufferOverflow] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InteractiveCardEffect(Modifier modifier, InteractiveCardState interactiveCardState, final CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, Function1 function1, Function1 function12, Function0 function0, Function0 function02, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        InteractiveCardState interactiveCardState2;
        Function1 function13;
        int i4;
        Function1 function14;
        int i5;
        Function0 function03;
        int i6;
        int i7;
        int i8;
        int i9;
        final Modifier modifier2;
        final boolean z3;
        GapComposer gapComposer;
        final InteractiveCardState interactiveCardState3;
        final Function1 function15;
        final Function1 function16;
        final Function0 function04;
        final Function0 function05;
        final boolean z4;
        RecomposeScopeImpl endRestartGroup;
        CardAppletTile$$ExternalSyntheticLambda0 cardAppletTile$$ExternalSyntheticLambda0;
        AlertBannerKt$$ExternalSyntheticLambda0 alertBannerKt$$ExternalSyntheticLambda0;
        AlertBannerKt$$ExternalSyntheticLambda0 alertBannerKt$$ExternalSyntheticLambda02;
        Modifier.Companion companion;
        CardModelView.ViewModel viewModel;
        final InteractiveCardState interactiveCardState4;
        final Function1 function17;
        final boolean z5;
        final boolean z6;
        int i10;
        Modifier modifier3;
        boolean z7;
        Object obj;
        MutableState mutableState;
        CardModelView.ViewModel cardViewModel;
        int i11;
        Quat quat;
        Object obj2;
        int i12;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal;
        Quat quat2;
        MutableState mutableState2;
        CardWobbleState cardWobbleState;
        Modifier modifier4;
        MutableState mutableState3;
        MutableState mutableState4;
        Object obj3;
        MutableState mutableState5;
        int i13;
        MutableState mutableState6;
        CardRegistry.SharedCardTransitionState sharedCardTransitionState;
        Object obj4;
        CardWobbleState cardWobbleState2;
        Object obj5;
        MutableState mutableState7;
        Quat quat3;
        long j;
        MutableState mutableState8;
        State state;
        Continuation continuation;
        State state2;
        Object obj6;
        MutableState mutableState9;
        Function1 function18;
        Continuation continuation2;
        MutableState mutableState10;
        MutableState mutableState11;
        Object obj7;
        MutableState mutableState12;
        MutableState mutableState13;
        boolean z8;
        MutableState mutableState14;
        MutableState mutableState15;
        MutableState mutableState16;
        CardWobbleState cardWobbleState3;
        MutableState mutableState17;
        Animatable animatable;
        MutableState mutableState18;
        State state3;
        boolean z9;
        Object obj8;
        State state4;
        MutableSharedFlow mutableSharedFlow;
        Animatable animatable2;
        State state5;
        Function1 function19;
        Object obj9;
        Animatable animatable3;
        MutableState mutableState19;
        Animatable animatable4;
        MutableSharedFlow mutableSharedFlow2;
        MutableState mutableState20;
        boolean z10;
        CardScene cardScene;
        boolean z11;
        Object obj10;
        Function1 function110;
        Continuation continuation3;
        MutableState mutableState21;
        MutableState mutableState22;
        Modifier wrapContentHeight;
        CardScene cardScene2;
        CoroutineScope coroutineScope;
        State state6;
        BiasAlignment biasAlignment;
        Function0 function06;
        Function0 function07;
        Object obj11;
        CardTheme cardTheme;
        Object obj12;
        boolean z12;
        Object obj13;
        ?? r12;
        Engine engine;
        boolean z13;
        ?? r4;
        CardScene cardScene3;
        ?? r122;
        boolean z14;
        int i14;
        ?? r7 = (GapComposer) composer;
        r7.startRestartGroup(360377195);
        int currentMarker = r7.getCurrentMarker();
        int i15 = i2 & 1;
        if (i15 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (r7.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                interactiveCardState2 = interactiveCardState;
                if (r7.changedInstance(interactiveCardState2)) {
                    i14 = 32;
                    i3 |= i14;
                }
            } else {
                interactiveCardState2 = interactiveCardState;
            }
            i14 = 16;
            i3 |= i14;
        } else {
            interactiveCardState2 = interactiveCardState;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= r7.changedInstance(heroCardDetails) ? 256 : 128;
        }
        int i16 = i2 & 8;
        if (i16 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function13 = function1;
            i3 |= r7.changedInstance(function13) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function14 = function12;
                i3 |= r7.changedInstance(function14) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    function03 = function0;
                } else {
                    function03 = function0;
                    if ((i & 196608) == 0) {
                        i3 |= r7.changedInstance(function03) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= r7.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i8 = i15;
                    i3 |= r7.changed(z) ? 8388608 : 4194304;
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= r7.changed(z2) ? 67108864 : 33554432;
                    }
                    if (r7.shouldExecute(i3 & 1, (i3 & 38347923) == 38347922)) {
                        r7.skipToGroupEnd();
                        modifier2 = modifier;
                        z3 = z2;
                        gapComposer = r7;
                        interactiveCardState3 = interactiveCardState2;
                        function15 = function14;
                        function16 = function13;
                        function04 = function03;
                        function05 = function02;
                        z4 = z;
                    } else {
                        r7.startDefaults();
                        int i17 = i & 1;
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (i17 == 0 || r7.getDefaultsInvalid()) {
                            Modifier modifier5 = i8 != 0 ? companion2 : modifier;
                            if ((i2 & 2) != 0) {
                                ?? rememberedValue = r7.rememberedValue();
                                InteractiveCardState interactiveCardState5 = rememberedValue;
                                if (rememberedValue == neverEqualPolicy) {
                                    InteractiveCardState interactiveCardState6 = new InteractiveCardState();
                                    r7.updateRememberedValue(interactiveCardState6);
                                    interactiveCardState5 = interactiveCardState6;
                                }
                                interactiveCardState2 = interactiveCardState5;
                                i3 &= -113;
                            }
                            if (i16 != 0) {
                                ?? rememberedValue2 = r7.rememberedValue();
                                CardAppletTile$$ExternalSyntheticLambda0 cardAppletTile$$ExternalSyntheticLambda02 = rememberedValue2;
                                if (rememberedValue2 == neverEqualPolicy) {
                                    CardAppletTile$$ExternalSyntheticLambda0 cardAppletTile$$ExternalSyntheticLambda03 = new CardAppletTile$$ExternalSyntheticLambda0(17);
                                    r7.updateRememberedValue(cardAppletTile$$ExternalSyntheticLambda03);
                                    cardAppletTile$$ExternalSyntheticLambda02 = cardAppletTile$$ExternalSyntheticLambda03;
                                }
                                cardAppletTile$$ExternalSyntheticLambda0 = cardAppletTile$$ExternalSyntheticLambda02;
                            } else {
                                cardAppletTile$$ExternalSyntheticLambda0 = function13;
                            }
                            if (i4 != 0) {
                                function14 = null;
                            }
                            if (i5 != 0) {
                                ?? rememberedValue3 = r7.rememberedValue();
                                AlertBannerKt$$ExternalSyntheticLambda0 alertBannerKt$$ExternalSyntheticLambda03 = rememberedValue3;
                                if (rememberedValue3 == neverEqualPolicy) {
                                    AlertBannerKt$$ExternalSyntheticLambda0 alertBannerKt$$ExternalSyntheticLambda04 = new AlertBannerKt$$ExternalSyntheticLambda0(22);
                                    r7.updateRememberedValue(alertBannerKt$$ExternalSyntheticLambda04);
                                    alertBannerKt$$ExternalSyntheticLambda03 = alertBannerKt$$ExternalSyntheticLambda04;
                                }
                                alertBannerKt$$ExternalSyntheticLambda0 = alertBannerKt$$ExternalSyntheticLambda03;
                            } else {
                                alertBannerKt$$ExternalSyntheticLambda0 = function03;
                            }
                            if (i6 != 0) {
                                ?? rememberedValue4 = r7.rememberedValue();
                                AlertBannerKt$$ExternalSyntheticLambda0 alertBannerKt$$ExternalSyntheticLambda05 = rememberedValue4;
                                if (rememberedValue4 == neverEqualPolicy) {
                                    AlertBannerKt$$ExternalSyntheticLambda0 alertBannerKt$$ExternalSyntheticLambda06 = new AlertBannerKt$$ExternalSyntheticLambda0(23);
                                    r7.updateRememberedValue(alertBannerKt$$ExternalSyntheticLambda06);
                                    alertBannerKt$$ExternalSyntheticLambda05 = alertBannerKt$$ExternalSyntheticLambda06;
                                }
                                alertBannerKt$$ExternalSyntheticLambda02 = alertBannerKt$$ExternalSyntheticLambda05;
                            } else {
                                alertBannerKt$$ExternalSyntheticLambda02 = function02;
                            }
                            boolean z15 = i7 != 0 ? false : z;
                            companion = companion2;
                            viewModel = null;
                            interactiveCardState4 = interactiveCardState2;
                            function17 = cardAppletTile$$ExternalSyntheticLambda0;
                            z5 = z15;
                            z6 = i9 != 0 ? false : z2;
                            i10 = i3;
                            modifier3 = modifier5;
                        } else {
                            r7.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            alertBannerKt$$ExternalSyntheticLambda02 = function02;
                            z6 = z2;
                            companion = companion2;
                            interactiveCardState4 = interactiveCardState2;
                            z5 = z;
                            viewModel = null;
                            function17 = function13;
                            alertBannerKt$$ExternalSyntheticLambda0 = function03;
                            i10 = i3;
                            modifier3 = modifier;
                        }
                        r7.endDefaults();
                        Object rememberedValue5 = r7.rememberedValue();
                        Object obj14 = rememberedValue5;
                        if (rememberedValue5 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
                            r7.updateRememberedValue(mutableStateOf$default);
                            obj14 = mutableStateOf$default;
                        }
                        MutableState mutableState23 = (MutableState) obj14;
                        if (((Boolean) mutableState23.getValue()).booleanValue()) {
                            RecomposeScopeImpl endRestartGroup2 = r7.endRestartGroup();
                            if (endRestartGroup2 != null) {
                                final Function1 function111 = function14;
                                final int i18 = 2;
                                final Modifier modifier6 = modifier3;
                                final Function0 function08 = alertBannerKt$$ExternalSyntheticLambda0;
                                final Function0 function09 = alertBannerKt$$ExternalSyntheticLambda02;
                                endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.wallet.views.CoreInteractiveCardKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj15, Object obj16) {
                                        switch (i18) {
                                            case 0:
                                                ((Integer) obj16).intValue();
                                                CoreInteractiveCardKt.InteractiveCardEffect(modifier6, interactiveCardState4, heroCardDetails, function17, function111, function08, function09, z5, z6, (Composer) obj15, Updater.updateChangedFlags(i | 1), i2);
                                                break;
                                            case 1:
                                                ((Integer) obj16).intValue();
                                                CoreInteractiveCardKt.InteractiveCardEffect(modifier6, interactiveCardState4, heroCardDetails, function17, function111, function08, function09, z5, z6, (Composer) obj15, Updater.updateChangedFlags(i | 1), i2);
                                                break;
                                            case 2:
                                                ((Integer) obj16).intValue();
                                                CoreInteractiveCardKt.InteractiveCardEffect(modifier6, interactiveCardState4, heroCardDetails, function17, function111, function08, function09, z5, z6, (Composer) obj15, Updater.updateChangedFlags(i | 1), i2);
                                                break;
                                            default:
                                                ((Integer) obj16).intValue();
                                                CoreInteractiveCardKt.InteractiveCardEffect(modifier6, interactiveCardState4, heroCardDetails, function17, function111, function08, function09, z5, z6, (Composer) obj15, Updater.updateChangedFlags(i | 1), i2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        final boolean z16 = z6;
                        final Function1 function112 = function17;
                        final Modifier modifier7 = modifier3;
                        final Function0 function010 = alertBannerKt$$ExternalSyntheticLambda0;
                        MutableState rememberUpdatedState = Updater.rememberUpdatedState(alertBannerKt$$ExternalSyntheticLambda02, r7);
                        Object rememberedValue6 = r7.rememberedValue();
                        Object obj15 = rememberedValue6;
                        if (rememberedValue6 == neverEqualPolicy) {
                            CardArtImageKt$$ExternalSyntheticLambda0 cardArtImageKt$$ExternalSyntheticLambda0 = new CardArtImageKt$$ExternalSyntheticLambda0(mutableState23, rememberUpdatedState, 2);
                            r7.updateRememberedValue(cardArtImageKt$$ExternalSyntheticLambda0);
                            obj15 = cardArtImageKt$$ExternalSyntheticLambda0;
                        }
                        Function1 function113 = (Function1) obj15;
                        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(interactiveCardState4, r7);
                        if (heroCardDetails == null) {
                            RecomposeScopeImpl endRestartGroup3 = r7.endRestartGroup();
                            if (endRestartGroup3 != null) {
                                final Function1 function114 = function14;
                                final int i19 = 3;
                                final Function0 function011 = alertBannerKt$$ExternalSyntheticLambda02;
                                endRestartGroup3.block = new Function2() { // from class: com.squareup.cash.wallet.views.CoreInteractiveCardKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj152, Object obj16) {
                                        switch (i19) {
                                            case 0:
                                                ((Integer) obj16).intValue();
                                                CoreInteractiveCardKt.InteractiveCardEffect(modifier7, interactiveCardState4, heroCardDetails, function112, function114, function010, function011, z5, z16, (Composer) obj152, Updater.updateChangedFlags(i | 1), i2);
                                                break;
                                            case 1:
                                                ((Integer) obj16).intValue();
                                                CoreInteractiveCardKt.InteractiveCardEffect(modifier7, interactiveCardState4, heroCardDetails, function112, function114, function010, function011, z5, z16, (Composer) obj152, Updater.updateChangedFlags(i | 1), i2);
                                                break;
                                            case 2:
                                                ((Integer) obj16).intValue();
                                                CoreInteractiveCardKt.InteractiveCardEffect(modifier7, interactiveCardState4, heroCardDetails, function112, function114, function010, function011, z5, z16, (Composer) obj152, Updater.updateChangedFlags(i | 1), i2);
                                                break;
                                            default:
                                                ((Integer) obj16).intValue();
                                                CoreInteractiveCardKt.InteractiveCardEffect(modifier7, interactiveCardState4, heroCardDetails, function112, function114, function010, function011, z5, z16, (Composer) obj152, Updater.updateChangedFlags(i | 1), i2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(heroCardDetails, r7);
                        Object rememberedValue7 = r7.rememberedValue();
                        Object obj16 = rememberedValue7;
                        if (rememberedValue7 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(viewModel);
                            r7.updateRememberedValue(mutableStateOf$default2);
                            obj16 = mutableStateOf$default2;
                        }
                        MutableState mutableState24 = (MutableState) obj16;
                        Object rememberedValue8 = r7.rememberedValue();
                        Object obj17 = rememberedValue8;
                        if (rememberedValue8 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(viewModel);
                            r7.updateRememberedValue(mutableStateOf$default3);
                            obj17 = mutableStateOf$default3;
                        }
                        final InteractiveCardState interactiveCardState7 = interactiveCardState4;
                        MutableState mutableState25 = (MutableState) obj17;
                        Object rememberedValue9 = r7.rememberedValue();
                        if (rememberedValue9 == neverEqualPolicy) {
                            z7 = z5;
                            DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new CardAppletTileKt$$ExternalSyntheticLambda9(4, mutableState24));
                            r7.updateRememberedValue(derivedStateOf);
                            obj = derivedStateOf;
                        } else {
                            z7 = z5;
                            obj = rememberedValue9;
                        }
                        State state7 = (State) obj;
                        Object rememberedValue10 = r7.rememberedValue();
                        int i20 = 5;
                        Object obj18 = rememberedValue10;
                        if (rememberedValue10 == neverEqualPolicy) {
                            DerivedSnapshotState derivedStateOf2 = Updater.derivedStateOf(new CardAppletTileKt$$ExternalSyntheticLambda9(i20, mutableState24));
                            r7.updateRememberedValue(derivedStateOf2);
                            obj18 = derivedStateOf2;
                        }
                        State state8 = (State) obj18;
                        MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(Boolean.valueOf(((CardSchemeViewModel.Module.HeroCardDetails) rememberUpdatedState3.getValue()).showPrepurchaseContourText), r7);
                        CardSchemeViewModel.Module.HeroCardDetails heroCardDetails2 = (CardSchemeViewModel.Module.HeroCardDetails) mutableState24.getValue();
                        if (heroCardDetails2 == null) {
                            r7.startReplaceGroup(-1419854484);
                            r7.end(false);
                            mutableState = mutableState24;
                            cardViewModel = viewModel;
                        } else {
                            mutableState = mutableState24;
                            r7.startReplaceGroup(-1419854483);
                            cardViewModel = ((InteractiveCardState) rememberUpdatedState2.getValue()).toCardViewModel(heroCardDetails2, r7);
                            r7.end(false);
                        }
                        MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(cardViewModel, r7);
                        MutableState produceAnimationsEnabled = MotionKt.produceAnimationsEnabled(r7);
                        final Function0 function012 = alertBannerKt$$ExternalSyntheticLambda02;
                        int i21 = i10 & 234881024;
                        boolean changed = (i21 == 67108864) | r7.changed(((CardSchemeViewModel.Module.HeroCardDetails) rememberUpdatedState3.getValue()).isEnabled) | r7.changed(((Boolean) produceAnimationsEnabled.getValue()).booleanValue());
                        Object rememberedValue11 = r7.rememberedValue();
                        if (changed || rememberedValue11 == neverEqualPolicy) {
                            rememberedValue11 = (z16 && ((CardSchemeViewModel.Module.HeroCardDetails) rememberUpdatedState3.getValue()).isEnabled && ((Boolean) produceAnimationsEnabled.getValue()).booleanValue()) ? Hero3DCardViewKt.CARD_HOME_BACKWARD_RESTING : Hero3DCardViewKt.BACKWARD_RESTING;
                            r7.updateRememberedValue(rememberedValue11);
                        }
                        Quat quat4 = (Quat) rememberedValue11;
                        boolean changed2 = r7.changed(((CardSchemeViewModel.Module.HeroCardDetails) rememberUpdatedState3.getValue()).isEnabled) | (i21 == 67108864) | r7.changed(((Boolean) produceAnimationsEnabled.getValue()).booleanValue());
                        Object rememberedValue12 = r7.rememberedValue();
                        if (changed2 || rememberedValue12 == neverEqualPolicy) {
                            rememberedValue12 = (z16 && ((CardSchemeViewModel.Module.HeroCardDetails) rememberUpdatedState3.getValue()).isEnabled && ((Boolean) produceAnimationsEnabled.getValue()).booleanValue()) ? Hero3DCardViewKt.CARD_HOME_FORWARD_RESTING : Hero3DCardViewKt.FORWARD_RESTING;
                            r7.updateRememberedValue(rememberedValue12);
                        }
                        Quat quat5 = (Quat) rememberedValue12;
                        Object rememberedValue13 = r7.rememberedValue();
                        Object obj19 = rememberedValue13;
                        if (rememberedValue13 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(Boolean.FALSE);
                            r7.updateRememberedValue(mutableStateOf$default4);
                            obj19 = mutableStateOf$default4;
                        }
                        MutableState mutableState26 = (MutableState) obj19;
                        Object rememberedValue14 = r7.rememberedValue();
                        Object obj20 = rememberedValue14;
                        if (rememberedValue14 == neverEqualPolicy) {
                            CardWobbleState cardWobbleState4 = new CardWobbleState();
                            r7.updateRememberedValue(cardWobbleState4);
                            obj20 = cardWobbleState4;
                        }
                        CardWobbleState cardWobbleState5 = (CardWobbleState) obj20;
                        Object rememberedValue15 = r7.rememberedValue();
                        Object obj21 = rememberedValue15;
                        if (rememberedValue15 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default5 = Updater.mutableStateOf$default(quat5);
                            r7.updateRememberedValue(mutableStateOf$default5);
                            obj21 = mutableStateOf$default5;
                        }
                        MutableState mutableState27 = (MutableState) obj21;
                        Object rememberedValue16 = r7.rememberedValue();
                        Object obj22 = rememberedValue16;
                        if (rememberedValue16 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default6 = Updater.mutableStateOf$default(Boolean.FALSE);
                            r7.updateRememberedValue(mutableStateOf$default6);
                            obj22 = mutableStateOf$default6;
                        }
                        MutableState mutableState28 = (MutableState) obj22;
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CardTransitionKt.LocalCardRegistry;
                        CardRegistry cardRegistry = (CardRegistry) r7.consume(staticProvidableCompositionLocal2);
                        MutableState mutableState29 = mutableState26;
                        Object rememberedValue17 = r7.rememberedValue();
                        if (rememberedValue17 == neverEqualPolicy) {
                            DerivedSnapshotState derivedStateOf3 = Updater.derivedStateOf(new UiWorkflow$$ExternalSyntheticLambda25(cardWobbleState5, quat5, quat4, mutableState27, 15));
                            r7.updateRememberedValue(derivedStateOf3);
                            i11 = i10;
                            quat = quat5;
                            obj2 = derivedStateOf3;
                            i12 = currentMarker;
                            staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
                            mutableState2 = mutableState27;
                            cardWobbleState = cardWobbleState5;
                            quat2 = quat4;
                        } else {
                            i11 = i10;
                            quat = quat5;
                            obj2 = rememberedValue17;
                            i12 = currentMarker;
                            staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
                            quat2 = quat4;
                            mutableState2 = mutableState27;
                            cardWobbleState = cardWobbleState5;
                        }
                        State state9 = (State) obj2;
                        Object rememberedValue18 = r7.rememberedValue();
                        if (rememberedValue18 == neverEqualPolicy) {
                            modifier4 = modifier7;
                            mutableState3 = produceAnimationsEnabled;
                            mutableState4 = mutableState2;
                            CardRegistry.SharedCardTransitionState sharedCardTransitionState2 = new CardRegistry.SharedCardTransitionState(Updater.derivedStateOf(new Hero3DCardViewKt$$ExternalSyntheticLambda6(cardWobbleState, mutableState2, 1)), Updater.derivedStateOf(new Hero3DCardViewKt$$ExternalSyntheticLambda6(cardWobbleState, rememberUpdatedState2, 2)));
                            r7.updateRememberedValue(sharedCardTransitionState2);
                            obj3 = sharedCardTransitionState2;
                        } else {
                            modifier4 = modifier7;
                            mutableState3 = produceAnimationsEnabled;
                            mutableState4 = mutableState2;
                            obj3 = rememberedValue18;
                        }
                        CardRegistry.SharedCardTransitionState sharedCardTransitionState3 = (CardRegistry.SharedCardTransitionState) obj3;
                        Object rememberedValue19 = r7.rememberedValue();
                        Object obj23 = rememberedValue19;
                        if (rememberedValue19 == neverEqualPolicy) {
                            CoreInteractiveCardKt$$ExternalSyntheticLambda4 coreInteractiveCardKt$$ExternalSyntheticLambda4 = new CoreInteractiveCardKt$$ExternalSyntheticLambda4(sharedCardTransitionState3, 0);
                            r7.updateRememberedValue(coreInteractiveCardKt$$ExternalSyntheticLambda4);
                            obj23 = coreInteractiveCardKt$$ExternalSyntheticLambda4;
                        }
                        MutableState rememberUpdatedState6 = Updater.rememberUpdatedState(CardTransitionKt.syncCardTransition((Function0) obj23, r7), r7);
                        Object rememberedValue20 = r7.rememberedValue();
                        Object obj24 = rememberedValue20;
                        if (rememberedValue20 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default7 = Updater.mutableStateOf$default(Boolean.FALSE);
                            r7.updateRememberedValue(mutableStateOf$default7);
                            obj24 = mutableStateOf$default7;
                        }
                        MutableState mutableState30 = (MutableState) obj24;
                        if (z16) {
                            mutableState5 = rememberUpdatedState4;
                            ((InteractiveCardState) rememberUpdatedState2.getValue()).isCardHome$delegate.setValue(Boolean.TRUE);
                        } else {
                            mutableState5 = rememberUpdatedState4;
                        }
                        Object rememberedValue21 = r7.rememberedValue();
                        Object obj25 = rememberedValue21;
                        if (rememberedValue21 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default8 = Updater.mutableStateOf$default(viewModel);
                            r7.updateRememberedValue(mutableStateOf$default8);
                            obj25 = mutableStateOf$default8;
                        }
                        MutableState mutableState31 = (MutableState) obj25;
                        if (cardRegistry != null) {
                            r7.startReplaceGroup(-1417572077);
                            Object rememberedValue22 = r7.rememberedValue();
                            if (rememberedValue22 == neverEqualPolicy) {
                                Object value = cardRegistry.sharedCardTransitionState.getValue();
                                rememberedValue22 = (CardRegistry.SharedCardTransitionState) (!Intrinsics.areEqual((CardRegistry.SharedCardTransitionState) value, sharedCardTransitionState3) ? value : viewModel);
                                r7.updateRememberedValue(rememberedValue22);
                            }
                            CardRegistry.SharedCardTransitionState sharedCardTransitionState4 = (CardRegistry.SharedCardTransitionState) rememberedValue22;
                            if (sharedCardTransitionState4 != null && ((CardRegistry.SharedCardTransitionState) mutableState31.getValue()) == null && !((Boolean) mutableState30.getValue()).booleanValue()) {
                                mutableState31.setValue(sharedCardTransitionState4);
                                mutableState30.setValue(Boolean.TRUE);
                            }
                            boolean changedInstance = r7.changedInstance(cardRegistry);
                            Object rememberedValue23 = r7.rememberedValue();
                            Object obj26 = rememberedValue23;
                            if (changedInstance || rememberedValue23 == neverEqualPolicy) {
                                HeroCardViewKt$$ExternalSyntheticLambda0 heroCardViewKt$$ExternalSyntheticLambda0 = new HeroCardViewKt$$ExternalSyntheticLambda0(2, cardRegistry, sharedCardTransitionState3);
                                r7.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda0);
                                obj26 = heroCardViewKt$$ExternalSyntheticLambda0;
                            }
                            Updater.DisposableEffect(sharedCardTransitionState3, (Function1) obj26, (Composer) r7);
                            i13 = 0;
                            r7.end(false);
                        } else {
                            i13 = 0;
                            r7.startReplaceGroup(-1416830185);
                            r7.end(false);
                        }
                        Object rememberedValue24 = r7.rememberedValue();
                        if (rememberedValue24 == neverEqualPolicy) {
                            mutableState6 = mutableState31;
                            sharedCardTransitionState = sharedCardTransitionState3;
                            SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(i13, 1, viewModel, 5);
                            r7.updateRememberedValue(MutableSharedFlow$default);
                            obj4 = MutableSharedFlow$default;
                        } else {
                            mutableState6 = mutableState31;
                            sharedCardTransitionState = sharedCardTransitionState3;
                            obj4 = rememberedValue24;
                        }
                        MutableSharedFlow mutableSharedFlow3 = (MutableSharedFlow) obj4;
                        long refreshRate = 1000 / ((long) ((View) r7.consume(AndroidCompositionLocals_androidKt.LocalView)).getDisplay().getRefreshRate());
                        Object rememberedValue25 = r7.rememberedValue();
                        Object obj27 = rememberedValue25;
                        if (rememberedValue25 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default9 = Updater.mutableStateOf$default(Boolean.FALSE);
                            r7.updateRememberedValue(mutableStateOf$default9);
                            obj27 = mutableStateOf$default9;
                        }
                        MutableState mutableState32 = (MutableState) obj27;
                        Unit unit = Unit.INSTANCE;
                        Object rememberedValue26 = r7.rememberedValue();
                        if (rememberedValue26 == neverEqualPolicy) {
                            cardWobbleState2 = cardWobbleState;
                            TabToolbarsKt$$ExternalSyntheticLambda10 tabToolbarsKt$$ExternalSyntheticLambda10 = new TabToolbarsKt$$ExternalSyntheticLambda10(25, mutableState32);
                            r7.updateRememberedValue(tabToolbarsKt$$ExternalSyntheticLambda10);
                            obj5 = tabToolbarsKt$$ExternalSyntheticLambda10;
                        } else {
                            cardWobbleState2 = cardWobbleState;
                            obj5 = rememberedValue26;
                        }
                        DimensionKt.LifecycleResumeEffect(unit, null, (Function1) obj5, r7, 390);
                        Object rememberedValue27 = r7.rememberedValue();
                        Object obj28 = rememberedValue27;
                        if (rememberedValue27 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default10 = Updater.mutableStateOf$default(Boolean.FALSE);
                            r7.updateRememberedValue(mutableStateOf$default10);
                            obj28 = mutableStateOf$default10;
                        }
                        MutableState mutableState33 = (MutableState) obj28;
                        Object rememberedValue28 = r7.rememberedValue();
                        Object obj29 = rememberedValue28;
                        if (rememberedValue28 == neverEqualPolicy) {
                            Animatable Animatable = AnimatableKt.Animatable(0.4f, 0.01f);
                            r7.updateRememberedValue(Animatable);
                            obj29 = Animatable;
                        }
                        Animatable animatable5 = (Animatable) obj29;
                        Object rememberedValue29 = r7.rememberedValue();
                        Object obj30 = rememberedValue29;
                        if (rememberedValue29 == neverEqualPolicy) {
                            Animatable Animatable2 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                            r7.updateRememberedValue(Animatable2);
                            obj30 = Animatable2;
                        }
                        Animatable animatable6 = (Animatable) obj30;
                        boolean changed3 = r7.changed(rememberUpdatedState2) | r7.changedInstance(quat2) | r7.changedInstance(quat) | r7.changed(refreshRate) | r7.changed(rememberUpdatedState3);
                        Object rememberedValue30 = r7.rememberedValue();
                        if (changed3 || rememberedValue30 == neverEqualPolicy) {
                            mutableState7 = mutableState32;
                            Quat quat6 = quat2;
                            rememberedValue30 = new Hero3DCardViewKt$InteractiveCard$9$1$3(mutableState33, rememberUpdatedState2, quat6, mutableState4, quat, mutableState7, refreshRate, rememberUpdatedState3, null, 1);
                            quat3 = quat6;
                            j = refreshRate;
                            mutableState8 = rememberUpdatedState3;
                            r7.updateRememberedValue(rememberedValue30);
                        } else {
                            mutableState7 = mutableState32;
                            j = refreshRate;
                            quat3 = quat2;
                            mutableState8 = rememberUpdatedState3;
                        }
                        Updater.LaunchedEffect((Composer) r7, unit, (Function2) rememberedValue30);
                        boolean changed4 = r7.changed(mutableState8);
                        Object rememberedValue31 = r7.rememberedValue();
                        if (changed4 || rememberedValue31 == neverEqualPolicy) {
                            rememberedValue31 = new CardAppletWorker$setup$1$2$1(mutableState33, state9, mutableState8, null, 12);
                            state = state9;
                            continuation = null;
                            r7.updateRememberedValue(rememberedValue31);
                        } else {
                            state = state9;
                            continuation = null;
                        }
                        Updater.LaunchedEffect((Composer) r7, unit, (Function2) rememberedValue31);
                        if (function14 != null) {
                            r7.startReplaceGroup(-1415078995);
                            boolean z17 = (i11 & 57344) == 16384;
                            Object rememberedValue32 = r7.rememberedValue();
                            Object obj31 = rememberedValue32;
                            if (z17 || rememberedValue32 == neverEqualPolicy) {
                                SwampGLEffectKt$SwampGLEffect$6$1 swampGLEffectKt$SwampGLEffect$6$1 = new SwampGLEffectKt$SwampGLEffect$6$1(state, function14, continuation);
                                r7.updateRememberedValue(swampGLEffectKt$SwampGLEffect$6$1);
                                obj31 = swampGLEffectKt$SwampGLEffect$6$1;
                            }
                            Updater.LaunchedEffect((Composer) r7, unit, (Function2) obj31);
                            r7.end(false);
                        } else {
                            r7.startReplaceGroup(-1414946377);
                            r7.end(false);
                        }
                        Context context = (Context) r7.consume(AndroidCompositionLocals_androidKt.LocalContext);
                        Object rememberedValue33 = r7.rememberedValue();
                        Object obj32 = rememberedValue33;
                        if (rememberedValue33 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default11 = Updater.mutableStateOf$default(continuation);
                            r7.updateRememberedValue(mutableStateOf$default11);
                            obj32 = mutableStateOf$default11;
                        }
                        MutableState mutableState34 = (MutableState) obj32;
                        Continuation continuation4 = continuation;
                        Object rememberedValue34 = r7.rememberedValue();
                        Object obj33 = rememberedValue34;
                        if (rememberedValue34 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default12 = Updater.mutableStateOf$default(continuation4);
                            r7.updateRememberedValue(mutableStateOf$default12);
                            obj33 = mutableStateOf$default12;
                        }
                        MutableState mutableState35 = (MutableState) obj33;
                        Object rememberedValue35 = r7.rememberedValue();
                        if (rememberedValue35 == neverEqualPolicy) {
                            state2 = state;
                            TabToolbarsKt$$ExternalSyntheticLambda10 tabToolbarsKt$$ExternalSyntheticLambda102 = new TabToolbarsKt$$ExternalSyntheticLambda10(26, mutableState34);
                            r7.updateRememberedValue(tabToolbarsKt$$ExternalSyntheticLambda102);
                            obj6 = tabToolbarsKt$$ExternalSyntheticLambda102;
                        } else {
                            state2 = state;
                            obj6 = rememberedValue35;
                        }
                        Updater.DisposableEffect(unit, (Function1) obj6, (Composer) r7);
                        boolean changedInstance2 = r7.changedInstance(animatable6);
                        Object rememberedValue36 = r7.rememberedValue();
                        if (changedInstance2 || rememberedValue36 == neverEqualPolicy) {
                            MutableState mutableState36 = mutableState6;
                            rememberedValue36 = new CoreInteractiveCardKt$InteractiveCardEffect$12$1(animatable6, mutableState28, mutableState36, continuation4, 0);
                            mutableState9 = mutableState36;
                            function18 = function14;
                            continuation2 = continuation4;
                            r7.updateRememberedValue(rememberedValue36);
                        } else {
                            function18 = function14;
                            mutableState9 = mutableState6;
                            continuation2 = continuation4;
                        }
                        Updater.LaunchedEffect((Composer) r7, unit, (Function2) rememberedValue36);
                        boolean changedInstance3 = r7.changedInstance(animatable5);
                        Object rememberedValue37 = r7.rememberedValue();
                        Object obj34 = rememberedValue37;
                        if (changedInstance3 || rememberedValue37 == neverEqualPolicy) {
                            Hero3DCardViewKt$InteractiveCard$11$1 hero3DCardViewKt$InteractiveCard$11$1 = new Hero3DCardViewKt$InteractiveCard$11$1(animatable5, mutableState25, continuation2, 6);
                            r7.updateRememberedValue(hero3DCardViewKt$InteractiveCard$11$1);
                            obj34 = hero3DCardViewKt$InteractiveCard$11$1;
                        }
                        Updater.LaunchedEffect((Composer) r7, unit, (Function2) obj34);
                        Object rememberedValue38 = r7.rememberedValue();
                        if (rememberedValue38 == neverEqualPolicy) {
                            MutableState mutableState37 = mutableState;
                            Hero3DCardViewKt$InteractiveCard$5$1 hero3DCardViewKt$InteractiveCard$5$1 = new Hero3DCardViewKt$InteractiveCard$5$1(mutableState37, mutableState34, mutableState35, continuation2, 2);
                            mutableState10 = mutableState37;
                            mutableState11 = mutableState35;
                            r7.updateRememberedValue(hero3DCardViewKt$InteractiveCard$5$1);
                            obj7 = hero3DCardViewKt$InteractiveCard$5$1;
                        } else {
                            mutableState10 = mutableState;
                            mutableState11 = mutableState35;
                            obj7 = rememberedValue38;
                        }
                        Updater.LaunchedEffect((Composer) r7, unit, (Function2) obj7);
                        MutableState mutableState38 = mutableState3;
                        MutableState mutableState39 = mutableState8;
                        long j2 = j;
                        boolean changed5 = r7.changed(mutableState8) | r7.changedInstance(quat) | r7.changedInstance(quat3) | (i21 == 67108864) | r7.changed(mutableState38) | r7.changedInstance(mutableSharedFlow3) | r7.changed(rememberUpdatedState6) | r7.changedInstance(cardWobbleState2) | r7.changed(rememberUpdatedState2) | r7.changed(mutableState5) | r7.changedInstance(animatable6) | r7.changed(j2);
                        Object rememberedValue39 = r7.rememberedValue();
                        if (changed5 || rememberedValue39 == neverEqualPolicy) {
                            mutableState12 = mutableState25;
                            mutableState13 = mutableState33;
                            MutableState mutableState40 = mutableState4;
                            CardWobbleState cardWobbleState6 = cardWobbleState2;
                            rememberedValue39 = new Hero3DCardViewKt$InteractiveCard$12$1.AnonymousClass4(quat, quat3, z16, mutableState39, mutableState40, mutableState29, mutableState10, state7, mutableState38, mutableSharedFlow3, rememberUpdatedState6, cardWobbleState6, mutableState9, rememberUpdatedState2, mutableState5, mutableState28, animatable6, mutableState7, j2, mutableState12, state2, mutableState13, null);
                            z8 = z16;
                            mutableState14 = mutableState39;
                            mutableState29 = mutableState29;
                            mutableState15 = mutableState10;
                            mutableState16 = rememberUpdatedState6;
                            cardWobbleState3 = cardWobbleState6;
                            mutableState17 = mutableState28;
                            animatable = animatable6;
                            mutableState18 = mutableState40;
                            state3 = state7;
                            r7.updateRememberedValue(rememberedValue39);
                        } else {
                            mutableState14 = mutableState39;
                            mutableState12 = mutableState25;
                            animatable = animatable6;
                            z8 = z16;
                            mutableState13 = mutableState33;
                            mutableState15 = mutableState10;
                            mutableState18 = mutableState4;
                            mutableState17 = mutableState28;
                            cardWobbleState3 = cardWobbleState2;
                            mutableState16 = rememberUpdatedState6;
                            state3 = state7;
                        }
                        Updater.LaunchedEffect((Composer) r7, unit, (Function2) rememberedValue39);
                        Object rememberedValue40 = r7.rememberedValue();
                        if (rememberedValue40 == neverEqualPolicy) {
                            z9 = z8;
                            Animatable Animatable3 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                            r7.updateRememberedValue(Animatable3);
                            obj8 = Animatable3;
                        } else {
                            z9 = z8;
                            obj8 = rememberedValue40;
                        }
                        Animatable animatable7 = (Animatable) obj8;
                        MutableState mutableState41 = mutableState11;
                        Modifier focusable = CanvasKt.focusable(SizeKt.fillMaxWidth(modifier4, 1.0f), true, null);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(r7.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = r7.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(r7, focusable);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        Animatable animatable8 = animatable;
                        if (r7.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        r7.startReusableNode();
                        if (r7.inserting) {
                            r7.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            r7.useNode();
                        }
                        Updater.m576setimpl(r7, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(r7, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(r7, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(r7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(r7, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        r7.startReplaceGroup(-1507594470);
                        PlatformHapticFeedback platformHapticFeedback = (PlatformHapticFeedback) r7.consume(CompositionLocalsKt.LocalHapticFeedback);
                        Object rememberedValue41 = r7.rememberedValue();
                        Object obj35 = rememberedValue41;
                        if (rememberedValue41 == neverEqualPolicy) {
                            SharedFlowImpl MutableSharedFlow$default2 = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
                            r7.updateRememberedValue(MutableSharedFlow$default2);
                            obj35 = MutableSharedFlow$default2;
                        }
                        MutableSharedFlow mutableSharedFlow4 = (MutableSharedFlow) obj35;
                        Object rememberedValue42 = r7.rememberedValue();
                        Object obj36 = rememberedValue42;
                        if (rememberedValue42 == neverEqualPolicy) {
                            CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r7);
                            r7.updateRememberedValue(createCompositionCoroutineScope);
                            obj36 = createCompositionCoroutineScope;
                        }
                        CoroutineScope coroutineScope2 = (CoroutineScope) obj36;
                        boolean changedInstance4 = r7.changedInstance(mutableSharedFlow4) | r7.changedInstance(platformHapticFeedback) | r7.changedInstance(animatable7) | r7.changed(rememberUpdatedState2);
                        Object rememberedValue43 = r7.rememberedValue();
                        if (changedInstance4 || rememberedValue43 == neverEqualPolicy) {
                            rememberedValue43 = new NotificationActionService$onHandleIntent$1(state3, mutableSharedFlow4, platformHapticFeedback, animatable7, rememberUpdatedState2, (Continuation) null, 21);
                            state4 = state3;
                            mutableSharedFlow = mutableSharedFlow4;
                            animatable2 = animatable7;
                            r7.updateRememberedValue(rememberedValue43);
                        } else {
                            mutableSharedFlow = mutableSharedFlow4;
                            animatable2 = animatable7;
                            state4 = state3;
                        }
                        Updater.LaunchedEffect((Composer) r7, unit, (Function2) rememberedValue43);
                        Object rememberedValue44 = r7.rememberedValue();
                        if (rememberedValue44 == neverEqualPolicy) {
                            state5 = state4;
                            function19 = function113;
                            HeroCardViewKt$$ExternalSyntheticLambda5 heroCardViewKt$$ExternalSyntheticLambda5 = new HeroCardViewKt$$ExternalSyntheticLambda5(29, function19);
                            r7.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda5);
                            obj9 = heroCardViewKt$$ExternalSyntheticLambda5;
                        } else {
                            state5 = state4;
                            function19 = function113;
                            obj9 = rememberedValue44;
                        }
                        Function0 function013 = (Function0) obj9;
                        context.getClass();
                        r7.startReplaceGroup(2119710751);
                        CardRegistry cardRegistry2 = (CardRegistry) r7.consume(staticProvidableCompositionLocal);
                        Function1 function115 = function19;
                        if (cardRegistry2 == null) {
                            r7.startReplaceGroup(-600986339);
                            Object rememberedValue45 = r7.rememberedValue();
                            Object obj37 = rememberedValue45;
                            if (rememberedValue45 == neverEqualPolicy) {
                                CoroutineScope createCompositionCoroutineScope2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r7);
                                r7.updateRememberedValue(createCompositionCoroutineScope2);
                                obj37 = createCompositionCoroutineScope2;
                            }
                            CoroutineScope coroutineScope3 = (CoroutineScope) obj37;
                            boolean changed6 = r7.changed(coroutineScope3);
                            animatable4 = animatable2;
                            Object rememberedValue46 = r7.rememberedValue();
                            if (changed6 || rememberedValue46 == neverEqualPolicy) {
                                try {
                                    mutableState19 = mutableState17;
                                    try {
                                        animatable3 = animatable5;
                                    } catch (Exception e) {
                                        e = e;
                                        animatable3 = animatable5;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    animatable3 = animatable5;
                                    mutableState19 = mutableState17;
                                }
                                try {
                                    Engine engine2 = new Engine(coroutineScope3, new CardTransitionKt$$ExternalSyntheticLambda16(0, function013));
                                    engine2.initialize();
                                    obj13 = engine2;
                                    mutableSharedFlow2 = mutableSharedFlow;
                                    z12 = false;
                                } catch (Exception e3) {
                                    e = e3;
                                    Timber.Forest forest = Timber.Forest;
                                    forest.tag("sceneCache");
                                    mutableSharedFlow2 = mutableSharedFlow;
                                    z12 = false;
                                    forest.e("Fallback engine creation failed", new Object[0], e);
                                    function013.invoke();
                                    obj13 = null;
                                    r7.updateRememberedValue(obj13);
                                    r12 = z12;
                                    engine = (Engine) obj13;
                                    if (engine != null) {
                                    }
                                    r7.end(z14);
                                    mutableState20 = mutableState14;
                                    cardScene = null;
                                    if (cardScene != null) {
                                    }
                                }
                                r7.updateRememberedValue(obj13);
                                r12 = z12;
                            } else {
                                animatable3 = animatable5;
                                mutableState19 = mutableState17;
                                obj13 = rememberedValue46;
                                mutableSharedFlow2 = mutableSharedFlow;
                                r12 = 0;
                            }
                            engine = (Engine) obj13;
                            if (engine != null) {
                                r7.end(r12);
                                z14 = r12;
                            } else {
                                boolean changedInstance5 = r7.changedInstance(engine);
                                Object rememberedValue47 = r7.rememberedValue();
                                Object obj38 = rememberedValue47;
                                if (changedInstance5 || rememberedValue47 == neverEqualPolicy) {
                                    CardTransitionKt$$ExternalSyntheticLambda17 cardTransitionKt$$ExternalSyntheticLambda17 = new CardTransitionKt$$ExternalSyntheticLambda17(engine, r12);
                                    r7.updateRememberedValue(cardTransitionKt$$ExternalSyntheticLambda17);
                                    obj38 = cardTransitionKt$$ExternalSyntheticLambda17;
                                }
                                Updater.DisposableEffect(engine, (Function1) obj38, (Composer) r7);
                                boolean changed7 = r7.changed(engine) | r7.changed(context);
                                ?? rememberedValue48 = r7.rememberedValue();
                                if (changed7 || rememberedValue48 == neverEqualPolicy) {
                                    try {
                                        CardScene cardScene4 = new CardScene(context, engine);
                                        cardScene4.configureCamera(25.0f, 8.87f);
                                        r4 = cardScene4;
                                        z13 = false;
                                    } catch (Exception e4) {
                                        Timber.Forest forest2 = Timber.Forest;
                                        forest2.tag("sceneCache");
                                        z13 = false;
                                        forest2.e("Fallback CardScene creation failed", new Object[0], e4);
                                        function013.invoke();
                                        r4 = null;
                                    }
                                    r7.updateRememberedValue(r4);
                                    cardScene3 = r4;
                                    r122 = z13;
                                } else {
                                    r122 = 0;
                                    cardScene3 = rememberedValue48;
                                }
                                cardScene = cardScene3;
                                if (cardScene == null) {
                                    r7.end(r122);
                                    z14 = r122;
                                } else {
                                    boolean changedInstance6 = r7.changedInstance(cardScene);
                                    Object rememberedValue49 = r7.rememberedValue();
                                    Object obj39 = rememberedValue49;
                                    if (changedInstance6 || rememberedValue49 == neverEqualPolicy) {
                                        CardTransitionKt$$ExternalSyntheticLambda18 cardTransitionKt$$ExternalSyntheticLambda18 = new CardTransitionKt$$ExternalSyntheticLambda18(cardScene, r122);
                                        r7.updateRememberedValue(cardTransitionKt$$ExternalSyntheticLambda18);
                                        obj39 = cardTransitionKt$$ExternalSyntheticLambda18;
                                    }
                                    int i22 = CardScene.$r8$clinit;
                                    Updater.DisposableEffect(cardScene, (Function1) obj39, (Composer) r7);
                                    r7.end(r122);
                                    r7.end(r122);
                                    mutableState20 = mutableState14;
                                    if (cardScene != null) {
                                        r7.endToMarker(i12);
                                        RecomposeScopeImpl endRestartGroup4 = r7.endRestartGroup();
                                        if (endRestartGroup4 != null) {
                                            final int i23 = 0;
                                            final boolean z18 = z7;
                                            final Function1 function116 = function18;
                                            final boolean z19 = z9;
                                            final Modifier modifier8 = modifier4;
                                            endRestartGroup4.block = new Function2() { // from class: com.squareup.cash.wallet.views.CoreInteractiveCardKt$$ExternalSyntheticLambda9
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj152, Object obj162) {
                                                    switch (i23) {
                                                        case 0:
                                                            ((Integer) obj162).intValue();
                                                            CoreInteractiveCardKt.InteractiveCardEffect(modifier8, interactiveCardState7, heroCardDetails, function112, function116, function010, function012, z18, z19, (Composer) obj152, Updater.updateChangedFlags(i | 1), i2);
                                                            break;
                                                        case 1:
                                                            ((Integer) obj162).intValue();
                                                            CoreInteractiveCardKt.InteractiveCardEffect(modifier8, interactiveCardState7, heroCardDetails, function112, function116, function010, function012, z18, z19, (Composer) obj152, Updater.updateChangedFlags(i | 1), i2);
                                                            break;
                                                        case 2:
                                                            ((Integer) obj162).intValue();
                                                            CoreInteractiveCardKt.InteractiveCardEffect(modifier8, interactiveCardState7, heroCardDetails, function112, function116, function010, function012, z18, z19, (Composer) obj152, Updater.updateChangedFlags(i | 1), i2);
                                                            break;
                                                        default:
                                                            ((Integer) obj162).intValue();
                                                            CoreInteractiveCardKt.InteractiveCardEffect(modifier8, interactiveCardState7, heroCardDetails, function112, function116, function010, function012, z18, z19, (Composer) obj152, Updater.updateChangedFlags(i | 1), i2);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            return;
                                        }
                                        return;
                                    }
                                    boolean z20 = z7;
                                    boolean changedInstance7 = r7.changedInstance(cardScene) | ((i11 & 7168) == 2048);
                                    Object rememberedValue50 = r7.rememberedValue();
                                    if (changedInstance7 || rememberedValue50 == neverEqualPolicy) {
                                        rememberedValue50 = new Logger$_log$2(cardScene, function112, mutableState12, null, 9);
                                        function110 = function112;
                                        continuation3 = null;
                                        r7.updateRememberedValue(rememberedValue50);
                                    } else {
                                        function110 = function112;
                                        continuation3 = null;
                                    }
                                    int i24 = CardScene.$r8$clinit;
                                    Updater.LaunchedEffect((Composer) r7, cardScene, (Function2) rememberedValue50);
                                    boolean changedInstance8 = r7.changedInstance(context) | r7.changedInstance(cardScene);
                                    Object rememberedValue51 = r7.rememberedValue();
                                    if (changedInstance8 || rememberedValue51 == neverEqualPolicy) {
                                        rememberedValue51 = new CardAppletWorker$setup$1$2$1(state8, context, cardScene, continuation3, 11);
                                        r7.updateRememberedValue(rememberedValue51);
                                    }
                                    Updater.LaunchedEffect((Composer) r7, cardScene, (Function2) rememberedValue51);
                                    boolean changed8 = r7.changed(mutableState16) | r7.changed(rememberUpdatedState5) | r7.changedInstance(cardWobbleState3) | r7.changed(rememberUpdatedState2) | r7.changedInstance(cardScene);
                                    Object rememberedValue52 = r7.rememberedValue();
                                    if (changed8 || rememberedValue52 == neverEqualPolicy) {
                                        mutableState21 = mutableState15;
                                        MutableState mutableState42 = mutableState9;
                                        rememberedValue52 = new LocalAddBrandsPresenter$models$2$1(function115, mutableState42, mutableState21, mutableState16, sharedCardTransitionState, cardWobbleState3, rememberUpdatedState5, mutableState18, rememberUpdatedState2, mutableState34, mutableState41, cardScene, null);
                                        mutableState22 = rememberUpdatedState2;
                                        mutableState9 = mutableState42;
                                        r7.updateRememberedValue(rememberedValue52);
                                    } else {
                                        mutableState22 = rememberUpdatedState2;
                                        mutableState21 = mutableState15;
                                    }
                                    Updater.LaunchedEffect((Composer) r7, cardScene, (Function2) rememberedValue52);
                                    Engine engine3 = cardScene.engine;
                                    r7.startReplaceGroup(782996023);
                                    r7.startReplaceGroup(782893009);
                                    Modifier.Companion companion3 = companion;
                                    Modifier aspectRatio = OffsetKt.aspectRatio(1.5857725f, SizeKt.m292widthInVpY3zN4$default(companion3, RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(r7, R.dimen.wallet_card_max_width), 1), false);
                                    BiasAlignment biasAlignment2 = Alignment.Companion.Center;
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Modifier align = boxScopeInstance.align(aspectRatio, biasAlignment2);
                                    float[] fArr = Hero3DCardViewKt.X_AXIS;
                                    align.getClass();
                                    wrapContentHeight = SizeKt.wrapContentHeight(ValueInsets.layout(align, new Hero3DCardViewKt$$ExternalSyntheticLambda11(0)), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                                    Modifier alpha = AlphaKt.alpha(OffsetKt.aspectRatio(1.0f, wrapContentHeight, false), ((Number) animatable8.getValue()).floatValue());
                                    if (((Boolean) ((InteractiveCardState) mutableState22.getValue()).touchEnabled$delegate.getValue()).booleanValue()) {
                                        MutableState mutableState43 = mutableState20;
                                        boolean changedInstance9 = r7.changedInstance(cardScene) | r7.changedInstance(coroutineScope2) | r7.changedInstance(mutableSharedFlow3) | r7.changed(mutableState43);
                                        MutableSharedFlow mutableSharedFlow5 = mutableSharedFlow2;
                                        boolean changedInstance10 = changedInstance9 | r7.changedInstance(mutableSharedFlow5);
                                        Object rememberedValue53 = r7.rememberedValue();
                                        if (changedInstance10 || rememberedValue53 == neverEqualPolicy) {
                                            CardScene cardScene5 = cardScene;
                                            MutableState mutableState44 = mutableState21;
                                            State state10 = state5;
                                            rememberedValue53 = new DistributionWheelGesturesKt$handleGestures$1$1$1(cardScene5, coroutineScope2, state10, mutableSharedFlow3, mutableState44, mutableState43, mutableSharedFlow5);
                                            cardScene2 = cardScene5;
                                            coroutineScope = coroutineScope2;
                                            state6 = state10;
                                            mutableState21 = mutableState44;
                                            r7.updateRememberedValue(rememberedValue53);
                                        } else {
                                            cardScene2 = cardScene;
                                            coroutineScope = coroutineScope2;
                                            state6 = state5;
                                        }
                                        alpha = alpha.then(SuspendingPointerInputFilterKt.pointerInput(companion3, unit, (PointerInputEventHandler) rememberedValue53));
                                    } else {
                                        cardScene2 = cardScene;
                                        coroutineScope = coroutineScope2;
                                        state6 = state5;
                                    }
                                    r7.end(false);
                                    if (((Boolean) ((InteractiveCardState) mutableState22.getValue()).touchEnabled$delegate.getValue()).booleanValue()) {
                                        biasAlignment = biasAlignment2;
                                        Animatable animatable9 = animatable3;
                                        boolean changedInstance11 = r7.changedInstance(cardScene2) | ((i11 & 458752) == 131072) | r7.changedInstance(coroutineScope) | r7.changedInstance(animatable9);
                                        Object rememberedValue54 = r7.rememberedValue();
                                        if (changedInstance11 || rememberedValue54 == neverEqualPolicy) {
                                            CoreInteractiveCardKt$InteractiveCardEffect$16$6$1$1 coreInteractiveCardKt$InteractiveCardEffect$16$6$1$1 = new CoreInteractiveCardKt$InteractiveCardEffect$16$6$1$1(cardScene2, function010, coroutineScope, animatable9, 0);
                                            function06 = function010;
                                            r7.updateRememberedValue(coreInteractiveCardKt$InteractiveCardEffect$16$6$1$1);
                                            obj12 = coreInteractiveCardKt$InteractiveCardEffect$16$6$1$1;
                                        } else {
                                            function06 = function010;
                                            obj12 = rememberedValue54;
                                        }
                                        alpha = alpha.then(SuspendingPointerInputFilterKt.pointerInput(companion3, function06, (PointerInputEventHandler) obj12));
                                    } else {
                                        biasAlignment = biasAlignment2;
                                        function06 = function010;
                                    }
                                    r7.endReplaceGroup();
                                    boolean changedInstance12 = r7.changedInstance(coroutineScope);
                                    Object rememberedValue55 = r7.rememberedValue();
                                    if (changedInstance12 || rememberedValue55 == neverEqualPolicy) {
                                        function07 = function06;
                                        PlayerSurfaceKt$$ExternalSyntheticLambda1 playerSurfaceKt$$ExternalSyntheticLambda1 = new PlayerSurfaceKt$$ExternalSyntheticLambda1(coroutineScope, mutableState19, 1);
                                        r7.updateRememberedValue(playerSurfaceKt$$ExternalSyntheticLambda1);
                                        obj11 = playerSurfaceKt$$ExternalSyntheticLambda1;
                                    } else {
                                        function07 = function06;
                                        obj11 = rememberedValue55;
                                    }
                                    MutableState mutableState45 = mutableState9;
                                    BiasAlignment biasAlignment3 = biasAlignment;
                                    ByteStreamsKt.SwampGLEffect(alpha, engine3, cardScene2, null, false, null, (Function1) obj11, r7, 576, 56);
                                    if (((Boolean) mutableState13.getValue()).booleanValue() || ((Boolean) mutableState29.getValue()).booleanValue()) {
                                        r7.startReplaceGroup(-1495282139);
                                        boolean changed9 = r7.changed(mutableState22);
                                        Object rememberedValue56 = r7.rememberedValue();
                                        Object obj40 = rememberedValue56;
                                        if (changed9 || rememberedValue56 == neverEqualPolicy) {
                                            CoreInteractiveCardKt$InteractiveCardEffect$16$8$1 coreInteractiveCardKt$InteractiveCardEffect$16$8$1 = new CoreInteractiveCardKt$InteractiveCardEffect$16$8$1(state6, mutableState45, mutableState22, (Continuation) null);
                                            r7.updateRememberedValue(coreInteractiveCardKt$InteractiveCardEffect$16$8$1);
                                            obj40 = coreInteractiveCardKt$InteractiveCardEffect$16$8$1;
                                        }
                                        Updater.LaunchedEffect((Composer) r7, unit, (Function2) obj40);
                                        State animateFloatAsState = AnimateAsStateKt.animateFloatAsState((InteractiveCardEffect$lambda$20(state6) || z20) ? RecyclerView.DECELERATION_RATE : 1.0f, null, null, null, r7, 0, 30);
                                        int i25 = 1;
                                        Modifier aspectRatio2 = OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(SizeKt.m292widthInVpY3zN4$default(boxScopeInstance.align(companion3, biasAlignment3), RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(r7, R.dimen.wallet_card_max_width), 1), 0.25f), false);
                                        Animatable animatable10 = animatable4;
                                        boolean changedInstance13 = r7.changedInstance(animatable10) | r7.changed(mutableState22) | r7.changed(animateFloatAsState);
                                        Object rememberedValue57 = r7.rememberedValue();
                                        Object obj41 = rememberedValue57;
                                        if (changedInstance13 || rememberedValue57 == neverEqualPolicy) {
                                            Hero3DCardViewKt$$ExternalSyntheticLambda2 hero3DCardViewKt$$ExternalSyntheticLambda2 = new Hero3DCardViewKt$$ExternalSyntheticLambda2(animatable10, mutableState22, animateFloatAsState, i25);
                                            r7.updateRememberedValue(hero3DCardViewKt$$ExternalSyntheticLambda2);
                                            obj41 = hero3DCardViewKt$$ExternalSyntheticLambda2;
                                        }
                                        Modifier graphicsLayer = ColorKt.graphicsLayer(aspectRatio2, (Function1) obj41);
                                        boolean changed10 = r7.changed(mutableState22);
                                        Object rememberedValue58 = r7.rememberedValue();
                                        Object obj42 = rememberedValue58;
                                        if (changed10 || rememberedValue58 == neverEqualPolicy) {
                                            TabToolbarsKt$$ExternalSyntheticLambda10 tabToolbarsKt$$ExternalSyntheticLambda103 = new TabToolbarsKt$$ExternalSyntheticLambda10(24, mutableState22);
                                            r7.updateRememberedValue(tabToolbarsKt$$ExternalSyntheticLambda103);
                                            obj42 = tabToolbarsKt$$ExternalSyntheticLambda103;
                                        }
                                        Modifier drawWithContent = ClipKt.drawWithContent(graphicsLayer, (Function1) obj42);
                                        boolean InteractiveCardEffect$lambda$20 = InteractiveCardEffect$lambda$20(state6);
                                        CardSchemeViewModel.Module.HeroCardDetails heroCardDetails3 = (CardSchemeViewModel.Module.HeroCardDetails) mutableState21.getValue();
                                        CardLockViewKt.LockAnimation(InteractiveCardEffect$lambda$20, drawWithContent, (heroCardDetails3 == null || (cardTheme = heroCardDetails3.cardTheme) == null) ? LockAnimationColorTreatment.Adaptive.INSTANCE : CardLockViewKt.lockAnimationColorTreatment(cardTheme), r7, 0);
                                        r7.endReplaceGroup();
                                    } else {
                                        r7.startReplaceGroup(-1493671503);
                                        r7.endReplaceGroup();
                                    }
                                    r7.endReplaceGroup();
                                    r7.endNode();
                                    z4 = z20;
                                    gapComposer = r7;
                                    function15 = function18;
                                    interactiveCardState3 = interactiveCardState7;
                                    function16 = function110;
                                    z3 = z9;
                                    function04 = function07;
                                    function05 = function012;
                                    modifier2 = modifier4;
                                }
                            }
                            r7.end(z14);
                            mutableState20 = mutableState14;
                            cardScene = null;
                            if (cardScene != null) {
                            }
                        } else {
                            animatable3 = animatable5;
                            mutableState19 = mutableState17;
                            animatable4 = animatable2;
                            mutableSharedFlow2 = mutableSharedFlow;
                            ParcelableSnapshotMutableState parcelableSnapshotMutableState = cardRegistry2.sharedSceneError$delegate;
                            r7.startReplaceGroup(-599842749);
                            r7.end(false);
                            if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                                r7.startReplaceGroup(1006048850);
                                CardScene cardScene6 = cardRegistry2.sharedScene;
                                if (cardScene6 != null) {
                                    cardScene6.dispose();
                                }
                                Continuation continuation5 = null;
                                cardRegistry2.sharedScene = null;
                                Engine engine4 = cardRegistry2.sceneEngine;
                                if (engine4 != null) {
                                    engine4.shutdown();
                                }
                                cardRegistry2.sceneEngine = null;
                                Object rememberedValue59 = r7.rememberedValue();
                                if (rememberedValue59 == neverEqualPolicy) {
                                    z11 = false;
                                    CardTransitionKt$sceneCache$4$1$1 cardTransitionKt$sceneCache$4$1$1 = new CardTransitionKt$sceneCache$4$1$1(function013, continuation5, false ? 1 : 0);
                                    r7.updateRememberedValue(cardTransitionKt$sceneCache$4$1$1);
                                    obj10 = cardTransitionKt$sceneCache$4$1$1;
                                } else {
                                    z11 = false;
                                    obj10 = rememberedValue59;
                                }
                                Updater.LaunchedEffect((Composer) r7, unit, (Function2) obj10);
                                r7.end(z11);
                                r7.end(z11);
                                mutableState20 = mutableState14;
                                cardScene = null;
                            } else {
                                int i26 = 0;
                                r7.startReplaceGroup(1006224713);
                                r7.end(false);
                                Engine engine5 = cardRegistry2.sceneEngine;
                                if (engine5 == null) {
                                    try {
                                        mutableState20 = mutableState14;
                                        try {
                                            engine5 = new Engine(cardRegistry2.scope, new CardTransitionKt$$ExternalSyntheticLambda19(cardRegistry2, function013, i26));
                                            engine5.initialize();
                                            cardRegistry2.sceneEngine = engine5;
                                        } catch (Exception e5) {
                                            e = e5;
                                            Timber.Forest forest3 = Timber.Forest;
                                            forest3.tag("sceneCache");
                                            z10 = false;
                                            forest3.e("Engine creation failed", new Object[0], e);
                                            parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                                            function013.invoke();
                                            r7.end(z10);
                                            cardScene = null;
                                            if (cardScene != null) {
                                            }
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        mutableState20 = mutableState14;
                                    }
                                } else {
                                    mutableState20 = mutableState14;
                                }
                                CardScene cardScene7 = cardRegistry2.sharedScene;
                                if (cardScene7 == null) {
                                    try {
                                        cardScene7 = new CardScene(context, engine5);
                                        cardScene7.configureCamera(25.0f, 8.87f);
                                        cardRegistry2.sharedScene = cardScene7;
                                    } catch (Exception e7) {
                                        Timber.Forest forest4 = Timber.Forest;
                                        forest4.tag("sceneCache");
                                        z10 = false;
                                        forest4.e("CardScene creation failed", new Object[0], e7);
                                        parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                                        function013.invoke();
                                        r7.end(z10);
                                        cardScene = null;
                                        if (cardScene != null) {
                                        }
                                    }
                                }
                                cardScene = cardScene7;
                                boolean changedInstance14 = r7.changedInstance(cardRegistry2);
                                Object rememberedValue60 = r7.rememberedValue();
                                Object obj43 = rememberedValue60;
                                if (changedInstance14 || rememberedValue60 == neverEqualPolicy) {
                                    CardAppletTileKt$$ExternalSyntheticLambda31 cardAppletTileKt$$ExternalSyntheticLambda31 = new CardAppletTileKt$$ExternalSyntheticLambda31(cardRegistry2, 2);
                                    r7.updateRememberedValue(cardAppletTileKt$$ExternalSyntheticLambda31);
                                    obj43 = cardAppletTileKt$$ExternalSyntheticLambda31;
                                }
                                Updater.DisposableEffect(unit, (Function1) obj43, (Composer) r7);
                                r7.end(false);
                            }
                            if (cardScene != null) {
                            }
                        }
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        final int i27 = 1;
                        endRestartGroup.updateScope(new Function2() { // from class: com.squareup.cash.wallet.views.CoreInteractiveCardKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj152, Object obj162) {
                                switch (i27) {
                                    case 0:
                                        ((Integer) obj162).intValue();
                                        CoreInteractiveCardKt.InteractiveCardEffect(modifier2, interactiveCardState3, heroCardDetails, function16, function15, function04, function05, z4, z3, (Composer) obj152, Updater.updateChangedFlags(i | 1), i2);
                                        break;
                                    case 1:
                                        ((Integer) obj162).intValue();
                                        CoreInteractiveCardKt.InteractiveCardEffect(modifier2, interactiveCardState3, heroCardDetails, function16, function15, function04, function05, z4, z3, (Composer) obj152, Updater.updateChangedFlags(i | 1), i2);
                                        break;
                                    case 2:
                                        ((Integer) obj162).intValue();
                                        CoreInteractiveCardKt.InteractiveCardEffect(modifier2, interactiveCardState3, heroCardDetails, function16, function15, function04, function05, z4, z3, (Composer) obj152, Updater.updateChangedFlags(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj162).intValue();
                                        CoreInteractiveCardKt.InteractiveCardEffect(modifier2, interactiveCardState3, heroCardDetails, function16, function15, function04, function05, z4, z3, (Composer) obj152, Updater.updateChangedFlags(i | 1), i2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i15;
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                if (r7.shouldExecute(i3 & 1, (i3 & 38347923) == 38347922)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function14 = function12;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i15;
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            if (r7.shouldExecute(i3 & 1, (i3 & 38347923) == 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function13 = function1;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function14 = function12;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i15;
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if (r7.shouldExecute(i3 & 1, (i3 & 38347923) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final boolean InteractiveCardEffect$lambda$20(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final Object access$fadeIn(Animatable animatable, MutableState mutableState, long j, CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1.AnonymousClass6 anonymousClass6) {
        Object collectLatest;
        return (((Number) animatable.getValue()).floatValue() == RecyclerView.DECELERATION_RATE && (collectLatest = FlowKt.collectLatest(FlowsKt.animatedFlow(mutableState, j, 200L), new CoreInteractiveCardKt$fadeIn$2(animatable, null), anonymousClass6)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? collectLatest : Unit.INSTANCE;
    }
}
