package p000createpolar;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.net.ProtocolException;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageFragmentManagerEpicMax6434 {
    public static String PolarVoyageBarcodeScannerInfernoSolarSpark7767(Parcel parcel, int i) {
        int PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageDrawableDeltaHyperion5742(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (PolarVoyageDrawableDeltaHyperion5742 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + PolarVoyageDrawableDeltaHyperion5742);
        return readString;
    }

    public static Object[] PolarVoyageBitmapVisionAuroraPixel4705(Parcel parcel, int i, Parcelable.Creator creator) {
        int PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageDrawableDeltaHyperion5742(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (PolarVoyageDrawableDeltaHyperion5742 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + PolarVoyageDrawableDeltaHyperion5742);
        return createTypedArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PolarVoyageImageCaptureShadowBlaze1163 PolarVoyageBottomSheetOmegaNeo1907(String str) {
        int i;
        int i2;
        String str2;
        boolean PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str, "HTTP/1.", false);
        PolarVoyageServiceInfoStormStorm6276 polarVoyageServiceInfoStormStorm6276 = PolarVoyageServiceInfoStormStorm6276.HTTP_1_0;
        PolarVoyageServiceInfoStormStorm6276 polarVoyageServiceInfoStormStorm62762 = PolarVoyageServiceInfoStormStorm6276.HTTP_1_1;
        if (PolarVoyageDisplayMetricsVortexDragon9516) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                polarVoyageServiceInfoStormStorm6276 = polarVoyageServiceInfoStormStorm62762;
            }
            i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            Integer PolarVoyageLayerDrawableShadowTitaniumOmega1942 = PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageLayerDrawableShadowTitaniumOmega1942(str.substring(i, i2));
            if (PolarVoyageLayerDrawableShadowTitaniumOmega1942 == null) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int intValue = PolarVoyageLayerDrawableShadowTitaniumOmega1942.intValue();
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
            }
            return new PolarVoyageImageCaptureShadowBlaze1163(polarVoyageServiceInfoStormStorm6276, intValue, str2);
        }
        if (PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str, "ICY ", false)) {
            i = 4;
            i2 = i + 3;
            if (str.length() < i2) {
            }
        } else {
            if (!PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            polarVoyageServiceInfoStormStorm6276 = polarVoyageServiceInfoStormStorm62762;
            i2 = i + 3;
            if (str.length() < i2) {
            }
        }
    }

    public static int PolarVoyageCameraPixelBlaze2629(Parcel parcel, int i) {
        PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, i, 4);
        return parcel.readInt();
    }

    public static void PolarVoyageContentProviderHyperSpark3838(PolarVoyageBarcodeScannerElitePhoenix6619 polarVoyageBarcodeScannerElitePhoenix6619, byte[] bArr) {
        long j;
        polarVoyageBarcodeScannerElitePhoenix6619.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = polarVoyageBarcodeScannerElitePhoenix6619.PolarVoyageViewRogueMaster4778;
            int i2 = polarVoyageBarcodeScannerElitePhoenix6619.PolarVoyageCameraPixelBlaze2629;
            int i3 = polarVoyageBarcodeScannerElitePhoenix6619.PolarVoyageDrawableDeltaHyperion5742;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = polarVoyageBarcodeScannerElitePhoenix6619.PolarVoyageBottomSheetOmegaNeo1907;
            PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = polarVoyageBarcodeScannerElitePhoenix6619.PolarVoyageItemDecorationUltraDeltaEpic7485;
            polarVoyageSnackbarSpectraMasterMaster4120.getClass();
            if (j2 == polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("no more bytes");
                return;
            }
            j = polarVoyageBarcodeScannerElitePhoenix6619.PolarVoyageBottomSheetOmegaNeo1907;
        } while (polarVoyageBarcodeScannerElitePhoenix6619.PolarVoyageBarcodeScannerInfernoSolarSpark7767(j == -1 ? 0L : j + (polarVoyageBarcodeScannerElitePhoenix6619.PolarVoyageDrawableDeltaHyperion5742 - polarVoyageBarcodeScannerElitePhoenix6619.PolarVoyageCameraPixelBlaze2629)) != -1);
    }

    public static void PolarVoyageDiffUtilTurboStrike5735(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new PolarVoyageToolbarNovaTitanSpeed3010(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Overread allowed size end=", i), parcel);
        }
    }

    public static int PolarVoyageDrawableDeltaHyperion5742(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static boolean PolarVoyageItemDecorationUltraDeltaEpic7485(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static Parcelable PolarVoyageKotlinBetaPulseBeta3653(Parcel parcel, int i, Parcelable.Creator creator) {
        int PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageDrawableDeltaHyperion5742(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (PolarVoyageDrawableDeltaHyperion5742 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + PolarVoyageDrawableDeltaHyperion5742);
        return parcelable;
    }

    public static Bundle PolarVoyageMotionLayoutTransitionHeroVision4068(Parcel parcel, int i) {
        int PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageDrawableDeltaHyperion5742(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (PolarVoyageDrawableDeltaHyperion5742 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + PolarVoyageDrawableDeltaHyperion5742);
        return readBundle;
    }

    public static void PolarVoyageNavigationViewHyperHyperHyperion1793(Parcel parcel, int i, int i2) {
        int PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageDrawableDeltaHyperion5742(parcel, i);
        if (PolarVoyageDrawableDeltaHyperion5742 == i2) {
            return;
        }
        String hexString = Integer.toHexString(PolarVoyageDrawableDeltaHyperion5742);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(PolarVoyageDrawableDeltaHyperion5742);
        sb.append(" (0x");
        throw new PolarVoyageToolbarNovaTitanSpeed3010(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageSnackbarGammaEclipse2140(sb, hexString, ")"), parcel);
    }

    public static int PolarVoyageRemoteModelManagerOlympianCelestial9141(Parcel parcel) {
        int readInt = parcel.readInt();
        int PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageDrawableDeltaHyperion5742(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new PolarVoyageToolbarNovaTitanSpeed3010("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = PolarVoyageDrawableDeltaHyperion5742 + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            throw new PolarVoyageToolbarNovaTitanSpeed3010(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(dataPosition, i, "Size read is invalid start=", " end="), parcel);
        }
        return i;
    }

    public static final void PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageTextRecognitionStormAlphaPrime3930 polarVoyageTextRecognitionStormAlphaPrime3930) {
        PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageKeyframeEpicNovaXCyber9821(polarVoyageTextRecognitionStormAlphaPrime3930).PolarVoyageDiffUtilDragonSpeedEclipse6225();
    }

    public static void PolarVoyageSnackbarGammaEclipse2140(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + PolarVoyageDrawableDeltaHyperion5742(parcel, i));
    }

    public static final int PolarVoyageStrictModeLegendEpic1532(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static String PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageDataBindingInfernoInfernoPixel1843 polarVoyageDataBindingInfernoInfernoPixel1843) {
        StringBuilder sb = new StringBuilder(polarVoyageDataBindingInfernoInfernoPixel1843.size());
        for (int i = 0; i < polarVoyageDataBindingInfernoInfernoPixel1843.size(); i++) {
            byte PolarVoyageZipVortexCelestial6185 = polarVoyageDataBindingInfernoInfernoPixel1843.PolarVoyageZipVortexCelestial6185(i);
            if (PolarVoyageZipVortexCelestial6185 == 34) {
                sb.append("\\\"");
            } else if (PolarVoyageZipVortexCelestial6185 == 39) {
                sb.append("\\'");
            } else if (PolarVoyageZipVortexCelestial6185 != 92) {
                switch (PolarVoyageZipVortexCelestial6185) {
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (PolarVoyageZipVortexCelestial6185 < 32 || PolarVoyageZipVortexCelestial6185 > 126) {
                            sb.append('\\');
                            sb.append((char) (((PolarVoyageZipVortexCelestial6185 >>> 6) & 3) + 48));
                            sb.append((char) (((PolarVoyageZipVortexCelestial6185 >>> 3) & 7) + 48));
                            sb.append((char) ((PolarVoyageZipVortexCelestial6185 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) PolarVoyageZipVortexCelestial6185);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean PolarVoyageViewRogueMaster4778(Parcel parcel, int i) {
        PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public abstract void PolarVoyageZipVortexCelestial6185();
}
