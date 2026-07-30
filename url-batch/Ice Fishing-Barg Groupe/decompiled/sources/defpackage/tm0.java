package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tm0 implements um0 {
    public IBinder TSizfFm2Yiuu;

    @Override // defpackage.um0
    public final void TSizfFm2Yiuu(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(um0.PxuCJdSBwIXG);
            obtain.writeStringArray(strArr);
            this.TSizfFm2Yiuu.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.TSizfFm2Yiuu;
    }
}
