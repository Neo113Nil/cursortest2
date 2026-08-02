package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crm extends cqd {
    public crm(Context context, Looper looper, cpr cprVar, cnx cnxVar, cot cotVar) {
        super(context, looper, 483, cprVar, cnxVar, cotVar);
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 253600000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientThrottlingTelemetryService");
        return queryLocalInterface instanceof crp ? (crp) queryLocalInterface : new crp(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientThrottlingTelemetryService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.common.telemetry.throttling.service.START";
    }

    @Override // defpackage.cpo
    protected final boolean f() {
        return true;
    }

    @Override // defpackage.cpo
    public final cli[] g() {
        return cle.d;
    }
}
