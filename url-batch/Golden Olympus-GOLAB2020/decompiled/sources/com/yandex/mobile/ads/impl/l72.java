package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class l72 implements c32 {

    /* renamed from: b, reason: collision with root package name */
    private final h72 f28449b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f28450c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, k72> f28451d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, i72> f28452e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f28453f;

    public l72(h72 h72Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f28449b = h72Var;
        this.f28452e = hashMap2;
        this.f28453f = hashMap3;
        this.f28451d = Collections.unmodifiableMap(hashMap);
        this.f28450c = h72Var.b();
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final long a(int i4) {
        return this.f28450c[i4];
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final List<uu> b(long j4) {
        return this.f28449b.a(j4, this.f28451d, this.f28452e, this.f28453f);
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a() {
        return this.f28450c.length;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a(long j4) {
        int a4 = u82.a(this.f28450c, j4, false);
        if (a4 < this.f28450c.length) {
            return a4;
        }
        return -1;
    }
}
