package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageExecutorCosmosSparkEpic4645 {
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public long[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyageExecutorCosmosSparkEpic4645(int i) {
        this.PolarVoyageZipVortexCelestial6185 = i == 0 ? PolarVoyageTextWatcherEpicSpectraSpectra2755.PolarVoyageZipVortexCelestial6185 : new long[i];
    }

    public final void PolarVoyageZipVortexCelestial6185(long j) {
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068 + 1;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        if (jArr.length < i) {
            this.PolarVoyageZipVortexCelestial6185 = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.PolarVoyageZipVortexCelestial6185;
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        jArr2[i2] = j;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageExecutorCosmosSparkEpic4645) {
            PolarVoyageExecutorCosmosSparkEpic4645 polarVoyageExecutorCosmosSparkEpic4645 = (PolarVoyageExecutorCosmosSparkEpic4645) obj;
            int i = polarVoyageExecutorCosmosSparkEpic4645.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (i == i2) {
                long[] jArr = this.PolarVoyageZipVortexCelestial6185;
                long[] jArr2 = polarVoyageExecutorCosmosSparkEpic4645.PolarVoyageZipVortexCelestial6185;
                PolarVoyageLinearLayoutHyperionSpectra2647 PolarVoyageThreadPhoenixVisionSolar1313 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageThreadPhoenixVisionSolar1313(0, i2);
                int i3 = PolarVoyageThreadPhoenixVisionSolar1313.PolarVoyageItemDecorationUltraDeltaEpic7485;
                int i4 = PolarVoyageThreadPhoenixVisionSolar1313.PolarVoyageStrictModeLegendEpic1532;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
