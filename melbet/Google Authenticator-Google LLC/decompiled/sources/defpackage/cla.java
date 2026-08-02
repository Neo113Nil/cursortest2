package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cla extends cqd {
    public cla(Context context, Looper looper, cpr cprVar, cnx cnxVar, cot cotVar) {
        super(context, looper, 414, cprVar, cnxVar, cotVar);
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 250200000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService");
        return queryLocalInterface instanceof clb ? (clb) queryLocalInterface : new clb(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.clearcut.sampler.service.START";
    }

    @Override // defpackage.cpo
    public final cli[] g() {
        return new cli[]{cjs.b};
    }
}
