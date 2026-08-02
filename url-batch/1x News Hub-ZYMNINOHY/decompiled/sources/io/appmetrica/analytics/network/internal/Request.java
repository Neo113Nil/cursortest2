package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import io.appmetrica.analytics.network.impl.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Request {

    /* renamed from: a, reason: collision with root package name */
    private final String f8855a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8856b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8857c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f8858d;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f8859a;

        /* renamed from: b, reason: collision with root package name */
        private String f8860b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f8861c = new byte[0];

        /* renamed from: d, reason: collision with root package name */
        private final HashMap f8862d = new HashMap();

        public Builder(String str) {
            this.f8859a = str;
        }

        public Builder addHeader(String str, String str2) {
            this.f8862d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f8859a, this.f8860b, this.f8861c, this.f8862d, 0);
        }

        public Builder post(byte[] bArr) {
            this.f8861c = bArr;
            return withMethod("POST");
        }

        public Builder withMethod(String str) {
            this.f8860b = str;
            return this;
        }
    }

    public /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap hashMap, int i3) {
        this(str, str2, bArr, hashMap);
    }

    public byte[] getBody() {
        return this.f8857c;
    }

    public Map<String, String> getHeaders() {
        return this.f8858d;
    }

    public String getMethod() {
        return this.f8856b;
    }

    public String getUrl() {
        return this.f8855a;
    }

    public String toString() {
        return "Request{url=" + this.f8855a + ", method='" + this.f8856b + "', bodyLength=" + this.f8857c.length + ", headers=" + this.f8858d + '}';
    }

    private Request(String str, String str2, byte[] bArr, HashMap hashMap) {
        this.f8855a = str;
        this.f8856b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f8857c = bArr;
        this.f8858d = e.a(hashMap);
    }
}
