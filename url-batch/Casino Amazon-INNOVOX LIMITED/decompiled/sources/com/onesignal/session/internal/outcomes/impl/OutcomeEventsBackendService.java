package com.onesignal.session.internal.outcomes.impl;

import androidx.core.app.NotificationCompat;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.user.internal.backend.IdentityConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: OutcomeEventsBackendService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J@\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/onesignal/session/internal/outcomes/impl/OutcomeEventsBackendService;", "Lcom/onesignal/session/internal/outcomes/impl/IOutcomeEventsBackendService;", "_http", "Lcom/onesignal/core/internal/http/IHttpClient;", "(Lcom/onesignal/core/internal/http/IHttpClient;)V", "sendOutcomeEvent", "", "appId", "", "userId", "subscriptionId", "deviceType", "direct", "", NotificationCompat.CATEGORY_EVENT, "Lcom/onesignal/session/internal/outcomes/impl/OutcomeEvent;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/onesignal/session/internal/outcomes/impl/OutcomeEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OutcomeEventsBackendService implements IOutcomeEventsBackendService {
    private final IHttpClient _http;

    public OutcomeEventsBackendService(IHttpClient _http) {
        Intrinsics.checkNotNullParameter(_http, "_http");
        this._http = _http;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendOutcomeEvent(String str, String str2, String str3, String str4, Boolean bool, OutcomeEvent outcomeEvent, Continuation<? super Unit> continuation) {
        OutcomeEventsBackendService$sendOutcomeEvent$1 outcomeEventsBackendService$sendOutcomeEvent$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof OutcomeEventsBackendService$sendOutcomeEvent$1) {
            outcomeEventsBackendService$sendOutcomeEvent$1 = (OutcomeEventsBackendService$sendOutcomeEvent$1) continuation;
            if ((outcomeEventsBackendService$sendOutcomeEvent$1.label & Integer.MIN_VALUE) != 0) {
                outcomeEventsBackendService$sendOutcomeEvent$1.label -= Integer.MIN_VALUE;
                Object obj = outcomeEventsBackendService$sendOutcomeEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = outcomeEventsBackendService$sendOutcomeEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject put = new JSONObject().put(CommonUrlParts.APP_ID, str).put(IdentityConstants.ONESIGNAL_ID, str2).put("subscription", new JSONObject().put("id", str3).put(WebViewManager.EVENT_TYPE_KEY, str4));
                    if (bool != null) {
                        put.put("direct", bool.booleanValue());
                    }
                    if (outcomeEvent.getNotificationIds() != null && outcomeEvent.getNotificationIds().length() > 0) {
                        put.put("notification_ids", outcomeEvent.getNotificationIds());
                    }
                    put.put("id", outcomeEvent.getName());
                    if (outcomeEvent.getWeight() > 0.0f) {
                        put.put("weight", Boxing.boxFloat(outcomeEvent.getWeight()));
                    }
                    if (outcomeEvent.getTimestamp() > 0) {
                        put.put("timestamp", outcomeEvent.getTimestamp());
                    }
                    if (outcomeEvent.getSessionTime() > 0) {
                        put.put("session_time", outcomeEvent.getSessionTime());
                    }
                    IHttpClient iHttpClient = this._http;
                    Intrinsics.checkNotNull(put);
                    outcomeEventsBackendService$sendOutcomeEvent$1.label = 1;
                    obj = IHttpClient.DefaultImpls.post$default(iHttpClient, "outcomes/measure", put, null, outcomeEventsBackendService$sendOutcomeEvent$1, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                return Unit.INSTANCE;
            }
        }
        outcomeEventsBackendService$sendOutcomeEvent$1 = new OutcomeEventsBackendService$sendOutcomeEvent$1(this, continuation);
        Object obj2 = outcomeEventsBackendService$sendOutcomeEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = outcomeEventsBackendService$sendOutcomeEvent$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
