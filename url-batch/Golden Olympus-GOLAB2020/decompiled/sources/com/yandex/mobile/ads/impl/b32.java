package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class b32 implements c32 {

    /* renamed from: b, reason: collision with root package name */
    private final uu[] f23584b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f23585c;

    public b32(uu[] uuVarArr, long[] jArr) {
        this.f23584b = uuVarArr;
        this.f23585c = jArr;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final long a(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f23585c;
        if (i4 < jArr.length) {
            return jArr[i4];
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final List<uu> b(long j4) {
        uu uuVar;
        int b4 = u82.b(this.f23585c, j4, false);
        return (b4 == -1 || (uuVar = this.f23584b[b4]) == uu.f33246s) ? Collections.EMPTY_LIST : Collections.singletonList(uuVar);
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a() {
        return this.f23585c.length;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a(long j4) {
        int a4 = u82.a(this.f23585c, j4, false);
        if (a4 < this.f23585c.length) {
            return a4;
        }
        return -1;
    }
}
