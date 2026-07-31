package dev.hyo.openiap.utils;

import com.android.billingclient.api.BillingClient;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapLog;
import dev.hyo.openiap.VerifyPurchaseGoogleOptions;
import dev.hyo.openiap.VerifyPurchaseProps;
import dev.hyo.openiap.VerifyPurchaseResultAndroid;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/VerifyPurchaseResultAndroid;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.utils.PurchaseVerificationValidatorKt$verifyPurchaseWithGooglePlay$3", f = "PurchaseVerificationValidator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class PurchaseVerificationValidatorKt$verifyPurchaseWithGooglePlay$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VerifyPurchaseResultAndroid>, Object> {
    final /* synthetic */ Function1<String, HttpURLConnection> $connectionFactory;
    final /* synthetic */ VerifyPurchaseProps $props;
    final /* synthetic */ String $tag;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PurchaseVerificationValidatorKt$verifyPurchaseWithGooglePlay$3(VerifyPurchaseProps verifyPurchaseProps, Function1<? super String, ? extends HttpURLConnection> function1, String str, Continuation<? super PurchaseVerificationValidatorKt$verifyPurchaseWithGooglePlay$3> continuation) {
        super(2, continuation);
        this.$props = verifyPurchaseProps;
        this.$connectionFactory = function1;
        this.$tag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PurchaseVerificationValidatorKt$verifyPurchaseWithGooglePlay$3(this.$props, this.$connectionFactory, this.$tag, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super VerifyPurchaseResultAndroid> continuation) {
        return ((PurchaseVerificationValidatorKt$verifyPurchaseWithGooglePlay$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String encodePathSegment;
        String encodePathSegment2;
        String encodePathSegment3;
        String orElse;
        Gson gson;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VerifyPurchaseGoogleOptions google = this.$props.getGoogle();
        if (google == null) {
            throw new IllegalArgumentException("Google Play validation requires google options (packageName, purchaseToken, accessToken)");
        }
        String packageName = google.getPackageName();
        String purchaseToken = google.getPurchaseToken();
        String accessToken = google.getAccessToken();
        Boolean isSub = google.isSub();
        if (StringsKt.isBlank(packageName) || StringsKt.isBlank(purchaseToken) || StringsKt.isBlank(accessToken)) {
            throw new IllegalArgumentException("Google Play validation requires packageName, purchaseToken, and accessToken");
        }
        String sku = google.getSku();
        String str = Intrinsics.areEqual(isSub, Boxing.boxBoolean(true)) ? BillingClient.FeatureType.SUBSCRIPTIONS : "products";
        encodePathSegment = PurchaseVerificationValidatorKt.encodePathSegment(packageName);
        encodePathSegment2 = PurchaseVerificationValidatorKt.encodePathSegment(sku);
        encodePathSegment3 = PurchaseVerificationValidatorKt.encodePathSegment(purchaseToken);
        HttpURLConnection invoke = this.$connectionFactory.invoke("https://androidpublisher.googleapis.com/androidpublisher/v3/applications/" + encodePathSegment + "/purchases/" + str + "/" + encodePathSegment2 + "/tokens/" + encodePathSegment3);
        invoke.setRequestMethod("GET");
        invoke.setRequestProperty("Content-Type", "application/json");
        invoke.setRequestProperty("Authorization", "Bearer " + accessToken);
        try {
            try {
                int responseCode = invoke.getResponseCode();
                InputStream errorStream = (200 > responseCode || responseCode >= 300) ? invoke.getErrorStream() : invoke.getInputStream();
                String str2 = null;
                if (errorStream != null) {
                    Reader inputStreamReader = new InputStreamReader(errorStream, Charsets.UTF_8);
                    BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    try {
                        String readText = TextStreamsKt.readText(bufferedReader);
                        CloseableKt.closeFinally(bufferedReader, null);
                        str2 = readText;
                    } finally {
                    }
                }
                orElse = PurchaseVerificationValidatorKt.orElse(str2, "");
                if (200 <= responseCode && responseCode < 300) {
                    try {
                        gson = PurchaseVerificationValidatorKt.gson;
                        VerifyPurchaseResultAndroid verifyPurchaseResultAndroid = (VerifyPurchaseResultAndroid) gson.fromJson(orElse, VerifyPurchaseResultAndroid.class);
                        if (verifyPurchaseResultAndroid != null) {
                            return verifyPurchaseResultAndroid;
                        }
                        throw OpenIapError.InvalidPurchaseVerification.INSTANCE;
                    } catch (JsonSyntaxException e) {
                        OpenIapLog.INSTANCE.warn("Failed to parse purchase verification response: " + e.getMessage(), this.$tag);
                        throw OpenIapError.InvalidPurchaseVerification.INSTANCE;
                    }
                }
                OpenIapLog.INSTANCE.warn("verifyPurchase failed (HTTP " + responseCode + "): " + orElse, this.$tag);
                throw OpenIapError.InvalidPurchaseVerification.INSTANCE;
            } catch (IOException e2) {
                OpenIapLog.INSTANCE.warn("Network error during purchase verification: " + e2.getMessage(), this.$tag);
                throw OpenIapError.NetworkError.INSTANCE;
            }
        } finally {
            invoke.disconnect();
        }
    }
}
