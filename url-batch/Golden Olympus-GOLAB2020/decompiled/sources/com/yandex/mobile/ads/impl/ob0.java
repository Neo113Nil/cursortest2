package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pb0;
import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
public final class ob0 implements tw1 {

    /* renamed from: a, reason: collision with root package name */
    private final pb0 f29959a;

    /* renamed from: b, reason: collision with root package name */
    private final long f29960b;

    public ob0(pb0 pb0Var, long j4) {
        this.f29959a = pb0Var;
        this.f29960b = j4;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f29959a.b();
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        pb0 pb0Var = this.f29959a;
        pb0.a aVar = pb0Var.f30398k;
        if (aVar == null) {
            throw new IllegalStateException();
        }
        long[] jArr = aVar.f30400a;
        long[] jArr2 = aVar.f30401b;
        int b4 = u82.b(jArr, pb0Var.a(j4), false);
        long j5 = b4 == -1 ? 0L : jArr[b4];
        long j6 = b4 != -1 ? jArr2[b4] : 0L;
        long j7 = this.f29959a.f30392e;
        long j8 = (j5 * 1000000) / j7;
        long j9 = this.f29960b;
        vw1 vw1Var = new vw1(j8, j6 + j9);
        if (j8 == j4 || b4 == jArr.length - 1) {
            return new tw1.a(vw1Var, vw1Var);
        }
        int i4 = b4 + 1;
        return new tw1.a(vw1Var, new vw1((jArr[i4] * 1000000) / j7, j9 + jArr2[i4]));
    }
}
