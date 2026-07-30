package p000createpolar;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageMotionEventNeoAuroraMax6943 extends Binder implements IInterface {
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185 = 0;

    public PolarVoyageMotionEventNeoAuroraMax6943(String str) {
        attachInterface(this, str);
    }

    public boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.PolarVoyageZipVortexCelestial6185;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                PolarVoyageAudioManagerGammaAuroraStorm3060 polarVoyageAudioManagerGammaAuroraStorm3060 = (PolarVoyageAudioManagerGammaAuroraStorm3060) this;
                switch (i) {
                    case 3:
                        PolarVoyageAnalyticsHyperUltra2307.PolarVoyageMotionLayoutTransitionHeroVision4068(parcel);
                        break;
                    case 4:
                        PolarVoyageAnalyticsHyperUltra2307.PolarVoyageMotionLayoutTransitionHeroVision4068(parcel);
                        break;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                    default:
                        return false;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                        PolarVoyageAnalyticsHyperUltra2307.PolarVoyageMotionLayoutTransitionHeroVision4068(parcel);
                        break;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                        PolarVoyageAnalyticsHyperUltra2307.PolarVoyageMotionLayoutTransitionHeroVision4068(parcel);
                        break;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                        PolarVoyageServiceOmegaAurora1402 polarVoyageServiceOmegaAurora1402 = (PolarVoyageServiceOmegaAurora1402) PolarVoyageAnalyticsHyperUltra2307.PolarVoyageZipVortexCelestial6185(parcel, PolarVoyageServiceOmegaAurora1402.CREATOR);
                        PolarVoyageAnalyticsHyperUltra2307.PolarVoyageMotionLayoutTransitionHeroVision4068(parcel);
                        polarVoyageAudioManagerGammaAuroraStorm3060.PolarVoyageKotlinBetaPulseBeta3653.post(new PolarVoyageFaceDetectionPrimeUltraPhoenix9679(26, polarVoyageAudioManagerGammaAuroraStorm3060, polarVoyageServiceOmegaAurora1402));
                        break;
                    case 9:
                        PolarVoyageAnalyticsHyperUltra2307.PolarVoyageMotionLayoutTransitionHeroVision4068(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return PolarVoyageBarcodeScannerInfernoSolarSpark7767(i, parcel, parcel2);
        }
    }

    public /* synthetic */ PolarVoyageMotionEventNeoAuroraMax6943() {
    }
}
