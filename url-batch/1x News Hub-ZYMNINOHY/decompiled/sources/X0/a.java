package X0;

import M0.v;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c1.e;

/* loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1727a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i3 = this.f1727a;
        return this;
    }

    public boolean d(int i3, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean e(int i3, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        switch (this.f1727a) {
            case 0:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return d(i3, parcel, parcel2);
            case 1:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                switch (i3) {
                    case 3:
                        W0.b.b(parcel);
                        break;
                    case 4:
                        W0.b.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        W0.b.b(parcel);
                        break;
                    case 7:
                        W0.b.b(parcel);
                        break;
                    case 8:
                        e eVar = (e) W0.b.a(parcel, e.CREATOR);
                        W0.b.b(parcel);
                        v vVar = (v) this;
                        vVar.f966d.post(new B.a(vVar, eVar, 3, false));
                        break;
                    case 9:
                        W0.b.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return e(i3, parcel, parcel2);
        }
    }

    public a(String str, int i3) {
        this.f1727a = i3;
        switch (i3) {
            case 2:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
