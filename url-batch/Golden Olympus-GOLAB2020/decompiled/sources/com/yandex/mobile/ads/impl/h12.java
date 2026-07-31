package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wz0;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class h12 extends hy1 {

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f26525a = new sf1();

    /* renamed from: b, reason: collision with root package name */
    private final rf1 f26526b = new rf1();

    /* renamed from: c, reason: collision with root package name */
    private e52 f26527c;

    @Override // com.yandex.mobile.ads.impl.hy1
    protected final wz0 a(zz0 zz0Var, ByteBuffer byteBuffer) {
        e52 e52Var = this.f26527c;
        if (e52Var == null || zz0Var.f35836j != e52Var.c()) {
            e52 e52Var2 = new e52(zz0Var.f26358f);
            this.f26527c = e52Var2;
            e52Var2.a(zz0Var.f26358f - zz0Var.f35836j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f26525a.a(limit, array);
        this.f26526b.a(limit, array);
        this.f26526b.d(39);
        long b4 = (this.f26526b.b(1) << 32) | this.f26526b.b(32);
        this.f26526b.d(20);
        int b5 = this.f26526b.b(12);
        int b6 = this.f26526b.b(8);
        this.f26525a.f(14);
        wz0.b a4 = b6 != 0 ? b6 != 255 ? b6 != 4 ? b6 != 5 ? b6 != 6 ? null : u42.a(this.f26525a, b4, this.f26527c) : i12.a(this.f26525a, b4, this.f26527c) : k12.a(this.f26525a) : al1.a(this.f26525a, b5, b4) : new j12();
        return a4 == null ? new wz0(new wz0.b[0]) : new wz0(a4);
    }
}
