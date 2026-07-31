package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class y1 implements oc4 {

    /* renamed from: d, reason: collision with root package name */
    public static final vc4 f14482d = new vc4() { // from class: com.google.android.gms.internal.ads.x1
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = y1.f14482d;
            return new oc4[]{new y1()};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private rc4 f14483a;

    /* renamed from: b, reason: collision with root package name */
    private h2 f14484b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14485c;

    private final boolean a(pc4 pc4Var) {
        h2 c2Var;
        a2 a2Var = new a2();
        if (a2Var.b(pc4Var, true) && (a2Var.f2555a & 2) == 2) {
            int min = Math.min(a2Var.f2559e, 8);
            dr2 dr2Var = new dr2(min);
            ((jc4) pc4Var).n(dr2Var.h(), 0, min, false);
            dr2Var.f(0);
            if (dr2Var.i() >= 5 && dr2Var.s() == 127 && dr2Var.A() == 1179402563) {
                c2Var = new w1();
            } else {
                dr2Var.f(0);
                try {
                    if (yd4.c(1, dr2Var, true)) {
                        c2Var = new j2();
                    }
                } catch (dz unused) {
                }
                dr2Var.f(0);
                if (c2.j(dr2Var)) {
                    c2Var = new c2();
                }
            }
            this.f14484b = c2Var;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(pc4 pc4Var) {
        try {
            return a(pc4Var);
        } catch (dz unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final int e(pc4 pc4Var, md4 md4Var) {
        wu1.b(this.f14483a);
        if (this.f14484b == null) {
            if (!a(pc4Var)) {
                throw dz.a("Failed to determine bitstream type", null);
            }
            pc4Var.i();
        }
        if (!this.f14485c) {
            td4 r7 = this.f14483a.r(0, 1);
            this.f14483a.H();
            this.f14484b.g(this.f14483a, r7);
            this.f14485c = true;
        }
        return this.f14484b.d(pc4Var, md4Var);
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f14483a = rc4Var;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        h2 h2Var = this.f14484b;
        if (h2Var != null) {
            h2Var.i(j7, j8);
        }
    }
}
