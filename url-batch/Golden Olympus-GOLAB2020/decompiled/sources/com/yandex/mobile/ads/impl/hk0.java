package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
public final class hk0 implements tw1 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f26775a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f26776b;

    /* renamed from: c, reason: collision with root package name */
    private final long f26777c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f26778d;

    public hk0(long j4, long[] jArr, long[] jArr2) {
        C2253tf.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z4 = length > 0;
        this.f26778d = z4;
        if (!z4 || jArr2[0] <= 0) {
            this.f26775a = jArr;
            this.f26776b = jArr2;
        } else {
            int i4 = length + 1;
            long[] jArr3 = new long[i4];
            this.f26775a = jArr3;
            long[] jArr4 = new long[i4];
            this.f26776b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f26777c = j4;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        if (!this.f26778d) {
            vw1 vw1Var = vw1.f33814c;
            return new tw1.a(vw1Var, vw1Var);
        }
        int b4 = u82.b(this.f26776b, j4, true);
        long[] jArr = this.f26776b;
        long j5 = jArr[b4];
        long[] jArr2 = this.f26775a;
        vw1 vw1Var2 = new vw1(j5, jArr2[b4]);
        if (j5 == j4 || b4 == jArr.length - 1) {
            return new tw1.a(vw1Var2, vw1Var2);
        }
        int i4 = b4 + 1;
        return new tw1.a(vw1Var2, new vw1(jArr[i4], jArr2[i4]));
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f26777c;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return this.f26778d;
    }
}
