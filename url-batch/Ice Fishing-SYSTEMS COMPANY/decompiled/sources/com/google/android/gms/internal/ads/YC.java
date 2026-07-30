package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class YC extends AbstractRunnableC2918aD {
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC2918aD
    public final /* synthetic */ void t(Object obj) {
        n((J3.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC2918aD
    public final Object u(Object obj, Throwable th) {
        CD cd = (CD) obj;
        J3.a b9 = cd.b(th);
        if (b9 != null) {
            return b9;
        }
        throw new NullPointerException(AbstractC3194fG.u("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", cd));
    }
}
