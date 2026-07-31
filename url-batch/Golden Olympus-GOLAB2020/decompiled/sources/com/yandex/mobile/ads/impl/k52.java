package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class k52 {

    /* renamed from: a, reason: collision with root package name */
    public final int f28061a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28062b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28063c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28064d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28065e;

    /* renamed from: f, reason: collision with root package name */
    public final yb0 f28066f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28067g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f28068h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f28069i;

    /* renamed from: j, reason: collision with root package name */
    public final int f28070j;

    /* renamed from: k, reason: collision with root package name */
    private final l52[] f28071k;

    public k52(int i4, int i5, long j4, long j5, long j6, yb0 yb0Var, int i6, l52[] l52VarArr, int i7, long[] jArr, long[] jArr2) {
        this.f28061a = i4;
        this.f28062b = i5;
        this.f28063c = j4;
        this.f28064d = j5;
        this.f28065e = j6;
        this.f28066f = yb0Var;
        this.f28067g = i6;
        this.f28071k = l52VarArr;
        this.f28070j = i7;
        this.f28068h = jArr;
        this.f28069i = jArr2;
    }

    public final l52 a(int i4) {
        l52[] l52VarArr = this.f28071k;
        if (l52VarArr == null) {
            return null;
        }
        return l52VarArr[i4];
    }
}
