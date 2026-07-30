package I1;

import S.j;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class d extends Binder implements e, IInterface {
    public d() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i5)) {
            return true;
        }
        switch (i2) {
            case 3:
                C1.b.b(parcel);
                break;
            case 4:
                C1.b.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                C1.b.b(parcel);
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                C1.b.b(parcel);
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                h hVar = (h) C1.b.a(parcel, h.CREATOR);
                C1.b.b(parcel);
                a(hVar);
                break;
            case 9:
                C1.b.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
