package com.onesignal.user.internal.customEvents.impl;

import com.onesignal.common.DateUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.customEvents.ICustomEventBackendService;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CustomEventBackendService.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JT\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/onesignal/user/internal/customEvents/impl/CustomEventBackendService;", "Lcom/onesignal/user/internal/customEvents/ICustomEventBackendService;", "httpClient", "Lcom/onesignal/core/internal/http/IHttpClient;", "(Lcom/onesignal/core/internal/http/IHttpClient;)V", "sendCustomEvent", "Lcom/onesignal/core/internal/operations/ExecutionResponse;", "appId", "", "onesignalId", "externalId", "timestamp", "", "eventName", "eventProperties", "metadata", "Lcom/onesignal/user/internal/customEvents/impl/CustomEventMetadata;", "jwt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/onesignal/user/internal/customEvents/impl/CustomEventMetadata;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomEventBackendService implements ICustomEventBackendService {
    private final IHttpClient httpClient;

    public CustomEventBackendService(IHttpClient httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.onesignal.user.internal.customEvents.ICustomEventBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendCustomEvent(String str, String str2, String str3, long j, String str4, String str5, CustomEventMetadata customEventMetadata, String str6, Continuation<? super ExecutionResponse> continuation) {
        CustomEventBackendService$sendCustomEvent$1 customEventBackendService$sendCustomEvent$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof CustomEventBackendService$sendCustomEvent$1) {
            customEventBackendService$sendCustomEvent$1 = (CustomEventBackendService$sendCustomEvent$1) continuation;
            if ((customEventBackendService$sendCustomEvent$1.label & Integer.MIN_VALUE) != 0) {
                customEventBackendService$sendCustomEvent$1.label -= Integer.MIN_VALUE;
                Object obj = customEventBackendService$sendCustomEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customEventBackendService$sendCustomEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", str4);
                    jSONObject.put(IdentityConstants.ONESIGNAL_ID, str2);
                    if (str3 != null) {
                        jSONObject.put(IdentityConstants.EXTERNAL_ID, str3);
                    }
                    SimpleDateFormat iso8601Format = DateUtils.INSTANCE.iso8601Format();
                    iso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
                    Unit unit = Unit.INSTANCE;
                    jSONObject.put("timestamp", iso8601Format.format(Boxing.boxLong(j)));
                    JSONObject jSONObject2 = str5 != null ? new JSONObject(str5) : new JSONObject();
                    jSONObject2.put("os_sdk", customEventMetadata.toJSONObject());
                    jSONObject.put("payload", jSONObject2);
                    JSONObject put = new JSONObject().put("events", new JSONArray().put(jSONObject));
                    Intrinsics.checkNotNull(put);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str6, 15, null);
                    customEventBackendService$sendCustomEvent$1.label = 1;
                    obj = this.httpClient.post("apps/" + str + "/custom_events", put, optionalHeaders, customEventBackendService$sendCustomEvent$1);
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
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
            }
        }
        customEventBackendService$sendCustomEvent$1 = new CustomEventBackendService$sendCustomEvent$1(this, continuation);
        Object obj2 = customEventBackendService$sendCustomEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customEventBackendService$sendCustomEvent$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
