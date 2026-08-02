package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avw implements awg {
    public final ConnectivityManager a;

    public avw(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.awg
    public final kzq a(ary aryVar) {
        aryVar.getClass();
        return new kzl(new dta(aryVar, this, (kqj) null, 1));
    }

    @Override // defpackage.awg
    public final boolean b(axt axtVar) {
        return (axtVar.k.a() == null && axtVar.k.j == 1) ? false : true;
    }

    @Override // defpackage.awg
    public final boolean c(axt axtVar) {
        if (b(axtVar)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
