package com.stripe.android.core.networking;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.InvalidSerializationException;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONException;
import org.json.JSONObject;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public abstract class JsonUtilsKt {
    public static final LinearRetryDelaySupplier_Factory INSTANCE = new LinearRetryDelaySupplier_Factory();

    public static final APIException apiException(KClasses$$Lambda$1 kClasses$$Lambda$1, StripeResponse stripeResponse) {
        StripeError stripeError;
        String m;
        try {
            JSONObject responseJson = responseJson(stripeResponse);
            kClasses$$Lambda$1.getClass();
            stripeError = KClasses$$Lambda$1.parse(responseJson);
        } catch (APIException unused) {
            stripeError = null;
        }
        RequestId requestId = stripeResponse.requestId;
        String str = requestId != null ? requestId.value : null;
        int i = stripeResponse.code;
        if (stripeError == null || (m = stripeError.message) == null) {
            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Request failed with status code ", " and non-JSON error body.");
        }
        return new APIException(i, 16, stripeError, str, m, null);
    }

    public static HashMap compactParams(Map map) {
        map.getClass();
        HashMap hashMap = new HashMap(map);
        Iterator it = new HashSet(hashMap.keySet()).iterator();
        it.getClass();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = hashMap.get(str);
            if (obj instanceof Map) {
                hashMap.put(str, compactParams((Map) obj));
            } else if (obj == null) {
                hashMap.remove(str);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:28|29))(3:30|31|(1:33))|12|13|(2:15|(2:17|(1:19)(2:21|22))(2:23|24))(2:25|26)))|37|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
    
        r11 = kotlin.Result.Companion;
        r11 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object executeRequestWithModelJsonParser(DefaultStripeNetworkClient defaultStripeNetworkClient, KClasses$$Lambda$1 kClasses$$Lambda$1, ApiRequest apiRequest, ModelJsonParser modelJsonParser, ContinuationImpl continuationImpl) {
        RequestExecutorKt$executeRequestWithModelJsonParser$1 requestExecutorKt$executeRequestWithModelJsonParser$1;
        int i;
        Throwable m4120exceptionOrNullimpl;
        if (continuationImpl instanceof RequestExecutorKt$executeRequestWithModelJsonParser$1) {
            requestExecutorKt$executeRequestWithModelJsonParser$1 = (RequestExecutorKt$executeRequestWithModelJsonParser$1) continuationImpl;
            int i2 = requestExecutorKt$executeRequestWithModelJsonParser$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                requestExecutorKt$executeRequestWithModelJsonParser$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = requestExecutorKt$executeRequestWithModelJsonParser$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestExecutorKt$executeRequestWithModelJsonParser$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    requestExecutorKt$executeRequestWithModelJsonParser$1.L$1 = kClasses$$Lambda$1;
                    requestExecutorKt$executeRequestWithModelJsonParser$1.L$2 = apiRequest;
                    requestExecutorKt$executeRequestWithModelJsonParser$1.L$3 = modelJsonParser;
                    requestExecutorKt$executeRequestWithModelJsonParser$1.label = 1;
                    obj = defaultStripeNetworkClient.executeRequest(apiRequest, requestExecutorKt$executeRequestWithModelJsonParser$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    modelJsonParser = requestExecutorKt$executeRequestWithModelJsonParser$1.L$3;
                    apiRequest = requestExecutorKt$executeRequestWithModelJsonParser$1.L$2;
                    kClasses$$Lambda$1 = requestExecutorKt$executeRequestWithModelJsonParser$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                Object failure = (StripeResponse) obj;
                Result.Companion companion2 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl == null) {
                    throw new APIConnectionException("Failed to execute " + apiRequest, m4120exceptionOrNullimpl);
                }
                StripeResponse stripeResponse = (StripeResponse) failure;
                if (stripeResponse.isError) {
                    throw apiException(kClasses$$Lambda$1, stripeResponse);
                }
                StripeModel mo4026parse = modelJsonParser.mo4026parse(responseJson(stripeResponse));
                if (mo4026parse != null) {
                    return mo4026parse;
                }
                throw new APIException(0, 23, null, null, modelJsonParser + " returns null for " + responseJson(stripeResponse), null);
            }
        }
        requestExecutorKt$executeRequestWithModelJsonParser$1 = new RequestExecutorKt$executeRequestWithModelJsonParser$1(continuationImpl);
        Object obj3 = requestExecutorKt$executeRequestWithModelJsonParser$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestExecutorKt$executeRequestWithModelJsonParser$1.label;
        if (i != 0) {
        }
        Object failure2 = (StripeResponse) obj3;
        Result.Companion companion22 = Result.Companion;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
        if (m4120exceptionOrNullimpl == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:36|37))(3:38|39|(1:41))|12|13|(2:15|(2:17|18)(6:20|21|22|(1:24)|25|(1:29)(2:27|28)))(2:33|34)))|45|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0050, code lost:
    
        r11 = kotlin.Result.Companion;
        r11 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object executeRequestWithResultParser(DefaultStripeNetworkClient defaultStripeNetworkClient, KClasses$$Lambda$1 kClasses$$Lambda$1, ApiRequest apiRequest, ModelJsonParser modelJsonParser, ContinuationImpl continuationImpl) {
        RequestExecutorKt$executeRequestWithResultParser$1 requestExecutorKt$executeRequestWithResultParser$1;
        int i;
        Throwable m4120exceptionOrNullimpl;
        Object failure;
        if (continuationImpl instanceof RequestExecutorKt$executeRequestWithResultParser$1) {
            requestExecutorKt$executeRequestWithResultParser$1 = (RequestExecutorKt$executeRequestWithResultParser$1) continuationImpl;
            int i2 = requestExecutorKt$executeRequestWithResultParser$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                requestExecutorKt$executeRequestWithResultParser$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = requestExecutorKt$executeRequestWithResultParser$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestExecutorKt$executeRequestWithResultParser$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    requestExecutorKt$executeRequestWithResultParser$1.L$1 = kClasses$$Lambda$1;
                    requestExecutorKt$executeRequestWithResultParser$1.L$2 = apiRequest;
                    requestExecutorKt$executeRequestWithResultParser$1.L$3 = modelJsonParser;
                    requestExecutorKt$executeRequestWithResultParser$1.label = 1;
                    obj = defaultStripeNetworkClient.executeRequest(apiRequest, requestExecutorKt$executeRequestWithResultParser$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    modelJsonParser = requestExecutorKt$executeRequestWithResultParser$1.L$3;
                    apiRequest = requestExecutorKt$executeRequestWithResultParser$1.L$2;
                    kClasses$$Lambda$1 = requestExecutorKt$executeRequestWithResultParser$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                Object failure2 = (StripeResponse) obj;
                Result.Companion companion2 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
                if (m4120exceptionOrNullimpl == null) {
                    return new Result.Failure(new APIConnectionException("Failed to execute " + apiRequest, m4120exceptionOrNullimpl));
                }
                StripeResponse stripeResponse = (StripeResponse) failure2;
                if (stripeResponse.isError) {
                    return new Result.Failure(apiException(kClasses$$Lambda$1, stripeResponse));
                }
                try {
                    failure = modelJsonParser.mo4026parse(responseJson(stripeResponse));
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                StripeModel stripeModel = (StripeModel) (failure instanceof Result.Failure ? null : failure);
                if (stripeModel != null) {
                    return stripeModel;
                }
                return new Result.Failure(new APIException(0, 23, null, null, modelJsonParser + " returns null for " + responseJson(stripeResponse), null));
            }
        }
        requestExecutorKt$executeRequestWithResultParser$1 = new RequestExecutorKt$executeRequestWithResultParser$1(continuationImpl);
        Object obj3 = requestExecutorKt$executeRequestWithResultParser$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestExecutorKt$executeRequestWithResultParser$1.label;
        if (i != 0) {
        }
        Object failure22 = (StripeResponse) obj3;
        Result.Companion companion22 = Result.Companion;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure22);
        if (m4120exceptionOrNullimpl == null) {
        }
    }

    public static List flattenParamsMap(String str, Map map) {
        if (map == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (str != null) {
                str2 = Boxes$$ExternalSyntheticOutline1.m(str, "[", str2, "]");
            }
            CollectionsKt__MutableCollectionsKt.addAll(flattenParamsValue(value, str2), arrayList);
        }
        return arrayList;
    }

    public static List flattenParamsValue(Object obj, String str) {
        if (obj instanceof Map) {
            return flattenParamsMap(str, (Map) obj);
        }
        if (!(obj instanceof List)) {
            return obj == null ? CollectionsKt__CollectionsJVMKt.listOf(new QueryStringFactory$Parameter(str, "")) : CollectionsKt__CollectionsJVMKt.listOf(new QueryStringFactory$Parameter(str, obj.toString()));
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsJVMKt.listOf(new QueryStringFactory$Parameter(str, ""));
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Object obj2 : list2) {
                if (!(obj2 instanceof String) && !(obj2 instanceof Number) && !(obj2 instanceof Boolean) && !(obj2 instanceof Character)) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    for (Object obj3 : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        CollectionsKt__MutableCollectionsKt.addAll(flattenParamsValue(obj3, str + "[" + i + "]"), arrayList);
                        i = i2;
                    }
                    return arrayList;
                }
            }
        }
        String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(str, "[]");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(flattenParamsValue(it.next(), m$1), arrayList2);
        }
        return arrayList2;
    }

    public static final JSONObject responseJson(StripeResponse stripeResponse) {
        stripeResponse.getClass();
        String str = (String) stripeResponse.body;
        if (str == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            int i = stripeResponse.code;
            RequestId requestId = stripeResponse.requestId;
            List headerValue = stripeResponse.getHeaderValue("Content-Type");
            throw new APIException(0, 7, null, null, StringsKt__IndentKt.replaceIndent("\n                    Exception while parsing response body.\n                      Status code: " + i + "\n                      Request-Id: " + requestId + "\n                      Content-Type: " + (headerValue != null ? (String) CollectionsKt.firstOrNull(headerValue) : null) + "\n                      Body: \"" + str + "\"\n                "), e);
        }
    }

    public static final JsonObject toJsonElement(Map map) {
        Object value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null && (value = entry.getValue()) != null) {
                if (value instanceof Map) {
                    linkedHashMap.put(str, toJsonElement((Map) value));
                } else if (value instanceof List) {
                    linkedHashMap.put(str, toJsonElement((List) value));
                } else {
                    linkedHashMap.put(str, JsonElementKt.JsonPrimitive(value.toString()));
                }
            }
        }
        return new JsonObject(linkedHashMap);
    }

    public static final Map toMap(JsonObject jsonObject) {
        jsonObject.getClass();
        ArrayList arrayList = new ArrayList(jsonObject.size());
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), toPrimitives(entry.getValue())));
        }
        return MapsKt__MapsKt.toMap(arrayList);
    }

    public static final Object toPrimitives(JsonElement jsonElement) {
        String replace;
        jsonElement.getClass();
        if (jsonElement.equals(JsonNull.INSTANCE)) {
            return null;
        }
        if (jsonElement instanceof JsonArray) {
            JsonArray jsonArray = (JsonArray) jsonElement;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(jsonArray, 10));
            Iterator it = jsonArray.content.iterator();
            while (it.hasNext()) {
                arrayList.add(toPrimitives((JsonElement) it.next()));
            }
            return arrayList;
        }
        if (jsonElement instanceof JsonObject) {
            return toMap((JsonObject) jsonElement);
        }
        if (jsonElement instanceof JsonPrimitive) {
            replace = new Regex("^\"|\"$").replace(((JsonPrimitive) jsonElement).getContent(), "");
            return replace;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final Map toMap(JsonElement jsonElement) {
        jsonElement.getClass();
        if (jsonElement instanceof JsonObject) {
            return toMap((JsonObject) jsonElement);
        }
        throw new InvalidSerializationException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Serialization result ", jsonElement.getClass().getSimpleName(), " is not supported"));
    }

    public static final JsonArray toJsonElement(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.filterNotNull(list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Map) {
                arrayList.add(toJsonElement((Map) next));
            } else if (next instanceof List) {
                arrayList.add(toJsonElement((List) next));
            } else {
                arrayList.add(JsonElementKt.JsonPrimitive(next.toString()));
            }
        }
        return new JsonArray(arrayList);
    }
}
