package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ckk extends bms implements IInterface {
    public ckk() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) bmt.a(parcel, Status.CREATOR);
                bmt.b(parcel);
                c(status);
                return true;
            case 2:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                parcel.readLong();
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 5:
                parcel.readLong();
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 8:
                Status status2 = (Status) bmt.a(parcel, Status.CREATOR);
                bmt.b(parcel);
                b(status2);
                return true;
            case 9:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }
}
