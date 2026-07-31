package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ka3<I, O> extends ma3<I, O, xa3<? super I, ? extends O>, cc3<? extends O>> {
    ka3(cc3<? extends I> cc3Var, xa3<? super I, ? extends O> xa3Var) {
        super(cc3Var, xa3Var);
    }

    @Override // com.google.android.gms.internal.ads.ma3
    final /* bridge */ /* synthetic */ Object F(Object obj, Object obj2) {
        xa3 xa3Var = (xa3) obj;
        cc3<O> c7 = xa3Var.c(obj2);
        q43.d(c7, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", xa3Var);
        return c7;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    final /* synthetic */ void G(Object obj) {
        y((cc3) obj);
    }
}
