package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class daf extends bmr implements IInterface {
    public daf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    public final void e(dae daeVar, boolean z, int i, cmn cmnVar) {
        Parcel a = a();
        bmt.d(a, daeVar);
        a.writeInt(z ? 1 : 0);
        a.writeString(null);
        a.writeString(null);
        a.writeInt(i);
        bmt.c(a, cmnVar);
        Parcel b = b(11, a);
        b.recycle();
    }
}
