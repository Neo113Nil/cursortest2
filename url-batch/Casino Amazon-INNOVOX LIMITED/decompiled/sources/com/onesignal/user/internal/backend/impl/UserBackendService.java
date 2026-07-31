package com.onesignal.user.internal.backend.impl;

import com.android.billingclient.api.BillingClient;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.user.internal.backend.CreateUserResponse;
import com.onesignal.user.internal.backend.IUserBackendService;
import com.onesignal.user.internal.backend.PropertiesDeltasObject;
import com.onesignal.user.internal.backend.PropertiesObject;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: UserBackendService.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JV\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\u0010J0\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\u0014JJ\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/onesignal/user/internal/backend/impl/UserBackendService;", "Lcom/onesignal/user/internal/backend/IUserBackendService;", "_httpClient", "Lcom/onesignal/core/internal/http/IHttpClient;", "(Lcom/onesignal/core/internal/http/IHttpClient;)V", "createUser", "Lcom/onesignal/user/internal/backend/CreateUserResponse;", "appId", "", "identities", "", BillingClient.FeatureType.SUBSCRIPTIONS, "", "Lcom/onesignal/user/internal/backend/SubscriptionObject;", "properties", "jwt", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "aliasLabel", "aliasValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "Lcom/onesignal/common/consistency/RywData;", "Lcom/onesignal/user/internal/backend/PropertiesObject;", "refreshDeviceMetadata", "", "propertyiesDelta", "Lcom/onesignal/user/internal/backend/PropertiesDeltasObject;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/user/internal/backend/PropertiesObject;ZLcom/onesignal/user/internal/backend/PropertiesDeltasObject;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserBackendService implements IUserBackendService {
    private final IHttpClient _httpClient;

    public UserBackendService(IHttpClient _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.onesignal.user.internal.backend.IUserBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createUser(String str, Map<String, String> map, List<SubscriptionObject> list, Map<String, String> map2, String str2, Continuation<? super CreateUserResponse> continuation) {
        UserBackendService$createUser$1 userBackendService$createUser$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof UserBackendService$createUser$1) {
            userBackendService$createUser$1 = (UserBackendService$createUser$1) continuation;
            if ((userBackendService$createUser$1.label & Integer.MIN_VALUE) != 0) {
                userBackendService$createUser$1.label -= Integer.MIN_VALUE;
                Object obj = userBackendService$createUser$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userBackendService$createUser$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject jSONObject = new JSONObject();
                    if (!map.isEmpty()) {
                        jSONObject.put("identity", JSONObjectExtensionsKt.putMap(new JSONObject(), map));
                    }
                    if (!list.isEmpty()) {
                        jSONObject.put(BillingClient.FeatureType.SUBSCRIPTIONS, JSONConverter.INSTANCE.convertToJSON(list));
                    }
                    if (!map2.isEmpty()) {
                        jSONObject.put("properties", JSONObjectExtensionsKt.putMap(new JSONObject(), map2));
                    }
                    jSONObject.put("refresh_device_metadata", true);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str2, 15, null);
                    userBackendService$createUser$1.label = 1;
                    obj = this._httpClient.post("apps/" + str + "/users", jSONObject, optionalHeaders, userBackendService$createUser$1);
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
                JSONConverter jSONConverter = JSONConverter.INSTANCE;
                String payload = httpResponse.getPayload();
                Intrinsics.checkNotNull(payload);
                return jSONConverter.convertToCreateUserResponse(new JSONObject(payload));
            }
        }
        userBackendService$createUser$1 = new UserBackendService$createUser$1(this, continuation);
        Object obj2 = userBackendService$createUser$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userBackendService$createUser$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.onesignal.user.internal.backend.IUserBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateUser(String str, String str2, String str3, PropertiesObject propertiesObject, boolean z, PropertiesDeltasObject propertiesDeltasObject, String str4, Continuation<? super RywData> continuation) {
        UserBackendService$updateUser$1 userBackendService$updateUser$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof UserBackendService$updateUser$1) {
            userBackendService$updateUser$1 = (UserBackendService$updateUser$1) continuation;
            if ((userBackendService$updateUser$1.label & Integer.MIN_VALUE) != 0) {
                userBackendService$updateUser$1.label -= Integer.MIN_VALUE;
                Object obj = userBackendService$updateUser$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userBackendService$updateUser$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject put = new JSONObject().put("refresh_device_metadata", z);
                    if (propertiesObject.getHasAtLeastOnePropertySet()) {
                        put.put("properties", JSONConverter.INSTANCE.convertToJSON(propertiesObject));
                    }
                    if (propertiesDeltasObject.getHasAtLeastOnePropertySet()) {
                        put.put("deltas", JSONConverter.INSTANCE.convertToJSON(propertiesDeltasObject));
                    }
                    IHttpClient iHttpClient = this._httpClient;
                    String str5 = "apps/" + str + "/users/by/" + str2 + IOUtils.DIR_SEPARATOR_UNIX + str3;
                    Intrinsics.checkNotNull(put);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str4, 15, null);
                    userBackendService$updateUser$1.label = 1;
                    obj = iHttpClient.patch(str5, put, optionalHeaders, userBackendService$updateUser$1);
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
                String payload = httpResponse.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                String safeString = jSONObject != null ? JSONObjectExtensionsKt.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? JSONObjectExtensionsKt.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new RywData(safeString, safeLong);
                }
                return null;
            }
        }
        userBackendService$updateUser$1 = new UserBackendService$updateUser$1(this, continuation);
        Object obj2 = userBackendService$updateUser$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userBackendService$updateUser$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.onesignal.user.internal.backend.IUserBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUser(String str, String str2, String str3, String str4, Continuation<? super CreateUserResponse> continuation) {
        UserBackendService$getUser$1 userBackendService$getUser$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof UserBackendService$getUser$1) {
            userBackendService$getUser$1 = (UserBackendService$getUser$1) continuation;
            if ((userBackendService$getUser$1.label & Integer.MIN_VALUE) != 0) {
                userBackendService$getUser$1.label -= Integer.MIN_VALUE;
                Object obj = userBackendService$getUser$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userBackendService$getUser$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IHttpClient iHttpClient = this._httpClient;
                    String str5 = "apps/" + str + "/users/by/" + str2 + IOUtils.DIR_SEPARATOR_UNIX + str3;
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str4, 15, null);
                    userBackendService$getUser$1.label = 1;
                    obj = iHttpClient.get(str5, optionalHeaders, userBackendService$getUser$1);
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
                return JSONConverter.INSTANCE.convertToCreateUserResponse(new JSONObject(httpResponse.getPayload()));
            }
        }
        userBackendService$getUser$1 = new UserBackendService$getUser$1(this, continuation);
        Object obj2 = userBackendService$getUser$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userBackendService$getUser$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
