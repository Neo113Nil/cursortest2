package io.appmetrica.analytics.network.internal;

import B0.o;
import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Response {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9835a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9836b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f9837c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f9838d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f9839e;

    /* renamed from: f, reason: collision with root package name */
    private final Throwable f9840f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9841g;

    public Response(Throwable th) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th);
    }

    public int getCode() {
        return this.f9836b;
    }

    public byte[] getErrorData() {
        return this.f9838d;
    }

    public Throwable getException() {
        return this.f9840f;
    }

    public Map<String, List<String>> getHeaders() {
        return this.f9839e;
    }

    public byte[] getResponseData() {
        return this.f9837c;
    }

    public String getUrl() {
        return this.f9841g;
    }

    public boolean isCompleted() {
        return this.f9835a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response{completed=");
        sb.append(this.f9835a);
        sb.append(", code=");
        sb.append(this.f9836b);
        sb.append(", responseDataLength=");
        sb.append(this.f9837c.length);
        sb.append(", errorDataLength=");
        sb.append(this.f9838d.length);
        sb.append(", headers=");
        sb.append(this.f9839e);
        sb.append(", exception=");
        sb.append(this.f9840f);
        sb.append(", url=");
        return o.l(sb, this.f9841g, '}');
    }

    public Response(boolean z, int i2, byte[] bArr, byte[] bArr2, Map<String, List<String>> map, Throwable th) {
        this(z, i2, bArr, bArr2, map, th, null);
    }

    public Response(boolean z, int i2, byte[] bArr, byte[] bArr2, Map<String, List<String>> map, Throwable th, String str) {
        Map a6;
        this.f9835a = z;
        this.f9836b = i2;
        this.f9837c = bArr;
        this.f9838d = bArr2;
        if (map == null) {
            a6 = Collections.emptyMap();
        } else {
            a6 = e.a(map);
        }
        this.f9839e = a6;
        this.f9840f = th;
        this.f9841g = str;
    }
}
