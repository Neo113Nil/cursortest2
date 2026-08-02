package com.squareup.cash.ui.gcm;

import android.app.Application;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.push.BrazeFirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.braze.BrazeConfigurator;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.cdf.braze.BrazeNotificationDisplay;
import com.squareup.cash.cdf.braze.BrazeNotificationReceive;
import com.squareup.cash.featureflags.AmplitudeExperiments$BrazeSdkSetup;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class PushMessagingService extends SuspendingFirebaseMessagingService {
    public static final boolean access$tryHandleBrazePush(PushMessagingService pushMessagingService, RemoteMessage remoteMessage, VariantSandboxedComponent variantSandboxedComponent) {
        BrazeFirebaseMessagingService.Companion companion = BrazeFirebaseMessagingService.INSTANCE;
        if (!companion.isBrazePushNotification(remoteMessage)) {
            return false;
        }
        VariantSandboxedComponent.Impl impl = (VariantSandboxedComponent.Impl) variantSandboxedComponent;
        ((Analytics) impl.provideAnalyticsProvider.getValue()).track(new BrazeNotificationReceive(), null);
        if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) impl.realFeatureFlagManagerProvider.getValue())).currentValue(AmplitudeExperiments$BrazeSdkSetup.INSTANCE)).enabled()) {
            return true;
        }
        ((RealBrazeConfigurator) ((BrazeConfigurator) impl.realBrazeConfiguratorProvider.getValue())).configure();
        companion.handleBrazeRemoteMessage(pushMessagingService, remoteMessage);
        ((Analytics) impl.provideAnalyticsProvider.getValue()).track(new BrazeNotificationDisplay(), null);
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.squareup.cash.ui.gcm.SuspendingFirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onMessageReceivedSuspend(RemoteMessage remoteMessage, Continuation continuation) {
        PushMessagingService$onMessageReceivedSuspend$1 pushMessagingService$onMessageReceivedSuspend$1;
        int i;
        if (continuation instanceof PushMessagingService$onMessageReceivedSuspend$1) {
            pushMessagingService$onMessageReceivedSuspend$1 = (PushMessagingService$onMessageReceivedSuspend$1) continuation;
            int i2 = pushMessagingService$onMessageReceivedSuspend$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pushMessagingService$onMessageReceivedSuspend$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pushMessagingService$onMessageReceivedSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushMessagingService$onMessageReceivedSuspend$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Application application = getApplication();
                    application.getClass();
                    HeroCardViewKt$Render$1$4$1.AnonymousClass2 anonymousClass2 = new HeroCardViewKt$Render$1$4$1.AnonymousClass2(application, (Continuation) null, remoteMessage, this);
                    pushMessagingService$onMessageReceivedSuspend$1.label = 1;
                    if (JobKt.coroutineScope(anonymousClass2, pushMessagingService$onMessageReceivedSuspend$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        pushMessagingService$onMessageReceivedSuspend$1 = new PushMessagingService$onMessageReceivedSuspend$1(this, (ContinuationImpl) continuation);
        Object obj2 = pushMessagingService$onMessageReceivedSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushMessagingService$onMessageReceivedSuspend$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
