package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.user.internal.backend.ISubscriptionBackendService;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: SubscriptionBackendService.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JH\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0002\u0010\u000fJ(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0002\u0010\u0013J*\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00152\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\u0016J8\u0010\u0017\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0002\u0010\u0018J2\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/onesignal/user/internal/backend/impl/SubscriptionBackendService;", "Lcom/onesignal/user/internal/backend/ISubscriptionBackendService;", "_httpClient", "Lcom/onesignal/core/internal/http/IHttpClient;", "(Lcom/onesignal/core/internal/http/IHttpClient;)V", "createSubscription", "Lkotlin/Pair;", "", "Lcom/onesignal/common/consistency/RywData;", "appId", "aliasLabel", "aliasValue", "subscription", "Lcom/onesignal/user/internal/backend/SubscriptionObject;", "jwt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/user/internal/backend/SubscriptionObject;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSubscription", "", "subscriptionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIdentityFromSubscription", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transferSubscription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSubscription", "(Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/user/internal/backend/SubscriptionObject;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionBackendService implements ISubscriptionBackendService {
    private final IHttpClient _httpClient;

    public SubscriptionBackendService(IHttpClient _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSubscription(String str, String str2, String str3, SubscriptionObject subscriptionObject, String str4, Continuation<? super Pair<String, RywData>> continuation) {
        SubscriptionBackendService$createSubscription$1 subscriptionBackendService$createSubscription$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof SubscriptionBackendService$createSubscription$1) {
            subscriptionBackendService$createSubscription$1 = (SubscriptionBackendService$createSubscription$1) continuation;
            if ((subscriptionBackendService$createSubscription$1.label & Integer.MIN_VALUE) != 0) {
                subscriptionBackendService$createSubscription$1.label -= Integer.MIN_VALUE;
                Object obj = subscriptionBackendService$createSubscription$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionBackendService$createSubscription$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject put = new JSONObject().put("subscription", JSONConverter.INSTANCE.convertToJSON(subscriptionObject));
                    IHttpClient iHttpClient = this._httpClient;
                    String str5 = "apps/" + str + "/users/by/" + str2 + IOUtils.DIR_SEPARATOR_UNIX + str3 + "/subscriptions";
                    Intrinsics.checkNotNull(put);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str4, 15, null);
                    subscriptionBackendService$createSubscription$1.label = 1;
                    obj = iHttpClient.post(str5, put, optionalHeaders, subscriptionBackendService$createSubscription$1);
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
                JSONObject safeJSONObject = jSONObject != null ? JSONObjectExtensionsKt.safeJSONObject(jSONObject, "subscription") : null;
                if (safeJSONObject == null || !safeJSONObject.has("id")) {
                    return null;
                }
                String safeString = JSONObjectExtensionsKt.safeString(jSONObject, "ryw_token");
                return new Pair(safeJSONObject.getString("id"), safeString != null ? new RywData(safeString, JSONObjectExtensionsKt.safeLong(jSONObject, "ryw_delay")) : null);
            }
        }
        subscriptionBackendService$createSubscription$1 = new SubscriptionBackendService$createSubscription$1(this, continuation);
        Object obj2 = subscriptionBackendService$createSubscription$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionBackendService$createSubscription$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSubscription(String str, String str2, SubscriptionObject subscriptionObject, String str3, Continuation<? super RywData> continuation) {
        SubscriptionBackendService$updateSubscription$1 subscriptionBackendService$updateSubscription$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof SubscriptionBackendService$updateSubscription$1) {
            subscriptionBackendService$updateSubscription$1 = (SubscriptionBackendService$updateSubscription$1) continuation;
            if ((subscriptionBackendService$updateSubscription$1.label & Integer.MIN_VALUE) != 0) {
                subscriptionBackendService$updateSubscription$1.label -= Integer.MIN_VALUE;
                Object obj = subscriptionBackendService$updateSubscription$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionBackendService$updateSubscription$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject put = new JSONObject().put("subscription", JSONConverter.INSTANCE.convertToJSON(subscriptionObject));
                    Intrinsics.checkNotNull(put);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str3, 15, null);
                    subscriptionBackendService$updateSubscription$1.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/subscriptions/" + str2, put, optionalHeaders, subscriptionBackendService$updateSubscription$1);
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
        subscriptionBackendService$updateSubscription$1 = new SubscriptionBackendService$updateSubscription$1(this, continuation);
        Object obj2 = subscriptionBackendService$updateSubscription$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionBackendService$updateSubscription$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteSubscription(String str, String str2, String str3, Continuation<? super Unit> continuation) {
        SubscriptionBackendService$deleteSubscription$1 subscriptionBackendService$deleteSubscription$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof SubscriptionBackendService$deleteSubscription$1) {
            subscriptionBackendService$deleteSubscription$1 = (SubscriptionBackendService$deleteSubscription$1) continuation;
            if ((subscriptionBackendService$deleteSubscription$1.label & Integer.MIN_VALUE) != 0) {
                subscriptionBackendService$deleteSubscription$1.label -= Integer.MIN_VALUE;
                Object obj = subscriptionBackendService$deleteSubscription$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionBackendService$deleteSubscription$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str3, 15, null);
                    subscriptionBackendService$deleteSubscription$1.label = 1;
                    obj = this._httpClient.delete("apps/" + str + "/subscriptions/" + str2, optionalHeaders, subscriptionBackendService$deleteSubscription$1);
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
        subscriptionBackendService$deleteSubscription$1 = new SubscriptionBackendService$deleteSubscription$1(this, continuation);
        Object obj2 = subscriptionBackendService$deleteSubscription$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionBackendService$deleteSubscription$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transferSubscription(String str, String str2, String str3, String str4, String str5, Continuation<? super Unit> continuation) {
        SubscriptionBackendService$transferSubscription$1 subscriptionBackendService$transferSubscription$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof SubscriptionBackendService$transferSubscription$1) {
            subscriptionBackendService$transferSubscription$1 = (SubscriptionBackendService$transferSubscription$1) continuation;
            if ((subscriptionBackendService$transferSubscription$1.label & Integer.MIN_VALUE) != 0) {
                subscriptionBackendService$transferSubscription$1.label -= Integer.MIN_VALUE;
                Object obj = subscriptionBackendService$transferSubscription$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionBackendService$transferSubscription$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject put = new JSONObject().put("identity", new JSONObject().put(str3, str4));
                    Intrinsics.checkNotNull(put);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str5, 15, null);
                    subscriptionBackendService$transferSubscription$1.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/subscriptions/" + str2 + "/owner", put, optionalHeaders, subscriptionBackendService$transferSubscription$1);
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
        subscriptionBackendService$transferSubscription$1 = new SubscriptionBackendService$transferSubscription$1(this, continuation);
        Object obj2 = subscriptionBackendService$transferSubscription$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionBackendService$transferSubscription$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIdentityFromSubscription(String str, String str2, Continuation<? super Map<String, String>> continuation) {
        SubscriptionBackendService$getIdentityFromSubscription$1 subscriptionBackendService$getIdentityFromSubscription$1;
        int i;
        HttpResponse httpResponse;
        Map<String, Object> map;
        if (continuation instanceof SubscriptionBackendService$getIdentityFromSubscription$1) {
            subscriptionBackendService$getIdentityFromSubscription$1 = (SubscriptionBackendService$getIdentityFromSubscription$1) continuation;
            if ((subscriptionBackendService$getIdentityFromSubscription$1.label & Integer.MIN_VALUE) != 0) {
                subscriptionBackendService$getIdentityFromSubscription$1.label -= Integer.MIN_VALUE;
                SubscriptionBackendService$getIdentityFromSubscription$1 subscriptionBackendService$getIdentityFromSubscription$12 = subscriptionBackendService$getIdentityFromSubscription$1;
                Object obj = subscriptionBackendService$getIdentityFromSubscription$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionBackendService$getIdentityFromSubscription$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    subscriptionBackendService$getIdentityFromSubscription$12.label = 1;
                    obj = IHttpClient.DefaultImpls.get$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/user/identity", null, subscriptionBackendService$getIdentityFromSubscription$12, 2, null);
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
                Intrinsics.checkNotNull(payload);
                JSONObject safeJSONObject = JSONObjectExtensionsKt.safeJSONObject(new JSONObject(payload), "identity");
                if (safeJSONObject == null || (map = JSONObjectExtensionsKt.toMap(safeJSONObject)) == null) {
                    return MapsKt.emptyMap();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        subscriptionBackendService$getIdentityFromSubscription$1 = new SubscriptionBackendService$getIdentityFromSubscription$1(this, continuation);
        SubscriptionBackendService$getIdentityFromSubscription$1 subscriptionBackendService$getIdentityFromSubscription$122 = subscriptionBackendService$getIdentityFromSubscription$1;
        Object obj2 = subscriptionBackendService$getIdentityFromSubscription$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionBackendService$getIdentityFromSubscription$122.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
