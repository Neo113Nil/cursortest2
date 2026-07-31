package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.user.internal.backend.IIdentityBackendService;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: IdentityBackendService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\rJP\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/onesignal/user/internal/backend/impl/IdentityBackendService;", "Lcom/onesignal/user/internal/backend/IIdentityBackendService;", "_httpClient", "Lcom/onesignal/core/internal/http/IHttpClient;", "(Lcom/onesignal/core/internal/http/IHttpClient;)V", "deleteAlias", "", "appId", "", "aliasLabel", "aliasValue", "aliasLabelToDelete", "jwt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAlias", "", "identities", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IdentityBackendService implements IIdentityBackendService {
    private final IHttpClient _httpClient;

    public IdentityBackendService(IHttpClient _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.onesignal.user.internal.backend.IIdentityBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setAlias(String str, String str2, String str3, Map<String, String> map, String str4, Continuation<? super Map<String, String>> continuation) {
        IdentityBackendService$setAlias$1 identityBackendService$setAlias$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof IdentityBackendService$setAlias$1) {
            identityBackendService$setAlias$1 = (IdentityBackendService$setAlias$1) continuation;
            if ((identityBackendService$setAlias$1.label & Integer.MIN_VALUE) != 0) {
                identityBackendService$setAlias$1.label -= Integer.MIN_VALUE;
                Object obj = identityBackendService$setAlias$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityBackendService$setAlias$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject put = new JSONObject().put("identity", JSONObjectExtensionsKt.putMap(new JSONObject(), map));
                    IHttpClient iHttpClient = this._httpClient;
                    String str5 = "apps/" + str + "/users/by/" + str2 + IOUtils.DIR_SEPARATOR_UNIX + str3 + "/identity";
                    Intrinsics.checkNotNull(put);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str4, 15, null);
                    identityBackendService$setAlias$1.label = 1;
                    obj = iHttpClient.patch(str5, put, optionalHeaders, identityBackendService$setAlias$1);
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
                JSONObject jSONObject = new JSONObject(payload).getJSONObject("identity");
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                Map<String, Object> map2 = JSONObjectExtensionsKt.toMap(jSONObject);
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
                Iterator<T> it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        identityBackendService$setAlias$1 = new IdentityBackendService$setAlias$1(this, continuation);
        Object obj2 = identityBackendService$setAlias$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityBackendService$setAlias$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.onesignal.user.internal.backend.IIdentityBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteAlias(String str, String str2, String str3, String str4, String str5, Continuation<? super Unit> continuation) {
        IdentityBackendService$deleteAlias$1 identityBackendService$deleteAlias$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof IdentityBackendService$deleteAlias$1) {
            identityBackendService$deleteAlias$1 = (IdentityBackendService$deleteAlias$1) continuation;
            if ((identityBackendService$deleteAlias$1.label & Integer.MIN_VALUE) != 0) {
                identityBackendService$deleteAlias$1.label -= Integer.MIN_VALUE;
                Object obj = identityBackendService$deleteAlias$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityBackendService$deleteAlias$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IHttpClient iHttpClient = this._httpClient;
                    String str6 = "apps/" + str + "/users/by/" + str2 + IOUtils.DIR_SEPARATOR_UNIX + str3 + "/identity/" + str4;
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str5, 15, null);
                    identityBackendService$deleteAlias$1.label = 1;
                    obj = iHttpClient.delete(str6, optionalHeaders, identityBackendService$deleteAlias$1);
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
        identityBackendService$deleteAlias$1 = new IdentityBackendService$deleteAlias$1(this, continuation);
        Object obj2 = identityBackendService$deleteAlias$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityBackendService$deleteAlias$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
