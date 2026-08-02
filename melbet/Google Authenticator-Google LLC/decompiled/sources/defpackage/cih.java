package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cih extends cqd {
    public cih(Context context, Looper looper, cpr cprVar, cnx cnxVar, cot cotVar) {
        super(context, looper, 343, cprVar, cnxVar, cotVar);
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 234200000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.aang.internal.IGoogleAuthAangService");
        return queryLocalInterface instanceof cij ? (cij) queryLocalInterface : new cij(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.auth.aang.internal.IGoogleAuthAangService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.auth.aang.events.services.START";
    }

    @Override // defpackage.cpo
    public final boolean e() {
        return true;
    }

    @Override // defpackage.cpo
    protected final boolean f() {
        return true;
    }

    @Override // defpackage.cpo
    public final cli[] g() {
        return new cli[]{new cli("google_auth_api", -1, 1L, false), chg.i, chg.j, chg.g};
    }
}
