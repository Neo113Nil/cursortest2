package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p000createpolar.PolarVoyageFirebaseModelInterpreterPulseInfernoCelestial4718;
import p000createpolar.PolarVoyageKaptVortexCosmosCosmos9479;
import p000createpolar.PolarVoyageNestedScrollViewEliteHeroShadow8584;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public interface IGetInstallReferrerService extends IInterface {

    /* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
    public static abstract class Stub extends PolarVoyageNestedScrollViewEliteHeroShadow8584 implements IGetInstallReferrerService {

        /* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
        public static class Proxy extends PolarVoyageFirebaseModelInterpreterPulseInfernoCelestial4718 implements IGetInstallReferrerService {
            public Proxy(IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public final Bundle c(Bundle bundle) {
                Parcel a = a();
                int i = PolarVoyageKaptVortexCosmosCosmos9479.PolarVoyageZipVortexCelestial6185;
                a.writeInt(1);
                bundle.writeToParcel(a, 0);
                Parcel b = b(a);
                Bundle bundle2 = (Bundle) (b.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(b));
                b.recycle();
                return bundle2;
            }
        }

        public Stub() {
            attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        }

        public static IGetInstallReferrerService b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof IGetInstallReferrerService ? (IGetInstallReferrerService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // p000createpolar.PolarVoyageNestedScrollViewEliteHeroShadow8584
        public final boolean a(int i, Parcel parcel, Parcel parcel2) {
            if (i != 1) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i2 = PolarVoyageKaptVortexCosmosCosmos9479.PolarVoyageZipVortexCelestial6185;
            Bundle c = c((Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel)));
            parcel2.writeNoException();
            if (c == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            c.writeToParcel(parcel2, 1);
            return true;
        }
    }

    Bundle c(Bundle bundle);
}
