package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qm0 implements sm0, IInterface {
    public final IBinder TSizfFm2Yiuu;

    public qm0(IBinder iBinder) {
        this.TSizfFm2Yiuu = iBinder;
    }

    public final Bundle PxuCJdSBwIXG(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i = nv2.PxuCJdSBwIXG;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.TSizfFm2Yiuu.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.TSizfFm2Yiuu;
    }
}
