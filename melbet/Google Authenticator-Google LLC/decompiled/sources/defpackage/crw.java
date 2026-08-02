package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crw extends cqd {
    private final crh v;

    public crw(Context context, Looper looper, cpr cprVar, crh crhVar, cnx cnxVar, cot cotVar) {
        super(context, looper, 270, cprVar, cnxVar, cotVar);
        this.v = crhVar;
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 203400000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof cro ? (cro) queryLocalInterface : new cro(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.cpo
    protected final boolean f() {
        return true;
    }

    @Override // defpackage.cpo
    public final cli[] g() {
        return cle.d;
    }

    @Override // defpackage.cpo
    protected final Bundle u() {
        Bundle bundle = new Bundle();
        String str = this.v.c;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
