package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.internal.backend.ISubscriptionBackendService;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.identity.IdentityModelStoreKt;
import e5.g;
import f4.C0430g;
import f4.v;
import g4.AbstractC0476u;
import g4.C0472q;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class SubscriptionBackendService implements ISubscriptionBackendService {
    private final IHttpClient _httpClient;

    public SubscriptionBackendService(IHttpClient _httpClient) {
        i.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSubscription(String str, String str2, String str3, SubscriptionObject subscriptionObject, String str4, InterfaceC1218d interfaceC1218d) {
        SubscriptionBackendService$createSubscription$1 subscriptionBackendService$createSubscription$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof SubscriptionBackendService$createSubscription$1) {
            subscriptionBackendService$createSubscription$1 = (SubscriptionBackendService$createSubscription$1) interfaceC1218d;
            int i3 = subscriptionBackendService$createSubscription$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                subscriptionBackendService$createSubscription$1.label = i3 - Integer.MIN_VALUE;
                Object obj = subscriptionBackendService$createSubscription$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = subscriptionBackendService$createSubscription$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    JSONObject put = new JSONObject().put("subscription", JSONConverter.INSTANCE.convertToJSON(subscriptionObject));
                    i.b(put);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str4, 15, null);
                    subscriptionBackendService$createSubscription$1.label = 1;
                    obj = this._httpClient.post("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions", put, optionalHeaders, subscriptionBackendService$createSubscription$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                String payload = httpResponse.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                JSONObject safeJSONObject = jSONObject != null ? JSONObjectExtensionsKt.safeJSONObject(jSONObject, "subscription") : null;
                if (safeJSONObject == null || !safeJSONObject.has(OutcomeConstants.OUTCOME_ID)) {
                    return null;
                }
                String safeString = JSONObjectExtensionsKt.safeString(jSONObject, "ryw_token");
                return new C0430g(safeJSONObject.getString(OutcomeConstants.OUTCOME_ID), safeString != null ? new RywData(safeString, JSONObjectExtensionsKt.safeLong(jSONObject, "ryw_delay")) : null);
            }
        }
        subscriptionBackendService$createSubscription$1 = new SubscriptionBackendService$createSubscription$1(this, interfaceC1218d);
        Object obj2 = subscriptionBackendService$createSubscription$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = subscriptionBackendService$createSubscription$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteSubscription(String str, String str2, String str3, InterfaceC1218d interfaceC1218d) {
        SubscriptionBackendService$deleteSubscription$1 subscriptionBackendService$deleteSubscription$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof SubscriptionBackendService$deleteSubscription$1) {
            subscriptionBackendService$deleteSubscription$1 = (SubscriptionBackendService$deleteSubscription$1) interfaceC1218d;
            int i3 = subscriptionBackendService$deleteSubscription$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                subscriptionBackendService$deleteSubscription$1.label = i3 - Integer.MIN_VALUE;
                Object obj = subscriptionBackendService$deleteSubscription$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = subscriptionBackendService$deleteSubscription$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str3, 15, null);
                    subscriptionBackendService$deleteSubscription$1.label = 1;
                    obj = this._httpClient.delete("apps/" + str + "/subscriptions/" + str2, optionalHeaders, subscriptionBackendService$deleteSubscription$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                return v.f5689a;
            }
        }
        subscriptionBackendService$deleteSubscription$1 = new SubscriptionBackendService$deleteSubscription$1(this, interfaceC1218d);
        Object obj2 = subscriptionBackendService$deleteSubscription$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = subscriptionBackendService$deleteSubscription$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIdentityFromSubscription(String str, String str2, InterfaceC1218d interfaceC1218d) {
        SubscriptionBackendService$getIdentityFromSubscription$1 subscriptionBackendService$getIdentityFromSubscription$1;
        int i2;
        HttpResponse httpResponse;
        Map<String, Object> map;
        if (interfaceC1218d instanceof SubscriptionBackendService$getIdentityFromSubscription$1) {
            subscriptionBackendService$getIdentityFromSubscription$1 = (SubscriptionBackendService$getIdentityFromSubscription$1) interfaceC1218d;
            int i3 = subscriptionBackendService$getIdentityFromSubscription$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                subscriptionBackendService$getIdentityFromSubscription$1.label = i3 - Integer.MIN_VALUE;
                SubscriptionBackendService$getIdentityFromSubscription$1 subscriptionBackendService$getIdentityFromSubscription$12 = subscriptionBackendService$getIdentityFromSubscription$1;
                Object obj = subscriptionBackendService$getIdentityFromSubscription$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = subscriptionBackendService$getIdentityFromSubscription$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    subscriptionBackendService$getIdentityFromSubscription$12.label = 1;
                    obj = IHttpClient.DefaultImpls.get$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/user/identity", null, subscriptionBackendService$getIdentityFromSubscription$12, 2, null);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                String payload = httpResponse.getPayload();
                i.b(payload);
                JSONObject safeJSONObject = JSONObjectExtensionsKt.safeJSONObject(new JSONObject(payload), IdentityModelStoreKt.IDENTITY_NAME_SPACE);
                if (safeJSONObject == null || (map = JSONObjectExtensionsKt.toMap(safeJSONObject)) == null) {
                    return C0472q.f5751a;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0476u.W(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        subscriptionBackendService$getIdentityFromSubscription$1 = new SubscriptionBackendService$getIdentityFromSubscription$1(this, interfaceC1218d);
        SubscriptionBackendService$getIdentityFromSubscription$1 subscriptionBackendService$getIdentityFromSubscription$122 = subscriptionBackendService$getIdentityFromSubscription$1;
        Object obj2 = subscriptionBackendService$getIdentityFromSubscription$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = subscriptionBackendService$getIdentityFromSubscription$122.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transferSubscription(String str, String str2, String str3, String str4, String str5, InterfaceC1218d interfaceC1218d) {
        SubscriptionBackendService$transferSubscription$1 subscriptionBackendService$transferSubscription$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof SubscriptionBackendService$transferSubscription$1) {
            subscriptionBackendService$transferSubscription$1 = (SubscriptionBackendService$transferSubscription$1) interfaceC1218d;
            int i3 = subscriptionBackendService$transferSubscription$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                subscriptionBackendService$transferSubscription$1.label = i3 - Integer.MIN_VALUE;
                Object obj = subscriptionBackendService$transferSubscription$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = subscriptionBackendService$transferSubscription$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    JSONObject put = new JSONObject().put(IdentityModelStoreKt.IDENTITY_NAME_SPACE, new JSONObject().put(str3, str4));
                    i.b(put);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str5, 15, null);
                    subscriptionBackendService$transferSubscription$1.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/subscriptions/" + str2 + "/owner", put, optionalHeaders, subscriptionBackendService$transferSubscription$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                return v.f5689a;
            }
        }
        subscriptionBackendService$transferSubscription$1 = new SubscriptionBackendService$transferSubscription$1(this, interfaceC1218d);
        Object obj2 = subscriptionBackendService$transferSubscription$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = subscriptionBackendService$transferSubscription$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSubscription(String str, String str2, SubscriptionObject subscriptionObject, String str3, InterfaceC1218d interfaceC1218d) {
        SubscriptionBackendService$updateSubscription$1 subscriptionBackendService$updateSubscription$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof SubscriptionBackendService$updateSubscription$1) {
            subscriptionBackendService$updateSubscription$1 = (SubscriptionBackendService$updateSubscription$1) interfaceC1218d;
            int i3 = subscriptionBackendService$updateSubscription$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                subscriptionBackendService$updateSubscription$1.label = i3 - Integer.MIN_VALUE;
                Object obj = subscriptionBackendService$updateSubscription$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = subscriptionBackendService$updateSubscription$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    JSONObject put = new JSONObject().put("subscription", JSONConverter.INSTANCE.convertToJSON(subscriptionObject));
                    i.b(put);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str3, 15, null);
                    subscriptionBackendService$updateSubscription$1.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/subscriptions/" + str2, put, optionalHeaders, subscriptionBackendService$updateSubscription$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
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
        subscriptionBackendService$updateSubscription$1 = new SubscriptionBackendService$updateSubscription$1(this, interfaceC1218d);
        Object obj2 = subscriptionBackendService$updateSubscription$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = subscriptionBackendService$updateSubscription$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
