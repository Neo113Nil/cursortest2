package com.stripe.android.stripe3ds2.transaction;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import net.idrnd.face.iad.capture.internal.y0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class DefaultTransactionTimer {
    public final ChallengeRequestData creqData;
    public final StripeErrorRequestExecutor errorRequestExecutor;
    public final StateFlowImpl mutableTimeoutFlow;
    public final StateFlowImpl timeout;
    public final long timeoutMillis;

    public DefaultTransactionTimer(int i, StripeErrorRequestExecutor stripeErrorRequestExecutor, ChallengeRequestData challengeRequestData) {
        stripeErrorRequestExecutor.getClass();
        challengeRequestData.getClass();
        this.errorRequestExecutor = stripeErrorRequestExecutor;
        this.creqData = challengeRequestData;
        this.timeoutMillis = TimeUnit.MINUTES.toMillis(i);
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        this.mutableTimeoutFlow = MutableStateFlow;
        this.timeout = MutableStateFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object start(ContinuationImpl continuationImpl) {
        DefaultTransactionTimer$start$1 defaultTransactionTimer$start$1;
        int i;
        if (continuationImpl instanceof DefaultTransactionTimer$start$1) {
            defaultTransactionTimer$start$1 = (DefaultTransactionTimer$start$1) continuationImpl;
            int i2 = defaultTransactionTimer$start$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultTransactionTimer$start$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = defaultTransactionTimer$start$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultTransactionTimer$start$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    defaultTransactionTimer$start$1.label = 1;
                    if (JobKt.delay(this.timeoutMillis, defaultTransactionTimer$start$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ChallengeRequestData challengeRequestData = this.creqData;
                String str = challengeRequestData.threeDsServerTransId;
                String str2 = challengeRequestData.acsTransId;
                ProtocolError[] protocolErrorArr = ProtocolError.$VALUES;
                String valueOf = String.valueOf(402);
                y0 y0Var = ErrorData.ErrorComponent.Companion;
                this.errorRequestExecutor.executeAsync(new ErrorData(str, str2, valueOf, "Transaction timed-out.", "Timeout expiry reached for the transaction", null, challengeRequestData.messageVersion, challengeRequestData.sdkTransId, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                Boolean bool = Boolean.TRUE;
                StateFlowImpl stateFlowImpl = this.mutableTimeoutFlow;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, bool);
                return Unit.INSTANCE;
            }
        }
        defaultTransactionTimer$start$1 = new DefaultTransactionTimer$start$1(this, continuationImpl);
        Object obj2 = defaultTransactionTimer$start$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultTransactionTimer$start$1.label;
        if (i != 0) {
        }
        ChallengeRequestData challengeRequestData2 = this.creqData;
        String str3 = challengeRequestData2.threeDsServerTransId;
        String str22 = challengeRequestData2.acsTransId;
        ProtocolError[] protocolErrorArr2 = ProtocolError.$VALUES;
        String valueOf2 = String.valueOf(402);
        y0 y0Var2 = ErrorData.ErrorComponent.Companion;
        this.errorRequestExecutor.executeAsync(new ErrorData(str3, str22, valueOf2, "Transaction timed-out.", "Timeout expiry reached for the transaction", null, challengeRequestData2.messageVersion, challengeRequestData2.sdkTransId, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
        Boolean bool2 = Boolean.TRUE;
        StateFlowImpl stateFlowImpl2 = this.mutableTimeoutFlow;
        stateFlowImpl2.getClass();
        stateFlowImpl2.updateState(null, bool2);
        return Unit.INSTANCE;
    }
}
