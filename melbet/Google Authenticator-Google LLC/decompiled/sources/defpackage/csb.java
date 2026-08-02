package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class csb extends bms implements IInterface {
    public csb() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) bmt.a(parcel, Status.CREATOR);
            crx crxVar = (crx) bmt.a(parcel, crx.CREATOR);
            bmt.b(parcel);
            c(status, crxVar);
        } else {
            if (i != 2) {
                if (i == 3) {
                    bmt.b(parcel);
                    throw new UnsupportedOperationException();
                }
                if (i != 4) {
                    return false;
                }
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            }
            Status status2 = (Status) bmt.a(parcel, Status.CREATOR);
            crz crzVar = (crz) bmt.a(parcel, crz.CREATOR);
            bmt.b(parcel);
            b(status2, crzVar);
        }
        return true;
    }

    public void b(Status status, crz crzVar) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, crx crxVar) {
        throw new UnsupportedOperationException();
    }
}
