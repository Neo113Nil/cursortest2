package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class hh3 implements dx3 {

    /* renamed from: a, reason: collision with root package name */
    private final g94 f6264a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6265b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6266c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6267d;

    /* renamed from: e, reason: collision with root package name */
    private final long f6268e;

    /* renamed from: f, reason: collision with root package name */
    private final long f6269f;

    /* renamed from: g, reason: collision with root package name */
    private int f6270g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6271h;

    public hh3() {
        g94 g94Var = new g94(true, 65536);
        i(2500, 0, "bufferForPlaybackMs", "0");
        i(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        i(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(50000, 50000, "maxBufferMs", "minBufferMs");
        i(0, 0, "backBufferDurationMs", "0");
        this.f6264a = g94Var;
        this.f6265b = nz3.c(50000L);
        this.f6266c = nz3.c(50000L);
        this.f6267d = nz3.c(2500L);
        this.f6268e = nz3.c(5000L);
        this.f6270g = 13107200;
        this.f6269f = nz3.c(0L);
    }

    private static void i(int i7, int i8, String str, String str2) {
        boolean z6 = i7 >= i8;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        wu1.e(z6, sb.toString());
    }

    private final void j(boolean z6) {
        this.f6270g = 13107200;
        this.f6271h = false;
        if (z6) {
            this.f6264a.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final void a() {
        j(false);
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final void c() {
        j(true);
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final void d(xx3[] xx3VarArr, hm0 hm0Var, w74[] w74VarArr) {
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i7 >= 2) {
                int max = Math.max(13107200, i8);
                this.f6270g = max;
                this.f6264a.f(max);
                return;
            } else {
                if (w74VarArr[i7] != null) {
                    i8 += xx3VarArr[i7].a() != 1 ? 131072000 : 13107200;
                }
                i7++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final boolean e(long j7, float f7, boolean z6, long j8) {
        long X = n13.X(j7, f7);
        long j9 = z6 ? this.f6268e : this.f6267d;
        if (j8 != -9223372036854775807L) {
            j9 = Math.min(j8 / 2, j9);
        }
        return j9 <= 0 || X >= j9 || this.f6264a.a() >= this.f6270g;
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final g94 f() {
        return this.f6264a;
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final void g() {
        j(true);
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final boolean h(long j7, long j8, float f7) {
        int a7 = this.f6264a.a();
        int i7 = this.f6270g;
        long j9 = this.f6265b;
        if (f7 > 1.0f) {
            j9 = Math.min(n13.V(j9, f7), this.f6266c);
        }
        if (j8 < Math.max(j9, 500000L)) {
            boolean z6 = a7 < i7;
            this.f6271h = z6;
            if (!z6 && j8 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j8 >= this.f6266c || a7 >= i7) {
            this.f6271h = false;
        }
        return this.f6271h;
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final long zza() {
        return this.f6269f;
    }
}
