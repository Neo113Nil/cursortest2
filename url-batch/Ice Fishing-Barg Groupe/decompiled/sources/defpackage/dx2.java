package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dx2 implements ix2, IInterface {
    public final IBinder TSizfFm2Yiuu;

    public dx2(IBinder iBinder) {
        this.TSizfFm2Yiuu = iBinder;
    }

    public final Parcel PxuCJdSBwIXG(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.TSizfFm2Yiuu.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.TSizfFm2Yiuu;
    }
}
