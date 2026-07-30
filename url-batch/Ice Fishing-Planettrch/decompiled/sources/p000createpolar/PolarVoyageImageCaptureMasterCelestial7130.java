package p000createpolar;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageImageCaptureMasterCelestial7130 implements Parcelable {
    public static final Parcelable.Creator<PolarVoyageImageCaptureMasterCelestial7130> CREATOR = new PolarVoyageVideoCaptureOlympianNovaX3124(2);
    public final String PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final String PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final UUID PolarVoyageStrictModeLegendEpic1532;
    public final byte[] PolarVoyageViewRogueMaster4778;

    public PolarVoyageImageCaptureMasterCelestial7130(Parcel parcel) {
        this.PolarVoyageStrictModeLegendEpic1532 = new UUID(parcel.readLong(), parcel.readLong());
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = parcel.readString();
        String readString = parcel.readString();
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageBottomSheetOmegaNeo1907 = readString;
        this.PolarVoyageViewRogueMaster4778 = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyageImageCaptureMasterCelestial7130)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PolarVoyageImageCaptureMasterCelestial7130 polarVoyageImageCaptureMasterCelestial7130 = (PolarVoyageImageCaptureMasterCelestial7130) obj;
        return Objects.equals(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageImageCaptureMasterCelestial7130.PolarVoyageRotateAnimationCyberCelestialDelta4768) && Objects.equals(this.PolarVoyageBottomSheetOmegaNeo1907, polarVoyageImageCaptureMasterCelestial7130.PolarVoyageBottomSheetOmegaNeo1907) && Objects.equals(this.PolarVoyageStrictModeLegendEpic1532, polarVoyageImageCaptureMasterCelestial7130.PolarVoyageStrictModeLegendEpic1532) && Arrays.equals(this.PolarVoyageViewRogueMaster4778, polarVoyageImageCaptureMasterCelestial7130.PolarVoyageViewRogueMaster4778);
    }

    public final int hashCode() {
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 == 0) {
            int hashCode = this.PolarVoyageStrictModeLegendEpic1532.hashCode() * 31;
            String str = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = Arrays.hashCode(this.PolarVoyageViewRogueMaster4778) + PolarVoyageRealtimeDatabaseCyberShadowForce7689.PolarVoyageBarcodeScannerInfernoSolarSpark7767(this.PolarVoyageBottomSheetOmegaNeo1907, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.PolarVoyageStrictModeLegendEpic1532;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        parcel.writeString(this.PolarVoyageBottomSheetOmegaNeo1907);
        parcel.writeByteArray(this.PolarVoyageViewRogueMaster4778);
    }

    public PolarVoyageImageCaptureMasterCelestial7130(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.PolarVoyageStrictModeLegendEpic1532 = uuid;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = str;
        str2.getClass();
        this.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageScaleGestureDetectorSpeedGamma3567.PolarVoyageBottomSheetOmegaNeo1907(str2);
        this.PolarVoyageViewRogueMaster4778 = bArr;
    }
}
