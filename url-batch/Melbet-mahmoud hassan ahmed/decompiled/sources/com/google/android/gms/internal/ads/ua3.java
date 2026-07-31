package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
final class ua3 extends ra3 {
    /* synthetic */ ua3(ta3 ta3Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.ra3
    final int a(va3<?> va3Var) {
        int i7;
        int i8;
        synchronized (va3Var) {
            i7 = ((va3) va3Var).f13285n;
            i8 = i7 - 1;
            ((va3) va3Var).f13285n = i8;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.ra3
    final void b(va3<?> va3Var, Set<Throwable> set, Set<Throwable> set2) {
        Set set3;
        synchronized (va3Var) {
            set3 = ((va3) va3Var).f13284m;
            if (set3 == null) {
                ((va3) va3Var).f13284m = set2;
            }
        }
    }
}
