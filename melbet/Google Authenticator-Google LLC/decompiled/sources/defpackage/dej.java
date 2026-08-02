package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dej extends cqd {
    private final AtomicReference v;

    public dej(Context context, Looper looper, cpr cprVar, cmt cmtVar, cmu cmuVar) {
        super(context, looper, 41, cprVar, cmtVar, cmuVar);
        this.v = new AtomicReference();
    }

    public final void I(dbz dbzVar, dbz dbzVar2, cnr cnrVar) {
        dei deiVar = new dei((def) v(), cnrVar, dbzVar2);
        if (dbzVar == null) {
            if (dbzVar2 == null) {
                cnrVar.i(Status.a);
                return;
            } else {
                ((def) v()).e(dbzVar2, deiVar);
                return;
            }
        }
        def defVar = (def) v();
        Parcel a = defVar.a();
        bmt.d(a, dbzVar);
        bmt.d(a, deiVar);
        defVar.c(10, a);
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return queryLocalInterface instanceof def ? (def) queryLocalInterface : new def(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.cpo
    public final boolean e() {
        return true;
    }

    @Override // defpackage.cpo
    public final cli[] g() {
        return ddr.g;
    }

    @Override // defpackage.cpo
    public final void y() {
        try {
            dbz dbzVar = (dbz) this.v.getAndSet(null);
            if (dbzVar != null) {
                deh dehVar = new deh();
                def defVar = (def) v();
                Parcel a = defVar.a();
                bmt.d(a, dbzVar);
                bmt.d(a, dehVar);
                defVar.c(5, a);
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.y();
    }
}
