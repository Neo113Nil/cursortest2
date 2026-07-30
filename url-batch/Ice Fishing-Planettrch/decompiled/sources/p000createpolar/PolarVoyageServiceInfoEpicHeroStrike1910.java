package p000createpolar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageServiceInfoEpicHeroStrike1910 extends PolarVoyageContextPrimeStrikeSpeed7730 {
    public static final Parcelable.Creator<PolarVoyageServiceInfoEpicHeroStrike1910> CREATOR = new PolarVoyageVideoCaptureOlympianNovaX3124(15);
    public final boolean PolarVoyageBottomSheetOmegaNeo1907;
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final ConnectionResult PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final IBinder PolarVoyageStrictModeLegendEpic1532;
    public final boolean PolarVoyageViewRogueMaster4778;

    public PolarVoyageServiceInfoEpicHeroStrike1910(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = iBinder;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = connectionResult;
        this.PolarVoyageBottomSheetOmegaNeo1907 = z;
        this.PolarVoyageViewRogueMaster4778 = z2;
    }

    public final boolean equals(Object obj) {
        Object polarVoyagePropertyValuesHolderBetaPulseSolar7860;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageServiceInfoEpicHeroStrike1910)) {
            return false;
        }
        PolarVoyageServiceInfoEpicHeroStrike1910 polarVoyageServiceInfoEpicHeroStrike1910 = (PolarVoyageServiceInfoEpicHeroStrike1910) obj;
        if (!this.PolarVoyageRotateAnimationCyberCelestialDelta4768.equals(polarVoyageServiceInfoEpicHeroStrike1910.PolarVoyageRotateAnimationCyberCelestialDelta4768)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.PolarVoyageStrictModeLegendEpic1532;
        if (iBinder == null) {
            polarVoyagePropertyValuesHolderBetaPulseSolar7860 = null;
        } else {
            int i = PolarVoyageSupervisorJobSpeedSpeedStrike3298.PolarVoyageMotionLayoutTransitionHeroVision4068;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("create-polar.PolarVoyageBottomSheetSpectraOlympianOlympian2905");
            polarVoyagePropertyValuesHolderBetaPulseSolar7860 = queryLocalInterface instanceof PolarVoyageBottomSheetSpectraOlympianOlympian2905 ? (PolarVoyageBottomSheetSpectraOlympianOlympian2905) queryLocalInterface : new PolarVoyagePropertyValuesHolderBetaPulseSolar7860(iBinder);
        }
        IBinder iBinder2 = polarVoyageServiceInfoEpicHeroStrike1910.PolarVoyageStrictModeLegendEpic1532;
        if (iBinder2 != null) {
            int i2 = PolarVoyageSupervisorJobSpeedSpeedStrike3298.PolarVoyageMotionLayoutTransitionHeroVision4068;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("create-polar.PolarVoyageBottomSheetSpectraOlympianOlympian2905");
            obj2 = queryLocalInterface2 instanceof PolarVoyageBottomSheetSpectraOlympianOlympian2905 ? (PolarVoyageBottomSheetSpectraOlympianOlympian2905) queryLocalInterface2 : new PolarVoyagePropertyValuesHolderBetaPulseSolar7860(iBinder2);
        }
        return PolarVoyageTransformNeoTitanium1654.PolarVoyageDrawableDeltaHyperion5742(polarVoyagePropertyValuesHolderBetaPulseSolar7860, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, 20293);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 1, 4);
        parcel.writeInt(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        IBinder iBinder = this.PolarVoyageStrictModeLegendEpic1532;
        if (iBinder != null) {
            int PolarVoyageRemoteModelManagerOlympianCelestial91412 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial91412);
        }
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageCameraPixelBlaze2629(parcel, 3, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, i);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 4, 4);
        parcel.writeInt(this.PolarVoyageBottomSheetOmegaNeo1907 ? 1 : 0);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 5, 4);
        parcel.writeInt(this.PolarVoyageViewRogueMaster4778 ? 1 : 0);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }
}
