package G1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import y1.AbstractC1555a;

/* loaded from: classes.dex */
public abstract class c extends Binder implements d, IInterface {
    public c() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        switch (i2) {
            case 3:
                AbstractC1555a.b(parcel);
                break;
            case 4:
                AbstractC1555a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC1555a.b(parcel);
                break;
            case 7:
                AbstractC1555a.b(parcel);
                break;
            case 8:
                g gVar = (g) AbstractC1555a.a(parcel, g.CREATOR);
                AbstractC1555a.b(parcel);
                a(gVar);
                break;
            case 9:
                AbstractC1555a.b(parcel);
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
