package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import io.appmetrica.analytics.network.impl.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Request {

    /* renamed from: a, reason: collision with root package name */
    private final String f9827a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9828b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f9829c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f9830d;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f9831a;

        /* renamed from: b, reason: collision with root package name */
        private String f9832b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f9833c = new byte[0];

        /* renamed from: d, reason: collision with root package name */
        private final HashMap f9834d = new HashMap();

        public Builder(String str) {
            this.f9831a = str;
        }

        public Builder addHeader(String str, String str2) {
            this.f9834d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f9831a, this.f9832b, this.f9833c, this.f9834d, 0);
        }

        public Builder post(byte[] bArr) {
            this.f9833c = bArr;
            return withMethod("POST");
        }

        public Builder withMethod(String str) {
            this.f9832b = str;
            return this;
        }
    }

    public /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap hashMap, int i2) {
        this(str, str2, bArr, hashMap);
    }

    public byte[] getBody() {
        return this.f9829c;
    }

    public Map<String, String> getHeaders() {
        return this.f9830d;
    }

    public String getMethod() {
        return this.f9828b;
    }

    public String getUrl() {
        return this.f9827a;
    }

    public String toString() {
        return "Request{url=" + this.f9827a + ", method='" + this.f9828b + "', bodyLength=" + this.f9829c.length + ", headers=" + this.f9830d + '}';
    }

    private Request(String str, String str2, byte[] bArr, HashMap hashMap) {
        this.f9827a = str;
        this.f9828b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f9829c = bArr;
        this.f9830d = e.a(hashMap);
    }
}
