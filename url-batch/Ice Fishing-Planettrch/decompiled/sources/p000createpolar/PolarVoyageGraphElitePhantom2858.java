package p000createpolar;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGraphElitePhantom2858 implements Comparator, Parcelable {
    public static final Parcelable.Creator<PolarVoyageGraphElitePhantom2858> CREATOR = new PolarVoyageVideoCaptureOlympianNovaX3124(1);
    public final int PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageImageCaptureMasterCelestial7130[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final String PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageGraphElitePhantom2858(Parcel parcel) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = parcel.readString();
        PolarVoyageImageCaptureMasterCelestial7130[] polarVoyageImageCaptureMasterCelestial7130Arr = (PolarVoyageImageCaptureMasterCelestial7130[]) parcel.createTypedArray(PolarVoyageImageCaptureMasterCelestial7130.CREATOR);
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageImageCaptureMasterCelestial7130Arr;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageImageCaptureMasterCelestial7130Arr.length;
    }

    public final PolarVoyageGraphElitePhantom2858 PolarVoyageZipVortexCelestial6185(String str) {
        return Objects.equals(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, str) ? this : new PolarVoyageGraphElitePhantom2858(str, false, this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        PolarVoyageImageCaptureMasterCelestial7130 polarVoyageImageCaptureMasterCelestial7130 = (PolarVoyageImageCaptureMasterCelestial7130) obj;
        PolarVoyageImageCaptureMasterCelestial7130 polarVoyageImageCaptureMasterCelestial71302 = (PolarVoyageImageCaptureMasterCelestial7130) obj2;
        UUID uuid = PolarVoyageAnnotationProcessorPhantomBeta1851.PolarVoyageZipVortexCelestial6185;
        return uuid.equals(polarVoyageImageCaptureMasterCelestial7130.PolarVoyageStrictModeLegendEpic1532) ? uuid.equals(polarVoyageImageCaptureMasterCelestial71302.PolarVoyageStrictModeLegendEpic1532) ? 0 : 1 : polarVoyageImageCaptureMasterCelestial7130.PolarVoyageStrictModeLegendEpic1532.compareTo(polarVoyageImageCaptureMasterCelestial71302.PolarVoyageStrictModeLegendEpic1532);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PolarVoyageGraphElitePhantom2858.class == obj.getClass()) {
            PolarVoyageGraphElitePhantom2858 polarVoyageGraphElitePhantom2858 = (PolarVoyageGraphElitePhantom2858) obj;
            if (Objects.equals(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageGraphElitePhantom2858.PolarVoyageRotateAnimationCyberCelestialDelta4768) && Arrays.equals(this.PolarVoyageItemDecorationUltraDeltaEpic7485, polarVoyageGraphElitePhantom2858.PolarVoyageItemDecorationUltraDeltaEpic7485)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.PolarVoyageStrictModeLegendEpic1532 == 0) {
            String str = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            this.PolarVoyageStrictModeLegendEpic1532 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        }
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        parcel.writeTypedArray(this.PolarVoyageItemDecorationUltraDeltaEpic7485, 0);
    }

    public PolarVoyageGraphElitePhantom2858(String str, boolean z, PolarVoyageImageCaptureMasterCelestial7130... polarVoyageImageCaptureMasterCelestial7130Arr) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = str;
        polarVoyageImageCaptureMasterCelestial7130Arr = z ? (PolarVoyageImageCaptureMasterCelestial7130[]) polarVoyageImageCaptureMasterCelestial7130Arr.clone() : polarVoyageImageCaptureMasterCelestial7130Arr;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageImageCaptureMasterCelestial7130Arr;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageImageCaptureMasterCelestial7130Arr.length;
        Arrays.sort(polarVoyageImageCaptureMasterCelestial7130Arr, this);
    }
}
