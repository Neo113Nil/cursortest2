package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class def extends bmr implements IInterface {
    public def(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void e(dbz dbzVar, dee deeVar) {
        Parcel a = a();
        bmt.d(a, dbzVar);
        bmt.d(a, deeVar);
        c(4, a);
    }
}
