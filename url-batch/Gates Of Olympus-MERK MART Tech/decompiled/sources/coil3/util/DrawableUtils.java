package coil3.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.decode.DecodeUtils;
import coil3.size.Scale;
import coil3.size.Size;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* compiled from: DrawableUtils.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J0\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcoil3/util/DrawableUtils;", "", "<init>", "()V", "DEFAULT_SIZE", "", "convertToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "config", "Landroid/graphics/Bitmap$Config;", "size", "Lcoil3/size/Size;", "scale", "Lcoil3/size/Scale;", "maxSize", "allowInexactSize", "", "isConfigValid", "bitmap", "isSizeValid", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrawableUtils {
    private static final int DEFAULT_SIZE = 512;
    public static final DrawableUtils INSTANCE = new DrawableUtils();

    private DrawableUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap convertToBitmap(Drawable drawable, Bitmap.Config config, Size size, Scale scale, Size maxSize, boolean allowInexactSize) {
        Size size2;
        Scale scale2;
        Size size3;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (isConfigValid(bitmap, config)) {
                size2 = size;
                scale2 = scale;
                size3 = maxSize;
                if (isSizeValid(allowInexactSize, bitmap, size2, scale2, size3)) {
                    return bitmap;
                }
                Drawable mutate = drawable.mutate();
                int width = Utils_androidKt.getWidth(mutate);
                int i = width <= 0 ? width : 512;
                int height = Utils_androidKt.getHeight(mutate);
                int i2 = height <= 0 ? height : 512;
                long m9177computeDstSizesEdh43o = DecodeUtils.m9177computeDstSizesEdh43o(i, i2, size2, scale2, size3);
                double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(i, i2, IntPair.m9235getFirstimpl(m9177computeDstSizesEdh43o), IntPair.m9236getSecondimpl(m9177computeDstSizesEdh43o), scale2, size3);
                int roundToInt = MathKt.roundToInt(i * computeSizeMultiplier);
                int roundToInt2 = MathKt.roundToInt(computeSizeMultiplier * i2);
                Bitmap createBitmap = Bitmap.createBitmap(roundToInt, roundToInt2, BitmapsKt.toSoftware(config));
                Rect bounds = mutate.getBounds();
                int i3 = bounds.left;
                int i4 = bounds.top;
                int i5 = bounds.right;
                int i6 = bounds.bottom;
                mutate.setBounds(0, 0, roundToInt, roundToInt2);
                mutate.draw(new Canvas(createBitmap));
                mutate.setBounds(i3, i4, i5, i6);
                return createBitmap;
            }
        }
        size2 = size;
        scale2 = scale;
        size3 = maxSize;
        Drawable mutate2 = drawable.mutate();
        int width2 = Utils_androidKt.getWidth(mutate2);
        if (width2 <= 0) {
        }
        int height2 = Utils_androidKt.getHeight(mutate2);
        if (height2 <= 0) {
        }
        long m9177computeDstSizesEdh43o2 = DecodeUtils.m9177computeDstSizesEdh43o(i, i2, size2, scale2, size3);
        double computeSizeMultiplier2 = DecodeUtils.computeSizeMultiplier(i, i2, IntPair.m9235getFirstimpl(m9177computeDstSizesEdh43o2), IntPair.m9236getSecondimpl(m9177computeDstSizesEdh43o2), scale2, size3);
        int roundToInt3 = MathKt.roundToInt(i * computeSizeMultiplier2);
        int roundToInt22 = MathKt.roundToInt(computeSizeMultiplier2 * i2);
        Bitmap createBitmap2 = Bitmap.createBitmap(roundToInt3, roundToInt22, BitmapsKt.toSoftware(config));
        Rect bounds2 = mutate2.getBounds();
        int i32 = bounds2.left;
        int i42 = bounds2.top;
        int i52 = bounds2.right;
        int i62 = bounds2.bottom;
        mutate2.setBounds(0, 0, roundToInt3, roundToInt22);
        mutate2.draw(new Canvas(createBitmap2));
        mutate2.setBounds(i32, i42, i52, i62);
        return createBitmap2;
    }

    private final boolean isConfigValid(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == BitmapsKt.toSoftware(config);
    }

    private final boolean isSizeValid(boolean allowInexactSize, Bitmap bitmap, Size size, Scale scale, Size maxSize) {
        if (allowInexactSize) {
            return true;
        }
        long m9177computeDstSizesEdh43o = DecodeUtils.m9177computeDstSizesEdh43o(bitmap.getWidth(), bitmap.getHeight(), size, scale, maxSize);
        return DecodeUtils.computeSizeMultiplier(bitmap.getWidth(), bitmap.getHeight(), IntPair.m9235getFirstimpl(m9177computeDstSizesEdh43o), IntPair.m9236getSecondimpl(m9177computeDstSizesEdh43o), scale, maxSize) == 1.0d;
    }
}
