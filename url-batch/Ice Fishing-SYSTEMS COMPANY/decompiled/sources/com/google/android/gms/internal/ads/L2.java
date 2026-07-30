package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class L2 implements InterfaceC3015c1 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f26087a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f26088b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26089c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26090d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26091e;

    public /* synthetic */ L2(SparseArray sparseArray, SparseArray sparseArray2, long j9, long j10, int i) {
        this.f26087a = sparseArray;
        this.f26088b = sparseArray2;
        this.f26089c = j9;
        this.f26090d = j10;
        this.f26091e = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        return this.f26089c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        SparseArray sparseArray = this.f26087a;
        int i = this.f26091e;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.f26088b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i);
            jArr2 = (long[]) sparseArray2.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j9 < jArr[0]) {
            C3070d1 c3070d1 = new C3070d1(0L, this.f26090d);
            return new C2961b1(c3070d1, c3070d1);
        }
        int s3 = AbstractC3548lu.s(jArr, j9, true);
        C3070d1 c3070d12 = new C3070d1(jArr[s3], jArr2[s3]);
        return new C2961b1(c3070d12, c3070d12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        return true;
    }
}
