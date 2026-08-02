package io.appmetrica.analytics.networkapi;

import d3.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name */
    private final String f13257a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f13258b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f13259c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f13260d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f13261a;

        /* renamed from: b, reason: collision with root package name */
        private Method f13262b = Method.GET;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f13263c = new byte[0];

        /* renamed from: d, reason: collision with root package name */
        private final LinkedHashMap f13264d = new LinkedHashMap();

        public Builder(String str) {
            this.f13261a = str;
        }

        public final Builder addHeader(String str, String str2) {
            this.f13264d.put(str, str2);
            return this;
        }

        public final Request build() {
            return new Request(this.f13261a, this.f13262b, this.f13263c, t.G(this.f13264d), null);
        }

        public final Builder withBody(byte[] bArr) {
            this.f13263c = bArr;
            return this;
        }

        public final Builder withMethod(Method method) {
            this.f13262b = method;
            return this;
        }
    }

    public enum Method {
        GET("GET"),
        POST("POST");


        /* renamed from: a, reason: collision with root package name */
        private final String f13266a;

        Method(String str) {
            this.f13266a = str;
        }

        public final String getMethodName() {
            return this.f13266a;
        }
    }

    public /* synthetic */ Request(String str, Method method, byte[] bArr, Map map, e eVar) {
        this(str, method, bArr, map);
    }

    public final byte[] getBody() {
        return this.f13259c;
    }

    public final Map<String, String> getHeaders() {
        return this.f13260d;
    }

    public final Method getMethod() {
        return this.f13258b;
    }

    public final String getUrl() {
        return this.f13257a;
    }

    public String toString() {
        return "Request(url='" + this.f13257a + "', method='" + this.f13258b + "', bodyLength=" + this.f13259c.length + ", headers=" + this.f13260d + ')';
    }

    private Request(String str, Method method, byte[] bArr, Map map) {
        this.f13257a = str;
        this.f13258b = method;
        this.f13259c = bArr;
        this.f13260d = map;
    }
}
