package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b3 implements w2 {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f3168l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final n4 f3169a;

    /* renamed from: f, reason: collision with root package name */
    private a3 f3174f;

    /* renamed from: g, reason: collision with root package name */
    private long f3175g;

    /* renamed from: h, reason: collision with root package name */
    private String f3176h;

    /* renamed from: i, reason: collision with root package name */
    private td4 f3177i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3178j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f3171c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final z2 f3172d = new z2(128);

    /* renamed from: k, reason: collision with root package name */
    private long f3179k = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private final m3 f3173e = new m3(178, 128);

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f3170b = new dr2();

    b3(n4 n4Var) {
        this.f3169a = n4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    @Override // com.google.android.gms.internal.ads.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(dr2 dr2Var) {
        int i7;
        int i8;
        float f7;
        float f8;
        wu1.b(this.f3174f);
        wu1.b(this.f3177i);
        int k7 = dr2Var.k();
        int l7 = dr2Var.l();
        byte[] h7 = dr2Var.h();
        this.f3175g += dr2Var.i();
        rd4.b(this.f3177i, dr2Var, dr2Var.i());
        while (true) {
            int a7 = th2.a(h7, k7, l7, this.f3171c);
            if (a7 == l7) {
                break;
            }
            int i9 = a7 + 3;
            int i10 = dr2Var.h()[i9] & 255;
            int i11 = a7 - k7;
            if (!this.f3178j) {
                if (i11 > 0) {
                    this.f3172d.a(h7, k7, a7);
                }
                if (this.f3172d.c(i10, i11 < 0 ? -i11 : 0)) {
                    td4 td4Var = this.f3177i;
                    z2 z2Var = this.f3172d;
                    int i12 = z2Var.f14898d;
                    String str = this.f3176h;
                    Objects.requireNonNull(str);
                    byte[] copyOf = Arrays.copyOf(z2Var.f14899e, z2Var.f14897c);
                    cq2 cq2Var = new cq2(copyOf, copyOf.length);
                    cq2Var.k(i12);
                    cq2Var.k(4);
                    cq2Var.i();
                    cq2Var.j(8);
                    if (cq2Var.l()) {
                        cq2Var.j(4);
                        cq2Var.j(3);
                    }
                    int c7 = cq2Var.c(4);
                    i7 = i9;
                    if (c7 == 15) {
                        int c8 = cq2Var.c(8);
                        int c9 = cq2Var.c(8);
                        if (c9 != 0) {
                            f7 = c8 / c9;
                            f8 = f7;
                        }
                        Log.w("H263Reader", "Invalid aspect ratio");
                        f8 = 1.0f;
                    } else {
                        if (c7 < 7) {
                            f7 = f3168l[c7];
                            f8 = f7;
                        }
                        Log.w("H263Reader", "Invalid aspect ratio");
                        f8 = 1.0f;
                    }
                    if (cq2Var.l()) {
                        cq2Var.j(2);
                        cq2Var.j(1);
                        if (cq2Var.l()) {
                            cq2Var.j(15);
                            cq2Var.i();
                            cq2Var.j(15);
                            cq2Var.i();
                            cq2Var.j(15);
                            cq2Var.i();
                            cq2Var.j(3);
                            cq2Var.j(11);
                            cq2Var.i();
                            cq2Var.j(15);
                            cq2Var.i();
                        }
                    }
                    if (cq2Var.c(2) != 0) {
                        Log.w("H263Reader", "Unhandled video object layer shape");
                    }
                    cq2Var.i();
                    int c10 = cq2Var.c(16);
                    cq2Var.i();
                    if (cq2Var.l()) {
                        if (c10 == 0) {
                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i13 = 0;
                            for (int i14 = c10 - 1; i14 > 0; i14 >>= 1) {
                                i13++;
                            }
                            cq2Var.j(i13);
                        }
                    }
                    cq2Var.i();
                    int c11 = cq2Var.c(13);
                    cq2Var.i();
                    int c12 = cq2Var.c(13);
                    cq2Var.i();
                    cq2Var.i();
                    bf4 bf4Var = new bf4();
                    bf4Var.h(str);
                    bf4Var.s("video/mp4v-es");
                    bf4Var.x(c11);
                    bf4Var.f(c12);
                    bf4Var.p(f8);
                    bf4Var.i(Collections.singletonList(copyOf));
                    td4Var.b(bf4Var.y());
                    this.f3178j = true;
                    this.f3174f.a(h7, k7, a7);
                    m3 m3Var = this.f3173e;
                    if (i11 <= 0) {
                        m3Var.a(h7, k7, a7);
                        i8 = 0;
                    } else {
                        i8 = -i11;
                    }
                    if (this.f3173e.d(i8)) {
                        m3 m3Var2 = this.f3173e;
                        int b7 = th2.b(m3Var2.f8389d, m3Var2.f8390e);
                        dr2 dr2Var2 = this.f3170b;
                        int i15 = n13.f8865a;
                        dr2Var2.d(this.f3173e.f8389d, b7);
                        this.f3169a.a(this.f3179k, this.f3170b);
                    }
                    if (i10 == 178) {
                        if (dr2Var.h()[a7 + 2] == 1) {
                            this.f3173e.c(178);
                        }
                        i10 = 178;
                    }
                    int i16 = l7 - a7;
                    this.f3174f.b(this.f3175g - i16, i16, this.f3178j);
                    this.f3174f.c(i10, this.f3179k);
                    k7 = i7;
                }
            }
            i7 = i9;
            this.f3174f.a(h7, k7, a7);
            m3 m3Var3 = this.f3173e;
            if (i11 <= 0) {
            }
            if (this.f3173e.d(i8)) {
            }
            if (i10 == 178) {
            }
            int i162 = l7 - a7;
            this.f3174f.b(this.f3175g - i162, i162, this.f3178j);
            this.f3174f.c(i10, this.f3179k);
            k7 = i7;
        }
        if (!this.f3178j) {
            this.f3172d.a(h7, k7, l7);
        }
        this.f3174f.a(h7, k7, l7);
        this.f3173e.a(h7, k7, l7);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b() {
        th2.e(this.f3171c);
        this.f3172d.b();
        a3 a3Var = this.f3174f;
        if (a3Var != null) {
            a3Var.d();
        }
        this.f3173e.b();
        this.f3175g = 0L;
        this.f3179k = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void d(rc4 rc4Var, k4 k4Var) {
        k4Var.c();
        this.f3176h = k4Var.b();
        td4 r7 = rc4Var.r(k4Var.a(), 2);
        this.f3177i = r7;
        this.f3174f = new a3(r7);
        this.f3169a.b(rc4Var, k4Var);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f3179k = j7;
        }
    }
}
