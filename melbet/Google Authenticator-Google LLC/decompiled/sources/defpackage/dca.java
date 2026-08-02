package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dca extends bmr implements IInterface {
    public dca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void e(dbz dbzVar, String str) {
        Parcel a = a();
        bmt.d(a, dbzVar);
        a.writeString(str);
        c(5, a);
    }
}
