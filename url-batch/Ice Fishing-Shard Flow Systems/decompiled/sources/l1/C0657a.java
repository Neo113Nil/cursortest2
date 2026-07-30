package l1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657a implements InterfaceC0659c, IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f6262e;

    public C0657a(IBinder iBinder) {
        this.f6262e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6262e;
    }

    public final Bundle b(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i2 = W0.a.f2786a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.f6262e.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
        } catch (RuntimeException e7) {
            throw e7;
        } finally {
            obtain.recycle();
        }
    }
}
