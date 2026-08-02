package com.squareup.cash.wallet.views;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.internal.fetcher.FsCachingFetcher$fetch$2;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletAnalyticsEventsSpec;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardTextureState;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewModel;
import com.squareup.cash.card.onboarding.PaymentDeviceItemViewModel;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryState;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.cdf.stock.EquityType;
import com.squareup.cash.cdf.stock.StockViewViewStockDetails;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.views.AnimationsKt;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.db.Investment_holding;
import com.squareup.cash.investing.presenters.stockdetails.Buttons;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter;
import com.squareup.cash.investing.presenters.stockdetails.Loaded;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.recurring.db.Recurring_preference;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.LockAnimationColorTreatment;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.compose.MotionKt;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okhttp3.MultipartBody;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public abstract class Hero3DCardViewKt {
    public static final Quat BACKWARD_RESTING;
    public static final Quat CARD_HOME_BACKWARD_RESTING;
    public static final Quat CARD_HOME_FORWARD_RESTING;
    public static final Quat EXPIRED_RESTING;
    public static final Quat FORWARD_RESTING;
    public static final float[] X_AXIS;
    public static final float[] Y_AXIS;
    public static final float[] Z_AXIS;

    static {
        float[] fArr = {1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        X_AXIS = fArr;
        Y_AXIS = new float[]{RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE};
        float[] fArr2 = {RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f};
        Z_AXIS = fArr2;
        Quat quat = new Quat((float) Math.toRadians(-90.0d), fArr);
        FORWARD_RESTING = quat;
        BACKWARD_RESTING = new Quat((float) Math.toRadians(180.0d), fArr2).times(quat);
        EXPIRED_RESTING = new Quat((float) Math.toRadians(60.0d), fArr).times(quat);
        Quat quat2 = new Quat(new float[]{(float) Math.toRadians(-84.0d), (float) Math.toRadians(-8.0d), (float) Math.toRadians(18.0d)});
        CARD_HOME_FORWARD_RESTING = quat2;
        CARD_HOME_BACKWARD_RESTING = new Quat((float) Math.toRadians(180.0d), fArr2).times(quat2);
        new CardTheme("_pink123", "#ffffffff", "#FFF50086", "#ff000000", CardTheme.Identifier.PINK_ID, CardTheme.Gradient.DIAGONAL_DARK, null, "#ff333333", "#ffd2d2d2", null, null, null, null, 16749342);
    }

    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v42 */
    public static final void InteractiveCard(final Modifier modifier, final InteractiveCardState interactiveCardState, final CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, final Function1 function1, final Function0 function0, final Function0 function02, final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer;
        CardModelView.ViewModel cardViewModel;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        CardRegistry.SharedCardTransitionState sharedCardTransitionState;
        MutableState mutableState4;
        MutableState mutableState5;
        int i3;
        CardWobbleState cardWobbleState;
        MutableState mutableState6;
        MutableState mutableState7;
        int i4;
        MutableState mutableState8;
        Quat quat;
        Quat quat2;
        MutableState mutableState9;
        MutableState mutableState10;
        Continuation continuation;
        MutableState mutableState11;
        MutableState mutableState12;
        MutableState mutableState13;
        Continuation continuation2;
        long j;
        Object obj;
        Continuation continuation3;
        Unit unit;
        Object obj2;
        MutableState mutableState14;
        Object obj3;
        Object obj4;
        Animatable animatable;
        int i5;
        MutableState mutableState15;
        Object obj5;
        MutableState mutableState16;
        MutableState mutableState17;
        MutableState mutableState18;
        Animatable animatable2;
        MutableState mutableState19;
        MutableState mutableState20;
        final MutableState mutableState21;
        MutableState mutableState22;
        Object obj6;
        ?? r8;
        Modifier wrapContentHeight;
        MutableState mutableState23;
        BiasAlignment biasAlignment;
        Continuation continuation4;
        MutableState mutableState24;
        boolean z3;
        CardTheme cardTheme;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1951255982);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(interactiveCardState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(heroCardDetails) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function12 = function1;
            i2 |= gapComposer2.changedInstance(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changed(z2) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(interactiveCardState, gapComposer2);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj7 = Composer.Companion.Empty;
            Continuation continuation5 = null;
            if (rememberedValue == obj7) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState25 = (MutableState) rememberedValue;
            if (heroCardDetails == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i6 = 1;
                    final Function1 function13 = function12;
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.wallet.views.Hero3DCardViewKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            switch (i6) {
                                case 0:
                                    ((Integer) obj9).getClass();
                                    Hero3DCardViewKt.InteractiveCard(modifier, interactiveCardState, heroCardDetails, function13, function0, function02, z, z2, (Composer) obj8, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj9).getClass();
                                    Hero3DCardViewKt.InteractiveCard(modifier, interactiveCardState, heroCardDetails, function13, function0, function02, z, z2, (Composer) obj8, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(heroCardDetails, gapComposer2);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj7) {
                rememberedValue2 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState26 = (MutableState) rememberedValue2;
            CardSchemeViewModel.Module.HeroCardDetails heroCardDetails2 = (CardSchemeViewModel.Module.HeroCardDetails) mutableState26.getValue();
            Object rememberUpdatedState3 = Updater.rememberUpdatedState(Boolean.valueOf(heroCardDetails2 != null && heroCardDetails2.isLocked), gapComposer2);
            CardSchemeViewModel.Module.HeroCardDetails heroCardDetails3 = (CardSchemeViewModel.Module.HeroCardDetails) mutableState26.getValue();
            MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(Boolean.valueOf(heroCardDetails3 != null && heroCardDetails3.isEnabled), gapComposer2);
            MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(Boolean.valueOf(((CardSchemeViewModel.Module.HeroCardDetails) rememberUpdatedState2.getValue()).showPrepurchaseContourText), gapComposer2);
            CardSchemeViewModel.Module.HeroCardDetails heroCardDetails4 = (CardSchemeViewModel.Module.HeroCardDetails) mutableState26.getValue();
            if (heroCardDetails4 == null) {
                gapComposer2.startReplaceGroup(1780502537);
                gapComposer2.end(false);
                cardViewModel = null;
            } else {
                gapComposer2.startReplaceGroup(1780502538);
                cardViewModel = ((InteractiveCardState) rememberUpdatedState.getValue()).toCardViewModel(heroCardDetails4, gapComposer2);
                gapComposer2.end(false);
            }
            Object rememberUpdatedState6 = Updater.rememberUpdatedState(cardViewModel, gapComposer2);
            MutableState produceAnimationsEnabled = MotionKt.produceAnimationsEnabled(gapComposer2);
            int i7 = i2 & 29360128;
            boolean changed = (i7 == 8388608) | gapComposer2.changed(((CardSchemeViewModel.Module.HeroCardDetails) rememberUpdatedState2.getValue()).isEnabled) | gapComposer2.changed(((Boolean) produceAnimationsEnabled.getValue()).booleanValue());
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == obj7) {
                rememberedValue3 = (z2 && ((CardSchemeViewModel.Module.HeroCardDetails) rememberUpdatedState2.getValue()).isEnabled && ((Boolean) produceAnimationsEnabled.getValue()).booleanValue()) ? CARD_HOME_BACKWARD_RESTING : BACKWARD_RESTING;
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Quat quat3 = (Quat) rememberedValue3;
            int i8 = i2;
            boolean changed2 = gapComposer2.changed(((CardSchemeViewModel.Module.HeroCardDetails) rememberUpdatedState2.getValue()).isEnabled) | (i7 == 8388608) | gapComposer2.changed(((Boolean) produceAnimationsEnabled.getValue()).booleanValue());
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue4 == obj7) {
                rememberedValue4 = (z2 && ((CardSchemeViewModel.Module.HeroCardDetails) rememberUpdatedState2.getValue()).isEnabled && ((Boolean) produceAnimationsEnabled.getValue()).booleanValue()) ? CARD_HOME_FORWARD_RESTING : FORWARD_RESTING;
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Quat quat4 = (Quat) rememberedValue4;
            MutableState rememberUpdatedState7 = Updater.rememberUpdatedState(function0, gapComposer2);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == obj7) {
                rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState27 = (MutableState) rememberedValue5;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == obj7) {
                rememberedValue6 = new CardWobbleState();
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            CardWobbleState cardWobbleState2 = (CardWobbleState) rememberedValue6;
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (rememberedValue7 == obj7) {
                rememberedValue7 = Updater.mutableStateOf$default(quat4);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            MutableState mutableState28 = (MutableState) rememberedValue7;
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (rememberedValue8 == obj7) {
                rememberedValue8 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue8);
            }
            MutableState mutableState29 = (MutableState) rememberedValue8;
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (rememberedValue9 == obj7) {
                mutableState3 = mutableState27;
                mutableState2 = rememberUpdatedState5;
                mutableState = mutableState28;
                rememberedValue9 = new CardRegistry.SharedCardTransitionState(Updater.derivedStateOf(new Hero3DCardViewKt$$ExternalSyntheticLambda6(cardWobbleState2, mutableState28, 0)), Updater.derivedStateOf(new Hero3DCardViewKt$$ExternalSyntheticLambda6(cardWobbleState2, rememberUpdatedState, 3)));
                gapComposer2.updateRememberedValue(rememberedValue9);
            } else {
                mutableState = mutableState28;
                mutableState2 = rememberUpdatedState5;
                mutableState3 = mutableState27;
            }
            CardRegistry.SharedCardTransitionState sharedCardTransitionState2 = (CardRegistry.SharedCardTransitionState) rememberedValue9;
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (rememberedValue10 == obj7) {
                rememberedValue10 = new CoreInteractiveCardKt$$ExternalSyntheticLambda4(sharedCardTransitionState2, 0);
                gapComposer2.updateRememberedValue(rememberedValue10);
            }
            MutableState rememberUpdatedState8 = Updater.rememberUpdatedState(CardTransitionKt.syncCardTransition((Function0) rememberedValue10, gapComposer2), gapComposer2);
            Object rememberedValue11 = gapComposer2.rememberedValue();
            if (rememberedValue11 == obj7) {
                rememberedValue11 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue11);
            }
            MutableState mutableState30 = (MutableState) rememberedValue11;
            Unit unit2 = Unit.INSTANCE;
            Object rememberedValue12 = gapComposer2.rememberedValue();
            if (rememberedValue12 == obj7) {
                Object hero3DCardViewKt$InteractiveCard$5$1 = new Hero3DCardViewKt$InteractiveCard$5$1(mutableState29, mutableState30, mutableState25, continuation5, 0);
                sharedCardTransitionState = sharedCardTransitionState2;
                mutableState4 = mutableState30;
                rememberedValue12 = hero3DCardViewKt$InteractiveCard$5$1;
                mutableState5 = mutableState29;
                i3 = 2;
                gapComposer2.updateRememberedValue(rememberedValue12);
            } else {
                sharedCardTransitionState = sharedCardTransitionState2;
                mutableState4 = mutableState30;
                mutableState5 = mutableState29;
                i3 = 2;
            }
            Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue12);
            if (z2) {
                cardWobbleState = cardWobbleState2;
                ((InteractiveCardState) rememberUpdatedState.getValue()).isCardHome$delegate.setValue(Boolean.TRUE);
            } else {
                cardWobbleState = cardWobbleState2;
            }
            boolean changed3 = gapComposer2.changed(rememberUpdatedState8);
            Object rememberedValue13 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue13 == obj7) {
                rememberedValue13 = new CardAppletWorker$setup$1$2$1(mutableState25, sharedCardTransitionState, rememberUpdatedState8, continuation5, 17);
                gapComposer2.updateRememberedValue(rememberedValue13);
            }
            Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue13);
            Object rememberedValue14 = gapComposer2.rememberedValue();
            if (rememberedValue14 == obj7) {
                rememberedValue14 = Updater.derivedStateOf(new ScoreSummaryKt$$ExternalSyntheticLambda1(mutableState26, rememberUpdatedState2, 13));
                gapComposer2.updateRememberedValue(rememberedValue14);
            }
            String str = ((CardTheme) ((State) rememberedValue14).getValue()).token;
            if (str == null) {
                gapComposer2.startReplaceGroup(1783030990);
                i4 = 0;
                gapComposer2.end(false);
                mutableState7 = rememberUpdatedState4;
                mutableState6 = produceAnimationsEnabled;
            } else {
                gapComposer2.startReplaceGroup(1783030991);
                CardModelView cardModelView = (CardModelView) mutableState25.getValue();
                mutableState6 = produceAnimationsEnabled;
                Object rememberedValue15 = gapComposer2.rememberedValue();
                if (rememberedValue15 == obj7) {
                    mutableState7 = rememberUpdatedState4;
                    rememberedValue15 = new TabToolbarsKt$$ExternalSyntheticLambda10(29, mutableState4);
                    gapComposer2.updateRememberedValue(rememberedValue15);
                } else {
                    mutableState7 = rememberUpdatedState4;
                }
                Paint paint = CardModelView.REMOVE_PAINT;
                CardTransitionKt.RegisterCardModelView(str, cardModelView, (Function1) rememberedValue15, gapComposer2, 448);
                i4 = 0;
                gapComposer2.end(false);
            }
            Object rememberedValue16 = gapComposer2.rememberedValue();
            if (rememberedValue16 == obj7) {
                rememberedValue16 = FlowKt.MutableSharedFlow$default(i4, i4, null, 7);
                gapComposer2.updateRememberedValue(rememberedValue16);
            }
            MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue16;
            long refreshRate = 1000 / ((long) ((View) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalView)).getDisplay().getRefreshRate());
            Object rememberedValue17 = gapComposer2.rememberedValue();
            if (rememberedValue17 == obj7) {
                rememberedValue17 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue17);
            }
            MutableState mutableState31 = (MutableState) rememberedValue17;
            Object rememberedValue18 = gapComposer2.rememberedValue();
            if (rememberedValue18 == obj7) {
                mutableState8 = mutableState4;
                rememberedValue18 = new TabToolbarsKt$$ExternalSyntheticLambda10(27, mutableState31);
                gapComposer2.updateRememberedValue(rememberedValue18);
            } else {
                mutableState8 = mutableState4;
            }
            DimensionKt.LifecycleResumeEffect(unit2, null, (Function1) rememberedValue18, gapComposer2, 390);
            Object rememberedValue19 = gapComposer2.rememberedValue();
            if (rememberedValue19 == obj7) {
                rememberedValue19 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue19);
            }
            MutableState mutableState32 = (MutableState) rememberedValue19;
            boolean changed4 = gapComposer2.changed(rememberUpdatedState) | gapComposer2.changedInstance(quat3) | gapComposer2.changedInstance(quat4) | gapComposer2.changed(refreshRate) | gapComposer2.changed(rememberUpdatedState2);
            Object rememberedValue20 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue20 == obj7) {
                MutableState mutableState33 = mutableState;
                rememberedValue20 = new FsCachingFetcher$fetch$2(mutableState32, mutableState25, rememberUpdatedState, quat3, mutableState33, quat4, mutableState31, refreshRate, rememberUpdatedState2, null);
                quat = quat3;
                quat2 = quat4;
                mutableState9 = mutableState31;
                mutableState10 = rememberUpdatedState2;
                continuation = null;
                mutableState25 = mutableState25;
                mutableState11 = rememberUpdatedState;
                mutableState = mutableState33;
                gapComposer2.updateRememberedValue(rememberedValue20);
            } else {
                mutableState10 = rememberUpdatedState2;
                quat2 = quat4;
                quat = quat3;
                continuation = null;
                mutableState9 = mutableState31;
                mutableState11 = rememberUpdatedState;
            }
            Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue20);
            boolean changed5 = gapComposer2.changed(mutableState10);
            Object rememberedValue21 = gapComposer2.rememberedValue();
            if (changed5 || rememberedValue21 == obj7) {
                MutableState mutableState34 = mutableState10;
                MutableState mutableState35 = mutableState25;
                rememberedValue21 = new Hero3DCardViewKt$InteractiveCard$5$1(mutableState32, mutableState35, mutableState34, continuation, 3);
                mutableState12 = mutableState35;
                mutableState13 = mutableState34;
                continuation2 = continuation;
                gapComposer2.updateRememberedValue(rememberedValue21);
            } else {
                mutableState13 = mutableState10;
                continuation2 = continuation;
                mutableState12 = mutableState25;
            }
            Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue21);
            Object rememberedValue22 = gapComposer2.rememberedValue();
            if (rememberedValue22 == obj7) {
                j = refreshRate;
                rememberedValue22 = new CardTransitionKt$cardBottomNavFadeInOut$1$1(mutableState26, continuation2, i3);
                gapComposer2.updateRememberedValue(rememberedValue22);
            } else {
                j = refreshRate;
            }
            Object produceState = Updater.produceState(gapComposer2, continuation2, (Function2) rememberedValue22);
            Object obj8 = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            boolean changed6 = gapComposer2.changed(rememberUpdatedState3) | gapComposer2.changedInstance(obj8);
            Object rememberedValue23 = gapComposer2.rememberedValue();
            if (changed6 || rememberedValue23 == obj7) {
                obj = produceState;
                continuation3 = null;
                rememberedValue23 = new CardAppletWorker$setup$1$2$1(rememberUpdatedState3, obj8, continuation3, 18);
                gapComposer2.updateRememberedValue(rememberedValue23);
            } else {
                obj = produceState;
                continuation3 = null;
            }
            Object produceState2 = Updater.produceState(gapComposer2, continuation3, (Function2) rememberedValue23);
            Object rememberedValue24 = gapComposer2.rememberedValue();
            if (rememberedValue24 == obj7) {
                rememberedValue24 = AnimatableKt.Animatable(0.4f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue24);
            }
            Animatable animatable3 = (Animatable) rememberedValue24;
            boolean changedInstance = gapComposer2.changedInstance(animatable3);
            Object rememberedValue25 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue25 == obj7) {
                rememberedValue25 = new Hero3DCardViewKt$InteractiveCard$11$1(mutableState12, animatable3, null);
                gapComposer2.updateRememberedValue(rememberedValue25);
            }
            Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue25);
            boolean changed7 = gapComposer2.changed(rememberUpdatedState8) | gapComposer2.changed(mutableState13) | gapComposer2.changedInstance(quat2) | gapComposer2.changedInstance(quat);
            boolean z4 = i7 == 8388608;
            MutableState mutableState36 = mutableState7;
            MutableState mutableState37 = mutableState6;
            long j2 = j;
            boolean changed8 = changed7 | z4 | gapComposer2.changed(mutableState36) | gapComposer2.changed(mutableState37) | gapComposer2.changedInstance(mutableSharedFlow) | gapComposer2.changedInstance(cardWobbleState) | gapComposer2.changed(mutableState11) | gapComposer2.changed(mutableState2) | gapComposer2.changed(j2);
            Object rememberedValue26 = gapComposer2.rememberedValue();
            if (changed8 || rememberedValue26 == obj7) {
                unit = unit2;
                obj2 = obj7;
                mutableState14 = mutableState36;
                obj3 = produceState2;
                obj4 = obj;
                animatable = animatable3;
                i5 = i8;
                mutableState15 = rememberUpdatedState7;
                obj5 = rememberUpdatedState6;
                mutableState16 = mutableState3;
                MutableState mutableState38 = mutableState8;
                MutableState mutableState39 = mutableState12;
                rememberedValue26 = new Hero3DCardViewKt$InteractiveCard$12$1(mutableState39, rememberUpdatedState8, quat2, quat, z2, mutableState13, mutableState, mutableState16, mutableState26, mutableState14, mutableState37, mutableSharedFlow, cardWobbleState, mutableState38, mutableState11, mutableState2, mutableState5, mutableState9, j2, mutableState32, null);
                mutableSharedFlow = mutableSharedFlow;
                mutableState17 = mutableState38;
                mutableState18 = mutableState32;
                gapComposer = gapComposer2;
                mutableState12 = mutableState39;
                gapComposer.updateRememberedValue(rememberedValue26);
            } else {
                unit = unit2;
                obj2 = obj7;
                mutableState14 = mutableState36;
                obj3 = produceState2;
                mutableState18 = mutableState32;
                obj4 = obj;
                gapComposer = gapComposer2;
                animatable = animatable3;
                i5 = i8;
                mutableState15 = rememberUpdatedState7;
                obj5 = rememberUpdatedState6;
                mutableState16 = mutableState3;
                mutableState17 = mutableState8;
            }
            Unit unit3 = unit;
            Updater.LaunchedEffect(gapComposer, unit3, (Function2) rememberedValue26);
            Object rememberedValue27 = gapComposer.rememberedValue();
            Object obj9 = obj2;
            if (rememberedValue27 == obj9) {
                rememberedValue27 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue27);
            }
            Animatable animatable4 = (Animatable) rememberedValue27;
            Modifier focusable = CanvasKt.focusable(SizeKt.fillMaxWidth(modifier, 1.0f), true, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, focusable);
            ComposeUiNode.Companion.getClass();
            Function0 function03 = ComposeUiNode.Companion.Constructor;
            MutableState mutableState40 = mutableState16;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function03);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Object obj10 = (PlatformHapticFeedback) gapComposer.consume(CompositionLocalsKt.LocalHapticFeedback);
            Object rememberedValue28 = gapComposer.rememberedValue();
            if (rememberedValue28 == obj9) {
                rememberedValue28 = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
                gapComposer.updateRememberedValue(rememberedValue28);
            }
            final MutableSharedFlow mutableSharedFlow2 = (MutableSharedFlow) rememberedValue28;
            boolean changed9 = gapComposer.changed(mutableState14) | gapComposer.changedInstance(mutableSharedFlow2) | gapComposer.changedInstance(obj10) | gapComposer.changedInstance(animatable4) | gapComposer.changed(mutableState11);
            Object rememberedValue29 = gapComposer.rememberedValue();
            if (changed9 || rememberedValue29 == obj9) {
                animatable2 = animatable4;
                MutableState mutableState41 = mutableState14;
                MutableState mutableState42 = mutableState11;
                rememberedValue29 = new NotificationActionService$onHandleIntent$1(mutableState41, mutableSharedFlow2, obj10, animatable2, mutableState42, (Continuation) null, 22);
                mutableState19 = mutableState41;
                mutableState20 = mutableState42;
                gapComposer.updateRememberedValue(rememberedValue29);
            } else {
                animatable2 = animatable4;
                mutableState19 = mutableState14;
                mutableState20 = mutableState11;
            }
            Updater.LaunchedEffect(gapComposer, unit3, (Function2) rememberedValue29);
            final MutableState mutableState43 = mutableState15;
            final Animatable animatable5 = animatable;
            boolean changed10 = gapComposer.changed(mutableState19) | gapComposer.changedInstance(mutableSharedFlow) | gapComposer.changedInstance(mutableSharedFlow2) | gapComposer.changed(mutableState43) | gapComposer.changedInstance(animatable5);
            Object rememberedValue30 = gapComposer.rememberedValue();
            if (changed10 || rememberedValue30 == obj9) {
                final MutableSharedFlow mutableSharedFlow3 = mutableSharedFlow;
                mutableState21 = mutableState12;
                final MutableState mutableState44 = mutableState19;
                rememberedValue30 = new PointerInputEventHandler() { // from class: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$13$touchInput$1$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation6) {
                        Object coroutineScope = JobKt.coroutineScope(new AnonymousClass1(pointerInputScope, MutableState.this, mutableSharedFlow3, mutableSharedFlow2, mutableState44, mutableState43, animatable5, (Continuation) null), continuation6);
                        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
                    }

                    /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$13$touchInput$1$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
                        public final /* synthetic */ Object $cardEnabled$delegate;
                        public final /* synthetic */ Object $dragOffsets;
                        public final /* synthetic */ Object $indicatorBounce;
                        public final /* synthetic */ Object $lockedDragInterrupt;
                        public final /* synthetic */ Object $onIconTap$delegate;
                        public final /* synthetic */ int $r8$classId = 0;
                        public final /* synthetic */ Object $this_pointerInput;
                        public final /* synthetic */ MutableState $view$delegate;
                        public /* synthetic */ Object L$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate, AnimatedAmountTextView.Amount amount, Function1 function1, Function1 function12, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar paymentCalendar, String str, MutableState mutableState, Function1 function13, Continuation continuation) {
                            super(2, continuation);
                            this.L$0 = calendarDate;
                            this.$this_pointerInput = amount;
                            this.$cardEnabled$delegate = function1;
                            this.$onIconTap$delegate = function12;
                            this.$dragOffsets = paymentCalendar;
                            this.$lockedDragInterrupt = str;
                            this.$view$delegate = mutableState;
                            this.$indicatorBounce = function13;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            int i = this.$r8$classId;
                            Object obj2 = this.$this_pointerInput;
                            Object obj3 = this.$indicatorBounce;
                            Object obj4 = this.$lockedDragInterrupt;
                            Object obj5 = this.$dragOffsets;
                            Object obj6 = this.$onIconTap$delegate;
                            Object obj7 = this.$cardEnabled$delegate;
                            switch (i) {
                                case 0:
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) obj2, this.$view$delegate, (MutableSharedFlow) obj5, (MutableSharedFlow) obj4, (MutableState) obj7, (MutableState) obj6, (Animatable) obj3, continuation);
                                    anonymousClass1.L$0 = obj;
                                    return anonymousClass1;
                                case 1:
                                    return new AnonymousClass1((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) this.L$0, (AnimatedAmountTextView.Amount) obj2, (Function1) obj7, (Function1) obj6, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar) obj5, (String) obj4, this.$view$delegate, (Function1) obj3, continuation);
                                case 2:
                                    return new AnonymousClass1((List) this.L$0, (PaymentDeviceCustomizationViewModel) obj2, (CardDesignLibraryState) obj5, this.$view$delegate, (MutableState) obj7, (MutableState) obj6, (MutableState) obj4, (MutableState) obj3, continuation);
                                default:
                                    MutableState mutableState = this.$view$delegate;
                                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$this_pointerInput, (Loaded) obj7, (CurrentPrice) obj6, (Loaded) obj5, (StockDetails) obj4, continuation, (InvestingStockDetailsPresenter) obj3, mutableState);
                                    anonymousClass12.L$0 = obj;
                                    return anonymousClass12;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            CoroutineScope coroutineScope = (CoroutineScope) obj;
                            Continuation continuation = (Continuation) obj2;
                            switch (this.$r8$classId) {
                            }
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            List<AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment> list;
                            AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec;
                            Long l;
                            String str;
                            int i = this.$r8$classId;
                            int i2 = 0;
                            r4 = false;
                            boolean z = false;
                            MutableState mutableState = this.$view$delegate;
                            Integer num = null;
                            Object obj2 = this.$lockedDragInterrupt;
                            Object obj3 = this.$dragOffsets;
                            Object obj4 = this.$onIconTap$delegate;
                            Object obj5 = this.$cardEnabled$delegate;
                            Object obj6 = this.$indicatorBounce;
                            Object obj7 = this.$this_pointerInput;
                            switch (i) {
                                case 0:
                                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    SafeTrace.throwOnFailure(obj);
                                    CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                                    Continuation continuation = null;
                                    JobKt.launch$default(coroutineScope, null, coroutineStart, new NotificationActionService$onHandleIntent$1((PointerInputScope) obj7, this.$view$delegate, (MutableSharedFlow) obj3, (MutableSharedFlow) obj2, (MutableState) obj5, continuation, 23), 1);
                                    JobKt.launch$default(coroutineScope, null, coroutineStart, new WorkflowLayout$start$1((PointerInputScope) obj7, this.$view$delegate, (MutableState) obj4, (Animatable) obj6, continuation, 14), 1);
                                    break;
                                case 1:
                                    Function1 function1 = (Function1) obj5;
                                    AnimatedAmountTextView.Amount amount = (AnimatedAmountTextView.Amount) obj7;
                                    Function1 function12 = (Function1) obj4;
                                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    SafeTrace.throwOnFailure(obj);
                                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) this.L$0;
                                    Money money = calendarDate != null ? calendarDate.amountDue : null;
                                    String str2 = calendarDate != null ? calendarDate.amountDueFormatted : null;
                                    if (money != null && str2 != null) {
                                        money.amount.getClass();
                                        AnimatedAmountTextView.Amount amount2 = new AnimatedAmountTextView.Amount(str2, r1.longValue(), calendarDate != null ? calendarDate.dateMs : 0L);
                                        if (Intrinsics.areEqual(amount, amount2)) {
                                            function12.invoke(Boolean.FALSE);
                                        } else {
                                            function1.invoke(amount2);
                                            function12.invoke(Boolean.TRUE);
                                        }
                                    } else if (!((Boolean) mutableState.getValue()).booleanValue()) {
                                        String str3 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar) obj3).formattedZeroBalance;
                                        if (str3 == null) {
                                            str3 = (String) obj2;
                                        }
                                        AnimatedAmountTextView.Amount amount3 = new AnimatedAmountTextView.Amount(0L, System.currentTimeMillis(), str3);
                                        if (!Intrinsics.areEqual(amount, amount3)) {
                                            function1.invoke(amount3);
                                            function12.invoke(Boolean.TRUE);
                                        }
                                    }
                                    if (calendarDate != null && (list = calendarDate.treatments) != null) {
                                        Function1 function13 = (Function1) obj6;
                                        for (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment dateTreatment : list) {
                                            if (dateTreatment instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.PaymentDue) {
                                                AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.PaymentDue) dateTreatment).analyticViewEvent;
                                                if (afterpayAppletAnalyticsEventsSpec2 != null) {
                                                    function13.invoke(new ItemViewed(CollectionsKt__CollectionsJVMKt.listOf(afterpayAppletAnalyticsEventsSpec2), null));
                                                }
                                            } else if ((dateTreatment instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Overdue) && (afterpayAppletAnalyticsEventsSpec = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Overdue) dateTreatment).analyticViewEvent) != null) {
                                                function13.invoke(new ItemViewed(CollectionsKt__CollectionsJVMKt.listOf(afterpayAppletAnalyticsEventsSpec), null));
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    CardDesignLibraryState cardDesignLibraryState = (CardDesignLibraryState) obj3;
                                    MutableState mutableState2 = (MutableState) obj2;
                                    MutableState mutableState3 = (MutableState) obj5;
                                    PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel = (PaymentDeviceCustomizationViewModel) obj7;
                                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    SafeTrace.throwOnFailure(obj);
                                    if (((List) this.L$0).isEmpty()) {
                                        break;
                                    } else {
                                        int i3 = PaymentDeviceCustomizationViewKt.$r8$clinit;
                                        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                                        String str4 = (String) mutableState3.getValue();
                                        String str5 = paymentDeviceCustomizationViewModel.focusedDeviceId;
                                        String str6 = paymentDeviceCustomizationViewModel.focusedDeviceId;
                                        boolean areEqual = Intrinsics.areEqual(str4, str5);
                                        if (!booleanValue || !areEqual) {
                                            if (str6 != null) {
                                                Iterator it = ((List) ((MutableState) obj4).getValue()).iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        i2 = -1;
                                                    } else if (!Intrinsics.areEqual(((PaymentDeviceItemViewModel) it.next()).id, str6)) {
                                                        i2++;
                                                    }
                                                }
                                                Integer num2 = new Integer(i2);
                                                if (num2.intValue() >= 0) {
                                                    num = num2;
                                                }
                                            }
                                            if (!booleanValue && str6 != null && num == null) {
                                                break;
                                            } else {
                                                ZoomLevel zoomLevel = (booleanValue || ((Boolean) mutableState2.getValue()).booleanValue()) ? ZoomLevel.NEAR : paymentDeviceCustomizationViewModel.initialZoomLevel;
                                                if (!booleanValue && zoomLevel == ZoomLevel.NEAR && num != null) {
                                                    ((MutableState) obj6).setValue(Boolean.TRUE);
                                                }
                                                Boolean bool = Boolean.TRUE;
                                                mutableState.setValue(bool);
                                                mutableState2.setValue(bool);
                                                mutableState3.setValue(str6);
                                                if (num != null && zoomLevel != ZoomLevel.FAR) {
                                                    cardDesignLibraryState.pendingFocusIndex$delegate.setValue(num);
                                                    zoomLevel.getClass();
                                                    cardDesignLibraryState.pendingFocusZoom$delegate.setValue(zoomLevel);
                                                }
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    InvestingStockDetailsPresenter investingStockDetailsPresenter = (InvestingStockDetailsPresenter) obj6;
                                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    SafeTrace.throwOnFailure(obj);
                                    CurrentPrice currentPrice = (CurrentPrice) obj4;
                                    StockDetails stockDetails = (StockDetails) obj2;
                                    StockViewViewStockDetails.InvestingScreenOrigin investingScreenOrigin = (StockViewViewStockDetails.InvestingScreenOrigin) obj7;
                                    Investment_holding investment_holding = (Investment_holding) ((Loaded) obj5).value;
                                    Recurring_preference recurring_preference = (Recurring_preference) ((Loaded) obj3).value;
                                    if (!((Boolean) mutableState.getValue()).booleanValue()) {
                                        Buttons access$getButtons = InvestingStockDetailsPresenter.access$getButtons(investingStockDetailsPresenter, stockDetails, investment_holding);
                                        RealInvestingAnalytics realInvestingAnalytics = investingStockDetailsPresenter.investingAnalytics;
                                        InvestmentEntityToken investmentEntityToken = investingStockDetailsPresenter.args.investmentEntityToken;
                                        String str7 = stockDetails.symbol;
                                        double parseDouble = (investment_holding == null || (str = investment_holding.units) == null) ? 0.0d : Double.parseDouble(str);
                                        if (investment_holding != null && (l = InvestingStockDetailsPresenter.access$currentValue(investingStockDetailsPresenter, currentPrice, investment_holding).amount) != null) {
                                            r2 = l.longValue();
                                        }
                                        if (recurring_preference != null && recurring_preference.enabled) {
                                            z = true;
                                        }
                                        String str8 = access$getButtons.firstButtonLabel;
                                        String str9 = access$getButtons.secondButtonLabel;
                                        EquityType equityType = MultipartBody.Part.Companion.toEquityType(stockDetails.f1150type);
                                        investmentEntityToken.getClass();
                                        investingScreenOrigin.getClass();
                                        str7.getClass();
                                        realInvestingAnalytics.analytics.track(new StockViewViewStockDetails(str7, investingScreenOrigin, Double.valueOf(parseDouble), Long.valueOf(r2), Boolean.valueOf(z), str8, str9, equityType), null);
                                        mutableState.setValue(Boolean.TRUE);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(PointerInputScope pointerInputScope, MutableState mutableState, MutableSharedFlow mutableSharedFlow, MutableSharedFlow mutableSharedFlow2, MutableState mutableState2, MutableState mutableState3, Animatable animatable, Continuation continuation) {
                            super(2, continuation);
                            this.$this_pointerInput = pointerInputScope;
                            this.$view$delegate = mutableState;
                            this.$dragOffsets = mutableSharedFlow;
                            this.$lockedDragInterrupt = mutableSharedFlow2;
                            this.$cardEnabled$delegate = mutableState2;
                            this.$onIconTap$delegate = mutableState3;
                            this.$indicatorBounce = animatable;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(Object obj, Loaded loaded, CurrentPrice currentPrice, Loaded loaded2, StockDetails stockDetails, Continuation continuation, InvestingStockDetailsPresenter investingStockDetailsPresenter, MutableState mutableState) {
                            super(2, continuation);
                            this.$this_pointerInput = obj;
                            this.$cardEnabled$delegate = loaded;
                            this.$onIconTap$delegate = currentPrice;
                            this.$dragOffsets = loaded2;
                            this.$lockedDragInterrupt = stockDetails;
                            this.$indicatorBounce = investingStockDetailsPresenter;
                            this.$view$delegate = mutableState;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(List list, PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel, CardDesignLibraryState cardDesignLibraryState, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Continuation continuation) {
                            super(2, continuation);
                            this.L$0 = list;
                            this.$this_pointerInput = paymentDeviceCustomizationViewModel;
                            this.$dragOffsets = cardDesignLibraryState;
                            this.$view$delegate = mutableState;
                            this.$cardEnabled$delegate = mutableState2;
                            this.$onIconTap$delegate = mutableState3;
                            this.$lockedDragInterrupt = mutableState4;
                            this.$indicatorBounce = mutableState5;
                        }
                    }
                };
                mutableState22 = mutableState44;
                gapComposer.updateRememberedValue(rememberedValue30);
            } else {
                mutableState21 = mutableState12;
                mutableState22 = mutableState19;
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, unit3, (PointerInputEventHandler) rememberedValue30);
            if (!((Boolean) ((InteractiveCardState) mutableState20.getValue()).touchEnabled$delegate.getValue()).booleanValue()) {
                pointerInput = null;
            }
            if (pointerInput == null) {
                pointerInput = companion;
            }
            gapComposer.startReplaceGroup(1882417809);
            CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(CardTransitionKt.LocalCardRegistry);
            if (cardRegistry == null) {
                r8 = 0;
                gapComposer.end(false);
                obj6 = null;
            } else {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = cardRegistry.sharedCache$delegate;
                if (((CardTextureState) parcelableSnapshotMutableState.getValue()) == null) {
                    parcelableSnapshotMutableState.setValue(new CardTextureState(null, 2047));
                }
                boolean changedInstance2 = gapComposer.changedInstance(cardRegistry);
                Object rememberedValue31 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue31 == obj9) {
                    rememberedValue31 = new CardAppletTileKt$$ExternalSyntheticLambda31(cardRegistry, 4);
                    gapComposer.updateRememberedValue(rememberedValue31);
                }
                Updater.DisposableEffect(unit3, (Function1) rememberedValue31, gapComposer);
                obj6 = (CardTextureState) parcelableSnapshotMutableState.getValue();
                r8 = 0;
                gapComposer.end(false);
            }
            Modifier aspectRatio = OffsetKt.aspectRatio(1.5857725f, SizeKt.m292widthInVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.wallet_card_max_width), 1), r8);
            BiasAlignment biasAlignment2 = Alignment.Companion.Center;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier align = boxScopeInstance.align(aspectRatio, biasAlignment2);
            align.getClass();
            wrapContentHeight = SizeKt.wrapContentHeight(ValueInsets.layout(align, new Hero3DCardViewKt$$ExternalSyntheticLambda11(r8)), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier then = OffsetKt.aspectRatio(1.0f, wrapContentHeight, r8).then(pointerInput);
            int i9 = i5;
            boolean changedInstance3 = ((i9 & 7168) == 2048) | gapComposer.changedInstance(obj6) | ((i9 & 458752) == 131072);
            Object rememberedValue32 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue32 == obj9) {
                mutableState23 = mutableState17;
                biasAlignment = biasAlignment2;
                continuation4 = null;
                Object overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(obj6, function02, mutableState23, function1, mutableState5, 27);
                gapComposer.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
                rememberedValue32 = overlayKt$$ExternalSyntheticLambda3;
            } else {
                mutableState23 = mutableState17;
                biasAlignment = biasAlignment2;
                continuation4 = null;
            }
            Function1 function14 = (Function1) rememberedValue32;
            Object obj11 = obj4;
            Object obj12 = obj3;
            Object obj13 = obj5;
            boolean changed11 = gapComposer.changed(obj11) | gapComposer.changed(obj12) | gapComposer.changed(obj13);
            Object rememberedValue33 = gapComposer.rememberedValue();
            if (changed11 || rememberedValue33 == obj9) {
                rememberedValue33 = new OverlayKt$$ExternalSyntheticLambda3(mutableState21, mutableState26, obj11, obj12, obj13, 28);
                gapComposer.updateRememberedValue(rememberedValue33);
            }
            Animatable animatable6 = animatable2;
            Continuation continuation6 = continuation4;
            int i10 = 0;
            AndroidView_androidKt.AndroidView(function14, then, (Function1) rememberedValue33, gapComposer, 0, 0);
            if (((Boolean) mutableState18.getValue()).booleanValue() || ((Boolean) mutableState40.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(-736689263);
                boolean changed12 = gapComposer.changed(mutableState22) | gapComposer.changed(mutableState20);
                Object rememberedValue34 = gapComposer.rememberedValue();
                if (changed12 || rememberedValue34 == obj9) {
                    mutableState24 = mutableState22;
                    rememberedValue34 = new TakeUntil$collectSafely$2(mutableState24, mutableState23, mutableState20, continuation6, 9);
                    gapComposer.updateRememberedValue(rememberedValue34);
                } else {
                    mutableState24 = mutableState22;
                }
                Updater.LaunchedEffect(gapComposer, unit3, (Function2) rememberedValue34);
                GapComposer gapComposer3 = gapComposer;
                State animateFloatAsState = AnimateAsStateKt.animateFloatAsState((((Boolean) mutableState24.getValue()).booleanValue() || z) ? RecyclerView.DECELERATION_RATE : 1.0f, null, null, null, gapComposer3, 0, 30);
                gapComposer = gapComposer3;
                z3 = true;
                Modifier aspectRatio2 = OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(SizeKt.m292widthInVpY3zN4$default(boxScopeInstance.align(companion, biasAlignment), RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.wallet_card_max_width), 1), 0.25f), false);
                boolean changedInstance4 = gapComposer.changedInstance(animatable6) | gapComposer.changed(mutableState20) | gapComposer.changed(animateFloatAsState);
                Object rememberedValue35 = gapComposer.rememberedValue();
                if (changedInstance4 || rememberedValue35 == obj9) {
                    rememberedValue35 = new Hero3DCardViewKt$$ExternalSyntheticLambda2(animatable6, mutableState20, animateFloatAsState, i10);
                    gapComposer.updateRememberedValue(rememberedValue35);
                }
                Modifier graphicsLayer = ColorKt.graphicsLayer(aspectRatio2, (Function1) rememberedValue35);
                boolean changed13 = gapComposer.changed(mutableState20);
                Object rememberedValue36 = gapComposer.rememberedValue();
                if (changed13 || rememberedValue36 == obj9) {
                    rememberedValue36 = new TabToolbarsKt$$ExternalSyntheticLambda10(28, mutableState20);
                    gapComposer.updateRememberedValue(rememberedValue36);
                }
                Modifier drawWithContent = ClipKt.drawWithContent(graphicsLayer, (Function1) rememberedValue36);
                boolean booleanValue = ((Boolean) mutableState24.getValue()).booleanValue();
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails5 = (CardSchemeViewModel.Module.HeroCardDetails) mutableState26.getValue();
                CardLockViewKt.LockAnimation(booleanValue, drawWithContent, (heroCardDetails5 == null || (cardTheme = heroCardDetails5.cardTheme) == null) ? LockAnimationColorTreatment.Adaptive.INSTANCE : CardLockViewKt.lockAnimationColorTreatment(cardTheme), gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-735143014);
                gapComposer.end(false);
                z3 = true;
            }
            gapComposer.end(z3);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i11 = 0;
            endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.wallet.views.Hero3DCardViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj82, Object obj92) {
                    switch (i11) {
                        case 0:
                            ((Integer) obj92).getClass();
                            Hero3DCardViewKt.InteractiveCard(modifier, interactiveCardState, heroCardDetails, function1, function0, function02, z, z2, (Composer) obj82, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj92).getClass();
                            Hero3DCardViewKt.InteractiveCard(modifier, interactiveCardState, heroCardDetails, function1, function0, function02, z, z2, (Composer) obj82, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final ChannelFlowTransformLatest cardSettleFlow(Flow flow, Function0 function0, Function0 function02, Function0 function03, float f, SpringSpec springSpec, Function0 function04) {
        flow.getClass();
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = 0L;
        return FlowKt.transformLatest(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealTabProvider$setup$1$5(2, null, 13), flow), new Hero3DCardViewKt$cardSettleFlow$$inlined$flatMapLatest$1(null, ref$LongRef, function03, function0, function02, springSpec, f, function04));
    }

    public static final float coerceToFinite(float f) {
        return Math.abs(f) <= Float.MAX_VALUE ? f : RecyclerView.DECELERATION_RATE;
    }

    public static final Object fadeIn(CardModelView cardModelView, MutableState mutableState, long j, SuspendLambda suspendLambda) {
        if (cardModelView.getAlpha() != RecyclerView.DECELERATION_RATE) {
            return Unit.INSTANCE;
        }
        Object collectLatest = FlowKt.collectLatest(FlowsKt.animatedFlow(mutableState, j, 200L), new Hero3DCardViewKt$fadeIn$2(0, cardModelView, null), suspendLambda);
        return collectLatest == CoroutineSingletons.COROUTINE_SUSPENDED ? collectLatest : Unit.INSTANCE;
    }

    /* renamed from: flingCardToClosestSide-F0iM_J4, reason: not valid java name */
    public static final Flow m3791flingCardToClosestSideF0iM_J4(Quat quat, Quat quat2, Quat quat3, long j, SpringSpec springSpec, float f) {
        quat.getClass();
        quat2.getClass();
        quat3.getClass();
        float coerceToFinite = coerceToFinite(quat.angleShortestPath(quat2));
        float coerceToFinite2 = coerceToFinite(quat.angleShortestPath(quat3));
        if (coerceToFinite >= coerceToFinite2) {
            quat2 = quat3;
        }
        return Math.min(coerceToFinite, coerceToFinite2) == RecyclerView.DECELERATION_RATE ? EmptyFlow.INSTANCE : AnimationsKt.m3563flingTo38CYSgM(quat, quat2, j, springSpec, f);
    }

    public static final ChannelFlowTransformLatest rotateDragFlow(Function0 function0, Flow flow) {
        flow.getClass();
        return FlowKt.mapLatest(new Hero3DCardViewKt$rotateDragFlow$2(function0, null, 0), new SquareAccountStore$userFlow$$inlined$map$1(flow, 8));
    }
}
