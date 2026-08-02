package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyz extends cqd {
    public cyz(Context context, Looper looper, cpr cprVar, cnx cnxVar, cot cotVar) {
        super(context, looper, 208, cprVar, cnxVar, cotVar);
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 224500000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService");
        return queryLocalInterface instanceof czb ? (czb) queryLocalInterface : new czb(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.people.contactssync.service.THIRD_PARTY_START";
    }

    @Override // defpackage.cpo
    public final boolean e() {
        return true;
    }

    @Override // defpackage.cpo
    public final cli[] g() {
        return new cli[]{cyj.w, cyj.v, cyj.u, cyj.E};
    }
}
