package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class l2 implements oc4 {

    /* renamed from: d, reason: collision with root package name */
    public static final vc4 f7776d = new vc4() { // from class: com.google.android.gms.internal.ads.k2
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = l2.f7776d;
            return new oc4[]{new l2()};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final m2 f7777a = new m2(null);

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f7778b = new dr2(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f7779c;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        r9.i();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if ((r5 - r3) >= 8192) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.oc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(pc4 pc4Var) {
        dr2 dr2Var = new dr2(10);
        int i7 = 0;
        while (true) {
            jc4 jc4Var = (jc4) pc4Var;
            jc4Var.n(dr2Var.h(), 0, 10, false);
            dr2Var.f(0);
            if (dr2Var.u() != 4801587) {
                break;
            }
            dr2Var.g(3);
            int r7 = dr2Var.r();
            i7 += r7 + 10;
            jc4Var.o(r7, false);
        }
        pc4Var.i();
        jc4 jc4Var2 = (jc4) pc4Var;
        jc4Var2.o(i7, false);
        int i8 = i7;
        while (true) {
            int i9 = 0;
            while (true) {
                jc4Var2.n(dr2Var.h(), 0, 6, false);
                dr2Var.f(0);
                if (dr2Var.w() != 2935) {
                    break;
                }
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                int a7 = tb4.a(dr2Var.h());
                if (a7 == -1) {
                    return false;
                }
                jc4Var2.o(a7 - 6, false);
            }
            jc4Var2.o(i8, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final int e(pc4 pc4Var, md4 md4Var) {
        int a7 = pc4Var.a(this.f7778b.h(), 0, 2786);
        if (a7 == -1) {
            return -1;
        }
        this.f7778b.f(0);
        this.f7778b.e(a7);
        if (!this.f7779c) {
            this.f7777a.e(0L, 4);
            this.f7779c = true;
        }
        this.f7777a.a(this.f7778b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f7777a.d(rc4Var, new k4(Integer.MIN_VALUE, 0, 1));
        rc4Var.H();
        rc4Var.p(new od4(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        this.f7779c = false;
        this.f7777a.b();
    }
}
