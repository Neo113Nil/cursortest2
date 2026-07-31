package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class Response {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40568a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40569b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f40570c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f40571d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f40572e;

    /* renamed from: f, reason: collision with root package name */
    private final Throwable f40573f;

    public Response(Throwable th) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th);
    }

    public int getCode() {
        return this.f40569b;
    }

    @NonNull
    public byte[] getErrorData() {
        return this.f40571d;
    }

    public Throwable getException() {
        return this.f40573f;
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f40572e;
    }

    @NonNull
    public byte[] getResponseData() {
        return this.f40570c;
    }

    public boolean isCompleted() {
        return this.f40568a;
    }

    public String toString() {
        return "Response{completed=" + this.f40568a + ", code=" + this.f40569b + ", responseDataLength=" + this.f40570c.length + ", errorDataLength=" + this.f40571d.length + ", headers=" + this.f40572e + ", exception=" + this.f40573f + '}';
    }

    public Response(boolean z4, int i4, @NonNull byte[] bArr, @NonNull byte[] bArr2, Map<String, List<String>> map, Throwable th) {
        this.f40568a = z4;
        this.f40569b = i4;
        this.f40570c = bArr;
        this.f40571d = bArr2;
        this.f40572e = map == null ? Collections.EMPTY_MAP : e.a(map);
        this.f40573f = th;
    }
}
