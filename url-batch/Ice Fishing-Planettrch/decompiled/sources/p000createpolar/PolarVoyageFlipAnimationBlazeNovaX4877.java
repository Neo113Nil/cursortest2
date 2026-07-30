package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageFlipAnimationBlazeNovaX4877 {
    public static final /* synthetic */ int PolarVoyageZipVortexCelestial6185 = 0;

    static {
        char c;
        int i;
        PolarVoyagePagingSourceEpicSolarStorm3628[] polarVoyagePagingSourceEpicSolarStorm3628Arr;
        char c2;
        boolean z;
        float[][] fArr = {new float[2], new float[2]};
        int i2 = new int[2][0];
        char c3 = 3;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    c = 2;
                } else if (i2 == 4) {
                    c = 4;
                } else if (i2 == 5) {
                    c = 5;
                }
            }
            c = 1;
        } else {
            c = 3;
        }
        float[] fArr2 = fArr[0];
        float[] fArr3 = fArr[1];
        int length = (fArr2.length % 2) + (fArr2.length / 2);
        PolarVoyagePagingSourceEpicSolarStorm3628[] polarVoyagePagingSourceEpicSolarStorm3628Arr2 = new PolarVoyagePagingSourceEpicSolarStorm3628[length];
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 * 2;
            float f = fArr2[i5];
            int i6 = i5 + 1;
            float f2 = fArr2[i6];
            float f3 = fArr3[i5];
            float f4 = fArr3[i6];
            PolarVoyagePagingSourceEpicSolarStorm3628 polarVoyagePagingSourceEpicSolarStorm3628 = new PolarVoyagePagingSourceEpicSolarStorm3628(21);
            float f5 = f3 - f;
            float f6 = f4 - f2;
            float[] fArr4 = new float[101];
            if (c != c3 && Math.abs(f5) >= 0.001f && Math.abs(f6) >= 0.001f) {
                float f7 = f2 - f4;
                float[] fArr5 = PolarVoyageR8VisionOmegaNebula9943.PolarVoyageZipVortexCelestial6185;
                int i7 = i3;
                i = i7;
                float f8 = f7;
                float f9 = 0.0f;
                float f10 = 0.0f;
                while (true) {
                    double radians = (float) Math.toRadians((i7 * 90.0d) / 90.0d);
                    float f11 = f7;
                    float sin = ((float) Math.sin(radians)) * f5;
                    float cos = f11 * ((float) Math.cos(radians));
                    float f12 = cos - f8;
                    polarVoyagePagingSourceEpicSolarStorm3628Arr = polarVoyagePagingSourceEpicSolarStorm3628Arr2;
                    c2 = c;
                    f9 += (float) Math.hypot(sin - f10, f12);
                    fArr5[i7] = f9;
                    if (i7 == 90) {
                        break;
                    }
                    i7++;
                    f10 = sin;
                    c = c2;
                    polarVoyagePagingSourceEpicSolarStorm3628Arr2 = polarVoyagePagingSourceEpicSolarStorm3628Arr;
                    f8 = cos;
                    f7 = f11;
                }
                int i8 = i;
                while (true) {
                    fArr5[i8] = fArr5[i8] / f9;
                    if (i8 == 90) {
                        break;
                    } else {
                        i8++;
                    }
                }
                for (int i9 = 0; i9 < 101; i9++) {
                    float f13 = i9 / 100.0f;
                    int binarySearch = Arrays.binarySearch(fArr5, 0, 91, f13);
                    if (binarySearch >= 0) {
                        fArr4[i9] = binarySearch / 90.0f;
                    } else if (binarySearch == -1) {
                        fArr4[i9] = 0.0f;
                    } else {
                        int i10 = -binarySearch;
                        int i11 = i10 - 2;
                        float f14 = i11;
                        float f15 = fArr5[i11];
                        fArr4[i9] = (((f13 - f15) / (fArr5[i10 - 1] - f15)) + f14) / 90.0f;
                    }
                }
                z = false;
            } else {
                polarVoyagePagingSourceEpicSolarStorm3628Arr = polarVoyagePagingSourceEpicSolarStorm3628Arr2;
                c2 = c;
                i = i3;
                z = false;
                Math.hypot(f6, f5);
            }
            polarVoyagePagingSourceEpicSolarStorm3628Arr[i4] = polarVoyagePagingSourceEpicSolarStorm3628;
            i4++;
            c = c2;
            i3 = i;
            polarVoyagePagingSourceEpicSolarStorm3628Arr2 = polarVoyagePagingSourceEpicSolarStorm3628Arr;
            c3 = 3;
        }
    }
}
