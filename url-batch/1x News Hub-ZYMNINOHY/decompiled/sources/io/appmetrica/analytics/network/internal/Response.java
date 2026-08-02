package io.appmetrica.analytics.network.internal;

import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Response {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8863a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8864b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8865c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f8866d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f8867e;
    private final Throwable f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8868g;

    public Response(Throwable th) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th);
    }

    public int getCode() {
        return this.f8864b;
    }

    public byte[] getErrorData() {
        return this.f8866d;
    }

    public Throwable getException() {
        return this.f;
    }

    public Map<String, List<String>> getHeaders() {
        return this.f8867e;
    }

    public byte[] getResponseData() {
        return this.f8865c;
    }

    public String getUrl() {
        return this.f8868g;
    }

    public boolean isCompleted() {
        return this.f8863a;
    }

    public String toString() {
        return "Response{completed=" + this.f8863a + ", code=" + this.f8864b + ", responseDataLength=" + this.f8865c.length + ", errorDataLength=" + this.f8866d.length + ", headers=" + this.f8867e + ", exception=" + this.f + ", url=" + this.f8868g + '}';
    }

    public Response(boolean z, int i3, byte[] bArr, byte[] bArr2, Map<String, List<String>> map, Throwable th) {
        this(z, i3, bArr, bArr2, map, th, null);
    }

    public Response(boolean z, int i3, byte[] bArr, byte[] bArr2, Map<String, List<String>> map, Throwable th, String str) {
        Map a3;
        this.f8863a = z;
        this.f8864b = i3;
        this.f8865c = bArr;
        this.f8866d = bArr2;
        if (map == null) {
            a3 = Collections.EMPTY_MAP;
        } else {
            a3 = e.a(map);
        }
        this.f8867e = a3;
        this.f = th;
        this.f8868g = str;
    }
}
