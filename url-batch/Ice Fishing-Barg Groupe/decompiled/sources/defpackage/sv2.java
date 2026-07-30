package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class sv2 extends Binder implements IInterface {
    public final /* synthetic */ int TSizfFm2Yiuu = 0;

    public sv2(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.TSizfFm2Yiuu;
        return this;
    }

    public boolean e9gEMXR7LXtO(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.TSizfFm2Yiuu) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                ew2 ew2Var = (ew2) this;
                boolean z = false;
                switch (i) {
                    case 3:
                        aw2.lS5Rgt96tfkO(parcel);
                        break;
                    case 4:
                        aw2.lS5Rgt96tfkO(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        aw2.lS5Rgt96tfkO(parcel);
                        break;
                    case 7:
                        aw2.lS5Rgt96tfkO(parcel);
                        break;
                    case 8:
                        nw2 nw2Var = (nw2) aw2.PxuCJdSBwIXG(parcel, nw2.CREATOR);
                        aw2.lS5Rgt96tfkO(parcel);
                        ew2Var.e9gEMXR7LXtO.post(new sh(6, ew2Var, nw2Var, z));
                        break;
                    case 9:
                        aw2.lS5Rgt96tfkO(parcel);
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
                return e9gEMXR7LXtO(i, parcel, parcel2);
        }
    }

    public /* synthetic */ sv2() {
    }
}
