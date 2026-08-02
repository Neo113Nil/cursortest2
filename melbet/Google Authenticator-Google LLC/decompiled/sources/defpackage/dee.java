package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class dee extends bms implements IInterface {
    public dee() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) bmt.a(parcel, Status.CREATOR);
                ded dedVar = (ded) bmt.a(parcel, ded.CREATOR);
                bmt.b(parcel);
                b(status, dedVar);
                return true;
            case 3:
                bmt.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 4:
                Status status2 = (Status) bmt.a(parcel, Status.CREATOR);
                bmt.b(parcel);
                c(status2);
                return true;
            case 5:
                Status status3 = (Status) bmt.a(parcel, Status.CREATOR);
                bmt.b(parcel);
                d(status3);
                return true;
            case 6:
                parcel.createStringArrayList();
                bmt.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 7:
                bmt.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 8:
                bmt.e(parcel);
                bmt.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                bmt.b(parcel);
                throw new IllegalStateException("Not implemented");
            case 10:
                bmt.b(parcel);
                throw new IllegalStateException("Not implemented");
            case 11:
                bmt.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                bmt.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                bmt.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                bmt.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 15:
                bmt.b(parcel);
                throw new IllegalStateException("Not implemented.");
            default:
                return false;
        }
    }

    public void b(Status status, ded dedVar) {
        throw new IllegalStateException("Not implemented.");
    }

    public void c(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    public void d(Status status) {
        throw new IllegalStateException("Not implemented.");
    }
}
