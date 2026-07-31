package dev.hyo.openiap.utils;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapLog;
import dev.hyo.openiap.VerifyPurchaseHorizonOptions;
import dev.hyo.openiap.VerifyPurchaseProps;
import dev.hyo.openiap.VerifyPurchaseResultHorizon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/VerifyPurchaseResultHorizon;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.utils.PurchaseVerificationValidatorKt$verifyPurchaseWithHorizon$3", f = "PurchaseVerificationValidator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class PurchaseVerificationValidatorKt$verifyPurchaseWithHorizon$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VerifyPurchaseResultHorizon>, Object> {
    final /* synthetic */ String $appId;
    final /* synthetic */ Function1<String, HttpURLConnection> $connectionFactory;
    final /* synthetic */ VerifyPurchaseProps $props;
    final /* synthetic */ String $tag;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PurchaseVerificationValidatorKt$verifyPurchaseWithHorizon$3(VerifyPurchaseProps verifyPurchaseProps, String str, Function1<? super String, ? extends HttpURLConnection> function1, String str2, Continuation<? super PurchaseVerificationValidatorKt$verifyPurchaseWithHorizon$3> continuation) {
        super(2, continuation);
        this.$props = verifyPurchaseProps;
        this.$appId = str;
        this.$connectionFactory = function1;
        this.$tag = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PurchaseVerificationValidatorKt$verifyPurchaseWithHorizon$3(this.$props, this.$appId, this.$connectionFactory, this.$tag, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super VerifyPurchaseResultHorizon> continuation) {
        return ((PurchaseVerificationValidatorKt$verifyPurchaseWithHorizon$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String orElse;
        Gson gson;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VerifyPurchaseHorizonOptions horizon = this.$props.getHorizon();
        if (horizon == null) {
            throw new IllegalArgumentException("Horizon validation requires horizon options (sku, userId, accessToken)");
        }
        if (StringsKt.isBlank(horizon.getSku()) || StringsKt.isBlank(horizon.getUserId()) || StringsKt.isBlank(horizon.getAccessToken())) {
            throw new IllegalArgumentException("Horizon validation requires sku, userId, and accessToken");
        }
        HttpURLConnection invoke = this.$connectionFactory.invoke("https://graph.oculus.com/" + this.$appId + "/verify_entitlement");
        invoke.setRequestMethod("POST");
        invoke.setDoOutput(true);
        invoke.setRequestProperty("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
        try {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("access_token=" + URLEncoder.encode(horizon.getAccessToken(), CharEncoding.UTF_8));
                sb.append("&user_id=" + URLEncoder.encode(horizon.getUserId(), CharEncoding.UTF_8));
                sb.append("&sku=" + URLEncoder.encode(horizon.getSku(), CharEncoding.UTF_8));
                String sb2 = sb.toString();
                BufferedReader outputStream = invoke.getOutputStream();
                try {
                    byte[] bytes = sb2.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    outputStream.write(bytes);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(outputStream, null);
                    int responseCode = invoke.getResponseCode();
                    InputStream errorStream = (200 > responseCode || responseCode >= 300) ? invoke.getErrorStream() : invoke.getInputStream();
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
                        OpenIapLog.INSTANCE.warn("Horizon verifyPurchase failed (HTTP " + responseCode + ")", this.$tag);
                        throw OpenIapError.InvalidPurchaseVerification.INSTANCE;
                    }
                    try {
                        Type type = new TypeToken<Map<String, ? extends Object>>() { // from class: dev.hyo.openiap.utils.PurchaseVerificationValidatorKt$verifyPurchaseWithHorizon$3$mapType$1
                        }.getType();
                        gson = PurchaseVerificationValidatorKt.gson;
                        Map map = (Map) gson.fromJson(orElse, type);
                        Object obj2 = map.get("success");
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        Object obj3 = map.get("grant_time");
                        Number number = obj3 instanceof Number ? (Number) obj3 : null;
                        return new VerifyPurchaseResultHorizon(number != null ? Boxing.boxDouble(number.doubleValue()) : null, booleanValue);
                    } catch (JsonSyntaxException e) {
                        OpenIapLog.INSTANCE.warn("Failed to parse Horizon verification response: " + e.getMessage(), this.$tag);
                        throw OpenIapError.InvalidPurchaseVerification.INSTANCE;
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } catch (IOException e2) {
                OpenIapLog.INSTANCE.warn("Network error during Horizon verification: " + e2.getMessage(), this.$tag);
                throw OpenIapError.NetworkError.INSTANCE;
            }
        } finally {
            invoke.disconnect();
        }
    }
}
