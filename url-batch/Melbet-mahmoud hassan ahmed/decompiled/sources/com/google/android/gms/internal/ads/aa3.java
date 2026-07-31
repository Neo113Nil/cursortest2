package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class aa3 extends u93 {
    /* synthetic */ aa3(ha3 ha3Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.u93
    final void a(fa3 fa3Var, fa3 fa3Var2) {
        fa3Var.f5068b = fa3Var2;
    }

    @Override // com.google.android.gms.internal.ads.u93
    final void b(fa3 fa3Var, Thread thread) {
        fa3Var.f5067a = thread;
    }

    @Override // com.google.android.gms.internal.ads.u93
    final boolean c(ga3<?> ga3Var, x93 x93Var, x93 x93Var2) {
        x93 x93Var3;
        synchronized (ga3Var) {
            x93Var3 = ((ga3) ga3Var).f5521g;
            if (x93Var3 != x93Var) {
                return false;
            }
            ((ga3) ga3Var).f5521g = x93Var2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.u93
    final boolean d(ga3<?> ga3Var, Object obj, Object obj2) {
        Object obj3;
        synchronized (ga3Var) {
            obj3 = ((ga3) ga3Var).f5520f;
            if (obj3 != obj) {
                return false;
            }
            ((ga3) ga3Var).f5520f = obj2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.u93
    final boolean e(ga3<?> ga3Var, fa3 fa3Var, fa3 fa3Var2) {
        fa3 fa3Var3;
        synchronized (ga3Var) {
            fa3Var3 = ((ga3) ga3Var).f5522h;
            if (fa3Var3 != fa3Var) {
                return false;
            }
            ((ga3) ga3Var).f5522h = fa3Var2;
            return true;
        }
    }
}
