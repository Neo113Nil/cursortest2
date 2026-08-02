package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cqv extends bmr implements IInterface {
    public cqv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final cly e(clx clxVar) {
        Parcel a = a();
        bmt.c(a, clxVar);
        Parcel b = b(6, a);
        cly clyVar = (cly) bmt.a(b, cly.CREATOR);
        b.recycle();
        return clyVar;
    }

    public final boolean f() {
        Parcel b = b(7, a());
        boolean e = bmt.e(b);
        b.recycle();
        return e;
    }
}
