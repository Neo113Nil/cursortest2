package com.squareup.util.task;

import androidx.lifecycle.Lifecycle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.RealSandboxer;
import com.squareup.cash.support.chat.backend.real.SupportConversationPersistence;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.CashNavigationLogger;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.real.RealPersonNameFormatter;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.presenters.shift.ShiftDetailMapper;
import com.squareup.cash.work.presenters.shift.data.ClockInStateResolver;
import com.squareup.preferences.KeyValue;
import com.squareup.util.android.AndroidToaster;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RepeatTaskExecutor {
    public final CoroutineContext dispatcher;
    public final Lifecycle lifecycle;
    public final RepeatOnLifecycleTaskRunner repeatOnLifecycleTaskRunner;
    public final CoroutineScope scope;
    public final SessionManager sessionManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SessionState {
        public static final /* synthetic */ SessionState[] $VALUES;
        public static final SessionState AUTHENTICATED;
        public static final SessionState ONBOARDED;

        static {
            SessionState sessionState = new SessionState("AUTHENTICATED", 0);
            AUTHENTICATED = sessionState;
            SessionState sessionState2 = new SessionState("ONBOARDED", 1);
            ONBOARDED = sessionState2;
            $VALUES = new SessionState[]{sessionState, sessionState2};
        }

        public static SessionState valueOf(String str) {
            return (SessionState) Enum.valueOf(SessionState.class, str);
        }

        public static SessionState[] values() {
            return (SessionState[]) $VALUES.clone();
        }
    }

    public RepeatTaskExecutor(SessionManager sessionManager, Lifecycle lifecycle, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.sessionManager = sessionManager;
        this.lifecycle = lifecycle;
        this.scope = coroutineScope;
        this.dispatcher = coroutineContext;
        this.repeatOnLifecycleTaskRunner = new RepeatOnLifecycleTaskRunner(lifecycle);
    }

    /* renamed from: access$repeatOnInterval-hhJSO8g, reason: not valid java name */
    public static final void m3997access$repeatOnIntervalhhJSO8g(RepeatTaskExecutor repeatTaskExecutor, CoroutineScope coroutineScope, Duration duration, Lifecycle.State state, Function1 function1) {
        if (duration != null) {
            long j = duration.rawValue;
            RepeatTaskExecutor$repeatOnInterval$1$1 repeatTaskExecutor$repeatOnInterval$1$1 = new RepeatTaskExecutor$repeatOnInterval$1$1(state, repeatTaskExecutor, null);
            coroutineScope.getClass();
            JobKt.launch$default(coroutineScope, null, null, new RepeatOnIntervalTaskRunner$repeatOn$2(j, repeatTaskExecutor$repeatOnInterval$1$1, function1, (Continuation) null), 3);
        }
    }

    public static final void access$repeatOnLifecycle(RepeatTaskExecutor repeatTaskExecutor, CoroutineScope coroutineScope, Lifecycle.State state, Function1 function1) {
        if (state != null) {
            RepeatOnLifecycleTaskRunner repeatOnLifecycleTaskRunner = repeatTaskExecutor.repeatOnLifecycleTaskRunner;
            RepeatOnLifecycleTaskRunner$repeatOn$1 repeatOnLifecycleTaskRunner$repeatOn$1 = new RepeatOnLifecycleTaskRunner$repeatOn$1();
            repeatOnLifecycleTaskRunner.getClass();
            coroutineScope.getClass();
            JobKt.launch$default(coroutineScope, null, null, new RepeatOnLifecycleTaskRunner$repeatOn$2(repeatOnLifecycleTaskRunner, state, repeatOnLifecycleTaskRunner$repeatOn$1, function1, null), 3);
        }
    }

    /* renamed from: repeatOn-5EIzBIU, reason: not valid java name */
    public final RepeatTaskExecutor$repeatOn$1 m3998repeatOn5EIzBIU(Duration duration, Lifecycle.State state, SessionState sessionState, Function1 function1) {
        if (duration != null || state != null) {
            return new RepeatTaskExecutor$repeatOn$1(this, sessionState, duration, state, function1);
        }
        a$$ExternalSyntheticBUOutline0.m$3("At least one condition (internal or lifecycleState) must be provided.");
        return null;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 1;
        public final Provider dispatcher;
        public final Provider lifecycle;
        public final Provider scope;
        public final Provider sessionManager;

        public MetroFactory(BreadcrumbListener.MetroFactory metroFactory, BreadcrumbListener.MetroFactory metroFactory2, BreadcrumbListener.MetroFactory metroFactory3, CashNavigationLogger.MetroFactory metroFactory4) {
            this.lifecycle = metroFactory;
            this.sessionManager = metroFactory2;
            this.dispatcher = metroFactory3;
            this.scope = metroFactory4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.dispatcher;
            Provider provider2 = this.scope;
            Provider provider3 = this.sessionManager;
            Provider provider4 = this.lifecycle;
            switch (i) {
                case 0:
                    SessionManager sessionManager = (SessionManager) provider3.invoke();
                    Lifecycle lifecycle = (Lifecycle) ((AndroidToaster.MetroFactory) provider4).invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider2).value;
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    sessionManager.getClass();
                    lifecycle.getClass();
                    coroutineScope.getClass();
                    coroutineContext.getClass();
                    return new RepeatTaskExecutor(sessionManager, lifecycle, coroutineScope, coroutineContext);
                case 1:
                    KeyValue keyValue = (KeyValue) ((BreadcrumbListener.MetroFactory) provider4).invoke();
                    KeyValue keyValue2 = (KeyValue) provider3.invoke();
                    KeyValue keyValue3 = (KeyValue) provider.invoke();
                    KeyValue keyValue4 = (KeyValue) ((CashNavigationLogger.MetroFactory) provider2).invoke();
                    keyValue2.getClass();
                    keyValue3.getClass();
                    return new SupportConversationPersistence(keyValue, keyValue2, keyValue3, keyValue4);
                case 2:
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider3.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    RealNfcPaymentsManager realNfcPaymentsManager = (RealNfcPaymentsManager) ((RealSandboxer.MetroFactory) provider4).invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider2.invoke();
                    realFeatureEligibilityRepository.getClass();
                    featureFlagManager.getClass();
                    syncValueReader.getClass();
                    return new RealTapToPayEligibilityProvider(realFeatureEligibilityRepository, featureFlagManager, realNfcPaymentsManager, syncValueReader);
                default:
                    AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) provider4).lambda.invoke();
                    RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) provider3.invoke();
                    RealPersonNameFormatter realPersonNameFormatter = (RealPersonNameFormatter) ((RealLocaleAssetProvider$MetroFactory) provider2).invoke();
                    ClockInStateResolver clockInStateResolver = (ClockInStateResolver) provider.invoke();
                    androidStringManager.getClass();
                    realShiftTimeFormatter.getClass();
                    clockInStateResolver.getClass();
                    return new ShiftDetailMapper(androidStringManager, realShiftTimeFormatter, realPersonNameFormatter, clockInStateResolver);
            }
        }

        public MetroFactory(LambdaProvider lambdaProvider, ShiftsAnalytics.MetroFactory metroFactory, RealLocaleAssetProvider$MetroFactory realLocaleAssetProvider$MetroFactory, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory) {
            this.lifecycle = lambdaProvider;
            this.sessionManager = metroFactory;
            this.scope = realLocaleAssetProvider$MetroFactory;
            this.dispatcher = realDrawerOpener$MetroFactory;
        }

        public MetroFactory(LambdaProvider lambdaProvider, AndroidToaster.MetroFactory metroFactory, InstanceFactory instanceFactory, LambdaProvider lambdaProvider2) {
            this.sessionManager = lambdaProvider;
            this.lifecycle = metroFactory;
            this.scope = instanceFactory;
            this.dispatcher = lambdaProvider2;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealSandboxer.MetroFactory metroFactory, DoubleCheck doubleCheck3) {
            this.sessionManager = doubleCheck;
            this.dispatcher = doubleCheck2;
            this.lifecycle = metroFactory;
            this.scope = doubleCheck3;
        }
    }
}
