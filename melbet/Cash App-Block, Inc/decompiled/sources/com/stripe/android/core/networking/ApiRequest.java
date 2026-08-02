package com.stripe.android.core.networking;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.networking.StripeRequest;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes8.dex */
public final class ApiRequest extends StripeRequest {
    public final String apiVersion;
    public final String baseUrl;
    public final LinkedHashMap headers;
    public final StripeRequest.Method method;
    public final Options options;
    public final Map params;
    public final Map postHeaders;
    public final String query;
    public final IntRange retryResponseCodes;
    public final String sdkVersion;

    public ApiRequest(StripeRequest.Method method, String str, Map map, Options options, String str2, String str3) {
        options.getClass();
        str2.getClass();
        str3.getClass();
        this.method = method;
        this.baseUrl = str;
        this.params = map;
        this.options = options;
        this.apiVersion = str2;
        this.sdkVersion = str3;
        this.query = map != null ? CollectionsKt.joinToString$default(JsonUtilsKt.flattenParamsMap(null, JsonUtilsKt.compactParams(map)), "&", null, null, 0, null, new MarkdownParser$$ExternalSyntheticLambda0(4), 30) : "";
        RequestHeadersFactory.Api api = new RequestHeadersFactory.Api(options, str2, str3);
        StripeRequest.MimeType mimeType = StripeRequest.MimeType.Form;
        this.retryResponseCodes = NetworkConstantsKt.DEFAULT_RETRY_CODES;
        this.headers = api.create();
        this.postHeaders = api.postHeaders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiRequest)) {
            return false;
        }
        ApiRequest apiRequest = (ApiRequest) obj;
        return this.method == apiRequest.method && this.baseUrl.equals(apiRequest.baseUrl) && Intrinsics.areEqual(this.params, apiRequest.params) && Intrinsics.areEqual(this.options, apiRequest.options) && Intrinsics.areEqual(this.apiVersion, apiRequest.apiVersion) && Intrinsics.areEqual(this.sdkVersion, apiRequest.sdkVersion);
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
    public final boolean getShouldCache() {
        return false;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public final String getUrl() {
        StripeRequest.Method method = StripeRequest.Method.GET;
        String str = this.baseUrl;
        StripeRequest.Method method2 = this.method;
        if (method != method2 && StripeRequest.Method.DELETE != method2) {
            return str;
        }
        String str2 = this.query;
        if (str2.length() <= 0) {
            str2 = null;
        }
        return CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str, str2}), StringsKt.contains((CharSequence) str, (CharSequence) "?", false) ? "&" : "?", null, null, 0, null, null, 62);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.method.hashCode() * 31, 31, this.baseUrl);
        Map map = this.params;
        return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.options.hashCode() + ((m + (map == null ? 0 : map.hashCode())) * 31)) * 961, 31, this.apiVersion), 31, this.sdkVersion);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.method.code, " ", this.baseUrl);
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public final void writePostBody(OutputStream outputStream) {
        try {
            byte[] bytes = this.query.getBytes(Charsets.UTF_8);
            bytes.getClass();
            outputStream.write(bytes);
            outputStream.flush();
        } catch (UnsupportedEncodingException e) {
            throw new InvalidRequestException(0, 7, null, null, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unable to encode parameters to ", Charsets.UTF_8.name(), ". Please contact support@stripe.com for assistance."), e);
        }
    }

    public final class Factory {
        public final String apiVersion;
        public final String sdkVersion;

        public Factory(String str) {
            this.apiVersion = str;
            this.sdkVersion = "AndroidBindings/23.9.1";
        }

        public static ApiRequest createGet$default(Factory factory, String str, Options options, Map map) {
            factory.getClass();
            options.getClass();
            return new ApiRequest(StripeRequest.Method.GET, str, map, options, factory.apiVersion, factory.sdkVersion);
        }

        public static ApiRequest createPost$default(Factory factory, String str, Options options, Map map) {
            factory.getClass();
            options.getClass();
            return new ApiRequest(StripeRequest.Method.POST, str, map, options, factory.apiVersion, factory.sdkVersion);
        }

        public Factory(String str, String str2) {
            this.apiVersion = str;
            this.sdkVersion = str2;
        }
    }

    public final class Options implements Parcelable {
        public static final Parcelable.Creator<Options> CREATOR = new Creator();
        public final String apiKey;
        public final String idempotencyKey;
        public final String stripeAccount;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Options(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Options[i];
            }
        }

        public Options(String str, String str2, String str3) {
            str.getClass();
            this.apiKey = str;
            this.stripeAccount = str2;
            this.idempotencyKey = str3;
            if (StringsKt.isBlank(str)) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys");
                throw null;
            }
            if (StringsKt__StringsJVMKt.startsWith(str, "sk_", false)) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
                throw null;
            }
            if (StringsKt__StringsJVMKt.startsWith(str, "rk_", false)) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid Publishable Key: You are using a restricted key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Options)) {
                return false;
            }
            Options options = (Options) obj;
            return Intrinsics.areEqual(this.apiKey, options.apiKey) && Intrinsics.areEqual(this.stripeAccount, options.stripeAccount) && Intrinsics.areEqual(this.idempotencyKey, options.idempotencyKey);
        }

        public final boolean getApiKeyIsUserKey() {
            return StringsKt__StringsJVMKt.startsWith(this.apiKey, "uk_", false);
        }

        public final int hashCode() {
            int hashCode = this.apiKey.hashCode() * 31;
            String str = this.stripeAccount;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.idempotencyKey;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return "Options(apiKey=***)";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.apiKey);
            parcel.writeString(this.stripeAccount);
            parcel.writeString(this.idempotencyKey);
        }

        public /* synthetic */ Options(String str, String str2, int i) {
            this(str, (i & 2) != 0 ? null : str2, (String) null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Options(Function0 function0, Function0 function02) {
            this((String) function0.invoke(), (String) function02.invoke(), 4);
            function0.getClass();
            function02.getClass();
        }
    }
}
