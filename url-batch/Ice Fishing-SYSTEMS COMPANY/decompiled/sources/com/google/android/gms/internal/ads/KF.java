package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class KF {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f25946a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f25947b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f25948c;

    public KF(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f25946a = jArr;
        this.f25947b = jArr2;
        this.f25948c = jArr3;
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(KF kf, int i) {
        C3686oN.e(this.f25946a, kf.f25946a, i);
        C3686oN.e(this.f25947b, kf.f25947b, i);
        C3686oN.e(this.f25948c, kf.f25948c, i);
    }

    public KF() {
        KF kf = AbstractC2655Lg.f26177M;
        this.f25946a = Arrays.copyOf(kf.f25946a, 10);
        this.f25947b = Arrays.copyOf(kf.f25947b, 10);
        this.f25948c = Arrays.copyOf(kf.f25948c, 10);
    }
}
