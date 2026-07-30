package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vz0 implements wz0 {
    public IBinder g;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.g;
    }

    @Override // defpackage.wz0
    public final void o(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(wz0.c);
            obtain.writeStringArray(strArr);
            this.g.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
