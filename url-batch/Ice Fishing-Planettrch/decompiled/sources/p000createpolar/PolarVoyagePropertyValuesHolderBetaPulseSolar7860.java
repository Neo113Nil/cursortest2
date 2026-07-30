package p000createpolar;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePropertyValuesHolderBetaPulseSolar7860 implements PolarVoyageBottomSheetSpectraOlympianOlympian2905, IInterface {
    public final IBinder PolarVoyageZipVortexCelestial6185;

    public PolarVoyagePropertyValuesHolderBetaPulseSolar7860(IBinder iBinder) {
        this.PolarVoyageZipVortexCelestial6185 = iBinder;
    }

    public final Account PolarVoyageZipVortexCelestial6185() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("create-polar.PolarVoyageBottomSheetSpectraOlympianOlympian2905");
        obtain = Parcel.obtain();
        try {
            this.PolarVoyageZipVortexCelestial6185.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) PolarVoyageContentObserverAlphaPhantom8746.PolarVoyageZipVortexCelestial6185(obtain, Account.CREATOR);
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.PolarVoyageZipVortexCelestial6185;
    }
}
