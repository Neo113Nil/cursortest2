package p000createpolar;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLevelListDrawablePhoenixEclipse4200 extends PolarVoyageContextPrimeStrikeSpeed7730 {
    public static final Parcelable.Creator<PolarVoyageLevelListDrawablePhoenixEclipse4200> CREATOR = new PolarVoyageVideoCaptureOlympianNovaX3124(22);
    public final String PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final long PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageLevelListDrawablePhoenixEclipse4200() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = "CLIENT_TELEMETRY";
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 1L;
        this.PolarVoyageStrictModeLegendEpic1532 = -1;
    }

    public final long PolarVoyageZipVortexCelestial6185() {
        long j = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        return j == -1 ? this.PolarVoyageStrictModeLegendEpic1532 : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageLevelListDrawablePhoenixEclipse4200) {
            PolarVoyageLevelListDrawablePhoenixEclipse4200 polarVoyageLevelListDrawablePhoenixEclipse4200 = (PolarVoyageLevelListDrawablePhoenixEclipse4200) obj;
            String str = polarVoyageLevelListDrawablePhoenixEclipse4200.PolarVoyageItemDecorationUltraDeltaEpic7485;
            String str2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && PolarVoyageZipVortexCelestial6185() == polarVoyageLevelListDrawablePhoenixEclipse4200.PolarVoyageZipVortexCelestial6185()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.PolarVoyageItemDecorationUltraDeltaEpic7485, Long.valueOf(PolarVoyageZipVortexCelestial6185())});
    }

    public final String toString() {
        PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280 = new PolarVoyageResourcesCelestialInferno9280(this);
        polarVoyageResourcesCelestialInferno9280.PolarVoyagePackageManagerCelestialPhoenix8393(this.PolarVoyageItemDecorationUltraDeltaEpic7485, "name");
        polarVoyageResourcesCelestialInferno9280.PolarVoyagePackageManagerCelestialPhoenix8393(Long.valueOf(PolarVoyageZipVortexCelestial6185()), "version");
        return polarVoyageResourcesCelestialInferno9280.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, 20293);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 1, this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 2, 4);
        parcel.writeInt(this.PolarVoyageStrictModeLegendEpic1532);
        long PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185();
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 3, 8);
        parcel.writeLong(PolarVoyageZipVortexCelestial6185);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }

    public PolarVoyageLevelListDrawablePhoenixEclipse4200(int i, long j, String str) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = str;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = j;
    }
}
