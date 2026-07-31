package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class yq {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f14781a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14782b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14783c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14784d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14785e;

    private yq(InputStream inputStream, boolean z6, boolean z7, long j7, boolean z8) {
        this.f14781a = inputStream;
        this.f14782b = z6;
        this.f14783c = z7;
        this.f14784d = j7;
        this.f14785e = z8;
    }

    public static yq b(InputStream inputStream, boolean z6, boolean z7, long j7, boolean z8) {
        return new yq(inputStream, z6, z7, j7, z8);
    }

    public final long a() {
        return this.f14784d;
    }

    public final InputStream c() {
        return this.f14781a;
    }

    public final boolean d() {
        return this.f14782b;
    }

    public final boolean e() {
        return this.f14785e;
    }

    public final boolean f() {
        return this.f14783c;
    }
}
