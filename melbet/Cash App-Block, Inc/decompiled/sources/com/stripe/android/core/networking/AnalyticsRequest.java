package com.stripe.android.core.networking;

import com.stripe.android.core.networking.StripeRequest;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* loaded from: classes8.dex */
public final class AnalyticsRequest extends StripeRequest {
    public final LinkedHashMap headers;
    public final StripeRequest.Method method;
    public final LinkedHashMap params;
    public final IntRange retryResponseCodes;
    public final String url;

    public AnalyticsRequest(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.params = linkedHashMap;
        this.headers = linkedHashMap2;
        String joinToString$default = CollectionsKt.joinToString$default(JsonUtilsKt.flattenParamsMap(null, JsonUtilsKt.compactParams(linkedHashMap)), "&", null, null, 0, null, new MarkdownParser$$ExternalSyntheticLambda0(4), 30);
        this.method = StripeRequest.Method.GET;
        StripeRequest.MimeType mimeType = StripeRequest.MimeType.Form;
        this.retryResponseCodes = new IntRange(HttpStatusCode.TOO_MANY_REQUESTS_429, HttpStatusCode.TOO_MANY_REQUESTS_429, 1);
        this.url = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{"https://q.stripe.com", joinToString$default.length() > 0 ? joinToString$default : null}), "?", null, null, 0, null, null, 62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsRequest)) {
            return false;
        }
        AnalyticsRequest analyticsRequest = (AnalyticsRequest) obj;
        return this.params.equals(analyticsRequest.params) && this.headers.equals(analyticsRequest.headers);
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
        return this.headers.hashCode() + (this.params.hashCode() * 31);
    }

    public final String toString() {
        return "AnalyticsRequest(params=" + this.params + ", headers=" + this.headers + ")";
    }
}
