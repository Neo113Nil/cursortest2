package dev.hyo.openiap.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import dev.hyo.openiap.IapStore;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapLog;
import dev.hyo.openiap.RequestVerifyPurchaseWithIapkitProps;
import dev.hyo.openiap.RequestVerifyPurchaseWithIapkitResult;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PurchaseVerificationValidator.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.utils.PurchaseVerificationValidatorKt$verifyPurchaseWithIapkit$3", f = "PurchaseVerificationValidator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class PurchaseVerificationValidatorKt$verifyPurchaseWithIapkit$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RequestVerifyPurchaseWithIapkitResult>, Object> {
    final /* synthetic */ Function1<String, HttpURLConnection> $connectionFactory;
    final /* synthetic */ RequestVerifyPurchaseWithIapkitProps $props;
    final /* synthetic */ String $tag;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PurchaseVerificationValidatorKt$verifyPurchaseWithIapkit$3(RequestVerifyPurchaseWithIapkitProps requestVerifyPurchaseWithIapkitProps, Function1<? super String, ? extends HttpURLConnection> function1, String str, Continuation<? super PurchaseVerificationValidatorKt$verifyPurchaseWithIapkit$3> continuation) {
        super(2, continuation);
        this.$props = requestVerifyPurchaseWithIapkitProps;
        this.$connectionFactory = function1;
        this.$tag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PurchaseVerificationValidatorKt$verifyPurchaseWithIapkit$3(this.$props, this.$connectionFactory, this.$tag, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RequestVerifyPurchaseWithIapkitResult> continuation) {
        return ((PurchaseVerificationValidatorKt$verifyPurchaseWithIapkit$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map buildGooglePayload;
        Gson gson;
        String str;
        String orElse;
        String str2;
        Gson gson2;
        Gson gson3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$props.getGoogle() == null) {
            throw new IllegalArgumentException("IAPKit verification on Android requires google payload");
        }
        IapStore iapStore = IapStore.Google;
        buildGooglePayload = PurchaseVerificationValidatorKt.buildGooglePayload(this.$props);
        HttpURLConnection invoke = this.$connectionFactory.invoke("https://api.iapkit.com/v1/purchase/verify");
        RequestVerifyPurchaseWithIapkitProps requestVerifyPurchaseWithIapkitProps = this.$props;
        HttpURLConnection httpURLConnection = invoke;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        String apiKey = requestVerifyPurchaseWithIapkitProps.getApiKey();
        if (apiKey != null) {
            if (StringsKt.isBlank(apiKey)) {
                apiKey = null;
            }
            if (apiKey != null) {
                httpURLConnection.setRequestProperty("Authorization", "Bearer " + apiKey);
            }
        }
        try {
            try {
                gson = PurchaseVerificationValidatorKt.gson;
                String json = gson.toJson(buildGooglePayload);
                BufferedReader outputStream = httpURLConnection.getOutputStream();
                try {
                    Intrinsics.checkNotNull(json);
                    byte[] bytes = json.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    outputStream.write(bytes);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(outputStream, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                    if (errorStream != null) {
                        Reader inputStreamReader = new InputStreamReader(errorStream, Charsets.UTF_8);
                        outputStream = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                        try {
                            str = TextStreamsKt.readText(outputStream);
                            CloseableKt.closeFinally(outputStream, null);
                        } finally {
                        }
                    } else {
                        str = null;
                    }
                    orElse = PurchaseVerificationValidatorKt.orElse(str, "");
                    if (200 > responseCode || responseCode >= 300) {
                        OpenIapLog.INSTANCE.warn("verifyPurchaseWithProvider failed (HTTP " + responseCode + ") [" + iapStore + "]", this.$tag);
                        try {
                            Type type = new TypeToken<Map<String, ? extends Object>>() { // from class: dev.hyo.openiap.utils.PurchaseVerificationValidatorKt$verifyPurchaseWithIapkit$3$errorMessage$mapType$1
                            }.getType();
                            gson2 = PurchaseVerificationValidatorKt.gson;
                            Map map = (Map) gson2.fromJson(orElse, type);
                            Intrinsics.checkNotNull(map);
                            str2 = PurchaseVerificationValidatorKt.extractIapkitErrorMessage(map);
                            if (str2 == null) {
                                str2 = "HTTP " + responseCode;
                            }
                        } catch (Exception unused) {
                            str2 = "HTTP " + responseCode;
                        }
                        throw new OpenIapError.PurchaseVerificationFailed(str2);
                    }
                    try {
                        Type type2 = new TypeToken<Map<String, ? extends Object>>() { // from class: dev.hyo.openiap.utils.PurchaseVerificationValidatorKt$verifyPurchaseWithIapkit$3$mapType$1
                        }.getType();
                        gson3 = PurchaseVerificationValidatorKt.gson;
                        Map map2 = (Map) gson3.fromJson(orElse, type2);
                        Intrinsics.checkNotNull(map2);
                        Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(map2);
                        Object obj2 = mutableMap.get("state");
                        String str3 = obj2 instanceof String ? (String) obj2 : null;
                        if (str3 != null) {
                            String lowerCase = str3.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            mutableMap.put("state", StringsKt.replace$default(lowerCase, "_", TokenBuilder.TOKEN_DELIMITER, false, 4, (Object) null));
                        }
                        if (mutableMap.get("store") == null) {
                            mutableMap.put("store", iapStore.toJson());
                        }
                        return RequestVerifyPurchaseWithIapkitResult.INSTANCE.fromJson(mutableMap);
                    } catch (Exception e) {
                        OpenIapLog.INSTANCE.warn("Failed to parse IAPKit verification response: " + e.getMessage(), this.$tag);
                        throw new OpenIapError.PurchaseVerificationFailed("Failed to parse response");
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } catch (IOException e2) {
                OpenIapLog.INSTANCE.warn("Network error during IAPKit verification: " + e2.getMessage(), this.$tag);
                throw new OpenIapError.PurchaseVerificationFailed("Network error: " + e2.getMessage());
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }
}
