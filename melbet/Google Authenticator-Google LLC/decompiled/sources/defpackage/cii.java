package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cii extends bms implements IInterface {
    public cii() {
        super("com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks");
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) bmt.a(parcel, Status.CREATOR);
                chz chzVar = (chz) bmt.a(parcel, chz.CREATOR);
                bmt.b(parcel);
                c(status, chzVar);
                return true;
            case 2:
                Status status2 = (Status) bmt.a(parcel, Status.CREATOR);
                cic cicVar = (cic) bmt.a(parcel, cic.CREATOR);
                bmt.b(parcel);
                d(status2, cicVar);
                return true;
            case 3:
                Status status3 = (Status) bmt.a(parcel, Status.CREATOR);
                int readInt = parcel.readInt();
                bmt.b(parcel);
                e(status3, readInt);
                return true;
            case 4:
                Status status4 = (Status) bmt.a(parcel, Status.CREATOR);
                cht chtVar = (cht) bmt.a(parcel, cht.CREATOR);
                bmt.b(parcel);
                b(status4, chtVar);
                return true;
            case 5:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                Status status5 = (Status) bmt.a(parcel, Status.CREATOR);
                cic cicVar2 = (cic) bmt.a(parcel, cic.CREATOR);
                bmt.b(parcel);
                f(status5, cicVar2);
                return true;
            case 8:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }

    public void b(Status status, cht chtVar) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, chz chzVar) {
        throw new UnsupportedOperationException();
    }

    public void d(Status status, cic cicVar) {
        throw new UnsupportedOperationException();
    }

    public void e(Status status, int i) {
        throw new UnsupportedOperationException();
    }

    public void f(Status status, cic cicVar) {
        throw new UnsupportedOperationException();
    }
}
