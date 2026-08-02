package com.stripe.android.core.networking;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.ng$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.StripeRequest;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes8.dex */
public final class AnalyticsRequestV2 extends StripeRequest {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String clientId;
    public final double created;
    public final String eventName;
    public final Map headers;
    public final StripeRequest.Method method;
    public final StripeRequest.MimeType mimeType;
    public final String origin;
    public final JsonElement params;
    public final String postParameters;
    public final Iterable retryResponseCodes;
    public final String url;

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"com/stripe/android/core/networking/AnalyticsRequestV2$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "HEADER_ORIGIN", "Ljava/lang/String;", "PARAM_CLIENT_ID", "PARAM_CREATED", "PARAM_EVENT_NAME", "PARAM_EVENT_ID", "PARAM_USES_WORK_MANAGER", "PARAM_IS_RETRY", "PARAM_DELAYED", "INDENTATION", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return AnalyticsRequestV2$$serializer.INSTANCE;
        }
    }

    public final class Parameter {
        public final String key;
        public final String value;

        public Parameter(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.key = str;
            this.value = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Parameter)) {
                return false;
            }
            Parameter parameter = (Parameter) obj;
            return Intrinsics.areEqual(this.key, parameter.key) && Intrinsics.areEqual(this.value, parameter.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.key.hashCode() * 31);
        }

        public final String toString() {
            Charset charset = Charsets.UTF_8;
            String encode = URLEncoder.encode(this.key, charset.name());
            encode.getClass();
            String encode2 = URLEncoder.encode(this.value, charset.name());
            encode2.getClass();
            return Recorder$$ExternalSyntheticOutline2.m(encode, "=", encode2);
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Luhn$$ExternalSyntheticLambda0(12)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Luhn$$ExternalSyntheticLambda0(13)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Luhn$$ExternalSyntheticLambda0(14)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Luhn$$ExternalSyntheticLambda0(15)), null};
    }

    public AnalyticsRequestV2(int i, String str, String str2, String str3, double d, JsonElement jsonElement, String str4, Map map, StripeRequest.Method method, StripeRequest.MimeType mimeType, Iterable iterable, String str5) {
        if (31 != (i & 31)) {
            TuplesKt.throwMissingFieldException(i, 31, AnalyticsRequestV2$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventName = str;
        this.clientId = str2;
        this.origin = str3;
        this.created = d;
        this.params = jsonElement;
        if ((i & 32) == 0) {
            this.postParameters = createPostParams();
        } else {
            this.postParameters = str4;
        }
        if ((i & 64) == 0) {
            StripeRequest.MimeType mimeType2 = StripeRequest.MimeType.Form;
            this.headers = MapsKt__MapsKt.mapOf(new Pair("Content-Type", Recorder$$ExternalSyntheticOutline2.m("application/x-www-form-urlencoded; charset=", Charsets.UTF_8.name())), new Pair("origin", str3), new Pair("User-Agent", "Stripe/v1 android/23.9.1"));
        } else {
            this.headers = map;
        }
        if ((i & 128) == 0) {
            this.method = StripeRequest.Method.POST;
        } else {
            this.method = method;
        }
        if ((i & 256) == 0) {
            this.mimeType = StripeRequest.MimeType.Form;
        } else {
            this.mimeType = mimeType;
        }
        if ((i & 512) == 0) {
            this.retryResponseCodes = new IntRange(HttpStatusCode.TOO_MANY_REQUESTS_429, HttpStatusCode.TOO_MANY_REQUESTS_429, 1);
        } else {
            this.retryResponseCodes = iterable;
        }
        if ((i & 1024) == 0) {
            this.url = "https://r.stripe.com/0";
        } else {
            this.url = str5;
        }
    }

    public static String encodeMapParam(int i, Map map) {
        StringBuilder sb = new StringBuilder("{\n");
        TreeMap treeMap = new TreeMap(new ng$$ExternalSyntheticLambda0(26));
        treeMap.putAll(map);
        boolean z = true;
        for (Map.Entry entry : treeMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String encodeMapParam = value instanceof Map ? encodeMapParam(i + 1, (Map) value) : value == null ? "" : JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\"", "\"", value);
            if (!StringsKt.isBlank(encodeMapParam)) {
                if (z) {
                    sb.append(StringsKt__StringsJVMKt.repeat(i, "  "));
                    sb.append("  \"" + key + "\": " + encodeMapParam);
                    z = false;
                } else {
                    sb.append(",\n");
                    sb.append(StringsKt__StringsJVMKt.repeat(i, "  "));
                    sb.append("  \"" + key + "\": " + encodeMapParam);
                }
            }
        }
        sb.append('\n');
        sb.append(StringsKt__StringsJVMKt.repeat(i, "  "));
        sb.append("}");
        return sb.toString();
    }

    public final String createPostParams() {
        LinkedHashMap plus = MapsKt__MapsKt.plus(JsonUtilsKt.toMap(this.params), MapsKt__MapsKt.mapOf(new Pair("client_id", this.clientId), new Pair("created", Double.valueOf(this.created)), new Pair("event_name", this.eventName), new Pair("event_id", UUID.randomUUID().toString())));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : JsonUtilsKt.compactParams(plus).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                arrayList.add(new Parameter(str, encodeMapParam(0, (Map) value)));
            } else {
                arrayList.add(new Parameter(str, value.toString()));
            }
        }
        return CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, new MarkdownParser$$ExternalSyntheticLambda0(1), 30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsRequestV2)) {
            return false;
        }
        AnalyticsRequestV2 analyticsRequestV2 = (AnalyticsRequestV2) obj;
        return Intrinsics.areEqual(this.eventName, analyticsRequestV2.eventName) && Intrinsics.areEqual(this.clientId, analyticsRequestV2.clientId) && Intrinsics.areEqual(this.origin, analyticsRequestV2.origin) && Double.compare(this.created, analyticsRequestV2.created) == 0 && Intrinsics.areEqual(this.params, analyticsRequestV2.params);
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public final Map getHeaders() {
        return this.headers;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public final StripeRequest.Method getMethod() {
        return this.method;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public final Iterable getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.params.hashCode() + Fragment$5$$ExternalSyntheticOutline0.m(this.created, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.eventName.hashCode() * 31, 31, this.clientId), 31, this.origin), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AnalyticsRequestV2(eventName=", this.eventName, ", clientId=", this.clientId, ", origin=");
        m.append(this.origin);
        m.append(", created=");
        m.append(this.created);
        m.append(", params=");
        m.append(this.params);
        m.append(")");
        return m.toString();
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public final void writePostBody(OutputStream outputStream) {
        byte[] bytes = this.postParameters.getBytes(Charsets.UTF_8);
        bytes.getClass();
        outputStream.write(bytes);
        outputStream.flush();
    }

    public AnalyticsRequestV2(String str, String str2, String str3, double d, JsonElement jsonElement) {
        this.eventName = str;
        this.clientId = str2;
        this.origin = str3;
        this.created = d;
        this.params = jsonElement;
        this.postParameters = createPostParams();
        StripeRequest.MimeType mimeType = StripeRequest.MimeType.Form;
        this.headers = MapsKt__MapsKt.mapOf(new Pair("Content-Type", Recorder$$ExternalSyntheticOutline2.m("application/x-www-form-urlencoded; charset=", Charsets.UTF_8.name())), new Pair("origin", str3), new Pair("User-Agent", "Stripe/v1 android/23.9.1"));
        this.method = StripeRequest.Method.POST;
        this.mimeType = mimeType;
        this.retryResponseCodes = new IntRange(HttpStatusCode.TOO_MANY_REQUESTS_429, HttpStatusCode.TOO_MANY_REQUESTS_429, 1);
        this.url = "https://r.stripe.com/0";
    }
}
