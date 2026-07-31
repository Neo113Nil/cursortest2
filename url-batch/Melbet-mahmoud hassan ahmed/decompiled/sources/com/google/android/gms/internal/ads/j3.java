package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class j3 implements w2 {

    /* renamed from: b, reason: collision with root package name */
    private td4 f6949b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6950c;

    /* renamed from: e, reason: collision with root package name */
    private int f6952e;

    /* renamed from: f, reason: collision with root package name */
    private int f6953f;

    /* renamed from: a, reason: collision with root package name */
    private final dr2 f6948a = new dr2(10);

    /* renamed from: d, reason: collision with root package name */
    private long f6951d = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.w2
    public final void a(dr2 dr2Var) {
        wu1.b(this.f6949b);
        if (this.f6950c) {
            int i7 = dr2Var.i();
            int i8 = this.f6953f;
            if (i8 < 10) {
                int min = Math.min(i7, 10 - i8);
                System.arraycopy(dr2Var.h(), dr2Var.k(), this.f6948a.h(), this.f6953f, min);
                if (this.f6953f + min == 10) {
                    this.f6948a.f(0);
                    if (this.f6948a.s() != 73 || this.f6948a.s() != 68 || this.f6948a.s() != 51) {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f6950c = false;
                        return;
                    } else {
                        this.f6948a.g(3);
                        this.f6952e = this.f6948a.r() + 10;
                    }
                }
            }
            int min2 = Math.min(i7, this.f6952e - this.f6953f);
            rd4.b(this.f6949b, dr2Var, min2);
            this.f6953f += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b() {
        this.f6950c = false;
        this.f6951d = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c() {
        int i7;
        wu1.b(this.f6949b);
        if (this.f6950c && (i7 = this.f6952e) != 0 && this.f6953f == i7) {
            long j7 = this.f6951d;
            if (j7 != -9223372036854775807L) {
                this.f6949b.a(j7, 1, i7, 0, null);
            }
            this.f6950c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void d(rc4 rc4Var, k4 k4Var) {
        k4Var.c();
        td4 r7 = rc4Var.r(k4Var.a(), 5);
        this.f6949b = r7;
        bf4 bf4Var = new bf4();
        bf4Var.h(k4Var.b());
        bf4Var.s("application/id3");
        r7.b(bf4Var.y());
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(long j7, int i7) {
        if ((i7 & 4) == 0) {
            return;
        }
        this.f6950c = true;
        if (j7 != -9223372036854775807L) {
            this.f6951d = j7;
        }
        this.f6952e = 0;
        this.f6953f = 0;
    }
}
