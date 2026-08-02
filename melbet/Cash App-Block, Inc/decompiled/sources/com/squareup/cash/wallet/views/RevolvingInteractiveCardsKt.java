package com.squareup.cash.wallet.views;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cardcustomizations.signature.SignaturesKt$Signature$1$1;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardTextureState;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.views.GraphicsError;
import com.squareup.cash.instruments.views.CardArtImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.android.StringsKt;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.util.compose.MotionKt$produceAnimationsEnabled$1$1;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.TimerWorker$run$1;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.stripe.android.uicore.image.StripeImageKt$$ExternalSyntheticLambda2;
import com.stripe.android.uicore.image.StripeImageKt$$ExternalSyntheticLambda3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public abstract class RevolvingInteractiveCardsKt {
    public static final void Card2DFallback(Function0 function0, CardNuxState cardNuxState, Function0 function02, Function0 function03, FiniteAnimationSpec finiteAnimationSpec, Composer composer, int i) {
        int i2;
        Function0 function04;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(464859248);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(cardNuxState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function04 = function02;
            i2 |= gapComposer.changedInstance(function04) ? 256 : 128;
        } else {
            function04 = function02;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function03) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(finiteAnimationSpec) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | gapComposer.changedInstance(cardNuxState);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                TakeUntil$collectSafely$2 takeUntil$collectSafely$2 = new TakeUntil$collectSafely$2(function0, function04, function03, cardNuxState, null, 12);
                gapComposer.updateRememberedValue(takeUntil$collectSafely$2);
                rememberedValue = takeUntil$collectSafely$2;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            CrossfadeKt.Crossfade(cardNuxState.getCurrentCard(), KeypadKt.m3658mooncakeShadowWMci_g0$default(SizeKt.m292widthInVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.wallet_card_max_width), 1), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.2f, RoundedCornerShapeKt.RoundedCornerShape(6), 19), finiteAnimationSpec, (String) null, UtilsKt.lambda$1920557439, gapComposer, ((i3 >> 6) & 896) | 24576, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17(function0, cardNuxState, function02, function03, finiteAnimationSpec, i, 14);
        }
    }

    public static final void CardGridPreInit(List list, CardNuxState cardNuxState, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1968447743);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(cardNuxState) ? 32 : 16);
        int i3 = 19;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean changed = gapComposer.changed(list);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj = rememberedValue;
            if (changed || rememberedValue == neverEqualPolicy) {
                List take = CollectionsKt.take(list, 6);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                Iterator it = take.iterator();
                while (it.hasNext()) {
                    arrayList.add(toCardViewModelInternal((CardSchemeViewModel.Module.HeroCardDetails) it.next()));
                }
                gapComposer.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            List list2 = (List) obj;
            Continuation continuation = null;
            if (list2.size() == 6) {
                gapComposer.startReplaceGroup(-1456513757);
                CardGridNuxScene cardGridNuxScene = (CardGridNuxScene) cardNuxState.lazyCardGridNuxScene.getValue();
                boolean changedInstance = gapComposer.changedInstance(cardGridNuxScene) | gapComposer.changedInstance(list2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new WorkflowNode$tick$1$1(cardGridNuxScene, list2, continuation, i3);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                float[] fArr = CardGridNuxScene.X_AXIS;
                Updater.LaunchedEffect(cardGridNuxScene, list2, (Function2) rememberedValue2, gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1456236989);
                gapComposer.end(false);
            }
            CardScene cardScene = (CardScene) cardNuxState.lazyCardScene.getValue();
            boolean changedInstance2 = gapComposer.changedInstance(cardScene) | gapComposer.changedInstance(cardNuxState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new TimerWorker$run$1(cardScene, cardNuxState, continuation, 9);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            int i4 = CardScene.$r8$clinit;
            Updater.LaunchedEffect(gapComposer, cardScene, (Function2) rememberedValue3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(list, cardNuxState, i, i3);
        }
    }

    public static final void FilamentCardContent(CardNuxState cardNuxState, Function0 function0, CardModelView cardModelView, FiniteAnimationSpec finiteAnimationSpec, Function0 function02, Function0 function03, Function1 function1, Function0 function04, Composer composer, int i) {
        int i2;
        Function0 function05;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2102219360);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(cardNuxState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function05 = function0;
            i2 |= gapComposer2.changedInstance(function05) ? 32 : 16;
        } else {
            function05 = function0;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer2.changed(cardModelView) : gapComposer2.changedInstance(cardModelView) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(finiteAnimationSpec) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function03) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function04) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            gapComposer = gapComposer2;
            CrossfadeKt.Crossfade(cardNuxState.getCurrentCard(), SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), finiteAnimationSpec, (String) null, Expect_jvmKt.rememberComposableLambda(-1387628111, new StripeImageKt$$ExternalSyntheticLambda2(function05, cardNuxState, cardModelView, function04, function02, function03, function1, 4), gapComposer2), gapComposer, ((i3 >> 3) & 896) | 24624, 8);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StripeImageKt$$ExternalSyntheticLambda3(cardNuxState, function0, cardModelView, finiteAnimationSpec, function02, function03, function1, function04, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RevolvingInteractiveCards(Modifier modifier, final ArrayList arrayList, final boolean z, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z2, boolean z3, final boolean z4, boolean z5, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function1 function12;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z6;
        int i10;
        final FiniteAnimationSpec finiteAnimationSpec2;
        final boolean z7;
        final boolean z8;
        final Modifier modifier3;
        final Function1 function13;
        final boolean z9;
        RecomposeScopeImpl endRestartGroup;
        FiniteAnimationSpec finiteAnimationSpec3;
        boolean z10;
        Modifier modifier4;
        boolean z11;
        FiniteAnimationSpec finiteAnimationSpec4;
        FiniteAnimationSpec finiteAnimationSpec5;
        MutableState mutableState;
        MutableState mutableState2;
        int i11;
        Continuation continuation;
        CardRegistry.SharedCardTransitionState sharedCardTransitionState;
        CardNuxState cardNuxState;
        int i12;
        boolean z12;
        Function1 function14;
        boolean z13;
        int i13;
        CardRegistry.SharedCardTransitionState sharedCardTransitionState2;
        Object obj;
        String str;
        MutableState mutableState3;
        Continuation continuation2;
        MutableState mutableState4;
        Modifier modifier5;
        Modifier focusable;
        boolean z14;
        FiniteAnimationSpec finiteAnimationSpec6;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        MutableState mutableState8;
        Object obj2;
        MutableState mutableState9;
        CardNuxState cardNuxState2;
        MutableState mutableState10;
        MutableState mutableState11;
        MutableState mutableState12;
        Modifier wrapContentHeight;
        FiniteAnimationSpec finiteAnimationSpec7;
        boolean z15;
        boolean z16;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(716530049);
        Applier applier = gapComposer.applier;
        int i14 = i2 & 1;
        if (i14 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i | (gapComposer.changed(modifier2) ? 4 : 2);
        }
        int i15 = i3 | (gapComposer.changedInstance(arrayList) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        int i16 = i2 & 8;
        if (i16 != 0) {
            i4 = i15 | 3072;
            function12 = function1;
        } else {
            function12 = function1;
            i4 = i15 | (gapComposer.changedInstance(function12) ? 2048 : 1024);
        }
        if ((i2 & 16) == 0 && gapComposer.changedInstance(finiteAnimationSpec)) {
            i5 = 16384;
            int i17 = i4 | i5;
            i6 = i2 & 32;
            if (i6 == 0) {
                i17 |= 196608;
            } else if ((i & 196608) == 0) {
                i17 |= gapComposer.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            i7 = i2 & 64;
            if (i7 == 0) {
                i8 = i17 | 1572864;
            } else {
                i8 = i17 | (gapComposer.changed(z3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
            }
            int i18 = i8 | (!gapComposer.changed(z4) ? 8388608 : 4194304);
            i9 = i2 & 256;
            if (i9 == 0) {
                i10 = i18 | 100663296;
                z6 = z5;
            } else {
                z6 = z5;
                i10 = i18 | (gapComposer.changed(z6) ? 67108864 : 33554432);
            }
            if (gapComposer.shouldExecute(i10 & 1, (i10 & 38347923) == 38347922)) {
                gapComposer.skipToGroupEnd();
                finiteAnimationSpec2 = finiteAnimationSpec;
                z7 = z3;
                z8 = z6;
                modifier3 = modifier2;
                function13 = function12;
                z9 = z2;
            } else {
                gapComposer.startDefaults();
                int i19 = i & 1;
                Object obj3 = Composer.Companion.Empty;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i19 == 0 || gapComposer.getDefaultsInvalid()) {
                    if (i14 != 0) {
                        modifier2 = companion;
                    }
                    if (i16 != 0) {
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == obj3) {
                            rememberedValue = new CardAppletTile$$ExternalSyntheticLambda0(21);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        function12 = (Function1) rememberedValue;
                    }
                    if ((i2 & 16) != 0) {
                        finiteAnimationSpec3 = CardNuxAnimationsKt.DEFAULT_REVOLVING_CROSSFADE;
                        i10 &= -57345;
                    } else {
                        finiteAnimationSpec3 = finiteAnimationSpec;
                    }
                    z10 = i6 != 0 ? false : z2;
                    modifier4 = modifier2;
                    z11 = i7 != 0 ? false : z3;
                    if (i9 != 0) {
                        z6 = false;
                    }
                    finiteAnimationSpec4 = finiteAnimationSpec3;
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i10 &= -57345;
                    }
                    finiteAnimationSpec4 = finiteAnimationSpec;
                    z10 = z2;
                    z11 = z3;
                    modifier4 = modifier2;
                }
                Function1 function15 = function12;
                gapComposer.endDefaults();
                Boolean bool = Boolean.FALSE;
                Object rememberedValue2 = gapComposer.rememberedValue();
                int i20 = 3;
                Continuation continuation3 = null;
                if (rememberedValue2 == obj3) {
                    finiteAnimationSpec5 = finiteAnimationSpec4;
                    rememberedValue2 = new MotionKt$produceAnimationsEnabled$1$1(2, continuation3, i20);
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    finiteAnimationSpec5 = finiteAnimationSpec4;
                }
                MutableState produceState = Updater.produceState(gapComposer, bool, (Function2) rememberedValue2);
                int i21 = i10 >> 3;
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(arrayList, gapComposer);
                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState((z10 && ((Boolean) produceState.getValue()).booleanValue()) ? Hero3DCardViewKt.CARD_HOME_BACKWARD_RESTING : Hero3DCardViewKt.BACKWARD_RESTING, gapComposer);
                MutableState rememberUpdatedState3 = Updater.rememberUpdatedState((z10 && ((Boolean) produceState.getValue()).booleanValue()) ? Hero3DCardViewKt.CARD_HOME_FORWARD_RESTING : Hero3DCardViewKt.FORWARD_RESTING, gapComposer);
                Object rememberedValue3 = gapComposer.rememberedValue();
                boolean z17 = z6;
                if (rememberedValue3 == obj3) {
                    rememberedValue3 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Animatable animatable = (Animatable) rememberedValue3;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == obj3) {
                    rememberedValue4 = new CardWobbleState();
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                CardWobbleState cardWobbleState = (CardWobbleState) rememberedValue4;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == obj3) {
                    rememberedValue5 = Updater.mutableStateOf$default((Quat) rememberUpdatedState3.getValue());
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                MutableState mutableState13 = (MutableState) rememberedValue5;
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == obj3) {
                    mutableState2 = rememberUpdatedState3;
                    mutableState = mutableState13;
                    rememberedValue6 = new CardRegistry.SharedCardTransitionState(Updater.derivedStateOf(new Hero3DCardViewKt$$ExternalSyntheticLambda6(cardWobbleState, mutableState13, 4)), Updater.derivedStateOf(new ListsKt$$ExternalSyntheticLambda0(5, animatable, cardWobbleState)));
                    gapComposer.updateRememberedValue(rememberedValue6);
                } else {
                    mutableState = mutableState13;
                    mutableState2 = rememberUpdatedState3;
                }
                CardRegistry.SharedCardTransitionState sharedCardTransitionState3 = (CardRegistry.SharedCardTransitionState) rememberedValue6;
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (rememberedValue7 == obj3) {
                    i11 = 0;
                    rememberedValue7 = new CoreInteractiveCardKt$$ExternalSyntheticLambda4(sharedCardTransitionState3, 0);
                    gapComposer.updateRememberedValue(rememberedValue7);
                } else {
                    i11 = 0;
                }
                MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(CardTransitionKt.syncCardTransition((Function0) rememberedValue7, gapComposer), gapComposer);
                CardNuxState rememberCardNuxState = CardTransitionKt.rememberCardNuxState((CardSchemeViewModel.Module.HeroCardDetails) arrayList.get(i11), gapComposer);
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (rememberedValue8 == obj3) {
                    rememberedValue8 = Updater.mutableStateOf$default(bool);
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                MutableState mutableState14 = (MutableState) rememberedValue8;
                Unit unit = Unit.INSTANCE;
                Object rememberedValue9 = gapComposer.rememberedValue();
                int i22 = 6;
                if (rememberedValue9 == obj3) {
                    rememberedValue9 = new HeroTagViewKt$$ExternalSyntheticLambda7(i22, mutableState14);
                    gapComposer.updateRememberedValue(rememberedValue9);
                }
                DimensionKt.LifecycleResumeEffect(unit, null, (Function1) rememberedValue9, gapComposer, 390);
                boolean changedInstance = gapComposer.changedInstance(rememberCardNuxState) | ((i10 & 7168) == 2048);
                Object rememberedValue10 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue10 == obj3) {
                    continuation = null;
                    rememberedValue10 = new TimerWorker$run$1(rememberCardNuxState, function15, continuation, 12);
                    gapComposer.updateRememberedValue(rememberedValue10);
                } else {
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue10);
                boolean changed = gapComposer.changed(rememberUpdatedState4) | gapComposer.changedInstance(rememberCardNuxState);
                Object rememberedValue11 = gapComposer.rememberedValue();
                if (changed || rememberedValue11 == obj3) {
                    rememberedValue11 = new CardAppletWorker$setup$1$2$1(rememberUpdatedState4, sharedCardTransitionState3, rememberCardNuxState, continuation, 19);
                    sharedCardTransitionState = sharedCardTransitionState3;
                    cardNuxState = rememberCardNuxState;
                    gapComposer.updateRememberedValue(rememberedValue11);
                } else {
                    cardNuxState = rememberCardNuxState;
                    sharedCardTransitionState = sharedCardTransitionState3;
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue11);
                if (z17 && z4) {
                    i12 = 6;
                    if (((List) rememberUpdatedState.getValue()).size() >= 6) {
                        z12 = true;
                        if (z12) {
                            function14 = function15;
                            z13 = false;
                            gapComposer.startReplaceGroup(161974497);
                            gapComposer.end(false);
                        } else {
                            function14 = function15;
                            gapComposer.startReplaceGroup(161937979);
                            CardTransitionKt.CardTransition("card_nux", gapComposer, i12);
                            z13 = false;
                            gapComposer.end(false);
                        }
                        if (z12) {
                            gapComposer.startReplaceGroup(162088391);
                            int i23 = (i10 & 14) | 48;
                            i13 = i10;
                            sharedCardTransitionState2 = sharedCardTransitionState;
                            obj = obj3;
                            str = "card_nux";
                            mutableState3 = mutableState2;
                            continuation2 = null;
                            mutableState4 = rememberUpdatedState2;
                            modifier5 = modifier4;
                            focusable = CanvasKt.focusable(SizeKt.fillMaxWidth(CardTransitionKt.cardTransition(i23, 2, gapComposer, modifier4, "card_nux", false), 1.0f), true, null);
                            z14 = false;
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(162028716);
                            gapComposer.end(z13);
                            i13 = i10;
                            sharedCardTransitionState2 = sharedCardTransitionState;
                            str = "card_nux";
                            modifier5 = modifier4;
                            mutableState3 = mutableState2;
                            obj = obj3;
                            z14 = false;
                            continuation2 = null;
                            focusable = CanvasKt.focusable(SizeKt.fillMaxWidth(modifier4, 1.0f), true, null);
                            mutableState4 = rememberUpdatedState2;
                        }
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z14);
                        Continuation continuation4 = continuation2;
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, focusable);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        if (applier != null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
                        Object rememberedValue12 = gapComposer.rememberedValue();
                        Object obj4 = obj;
                        if (rememberedValue12 == obj4) {
                            rememberedValue12 = Updater.mutableStateOf$default(bool);
                            gapComposer.updateRememberedValue(rememberedValue12);
                        }
                        MutableState mutableState15 = (MutableState) rememberedValue12;
                        if (!z || ((Boolean) mutableState15.getValue()).booleanValue()) {
                            FiniteAnimationSpec finiteAnimationSpec8 = finiteAnimationSpec5;
                            CardNuxState cardNuxState3 = cardNuxState;
                            gapComposer.startReplaceGroup(-1803906829);
                            boolean changed2 = gapComposer.changed(rememberUpdatedState);
                            Object rememberedValue13 = gapComposer.rememberedValue();
                            if (changed2 || rememberedValue13 == obj4) {
                                rememberedValue13 = new HeroCardViewKt$$ExternalSyntheticLambda15(23, rememberUpdatedState);
                                gapComposer.updateRememberedValue(rememberedValue13);
                            }
                            Function0 function0 = (Function0) rememberedValue13;
                            Object rememberedValue14 = gapComposer.rememberedValue();
                            if (rememberedValue14 == obj4) {
                                rememberedValue14 = new HeroCardViewKt$$ExternalSyntheticLambda15(24, mutableState14);
                                gapComposer.updateRememberedValue(rememberedValue14);
                            }
                            Function0 function02 = (Function0) rememberedValue14;
                            boolean changed3 = gapComposer.changed(rememberUpdatedState4);
                            Object rememberedValue15 = gapComposer.rememberedValue();
                            if (changed3 || rememberedValue15 == obj4) {
                                rememberedValue15 = new HeroCardViewKt$$ExternalSyntheticLambda15(25, rememberUpdatedState4);
                                gapComposer.updateRememberedValue(rememberedValue15);
                            }
                            Card2DFallback(function0, cardNuxState3, function02, (Function0) rememberedValue15, finiteAnimationSpec8, gapComposer, (i13 & 57344) | MLKEMEngine.KyberPolyBytes);
                            finiteAnimationSpec6 = finiteAnimationSpec8;
                            gapComposer = gapComposer;
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-1812239381);
                            Object rememberedValue16 = gapComposer.rememberedValue();
                            if (rememberedValue16 == obj4) {
                                rememberedValue16 = Updater.mutableStateOf$default(continuation4);
                                gapComposer.updateRememberedValue(rememberedValue16);
                            }
                            MutableState mutableState16 = (MutableState) rememberedValue16;
                            Object rememberedValue17 = gapComposer.rememberedValue();
                            if (rememberedValue17 == obj4) {
                                rememberedValue17 = Updater.mutableStateOf$default(continuation4);
                                gapComposer.updateRememberedValue(rememberedValue17);
                            }
                            MutableState mutableState17 = (MutableState) rememberedValue17;
                            Object rememberedValue18 = gapComposer.rememberedValue();
                            if (rememberedValue18 == obj4) {
                                rememberedValue18 = Updater.mutableStateOf$default(bool);
                                gapComposer.updateRememberedValue(rememberedValue18);
                            }
                            MutableState mutableState18 = (MutableState) rememberedValue18;
                            Object rememberedValue19 = gapComposer.rememberedValue();
                            if (rememberedValue19 == obj4) {
                                rememberedValue19 = Updater.mutableStateOf$default(continuation4);
                                gapComposer.updateRememberedValue(rememberedValue19);
                            }
                            MutableState mutableState19 = (MutableState) rememberedValue19;
                            Object rememberedValue20 = gapComposer.rememberedValue();
                            if (rememberedValue20 == obj4) {
                                mutableState6 = mutableState16;
                                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                                rememberedValue20 = new Hero3DCardViewKt$InteractiveCard$5$1(mutableState18, mutableState17, mutableState6, continuation4, 4);
                                mutableState5 = mutableState17;
                                gapComposer.updateRememberedValue(rememberedValue20);
                            } else {
                                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                                mutableState5 = mutableState17;
                                mutableState6 = mutableState16;
                            }
                            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue20);
                            CardModelView cardModelView = (CardModelView) mutableState6.getValue();
                            Object rememberedValue21 = gapComposer.rememberedValue();
                            if (rememberedValue21 == obj4) {
                                mutableState7 = mutableState4;
                                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                                mutableState8 = mutableState6;
                                rememberedValue21 = new CardArtImageKt$$ExternalSyntheticLambda0(mutableState8, mutableState5, 3);
                                gapComposer.updateRememberedValue(rememberedValue21);
                            } else {
                                mutableState7 = mutableState4;
                                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                                mutableState8 = mutableState6;
                            }
                            Paint paint = CardModelView.REMOVE_PAINT;
                            MutableState mutableState20 = mutableState5;
                            CardTransitionKt.RegisterCardModelView(str, cardModelView, (Function1) rememberedValue21, gapComposer, Constants.METRO_BY_T_MOBILE);
                            Object rememberedValue22 = gapComposer.rememberedValue();
                            if (rememberedValue22 == obj4) {
                                rememberedValue22 = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
                                gapComposer.updateRememberedValue(rememberedValue22);
                            }
                            MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue22;
                            long refreshRate = 1000 / ((long) ((View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView)).getDisplay().getRefreshRate());
                            boolean changedInstance2 = gapComposer.changedInstance(mutableSharedFlow);
                            Object rememberedValue23 = gapComposer.rememberedValue();
                            if (changedInstance2 || rememberedValue23 == obj4) {
                                obj2 = obj4;
                                rememberedValue23 = new SignaturesKt$Signature$1$1(mutableState19, mutableState8, mutableSharedFlow, 5);
                                gapComposer.updateRememberedValue(rememberedValue23);
                            } else {
                                obj2 = obj4;
                            }
                            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, unit, (PointerInputEventHandler) rememberedValue23);
                            if (!z10) {
                                pointerInput = null;
                            }
                            if (pointerInput == null) {
                                pointerInput = companion;
                            }
                            if (z11) {
                                gapComposer.startReplaceGroup(-1810449968);
                                CardTransitionKt.MoneyCardIntroAnimation(gapComposer, 0);
                                gapComposer.end(false);
                                mutableState9 = mutableState8;
                            } else {
                                mutableState9 = mutableState8;
                                gapComposer.startReplaceGroup(-1810408645);
                                gapComposer.end(false);
                            }
                            State cardNuxAnimation = CardTransitionKt.cardNuxAnimation(gapComposer);
                            Object systemService = ((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getSystemService("activity");
                            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                            CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(CardTransitionKt.LocalCardRegistry);
                            boolean changed4 = gapComposer.changed(rememberUpdatedState4) | gapComposer.changed(produceState) | gapComposer.changedInstance(mutableSharedFlow) | ((i13 & 458752) == 131072) | gapComposer.changedInstance(cardWobbleState) | gapComposer.changedInstance(cardNuxState) | gapComposer.changed(mutableState3) | gapComposer.changedInstance(animatable) | ((i13 & 3670016) == 1048576) | gapComposer.changed(refreshRate) | gapComposer.changed(cardNuxAnimation) | gapComposer.changed(rememberUpdatedState) | gapComposer.changedInstance(activityManager) | gapComposer.changedInstance(cardRegistry) | gapComposer.changed(mutableState7);
                            Object rememberedValue24 = gapComposer.rememberedValue();
                            Object obj5 = obj2;
                            if (changed4 || rememberedValue24 == obj5) {
                                MutableState mutableState21 = mutableState9;
                                CardNuxState cardNuxState4 = cardNuxState;
                                rememberedValue24 = new RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1(rememberUpdatedState4, z11, mutableSharedFlow, produceState, z10, cardWobbleState, mutableState, cardNuxState4, mutableState3, animatable, mutableState20, mutableState18, mutableState21, mutableState14, refreshRate, cardNuxAnimation, rememberUpdatedState, activityManager, cardRegistry, mutableState7, null);
                                cardNuxState2 = cardNuxState4;
                                mutableState20 = mutableState20;
                                mutableState10 = mutableState18;
                                mutableState11 = mutableState21;
                                mutableState12 = rememberUpdatedState;
                                gapComposer.updateRememberedValue(rememberedValue24);
                            } else {
                                mutableState12 = rememberUpdatedState;
                                cardNuxState2 = cardNuxState;
                                mutableState11 = mutableState9;
                                mutableState10 = mutableState18;
                            }
                            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue24);
                            Modifier aspectRatio = OffsetKt.aspectRatio(1.5857725f, SizeKt.m292widthInVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.wallet_card_max_width), 1), false);
                            float[] fArr = Hero3DCardViewKt.X_AXIS;
                            aspectRatio.getClass();
                            wrapContentHeight = SizeKt.wrapContentHeight(ValueInsets.layout(aspectRatio, new Hero3DCardViewKt$$ExternalSyntheticLambda11(0)), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                            Modifier then = OffsetKt.aspectRatio(1.0f, wrapContentHeight, false).then(pointerInput);
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, then);
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
                            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                            if (z4) {
                                FiniteAnimationSpec finiteAnimationSpec9 = finiteAnimationSpec5;
                                CardRegistry.SharedCardTransitionState sharedCardTransitionState4 = sharedCardTransitionState2;
                                gapComposer.startReplaceGroup(-276484018);
                                if (!z17 || ((List) mutableState12.getValue()).size() < 6) {
                                    gapComposer.startReplaceGroup(-276352454);
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.startReplaceGroup(-276427412);
                                    CardGridPreInit((List) mutableState12.getValue(), cardNuxState2, gapComposer, 0);
                                    gapComposer.end(false);
                                }
                                Boolean bool2 = (Boolean) cardNuxState2.engineErrored$delegate.getValue();
                                bool2.getClass();
                                mutableState15.setValue(bool2);
                                mutableState19.setValue((CardScene) cardNuxState2.lazyCardScene.getValue());
                                boolean changed5 = gapComposer.changed(rememberUpdatedState4);
                                Object rememberedValue25 = gapComposer.rememberedValue();
                                if (changed5 || rememberedValue25 == obj5) {
                                    rememberedValue25 = new RevolvingInteractiveCardsKt$$ExternalSyntheticLambda2(sharedCardTransitionState4, rememberUpdatedState4, 0);
                                    gapComposer.updateRememberedValue(rememberedValue25);
                                }
                                Function0 function03 = (Function0) rememberedValue25;
                                if (!z17 || ((List) mutableState12.getValue()).size() < 6) {
                                    finiteAnimationSpec7 = finiteAnimationSpec9;
                                    z15 = false;
                                } else {
                                    finiteAnimationSpec7 = finiteAnimationSpec9;
                                    z15 = true;
                                }
                                Object rememberedValue26 = gapComposer.rememberedValue();
                                if (rememberedValue26 == obj5) {
                                    rememberedValue26 = new HeroCardViewKt$$ExternalSyntheticLambda15(22, mutableState10);
                                    gapComposer.updateRememberedValue(rememberedValue26);
                                }
                                FiniteAnimationSpec finiteAnimationSpec10 = finiteAnimationSpec7;
                                SwampGLCardContent(cardNuxState2, function03, finiteAnimationSpec10, z15, (Function0) rememberedValue26, gapComposer, ((i13 >> 6) & 896) | 24576);
                                finiteAnimationSpec6 = finiteAnimationSpec10;
                                gapComposer = gapComposer;
                                z16 = false;
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-276952211);
                                boolean changed6 = gapComposer.changed(rememberUpdatedState4);
                                Object rememberedValue27 = gapComposer.rememberedValue();
                                if (changed6 || rememberedValue27 == obj5) {
                                    rememberedValue27 = new RevolvingInteractiveCardsKt$$ExternalSyntheticLambda2(sharedCardTransitionState2, rememberUpdatedState4, 2);
                                    gapComposer.updateRememberedValue(rememberedValue27);
                                }
                                Function0 function04 = (Function0) rememberedValue27;
                                CardModelView cardModelView2 = (CardModelView) mutableState20.getValue();
                                Object rememberedValue28 = gapComposer.rememberedValue();
                                if (rememberedValue28 == obj5) {
                                    rememberedValue28 = new HeroCardViewKt$$ExternalSyntheticLambda15(19, mutableState10);
                                    gapComposer.updateRememberedValue(rememberedValue28);
                                }
                                Function0 function05 = (Function0) rememberedValue28;
                                Object rememberedValue29 = gapComposer.rememberedValue();
                                if (rememberedValue29 == obj5) {
                                    rememberedValue29 = new HeroCardViewKt$$ExternalSyntheticLambda15(20, mutableState10);
                                    gapComposer.updateRememberedValue(rememberedValue29);
                                }
                                Function0 function06 = (Function0) rememberedValue29;
                                Object rememberedValue30 = gapComposer.rememberedValue();
                                if (rememberedValue30 == obj5) {
                                    rememberedValue30 = new HeroTagViewKt$$ExternalSyntheticLambda7(7, mutableState11);
                                    gapComposer.updateRememberedValue(rememberedValue30);
                                }
                                Function1 function16 = (Function1) rememberedValue30;
                                Object rememberedValue31 = gapComposer.rememberedValue();
                                if (rememberedValue31 == obj5) {
                                    rememberedValue31 = new HeroCardViewKt$$ExternalSyntheticLambda15(21, mutableState15);
                                    gapComposer.updateRememberedValue(rememberedValue31);
                                }
                                finiteAnimationSpec6 = finiteAnimationSpec5;
                                FilamentCardContent(cardNuxState2, function04, cardModelView2, finiteAnimationSpec6, function05, function06, function16, (Function0) rememberedValue31, gapComposer, 14377472 | (i21 & 7168));
                                gapComposer = gapComposer;
                                z16 = false;
                                gapComposer.end(false);
                            }
                            gapComposer.end(true);
                            gapComposer.end(z16);
                        }
                        gapComposer.end(true);
                        z8 = z17;
                        finiteAnimationSpec2 = finiteAnimationSpec6;
                        z7 = z11;
                        z9 = z10;
                        function13 = function14;
                        modifier3 = modifier5;
                    }
                } else {
                    i12 = 6;
                }
                z12 = false;
                if (z12) {
                }
                if (z12) {
                }
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z14);
                Continuation continuation42 = continuation2;
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, focusable);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$122 = ComposeUiNode.Companion.Constructor;
                if (applier != null) {
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        RevolvingInteractiveCardsKt.RevolvingInteractiveCards(Modifier.this, arrayList, z, function13, finiteAnimationSpec2, z9, z7, z4, z8, (Composer) obj6, Updater.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        i5 = PKIFailureInfo.certRevoked;
        int i172 = i4 | i5;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        int i182 = i8 | (!gapComposer.changed(z4) ? 8388608 : 4194304);
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if (gapComposer.shouldExecute(i10 & 1, (i10 & 38347923) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SwampGLCardContent(CardNuxState cardNuxState, Function0 function0, FiniteAnimationSpec finiteAnimationSpec, boolean z, Function0 function02, Composer composer, int i) {
        int i2;
        boolean z2;
        FiniteAnimationSpec finiteAnimationSpec2;
        Function0 function03;
        GapComposer gapComposer;
        CardNuxState cardNuxState2;
        Object roomDatabase$performClear$1;
        CardScene cardScene;
        Boolean bool;
        int i3;
        MutableFloatState mutableFloatState;
        NeverEqualPolicy neverEqualPolicy;
        Animatable animatable;
        MutableState mutableState;
        Continuation continuation;
        Animatable animatable2;
        MutableState mutableState2;
        boolean z3;
        MutableFloatState mutableFloatState2;
        Boolean bool2;
        Boolean bool3;
        MutableState mutableState3;
        boolean z4;
        int i4;
        Animatable animatable3;
        CardScene cardScene2;
        Animatable animatable4;
        MutableFloatState mutableFloatState3;
        CardNuxState cardNuxState3 = cardNuxState;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1696132984);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(cardNuxState3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(finiteAnimationSpec) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i5 = i2;
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            CardScene cardScene3 = (CardScene) cardNuxState3.lazyCardScene.getValue();
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState4 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState5 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Animatable animatable5 = (Animatable) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy2) {
                rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer2);
            }
            MutableFloatState mutableFloatState4 = (MutableFloatState) rememberedValue4;
            Boolean valueOf = Boolean.valueOf(z);
            int i6 = i5 & 7168;
            boolean changedInstance = (i6 == 2048) | gapComposer2.changedInstance(cardNuxState3);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue5 == neverEqualPolicy2) {
                cardScene = cardScene3;
                bool = valueOf;
                i3 = i5;
                mutableFloatState = mutableFloatState4;
                neverEqualPolicy = neverEqualPolicy2;
                animatable = animatable5;
                mutableState = mutableState4;
                continuation = null;
                roomDatabase$performClear$1 = new RoomDatabase$performClear$1(z, cardNuxState3, mutableState, continuation, 22);
                gapComposer2.updateRememberedValue(roomDatabase$performClear$1);
            } else {
                cardScene = cardScene3;
                bool = valueOf;
                neverEqualPolicy = neverEqualPolicy2;
                i3 = i5;
                mutableState = mutableState4;
                continuation = null;
                mutableFloatState = mutableFloatState4;
                roomDatabase$performClear$1 = rememberedValue5;
                animatable = animatable5;
            }
            Updater.LaunchedEffect(gapComposer2, bool, (Function2) roomDatabase$performClear$1);
            if (z) {
                gapComposer2.startReplaceGroup(-791582892);
                UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-508206602, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(4, (CardRegistry) gapComposer2.consume(CardTransitionKt.LocalCardRegistry), mutableFloatState), gapComposer2), gapComposer2, 6);
                Boolean bool4 = (Boolean) mutableState5.getValue();
                bool4.getClass();
                Boolean valueOf2 = Boolean.valueOf(SwampGLCardContent$lambda$1(mutableState));
                boolean changedInstance2 = gapComposer2.changedInstance(animatable);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
                    animatable2 = animatable;
                    rememberedValue6 = new CoreInteractiveCardKt$InteractiveCardEffect$12$1(animatable2, mutableState, mutableState5, continuation, 2);
                    mutableState2 = mutableState5;
                    gapComposer2.updateRememberedValue(rememberedValue6);
                } else {
                    animatable2 = animatable;
                    mutableState2 = mutableState5;
                }
                Updater.LaunchedEffect(bool4, valueOf2, (Function2) rememberedValue6, gapComposer2);
                z3 = false;
                gapComposer2.end(false);
            } else {
                animatable2 = animatable;
                mutableState2 = mutableState5;
                z3 = false;
                gapComposer2.startReplaceGroup(-789409110);
                gapComposer2.end(false);
            }
            Boolean valueOf3 = Boolean.valueOf(SwampGLCardContent$lambda$1(mutableState));
            Boolean valueOf4 = Boolean.valueOf(z);
            int i7 = i3 & 112;
            boolean changedInstance3 = (i7 == 32) | gapComposer2.changedInstance(cardScene) | (i6 == 2048 ? true : z3) | gapComposer2.changedInstance(cardNuxState3);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue7 == neverEqualPolicy) {
                mutableFloatState2 = mutableFloatState;
                bool2 = valueOf3;
                bool3 = valueOf4;
                mutableState3 = mutableState2;
                z4 = false;
                i4 = i7;
                CardScene cardScene4 = cardScene;
                animatable3 = animatable2;
                MutableState mutableState6 = mutableState;
                RealPayDataLoader$fetchData$1 realPayDataLoader$fetchData$1 = new RealPayDataLoader$fetchData$1(14, cardScene4, function0, cardNuxState3, mutableState6, null, z);
                cardScene2 = cardScene4;
                cardNuxState3 = cardNuxState3;
                mutableState = mutableState6;
                gapComposer2.updateRememberedValue(realPayDataLoader$fetchData$1);
                rememberedValue7 = realPayDataLoader$fetchData$1;
            } else {
                bool3 = valueOf4;
                mutableFloatState2 = mutableFloatState;
                mutableState3 = mutableState2;
                z4 = false;
                bool2 = valueOf3;
                i4 = i7;
                cardScene2 = cardScene;
                animatable3 = animatable2;
            }
            int i8 = CardScene.$r8$clinit;
            Updater.LaunchedEffect(cardScene2, bool2, bool3, (Function2) rememberedValue7, gapComposer2);
            boolean changedInstance4 = gapComposer2.changedInstance(cardScene2) | gapComposer2.changedInstance(cardNuxState3) | gapComposer2.changedInstance(finiteAnimationSpec) | (i6 == 2048 ? true : z4) | gapComposer2.changedInstance(animatable3);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue8 == neverEqualPolicy) {
                MutableState mutableState7 = mutableState;
                Animatable animatable6 = animatable3;
                MutableFloatState mutableFloatState5 = mutableFloatState2;
                RealContactSync$syncRequest$2 realContactSync$syncRequest$2 = new RealContactSync$syncRequest$2(cardScene2, cardNuxState3, finiteAnimationSpec, z, animatable6, mutableState7, mutableFloatState5, null, 4);
                cardNuxState2 = cardNuxState3;
                finiteAnimationSpec2 = finiteAnimationSpec;
                animatable4 = animatable6;
                mutableState = mutableState7;
                mutableFloatState3 = mutableFloatState5;
                gapComposer2.updateRememberedValue(realContactSync$syncRequest$2);
                rememberedValue8 = realContactSync$syncRequest$2;
            } else {
                cardNuxState2 = cardNuxState3;
                animatable4 = animatable3;
                mutableFloatState3 = mutableFloatState2;
                finiteAnimationSpec2 = finiteAnimationSpec;
            }
            Updater.LaunchedEffect(cardScene2, finiteAnimationSpec2, (Function2) rememberedValue8, gapComposer2);
            boolean changedInstance5 = (i6 == 2048 ? true : z4) | gapComposer2.changedInstance(animatable4) | (i4 == 32 ? true : z4) | gapComposer2.changedInstance(cardScene2);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (changedInstance5 || rememberedValue9 == neverEqualPolicy) {
                CardScene cardScene5 = cardScene2;
                RealContactSync$syncRequest$2.AnonymousClass1 anonymousClass1 = new RealContactSync$syncRequest$2.AnonymousClass1(11, animatable4, function0, mutableState, mutableFloatState3, cardScene5, (Continuation) null, z);
                cardScene2 = cardScene5;
                z2 = z;
                gapComposer2.updateRememberedValue(anonymousClass1);
                rememberedValue9 = anonymousClass1;
            } else {
                z2 = z;
            }
            Updater.LaunchedEffect(gapComposer2, cardScene2, (Function2) rememberedValue9);
            Engine engine = (Engine) cardNuxState2.lazySwampEngine.getValue();
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z5 = (i3 & 57344) == 16384 ? true : z4;
            if (i6 == 2048) {
                z4 = true;
            }
            boolean z6 = z5 | z4;
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (z6 || rememberedValue10 == neverEqualPolicy) {
                function03 = function02;
                rememberedValue10 = new DialogHostKt$$ExternalSyntheticLambda2(function03, z2, mutableState3, 12);
                gapComposer2.updateRememberedValue(rememberedValue10);
            } else {
                function03 = function02;
            }
            gapComposer = gapComposer2;
            ByteStreamsKt.SwampGLEffect(fillMaxSize, engine, cardScene2, null, false, null, (Function1) rememberedValue10, gapComposer, 582, 56);
        } else {
            z2 = z;
            finiteAnimationSpec2 = finiteAnimationSpec;
            function03 = function02;
            gapComposer = gapComposer2;
            cardNuxState2 = cardNuxState3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(cardNuxState2, function0, finiteAnimationSpec2, z2, function03, i);
        }
    }

    public static final boolean SwampGLCardContent$lambda$1(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00af, code lost:
    
        if (r0 != r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0171, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(300, r9) == r2) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b9 -> B:12:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0171 -> B:12:0x0174). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rotateCards(CardNuxState cardNuxState, List list, ActivityManager activityManager, CardRegistry cardRegistry, ContinuationImpl continuationImpl) {
        RevolvingInteractiveCardsKt$rotateCards$1 revolvingInteractiveCardsKt$rotateCards$1;
        int i;
        CardNuxState cardNuxState2;
        ActivityManager activityManager2;
        CardRegistry cardRegistry2;
        RevolvingInteractiveCardsKt$rotateCards$1 revolvingInteractiveCardsKt$rotateCards$12;
        List list2;
        CardNuxState cardNuxState3;
        List list3;
        ActivityManager activityManager3;
        CardRegistry cardRegistry3;
        if (continuationImpl instanceof RevolvingInteractiveCardsKt$rotateCards$1) {
            revolvingInteractiveCardsKt$rotateCards$1 = (RevolvingInteractiveCardsKt$rotateCards$1) continuationImpl;
            int i2 = revolvingInteractiveCardsKt$rotateCards$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                revolvingInteractiveCardsKt$rotateCards$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = revolvingInteractiveCardsKt$rotateCards$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = revolvingInteractiveCardsKt$rotateCards$1.label;
                Continuation continuation = null;
                int i3 = 2;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    cardNuxState2 = cardNuxState;
                    activityManager2 = activityManager;
                    cardRegistry2 = cardRegistry;
                    revolvingInteractiveCardsKt$rotateCards$12 = revolvingInteractiveCardsKt$rotateCards$1;
                    list2 = list;
                    revolvingInteractiveCardsKt$rotateCards$12.L$0 = cardNuxState2;
                    revolvingInteractiveCardsKt$rotateCards$12.L$1 = list2;
                    revolvingInteractiveCardsKt$rotateCards$12.L$2 = activityManager2;
                    revolvingInteractiveCardsKt$rotateCards$12.L$3 = cardRegistry2;
                    revolvingInteractiveCardsKt$rotateCards$12.label = 1;
                    if (JobKt.delay(1700L, revolvingInteractiveCardsKt$rotateCards$12) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CardRegistry cardRegistry4 = revolvingInteractiveCardsKt$rotateCards$1.L$3;
                        ActivityManager activityManager4 = revolvingInteractiveCardsKt$rotateCards$1.L$2;
                        List list4 = revolvingInteractiveCardsKt$rotateCards$1.L$1;
                        cardNuxState3 = revolvingInteractiveCardsKt$rotateCards$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        revolvingInteractiveCardsKt$rotateCards$12 = revolvingInteractiveCardsKt$rotateCards$1;
                        list2 = list4;
                        cardRegistry2 = cardRegistry4;
                        activityManager2 = activityManager4;
                        cardNuxState2 = cardNuxState3;
                        revolvingInteractiveCardsKt$rotateCards$12.L$0 = cardNuxState2;
                        revolvingInteractiveCardsKt$rotateCards$12.L$1 = list2;
                        revolvingInteractiveCardsKt$rotateCards$12.L$2 = activityManager2;
                        revolvingInteractiveCardsKt$rotateCards$12.L$3 = cardRegistry2;
                        revolvingInteractiveCardsKt$rotateCards$12.label = 1;
                        if (JobKt.delay(1700L, revolvingInteractiveCardsKt$rotateCards$12) != coroutineSingletons) {
                            RevolvingInteractiveCardsKt$rotateCards$1 revolvingInteractiveCardsKt$rotateCards$13 = revolvingInteractiveCardsKt$rotateCards$12;
                            list3 = list2;
                            revolvingInteractiveCardsKt$rotateCards$1 = revolvingInteractiveCardsKt$rotateCards$13;
                            CardRegistry cardRegistry5 = cardRegistry2;
                            activityManager3 = activityManager2;
                            cardRegistry3 = cardRegistry5;
                            cardNuxState3 = cardNuxState2;
                            revolvingInteractiveCardsKt$rotateCards$1.L$0 = cardNuxState3;
                            revolvingInteractiveCardsKt$rotateCards$1.L$1 = list3;
                            revolvingInteractiveCardsKt$rotateCards$1.L$2 = activityManager3;
                            revolvingInteractiveCardsKt$rotateCards$1.L$3 = cardRegistry3;
                            revolvingInteractiveCardsKt$rotateCards$1.label = 2;
                            obj = JobKt.coroutineScope(new RealSheetState$peek$3.AnonymousClass2(i3, continuation, 10), revolvingInteractiveCardsKt$rotateCards$1);
                        }
                        return coroutineSingletons;
                    }
                    cardRegistry3 = revolvingInteractiveCardsKt$rotateCards$1.L$3;
                    activityManager3 = revolvingInteractiveCardsKt$rotateCards$1.L$2;
                    list3 = revolvingInteractiveCardsKt$rotateCards$1.L$1;
                    cardNuxState3 = revolvingInteractiveCardsKt$rotateCards$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    List list5 = list3;
                    revolvingInteractiveCardsKt$rotateCards$12 = revolvingInteractiveCardsKt$rotateCards$1;
                    list2 = list5;
                    ActivityManager activityManager5 = activityManager3;
                    cardRegistry2 = cardRegistry3;
                    activityManager2 = activityManager5;
                    if (((Boolean) obj).booleanValue()) {
                        if (activityManager2 != null) {
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            activityManager2.getMemoryInfo(memoryInfo);
                            if (memoryInfo.availMem / 1048576 < 200 || memoryInfo.lowMemory) {
                                if (cardRegistry2 != null) {
                                    ErrorReporter errorReporter = cardRegistry2.errorReporter;
                                    long j = memoryInfo.availMem / 1048576;
                                    long j2 = memoryInfo.totalMem / 1048576;
                                    long j3 = memoryInfo.threshold / 1048576;
                                    boolean z = memoryInfo.lowMemory;
                                    StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "Low memory detected - Available: ", " MB, Total: ");
                                    m1149m.append(j2);
                                    m1149m.append(" MB, Low memory: ");
                                    m1149m.append(z);
                                    errorReporter.report(new GraphicsError(new LowMemoryException(Boxes$$ExternalSyntheticOutline1.m(j3, ", Threshold: ", " MB", m1149m))), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        Iterator it = list2.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i4 = -1;
                                break;
                            }
                            if (Intrinsics.areEqual((CardSchemeViewModel.Module.HeroCardDetails) it.next(), cardNuxState3.getCurrentCard())) {
                                break;
                            }
                            i4++;
                        }
                        CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) list2.get((i4 + 1) % list2.size());
                        cardNuxState3.getClass();
                        heroCardDetails.getClass();
                        cardNuxState3.currentCard$delegate.setValue(heroCardDetails);
                        CardTextureState currentTextureState = cardNuxState3.getCurrentTextureState();
                        cardNuxState3.currentTextureState$delegate.setValue(currentTextureState != null ? new CardTextureState(currentTextureState.engine, 2046) : null);
                        revolvingInteractiveCardsKt$rotateCards$12.L$0 = cardNuxState3;
                        revolvingInteractiveCardsKt$rotateCards$12.L$1 = list2;
                        revolvingInteractiveCardsKt$rotateCards$12.L$2 = activityManager2;
                        revolvingInteractiveCardsKt$rotateCards$12.L$3 = cardRegistry2;
                        revolvingInteractiveCardsKt$rotateCards$12.label = 3;
                    }
                    cardNuxState2 = cardNuxState3;
                    revolvingInteractiveCardsKt$rotateCards$12.L$0 = cardNuxState2;
                    revolvingInteractiveCardsKt$rotateCards$12.L$1 = list2;
                    revolvingInteractiveCardsKt$rotateCards$12.L$2 = activityManager2;
                    revolvingInteractiveCardsKt$rotateCards$12.L$3 = cardRegistry2;
                    revolvingInteractiveCardsKt$rotateCards$12.label = 1;
                    if (JobKt.delay(1700L, revolvingInteractiveCardsKt$rotateCards$12) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                cardRegistry3 = revolvingInteractiveCardsKt$rotateCards$1.L$3;
                activityManager3 = revolvingInteractiveCardsKt$rotateCards$1.L$2;
                list3 = revolvingInteractiveCardsKt$rotateCards$1.L$1;
                cardNuxState3 = revolvingInteractiveCardsKt$rotateCards$1.L$0;
                SafeTrace.throwOnFailure(obj);
                revolvingInteractiveCardsKt$rotateCards$1.L$0 = cardNuxState3;
                revolvingInteractiveCardsKt$rotateCards$1.L$1 = list3;
                revolvingInteractiveCardsKt$rotateCards$1.L$2 = activityManager3;
                revolvingInteractiveCardsKt$rotateCards$1.L$3 = cardRegistry3;
                revolvingInteractiveCardsKt$rotateCards$1.label = 2;
                obj = JobKt.coroutineScope(new RealSheetState$peek$3.AnonymousClass2(i3, continuation, 10), revolvingInteractiveCardsKt$rotateCards$1);
            }
        }
        revolvingInteractiveCardsKt$rotateCards$1 = new RevolvingInteractiveCardsKt$rotateCards$1(continuationImpl);
        Object obj2 = revolvingInteractiveCardsKt$rotateCards$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = revolvingInteractiveCardsKt$rotateCards$1.label;
        Continuation continuation2 = null;
        int i32 = 2;
        if (i != 0) {
        }
    }

    public static final CardModelView.ViewModel toCardViewModelInternal(CardSchemeViewModel.Module.HeroCardDetails heroCardDetails) {
        heroCardDetails.getClass();
        CardTheme cardTheme = heroCardDetails.cardTheme;
        String str = cardTheme.ink_color;
        Timber.Forest forest = Timber.Forest;
        Integer safeParseColor = StringsKt.safeParseColor(str, new ScannerView.AnonymousClass3(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 17));
        safeParseColor.getClass();
        int intValue = safeParseColor.intValue();
        CardTheme.Identifier identifier = cardTheme.id;
        Integer safeParseColor2 = StringsKt.safeParseColor(cardTheme.card_color, new ScannerView.AnonymousClass3(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 14));
        safeParseColor2.getClass();
        int intValue2 = safeParseColor2.intValue();
        Integer safeParseColor3 = StringsKt.safeParseColor(cardTheme.card_info_text_color, null);
        int intValue3 = safeParseColor3 != null ? safeParseColor3.intValue() : intValue;
        Integer safeParseColor4 = StringsKt.safeParseColor(cardTheme.mag_stripe_color, new ScannerView.AnonymousClass3(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 15));
        int intValue4 = safeParseColor4 != null ? safeParseColor4.intValue() : -12303292;
        Integer safeParseColor5 = StringsKt.safeParseColor(cardTheme.mag_stripe_back_color, new ScannerView.AnonymousClass3(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 16));
        return new CardModelView.ViewModel(intValue2, intValue, intValue3, identifier, cardTheme.background_image, cardTheme.font, null, cardTheme.card_customization_margin, heroCardDetails.cashtag, intValue4, safeParseColor5 != null ? safeParseColor5.intValue() : CardModelView.DEFAULT_MAG_BACK_COLOR, heroCardDetails.name, CollectionsKt.joinToString$default(StringsKt___StringsKt.chunked(4, heroCardDetails.pan), " ", null, null, 0, null, null, 62), heroCardDetails.cvv, heroCardDetails.exp, null, null, false, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 2013757408, 2047);
    }
}
