package dev.cct.translatorapp.util;

import android.util.Log;
import com.bumptech.glide.load.Key;
import com.google.common.net.HttpHeaders;
import dev.cct.translatorapp.dataModel.DictionaryModel;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.HttpClientKt;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.engine.android.Android;
import io.ktor.client.engine.android.AndroidEngineConfig;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.serialization.kotlinx.json.JsonSupportKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;

/* compiled from: ApiService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ)\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Ldev/cct/translatorapp/util/ApiService;", "", "()V", "baseUrl", "", "client", "Lio/ktor/client/HttpClient;", "dictionaryBaseUrl", "searchDictionary", "Ldev/cct/translatorapp/dataModel/DictionaryModel;", "text", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "translateText", "textToTranslate", "inputLangCode", "outputLangCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApiService {
    private final String dictionaryBaseUrl = "https://api.dictionaryapi.dev/api/v2/entries/en/";
    private final String baseUrl = "https://translate.googleapis.com/translate_a/single";
    private final HttpClient client = HttpClientKt.HttpClient(Android.INSTANCE, new Function1<HttpClientConfig<AndroidEngineConfig>, Unit>() { // from class: dev.cct.translatorapp.util.ApiService$client$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HttpClientConfig<AndroidEngineConfig> httpClientConfig) {
            invoke2(httpClientConfig);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HttpClientConfig<AndroidEngineConfig> HttpClient) {
            Intrinsics.checkNotNullParameter(HttpClient, "$this$HttpClient");
            HttpClient.install(DefaultRequest.Plugin, new Function1<DefaultRequest.DefaultRequestBuilder, Unit>() { // from class: dev.cct.translatorapp.util.ApiService$client$1.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DefaultRequest.DefaultRequestBuilder defaultRequestBuilder) {
                    invoke2(defaultRequestBuilder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DefaultRequest.DefaultRequestBuilder install) {
                    Intrinsics.checkNotNullParameter(install, "$this$install");
                    install.getHeaders().append(HttpHeaders.USER_AGENT, "Mozilla/5.0");
                }
            });
            HttpClient.install(ContentNegotiation.Plugin, new Function1<ContentNegotiation.Config, Unit>() { // from class: dev.cct.translatorapp.util.ApiService$client$1.2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentNegotiation.Config config) {
                    invoke2(config);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentNegotiation.Config install) {
                    Intrinsics.checkNotNullParameter(install, "$this$install");
                    JsonSupportKt.json$default(install, JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: dev.cct.translatorapp.util.ApiService.client.1.2.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                            invoke2(jsonBuilder);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(JsonBuilder Json) {
                            Intrinsics.checkNotNullParameter(Json, "$this$Json");
                            Json.setPrettyPrint(true);
                            Json.setLenient(true);
                            Json.setIgnoreUnknownKeys(true);
                        }
                    }, 1, null), null, 2, null);
                }
            });
            HttpClient.engine(new Function1<AndroidEngineConfig, Unit>() { // from class: dev.cct.translatorapp.util.ApiService$client$1.3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AndroidEngineConfig androidEngineConfig) {
                    invoke2(androidEngineConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AndroidEngineConfig engine) {
                    Intrinsics.checkNotNullParameter(engine, "$this$engine");
                    engine.setConnectTimeout(10000);
                    engine.setSocketTimeout(10000);
                }
            });
        }
    });

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(3:11|12|(4:14|(2:17|15)|18|19)(2:21|22))(2:23|24))(2:25|26))(4:30|31|32|(1:34)(1:35))|27|(1:29)|(0)(0)))|41|6|7|(0)(0)|27|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0046, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c4 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:12:0x0031, B:14:0x00c4, B:15:0x00d3, B:17:0x00d9, B:21:0x011b, B:22:0x0122, B:26:0x0042, B:27:0x009d), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011b A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:12:0x0031, B:14:0x00c4, B:15:0x00d3, B:17:0x00d9, B:21:0x011b, B:22:0x0122, B:26:0x0042, B:27:0x009d), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object translateText(String str, String str2, String str3, Continuation<? super String> continuation) {
        ApiService$translateText$1 apiService$translateText$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof ApiService$translateText$1) {
            apiService$translateText$1 = (ApiService$translateText$1) continuation;
            if ((apiService$translateText$1.label & Integer.MIN_VALUE) != 0) {
                apiService$translateText$1.label -= Integer.MIN_VALUE;
                obj = apiService$translateText$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = apiService$translateText$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        HttpClient httpClient = this.client;
                        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                        HttpRequestKt.url(httpRequestBuilder, this.baseUrl);
                        UtilsKt.parameter(httpRequestBuilder, "client", "gtx");
                        UtilsKt.parameter(httpRequestBuilder, "sl", str2);
                        UtilsKt.parameter(httpRequestBuilder, "tl", str3);
                        UtilsKt.parameter(httpRequestBuilder, "dt", "t");
                        UtilsKt.parameter(httpRequestBuilder, "q", str);
                        UtilsKt.parameter(httpRequestBuilder, "ie", Key.STRING_CHARSET_NAME);
                        UtilsKt.parameter(httpRequestBuilder, "oe", Key.STRING_CHARSET_NAME);
                        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
                        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                        apiService$translateText$1.L$0 = "";
                        apiService$translateText$1.label = 1;
                        Object execute = httpStatement.execute(apiService$translateText$1);
                        if (execute == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = execute;
                        str = "";
                    } catch (Exception e) {
                        e = e;
                        str = "";
                        Log.d("ApiServiceR", "translateText: failed with exception=" + e);
                        return str;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) apiService$translateText$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (obj != null) {
                            Iterator<JsonElement> it = JsonElementKt.getJsonArray(((JsonArray) obj).get(0)).iterator();
                            while (it.hasNext()) {
                                str = str + StringsKt.removeSurrounding(JsonElementKt.getJsonArray(it.next()).get(0).toString(), (CharSequence) "\"");
                                Log.d("ApiServiceR", "translatedText: text2 =" + str);
                            }
                            return str;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.serialization.json.JsonArray");
                    }
                    str = (String) apiService$translateText$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                HttpClientCall call = ((HttpResponse) obj).getCall();
                KType typeOf = Reflection.typeOf(JsonArray.class);
                TypeInfo typeInfoImpl = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(typeOf), Reflection.getOrCreateKotlinClass(JsonArray.class), typeOf);
                apiService$translateText$1.L$0 = str;
                apiService$translateText$1.label = 2;
                obj = call.bodyNullable(typeInfoImpl, apiService$translateText$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (obj != null) {
                }
            }
        }
        apiService$translateText$1 = new ApiService$translateText$1(this, continuation);
        obj = apiService$translateText$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = apiService$translateText$1.label;
        if (i != 0) {
        }
        HttpClientCall call2 = ((HttpResponse) obj).getCall();
        KType typeOf2 = Reflection.typeOf(JsonArray.class);
        TypeInfo typeInfoImpl2 = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(typeOf2), Reflection.getOrCreateKotlinClass(JsonArray.class), typeOf2);
        apiService$translateText$1.L$0 = str;
        apiService$translateText$1.label = 2;
        obj = call2.bodyNullable(typeInfoImpl2, apiService$translateText$1);
        if (obj == coroutine_suspended) {
        }
        if (obj != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097 A[Catch: Exception -> 0x013b, TryCatch #0 {Exception -> 0x013b, blocks: (B:11:0x002b, B:13:0x0097, B:15:0x00ad, B:17:0x00b3, B:19:0x00b9, B:21:0x00bf, B:23:0x00c9, B:25:0x00cf, B:27:0x00d7, B:29:0x00dd, B:31:0x00e9, B:33:0x00ef, B:35:0x00f9, B:37:0x0101, B:39:0x0107, B:40:0x010f, B:46:0x0133, B:47:0x013a, B:52:0x0074), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133 A[Catch: Exception -> 0x013b, TryCatch #0 {Exception -> 0x013b, blocks: (B:11:0x002b, B:13:0x0097, B:15:0x00ad, B:17:0x00b3, B:19:0x00b9, B:21:0x00bf, B:23:0x00c9, B:25:0x00cf, B:27:0x00d7, B:29:0x00dd, B:31:0x00e9, B:33:0x00ef, B:35:0x00f9, B:37:0x0101, B:39:0x0107, B:40:0x010f, B:46:0x0133, B:47:0x013a, B:52:0x0074), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object searchDictionary(String str, Continuation<? super DictionaryModel> continuation) {
        ApiService$searchDictionary$1 apiService$searchDictionary$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        JsonObject jsonObject;
        JsonObject jsonObject2;
        JsonElement jsonElement;
        JsonObject jsonObject3;
        JsonArray jsonArray;
        JsonElement jsonElement2;
        JsonObject jsonObject4;
        JsonElement jsonElement3;
        JsonArray jsonArray2;
        try {
            if (continuation instanceof ApiService$searchDictionary$1) {
                apiService$searchDictionary$1 = (ApiService$searchDictionary$1) continuation;
                if ((apiService$searchDictionary$1.label & Integer.MIN_VALUE) != 0) {
                    apiService$searchDictionary$1.label -= Integer.MIN_VALUE;
                    obj = apiService$searchDictionary$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = apiService$searchDictionary$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        HttpClient httpClient = this.client;
                        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                        HttpRequestKt.url(httpRequestBuilder, this.dictionaryBaseUrl + str);
                        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
                        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                        apiService$searchDictionary$1.label = 1;
                        obj = httpStatement.execute(apiService$searchDictionary$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            if (obj != null) {
                                JsonElement jsonElement4 = (JsonElement) JsonElementKt.getJsonObject(((JsonArray) obj).get(0)).get((Object) "meanings");
                                JsonElement jsonElement5 = null;
                                JsonElement jsonElement6 = (jsonElement4 == null || (jsonArray = JsonElementKt.getJsonArray(jsonElement4)) == null || (jsonElement2 = jsonArray.get(0)) == null || (jsonObject4 = JsonElementKt.getJsonObject(jsonElement2)) == null || (jsonElement3 = (JsonElement) jsonObject4.get((Object) "definitions")) == null || (jsonArray2 = JsonElementKt.getJsonArray(jsonElement3)) == null) ? null : jsonArray2.get(0);
                                JsonElement jsonElement7 = (jsonElement6 == null || (jsonObject3 = JsonElementKt.getJsonObject(jsonElement6)) == null) ? null : (JsonElement) jsonObject3.get((Object) "definition");
                                JsonArray jsonArray3 = (jsonElement6 == null || (jsonObject2 = JsonElementKt.getJsonObject(jsonElement6)) == null || (jsonElement = (JsonElement) jsonObject2.get((Object) "synonyms")) == null) ? null : JsonElementKt.getJsonArray(jsonElement);
                                if (jsonElement6 != null && (jsonObject = JsonElementKt.getJsonObject(jsonElement6)) != null) {
                                    jsonElement5 = (JsonElement) jsonObject.get((Object) "example");
                                }
                                Log.d("ApiServiceR", "dictionary: text2 =" + jsonElement6);
                                return new DictionaryModel(String.valueOf(jsonElement7), String.valueOf(jsonArray3), String.valueOf(jsonElement5));
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.serialization.json.JsonArray");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    HttpClientCall call = ((HttpResponse) obj).getCall();
                    KType typeOf = Reflection.typeOf(JsonArray.class);
                    TypeInfo typeInfoImpl = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(typeOf), Reflection.getOrCreateKotlinClass(JsonArray.class), typeOf);
                    apiService$searchDictionary$1.label = 2;
                    obj = call.bodyNullable(typeInfoImpl, apiService$searchDictionary$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (obj != null) {
                    }
                }
            }
            if (i != 0) {
            }
            HttpClientCall call2 = ((HttpResponse) obj).getCall();
            KType typeOf2 = Reflection.typeOf(JsonArray.class);
            TypeInfo typeInfoImpl2 = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(typeOf2), Reflection.getOrCreateKotlinClass(JsonArray.class), typeOf2);
            apiService$searchDictionary$1.label = 2;
            obj = call2.bodyNullable(typeInfoImpl2, apiService$searchDictionary$1);
            if (obj == coroutine_suspended) {
            }
            if (obj != null) {
            }
        } catch (Exception unused) {
            return new DictionaryModel("Not Found", "", "Not Found");
        }
        apiService$searchDictionary$1 = new ApiService$searchDictionary$1(this, continuation);
        obj = apiService$searchDictionary$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = apiService$searchDictionary$1.label;
    }
}
