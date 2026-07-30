package p000createpolar;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyagePropertyValuesHolderVortexNeo2967 implements Serializable, Comparable {
    public static final PolarVoyagePropertyValuesHolderVortexNeo2967 PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyagePropertyValuesHolderVortexNeo2967(new byte[0]);
    public final byte[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public transient String PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public transient int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyagePropertyValuesHolderVortexNeo2967(byte[] bArr) {
        bArr.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = bArr;
    }

    public static int PolarVoyageBottomSheetOmegaNeo1907(PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967, PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo29672) {
        polarVoyagePropertyValuesHolderVortexNeo2967.getClass();
        polarVoyagePropertyValuesHolderVortexNeo29672.getClass();
        return polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyagePropertyValuesHolderVortexNeo29672.PolarVoyageItemDecorationUltraDeltaEpic7485());
    }

    public static /* synthetic */ PolarVoyagePropertyValuesHolderVortexNeo2967 PolarVoyageContentProviderHyperSpark3838(PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageSnackbarGammaEclipse2140(i, i2);
    }

    public static int PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967, PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo29672) {
        polarVoyagePropertyValuesHolderVortexNeo2967.getClass();
        polarVoyagePropertyValuesHolderVortexNeo29672.getClass();
        return polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageDiffUtilTurboStrike5735(polarVoyagePropertyValuesHolderVortexNeo29672.PolarVoyageItemDecorationUltraDeltaEpic7485(), 0);
    }

    public void PolarVoyageAnimatorSetSparkUltraMax8233(PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120, int i) {
        polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageCardViewAlphaVortexCelestial9747(this.PolarVoyageItemDecorationUltraDeltaEpic7485, i);
    }

    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.length;
    }

    public String PolarVoyageBitmapVisionAuroraPixel4705() {
        byte[] bArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageZipVortexCelestial6185;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean PolarVoyageCameraPixelBlaze2629(int i, PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967, int i2) {
        polarVoyagePropertyValuesHolderVortexNeo2967.getClass();
        return polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageViewRogueMaster4778(0, i, i2, this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    public int PolarVoyageDiffUtilTurboStrike5735(byte[] bArr, int i) {
        bArr.getClass();
        byte[] bArr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageDrawableDeltaHyperion5742(max, 0, bArr.length, bArr2, bArr)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public String PolarVoyageDrawableDeltaHyperion5742(Charset charset) {
        charset.getClass();
        return new String(this.PolarVoyageItemDecorationUltraDeltaEpic7485, charset);
    }

    public byte[] PolarVoyageItemDecorationUltraDeltaEpic7485() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    public PolarVoyagePropertyValuesHolderVortexNeo2967 PolarVoyageKotlinBetaPulseBeta3653(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.PolarVoyageItemDecorationUltraDeltaEpic7485, 0, PolarVoyageBarcodeScannerInfernoSolarSpark7767());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new PolarVoyagePropertyValuesHolderVortexNeo2967(digest);
    }

    @Override // java.lang.Comparable
    /* renamed from: PolarVoyageMotionLayoutTransitionHeroVision4068, reason: merged with bridge method [inline-methods] */
    public final int compareTo(PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967) {
        polarVoyagePropertyValuesHolderVortexNeo2967.getClass();
        int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        int PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        int min = Math.min(PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageBarcodeScannerInfernoSolarSpark77672);
        for (int i = 0; i < min; i++) {
            int PolarVoyageStrictModeLegendEpic1532 = PolarVoyageStrictModeLegendEpic1532(i) & 255;
            int PolarVoyageStrictModeLegendEpic15322 = polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageStrictModeLegendEpic1532(i) & 255;
            if (PolarVoyageStrictModeLegendEpic1532 != PolarVoyageStrictModeLegendEpic15322) {
                return PolarVoyageStrictModeLegendEpic1532 < PolarVoyageStrictModeLegendEpic15322 ? -1 : 1;
            }
        }
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == PolarVoyageBarcodeScannerInfernoSolarSpark77672) {
            return 0;
        }
        return PolarVoyageBarcodeScannerInfernoSolarSpark7767 < PolarVoyageBarcodeScannerInfernoSolarSpark77672 ? -1 : 1;
    }

    public final String PolarVoyageNavigationViewHyperHyperHyperion1793() {
        String str = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (str != null) {
            return str;
        }
        byte[] PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485();
        PolarVoyageItemDecorationUltraDeltaEpic7485.getClass();
        String str2 = new String(PolarVoyageItemDecorationUltraDeltaEpic7485, PolarVoyageLiveDataScopeMasterAurora3603.PolarVoyageZipVortexCelestial6185);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = str2;
        return str2;
    }

    public PolarVoyagePropertyValuesHolderVortexNeo2967 PolarVoyageRemoteModelManagerOlympianCelestial9141() {
        int i = 0;
        while (true) {
            byte[] bArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new PolarVoyagePropertyValuesHolderVortexNeo2967(copyOf);
            }
            i++;
        }
    }

    public int PolarVoyageRotateAnimationCyberCelestialDelta4768(byte[] bArr) {
        bArr.getClass();
        int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        byte[] bArr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        for (int min = Math.min(PolarVoyageBarcodeScannerInfernoSolarSpark7767, bArr2.length - bArr.length); -1 < min; min--) {
            if (PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageDrawableDeltaHyperion5742(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public PolarVoyagePropertyValuesHolderVortexNeo2967 PolarVoyageSnackbarGammaEclipse2140(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        }
        if (i < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i2 > bArr.length) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageCameraPixelBlaze2629(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new PolarVoyagePropertyValuesHolderVortexNeo2967(PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageObserverEliteUltra2793(bArr, i, i2));
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("endIndex < beginIndex");
        return null;
    }

    public byte PolarVoyageStrictModeLegendEpic1532(int i) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485[i];
    }

    public boolean PolarVoyageViewRogueMaster4778(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageDrawableDeltaHyperion5742(i, i2, i3, bArr2, bArr);
    }

    public String PolarVoyageZipVortexCelestial6185() {
        byte[] bArr = PolarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageZipVortexCelestial6185;
        byte[] bArr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr2[i];
            byte b6 = bArr2[i5];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, PolarVoyageLiveDataScopeMasterAurora3603.PolarVoyageZipVortexCelestial6185);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PolarVoyagePropertyValuesHolderVortexNeo2967) {
            PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967 = (PolarVoyagePropertyValuesHolderVortexNeo2967) obj;
            int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
            byte[] bArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == bArr.length && polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageViewRogueMaster4778(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        this.PolarVoyageStrictModeLegendEpic1532 = hashCode;
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0173, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x017a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x016c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01aa, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ad, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0140, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fe, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b;
        int i;
        PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967 = this;
        byte[] bArr = polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 >= 2048) {
                                if (55296 > i9 || i9 >= 57344) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        break;
                                    }
                                    i3 += i9 < 65536 ? 1 : 2;
                                    i2 += 3;
                                    i4 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 <= 1114111) {
                                    if (55296 > i11 || i11 >= 57344) {
                                        if (i11 >= 65536) {
                                            i = i4 + 1;
                                            if (i4 == 64) {
                                                break;
                                            }
                                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                                break;
                                            }
                                            i3 += i11 < 65536 ? 1 : 2;
                                            i2 += 4;
                                            i4 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 != -1) {
            String PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageNavigationViewHyperHyperHyperion1793();
            String PolarVoyageAnimatorSetSparkUltraMax8233 = PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageAnimatorSetSparkUltraMax8233(PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageAnimatorSetSparkUltraMax8233(PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageAnimatorSetSparkUltraMax8233(PolarVoyageNavigationViewHyperHyperHyperion1793.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= PolarVoyageNavigationViewHyperHyperHyperion1793.length()) {
                return "[text=" + PolarVoyageAnimatorSetSparkUltraMax8233 + ']';
            }
            return "[size=" + bArr.length + " text=" + PolarVoyageAnimatorSetSparkUltraMax8233 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageBitmapVisionAuroraPixel4705() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageCameraPixelBlaze2629(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (64 != bArr.length) {
            polarVoyagePropertyValuesHolderVortexNeo2967 = new PolarVoyagePropertyValuesHolderVortexNeo2967(PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageObserverEliteUltra2793(bArr, 0, 64));
        }
        sb.append(polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageBitmapVisionAuroraPixel4705());
        sb.append("…]");
        return sb.toString();
    }
}
