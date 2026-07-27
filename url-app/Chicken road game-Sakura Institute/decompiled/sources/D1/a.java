package D1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements c, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f2161a;

    public a(IBinder iBinder) {
        this.f2161a = iBinder;
    }

    public final Bundle a(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i2 = C1.a.f1160a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.f2161a.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
        } catch (RuntimeException e4) {
            throw e4;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2161a;
    }
}
