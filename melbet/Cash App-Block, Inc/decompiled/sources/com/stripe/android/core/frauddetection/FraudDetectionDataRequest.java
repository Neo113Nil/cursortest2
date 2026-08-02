package com.stripe.android.core.frauddetection;

import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.networking.StripeRequest;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* loaded from: classes8.dex */
public final class FraudDetectionDataRequest extends StripeRequest {
    public final LinkedHashMap headers;
    public final StripeRequest.Method method;
    public final Map params;
    public final Map postHeaders;
    public final IntRange retryResponseCodes;
    public final String url;

    public FraudDetectionDataRequest(Map map, String str) {
        this.params = map;
        RequestHeadersFactory.FraudDetection fraudDetection = new RequestHeadersFactory.FraudDetection(str);
        this.method = StripeRequest.Method.POST;
        StripeRequest.MimeType mimeType = StripeRequest.MimeType.Form;
        this.retryResponseCodes = NetworkConstantsKt.DEFAULT_RETRY_CODES;
        this.url = "https://m.stripe.com/6";
        this.headers = fraudDetection.create();
        this.postHeaders = fraudDetection.postHeaders;
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
    public final Map getPostHeaders() {
        return this.postHeaders;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public final Iterable getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public final String getUrl() {
        return this.url;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public final void writePostBody(OutputStream outputStream) {
        try {
            byte[] bytes = String.valueOf(StripeJsonUtils.mapToJsonObject(this.params)).getBytes(Charsets.UTF_8);
            bytes.getClass();
            outputStream.write(bytes);
            outputStream.flush();
        } catch (UnsupportedEncodingException e) {
            throw new InvalidRequestException(0, 7, null, null, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unable to encode parameters to ", Charsets.UTF_8.name(), ". Please contact support@stripe.com for assistance."), e);
        }
    }
}
