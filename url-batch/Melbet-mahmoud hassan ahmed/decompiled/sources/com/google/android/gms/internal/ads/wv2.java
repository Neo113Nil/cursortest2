package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class wv2 {
    public static final <O> dw2<O> a(Callable<O> callable, Object obj, ew2 ew2Var) {
        dc3 dc3Var;
        dc3Var = ew2Var.f4791a;
        return b(callable, dc3Var, obj, ew2Var);
    }

    public static final <O> dw2<O> b(Callable<O> callable, dc3 dc3Var, Object obj, ew2 ew2Var) {
        cc3 cc3Var;
        cc3Var = ew2.f4790d;
        return new dw2<>(ew2Var, obj, cc3Var, Collections.emptyList(), dc3Var.E(callable));
    }

    public static final <O> dw2<O> c(cc3<O> cc3Var, Object obj, ew2 ew2Var) {
        cc3 cc3Var2;
        cc3Var2 = ew2.f4790d;
        return new dw2<>(ew2Var, obj, cc3Var2, Collections.emptyList(), cc3Var);
    }

    public static final dw2 d(final qv2 qv2Var, dc3 dc3Var, Object obj, ew2 ew2Var) {
        return b(new Callable() { // from class: com.google.android.gms.internal.ads.vv2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                qv2.this.zza();
                return null;
            }
        }, dc3Var, obj, ew2Var);
    }
}
