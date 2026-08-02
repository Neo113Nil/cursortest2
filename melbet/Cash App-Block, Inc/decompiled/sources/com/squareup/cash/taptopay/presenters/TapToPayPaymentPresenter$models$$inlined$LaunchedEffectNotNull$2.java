package com.squareup.cash.taptopay.presenters;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q$$ExternalSyntheticLambda1;
import com.google.android.gms.maps.zzai;
import com.squareup.cash.RealBugReportSender$copyDatabase$3;
import com.squareup.cash.cdf.taptopay.FlowType;
import com.squareup.cash.cdf.taptopay.ScreenID;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.taptopay.backend.api.EmvPaymentResult;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.cash.taptopay.backend.real.RealTagCommunication;
import com.squareup.cash.taptopay.backend.real.RealTagCommunication$Factory$Impl;
import com.squareup.cash.taptopay.backend.real.RealTagCommunicationTeardownRunner;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.backend.real.RealTapToPayErrorReporter;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$State;
import com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen;
import com.squareup.cash.taptopay.screens.TapToPayErrorReason;
import com.squareup.cash.taptopay.screens.TapToPayPaymentRequestScreen;
import com.squareup.cash.taptopay.screens.TapToPayPaymentScreen;
import com.squareup.cash.tax.presenters.TaxTooltipPresenter$MetroFactory;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.kotterknife.Lazy;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.MutexImpl;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class TapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ NfcAdapter.ReaderCallback $readerCallback$inlined;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $retryPaymentFlow$delegate$inlined;
    public final /* synthetic */ TapToPayPaymentData $sessionData$inlined;
    public final /* synthetic */ MutableState $state$delegate$inlined;
    public final /* synthetic */ TapToPayPaymentPresenter$State $t1;
    public final /* synthetic */ MutableState $tagCommunication$delegate$inlined;
    public int I$0;
    public /* synthetic */ Object L$0;
    public TapToPayPaymentPresenter$State.CardDetected L$2;
    public MutexImpl L$4;
    public int label;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2(TapToPayPaymentPresenter$State tapToPayPaymentPresenter$State, Continuation continuation, CardLockPresenter cardLockPresenter, TapToPayPaymentData tapToPayPaymentData, NfcAdapter.ReaderCallback readerCallback, MutableState mutableState, MutableState mutableState2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        super(2, continuation);
        this.$t1 = tapToPayPaymentPresenter$State;
        this.this$0 = cardLockPresenter;
        this.$sessionData$inlined = tapToPayPaymentData;
        this.$readerCallback$inlined = readerCallback;
        this.$tagCommunication$delegate$inlined = mutableState;
        this.$state$delegate$inlined = mutableState2;
        this.$retryPaymentFlow$delegate$inlined = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2 tapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2 = new TapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2(this.$t1, continuation, this.this$0, this.$sessionData$inlined, this.$readerCallback$inlined, this.$tagCommunication$delegate$inlined, this.$state$delegate$inlined, this.$retryPaymentFlow$delegate$inlined);
        tapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2.L$0 = obj;
        return tapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x01b1, code lost:
    
        if (r3.collect(r7, r21) != r6) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r1.lock(r21) == r6) goto L58;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TapToPayErrorReason tapToPayErrorReason;
        SpanTracking startTrackingSpan$default;
        TapToPayPaymentPresenter$State tapToPayPaymentPresenter$State;
        int i;
        List list;
        MutexImpl mutexImpl;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$retryPaymentFlow$delegate$inlined;
        MutableState mutableState = this.$tagCommunication$delegate$inlined;
        TapToPayPaymentData tapToPayPaymentData = this.$sessionData$inlined;
        MutableState mutableState2 = this.$state$delegate$inlined;
        CardLockPresenter cardLockPresenter = this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            TapToPayPaymentPresenter$State tapToPayPaymentPresenter$State2 = this.$t1;
            if (!tapToPayPaymentPresenter$State2.equals(TapToPayPaymentPresenter$State.Initialized.INSTANCE)) {
                if (tapToPayPaymentPresenter$State2 instanceof TapToPayPaymentPresenter$State.CardTapped) {
                    Tag tag = ((TapToPayPaymentPresenter$State.CardTapped) tapToPayPaymentPresenter$State2).tag;
                    IsoDep isoDep = tag != null ? IsoDep.get(tag) : null;
                    if (isoDep != null) {
                        Timber.Forest.i("IsoDep TAG found", new Object[0]);
                        TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = ((RealTagCommunication$Factory$Impl) cardLockPresenter.issuedCardManager).delegateFactory;
                        RealTagCommunicationTeardownRunner realTagCommunicationTeardownRunner = (RealTagCommunicationTeardownRunner) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
                        CoroutineContext coroutineContext = (CoroutineContext) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
                        realTagCommunicationTeardownRunner.getClass();
                        coroutineContext.getClass();
                        mutableState.setValue(new RealTagCommunication(realTagCommunicationTeardownRunner, isoDep, coroutineContext));
                        RealTagCommunication realTagCommunication = (RealTagCommunication) mutableState.getValue();
                        realTagCommunication.getClass();
                        mutableState2.setValue(new TapToPayPaymentPresenter$State.CardDetected(realTagCommunication));
                    } else {
                        TapToPayPaymentPresenter$State.FailureReason failureReason = TapToPayPaymentPresenter$State.FailureReason.NFC_TAG_CONNECTION_ERROR;
                        zzai zzaiVar = (zzai) cardLockPresenter.args;
                        startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default((RealObservabilityManager) zzaiVar.zab, null, "get_packaged_logs", null, null, 12);
                        try {
                            Lazy lazy = (Lazy) ((AssetPublicSuffixList) zzaiVar.zad).path;
                            synchronized (lazy.value) {
                                list = CollectionsKt.toList((ArrayDeque) lazy.initializer);
                            }
                            String joinToString$default = CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63);
                            SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
                            mutableState2.setValue(new TapToPayPaymentPresenter$State.RetryableFailure(failureReason, null, joinToString$default, 2));
                        } finally {
                        }
                    }
                } else if (tapToPayPaymentPresenter$State2 instanceof TapToPayPaymentPresenter$State.CardDetected) {
                    RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper = (RealTapToPayAnalyticsHelper) cardLockPresenter.franklinAppService;
                    String str = tapToPayPaymentData.customerToken;
                    FlowType flowType = FlowType.PAYMENT;
                    ScreenID screenID = ScreenID.AndroidReadCardScreen;
                    this.L$0 = null;
                    this.L$2 = (TapToPayPaymentPresenter$State.CardDetected) tapToPayPaymentPresenter$State2;
                    this.I$0 = 0;
                    this.label = 2;
                    if (realTapToPayAnalyticsHelper.submitTapEvent(str, flowType, screenID, this) != coroutineSingletons) {
                        tapToPayPaymentPresenter$State = tapToPayPaymentPresenter$State2;
                        i = 0;
                        RealTagCommunication realTagCommunication2 = ((TapToPayPaymentPresenter$State.CardDetected) tapToPayPaymentPresenter$State).tag;
                        Flow flowOn = FlowKt.flowOn(new FinishSetupTileBadgeCounter(21, new SafeFlow(new TaxWebAppBridge.AnonymousClass3(realTagCommunication2, null, 2)), new RealBugReportSender$copyDatabase$3(3, null, 5)), realTagCommunication2.ioContext);
                        BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass1 = new BufferCountKt$bufferSkip$1.AnonymousClass1(10, cardLockPresenter, realTagCommunication2, mutableState2);
                        this.L$0 = null;
                        this.L$2 = null;
                        this.L$4 = null;
                        this.I$0 = i;
                        this.label = 3;
                    }
                } else {
                    if (tapToPayPaymentPresenter$State2 instanceof TapToPayPaymentPresenter$State.ProcessingCardData) {
                        zzai zzaiVar2 = (zzai) cardLockPresenter.args;
                        startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default((RealObservabilityManager) zzaiVar2.zab, null, "subscribe_command_apdu", null, null, 12);
                        try {
                            StateFlowImpl stateFlowImpl = (StateFlowImpl) zzaiVar2.zzc;
                            SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
                            BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass12 = new BufferCountKt$bufferSkip$1.AnonymousClass1(11, tapToPayPaymentPresenter$State2, cardLockPresenter, mutableState2);
                            this.L$0 = null;
                            this.L$2 = null;
                            this.I$0 = 0;
                            this.label = 4;
                            stateFlowImpl.collect(new FlowKt__MergeKt$flattenConcat$1$1(anonymousClass12, 16), this);
                            return coroutineSingletons;
                        } finally {
                        }
                    }
                    if (tapToPayPaymentPresenter$State2 instanceof TapToPayPaymentPresenter$State.PaymentRequested) {
                        ((zzai) cardLockPresenter.args).stopReadingCardPayment();
                        Timber.Forest forest = Timber.Forest;
                        forest.i("PaymentRequested", new Object[0]);
                        EmvPaymentResult emvPaymentResult = ((TapToPayPaymentPresenter$State.PaymentRequested) tapToPayPaymentPresenter$State2).requestData;
                        if (emvPaymentResult instanceof EmvPaymentResult.PaymentAuthRequested) {
                            forest.i("PaymentAuthRequested", new Object[0]);
                            cardLockPresenter.navigator.goTo(new TapToPayPaymentRequestScreen(((EmvPaymentResult.PaymentAuthRequested) emvPaymentResult).authorizationData, tapToPayPaymentData.amount, ((TapToPayPaymentScreen) cardLockPresenter.deviceLockAnimationBus).initiatorNotes, tapToPayPaymentData.idempotencyToken, tapToPayPaymentData.isDemoMode));
                        } else {
                            if (!(emvPaymentResult instanceof EmvPaymentResult.PaymentDeclined)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            forest.e("PaymentDeclined", new Object[0]);
                            mutableState2.setValue(new TapToPayPaymentPresenter$State.RetryableFailure(TapToPayPaymentPresenter$State.FailureReason.PAYMENT_DECLINED, null, ((EmvPaymentResult.PaymentDeclined) emvPaymentResult).errorLogs, 2));
                        }
                    } else if (tapToPayPaymentPresenter$State2 instanceof TapToPayPaymentPresenter$State.RetryableFailure) {
                        RealTapToPayErrorReporter realTapToPayErrorReporter = (RealTapToPayErrorReporter) cardLockPresenter.flowStarter;
                        TapToPayPaymentPresenter$State.RetryableFailure retryableFailure = (TapToPayPaymentPresenter$State.RetryableFailure) tapToPayPaymentPresenter$State2;
                        String str2 = retryableFailure.packagedLogs;
                        String str3 = retryableFailure.message;
                        TapToPayPaymentPresenter$State.FailureReason failureReason2 = retryableFailure.reason;
                        realTapToPayErrorReporter.errorReporter.report(new TapToPayPaymentError("(Retryable Failure) while " + failureReason2 + ": " + (str3 == null ? "" : str3) + "\nLogs: " + str2), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                        RealTagCommunication realTagCommunication3 = (RealTagCommunication) mutableState.getValue();
                        if (realTagCommunication3 != null) {
                            realTagCommunication3.closeInBackground();
                        }
                        NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                        BetterNavigator.ScreenNavigator screenNavigator = cardLockPresenter.navigator;
                        Screen screen = tapToPayPaymentData.exitScreen;
                        int ordinal = failureReason2.ordinal();
                        if (ordinal == 0) {
                            tapToPayErrorReason = TapToPayErrorReason.CARD_TAP_NFC_READER_ERROR;
                        } else if (ordinal == 1) {
                            tapToPayErrorReason = TapToPayErrorReason.CARD_TAP_APDU_CONNECTION_ERROR;
                        } else if (ordinal == 2) {
                            tapToPayErrorReason = TapToPayErrorReason.CARD_TAP_PAYMENT_DECLINED;
                        } else {
                            if (ordinal != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            tapToPayErrorReason = TapToPayErrorReason.CARD_TAP_ERROR;
                        }
                        screenNavigator.goTo(new TapToPayErrorDialogScreen.TapToPayCardTapErrorDialogScreen(screen, tapToPayErrorReason, str3, str2));
                    }
                }
                return Unit.INSTANCE;
            }
            Timber.Forest.i("ECR initialized, start reading for card", new Object[0]);
            mutexImpl = (MutexImpl) cardLockPresenter.ioDispatcher;
            this.L$0 = null;
            this.L$2 = null;
            this.L$4 = mutexImpl;
            this.I$0 = 0;
            this.label = 1;
            return coroutineSingletons;
        }
        if (i2 == 1) {
            mutexImpl = this.L$4;
            SafeTrace.throwOnFailure(obj);
            try {
                zzai zzaiVar3 = (zzai) cardLockPresenter.args;
                Long l = tapToPayPaymentData.amount.amount;
                l.getClass();
                long longValue = l.longValue();
                NfcAdapter.ReaderCallback readerCallback = this.$readerCallback$inlined;
                readerCallback.getClass();
                RealObservabilityManager realObservabilityManager = (RealObservabilityManager) zzaiVar3.zab;
                q$$ExternalSyntheticLambda1 q__externalsyntheticlambda1 = new q$$ExternalSyntheticLambda1(zzaiVar3, readerCallback, longValue, 7);
                startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default(realObservabilityManager, null, "start_reading_card_payment", null, null, 12);
                try {
                    q__externalsyntheticlambda1.invoke();
                    return Unit.INSTANCE;
                } finally {
                }
            } finally {
                mutexImpl.unlock(null);
            }
        }
        if (i2 != 2) {
            if (i2 == 3) {
            } else if (i2 != 4) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        i = this.I$0;
        tapToPayPaymentPresenter$State = this.L$2;
        SafeTrace.throwOnFailure(obj);
        RealTagCommunication realTagCommunication22 = ((TapToPayPaymentPresenter$State.CardDetected) tapToPayPaymentPresenter$State).tag;
        Flow flowOn2 = FlowKt.flowOn(new FinishSetupTileBadgeCounter(21, new SafeFlow(new TaxWebAppBridge.AnonymousClass3(realTagCommunication22, null, 2)), new RealBugReportSender$copyDatabase$3(3, null, 5)), realTagCommunication22.ioContext);
        BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass13 = new BufferCountKt$bufferSkip$1.AnonymousClass1(10, cardLockPresenter, realTagCommunication22, mutableState2);
        this.L$0 = null;
        this.L$2 = null;
        this.L$4 = null;
        this.I$0 = i;
        this.label = 3;
    }
}
