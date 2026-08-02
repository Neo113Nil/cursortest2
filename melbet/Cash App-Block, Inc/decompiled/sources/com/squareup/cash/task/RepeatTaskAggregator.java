package com.squareup.cash.task;

import androidx.lifecycle.Lifecycle;
import com.squareup.cash.boost.backend.BoostConfigManager;
import com.squareup.cash.boost.backend.BoostSyncer;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ClientsyncBackgroundPollingEnabled;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigSyncer;
import com.squareup.cash.ui.gcm.RealGcmRegistrar;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import com.squareup.util.task.RepeatTask;
import com.squareup.util.task.RepeatTaskExecutor;
import com.squareup.util.task.RepeatTaskExecutor$repeatOn$1;
import com.squareup.util.task.RepeatTaskExecutor$repeatOn$1$start$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RepeatTaskAggregator implements IoActivitySetupTeardown {
    public final AppConfigManager appConfig;
    public final BoostConfigManager boostConfigManager;
    public final BoostSyncer boostSyncer;
    public final RealClientSyncer clientSyncer;
    public final CustomerLimitsManager customerLimitsManager;
    public final FeatureFlagManager featureFlagManager;
    public final RealGcmRegistrar gcmRegistrar;
    public final RepeatTask investingLiveIntervalRepeatTask;
    public final RepeatTask investingSyncerRepeatTask;
    public final RealProfileSyncer profileSyncer;
    public final RealReferralManager referralManager;
    public final RepeatTaskExecutor repeatTaskExecutor;
    public final ArrayList tasks = new ArrayList();
    public final RepeatTask taxRepeatTask;
    public final RealTreehouseConfigSyncer treehouseConfigSyncer;

    public RepeatTaskAggregator(RepeatTaskExecutor repeatTaskExecutor, RealClientSyncer realClientSyncer, RealTreehouseConfigSyncer realTreehouseConfigSyncer, BoostConfigManager boostConfigManager, BoostSyncer boostSyncer, CustomerLimitsManager customerLimitsManager, RealReferralManager realReferralManager, RealProfileSyncer realProfileSyncer, AppConfigManager appConfigManager, RealGcmRegistrar realGcmRegistrar, FeatureFlagManager featureFlagManager, RepeatTask repeatTask, RepeatTask repeatTask2, RepeatTask repeatTask3) {
        this.repeatTaskExecutor = repeatTaskExecutor;
        this.clientSyncer = realClientSyncer;
        this.treehouseConfigSyncer = realTreehouseConfigSyncer;
        this.boostConfigManager = boostConfigManager;
        this.boostSyncer = boostSyncer;
        this.customerLimitsManager = customerLimitsManager;
        this.referralManager = realReferralManager;
        this.profileSyncer = realProfileSyncer;
        this.appConfig = appConfigManager;
        this.gcmRegistrar = realGcmRegistrar;
        this.featureFlagManager = featureFlagManager;
        this.investingSyncerRepeatTask = repeatTask;
        this.investingLiveIntervalRepeatTask = repeatTask2;
        this.taxRepeatTask = repeatTask3;
    }

    public static void run(RepeatTask repeatTask) {
        RepeatTaskExecutor$repeatOn$1 repeatTaskExecutor$repeatOn$1 = (RepeatTaskExecutor$repeatOn$1) repeatTask;
        RepeatTaskExecutor repeatTaskExecutor = repeatTaskExecutor$repeatOn$1.this$0;
        repeatTaskExecutor$repeatOn$1.job = JobKt.launch$default(repeatTaskExecutor.scope, repeatTaskExecutor.dispatcher, null, new RepeatTaskExecutor$repeatOn$1$start$1(repeatTaskExecutor$repeatOn$1.$sessionState, repeatTaskExecutor, repeatTaskExecutor$repeatOn$1.$interval, repeatTaskExecutor$repeatOn$1.$lifecycleState, repeatTaskExecutor$repeatOn$1.$action, null), 2);
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.MINUTES;
        int i = 1;
        Duration duration = new Duration(DurationKt.toDuration(1, durationUnit));
        Continuation continuation = null;
        Lifecycle.State state = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ClientsyncBackgroundPollingEnabled.INSTANCE)).enabled() ? null : Lifecycle.State.RESUMED;
        RepeatTaskExecutor.SessionState sessionState = RepeatTaskExecutor.SessionState.AUTHENTICATED;
        int i2 = 0;
        RepeatTaskAggregator$start$1 repeatTaskAggregator$start$1 = new RepeatTaskAggregator$start$1(this, continuation, i2);
        RepeatTaskExecutor repeatTaskExecutor = this.repeatTaskExecutor;
        RepeatTaskExecutor$repeatOn$1 m3998repeatOn5EIzBIU = repeatTaskExecutor.m3998repeatOn5EIzBIU(duration, state, sessionState, repeatTaskAggregator$start$1);
        run(m3998repeatOn5EIzBIU);
        RepeatTaskExecutor$repeatOn$1 m3998repeatOn5EIzBIU2 = repeatTaskExecutor.m3998repeatOn5EIzBIU(null, Lifecycle.State.CREATED, sessionState, new RepeatTaskAggregator$start$2(this, continuation, i2));
        run(m3998repeatOn5EIzBIU2);
        BoostConfigManager.Companion.getClass();
        Duration duration2 = new Duration(BoostConfigManager.Companion.TTL);
        Lifecycle.State state2 = Lifecycle.State.RESUMED;
        RepeatTaskExecutor$repeatOn$1 m3998repeatOn5EIzBIU3 = repeatTaskExecutor.m3998repeatOn5EIzBIU(duration2, state2, sessionState, new RepeatTaskAggregator$start$2(this, continuation, i));
        run(m3998repeatOn5EIzBIU3);
        BoostSyncer.Companion.getClass();
        int i3 = 2;
        RepeatTaskExecutor$repeatOn$1 m3998repeatOn5EIzBIU4 = repeatTaskExecutor.m3998repeatOn5EIzBIU(new Duration(BoostSyncer.Companion.TTL), state2, sessionState, new RepeatTaskAggregator$start$1(this, continuation, i3));
        run(m3998repeatOn5EIzBIU4);
        CustomerLimitsManager.Companion.getClass();
        RepeatTaskExecutor$repeatOn$1 m3998repeatOn5EIzBIU5 = repeatTaskExecutor.m3998repeatOn5EIzBIU(new Duration(CustomerLimitsManager.Companion.EXPIRATION_TIME), state2, sessionState, new RepeatTaskAggregator$start$2(this, continuation, i3));
        run(m3998repeatOn5EIzBIU5);
        RepeatTaskExecutor$repeatOn$1 m3998repeatOn5EIzBIU6 = repeatTaskExecutor.m3998repeatOn5EIzBIU(new Duration(DurationKt.toDuration(5, durationUnit)), state2, sessionState, new RepeatTaskAggregator$start$2(this, continuation, 3));
        run(m3998repeatOn5EIzBIU6);
        RepeatTaskExecutor$repeatOn$1 m3998repeatOn5EIzBIU7 = repeatTaskExecutor.m3998repeatOn5EIzBIU(new Duration(DurationKt.toDuration(3, durationUnit)), state2, sessionState, new RepeatTaskAggregator$start$2(this, continuation, 4));
        run(m3998repeatOn5EIzBIU7);
        AppConfigManager.Companion.getClass();
        long j = AppConfigManager.Companion.TTL;
        RepeatTaskExecutor$repeatOn$1 m3998repeatOn5EIzBIU8 = repeatTaskExecutor.m3998repeatOn5EIzBIU(new Duration(j), state2, RepeatTaskExecutor.SessionState.ONBOARDED, new RepeatTaskAggregator$start$2(this, continuation, 5));
        run(m3998repeatOn5EIzBIU8);
        RepeatTaskExecutor$repeatOn$1 m3998repeatOn5EIzBIU9 = repeatTaskExecutor.m3998repeatOn5EIzBIU(new Duration(j), state2, sessionState, new RepeatTaskAggregator$start$2(this, continuation, 6));
        run(m3998repeatOn5EIzBIU9);
        RepeatTaskExecutor$repeatOn$1 m3998repeatOn5EIzBIU10 = repeatTaskExecutor.m3998repeatOn5EIzBIU(null, state2, sessionState, new RepeatTaskAggregator$start$1(this, continuation, 1));
        run(m3998repeatOn5EIzBIU10);
        RepeatTask repeatTask = this.investingSyncerRepeatTask;
        run(repeatTask);
        RepeatTask repeatTask2 = this.investingLiveIntervalRepeatTask;
        run(repeatTask2);
        RepeatTask repeatTask3 = this.taxRepeatTask;
        run(repeatTask3);
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new RepeatTask[]{m3998repeatOn5EIzBIU, m3998repeatOn5EIzBIU2, m3998repeatOn5EIzBIU3, m3998repeatOn5EIzBIU4, m3998repeatOn5EIzBIU5, m3998repeatOn5EIzBIU6, m3998repeatOn5EIzBIU7, m3998repeatOn5EIzBIU8, m3998repeatOn5EIzBIU9, m3998repeatOn5EIzBIU10, repeatTask, repeatTask2, repeatTask3});
        ArrayList arrayList = this.tasks;
        arrayList.addAll(listOf);
        return new RepeatTaskAggregator$$ExternalSyntheticLambda0(this, arrayList);
    }
}
