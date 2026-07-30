package p000createpolar;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageDatabaseStormMasterMaster4645 {
    public static final byte[] PolarVoyageZipVortexCelestial6185 = new byte[0];

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        continue;
     */
    static {
        PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967 = PolarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyagePropertyValuesHolderVortexNeo2967[] polarVoyagePropertyValuesHolderVortexNeo2967Arr = {PolarVoyageDelayNovaRogueBeta9839.PolarVoyageBottomSheetOmegaNeo1907("efbbbf"), PolarVoyageDelayNovaRogueBeta9839.PolarVoyageBottomSheetOmegaNeo1907("feff"), PolarVoyageDelayNovaRogueBeta9839.PolarVoyageBottomSheetOmegaNeo1907("fffe0000"), PolarVoyageDelayNovaRogueBeta9839.PolarVoyageBottomSheetOmegaNeo1907("fffe"), PolarVoyageDelayNovaRogueBeta9839.PolarVoyageBottomSheetOmegaNeo1907("0000feff")};
        ArrayList arrayList = new ArrayList(new PolarVoyageClipDrawableNebulaThunder5087(polarVoyagePropertyValuesHolderVortexNeo2967Arr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayList2.set(PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageStrictModeLegendEpic1532(arrayList, polarVoyagePropertyValuesHolderVortexNeo2967Arr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList.get(0)).PolarVoyageBarcodeScannerInfernoSolarSpark7767() <= 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("the empty byte string is not a supported option");
            return;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo29672 = (PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo29673 = (PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList.get(i6);
                polarVoyagePropertyValuesHolderVortexNeo29673.getClass();
                polarVoyagePropertyValuesHolderVortexNeo29672.getClass();
                if (polarVoyagePropertyValuesHolderVortexNeo29673.PolarVoyageCameraPixelBlaze2629(0, polarVoyagePropertyValuesHolderVortexNeo29672, polarVoyagePropertyValuesHolderVortexNeo29672.PolarVoyageBarcodeScannerInfernoSolarSpark7767())) {
                    if (polarVoyagePropertyValuesHolderVortexNeo29673.PolarVoyageBarcodeScannerInfernoSolarSpark7767() == polarVoyagePropertyValuesHolderVortexNeo29672.PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
                        PolarVoyageR8UltraEliteBeta8736.PolarVoyageSnackbarGammaEclipse2140(polarVoyagePropertyValuesHolderVortexNeo29673, "duplicate option: ");
                        return;
                    } else if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                        arrayList.remove(i6);
                        ((Number) arrayList2.remove(i6)).intValue();
                    } else {
                        i6++;
                    }
                }
            }
            i4 = i5;
        }
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = new PolarVoyageSnackbarSpectraMasterMaster4120();
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageContentProviderHyperSpark3838(0L, polarVoyageSnackbarSpectraMasterMaster4120, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = polarVoyageSnackbarSpectraMasterMaster4120.readInt();
        }
    }

    public static /* synthetic */ int PolarVoyageBarcodeScannerInfernoSolarSpark7767(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return PolarVoyageKotlinBetaPulseBeta3653(str, c, i, i2);
    }

    public static final boolean PolarVoyageBitmapVisionAuroraPixel4705(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int PolarVoyageBottomSheetOmegaNeo1907(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int PolarVoyageCameraPixelBlaze2629(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final int PolarVoyageDiffUtilTurboStrike5735(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageRemoteModelManagerOlympianCelestial9141(charAt, 31) <= 0 || PolarVoyageR8VisionOmegaNebula9943.PolarVoyageRemoteModelManagerOlympianCelestial9141(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int PolarVoyageItemDecorationUltraDeltaEpic7485(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int PolarVoyageKotlinBetaPulseBeta3653(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int PolarVoyageMotionLayoutTransitionHeroVision4068(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (PolarVoyageDebugTitaniumInferno5712.PolarVoyageMotionLayoutForceEpicAurora7183(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final String[] PolarVoyageStrictModeLegendEpic1532(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final int PolarVoyageTextInputEditTextNebulaHero6651(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int PolarVoyageViewRogueMaster4778(PolarVoyageThemeOverlayShadowPulse8967 polarVoyageThemeOverlayShadowPulse8967) {
        polarVoyageThemeOverlayShadowPulse8967.getClass();
        return (polarVoyageThemeOverlayShadowPulse8967.readByte() & 255) | ((polarVoyageThemeOverlayShadowPulse8967.readByte() & 255) << 16) | ((polarVoyageThemeOverlayShadowPulse8967.readByte() & 255) << 8);
    }

    public static final void PolarVoyageZipVortexCelestial6185(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }
}
