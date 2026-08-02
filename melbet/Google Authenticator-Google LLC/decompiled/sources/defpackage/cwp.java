package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cwp extends cqd {
    protected cwp(Context context, Looper looper, cpr cprVar, cnx cnxVar, cot cotVar) {
        super(context, looper, 315, cprVar, cnxVar, cotVar);
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 17895000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.inappreach.internal.IInAppReachService");
        return queryLocalInterface instanceof cwl ? (cwl) queryLocalInterface : new cwl(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.inappreach.internal.IInAppReachService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.inappreach.service.START";
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
        return cvb.e;
    }
}
