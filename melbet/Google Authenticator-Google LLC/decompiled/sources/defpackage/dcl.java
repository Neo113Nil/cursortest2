package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dcl extends cqd {
    public dcl(Context context, Looper looper, cpr cprVar, cmt cmtVar, cmu cmuVar) {
        super(context, looper, 38, cprVar, cmtVar, cmuVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
        return queryLocalInterface instanceof dck ? (dck) queryLocalInterface : new dck(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.pseudonymous.service.START";
    }

    @Override // defpackage.cpo
    public final boolean e() {
        return true;
    }

    @Override // defpackage.cpo
    public final cli[] g() {
        return dcd.d;
    }
}
