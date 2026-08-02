package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class dcj extends bms implements IInterface {
    public dcj() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) bmt.a(parcel, Status.CREATOR);
                dch dchVar = (dch) bmt.a(parcel, dch.CREATOR);
                cmn cmnVar = (cmn) bmt.a(parcel, cmn.CREATOR);
                bmt.b(parcel);
                b(status, dchVar, cmnVar);
                return true;
            case 2:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                parcel.readLong();
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                parcel.createTypedArrayList(dci.CREATOR);
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 5:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }

    public void b(Status status, dch dchVar, cmn cmnVar) {
        throw null;
    }
}
