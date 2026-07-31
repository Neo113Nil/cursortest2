package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.util.Map;

/* loaded from: classes.dex */
public final class v3 implements oc4 {

    /* renamed from: l, reason: collision with root package name */
    public static final vc4 f13101l = new vc4() { // from class: com.google.android.gms.internal.ads.t3
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = v3.f13101l;
            return new oc4[]{new v3()};
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private boolean f13106e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13107f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13108g;

    /* renamed from: h, reason: collision with root package name */
    private long f13109h;

    /* renamed from: i, reason: collision with root package name */
    private r3 f13110i;

    /* renamed from: j, reason: collision with root package name */
    private rc4 f13111j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13112k;

    /* renamed from: a, reason: collision with root package name */
    private final ky2 f13102a = new ky2(0);

    /* renamed from: c, reason: collision with root package name */
    private final dr2 f13104c = new dr2(4096);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<u3> f13103b = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    private final s3 f13105d = new s3();

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(pc4 pc4Var) {
        byte[] bArr = new byte[14];
        jc4 jc4Var = (jc4) pc4Var;
        jc4Var.n(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        jc4Var.o(bArr[13] & 7, false);
        jc4Var.n(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    @Override // com.google.android.gms.internal.ads.oc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(pc4 pc4Var, md4 md4Var) {
        w2 y2Var;
        wu1.b(this.f13111j);
        long c7 = pc4Var.c();
        if (c7 != -1 && !this.f13105d.e()) {
            return this.f13105d.a(pc4Var, md4Var);
        }
        if (!this.f13112k) {
            this.f13112k = true;
            if (this.f13105d.b() != -9223372036854775807L) {
                r3 r3Var = new r3(this.f13105d.d(), this.f13105d.b(), c7);
                this.f13110i = r3Var;
                this.f13111j.p(r3Var.b());
            } else {
                this.f13111j.p(new od4(this.f13105d.b(), 0L));
            }
        }
        r3 r3Var2 = this.f13110i;
        if (r3Var2 != null && r3Var2.e()) {
            return this.f13110i.a(pc4Var, md4Var);
        }
        pc4Var.i();
        long g7 = c7 != -1 ? c7 - pc4Var.g() : -1L;
        if ((g7 != -1 && g7 < 4) || !pc4Var.n(this.f13104c.h(), 0, 4, true)) {
            return -1;
        }
        this.f13104c.f(0);
        int m7 = this.f13104c.m();
        if (m7 == 441) {
            return -1;
        }
        if (m7 == 442) {
            jc4 jc4Var = (jc4) pc4Var;
            jc4Var.n(this.f13104c.h(), 0, 10, false);
            this.f13104c.f(9);
            jc4Var.p((this.f13104c.s() & 7) + 14, false);
            return 0;
        }
        if (m7 == 443) {
            jc4 jc4Var2 = (jc4) pc4Var;
            jc4Var2.n(this.f13104c.h(), 0, 2, false);
            this.f13104c.f(0);
            jc4Var2.p(this.f13104c.w() + 6, false);
            return 0;
        }
        if ((m7 >> 8) != 1) {
            ((jc4) pc4Var).p(1, false);
            return 0;
        }
        int i7 = m7 & 255;
        u3 u3Var = this.f13103b.get(i7);
        if (!this.f13106e) {
            if (u3Var == null) {
                w2 w2Var = null;
                if (i7 == 189) {
                    y2Var = new m2(null);
                } else if ((i7 & 224) == 192) {
                    y2Var = new l3(null);
                } else {
                    if ((i7 & 240) == 224) {
                        y2Var = new y2(null);
                        this.f13108g = true;
                        this.f13109h = pc4Var.b();
                        w2Var = y2Var;
                    }
                    if (w2Var != null) {
                        w2Var.d(this.f13111j, new k4(Integer.MIN_VALUE, i7, 256));
                        u3Var = new u3(w2Var, this.f13102a);
                        this.f13103b.put(i7, u3Var);
                    }
                }
                this.f13107f = true;
                this.f13109h = pc4Var.b();
                w2Var = y2Var;
                if (w2Var != null) {
                }
            }
            long j7 = 1048576;
            if (this.f13107f && this.f13108g) {
                j7 = this.f13109h + 8192;
            }
            if (pc4Var.b() > j7) {
                this.f13106e = true;
                this.f13111j.H();
            }
        }
        jc4 jc4Var3 = (jc4) pc4Var;
        jc4Var3.n(this.f13104c.h(), 0, 2, false);
        this.f13104c.f(0);
        int w6 = this.f13104c.w() + 6;
        if (u3Var == null) {
            jc4Var3.p(w6, false);
        } else {
            this.f13104c.c(w6);
            jc4Var3.m(this.f13104c.h(), 0, w6, false);
            this.f13104c.f(6);
            u3Var.a(this.f13104c);
            dr2 dr2Var = this.f13104c;
            dr2Var.e(dr2Var.j());
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f13111j = rc4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4 != r6) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[LOOP:0: B:13:0x0030->B:15:0x0038, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.oc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j7, long j8) {
        r3 r3Var;
        int i7;
        if (this.f13102a.e() != -9223372036854775807L) {
            long c7 = this.f13102a.c();
            if (c7 != -9223372036854775807L) {
                if (c7 != 0) {
                }
            }
            r3Var = this.f13110i;
            if (r3Var != null) {
                r3Var.d(j8);
            }
            for (i7 = 0; i7 < this.f13103b.size(); i7++) {
                this.f13103b.valueAt(i7).b();
            }
        }
        this.f13102a.f(j8);
        r3Var = this.f13110i;
        if (r3Var != null) {
        }
        while (i7 < this.f13103b.size()) {
        }
    }
}
