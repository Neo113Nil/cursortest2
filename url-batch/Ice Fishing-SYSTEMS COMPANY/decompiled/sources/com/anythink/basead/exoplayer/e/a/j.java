package com.anythink.basead.exoplayer.e.a;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7267a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7268b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f7269c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7270d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7271e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7272f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7273g;

    /* renamed from: h, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.m f7274h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f7275j;

    /* renamed from: k, reason: collision with root package name */
    public final long[] f7276k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7277l;

    /* renamed from: m, reason: collision with root package name */
    private final k[] f7278m;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public j(int i, int i4, long j9, long j10, long j11, com.anythink.basead.exoplayer.m mVar, int i9, k[] kVarArr, int i10, long[] jArr, long[] jArr2) {
        this.f7269c = i;
        this.f7270d = i4;
        this.f7271e = j9;
        this.f7272f = j10;
        this.f7273g = j11;
        this.f7274h = mVar;
        this.i = i9;
        this.f7278m = kVarArr;
        this.f7277l = i10;
        this.f7275j = jArr;
        this.f7276k = jArr2;
    }

    public final k a(int i) {
        k[] kVarArr = this.f7278m;
        if (kVarArr == null) {
            return null;
        }
        return kVarArr[i];
    }
}
