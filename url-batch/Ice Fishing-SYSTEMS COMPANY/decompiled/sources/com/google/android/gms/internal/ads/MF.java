package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class MF {

    /* renamed from: a, reason: collision with root package name */
    public final C3602mu f26316a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f26317b;

    public /* synthetic */ MF(C3602mu c3602mu, long[] jArr) {
        this.f26316a = c3602mu;
        this.f26317b = jArr;
    }

    public static void a(MF mf, MF mf2) {
        C3602mu c3602mu = mf.f26316a;
        long[] jArr = (long[]) c3602mu.f32774u;
        C3602mu c3602mu2 = mf2.f26316a;
        long[] jArr2 = (long[]) c3602mu2.f32774u;
        long[] jArr3 = mf2.f26317b;
        AbstractC3217fl.U(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) c3602mu.f32775v;
        long[] jArr5 = (long[]) c3602mu2.f32775v;
        long[] jArr6 = (long[]) c3602mu2.f32776w;
        AbstractC3217fl.U(jArr4, jArr5, jArr6);
        AbstractC3217fl.U((long[]) c3602mu.f32776w, jArr6, jArr3);
        AbstractC3217fl.U(mf.f26317b, jArr2, jArr5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MF(int i) {
        this(new C3602mu(20), new long[10]);
        switch (i) {
            case 1:
                break;
            default:
                MF mf = AbstractC2655Lg.f26178N;
                this.f26316a = new C3602mu(mf.f26316a);
                this.f26317b = Arrays.copyOf(mf.f26317b, 10);
                break;
        }
    }

    public MF(MF mf) {
        this(1);
        a(this, mf);
    }
}
