package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class r2 implements oc4 {

    /* renamed from: j, reason: collision with root package name */
    public static final vc4 f10982j = new vc4() { // from class: com.google.android.gms.internal.ads.q2
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = r2.f10982j;
            return new oc4[]{new r2(0)};
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final dr2 f10985c;

    /* renamed from: d, reason: collision with root package name */
    private final cq2 f10986d;

    /* renamed from: e, reason: collision with root package name */
    private rc4 f10987e;

    /* renamed from: f, reason: collision with root package name */
    private long f10988f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10990h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10991i;

    /* renamed from: a, reason: collision with root package name */
    private final s2 f10983a = new s2(true, null);

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f10984b = new dr2(2048);

    /* renamed from: g, reason: collision with root package name */
    private long f10989g = -1;

    public r2(int i7) {
        dr2 dr2Var = new dr2(10);
        this.f10985c = dr2Var;
        byte[] h7 = dr2Var.h();
        this.f10986d = new cq2(h7, h7.length);
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(pc4 pc4Var) {
        int i7 = 0;
        while (true) {
            jc4 jc4Var = (jc4) pc4Var;
            jc4Var.n(this.f10985c.h(), 0, 10, false);
            this.f10985c.f(0);
            if (this.f10985c.u() != 4801587) {
                break;
            }
            this.f10985c.g(3);
            int r7 = this.f10985c.r();
            i7 += r7 + 10;
            jc4Var.o(r7, false);
        }
        pc4Var.i();
        jc4 jc4Var2 = (jc4) pc4Var;
        jc4Var2.o(i7, false);
        if (this.f10989g == -1) {
            this.f10989g = i7;
        }
        int i8 = i7;
        int i9 = 0;
        int i10 = 0;
        do {
            jc4Var2.n(this.f10985c.h(), 0, 2, false);
            this.f10985c.f(0);
            if (s2.f(this.f10985c.w())) {
                i9++;
                if (i9 >= 4 && i10 > 188) {
                    return true;
                }
                jc4Var2.n(this.f10985c.h(), 0, 4, false);
                this.f10986d.h(14);
                int c7 = this.f10986d.c(13);
                if (c7 > 6) {
                    jc4Var2.o(c7 - 6, false);
                    i10 += c7;
                }
            }
            i8++;
            pc4Var.i();
            jc4Var2.o(i8, false);
            i9 = 0;
            i10 = 0;
        } while (i8 - i7 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final int e(pc4 pc4Var, md4 md4Var) {
        wu1.b(this.f10987e);
        int a7 = pc4Var.a(this.f10984b.h(), 0, 2048);
        if (!this.f10991i) {
            this.f10987e.p(new od4(-9223372036854775807L, 0L));
            this.f10991i = true;
        }
        if (a7 == -1) {
            return -1;
        }
        this.f10984b.f(0);
        this.f10984b.e(a7);
        if (!this.f10990h) {
            this.f10983a.e(this.f10988f, 4);
            this.f10990h = true;
        }
        this.f10983a.a(this.f10984b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f10987e = rc4Var;
        this.f10983a.d(rc4Var, new k4(Integer.MIN_VALUE, 0, 1));
        rc4Var.H();
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        this.f10990h = false;
        this.f10983a.b();
        this.f10988f = j8;
    }
}
