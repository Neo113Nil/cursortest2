package io.appmetrica.analytics.idsync.internal.model;

import B0.o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class RequestConfig {

    /* renamed from: a, reason: collision with root package name */
    private final String f6473a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6474b;

    /* renamed from: c, reason: collision with root package name */
    private final Preconditions f6475c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f6476d;

    /* renamed from: e, reason: collision with root package name */
    private final long f6477e;

    /* renamed from: f, reason: collision with root package name */
    private final long f6478f;

    /* renamed from: g, reason: collision with root package name */
    private final List f6479g;

    public RequestConfig(String str, String str2, Preconditions preconditions, Map<String, ? extends List<String>> map, long j2, long j6, List<Integer> list) {
        this.f6473a = str;
        this.f6474b = str2;
        this.f6475c = preconditions;
        this.f6476d = map;
        this.f6477e = j2;
        this.f6478f = j6;
        this.f6479g = list;
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
        return this.f6477e == requestConfig.f6477e && this.f6478f == requestConfig.f6478f && i.a(this.f6473a, requestConfig.f6473a) && i.a(this.f6474b, requestConfig.f6474b) && i.a(this.f6475c, requestConfig.f6475c) && i.a(this.f6476d, requestConfig.f6476d) && i.a(this.f6479g, requestConfig.f6479g);
    }

    public final Map<String, List<String>> getHeaders() {
        return this.f6476d;
    }

    public final Preconditions getPreconditions() {
        return this.f6475c;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.f6478f;
    }

    public final long getResendIntervalForValidResponse() {
        return this.f6477e;
    }

    public final String getType() {
        return this.f6473a;
    }

    public final String getUrl() {
        return this.f6474b;
    }

    public final List<Integer> getValidResponseCodes() {
        return this.f6479g;
    }

    public int hashCode() {
        return this.f6479g.hashCode() + ((this.f6476d.hashCode() + ((this.f6475c.hashCode() + o.f(this.f6474b, o.f(this.f6473a, (Long.hashCode(this.f6478f) + (Long.hashCode(this.f6477e) * 31)) * 31, 31), 31)) * 31)) * 31);
    }

    public String toString() {
        return "RequestConfig(type='" + this.f6473a + "', url='" + this.f6474b + "', preconditions=" + this.f6475c + ", headers=" + this.f6476d + ", resendIntervalForValidResponse=" + this.f6477e + ", resendIntervalForInvalidResponse=" + this.f6478f + ", validResponseCodes=" + this.f6479g + ')';
    }
}
