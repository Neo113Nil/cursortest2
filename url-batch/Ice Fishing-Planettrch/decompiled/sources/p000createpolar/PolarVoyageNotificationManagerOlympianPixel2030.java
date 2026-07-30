package p000createpolar;

import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageNotificationManagerOlympianPixel2030 extends PolarVoyageZipMegaFusion8832 {
    public final SparseIntArray PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final Parcel PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageBottomSheetOmegaNeo1907;
    public final int PolarVoyageDiffUtilTurboStrike5735;
    public final String PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;
    public final int PolarVoyageTextInputEditTextNebulaHero6651;

    public PolarVoyageNotificationManagerOlympianPixel2030(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new PolarVoyageContentObserverThunderOmega9101(0), new PolarVoyageContentObserverThunderOmega9101(0), new PolarVoyageContentObserverThunderOmega9101(0));
    }

    @Override // p000createpolar.PolarVoyageZipMegaFusion8832
    public final boolean PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        while (true) {
            int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            int i3 = this.PolarVoyageBottomSheetOmegaNeo1907;
            if (i2 >= this.PolarVoyageTextInputEditTextNebulaHero6651) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            Parcel parcel = this.PolarVoyageBitmapVisionAuroraPixel4705;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.PolarVoyageBottomSheetOmegaNeo1907 = parcel.readInt();
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 += readInt;
        }
    }

    @Override // p000createpolar.PolarVoyageZipMegaFusion8832
    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(int i) {
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        SparseIntArray sparseIntArray = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        Parcel parcel = this.PolarVoyageBitmapVisionAuroraPixel4705;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // p000createpolar.PolarVoyageZipMegaFusion8832
    public final PolarVoyageNotificationManagerOlympianPixel2030 PolarVoyageZipVortexCelestial6185() {
        Parcel parcel = this.PolarVoyageBitmapVisionAuroraPixel4705;
        int dataPosition = parcel.dataPosition();
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i == this.PolarVoyageDiffUtilTurboStrike5735) {
            i = this.PolarVoyageTextInputEditTextNebulaHero6651;
        }
        return new PolarVoyageNotificationManagerOlympianPixel2030(parcel, dataPosition, i, PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageSnackbarGammaEclipse2140(new StringBuilder(), this.PolarVoyageItemDecorationUltraDeltaEpic7485, "  "), this.PolarVoyageZipVortexCelestial6185, this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageKotlinBetaPulseBeta3653);
    }

    public PolarVoyageNotificationManagerOlympianPixel2030(Parcel parcel, int i, int i2, String str, PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101, PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega91012, PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega91013) {
        super(polarVoyageContentObserverThunderOmega9101, polarVoyageContentObserverThunderOmega91012, polarVoyageContentObserverThunderOmega91013);
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new SparseIntArray();
        this.PolarVoyageStrictModeLegendEpic1532 = -1;
        this.PolarVoyageBottomSheetOmegaNeo1907 = -1;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = parcel;
        this.PolarVoyageDiffUtilTurboStrike5735 = i;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = i2;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = str;
    }
}
