package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxm extends cqd {
    public cxm(Context context, Looper looper, cpr cprVar, cnx cnxVar, cot cotVar) {
        super(context, looper, 215, cprVar, cnxVar, cotVar);
    }

    @Override // defpackage.cpo
    public final boolean C() {
        return true;
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 19621000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncService");
        return queryLocalInterface instanceof cxj ? (cxj) queryLocalInterface : new cxj(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.mdisync.internal.IMdiSyncService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.mdisync.service.START";
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
        return cxg.c;
    }
}
