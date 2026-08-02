package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class dcr extends bms implements IInterface {
    public dcr() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                bmt.b(parcel);
                break;
            case 4:
                bmt.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                bmt.b(parcel);
                break;
            case 7:
                bmt.b(parcel);
                break;
            case 8:
                dcw dcwVar = (dcw) bmt.a(parcel, dcw.CREATOR);
                bmt.b(parcel);
                c(dcwVar);
                break;
            case 9:
                bmt.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public void c(dcw dcwVar) {
    }
}
