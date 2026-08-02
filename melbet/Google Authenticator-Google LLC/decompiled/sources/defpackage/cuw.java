package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cuw extends bms implements IInterface {
    public cuw() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                GoogleHelp googleHelp = (GoogleHelp) bmt.a(parcel, GoogleHelp.CREATOR);
                bmt.b(parcel);
                d(googleHelp);
                parcel2.writeNoException();
                return true;
            case 2:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                b();
                return true;
            case 8:
                c();
                return true;
            case 9:
                parcel.readInt();
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 10:
                throw new UnsupportedOperationException();
            case 11:
                throw new UnsupportedOperationException();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                throw new UnsupportedOperationException();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                parcel.createByteArray();
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                throw new UnsupportedOperationException();
            case 15:
                parcel.createByteArray();
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 16:
                throw new UnsupportedOperationException();
            case 17:
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 18:
                parcel.createByteArray();
                bmt.b(parcel);
                throw new UnsupportedOperationException();
            case 19:
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }

    public void b() {
        throw new UnsupportedOperationException();
    }

    public void c() {
        throw new UnsupportedOperationException();
    }

    public void d(GoogleHelp googleHelp) {
        throw new UnsupportedOperationException();
    }
}
