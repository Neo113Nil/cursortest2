package com.squareup.workflow1;

import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt$CardSceneEffect$6$1$2;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.sharesheet.ShareSheetPresenter$models$1$1$5;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$5$1$2;
import com.squareup.cash.wallet.presenters.RealNextUpCandidateDismisser;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardNuxAnimationsKt;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.CardNuxState$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$fadeIn$2;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.wallet.views.InteractiveCardState;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt;
import com.squareup.cash.wallet.views.WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$3$1$$ExternalSyntheticLambda0;
import com.squareup.cash.work.data.real.RealPayDataLoader;
import com.squareup.cash.work.data.real.RealShiftDataLoader;
import com.squareup.cash.work.data.real.RealShiftDataLoader$retryFailedLoads$schedules$1;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.util.compose.StateFlowKt$receiveValueAsState$1$1$1;
import com.squareup.util.coroutines.TakeUntil;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2$job$1$1;
import com.squareup.util.coroutines.Teardown;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.stripe.android.challenge.confirmation.BridgeException;
import com.stripe.android.challenge.confirmation.ConfirmationChallengeBridgeEvent;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityResult;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeArgs;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeViewModel;
import com.stripe.android.challenge.confirmation.WebViewError;
import com.stripe.android.challenge.confirmation.analytics.IntentConfirmationChallengeAnalyticsEvent;
import com.stripe.android.core.utils.DefaultDurationProvider;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerClickableText;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onSubmit$1;
import com.stripe.android.financialconnections.features.consent.ConsentClickableText;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel$logErrors$2;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel$logErrors$3;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.ComparableRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes8.dex */
public final class TimerWorker$run$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimerWorker$run$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                TimerWorker$run$1 timerWorker$run$1 = new TimerWorker$run$1((TimerWorker) obj2, continuation, 0);
                timerWorker$run$1.L$0 = obj;
                return timerWorker$run$1;
            case 1:
                return new TimerWorker$run$1((Flow) this.L$0, (CardSchemePresenter) obj2, continuation, 1);
            case 2:
                return new TimerWorker$run$1((RealNextUpCandidateDismisser) this.L$0, (String) obj2, continuation, 2);
            case 3:
                return new TimerWorker$run$1((Function0) this.L$0, (CardRegistry) obj2, continuation, 3);
            case 4:
                return new TimerWorker$run$1((InteractiveCardState) this.L$0, (CardScene) obj2, continuation, 4);
            case 5:
                TimerWorker$run$1 timerWorker$run$12 = new TimerWorker$run$1((Animatable) obj2, continuation, 5);
                timerWorker$run$12.L$0 = obj;
                return timerWorker$run$12;
            case 6:
                return new TimerWorker$run$1((InteractiveCardState) this.L$0, (MutableState) obj2, continuation, 6);
            case 7:
                return new TimerWorker$run$1((MutableSharedFlow) this.L$0, (MutableState) obj2, continuation, 7);
            case 8:
                TimerWorker$run$1 timerWorker$run$13 = new TimerWorker$run$1((CardNuxState) obj2, continuation, 8);
                timerWorker$run$13.L$0 = obj;
                return timerWorker$run$13;
            case 9:
                return new TimerWorker$run$1((CardScene) this.L$0, (CardNuxState) obj2, continuation, 9);
            case 10:
                TimerWorker$run$1 timerWorker$run$14 = new TimerWorker$run$1((Function0) obj2, continuation, 10);
                timerWorker$run$14.L$0 = obj;
                return timerWorker$run$14;
            case 11:
                return new TimerWorker$run$1((MutableState) this.L$0, (Function0) obj2, continuation, 11);
            case 12:
                return new TimerWorker$run$1((CardNuxState) this.L$0, (Function1) obj2, continuation, 12);
            case 13:
                return new TimerWorker$run$1((Animatable) this.L$0, (CardNuxState) obj2, continuation, 13);
            case 14:
                return new TimerWorker$run$1((DefaultPagerState) this.L$0, (Function1) obj2, continuation, 14);
            case 15:
                return new TimerWorker$run$1((JCAContext) this.L$0, (MerchantIdentifier) obj2, continuation, 15);
            case 16:
                return new TimerWorker$run$1((RealPayDataLoader) this.L$0, (RealPayDataLoader.RequestMetadata) obj2, continuation, 16);
            case 17:
                return new TimerWorker$run$1((RealShiftDataLoader) this.L$0, (ComparableRange) obj2, continuation, 17);
            case 18:
                TimerWorker$run$1 timerWorker$run$15 = new TimerWorker$run$1((TextView) obj2, continuation, 18);
                timerWorker$run$15.L$0 = obj;
                return timerWorker$run$15;
            case 19:
                return new TimerWorker$run$1((StateFlow) this.L$0, (Ref$ObjectRef) obj2, continuation, 19);
            case 20:
                return new TimerWorker$run$1((Flow) this.L$0, (Function2) obj2, continuation, 20);
            case 21:
                return new TimerWorker$run$1((Teardown) obj2, continuation, 21);
            case 22:
                return new TimerWorker$run$1((TakeUntil) this.L$0, (AtomicBoolean) obj2, continuation, 22);
            case 23:
                return new TimerWorker$run$1((Function1) this.L$0, (Function1) obj2, continuation, 23);
            case 24:
                return new TimerWorker$run$1((IntentConfirmationChallengeActivity) this.L$0, (MutableState) obj2, continuation, 24);
            case 25:
                return new TimerWorker$run$1((IntentConfirmationChallengeViewModel) this.L$0, (WebViewError) obj2, continuation, 25);
            case 26:
                TimerWorker$run$1 timerWorker$run$16 = new TimerWorker$run$1((IntentConfirmationChallengeViewModel) obj2, continuation, 26);
                timerWorker$run$16.L$0 = obj;
                return timerWorker$run$16;
            case 27:
                return new TimerWorker$run$1((RealHandleError) this.L$0, (Throwable) obj2, continuation, 27);
            case 28:
                return new TimerWorker$run$1((AccountPickerViewModel) this.L$0, (String) obj2, continuation, 28);
            default:
                return new TimerWorker$run$1((ConsentViewModel) this.L$0, (String) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 19:
                ((TimerWorker$run$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 21:
                ((TimerWorker$run$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((TimerWorker$run$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0283, code lost:
    
        if (((kotlin.jvm.functions.Function1) r12).invoke(r23) == r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0270, code lost:
    
        if (r1 == r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0391, code lost:
    
        if (kotlin.TuplesKt.awaitClose(r0, r3, r23) == r1) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0379, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r0)._channel.send(r2, r23) == r1) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04a9, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r2, r1, null, null, r23, 12) == r7) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0480, code lost:
    
        if (r0.snapTo(r3, r23) == r7) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0771, code lost:
    
        if (r1.emit(r2, r23) == r0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0764, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r2, r23) == r0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0163, code lost:
    
        if (r0.emit(r1, r23) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0196, code lost:
    
        if (r0.emit(r1, r23) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01dc, code lost:
    
        if (r0.emit(r2, r23) == r4) goto L56;
     */
    /* JADX WARN: Type inference failed for: r1v87, types: [com.squareup.util.coroutines.Teardown, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object invoke;
        int i = this.$r8$classId;
        int i2 = 14;
        int i3 = 5;
        int i4 = 10;
        int i5 = 22;
        final int i6 = 0;
        int i7 = 3;
        int i8 = 24;
        int i9 = 2;
        Object obj2 = this.this$0;
        final int i10 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    long j = ((TimerWorker) obj2).delayMs;
                    this.L$0 = flowCollector;
                    this.label = 1;
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Unit unit = Unit.INSTANCE;
                this.L$0 = null;
                this.label = 2;
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.L$0;
                    CardSchemePresenter$models$5$1$2 cardSchemePresenter$models$5$1$2 = new CardSchemePresenter$models$5$1$2((CardSchemePresenter) obj2, i9);
                    this.label = 1;
                    Object collect = flow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(cardSchemePresenter$models$5$1$2, 15), this);
                    if (collect != coroutineSingletons2) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                try {
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealMRIFactory$sign$2.AnonymousClass1 anonymousClass1 = new RealMRIFactory$sign$2.AnonymousClass1((RealNextUpCandidateDismisser) this.L$0, (String) obj2, continuation, i5);
                        this.label = 1;
                        if (PlatformKt.retryWhenRetryable$default(null, anonymousClass1, this, 3) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Timber.Forest.d("Failed to dismiss Next Up recommendation", new Object[0], e2);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new AlertBannerKt$$ExternalSyntheticLambda2(14, (Function0) this.L$0)), i8);
                    WorkflowNode$tick$1$1 workflowNode$tick$1$1 = new WorkflowNode$tick$1$1((CardRegistry) obj2, continuation, 16);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, workflowNode$tick$1$1, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final InteractiveCardState interactiveCardState = (InteractiveCardState) this.L$0;
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new Function0() { // from class: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$5$2$5$2$5$childJob$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i16 = i10;
                            InteractiveCardState interactiveCardState2 = interactiveCardState;
                            switch (i16) {
                            }
                            return interactiveCardState2.toPanEntity();
                        }
                    });
                    CardSceneEffectKt$CardSceneEffect$6$1$2 cardSceneEffectKt$CardSceneEffect$6$1$2 = new CardSceneEffectKt$CardSceneEffect$6$1$2((CardScene) obj2, continuation, i9);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow, cardSceneEffectKt$CardSceneEffect$6$1$2, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CardModelView cardModelView = (CardModelView) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new CardLockViewKt$$ExternalSyntheticLambda1((Animatable) obj2, 5));
                    Hero3DCardViewKt$fadeIn$2 hero3DCardViewKt$fadeIn$2 = new Hero3DCardViewKt$fadeIn$2(i10, cardModelView, continuation);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow2, hero3DCardViewKt$fadeIn$2, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final InteractiveCardState interactiveCardState2 = (InteractiveCardState) this.L$0;
                    SafeFlow snapshotFlow3 = Updater.snapshotFlow(new Function0() { // from class: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$5$2$5$2$5$childJob$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i162 = i6;
                            InteractiveCardState interactiveCardState22 = interactiveCardState2;
                            switch (i162) {
                            }
                            return interactiveCardState22.toPanEntity();
                        }
                    });
                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$1 = new TabContentPresenter$models$4$1$1$1((MutableState) obj2, continuation, i8);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow3, tabContentPresenter$models$4$1$1$1, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float[] fArr = Hero3DCardViewKt.X_AXIS;
                    if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.L$0;
                        this.label = 1;
                        if (mutableSharedFlow.emit(null, this) == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                List list = (List) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (RevolvingInteractiveCardsKt.rotateCards((CardNuxState) obj2, list, null, null, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardScene cardScene = (CardScene) this.L$0;
                    CardModelView.ViewModel cardViewModelInternal = RevolvingInteractiveCardsKt.toCardViewModelInternal(((CardNuxState) obj2).getCurrentCard());
                    Quat quat = CardNuxAnimationsKt.NUX_CARD_ROTATION;
                    Vector4 vector4 = new Vector4(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                    this.label = 1;
                    int i21 = CardScene.$r8$clinit;
                    if (cardScene.updateCard(cardViewModelInternal, quat, vector4, null, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CardModelView cardModelView2 = (CardModelView) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow4 = Updater.snapshotFlow(new AlertBannerKt$$ExternalSyntheticLambda2(17, (Function0) obj2));
                    CardModelView.AnonymousClass1 anonymousClass12 = new CardModelView.AnonymousClass1(i3, cardModelView2, continuation);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow4, anonymousClass12, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$12 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(26, (MutableState) this.L$0)), i8);
                    TimerWorker$run$1 timerWorker$run$1 = new TimerWorker$run$1((Function0) obj2, continuation, i4);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, timerWorker$run$1, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow5 = Updater.snapshotFlow(new CardNuxState$$ExternalSyntheticLambda0((CardNuxState) this.L$0, i3));
                    LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2((Function1) obj2, continuation, 6);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow5, localAddBrandsViewKt$LocalAddBrandsView$1$2$1$2, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = (Animatable) this.L$0;
                    Float f = new Float(((Number) ((CardNuxState) obj2).currentZ$delegate.getValue()).floatValue());
                    this.label = 1;
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Animatable animatable2 = (Animatable) this.L$0;
                Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 50.0f, new Float(0.01f), 1);
                this.label = 2;
                break;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$3$1$$ExternalSyntheticLambda0((DefaultPagerState) this.L$0, i6)));
                    SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2 anonymousClass2 = new SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2(i2, (Function1) obj2);
                    this.label = 1;
                    if (distinctUntilChanged.collect(anonymousClass2, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object access$fetchStatus = JCAContext.access$fetchStatus((JCAContext) this.L$0, (MerchantIdentifier) obj2, this);
                    return access$fetchStatus == coroutineSingletons16 ? coroutineSingletons16 : access$fetchStatus;
                }
                if (i27 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object access$fetchShiftsOverview = RealPayDataLoader.access$fetchShiftsOverview((RealPayDataLoader) this.L$0, (RealPayDataLoader.RequestMetadata) obj2, this);
                    return access$fetchShiftsOverview == coroutineSingletons17 ? coroutineSingletons17 : access$fetchShiftsOverview;
                }
                if (i28 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 != 0) {
                    if (i29 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealShiftDataLoader realShiftDataLoader = (RealShiftDataLoader) this.L$0;
                RealShiftDataLoader$retryFailedLoads$schedules$1 realShiftDataLoader$retryFailedLoads$schedules$1 = new RealShiftDataLoader$retryFailedLoads$schedules$1(realShiftDataLoader, continuation, i10);
                this.label = 1;
                Object access$loadInitialFeed = RealShiftDataLoader.access$loadInitialFeed(realShiftDataLoader, (ComparableRange) obj2, realShiftDataLoader$retryFailedLoads$schedules$1, this);
                return access$loadInitialFeed == coroutineSingletons18 ? coroutineSingletons18 : access$loadInitialFeed;
            case 18:
                TextView textView = (TextView) obj2;
                ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String obj3 = textView.getText().toString();
                    this.L$0 = producerScope;
                    this.label = 1;
                    break;
                } else {
                    if (i30 != 1) {
                        if (i30 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                SearchView.AnonymousClass10 anonymousClass10 = new SearchView.AnonymousClass10(producerScope, i4);
                textView.addTextChangedListener(anonymousClass10);
                ListsKt$$ExternalSyntheticLambda0 listsKt$$ExternalSyntheticLambda0 = new ListsKt$$ExternalSyntheticLambda0(i5, textView, anonymousClass10);
                this.L$0 = null;
                this.label = 2;
                break;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow stateFlow = (StateFlow) this.L$0;
                    StateFlowKt$receiveValueAsState$1$1$1 stateFlowKt$receiveValueAsState$1$1$1 = new StateFlowKt$receiveValueAsState$1$1$1(i6, (Ref$ObjectRef) obj2);
                    this.label = 1;
                    if (stateFlow.collect(stateFlowKt$receiveValueAsState$1$1$1, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 != 0) {
                    if (i32 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Flow flow2 = (Flow) this.L$0;
                SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1((Function2) obj2, continuation, i7);
                this.label = 1;
                Object firstOrNull = FlowKt.firstOrNull(flow2, simpleChannelFlowKt$simpleChannelFlow$1, this);
                return firstOrNull == coroutineSingletons21 ? coroutineSingletons21 : firstOrNull;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ?? r1 = this.label;
                try {
                    if (r1 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = (Teardown) obj2;
                        this.label = 1;
                        JobKt.awaitCancellation(this);
                        return coroutineSingletons22;
                    }
                    if (r1 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    r1.teardown();
                    throw th;
                }
            case 22:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                try {
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow3 = ((TakeUntil) this.L$0).other;
                        TakeUntil$collectSafely$2$job$1$1 takeUntil$collectSafely$2$job$1$1 = TakeUntil$collectSafely$2$job$1$1.INSTANCE;
                        this.label = 1;
                        if (flow3.collect(takeUntil$collectSafely$2$job$1$1, this) == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    } else {
                        if (i33 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                } catch (TakeUntil.StopException unused) {
                } catch (Throwable th2) {
                    atomicBoolean.set(true);
                    throw th2;
                }
                atomicBoolean.set(true);
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Function1 function1 = (Function1) this.L$0;
                    this.label = 1;
                    invoke = function1.invoke(this);
                    break;
                } else {
                    if (i34 != 1) {
                        if (i34 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    invoke = obj;
                }
                if (((Boolean) invoke).booleanValue()) {
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 != 0) {
                    if (i35 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                IntentConfirmationChallengeActivity intentConfirmationChallengeActivity = (IntentConfirmationChallengeActivity) this.L$0;
                int i36 = IntentConfirmationChallengeActivity.$r8$clinit;
                SharedFlowImpl sharedFlowImpl = intentConfirmationChallengeActivity.getViewModel().bridgeReady;
                ShareSheetPresenter$models$1$1$5 shareSheetPresenter$models$1$1$5 = new ShareSheetPresenter$models$1$1$5(i4, (MutableState) obj2);
                this.label = 1;
                sharedFlowImpl.collect(shareSheetPresenter$models$1$1$5, this);
                return coroutineSingletons25;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    IntentConfirmationChallengeViewModel intentConfirmationChallengeViewModel = (IntentConfirmationChallengeViewModel) this.L$0;
                    SharedFlowImpl sharedFlowImpl2 = intentConfirmationChallengeViewModel._result;
                    IntentConfirmationChallengeActivityResult.Failed failed = new IntentConfirmationChallengeActivityResult.Failed(intentConfirmationChallengeViewModel.args.intent.getClientSecret(), (WebViewError) obj2);
                    this.label = 1;
                    if (sharedFlowImpl2.emit(failed, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                IntentConfirmationChallengeViewModel intentConfirmationChallengeViewModel2 = (IntentConfirmationChallengeViewModel) obj2;
                SharedFlowImpl sharedFlowImpl3 = intentConfirmationChallengeViewModel2._result;
                TextSetter textSetter = intentConfirmationChallengeViewModel2.analyticsEventReporter;
                IntentConfirmationChallengeArgs intentConfirmationChallengeArgs = intentConfirmationChallengeViewModel2.args;
                ConfirmationChallengeBridgeEvent confirmationChallengeBridgeEvent = (ConfirmationChallengeBridgeEvent) this.L$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (confirmationChallengeBridgeEvent instanceof ConfirmationChallengeBridgeEvent.Ready) {
                        textSetter.fireEvent(new IntentConfirmationChallengeAnalyticsEvent.Cancel(TextSetter.m3979durationInMsBwNAW2A(((DefaultDurationProvider) ((DurationProvider) textSetter.scannerText)).m4011endLV8wdWc(DurationProvider.Key.IntentConfirmationChallengeWebViewLoaded)), 2, intentConfirmationChallengeArgs.captchaVendorName));
                        SharedFlowImpl sharedFlowImpl4 = intentConfirmationChallengeViewModel2._bridgeReady;
                        Unit unit2 = Unit.INSTANCE;
                        this.L$0 = null;
                        this.label = 1;
                        break;
                    } else if (confirmationChallengeBridgeEvent instanceof ConfirmationChallengeBridgeEvent.Success) {
                        textSetter.fireEvent(new IntentConfirmationChallengeAnalyticsEvent.Cancel(TextSetter.m3979durationInMsBwNAW2A(((DefaultDurationProvider) ((DurationProvider) textSetter.scannerText)).m4011endLV8wdWc(DurationProvider.Key.IntentConfirmationChallenge)), 1, intentConfirmationChallengeArgs.captchaVendorName));
                        IntentConfirmationChallengeActivityResult.Success success = new IntentConfirmationChallengeActivityResult.Success(((ConfirmationChallengeBridgeEvent.Success) confirmationChallengeBridgeEvent).clientSecret);
                        this.L$0 = null;
                        this.label = 2;
                        break;
                    } else {
                        if (!(confirmationChallengeBridgeEvent instanceof ConfirmationChallengeBridgeEvent.Error)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        BridgeException bridgeException = ((ConfirmationChallengeBridgeEvent.Error) confirmationChallengeBridgeEvent).error;
                        textSetter.fireEvent(new IntentConfirmationChallengeAnalyticsEvent.Error(TextSetter.m3979durationInMsBwNAW2A(((DefaultDurationProvider) ((DurationProvider) textSetter.scannerText)).m4011endLV8wdWc(DurationProvider.Key.IntentConfirmationChallenge)), bridgeException.f1427type, bridgeException.code, intentConfirmationChallengeArgs.captchaVendorName, true));
                        IntentConfirmationChallengeActivityResult.Failed failed2 = new IntentConfirmationChallengeActivityResult.Failed(intentConfirmationChallengeArgs.intent.getClientSecret(), bridgeException);
                        this.L$0 = null;
                        this.label = 3;
                        break;
                    }
                } else {
                    if (i38 != 1 && i38 != 2 && i38 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl5 = ((RealHandleError) this.L$0).nativeAuthFlowCoordinator.flow;
                    NativeAuthFlowCoordinator.Message.CloseWithError closeWithError = new NativeAuthFlowCoordinator.Message.CloseWithError((Throwable) obj2);
                    this.label = 1;
                    if (sharedFlowImpl5.emit(closeWithError, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Date date = new Date();
                    AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) this.L$0;
                    HandleClickableUrl handleClickableUrl = accountPickerViewModel.handleClickableUrl;
                    FinancialConnectionsSessionManifest.Pane pane = AccountPickerViewModel.PANE;
                    String str = (String) obj2;
                    CardTransitionKt$$ExternalSyntheticLambda4 cardTransitionKt$$ExternalSyntheticLambda4 = new CardTransitionKt$$ExternalSyntheticLambda4(i5, accountPickerViewModel, str, date);
                    AccountPickerClickableText[] accountPickerClickableTextArr = AccountPickerClickableText.$VALUES;
                    Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("stripe://data-access-notice", new AccountPickerViewModel$onSubmit$1(accountPickerViewModel, continuation, i10)));
                    this.label = 1;
                    if (handleClickableUrl.invoke(pane, str, cardTransitionKt$$ExternalSyntheticLambda4, mapOf, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i40 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                ConsentViewModel consentViewModel = (ConsentViewModel) this.L$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = this.label;
                if (i41 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Date date2 = new Date();
                    HandleClickableUrl handleClickableUrl2 = consentViewModel.handleClickableUrl;
                    FinancialConnectionsSessionManifest.Pane pane2 = FinancialConnectionsSessionManifest.Pane.CONSENT;
                    String str2 = (String) obj2;
                    CardTransitionKt$$ExternalSyntheticLambda4 cardTransitionKt$$ExternalSyntheticLambda42 = new CardTransitionKt$$ExternalSyntheticLambda4(i8, consentViewModel, str2, date2);
                    ConsentClickableText[] consentClickableTextArr = ConsentClickableText.$VALUES;
                    Map mapOf2 = MapsKt__MapsKt.mapOf(new Pair("stripe://data-access-notice", new ConsentViewModel$logErrors$2(consentViewModel, continuation, i10)), new Pair("stripe://legal-details-notice", new ConsentViewModel$logErrors$2(consentViewModel, continuation, i9)), new Pair("stripe://manual-entry", new ConsentViewModel$logErrors$2(consentViewModel, continuation, i7)), new Pair("stripe://link-login", new ConsentViewModel$logErrors$3(consentViewModel, continuation, i9)), new Pair("stripe://link-account-picker", new ConsentViewModel$logErrors$2(consentViewModel, continuation, 4)));
                    this.label = 1;
                    if (handleClickableUrl2.invoke(pane2, str2, cardTransitionKt$$ExternalSyntheticLambda42, mapOf2, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i41 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimerWorker$run$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
