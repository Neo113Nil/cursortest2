package com.stripe.android.challenge.confirmation;

import android.webkit.JavascriptInterface;
import com.datadog.android.trace.model.SpanEvent;
import com.stripe.android.challenge.confirmation.ConfirmationChallengeBridgeEvent;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.core.analytics.ErrorReporter$UnexpectedErrorEvent;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import kotlin.Result;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import net.idrnd.face.iad.capture.internal.y0;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class DefaultConfirmationChallengeBridgeHandler implements ConfirmationChallengeBridgeHandler {
    public final SharedFlowImpl _event;
    public final IntentConfirmationChallengeArgs args;
    public final y0 errorParamsParser;
    public final RealErrorReporter errorReporter;
    public final SharedFlowImpl event;
    public final KClasses$$Lambda$1 successParamsParser;

    public DefaultConfirmationChallengeBridgeHandler(KClasses$$Lambda$1 kClasses$$Lambda$1, y0 y0Var, IntentConfirmationChallengeArgs intentConfirmationChallengeArgs, RealErrorReporter realErrorReporter) {
        this.successParamsParser = kClasses$$Lambda$1;
        this.errorParamsParser = y0Var;
        this.args = intentConfirmationChallengeArgs;
        this.errorReporter = realErrorReporter;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
        this._event = MutableSharedFlow$default;
        this.event = MutableSharedFlow$default;
    }

    @Override // com.stripe.android.challenge.confirmation.ConfirmationChallengeBridgeHandler
    @JavascriptInterface
    public String getInitParams() {
        JSONObject jSONObject = new JSONObject();
        IntentConfirmationChallengeArgs intentConfirmationChallengeArgs = this.args;
        jSONObject.put("publishableKey", intentConfirmationChallengeArgs.publishableKey);
        jSONObject.put("clientSecret", intentConfirmationChallengeArgs.intent.getClientSecret());
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    @Override // com.stripe.android.challenge.confirmation.ConfirmationChallengeBridgeHandler
    @JavascriptInterface
    public void onError(String str) {
        Object failure;
        SharedFlowImpl sharedFlowImpl = this._event;
        str.getClass();
        try {
            Result.Companion companion = Result.Companion;
            BridgeErrorParams bridgeErrorParams = (BridgeErrorParams) this.errorParamsParser.mo4026parse(new JSONObject(str));
            failure = Boolean.valueOf(sharedFlowImpl.tryEmit(new ConfirmationChallengeBridgeEvent.Error(new BridgeException(bridgeErrorParams.message, bridgeErrorParams.f1426type, bridgeErrorParams.code, null))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            ErrorReporter$UnexpectedErrorEvent errorReporter$UnexpectedErrorEvent = ErrorReporter$UnexpectedErrorEvent.INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_ERROR_CALLBACK_PARAMS;
            int i = StripeException.$r8$clinit;
            RealErrorReporter.report$default(this.errorReporter, errorReporter$UnexpectedErrorEvent, SpanEvent.Account.create(m4120exceptionOrNullimpl), null, 4);
            sharedFlowImpl.tryEmit(new ConfirmationChallengeBridgeEvent.Error(new BridgeException(m4120exceptionOrNullimpl)));
        }
    }

    @Override // com.stripe.android.challenge.confirmation.ConfirmationChallengeBridgeHandler
    @JavascriptInterface
    public void onReady() {
        this._event.tryEmit(ConfirmationChallengeBridgeEvent.Ready.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // com.stripe.android.challenge.confirmation.ConfirmationChallengeBridgeHandler
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSuccess(String str) {
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        BridgeSuccessParams bridgeSuccessParams;
        String clientSecret;
        SharedFlowImpl sharedFlowImpl = this._event;
        str.getClass();
        try {
            Result.Companion companion = Result.Companion;
            bridgeSuccessParams = (BridgeSuccessParams) this.successParamsParser.mo4026parse(new JSONObject(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (bridgeSuccessParams != null) {
            clientSecret = bridgeSuccessParams.clientSecret;
            if (clientSecret == null) {
            }
            failure = Boolean.valueOf(sharedFlowImpl.tryEmit(new ConfirmationChallengeBridgeEvent.Success(clientSecret)));
            m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
            if (m4120exceptionOrNullimpl == null) {
                ErrorReporter$UnexpectedErrorEvent errorReporter$UnexpectedErrorEvent = ErrorReporter$UnexpectedErrorEvent.INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_SUCCESS_CALLBACK_PARAMS;
                int i = StripeException.$r8$clinit;
                RealErrorReporter.report$default(this.errorReporter, errorReporter$UnexpectedErrorEvent, SpanEvent.Account.create(m4120exceptionOrNullimpl), null, 4);
                sharedFlowImpl.tryEmit(new ConfirmationChallengeBridgeEvent.Error(new BridgeException(m4120exceptionOrNullimpl)));
                return;
            }
            return;
        }
        clientSecret = this.args.intent.getClientSecret();
        if (clientSecret == null) {
            throw new IllegalArgumentException("Missing client secret");
        }
        failure = Boolean.valueOf(sharedFlowImpl.tryEmit(new ConfirmationChallengeBridgeEvent.Success(clientSecret)));
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl == null) {
        }
    }
}
