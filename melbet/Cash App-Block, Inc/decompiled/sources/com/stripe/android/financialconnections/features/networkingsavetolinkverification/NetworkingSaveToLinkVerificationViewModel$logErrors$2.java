package com.stripe.android.financialconnections.features.networkingsavetolinkverification;

import androidx.lifecycle.ViewModelKt;
import com.datadog.trace.core.util.Matchers;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class NetworkingSaveToLinkVerificationViewModel$logErrors$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ NetworkingSaveToLinkVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkingSaveToLinkVerificationViewModel$logErrors$2(NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = networkingSaveToLinkVerificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel = this.this$0;
        switch (i) {
            case 0:
                NetworkingSaveToLinkVerificationViewModel$logErrors$2 networkingSaveToLinkVerificationViewModel$logErrors$2 = new NetworkingSaveToLinkVerificationViewModel$logErrors$2(networkingSaveToLinkVerificationViewModel, continuation, 0);
                networkingSaveToLinkVerificationViewModel$logErrors$2.L$0 = obj;
                return networkingSaveToLinkVerificationViewModel$logErrors$2;
            case 1:
                NetworkingSaveToLinkVerificationViewModel$logErrors$2 networkingSaveToLinkVerificationViewModel$logErrors$22 = new NetworkingSaveToLinkVerificationViewModel$logErrors$2(networkingSaveToLinkVerificationViewModel, continuation, 1);
                networkingSaveToLinkVerificationViewModel$logErrors$22.L$0 = obj;
                return networkingSaveToLinkVerificationViewModel$logErrors$22;
            case 2:
                NetworkingSaveToLinkVerificationViewModel$logErrors$2 networkingSaveToLinkVerificationViewModel$logErrors$23 = new NetworkingSaveToLinkVerificationViewModel$logErrors$2(networkingSaveToLinkVerificationViewModel, continuation, 2);
                networkingSaveToLinkVerificationViewModel$logErrors$23.L$0 = obj;
                return networkingSaveToLinkVerificationViewModel$logErrors$23;
            default:
                NetworkingSaveToLinkVerificationViewModel$logErrors$2 networkingSaveToLinkVerificationViewModel$logErrors$24 = new NetworkingSaveToLinkVerificationViewModel$logErrors$2(networkingSaveToLinkVerificationViewModel, continuation, 3);
                networkingSaveToLinkVerificationViewModel$logErrors$24.L$0 = obj;
                return networkingSaveToLinkVerificationViewModel$logErrors$24;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((NetworkingSaveToLinkVerificationViewModel$logErrors$2) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Continuation continuation = null;
        NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel = this.this$0;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(ViewModelKt.getViewModelScope(networkingSaveToLinkVerificationViewModel), null, null, new ShimmerModifierKt$shimmer$1$1((NetworkingSaveToLinkVerificationState.Payload) obj2, networkingSaveToLinkVerificationViewModel, continuation, 5), 3);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FinancialConnectionsSessionManifest.Pane pane = NetworkingSaveToLinkVerificationViewModel.PANE;
                FinancialConnectionsViewModel.execute$default(networkingSaveToLinkVerificationViewModel, new NetworkingSaveToLinkVerificationViewModel$onOTPEntered$1(networkingSaveToLinkVerificationViewModel, (String) obj2, null), new PhoneNumberController$$ExternalSyntheticLambda5(10));
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Matchers.logError(networkingSaveToLinkVerificationViewModel.eventTracker, "Error fetching payload", (Throwable) obj2, networkingSaveToLinkVerificationViewModel.logger, NetworkingSaveToLinkVerificationViewModel.PANE);
                break;
            default:
                Throwable th = (Throwable) obj2;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = networkingSaveToLinkVerificationViewModel.eventTracker;
                Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = networkingSaveToLinkVerificationViewModel.logger;
                FinancialConnectionsSessionManifest.Pane pane2 = NetworkingSaveToLinkVerificationViewModel.PANE;
                Matchers.logError(financialConnectionsAnalyticsTrackerImpl, "Error confirming verification", th, logger$Companion$NOOP_LOGGER$1, pane2);
                if (!(th instanceof ConfirmVerification.OTPError)) {
                    NavigationManagerImpl.tryNavigateTo$default(networkingSaveToLinkVerificationViewModel.navigationManager, Destination.invoke$default(Destination.Success.INSTANCE, pane2), null, 6);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
