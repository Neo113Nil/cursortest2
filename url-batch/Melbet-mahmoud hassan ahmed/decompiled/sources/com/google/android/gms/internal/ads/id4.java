package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class id4 implements pd4 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f6621a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f6622b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6623c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6624d;

    public id4(long[] jArr, long[] jArr2, long j7) {
        int length = jArr.length;
        int length2 = jArr2.length;
        wu1.d(length == length2);
        boolean z6 = length2 > 0;
        this.f6624d = z6;
        if (!z6 || jArr2[0] <= 0) {
            this.f6621a = jArr;
            this.f6622b = jArr2;
        } else {
            int i7 = length2 + 1;
            long[] jArr3 = new long[i7];
            this.f6621a = jArr3;
            long[] jArr4 = new long[i7];
            this.f6622b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f6623c = j7;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        return this.f6623c;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        if (!this.f6624d) {
            qd4 qd4Var = qd4.f10660c;
            return new nd4(qd4Var, qd4Var);
        }
        int J = n13.J(this.f6622b, j7, true, true);
        qd4 qd4Var2 = new qd4(this.f6622b[J], this.f6621a[J]);
        if (qd4Var2.f10661a != j7) {
            long[] jArr = this.f6622b;
            if (J != jArr.length - 1) {
                int i7 = J + 1;
                return new nd4(qd4Var2, new qd4(jArr[i7], this.f6621a[i7]));
            }
        }
        return new nd4(qd4Var2, qd4Var2);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return this.f6624d;
    }
}
