package io.appmetrica.analytics.idsync.internal.model;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class RequestConfig {

    /* renamed from: a, reason: collision with root package name */
    private final String f5701a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5702b;

    /* renamed from: c, reason: collision with root package name */
    private final Preconditions f5703c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f5704d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5705e;
    private final long f;

    /* renamed from: g, reason: collision with root package name */
    private final List f5706g;

    public RequestConfig(String str, String str2, Preconditions preconditions, Map<String, ? extends List<String>> map, long j3, long j4, List<Integer> list) {
        this.f5701a = str;
        this.f5702b = str2;
        this.f5703c = preconditions;
        this.f5704d = map;
        this.f5705e = j3;
        this.f = j4;
        this.f5706g = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RequestConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.RequestConfig");
        }
        RequestConfig requestConfig = (RequestConfig) obj;
        return this.f5705e == requestConfig.f5705e && this.f == requestConfig.f && j.a(this.f5701a, requestConfig.f5701a) && j.a(this.f5702b, requestConfig.f5702b) && j.a(this.f5703c, requestConfig.f5703c) && j.a(this.f5704d, requestConfig.f5704d) && j.a(this.f5706g, requestConfig.f5706g);
    }

    public final Map<String, List<String>> getHeaders() {
        return this.f5704d;
    }

    public final Preconditions getPreconditions() {
        return this.f5703c;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.f;
    }

    public final long getResendIntervalForValidResponse() {
        return this.f5705e;
    }

    public final String getType() {
        return this.f5701a;
    }

    public final String getUrl() {
        return this.f5702b;
    }

    public final List<Integer> getValidResponseCodes() {
        return this.f5706g;
    }

    public int hashCode() {
        return this.f5706g.hashCode() + ((this.f5704d.hashCode() + ((this.f5703c.hashCode() + ((this.f5702b.hashCode() + ((this.f5701a.hashCode() + ((Long.hashCode(this.f) + (Long.hashCode(this.f5705e) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RequestConfig(type='" + this.f5701a + "', url='" + this.f5702b + "', preconditions=" + this.f5703c + ", headers=" + this.f5704d + ", resendIntervalForValidResponse=" + this.f5705e + ", resendIntervalForInvalidResponse=" + this.f + ", validResponseCodes=" + this.f5706g + ')';
    }
}
