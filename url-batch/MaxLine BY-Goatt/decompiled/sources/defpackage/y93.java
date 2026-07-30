package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class y93 extends Binder implements IInterface {
    public final /* synthetic */ int g = 0;

    public y93(String str) {
        attachInterface(this, str);
    }

    public boolean H(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.g;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.g) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                ja3 ja3Var = (ja3) this;
                boolean z = false;
                switch (i) {
                    case 3:
                        fa3.b(parcel);
                        break;
                    case 4:
                        fa3.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        fa3.b(parcel);
                        break;
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                        fa3.b(parcel);
                        break;
                    case 8:
                        ua3 ua3Var = (ua3) fa3.a(parcel, ua3.CREATOR);
                        fa3.b(parcel);
                        ja3Var.i.post(new iu0(14, ja3Var, ua3Var, z));
                        break;
                    case 9:
                        fa3.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return H(i, parcel, parcel2);
        }
    }

    public /* synthetic */ y93() {
    }
}
