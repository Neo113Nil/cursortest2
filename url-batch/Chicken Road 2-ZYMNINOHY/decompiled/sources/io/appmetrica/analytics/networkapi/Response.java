package io.appmetrica.analytics.networkapi;

import d3.r;
import d3.t;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class Response {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13267a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13268b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f13269c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f13270d;

    /* renamed from: e, reason: collision with root package name */
    private final Throwable f13271e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13272f;

    public /* synthetic */ Response(boolean z, int i4, byte[] bArr, Map map, Throwable th, String str, e eVar) {
        this(z, i4, bArr, map, th, str);
    }

    public final int getCode() {
        return this.f13268b;
    }

    public final Throwable getException() {
        return this.f13271e;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.f13270d;
    }

    public final byte[] getResponseData() {
        return this.f13269c;
    }

    public final String getUrl() {
        return this.f13272f;
    }

    public final boolean isCompleted() {
        return this.f13267a;
    }

    public String toString() {
        return "Response(isCompleted=" + this.f13267a + ", code=" + this.f13268b + ", responseDataLength=" + this.f13269c.length + ", headers=" + this.f13270d + ", exception=" + this.f13271e + ", url=" + this.f13272f + ')';
    }

    private Response(boolean z, int i4, byte[] bArr, Map map, Throwable th, String str) {
        this.f13267a = z;
        this.f13268b = i4;
        this.f13269c = bArr;
        this.f13270d = map;
        this.f13271e = th;
        this.f13272f = str;
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f13273a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13274b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f13275c;

        /* renamed from: d, reason: collision with root package name */
        private final Throwable f13276d;

        /* renamed from: e, reason: collision with root package name */
        private Map f13277e;

        /* renamed from: f, reason: collision with root package name */
        private String f13278f;

        private Builder(boolean z, int i4, byte[] bArr, Throwable th) {
            this.f13273a = z;
            this.f13274b = i4;
            this.f13275c = bArr;
            this.f13276d = th;
            this.f13277e = r.f8334a;
        }

        public final Response build() {
            return new Response(this.f13273a, this.f13274b, this.f13275c, this.f13277e, this.f13276d, this.f13278f, null);
        }

        public final Builder withHeaders(Map<String, ? extends List<String>> map) {
            this.f13277e = t.G(map);
            return this;
        }

        public final Builder withUrl(String str) {
            this.f13278f = str;
            return this;
        }

        public Builder(Throwable th) {
            this(false, 0, new byte[0], th);
        }

        public Builder(boolean z, int i4, byte[] bArr) {
            this(z, i4, bArr, null);
        }
    }
}
