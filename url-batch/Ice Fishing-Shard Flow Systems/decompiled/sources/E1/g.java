package E1;

import C4.p;
import N1.k;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;

/* loaded from: classes.dex */
public abstract class g extends Binder implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f670e = 1;

    public /* synthetic */ g() {
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i2 = this.f670e;
        return this;
    }

    public boolean b(int i2, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i5) {
        int i7 = 1;
        switch (this.f670e) {
            case 0:
                if (i2 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i2, parcel, parcel2, i5)) {
                    return true;
                }
                return b(i2, parcel, parcel2);
            default:
                if (i2 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i2, parcel, parcel2, i5)) {
                    return true;
                }
                L1.e eVar = (L1.e) this;
                if (i2 != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i8 = k.f1820a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(p.g(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                N1.d dVar = eVar.f1672h.f1676d;
                K1.h hVar = eVar.f1671g;
                synchronized (dVar.f1807f) {
                    dVar.f1806e.remove(hVar);
                }
                dVar.a().post(new N1.b(i7, dVar));
                eVar.f1670f.a("onRequestIntegrityToken", new Object[0]);
                eVar.f1672h.f1675c.getClass();
                int i9 = bundle.getInt("error");
                L1.a aVar = i9 == 0 ? null : new L1.a(i9, null);
                if (aVar != null) {
                    eVar.f1671g.c(aVar);
                    return true;
                }
                String string = bundle.getString("token");
                if (string == null) {
                    eVar.f1671g.c(new L1.a(-100, null));
                    return true;
                }
                bundle.getLong("request.token.sid");
                String str = eVar.f1672h.f1674b;
                ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat("IntegrityDialogWrapper");
                eVar.f1671g.d(new L1.i(string));
                return true;
        }
    }

    public g(String str) {
        attachInterface(this, str);
    }
}
