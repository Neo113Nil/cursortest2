package p000createpolar;

import java.util.Arrays;
import java.util.Random;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGraphSpeedThunderDragon6179 {
    public final int[] PolarVoyageKotlinBetaPulseBeta3653;
    public final int[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final Random PolarVoyageZipVortexCelestial6185;

    public PolarVoyageGraphSpeedThunderDragon6179(int[] iArr, Random random) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = iArr;
        this.PolarVoyageZipVortexCelestial6185 = random;
        this.PolarVoyageKotlinBetaPulseBeta3653 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.PolarVoyageKotlinBetaPulseBeta3653[iArr[i]] = i;
        }
    }

    public final PolarVoyageGraphSpeedThunderDragon6179 PolarVoyageZipVortexCelestial6185(int i) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i2 = 0;
        while (true) {
            iArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            random = this.PolarVoyageZipVortexCelestial6185;
            if (i2 >= i) {
                break;
            }
            iArr2[i2] = random.nextInt(iArr.length + 1);
            int i3 = i2 + 1;
            int nextInt = random.nextInt(i3);
            iArr3[i2] = iArr3[nextInt];
            iArr3[nextInt] = i2;
            i2 = i3;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length + i; i6++) {
            if (i4 >= i || i5 != iArr2[i4]) {
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                iArr4[i6] = i8;
                if (i8 >= 0) {
                    iArr4[i6] = i8 + i;
                }
                i5 = i7;
            } else {
                iArr4[i6] = iArr3[i4];
                i4++;
            }
        }
        return new PolarVoyageGraphSpeedThunderDragon6179(iArr4, new Random(random.nextLong()));
    }

    public PolarVoyageGraphSpeedThunderDragon6179() {
        this(new Random());
    }

    public PolarVoyageGraphSpeedThunderDragon6179(Random random) {
        this(new int[0], random);
    }
}
