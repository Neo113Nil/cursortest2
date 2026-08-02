package com.squareup.cash.task;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.backend.BoostConfigManager;
import com.squareup.cash.boost.backend.RealBoostConfigManager;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.data.profile.RealCustomerLimitsManager;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$UpdateAppConfigOnOnboardingStateOnly;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigSyncer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RepeatTaskAggregator$start$2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RepeatTaskAggregator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepeatTaskAggregator$start$2(RepeatTaskAggregator repeatTaskAggregator, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = repeatTaskAggregator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        RepeatTaskAggregator repeatTaskAggregator = this.this$0;
        switch (i) {
            case 0:
                return new RepeatTaskAggregator$start$2(repeatTaskAggregator, continuation, 0);
            case 1:
                return new RepeatTaskAggregator$start$2(repeatTaskAggregator, continuation, 1);
            case 2:
                return new RepeatTaskAggregator$start$2(repeatTaskAggregator, continuation, 2);
            case 3:
                return new RepeatTaskAggregator$start$2(repeatTaskAggregator, continuation, 3);
            case 4:
                return new RepeatTaskAggregator$start$2(repeatTaskAggregator, continuation, 4);
            case 5:
                return new RepeatTaskAggregator$start$2(repeatTaskAggregator, continuation, 5);
            default:
                return new RepeatTaskAggregator$start$2(repeatTaskAggregator, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((RepeatTaskAggregator$start$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object update;
        Object update2;
        int i = this.$r8$classId;
        RepeatTaskAggregator repeatTaskAggregator = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealTreehouseConfigSyncer realTreehouseConfigSyncer = repeatTaskAggregator.treehouseConfigSyncer;
                    this.label = 1;
                    if (realTreehouseConfigSyncer.sync(this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BoostConfigManager boostConfigManager = repeatTaskAggregator.boostConfigManager;
                    this.label = 1;
                    RealBoostConfigManager realBoostConfigManager = (RealBoostConfigManager) boostConfigManager;
                    if (JobKt.withContext(realBoostConfigManager.ioDispatcher, new CardModelView.AnonymousClass1.C00581(realBoostConfigManager, null, 13), this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CustomerLimitsManager customerLimitsManager = repeatTaskAggregator.customerLimitsManager;
                    this.label = 1;
                    RealCustomerLimitsManager realCustomerLimitsManager = (RealCustomerLimitsManager) customerLimitsManager;
                    Object withContext = JobKt.withContext(realCustomerLimitsManager.ioDispatcher, new GooglePayPresenter$models$1$1(realCustomerLimitsManager, null, 2), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealReferralManager realReferralManager = repeatTaskAggregator.referralManager;
                    this.label = 1;
                    if (realReferralManager.refresh(false, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileSyncer realProfileSyncer = repeatTaskAggregator.profileSyncer;
                    this.label = 1;
                    if (realProfileSyncer.refresh(false, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) repeatTaskAggregator.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$UpdateAppConfigOnOnboardingStateOnly.INSTANCE)).enabled()) {
                        AppConfigManager appConfigManager = repeatTaskAggregator.appConfig;
                        this.label = 1;
                        update = ((RealAppConfigManager) appConfigManager).update(false, this);
                        if (update == coroutineSingletons5) {
                            break;
                        }
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = (FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) repeatTaskAggregator.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$UpdateAppConfigOnOnboardingStateOnly.INSTANCE);
                    featureFlag$EnabledDisabledFeatureFlag$Options.getClass();
                    if (featureFlag$EnabledDisabledFeatureFlag$Options == FeatureFlag$EnabledDisabledFeatureFlag$Options.Disabled) {
                        AppConfigManager appConfigManager2 = repeatTaskAggregator.appConfig;
                        this.label = 1;
                        update2 = ((RealAppConfigManager) appConfigManager2).update(false, this);
                        if (update2 == coroutineSingletons6) {
                            break;
                        }
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
