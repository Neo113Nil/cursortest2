package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.v61;

/* loaded from: classes.dex */
final class ho2<R extends ea1<AdT>, AdT extends v61> implements ou2<R, AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final ep2<R, cu2<R, AdT>> f6369a;

    public ho2(ep2<R, cu2<R, AdT>> ep2Var) {
        this.f6369a = ep2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ou2
    public final cc3<cu2<R, AdT>> a(pu2<R, AdT> pu2Var) {
        io2 io2Var = (io2) pu2Var;
        return ((eo2) this.f6369a).c(io2Var.f6722b, io2Var.f6721a, null);
    }

    @Override // com.google.android.gms.internal.ads.ou2
    public final void b(cu2<R, AdT> cu2Var) {
        cu2Var.f3950a = (R) ((eo2) this.f6369a).b();
    }
}
