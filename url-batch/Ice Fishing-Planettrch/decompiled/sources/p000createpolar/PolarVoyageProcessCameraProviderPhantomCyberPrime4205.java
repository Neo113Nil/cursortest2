package p000createpolar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageProcessCameraProviderPhantomCyberPrime4205 implements IInterface {
    public final IBinder PolarVoyageZipVortexCelestial6185;

    public PolarVoyageProcessCameraProviderPhantomCyberPrime4205(IBinder iBinder) {
        this.PolarVoyageZipVortexCelestial6185 = iBinder;
    }

    public final Boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            obtain.writeInt(1);
            this.PolarVoyageZipVortexCelestial6185.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            boolean z = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return Boolean.valueOf(!z);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final String PolarVoyageZipVortexCelestial6185() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.PolarVoyageZipVortexCelestial6185.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.PolarVoyageZipVortexCelestial6185;
    }
}
