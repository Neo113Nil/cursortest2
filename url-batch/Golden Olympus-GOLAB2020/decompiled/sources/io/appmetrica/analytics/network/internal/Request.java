package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.jn;
import io.appmetrica.analytics.network.impl.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class Request {

    /* renamed from: a, reason: collision with root package name */
    private final String f40560a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40561b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f40562c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f40563d;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f40564a;

        /* renamed from: b, reason: collision with root package name */
        private String f40565b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f40566c = new byte[0];

        /* renamed from: d, reason: collision with root package name */
        private final HashMap f40567d = new HashMap();

        public Builder(@NonNull String str) {
            this.f40564a = str;
        }

        @NonNull
        public Builder addHeader(@NonNull String str, String str2) {
            this.f40567d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f40564a, this.f40565b, this.f40566c, this.f40567d, 0);
        }

        @NonNull
        public Builder post(@NonNull byte[] bArr) {
            this.f40566c = bArr;
            return withMethod(jn.f16865b);
        }

        @NonNull
        public Builder withMethod(@NonNull String str) {
            this.f40565b = str;
            return this;
        }
    }

    /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap hashMap, int i4) {
        this(str, str2, bArr, hashMap);
    }

    @NonNull
    public byte[] getBody() {
        return this.f40562c;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.f40563d;
    }

    @NonNull
    public String getMethod() {
        return this.f40561b;
    }

    @NonNull
    public String getUrl() {
        return this.f40560a;
    }

    public String toString() {
        return "Request{url=" + this.f40560a + ", method='" + this.f40561b + "', bodyLength=" + this.f40562c.length + ", headers=" + this.f40563d + '}';
    }

    private Request(String str, String str2, byte[] bArr, HashMap hashMap) {
        this.f40560a = str;
        this.f40561b = TextUtils.isEmpty(str2) ? jn.f16864a : str2;
        this.f40562c = bArr;
        this.f40563d = e.a(hashMap);
    }
}
