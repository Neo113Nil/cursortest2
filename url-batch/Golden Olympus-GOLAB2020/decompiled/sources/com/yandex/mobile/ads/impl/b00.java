package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.demandOnly.e;

/* loaded from: classes3.dex */
public final class b00 implements gr1 {

    /* renamed from: a, reason: collision with root package name */
    private int f23529a;

    /* renamed from: b, reason: collision with root package name */
    private int f23530b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23531c;

    /* renamed from: d, reason: collision with root package name */
    private final float f23532d;

    public b00() {
        this(1.0f, e.b.f17432p, 1);
    }

    @Override // com.yandex.mobile.ads.impl.gr1
    public final int a() {
        return this.f23529a;
    }

    @Override // com.yandex.mobile.ads.impl.gr1
    public final int b() {
        return this.f23530b;
    }

    public b00(float f4, int i4, int i5) {
        this.f23529a = i4;
        this.f23531c = i5;
        this.f23532d = f4;
    }

    @Override // com.yandex.mobile.ads.impl.gr1
    public final void a(hi2 hi2Var) {
        int i4 = this.f23530b + 1;
        this.f23530b = i4;
        int i5 = this.f23529a;
        this.f23529a = i5 + ((int) (i5 * this.f23532d));
        if (i4 > this.f23531c) {
            throw hi2Var;
        }
    }
}
