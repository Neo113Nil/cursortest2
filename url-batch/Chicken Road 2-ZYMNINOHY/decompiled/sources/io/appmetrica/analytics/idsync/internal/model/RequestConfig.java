package io.appmetrica.analytics.idsync.internal.model;

import E.AbstractC0005f;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class RequestConfig {

    /* renamed from: a, reason: collision with root package name */
    private final String f9985a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9986b;

    /* renamed from: c, reason: collision with root package name */
    private final Preconditions f9987c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f9988d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9989e;

    /* renamed from: f, reason: collision with root package name */
    private final long f9990f;

    /* renamed from: g, reason: collision with root package name */
    private final List f9991g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f9992h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9993i;

    public RequestConfig(String str, String str2, Preconditions preconditions, Map<String, ? extends List<String>> map, long j4, long j5, List<Integer> list, boolean z, String str3) {
        this.f9985a = str;
        this.f9986b = str2;
        this.f9987c = preconditions;
        this.f9988d = map;
        this.f9989e = j4;
        this.f9990f = j5;
        this.f9991g = list;
        this.f9992h = z;
        this.f9993i = str3;
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
        return this.f9989e == requestConfig.f9989e && this.f9990f == requestConfig.f9990f && i.a(this.f9985a, requestConfig.f9985a) && i.a(this.f9986b, requestConfig.f9986b) && i.a(this.f9987c, requestConfig.f9987c) && i.a(this.f9988d, requestConfig.f9988d) && i.a(this.f9991g, requestConfig.f9991g) && this.f9992h == requestConfig.f9992h && i.a(this.f9993i, requestConfig.f9993i);
    }

    public final Map<String, List<String>> getHeaders() {
        return this.f9988d;
    }

    public final Preconditions getPreconditions() {
        return this.f9987c;
    }

    public final boolean getReportEventEnabled() {
        return this.f9992h;
    }

    public final String getReportUrl() {
        return this.f9993i;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.f9990f;
    }

    public final long getResendIntervalForValidResponse() {
        return this.f9989e;
    }

    public final String getType() {
        return this.f9985a;
    }

    public final String getUrl() {
        return this.f9986b;
    }

    public final List<Integer> getValidResponseCodes() {
        return this.f9991g;
    }

    public int hashCode() {
        int hashCode = (Boolean.hashCode(this.f9992h) + ((this.f9991g.hashCode() + ((this.f9988d.hashCode() + ((this.f9987c.hashCode() + AbstractC0005f.f(AbstractC0005f.f((Long.hashCode(this.f9990f) + (Long.hashCode(this.f9989e) * 31)) * 31, 31, this.f9985a), 31, this.f9986b)) * 31)) * 31)) * 31)) * 31;
        String str = this.f9993i;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RequestConfig(type='" + this.f9985a + "', url='" + this.f9986b + "', preconditions=" + this.f9987c + ", headers=" + this.f9988d + ", resendIntervalForValidResponse=" + this.f9989e + ", resendIntervalForInvalidResponse=" + this.f9990f + ", validResponseCodes=" + this.f9991g + ", reportEventEnabled=" + this.f9992h + ", reportUrl=" + this.f9993i + ')';
    }
}
