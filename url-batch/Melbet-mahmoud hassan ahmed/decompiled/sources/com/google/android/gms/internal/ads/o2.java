package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class o2 implements oc4 {

    /* renamed from: d, reason: collision with root package name */
    public static final vc4 f9446d = new vc4() { // from class: com.google.android.gms.internal.ads.n2
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = o2.f9446d;
            return new oc4[]{new o2()};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final p2 f9447a = new p2(null);

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f9448b = new dr2(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f9449c;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r16.i();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if ((r5 - r3) >= 8192) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.oc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(pc4 pc4Var) {
        int i7;
        dr2 dr2Var = new dr2(10);
        int i8 = 0;
        while (true) {
            jc4 jc4Var = (jc4) pc4Var;
            jc4Var.n(dr2Var.h(), 0, 10, false);
            dr2Var.f(0);
            if (dr2Var.u() != 4801587) {
                break;
            }
            dr2Var.g(3);
            int r7 = dr2Var.r();
            i8 += r7 + 10;
            jc4Var.o(r7, false);
        }
        pc4Var.i();
        jc4 jc4Var2 = (jc4) pc4Var;
        jc4Var2.o(i8, false);
        int i9 = i8;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = 7;
                jc4Var2.n(dr2Var.h(), 0, 7, false);
                dr2Var.f(0);
                int w6 = dr2Var.w();
                if (w6 != 44096 && w6 != 44097) {
                    break;
                }
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] h7 = dr2Var.h();
                int i12 = wb4.f13789b;
                if (h7.length < 7) {
                    i7 = -1;
                } else {
                    int i13 = ((h7[2] & 255) << 8) | (h7[3] & 255);
                    if (i13 == 65535) {
                        i13 = ((h7[4] & 255) << 16) | ((h7[5] & 255) << 8) | (h7[6] & 255);
                    } else {
                        i11 = 4;
                    }
                    if (w6 == 44097) {
                        i11 += 2;
                    }
                    i7 = i13 + i11;
                }
                if (i7 == -1) {
                    return false;
                }
                jc4Var2.o(i7 - 7, false);
            }
            jc4Var2.o(i9, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final int e(pc4 pc4Var, md4 md4Var) {
        int a7 = pc4Var.a(this.f9448b.h(), 0, 16384);
        if (a7 == -1) {
            return -1;
        }
        this.f9448b.f(0);
        this.f9448b.e(a7);
        if (!this.f9449c) {
            this.f9447a.e(0L, 4);
            this.f9449c = true;
        }
        this.f9447a.a(this.f9448b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f9447a.d(rc4Var, new k4(Integer.MIN_VALUE, 0, 1));
        rc4Var.H();
        rc4Var.p(new od4(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        this.f9449c = false;
        this.f9447a.b();
    }
}
