package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hc4 implements pd4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6182a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f6183b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f6184c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f6185d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f6186e;

    /* renamed from: f, reason: collision with root package name */
    private final long f6187f;

    public hc4(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f6183b = iArr;
        this.f6184c = jArr;
        this.f6185d = jArr2;
        this.f6186e = jArr3;
        int length = iArr.length;
        this.f6182a = length;
        if (length <= 0) {
            this.f6187f = 0L;
        } else {
            int i7 = length - 1;
            this.f6187f = jArr2[i7] + jArr3[i7];
        }
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        return this.f6187f;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        int J = n13.J(this.f6186e, j7, true, true);
        qd4 qd4Var = new qd4(this.f6186e[J], this.f6184c[J]);
        if (qd4Var.f10661a >= j7 || J == this.f6182a - 1) {
            return new nd4(qd4Var, qd4Var);
        }
        int i7 = J + 1;
        return new nd4(qd4Var, new qd4(this.f6186e[i7], this.f6184c[i7]));
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return true;
    }

    public final String toString() {
        int i7 = this.f6182a;
        String arrays = Arrays.toString(this.f6183b);
        String arrays2 = Arrays.toString(this.f6184c);
        String arrays3 = Arrays.toString(this.f6186e);
        String arrays4 = Arrays.toString(this.f6185d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i7);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }
}
