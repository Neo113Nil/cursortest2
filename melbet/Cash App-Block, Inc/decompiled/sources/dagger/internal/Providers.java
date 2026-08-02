package dagger.internal;

import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import com.google.common.math.LongMath$1;
import io.noties.markwon.utils.ColorUtils;
import java.io.InputStream;
import java.math.RoundingMode;
import kotlin.Pair;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Utf8;
import timber.log.Timber;

/* loaded from: classes4.dex */
public abstract class Providers {
    public static final Pair access$peekIblFaceSize(AssetManager assetManager, String str) {
        try {
            InputStream open = assetManager.open(str);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(open, null, options);
                int i = options.outWidth;
                Pair pair = (i <= 0 || options.outHeight <= 0) ? null : new Pair(Integer.valueOf(i), Integer.valueOf(options.outHeight));
                Utf8.closeFinally(open, null);
                return pair;
            } finally {
            }
        } catch (Exception e) {
            Timber.Forest.e("Error peeking IBL face size: ".concat(str), new Object[0], e);
            return null;
        }
    }

    public static Provider asDaggerProvider(final javax.inject.Provider provider) {
        provider.getClass();
        return provider instanceof Provider ? (Provider) provider : new Provider() { // from class: dagger.internal.Providers.1
            @Override // javax.inject.Provider
            public final Object get() {
                return javax.inject.Provider.this.get();
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long divide(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (LongMath$1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                ColorUtils.checkRoundingUnnecessary(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + i;
            case 4:
                return j3 + i;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + i;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j4);
                long abs2 = abs - (Math.abs(j2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (abs2 <= 0) {
                    return j3;
                }
                return j3 + i;
            default:
                Path$$ExternalSyntheticBUOutline0.m$2();
                return 0L;
        }
    }

    public static long gcd(long j, long j2) {
        ColorUtils.checkNonNegative(j, "a");
        ColorUtils.checkNonNegative(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long saturatedAdd(long j, long j2) {
        long j3 = j + j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long saturatedMultiply(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }
}
