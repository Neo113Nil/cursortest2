package dev.hyo.openiap.utils;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import dev.hyo.openiap.IapStore;
import dev.hyo.openiap.RequestVerifyPurchaseWithIapkitGoogleProps;
import dev.hyo.openiap.RequestVerifyPurchaseWithIapkitProps;
import dev.hyo.openiap.RequestVerifyPurchaseWithIapkitResult;
import dev.hyo.openiap.VerifyPurchaseProps;
import dev.hyo.openiap.VerifyPurchaseResultAndroid;
import dev.hyo.openiap.VerifyPurchaseResultHorizon;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PurchaseVerificationValidator.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002\u001a4\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u000fH\u0086@¢\u0006\u0002\u0010\u0010\u001a<\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u000fH\u0086@¢\u0006\u0002\u0010\u0014\u001a4\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u000fH\u0086@¢\u0006\u0002\u0010\u0018\u001a\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u000b\u001a\u00020\u0017H\u0002\u001a\u0016\u0010\u001c\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002\u001a \u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"DEFAULT_IAPKIT_ENDPOINT", "", "gson", "Lcom/google/gson/Gson;", "openConnection", "Ljava/net/HttpURLConnection;", ImagesContract.URL, "encodePathSegment", "value", "verifyPurchaseWithGooglePlay", "Ldev/hyo/openiap/VerifyPurchaseResultAndroid;", "props", "Ldev/hyo/openiap/VerifyPurchaseProps;", "tag", "connectionFactory", "Lkotlin/Function1;", "(Ldev/hyo/openiap/VerifyPurchaseProps;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyPurchaseWithHorizon", "Ldev/hyo/openiap/VerifyPurchaseResultHorizon;", "appId", "(Ldev/hyo/openiap/VerifyPurchaseProps;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyPurchaseWithIapkit", "Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitResult;", "Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitProps;", "(Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitProps;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildGooglePayload", "", "", "orElse", "fallback", "extractIapkitErrorMessage", "json", "openiap_playRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PurchaseVerificationValidatorKt {
    private static final String DEFAULT_IAPKIT_ENDPOINT = "https://api.iapkit.com/v1/purchase/verify";
    private static final Gson gson = new Gson();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String orElse(String str, String str2) {
        return str == null ? str2 : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpURLConnection openConnection(String str) {
        URLConnection openConnection = new URL(str).openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodePathSegment(String str) {
        String encode = URLEncoder.encode(str, Charsets.UTF_8.name());
        Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        return StringsKt.replace$default(encode, "+", "%20", false, 4, (Object) null);
    }

    public static /* synthetic */ Object verifyPurchaseWithGooglePlay$default(VerifyPurchaseProps verifyPurchaseProps, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = PurchaseVerificationValidatorKt$verifyPurchaseWithGooglePlay$2.INSTANCE;
        }
        return verifyPurchaseWithGooglePlay(verifyPurchaseProps, str, function1, continuation);
    }

    public static final Object verifyPurchaseWithGooglePlay(VerifyPurchaseProps verifyPurchaseProps, String str, Function1<? super String, ? extends HttpURLConnection> function1, Continuation<? super VerifyPurchaseResultAndroid> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new PurchaseVerificationValidatorKt$verifyPurchaseWithGooglePlay$3(verifyPurchaseProps, function1, str, null), continuation);
    }

    public static /* synthetic */ Object verifyPurchaseWithHorizon$default(VerifyPurchaseProps verifyPurchaseProps, String str, String str2, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = PurchaseVerificationValidatorKt$verifyPurchaseWithHorizon$2.INSTANCE;
        }
        return verifyPurchaseWithHorizon(verifyPurchaseProps, str, str2, function1, continuation);
    }

    public static final Object verifyPurchaseWithHorizon(VerifyPurchaseProps verifyPurchaseProps, String str, String str2, Function1<? super String, ? extends HttpURLConnection> function1, Continuation<? super VerifyPurchaseResultHorizon> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new PurchaseVerificationValidatorKt$verifyPurchaseWithHorizon$3(verifyPurchaseProps, str, function1, str2, null), continuation);
    }

    public static /* synthetic */ Object verifyPurchaseWithIapkit$default(RequestVerifyPurchaseWithIapkitProps requestVerifyPurchaseWithIapkitProps, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = PurchaseVerificationValidatorKt$verifyPurchaseWithIapkit$2.INSTANCE;
        }
        return verifyPurchaseWithIapkit(requestVerifyPurchaseWithIapkitProps, str, function1, continuation);
    }

    public static final Object verifyPurchaseWithIapkit(RequestVerifyPurchaseWithIapkitProps requestVerifyPurchaseWithIapkitProps, String str, Function1<? super String, ? extends HttpURLConnection> function1, Continuation<? super RequestVerifyPurchaseWithIapkitResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new PurchaseVerificationValidatorKt$verifyPurchaseWithIapkit$3(requestVerifyPurchaseWithIapkitProps, function1, str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Object> buildGooglePayload(RequestVerifyPurchaseWithIapkitProps requestVerifyPurchaseWithIapkitProps) {
        RequestVerifyPurchaseWithIapkitGoogleProps google = requestVerifyPurchaseWithIapkitProps.getGoogle();
        if (google == null) {
            throw new IllegalArgumentException("IAPKit Google verification requires google options");
        }
        if (StringsKt.isBlank(google.getPurchaseToken())) {
            throw new IllegalArgumentException("IAPKit Google verification requires purchaseToken");
        }
        return MapsKt.mutableMapOf(TuplesKt.to("store", IapStore.Google.getRawValue()), TuplesKt.to("purchaseToken", google.getPurchaseToken()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String extractIapkitErrorMessage(Map<String, ? extends Object> map) {
        Object obj = map.get("errors");
        if (obj instanceof List) {
            Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) obj);
            if (firstOrNull instanceof Map) {
                return extractIapkitErrorMessage((Map) firstOrNull);
            }
        }
        Object obj2 = map.get("details");
        if (obj2 instanceof Map) {
            Object obj3 = ((Map) obj2).get("originalError");
            if (obj3 instanceof String) {
                try {
                    Object fromJson = gson.fromJson((String) obj3, (Class<Object>) Map.class);
                    Map map2 = fromJson instanceof Map ? (Map) fromJson : null;
                    if (map2 != null) {
                        String extractIapkitErrorMessage = extractIapkitErrorMessage(map2);
                        return extractIapkitErrorMessage == null ? (String) obj3 : extractIapkitErrorMessage;
                    }
                    return (String) obj3;
                } catch (Exception unused) {
                    return (String) obj3;
                }
            }
        }
        Object obj4 = map.get("message");
        String str = obj4 instanceof String ? (String) obj4 : null;
        if (str != null && !StringsKt.contains$default((CharSequence) str, (CharSequence) "{\"error\"", false, 2, (Object) null)) {
            return str;
        }
        Object obj5 = map.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (obj5 instanceof String) {
            return (String) obj5;
        }
        return null;
    }
}
