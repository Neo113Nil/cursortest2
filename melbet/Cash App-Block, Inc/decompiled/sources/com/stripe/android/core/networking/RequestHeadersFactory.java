package com.stripe.android.core.networking;

import android.os.Build;
import android.system.Os;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeRequest;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public abstract class RequestHeadersFactory {
    public static final String CHARSET;

    public final class Analytics extends RequestHeadersFactory {
        public static final EmptyMap extraHeaders;
        public static final Analytics INSTANCE = new Analytics();
        public static final String userAgent = "Stripe/v1 AndroidBindings/23.9.1";

        static {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            extraHeaders = emptyMap;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Analytics);
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public final Map getExtraHeaders() {
            return extraHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public final String getUserAgent() {
            return userAgent;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public final String getXStripeUserAgent() {
            LinkedHashMap defaultXStripeUserAgentMap = RequestHeadersFactory.defaultXStripeUserAgentMap();
            ArrayList arrayList = new ArrayList(defaultXStripeUserAgentMap.size());
            for (Map.Entry entry : defaultXStripeUserAgentMap.entrySet()) {
                arrayList.add(Boxes$$ExternalSyntheticOutline1.m("\"", (String) entry.getKey(), "\":\"", (String) entry.getValue(), "\""));
            }
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("{", CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62), "}");
        }

        public final int hashCode() {
            return -334358835;
        }

        public final String toString() {
            return "Analytics";
        }
    }

    public final class Api extends RequestHeadersFactory {
        public final String apiVersion;
        public final Locale locale;
        public final HCaptcha$$ExternalSyntheticLambda0 optionsProvider;
        public final Map postHeaders;
        public final String sdkVersion;
        public final NetworkTypeDetector stripeClientUserAgentHeaderFactory;

        public Api(ApiRequest.Options options, String str, String str2) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            options.getClass();
            str.getClass();
            str2.getClass();
            this.optionsProvider = new HCaptcha$$ExternalSyntheticLambda0(options, 14);
            this.locale = locale;
            this.apiVersion = str;
            this.sdkVersion = str2;
            this.stripeClientUserAgentHeaderFactory = new NetworkTypeDetector();
            StripeRequest.MimeType mimeType = StripeRequest.MimeType.Form;
            this.postHeaders = Thread$State$EnumUnboxingLocalUtility.m("Content-Type", Recorder$$ExternalSyntheticOutline2.m("application/x-www-form-urlencoded; charset=", RequestHeadersFactory.CHARSET));
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public final Map getExtraHeaders() {
            Map map;
            ApiRequest.Options options = (ApiRequest.Options) this.optionsProvider.f$0;
            LinkedHashMap plus = MapsKt__MapsKt.plus(MapsKt__MapsKt.mapOf(new Pair("Accept", "application/json"), new Pair("Stripe-Version", this.apiVersion), new Pair("Authorization", Recorder$$ExternalSyntheticOutline2.m("Bearer ", options.apiKey))), this.stripeClientUserAgentHeaderFactory.create());
            if (options.getApiKeyIsUserKey()) {
                map = Thread$State$EnumUnboxingLocalUtility.m("Stripe-Livemode", String.valueOf(!Intrinsics.areEqual(Os.getenv("Stripe-Livemode"), "false")));
            } else {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
            LinkedHashMap plus2 = MapsKt__MapsKt.plus(plus, map);
            String str = options.stripeAccount;
            Map m = str != null ? Thread$State$EnumUnboxingLocalUtility.m("Stripe-Account", str) : null;
            if (m == null) {
                m = EmptyMap.INSTANCE;
                m.getClass();
            }
            LinkedHashMap plus3 = MapsKt__MapsKt.plus(plus2, m);
            String str2 = options.idempotencyKey;
            Map m2 = str2 != null ? Thread$State$EnumUnboxingLocalUtility.m("Idempotency-Key", str2) : null;
            if (m2 == null) {
                m2 = EmptyMap.INSTANCE;
                m2.getClass();
            }
            LinkedHashMap plus4 = MapsKt__MapsKt.plus(plus3, m2);
            String languageTag = this.locale.toLanguageTag();
            languageTag.getClass();
            if (StringsKt.isBlank(languageTag) || languageTag.equals("und")) {
                languageTag = null;
            }
            Map m3 = languageTag != null ? Thread$State$EnumUnboxingLocalUtility.m("Accept-Language", languageTag) : null;
            if (m3 == null) {
                m3 = EmptyMap.INSTANCE;
                m3.getClass();
            }
            return MapsKt__MapsKt.plus(plus4, m3);
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public final String getUserAgent() {
            String str = this.sdkVersion;
            str.getClass();
            return CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{"Stripe/v1 ".concat(str), null}), " ", null, null, 0, null, null, 62);
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public final String getXStripeUserAgent() {
            LinkedHashMap defaultXStripeUserAgentMap = RequestHeadersFactory.defaultXStripeUserAgentMap();
            ArrayList arrayList = new ArrayList(defaultXStripeUserAgentMap.size());
            for (Map.Entry entry : defaultXStripeUserAgentMap.entrySet()) {
                arrayList.add(Boxes$$ExternalSyntheticOutline1.m("\"", (String) entry.getKey(), "\":\"", (String) entry.getValue(), "\""));
            }
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("{", CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62), "}");
        }
    }

    public final class FraudDetection extends RequestHeadersFactory {
        public final Map extraHeaders;
        public final Map postHeaders;
        public final String userAgent = "Stripe/v1 AndroidBindings/23.9.1";

        public FraudDetection(String str) {
            this.extraHeaders = Thread$State$EnumUnboxingLocalUtility.m("Cookie", "m=".concat(str));
            StripeRequest.MimeType mimeType = StripeRequest.MimeType.Form;
            this.postHeaders = Thread$State$EnumUnboxingLocalUtility.m("Content-Type", Recorder$$ExternalSyntheticOutline2.m("application/json; charset=", RequestHeadersFactory.CHARSET));
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public final Map getExtraHeaders() {
            return this.extraHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public final String getUserAgent() {
            return this.userAgent;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public final String getXStripeUserAgent() {
            LinkedHashMap defaultXStripeUserAgentMap = RequestHeadersFactory.defaultXStripeUserAgentMap();
            ArrayList arrayList = new ArrayList(defaultXStripeUserAgentMap.size());
            for (Map.Entry entry : defaultXStripeUserAgentMap.entrySet()) {
                arrayList.add(Boxes$$ExternalSyntheticOutline1.m("\"", (String) entry.getKey(), "\":\"", (String) entry.getValue(), "\""));
            }
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("{", CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62), "}");
        }
    }

    static {
        String name = Charsets.UTF_8.name();
        name.getClass();
        CHARSET = name;
    }

    public RequestHeadersFactory() {
        EmptyMap.INSTANCE.getClass();
    }

    public static LinkedHashMap defaultXStripeUserAgentMap() {
        Pair pair = new Pair("lang", "kotlin");
        Pair pair2 = new Pair("bindings_version", "23.9.1");
        Pair pair3 = new Pair("os_version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        return MapsKt__MapsKt.mutableMapOf(pair, pair2, pair3, new Pair("type", Boxes$$ExternalSyntheticOutline1.m$1(str, "_", str2, "_", str3)), new Pair("model", str3));
    }

    public final LinkedHashMap create() {
        return MapsKt__MapsKt.plus(getExtraHeaders(), MapsKt__MapsKt.mapOf(new Pair("User-Agent", getUserAgent()), new Pair("Accept-Charset", CHARSET), new Pair("X-Stripe-User-Agent", getXStripeUserAgent())));
    }

    public abstract Map getExtraHeaders();

    public abstract String getUserAgent();

    public abstract String getXStripeUserAgent();
}
