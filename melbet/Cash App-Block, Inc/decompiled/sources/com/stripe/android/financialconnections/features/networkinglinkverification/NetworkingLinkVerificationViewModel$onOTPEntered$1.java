package com.stripe.android.financialconnections.features.networkinglinkverification;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.core.util.Matchers;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent$VerificationError$Error;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.MarkLinkVerified;
import com.stripe.android.financialconnections.domain.RealAttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class NetworkingLinkVerificationViewModel$onOTPEntered$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $otp;
    public int I$0;
    public NetworkingLinkVerificationState.Payload L$0;
    public NetworkingLinkVerificationViewModel L$1;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ NetworkingLinkVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkingLinkVerificationViewModel$onOTPEntered$1(NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = networkingLinkVerificationViewModel;
        this.$otp = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new NetworkingLinkVerificationViewModel$onOTPEntered$1(this.this$0, this.$otp, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((NetworkingLinkVerificationViewModel$onOTPEntered$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:2)|(1:(1:(1:(1:(8:8|9|10|11|12|(1:14)(1:(1:19)(3:20|(1:25)|24))|15|16)(2:27|28))(8:29|30|31|11|12|(0)(0)|15|16))(8:32|33|34|35|36|(7:38|31|11|12|(0)(0)|15|16)|39|40))(1:48))(2:60|(1:62)(2:64|65))|49|50|51|(2:53|(1:55)(3:56|36|(0)))(2:57|(7:59|10|11|12|(0)(0)|15|16))|39|40|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
    
        r0 = r11;
        r11 = r10;
        r10 = r0;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0072, code lost:
    
        if (r1.sms(r8, r10.$otp, r10) == r0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v25, types: [com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState$Payload] */
    /* JADX WARN: Type inference failed for: r10v27, types: [com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState$Payload] */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState$Payload] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r11v19, types: [com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState$Payload] */
    /* JADX WARN: Type inference failed for: r11v20, types: [com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState$Payload] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState$Payload] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState$Payload] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        ?? r10;
        CoroutineSingletons coroutineSingletons;
        Throwable m4120exceptionOrNullimpl;
        FinancialConnectionsSessionManifest.Pane pane;
        ?? r11;
        ?? r1;
        int i;
        NetworkingLinkVerificationViewModel$onOTPEntered$1 networkingLinkVerificationViewModel$onOTPEntered$1;
        CoroutineSingletons coroutineSingletons2;
        NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel;
        Object invoke$default;
        NetworkingLinkVerificationViewModel$onOTPEntered$1 networkingLinkVerificationViewModel$onOTPEntered$12;
        CoroutineSingletons coroutineSingletons3;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel2 = this.this$0;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            Object invoke = ((NetworkingLinkVerificationState) networkingLinkVerificationViewModel2.stateFlow.$$delegate_0.getValue()).payload.invoke();
            if (invoke == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            r11 = (NetworkingLinkVerificationState.Payload) invoke;
            ConfirmVerification confirmVerification = networkingLinkVerificationViewModel2.confirmVerification;
            String str = r11.consumerSessionClientSecret;
            this.L$0 = r11;
            this.label = 1;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.I$0;
                    ?? r2 = this.Z$0;
                    NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel3 = this.L$1;
                    ?? r9 = this.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        i = i3;
                        r1 = r2;
                        networkingLinkVerificationViewModel = networkingLinkVerificationViewModel3;
                        r11 = r9;
                        GetOrFetchSync getOrFetchSync = networkingLinkVerificationViewModel.getOrFetchSync;
                        GetOrFetchSync.RefetchCondition.Always always = GetOrFetchSync.RefetchCondition.Always.INSTANCE;
                        this.L$0 = r11;
                        this.L$1 = null;
                        this.Z$0 = r1;
                        this.I$0 = i;
                        this.label = 3;
                        invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, always, this, 2);
                    } catch (Throwable th2) {
                        th = th2;
                        coroutineSingletons4 = r2;
                        this = r9;
                        Result.Companion companion = Result.Companion;
                        failure = new Result.Failure(th);
                        coroutineSingletons = coroutineSingletons4;
                        r10 = this;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (invoke$default != coroutineSingletons4) {
                        NetworkingLinkVerificationViewModel$onOTPEntered$1 networkingLinkVerificationViewModel$onOTPEntered$13 = r11;
                        obj = invoke$default;
                        networkingLinkVerificationViewModel$onOTPEntered$12 = networkingLinkVerificationViewModel$onOTPEntered$13;
                        coroutineSingletons3 = r1;
                        failure = ((SynchronizeSessionResponse) obj).manifest;
                        coroutineSingletons4 = coroutineSingletons3;
                        this = networkingLinkVerificationViewModel$onOTPEntered$12;
                        Result.Companion companion2 = Result.Companion;
                        coroutineSingletons = coroutineSingletons4;
                        r10 = this;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons4;
                }
                if (i2 == 3) {
                    ?? r0 = this.Z$0;
                    ?? r102 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    coroutineSingletons3 = r0;
                    networkingLinkVerificationViewModel$onOTPEntered$12 = r102;
                    failure = ((SynchronizeSessionResponse) obj).manifest;
                    coroutineSingletons4 = coroutineSingletons3;
                    this = networkingLinkVerificationViewModel$onOTPEntered$12;
                    Result.Companion companion22 = Result.Companion;
                    coroutineSingletons = coroutineSingletons4;
                    r10 = this;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                    if (m4120exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ?? r02 = this.Z$0;
                ?? r103 = this.L$0;
                SafeTrace.throwOnFailure(obj);
                coroutineSingletons2 = r02;
                networkingLinkVerificationViewModel$onOTPEntered$1 = r103;
                failure = (FinancialConnectionsSessionManifest) obj;
                coroutineSingletons4 = coroutineSingletons2;
                this = networkingLinkVerificationViewModel$onOTPEntered$1;
                Result.Companion companion222 = Result.Companion;
                coroutineSingletons = coroutineSingletons4;
                r10 = this;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = networkingLinkVerificationViewModel2.analyticsTracker;
                    FinancialConnectionsSessionManifest.Pane pane2 = NetworkingLinkVerificationViewModel.PANE;
                    financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.SearchScroll(pane2));
                    NavigationManagerImpl.tryNavigateTo$default(networkingLinkVerificationViewModel2.navigationManager, Destination.invoke$default(Destination.LinkAccountPicker.INSTANCE, pane2), null, 6);
                } else if (coroutineSingletons != null) {
                    networkingLinkVerificationViewModel2.handleError.invoke("Error attaching consumer to LAS or synchronizing afterwards", m4120exceptionOrNullimpl, NetworkingLinkVerificationViewModel.PANE, true);
                } else {
                    FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl2 = networkingLinkVerificationViewModel2.analyticsTracker;
                    Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = networkingLinkVerificationViewModel2.logger;
                    FinancialConnectionsSessionManifest.Pane pane3 = NetworkingLinkVerificationViewModel.PANE;
                    Matchers.logError(financialConnectionsAnalyticsTrackerImpl2, "Error confirming verification or marking link as verified", m4120exceptionOrNullimpl, logger$Companion$NOOP_LOGGER$1, pane3);
                    if (r10.initialInstitution == null || (pane = FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH) == null) {
                        pane = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
                    }
                    networkingLinkVerificationViewModel2.analyticsTracker.track(new FinancialConnectionsAnalyticsEvent.SearchScroll(pane3, FinancialConnectionsAnalyticsEvent$VerificationError$Error.MarkLinkVerifiedError));
                    NavigationManagerImpl.tryNavigateTo$default(networkingLinkVerificationViewModel2.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane), pane3), null, 6);
                }
                return Unit.INSTANCE;
            }
            NetworkingLinkVerificationState.Payload payload = this.L$0;
            SafeTrace.throwOnFailure(obj);
            r11 = payload;
        }
        r1 = networkingLinkVerificationViewModel2.isLinkWithStripe.initialState.isLinkWithStripe;
        Result.Companion companion3 = Result.Companion;
        i = 0;
        if (r1 == true) {
            RealAttachConsumerToLinkAccountSession realAttachConsumerToLinkAccountSession = networkingLinkVerificationViewModel2.attachConsumerToLinkAccountSession;
            String str2 = r11.consumerSessionClientSecret;
            this.L$0 = r11;
            this.L$1 = networkingLinkVerificationViewModel2;
            this.Z$0 = r1;
            this.I$0 = 0;
            this.label = 2;
            if (realAttachConsumerToLinkAccountSession.invoke(str2, this) != coroutineSingletons4) {
                networkingLinkVerificationViewModel = networkingLinkVerificationViewModel2;
                GetOrFetchSync getOrFetchSync2 = networkingLinkVerificationViewModel.getOrFetchSync;
                GetOrFetchSync.RefetchCondition.Always always2 = GetOrFetchSync.RefetchCondition.Always.INSTANCE;
                this.L$0 = r11;
                this.L$1 = null;
                this.Z$0 = r1;
                this.I$0 = i;
                this.label = 3;
                invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync2, always2, this, 2);
                if (invoke$default != coroutineSingletons4) {
                }
            }
        } else {
            MarkLinkVerified markLinkVerified = networkingLinkVerificationViewModel2.markLinkVerified;
            this.L$0 = r11;
            this.L$1 = null;
            this.Z$0 = r1;
            this.I$0 = 0;
            this.label = 4;
            Object postMarkLinkVerified = markLinkVerified.repository.postMarkLinkVerified(markLinkVerified.configuration.financialConnectionsSessionClientSecret, this);
            if (postMarkLinkVerified != coroutineSingletons4) {
                NetworkingLinkVerificationViewModel$onOTPEntered$1 networkingLinkVerificationViewModel$onOTPEntered$14 = r11;
                obj = postMarkLinkVerified;
                networkingLinkVerificationViewModel$onOTPEntered$1 = networkingLinkVerificationViewModel$onOTPEntered$14;
                coroutineSingletons2 = r1;
                failure = (FinancialConnectionsSessionManifest) obj;
                coroutineSingletons4 = coroutineSingletons2;
                this = networkingLinkVerificationViewModel$onOTPEntered$1;
                Result.Companion companion2222 = Result.Companion;
                coroutineSingletons = coroutineSingletons4;
                r10 = this;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
        }
        return coroutineSingletons4;
    }
}
