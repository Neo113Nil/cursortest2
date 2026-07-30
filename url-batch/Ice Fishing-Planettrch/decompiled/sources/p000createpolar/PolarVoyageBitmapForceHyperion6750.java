package p000createpolar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBitmapForceHyperion6750 implements IInterface {
    public final IBinder PolarVoyageZipVortexCelestial6185;

    public PolarVoyageBitmapForceHyperion6750(IBinder iBinder) {
        this.PolarVoyageZipVortexCelestial6185 = iBinder;
    }

    public final void PolarVoyageZipVortexCelestial6185(PolarVoyageAdMobNovaXMax2871 polarVoyageAdMobNovaXMax2871, PolarVoyageProGuardTurboEpicStorm1952 polarVoyageProGuardTurboEpicStorm1952) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("create-polar.PolarVoyageBitmapForceHyperion6750");
            obtain.writeStrongBinder(polarVoyageAdMobNovaXMax2871);
            obtain.writeInt(1);
            PolarVoyageVideoCaptureOlympianNovaX3124.PolarVoyageZipVortexCelestial6185(polarVoyageProGuardTurboEpicStorm1952, obtain, 0);
            this.PolarVoyageZipVortexCelestial6185.transact(46, obtain, obtain2, 0);
            obtain2.readException();
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
