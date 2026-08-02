package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cxt extends bms implements IInterface {
    public cxt() {
        super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) bmt.a(parcel, Status.CREATOR);
            cyb cybVar = (cyb) bmt.a(parcel, cyb.CREATOR);
            cmn cmnVar = (cmn) bmt.a(parcel, cmn.CREATOR);
            bmt.b(parcel);
            c(status, cybVar, cmnVar);
        } else if (i == 2) {
            Status status2 = (Status) bmt.a(parcel, Status.CREATOR);
            cmn cmnVar2 = (cmn) bmt.a(parcel, cmn.CREATOR);
            bmt.b(parcel);
            b(status2, cmnVar2);
        } else {
            if (i != 3) {
                return false;
            }
            Status status3 = (Status) bmt.a(parcel, Status.CREATOR);
            cmn cmnVar3 = (cmn) bmt.a(parcel, cmn.CREATOR);
            bmt.b(parcel);
            d(status3, cmnVar3);
        }
        return true;
    }

    public void b(Status status, cmn cmnVar) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, cyb cybVar, cmn cmnVar) {
        throw new UnsupportedOperationException();
    }

    public void d(Status status, cmn cmnVar) {
        throw new UnsupportedOperationException();
    }
}
