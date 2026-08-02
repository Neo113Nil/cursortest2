package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.TetheredSyncStatus;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.actionpreferences.RawContactActionPreference;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cza extends bms implements IInterface {
    public cza() {
        super("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                bmt.b(parcel);
                return true;
            case 2:
                bmt.b(parcel);
                return true;
            case 3:
                bmt.b(parcel);
                return true;
            case 4:
                bmt.b(parcel);
                return true;
            case 5:
                bmt.b(parcel);
                return true;
            case 6:
                bmt.b(parcel);
                return true;
            case 7:
                Status status = (Status) bmt.a(parcel, Status.CREATOR);
                czn cznVar = (czn) bmt.a(parcel, czn.CREATOR);
                cmn cmnVar = (cmn) bmt.a(parcel, cmn.CREATOR);
                bmt.b(parcel);
                b(status, cznVar, cmnVar);
                return true;
            case 8:
                bmt.b(parcel);
                return true;
            case 9:
                bmt.b(parcel);
                return true;
            case 10:
                parcel.createTypedArrayList(cyu.CREATOR);
                bmt.b(parcel);
                return true;
            case 11:
                bmt.b(parcel);
                return true;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                bmt.b(parcel);
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                bmt.f(parcel);
                bmt.b(parcel);
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                bmt.b(parcel);
                return true;
            case 15:
                bmt.b(parcel);
                return true;
            case 16:
                parcel.readInt();
                bmt.b(parcel);
                return true;
            case 17:
                bmt.f(parcel);
                bmt.b(parcel);
                return true;
            case 18:
                bmt.b(parcel);
                f();
                return true;
            case 19:
                Status status2 = (Status) bmt.a(parcel, Status.CREATOR);
                cmn cmnVar2 = (cmn) bmt.a(parcel, cmn.CREATOR);
                bmt.b(parcel);
                d(status2, cmnVar2);
                return true;
            case 20:
                bmt.b(parcel);
                return true;
            case 21:
                Status status3 = (Status) bmt.a(parcel, Status.CREATOR);
                String readString = parcel.readString();
                cmn cmnVar3 = (cmn) bmt.a(parcel, cmn.CREATOR);
                bmt.b(parcel);
                c(status3, readString, cmnVar3);
                return true;
            case 22:
                bmt.b(parcel);
                return true;
            case 23:
                parcel.createTypedArrayList(CpgDocument.CREATOR);
                bmt.b(parcel);
                return true;
            case 24:
                bmt.b(parcel);
                return true;
            case 25:
                parcel.createTypedArrayList(GetCallingCardResponse.CREATOR);
                bmt.b(parcel);
                return true;
            case 26:
                bmt.b(parcel);
                return true;
            case 27:
                parcel.createTypedArrayList(CallingCardRequestStatus.CREATOR);
                bmt.b(parcel);
                return true;
            case 28:
                bmt.b(parcel);
                return true;
            case 29:
                bmt.f(parcel);
                bmt.b(parcel);
                return true;
            case 30:
                parcel.createTypedArrayList(CallingCardRequestStatus.CREATOR);
                bmt.b(parcel);
                return true;
            case 31:
                bmt.b(parcel);
                return true;
            case 32:
                bmt.b(parcel);
                return true;
            case 33:
                bmt.b(parcel);
                return true;
            case 34:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 35:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 36:
                parcel.createTypedArrayList(czq.CREATOR);
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 37:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 38:
                bmt.b(parcel);
                return true;
            case 39:
                parcel.createTypedArrayList(RawContactActionPreference.CREATOR);
                bmt.b(parcel);
                return true;
            case 40:
                Status status4 = (Status) bmt.a(parcel, Status.CREATOR);
                TetheredSyncStatus tetheredSyncStatus = (TetheredSyncStatus) bmt.a(parcel, TetheredSyncStatus.CREATOR);
                cmn cmnVar4 = (cmn) bmt.a(parcel, cmn.CREATOR);
                bmt.b(parcel);
                e(status4, tetheredSyncStatus, cmnVar4);
                return true;
            case 41:
                bmt.b(parcel);
                return true;
            case 42:
                bmt.b(parcel);
                return true;
            default:
                return false;
        }
    }

    public void f() {
    }

    public void d(Status status, cmn cmnVar) {
    }

    public void b(Status status, czn cznVar, cmn cmnVar) {
    }

    public void c(Status status, String str, cmn cmnVar) {
    }

    public void e(Status status, TetheredSyncStatus tetheredSyncStatus, cmn cmnVar) {
    }
}
