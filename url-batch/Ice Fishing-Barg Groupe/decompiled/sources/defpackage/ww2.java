package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ww2 implements IInterface {
    public final IBinder TSizfFm2Yiuu;

    public ww2(IBinder iBinder) {
        this.TSizfFm2Yiuu = iBinder;
    }

    public final void PxuCJdSBwIXG(cx2 cx2Var, rg0 rg0Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(cx2Var);
            obtain.writeInt(1);
            BUo4iHFctTZi.PxuCJdSBwIXG(rg0Var, obtain, 0);
            this.TSizfFm2Yiuu.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.TSizfFm2Yiuu;
    }
}
