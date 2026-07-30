package p000createpolar;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageColorStateListMaxSolarTitanium6277 extends PolarVoyageContextPrimeStrikeSpeed7730 {
    public static final Parcelable.Creator<PolarVoyageColorStateListMaxSolarTitanium6277> CREATOR = new PolarVoyageVideoCaptureOlympianNovaX3124(24);
    public final int[] PolarVoyageBottomSheetOmegaNeo1907;
    public final int[] PolarVoyageCameraPixelBlaze2629;
    public final PolarVoyageOnTouchListenerLegendPhoenixSpeed7650 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final boolean PolarVoyageStrictModeLegendEpic1532;
    public final int PolarVoyageViewRogueMaster4778;

    public PolarVoyageColorStateListMaxSolarTitanium6277(PolarVoyageOnTouchListenerLegendPhoenixSpeed7650 polarVoyageOnTouchListenerLegendPhoenixSpeed7650, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageOnTouchListenerLegendPhoenixSpeed7650;
        this.PolarVoyageStrictModeLegendEpic1532 = z;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = z2;
        this.PolarVoyageBottomSheetOmegaNeo1907 = iArr;
        this.PolarVoyageViewRogueMaster4778 = i;
        this.PolarVoyageCameraPixelBlaze2629 = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, 20293);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageCameraPixelBlaze2629(parcel, 1, this.PolarVoyageItemDecorationUltraDeltaEpic7485, i);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 2, 4);
        parcel.writeInt(this.PolarVoyageStrictModeLegendEpic1532 ? 1 : 0);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 3, 4);
        parcel.writeInt(this.PolarVoyageRotateAnimationCyberCelestialDelta4768 ? 1 : 0);
        int[] iArr = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (iArr != null) {
            int PolarVoyageRemoteModelManagerOlympianCelestial91412 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, 4);
            parcel.writeIntArray(iArr);
            PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial91412);
        }
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 5, 4);
        parcel.writeInt(this.PolarVoyageViewRogueMaster4778);
        int[] iArr2 = this.PolarVoyageCameraPixelBlaze2629;
        if (iArr2 != null) {
            int PolarVoyageRemoteModelManagerOlympianCelestial91413 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, 6);
            parcel.writeIntArray(iArr2);
            PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial91413);
        }
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }
}
