package okhttp3;

import com.ironsource.jn;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

@Metadata
/* loaded from: classes3.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name */
    private final HttpUrl f42523a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42524b;

    /* renamed from: c, reason: collision with root package name */
    private final Headers f42525c;

    /* renamed from: d, reason: collision with root package name */
    private final RequestBody f42526d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f42527e;

    /* renamed from: f, reason: collision with root package name */
    private CacheControl f42528f;

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f42523a = url;
        this.f42524b = method;
        this.f42525c = headers;
        this.f42526d = requestBody;
        this.f42527e = tags;
    }

    public final RequestBody a() {
        return this.f42526d;
    }

    public final CacheControl b() {
        CacheControl cacheControl = this.f42528f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl b4 = CacheControl.f42164n.b(this.f42525c);
        this.f42528f = b4;
        return b4;
    }

    public final Map c() {
        return this.f42527e;
    }

    public final String d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f42525c.b(name);
    }

    public final List e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f42525c.g(name);
    }

    public final Headers f() {
        return this.f42525c;
    }

    public final boolean g() {
        return this.f42523a.i();
    }

    public final String h() {
        return this.f42524b;
    }

    public final Builder i() {
        return new Builder(this);
    }

    public final HttpUrl j() {
        return this.f42523a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f42524b);
        sb.append(", url=");
        sb.append(this.f42523a);
        if (this.f42525c.size() != 0) {
            sb.append(", headers=[");
            int i4 = 0;
            for (Pair<? extends String, ? extends String> pair : this.f42525c) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String component1 = pair2.component1();
                String component2 = pair2.component2();
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(component1);
                sb.append(':');
                sb.append(component2);
                i4 = i5;
            }
            sb.append(']');
        }
        if (!this.f42527e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f42527e);
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Metadata
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private HttpUrl f42529a;

        /* renamed from: b, reason: collision with root package name */
        private String f42530b;

        /* renamed from: c, reason: collision with root package name */
        private Headers.Builder f42531c;

        /* renamed from: d, reason: collision with root package name */
        private RequestBody f42532d;

        /* renamed from: e, reason: collision with root package name */
        private Map f42533e;

        public Builder() {
            this.f42533e = new LinkedHashMap();
            this.f42530b = jn.f16864a;
            this.f42531c = new Headers.Builder();
        }

        public Request a() {
            HttpUrl httpUrl = this.f42529a;
            if (httpUrl != null) {
                return new Request(httpUrl, this.f42530b, this.f42531c.d(), this.f42532d, Util.V(this.f42533e));
            }
            throw new IllegalStateException("url == null");
        }

        public Builder b(CacheControl cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            return cacheControl2.length() == 0 ? h("Cache-Control") : d("Cache-Control", cacheControl2);
        }

        public Builder c() {
            return f(jn.f16864a, null);
        }

        public Builder d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f42531c.h(name, value);
            return this;
        }

        public Builder e(Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f42531c = headers.e();
            return this;
        }

        public Builder f(String method, RequestBody requestBody) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                if (HttpMethod.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!HttpMethod.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f42530b = method;
            this.f42532d = requestBody;
            return this;
        }

        public Builder g(RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return f(jn.f16865b, body);
        }

        public Builder h(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f42531c.g(name);
            return this;
        }

        public Builder i(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.I(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String substring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                url = sb.toString();
            } else if (StringsKt.I(url, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String substring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                url = sb2.toString();
            }
            return j(HttpUrl.f42390k.d(url));
        }

        public Builder j(HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f42529a = url;
            return this;
        }

        public Builder(Request request) {
            Map mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f42533e = new LinkedHashMap();
            this.f42529a = request.j();
            this.f42530b = request.h();
            this.f42532d = request.a();
            if (request.c().isEmpty()) {
                mutableMap = new LinkedHashMap();
            } else {
                mutableMap = MapsKt.toMutableMap(request.c());
            }
            this.f42533e = mutableMap;
            this.f42531c = request.f().e();
        }
    }
}
