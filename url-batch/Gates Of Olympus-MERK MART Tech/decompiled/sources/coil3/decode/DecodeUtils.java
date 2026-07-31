package coil3.decode;

import coil3.size.Dimension;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.size.SizeKt;
import coil3.util.IntPair;
import coil3.util.UtilsKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.ranges.RangesKt;

/* compiled from: DecodeUtils.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007J0\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007J8\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J0\u0010\f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0007J8\u0010\f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J0\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007J8\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J7\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u0005*\u00020\u00172\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u0018"}, d2 = {"Lcoil3/decode/DecodeUtils;", "", "<init>", "()V", "calculateInSampleSize", "", "srcWidth", "srcHeight", "dstWidth", "dstHeight", "scale", "Lcoil3/size/Scale;", "computeSizeMultiplier", "", "maxSize", "Lcoil3/size/Size;", "", "computeDstSize", "Lcoil3/util/IntPair;", "targetSize", "computeDstSize-sEdh43o", "(IILcoil3/size/Size;Lcoil3/size/Scale;Lcoil3/size/Size;)J", "toPx", "Lcoil3/size/Dimension;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DecodeUtils {
    public static final DecodeUtils INSTANCE = new DecodeUtils();

    /* compiled from: DecodeUtils.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DecodeUtils() {
    }

    @JvmStatic
    public static final int calculateInSampleSize(int srcWidth, int srcHeight, int dstWidth, int dstHeight, Scale scale) {
        int min;
        int highestOneBit = Integer.highestOneBit(srcWidth / dstWidth);
        int highestOneBit2 = Integer.highestOneBit(srcHeight / dstHeight);
        int i = WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            min = Math.min(highestOneBit, highestOneBit2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            min = Math.max(highestOneBit, highestOneBit2);
        }
        return RangesKt.coerceAtLeast(min, 1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Migrate to the variant that accepts a 'maxSize'.", replaceWith = @ReplaceWith(expression = "computeSizeMultiplier(srcWidth, srcHeight, dstWidth, dstHeight, scale, Size.ORIGINAL)", imports = {}))
    @JvmStatic
    public static final double computeSizeMultiplier(int srcWidth, int srcHeight, int dstWidth, int dstHeight, Scale scale) {
        return computeSizeMultiplier(srcWidth, srcHeight, dstWidth, dstHeight, scale, Size.ORIGINAL);
    }

    @JvmStatic
    public static final double computeSizeMultiplier(int srcWidth, int srcHeight, int dstWidth, int dstHeight, Scale scale, Size maxSize) {
        double max;
        double d = srcWidth;
        double d2 = dstWidth / d;
        double d3 = srcHeight;
        double d4 = dstHeight / d3;
        int i = WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            max = Math.max(d2, d4);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            max = Math.min(d2, d4);
        }
        if (maxSize.getWidth() instanceof Dimension.Pixels) {
            max = RangesKt.coerceAtMost(max, ((Dimension.Pixels) maxSize.getWidth()).m9226unboximpl() / d);
        }
        return maxSize.getHeight() instanceof Dimension.Pixels ? RangesKt.coerceAtMost(max, ((Dimension.Pixels) maxSize.getHeight()).m9226unboximpl() / d3) : max;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Migrate to the variant that accepts a 'maxSize'.", replaceWith = @ReplaceWith(expression = "computeSizeMultiplier(srcWidth, srcHeight, dstWidth, dstHeight, scale, Size.ORIGINAL)", imports = {}))
    @JvmStatic
    public static final float computeSizeMultiplier(float srcWidth, float srcHeight, float dstWidth, float dstHeight, Scale scale) {
        return computeSizeMultiplier(srcWidth, srcHeight, dstWidth, dstHeight, scale, Size.ORIGINAL);
    }

    @JvmStatic
    public static final float computeSizeMultiplier(float srcWidth, float srcHeight, float dstWidth, float dstHeight, Scale scale, Size maxSize) {
        float max;
        float f = dstWidth / srcWidth;
        float f2 = dstHeight / srcHeight;
        int i = WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            max = Math.max(f, f2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            max = Math.min(f, f2);
        }
        if (maxSize.getWidth() instanceof Dimension.Pixels) {
            max = RangesKt.coerceAtMost(max, ((Dimension.Pixels) maxSize.getWidth()).m9226unboximpl() / srcWidth);
        }
        return maxSize.getHeight() instanceof Dimension.Pixels ? RangesKt.coerceAtMost(max, ((Dimension.Pixels) maxSize.getHeight()).m9226unboximpl() / srcHeight) : max;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Migrate to the variant that accepts a 'maxSize'.", replaceWith = @ReplaceWith(expression = "computeSizeMultiplier(srcWidth, srcHeight, dstWidth, dstHeight, scale, Size.ORIGINAL)", imports = {}))
    @JvmStatic
    public static final double computeSizeMultiplier(double srcWidth, double srcHeight, double dstWidth, double dstHeight, Scale scale) {
        return computeSizeMultiplier(srcWidth, srcHeight, dstWidth, dstHeight, scale, Size.ORIGINAL);
    }

    @JvmStatic
    public static final double computeSizeMultiplier(double srcWidth, double srcHeight, double dstWidth, double dstHeight, Scale scale, Size maxSize) {
        double max;
        double d = dstWidth / srcWidth;
        double d2 = dstHeight / srcHeight;
        int i = WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            max = Math.max(d, d2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            max = Math.min(d, d2);
        }
        if (maxSize.getWidth() instanceof Dimension.Pixels) {
            max = RangesKt.coerceAtMost(max, ((Dimension.Pixels) maxSize.getWidth()).m9226unboximpl() / srcWidth);
        }
        return maxSize.getHeight() instanceof Dimension.Pixels ? RangesKt.coerceAtMost(max, ((Dimension.Pixels) maxSize.getHeight()).m9226unboximpl() / srcHeight) : max;
    }

    @JvmStatic
    /* renamed from: computeDstSize-sEdh43o, reason: not valid java name */
    public static final long m9177computeDstSizesEdh43o(int srcWidth, int srcHeight, Size targetSize, Scale scale, Size maxSize) {
        if (!SizeKt.isOriginal(targetSize)) {
            DecodeUtils decodeUtils = INSTANCE;
            int px = decodeUtils.toPx(targetSize.getWidth(), scale);
            srcHeight = decodeUtils.toPx(targetSize.getHeight(), scale);
            srcWidth = px;
        }
        if ((maxSize.getWidth() instanceof Dimension.Pixels) && !UtilsKt.isMinOrMax(srcWidth)) {
            srcWidth = RangesKt.coerceAtMost(srcWidth, ((Dimension.Pixels) maxSize.getWidth()).m9226unboximpl());
        }
        if ((maxSize.getHeight() instanceof Dimension.Pixels) && !UtilsKt.isMinOrMax(srcHeight)) {
            srcHeight = RangesKt.coerceAtMost(srcHeight, ((Dimension.Pixels) maxSize.getHeight()).m9226unboximpl());
        }
        return IntPair.m9231constructorimpl(srcWidth, srcHeight);
    }

    private final int toPx(Dimension dimension, Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).m9226unboximpl();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
