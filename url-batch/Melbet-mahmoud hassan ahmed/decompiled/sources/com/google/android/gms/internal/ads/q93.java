package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* loaded from: classes.dex */
final class q93<V, X extends Throwable> extends s93<V, X, xa3<? super X, ? extends V>, cc3<? extends V>> {
    q93(cc3<? extends V> cc3Var, Class<X> cls, xa3<? super X, ? extends V> xa3Var) {
        super(cc3Var, cls, xa3Var);
    }

    @Override // com.google.android.gms.internal.ads.s93
    final /* bridge */ /* synthetic */ Object F(Object obj, Throwable th) {
        xa3 xa3Var = (xa3) obj;
        cc3 c7 = xa3Var.c(th);
        q43.d(c7, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", xa3Var);
        return c7;
    }

    @Override // com.google.android.gms.internal.ads.s93
    final /* synthetic */ void G(Object obj) {
        y((cc3) obj);
    }
}
