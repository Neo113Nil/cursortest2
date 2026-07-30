package okhttp3;

import com.baidu.mapapi.http.wrapper.HttpManager;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.m0;
import kotlin.jvm.internal.s;
import kotlin.text.t;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* loaded from: classes5.dex */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = HttpManager.HTTP_GET;
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i8 & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        public Builder addHeader(String name, String value) {
            s.checkNotNullParameter(name, "name");
            s.checkNotNullParameter(value, "value");
            getHeaders$okhttp().add(name, value);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public Builder cacheControl(CacheControl cacheControl) {
            s.checkNotNullParameter(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            return cacheControl2.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", cacheControl2);
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder get() {
            return method(HttpManager.HTTP_GET, null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder header(String name, String value) {
            s.checkNotNullParameter(name, "name");
            s.checkNotNullParameter(value, "value");
            getHeaders$okhttp().set(name, value);
            return this;
        }

        public Builder headers(Headers headers) {
            s.checkNotNullParameter(headers, "headers");
            setHeaders$okhttp(headers.newBuilder());
            return this;
        }

        public Builder method(String method, RequestBody requestBody) {
            s.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (requestBody == null) {
                if (!(!HttpMethod.requiresRequestBody(method))) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            setMethod$okhttp(method);
            setBody$okhttp(requestBody);
            return this;
        }

        public Builder patch(RequestBody body) {
            s.checkNotNullParameter(body, "body");
            return method("PATCH", body);
        }

        public Builder post(RequestBody body) {
            s.checkNotNullParameter(body, "body");
            return method(HttpManager.HTTP_POST, body);
        }

        public Builder put(RequestBody body) {
            s.checkNotNullParameter(body, "body");
            return method(HttpManager.HTTP_PUT, body);
        }

        public Builder removeHeader(String name) {
            s.checkNotNullParameter(name, "name");
            getHeaders$okhttp().removeAll(name);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            s.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            s.checkNotNullParameter(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            s.checkNotNullParameter(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl url) {
            s.checkNotNullParameter(url, "url");
            setUrl$okhttp(url);
            return this;
        }

        public Builder delete(RequestBody requestBody) {
            return method(HttpManager.HTTP_DELETE, requestBody);
        }

        public <T> Builder tag(Class<? super T> type, T t7) {
            s.checkNotNullParameter(type, "type");
            if (t7 == null) {
                getTags$okhttp().remove(type);
            } else {
                if (getTags$okhttp().isEmpty()) {
                    setTags$okhttp(new LinkedHashMap());
                }
                Map<Class<?>, Object> tags$okhttp = getTags$okhttp();
                T cast = type.cast(t7);
                s.checkNotNull(cast);
                tags$okhttp.put(type, cast);
            }
            return this;
        }

        public Builder url(String url) {
            s.checkNotNullParameter(url, "url");
            if (t.startsWith(url, "ws:", true)) {
                String substring = url.substring(3);
                s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                url = s.stringPlus("http:", substring);
            } else if (t.startsWith(url, "wss:", true)) {
                String substring2 = url.substring(4);
                s.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                url = s.stringPlus("https:", substring2);
            }
            return url(HttpUrl.Companion.get(url));
        }

        public Builder(Request request) {
            Map<Class<?>, Object> mutableMap;
            s.checkNotNullParameter(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (!request.getTags$okhttp().isEmpty()) {
                mutableMap = m0.toMutableMap(request.getTags$okhttp());
            } else {
                mutableMap = new LinkedHashMap<>();
            }
            this.tags = mutableMap;
            this.headers = request.headers().newBuilder();
        }

        public Builder url(URL url) {
            s.checkNotNullParameter(url, "url");
            HttpUrl.Companion companion = HttpUrl.Companion;
            String url2 = url.toString();
            s.checkNotNullExpressionValue(url2, "url.toString()");
            return url(companion.get(url2));
        }
    }

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> tags) {
        s.checkNotNullParameter(url, "url");
        s.checkNotNullParameter(method, "method");
        s.checkNotNullParameter(headers, "headers");
        s.checkNotNullParameter(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = requestBody;
        this.tags = tags;
    }

    /* renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m1413deprecated_body() {
        return this.body;
    }

    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m1414deprecated_cacheControl() {
        return cacheControl();
    }

    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m1415deprecated_headers() {
        return this.headers;
    }

    /* renamed from: -deprecated_method, reason: not valid java name */
    public final String m1416deprecated_method() {
        return this.method;
    }

    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m1417deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = parse;
        return parse;
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String name) {
        s.checkNotNullParameter(name, "name");
        return this.headers.get(name);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(method());
        sb.append(", url=");
        sb.append(url());
        if (headers().size() != 0) {
            sb.append(", headers=[");
            int i8 = 0;
            for (Pair<? extends String, ? extends String> pair : headers()) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String component1 = pair2.component1();
                String component2 = pair2.component2();
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(component1);
                sb.append(':');
                sb.append(component2);
                i8 = i9;
            }
            sb.append(']');
        }
        if (!getTags$okhttp().isEmpty()) {
            sb.append(", tags=");
            sb.append(getTags$okhttp());
        }
        sb.append('}');
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final List<String> headers(String name) {
        s.checkNotNullParameter(name, "name");
        return this.headers.values(name);
    }

    public final <T> T tag(Class<? extends T> type) {
        s.checkNotNullParameter(type, "type");
        return type.cast(this.tags.get(type));
    }
}
