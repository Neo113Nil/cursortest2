package okhttp3;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.EmptyTags;
import okhttp3.internal.Tags;
import okhttp3.internal._UtilCommonKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import papa.AppUpdateData;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class Request {
    public final RequestBody body;
    public final Headers headers;
    public CacheControl lazyCacheControl;
    public final String method;
    public final Tags tags;
    public final HttpUrl url;

    public final class Builder {
        public RequestBody body;
        public HttpUrl url;
        public Tags tags = EmptyTags.INSTANCE;
        public String method = "GET";
        public Headers.Builder headers = new Headers.Builder();

        public final void addHeader(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.headers.add(str, str2);
        }

        public final void header(String str, String str2) {
            str.getClass();
            str2.getClass();
            Headers.Builder builder = this.headers;
            builder.getClass();
            AppUpdateData.headersCheckName(str);
            AppUpdateData.headersCheckValue(str2, str);
            builder.removeAll(str);
            AppUpdateData.commonAddLenient(builder, str, str2);
        }

        public final void method(String str, RequestBody requestBody) {
            str.getClass();
            if (str.length() <= 0) {
                a$$ExternalSyntheticBUOutline0.m$3("method.isEmpty() == true");
                return;
            }
            if (requestBody == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("method ", str, " must have a request body."));
                    return;
                }
            } else if (!SafeTrace.permitsRequestBody(str)) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("method ", str, " must not have a request body."));
                return;
            }
            this.method = str;
            this.body = requestBody;
        }

        public final void tag(Class cls, Object obj) {
            cls.getClass();
            this.tags = this.tags.plus(Reflection.factory.getOrCreateKotlinClass(cls), obj);
        }

        public final void url(String str) {
            str.getClass();
            if (StringsKt__StringsJVMKt.startsWith(str, "ws:", true)) {
                str = "http:".concat(str.substring(3));
            } else if (StringsKt__StringsJVMKt.startsWith(str, "wss:", true)) {
                str = "https:".concat(str.substring(4));
            }
            HttpUrl.Builder builder = new HttpUrl.Builder();
            builder.parse$okhttp(null, str);
            this.url = builder.build();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Request(HttpUrl httpUrl, Headers headers, String str, int i) {
        this(r5);
        if ((i & 2) != 0) {
            Headers headers2 = Headers.EMPTY;
            headers = TuplesKt.of(new String[0]);
        }
        str = (i & 4) != 0 ? WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR : str;
        httpUrl.getClass();
        headers.getClass();
        str.getClass();
        Builder builder = new Builder();
        builder.url = httpUrl;
        builder.headers = headers.newBuilder();
        builder.method(str.equals(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR) ? "GET" : str, null);
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.url = this.url;
        builder.method = this.method;
        builder.body = this.body;
        builder.tags = this.tags;
        builder.headers = this.headers.newBuilder();
        return builder;
    }

    public final Object tag(KClass kClass) {
        kClass.getClass();
        return PapaEvent.getJavaClass(kClass).cast(this.tags.get(kClass));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        Headers headers = this.headers;
        if (headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : headers) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.first;
                String str2 = (String) pair.second;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (_UtilCommonKt.isSensitiveHeader(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        EmptyTags emptyTags = EmptyTags.INSTANCE;
        Tags tags = this.tags;
        if (!Intrinsics.areEqual(tags, emptyTags)) {
            sb.append(", tags=");
            sb.append(tags);
        }
        sb.append('}');
        return sb.toString();
    }

    public Request(Builder builder) {
        builder.getClass();
        HttpUrl httpUrl = builder.url;
        if (httpUrl != null) {
            this.url = httpUrl;
            this.method = builder.method;
            this.headers = builder.headers.build();
            this.body = builder.body;
            this.tags = builder.tags;
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("url == null");
        throw null;
    }
}
