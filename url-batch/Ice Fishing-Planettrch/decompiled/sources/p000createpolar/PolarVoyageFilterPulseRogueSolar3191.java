package p000createpolar;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageFilterPulseRogueSolar3191 {
    static {
        new PolarVoyageFilterRogueNebula7428();
    }

    public static byte[] PolarVoyageMotionLayoutTransitionHeroVision4068(InputStream inputStream) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return PolarVoyageZipVortexCelestial6185(arrayDeque, i);
                }
                i2 += read;
                i += read;
            }
            min = PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageColorStateListEliteStrikeOlympian8131(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return PolarVoyageZipVortexCelestial6185(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static byte[] PolarVoyageZipVortexCelestial6185(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }
}
