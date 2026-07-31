package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class vn implements tw1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f33691a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f33692b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f33693c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f33694d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f33695e;

    /* renamed from: f, reason: collision with root package name */
    private final long f33696f;

    public vn(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f33692b = iArr;
        this.f33693c = jArr;
        this.f33694d = jArr2;
        this.f33695e = jArr3;
        int length = iArr.length;
        this.f33691a = length;
        if (length <= 0) {
            this.f33696f = 0L;
        } else {
            int i4 = length - 1;
            this.f33696f = jArr2[i4] + jArr3[i4];
        }
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f33696f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f33691a + ", sizes=" + Arrays.toString(this.f33692b) + ", offsets=" + Arrays.toString(this.f33693c) + ", timeUs=" + Arrays.toString(this.f33695e) + ", durationsUs=" + Arrays.toString(this.f33694d) + ")";
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        int b4 = u82.b(this.f33695e, j4, true);
        long[] jArr = this.f33695e;
        long j5 = jArr[b4];
        long[] jArr2 = this.f33693c;
        vw1 vw1Var = new vw1(j5, jArr2[b4]);
        if (j5 >= j4 || b4 == this.f33691a - 1) {
            return new tw1.a(vw1Var, vw1Var);
        }
        int i4 = b4 + 1;
        return new tw1.a(vw1Var, new vw1(jArr[i4], jArr2[i4]));
    }
}
