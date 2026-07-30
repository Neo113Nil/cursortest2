package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageIntentServiceEclipseGammaHero3323 {
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public Object[] PolarVoyageKotlinBetaPulseBeta3653;
    public int[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public long[] PolarVoyageZipVortexCelestial6185;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.PolarVoyageZipVortexCelestial6185;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.PolarVoyageMotionLayoutTransitionHeroVision4068[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 >= 0) {
            return this.PolarVoyageKotlinBetaPulseBeta3653[i2];
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageZipVortexCelestial6185(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.PolarVoyageZipVortexCelestial6185;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.PolarVoyageMotionLayoutTransitionHeroVision4068[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        return i2 >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PolarVoyageIntentServiceEclipseGammaHero3323)) {
            return false;
        }
        PolarVoyageIntentServiceEclipseGammaHero3323 polarVoyageIntentServiceEclipseGammaHero3323 = (PolarVoyageIntentServiceEclipseGammaHero3323) obj;
        if (polarVoyageIntentServiceEclipseGammaHero3323.PolarVoyageBitmapVisionAuroraPixel4705 != this.PolarVoyageBitmapVisionAuroraPixel4705) {
            return false;
        }
        int[] iArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Object[] objArr = this.PolarVoyageKotlinBetaPulseBeta3653;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            Object obj2 = objArr[i4];
                            if (obj2 == null) {
                                if (polarVoyageIntentServiceEclipseGammaHero3323.PolarVoyageMotionLayoutTransitionHeroVision4068(i5) != null || !polarVoyageIntentServiceEclipseGammaHero3323.PolarVoyageZipVortexCelestial6185(i5)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(polarVoyageIntentServiceEclipseGammaHero3323.PolarVoyageMotionLayoutTransitionHeroVision4068(i5))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Object[] objArr = this.PolarVoyageKotlinBetaPulseBeta3653;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        int i6 = iArr[i5];
                        Object obj = objArr[i5];
                        i2 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i6);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final String toString() {
        if (this.PolarVoyageBitmapVisionAuroraPixel4705 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Object[] objArr = this.PolarVoyageKotlinBetaPulseBeta3653;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            Object obj = objArr[i5];
                            sb.append(i6);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i2++;
                            if (i2 < this.PolarVoyageBitmapVisionAuroraPixel4705) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
