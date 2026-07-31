package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class h32 extends hy implements c32 {

    /* renamed from: d, reason: collision with root package name */
    private c32 f26542d;

    /* renamed from: e, reason: collision with root package name */
    private long f26543e;

    @Override // com.yandex.mobile.ads.impl.c32
    public final long a(int i4) {
        c32 c32Var = this.f26542d;
        c32Var.getClass();
        return c32Var.a(i4) + this.f26543e;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2168pl
    public final void b() {
        super.b();
        this.f26542d = null;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final List<uu> b(long j4) {
        c32 c32Var = this.f26542d;
        c32Var.getClass();
        return c32Var.b(j4 - this.f26543e);
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a() {
        c32 c32Var = this.f26542d;
        c32Var.getClass();
        return c32Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a(long j4) {
        c32 c32Var = this.f26542d;
        c32Var.getClass();
        return c32Var.a(j4 - this.f26543e);
    }

    public final void a(long j4, c32 c32Var, long j5) {
        this.f26983c = j4;
        this.f26542d = c32Var;
        if (j5 != Long.MAX_VALUE) {
            j4 = j5;
        }
        this.f26543e = j4;
    }
}
