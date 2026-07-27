package s0;

import a.AbstractC0169a;
import android.os.Parcel;
import n1.InterfaceC1324k;
import x1.AbstractC1537a;

/* loaded from: classes.dex */
public final class k implements InterfaceC1324k {
    @Override // n1.InterfaceC1324k
    public void accept(Object obj, Object obj2) {
        x1.c cVar = (x1.c) ((x1.b) obj).t();
        X.g gVar = new X.g((I1.h) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i2 = AbstractC1537a.f12262a;
        obtain.writeInt(1);
        AbstractC0169a.S(obtain, AbstractC0169a.R(obtain, 20293));
        obtain.writeStrongBinder(gVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f12263a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
