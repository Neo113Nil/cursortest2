package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageViewBindingRoguePulsePrime2512 extends PolarVoyageScrollViewOlympianSpark2682 {
    public static String PolarVoyageAnimatorSetSparkUltraMax8233(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        int PolarVoyagePackageManagerCelestialPhoenix8393 = PolarVoyageDebugTitaniumInferno5712.PolarVoyagePackageManagerCelestialPhoenix8393(str, str2, 0, false);
        if (PolarVoyagePackageManagerCelestialPhoenix8393 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, PolarVoyagePackageManagerCelestialPhoenix8393);
            sb.append(str3);
            i2 = PolarVoyagePackageManagerCelestialPhoenix8393 + length;
            if (PolarVoyagePackageManagerCelestialPhoenix8393 >= str.length()) {
                break;
            }
            PolarVoyagePackageManagerCelestialPhoenix8393 = PolarVoyageDebugTitaniumInferno5712.PolarVoyagePackageManagerCelestialPhoenix8393(str, str2, PolarVoyagePackageManagerCelestialPhoenix8393 + i, false);
        } while (PolarVoyagePackageManagerCelestialPhoenix8393 > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean PolarVoyageBitmapMaxTitanTitan7960(int i, String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : PolarVoyageRemoteModelManagerOlympianCelestial9141(i, 0, str2.length(), str, str2, z);
    }

    public static boolean PolarVoyageContentProviderHyperSpark3838(String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean PolarVoyageDisplayMetricsVortexDragon9516(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : PolarVoyageRemoteModelManagerOlympianCelestial9141(0, 0, str2.length(), str, str2, z);
    }

    public static Integer PolarVoyageLayerDrawableShadowTitaniumOmega1942(String str) {
        boolean z;
        int i;
        int i2;
        PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageBottomSheetOmegaNeo1907(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageRemoteModelManagerOlympianCelestial9141(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static String PolarVoyageNavigationViewHyperHyperHyperion1793(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(str.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append((CharSequence) str);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char charAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = charAt;
        }
        return new String(cArr);
    }

    public static boolean PolarVoyageRemoteModelManagerOlympianCelestial9141(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }
}
