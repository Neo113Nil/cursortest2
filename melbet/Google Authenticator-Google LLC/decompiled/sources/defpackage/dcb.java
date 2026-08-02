package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dcb extends cqd {
    public dcb(Context context, Looper looper, cpr cprVar, cmt cmtVar, cmu cmuVar) {
        super(context, looper, 51, cprVar, cmtVar, cmuVar);
    }

    @Override // defpackage.cpo
    public final boolean D() {
        return false;
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 9410000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return queryLocalInterface instanceof dca ? (dca) queryLocalInterface : new dca(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // defpackage.cpo
    public final cli[] g() {
        return dbm.k;
    }
}
