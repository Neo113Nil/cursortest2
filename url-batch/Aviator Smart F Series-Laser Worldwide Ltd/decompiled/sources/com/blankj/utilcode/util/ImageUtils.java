package com.blankj.utilcode.util;

import android.content.ContentValues;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public final class ImageUtils {

    public enum ImageType {
        TYPE_JPG("jpg"),
        TYPE_PNG("png"),
        TYPE_GIF("gif"),
        TYPE_TIFF("tiff"),
        TYPE_BMP("bmp"),
        TYPE_WEBP("webp"),
        TYPE_ICO("ico"),
        TYPE_UNKNOWN("unknown");

        String value;

        ImageType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    private ImageUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static Bitmap addBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f8, @ColorInt int i8, boolean z7, float f9, boolean z8) {
        return addBorder(bitmap, f8, i8, z7, new float[]{f9, f9, f9, f9, f9, f9, f9, f9}, z8);
    }

    public static Bitmap addCircleBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f8, @ColorInt int i8) {
        return addBorder(bitmap, f8, i8, true, 0.0f, false);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f8, @ColorInt int i8, @FloatRange(from = 0.0d) float f9) {
        return addBorder(bitmap, f8, i8, false, f9, false);
    }

    public static Bitmap addImageWatermark(Bitmap bitmap, Bitmap bitmap2, int i8, int i9, int i10) {
        return addImageWatermark(bitmap, bitmap2, i8, i9, i10, false);
    }

    public static Bitmap addReflection(Bitmap bitmap, int i8) {
        return addReflection(bitmap, i8, false);
    }

    public static Bitmap addTextWatermark(Bitmap bitmap, String str, int i8, @ColorInt int i9, float f8, float f9) {
        return addTextWatermark(bitmap, str, i8, i9, f8, f9, false);
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap) {
        return bitmap2Bytes(bitmap, Bitmap.CompressFormat.PNG, 100);
    }

    public static Drawable bitmap2Drawable(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(z0.getApp().getResources(), bitmap);
    }

    public static Bitmap bytes2Bitmap(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static Drawable bytes2Drawable(byte[] bArr) {
        return bitmap2Drawable(bytes2Bitmap(bArr));
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i8, int i9) {
        int i10 = options.outHeight;
        int i11 = options.outWidth;
        int i12 = 1;
        while (true) {
            if (i10 <= i9 && i11 <= i8) {
                return i12;
            }
            i10 >>= 1;
            i11 >>= 1;
            i12 <<= 1;
        }
    }

    public static Bitmap clip(Bitmap bitmap, int i8, int i9, int i10, int i11) {
        return clip(bitmap, i8, i9, i10, i11, false);
    }

    public static byte[] compressByQuality(Bitmap bitmap, @IntRange(from = 0, to = 100) int i8) {
        return compressByQuality(bitmap, i8, false);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i8) {
        return compressBySampleSize(bitmap, i8, false);
    }

    public static Bitmap compressByScale(Bitmap bitmap, int i8, int i9) {
        return scale(bitmap, i8, i9, false);
    }

    public static Bitmap drawColor(@NonNull Bitmap bitmap, @ColorInt int i8) {
        return drawColor(bitmap, i8, false);
    }

    public static Bitmap drawable2Bitmap(@Nullable Drawable drawable) {
        Bitmap createBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            createBitmap = Bitmap.createBitmap(1, 1, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        } else {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static byte[] drawable2Bytes(@Nullable Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        return bitmap2Bytes(drawable2Bitmap(drawable));
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d) float f8, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f9) {
        return fastBlur(bitmap, f8, f9, false, false);
    }

    public static Bitmap getBitmap(File file) {
        if (file == null) {
            return null;
        }
        return BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    public static ImageType getImageType(String str) {
        return getImageType(c1.getFileByPath(str));
    }

    public static int getRotateDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    public static int[] getSize(String str) {
        return getSize(c1.getFileByPath(str));
    }

    private static boolean isBMP(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 66 && bArr[1] == 77;
    }

    private static boolean isEmptyBitmap(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }

    private static boolean isGIF(byte[] bArr) {
        if (bArr.length < 6 || bArr[0] != 71 || bArr[1] != 73 || bArr[2] != 70 || bArr[3] != 56) {
            return false;
        }
        byte b8 = bArr[4];
        return (b8 == 55 || b8 == 57) && bArr[5] == 97;
    }

    public static boolean isImage(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return isImage(file.getPath());
    }

    private static boolean isJPEG(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == -1 && bArr[1] == -40;
    }

    private static boolean isPNG(byte[] bArr) {
        return bArr.length >= 8 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10;
    }

    @RequiresApi(17)
    public static Bitmap renderScriptBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f8) {
        return renderScriptBlur(bitmap, f8, false);
    }

    public static Bitmap rotate(Bitmap bitmap, int i8, float f8, float f9) {
        return rotate(bitmap, i8, f8, f9, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, str, compressFormat, 100, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        return save2Album(bitmap, "", compressFormat, 100, false);
    }

    public static Bitmap scale(Bitmap bitmap, int i8, int i9) {
        return scale(bitmap, i8, i9, false);
    }

    public static Bitmap skew(Bitmap bitmap, float f8, float f9) {
        return skew(bitmap, f8, f9, 0.0f, 0.0f, false);
    }

    public static Bitmap stackBlur(Bitmap bitmap, int i8) {
        return stackBlur(bitmap, i8, false);
    }

    public static Bitmap toAlpha(Bitmap bitmap) {
        return toAlpha(bitmap, Boolean.FALSE);
    }

    public static Bitmap toGray(Bitmap bitmap) {
        return toGray(bitmap, false);
    }

    public static Bitmap toRound(Bitmap bitmap) {
        return toRound(bitmap, 0, 0, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f8) {
        return toRoundCorner(bitmap, f8, 0.0f, 0, false);
    }

    public static Bitmap view2Bitmap(View view) {
        Bitmap createBitmap;
        if (view == null) {
            return null;
        }
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        boolean willNotCacheDrawing = view.willNotCacheDrawing();
        view.setDrawingCacheEnabled(true);
        view.setWillNotCacheDrawing(false);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null || drawingCache.isRecycled()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            Bitmap drawingCache2 = view.getDrawingCache();
            if (drawingCache2 == null || drawingCache2.isRecycled()) {
                createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(createBitmap));
            } else {
                createBitmap = Bitmap.createBitmap(drawingCache2);
            }
        } else {
            createBitmap = Bitmap.createBitmap(drawingCache);
        }
        view.setWillNotCacheDrawing(willNotCacheDrawing);
        view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        return createBitmap;
    }

    private static Bitmap addBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f8, @ColorInt int i8, boolean z7, float[] fArr, boolean z8) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (!z8) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setColor(i8);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f8);
        if (z7) {
            canvas.drawCircle(width / 2.0f, height / 2.0f, (Math.min(width, height) / 2.0f) - (f8 / 2.0f), paint);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            float f9 = f8 / 2.0f;
            rectF.inset(f9, f9);
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
        return bitmap;
    }

    public static Bitmap addCircleBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f8, @ColorInt int i8, boolean z7) {
        return addBorder(bitmap, f8, i8, true, 0.0f, z7);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f8, @ColorInt int i8, float[] fArr) {
        return addBorder(bitmap, f8, i8, false, fArr, false);
    }

    public static Bitmap addImageWatermark(Bitmap bitmap, Bitmap bitmap2, int i8, int i9, int i10, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        if (!isEmptyBitmap(bitmap2)) {
            Paint paint = new Paint(1);
            Canvas canvas = new Canvas(copy);
            paint.setAlpha(i10);
            canvas.drawBitmap(bitmap2, i8, i9, paint);
        }
        if (z7 && !bitmap.isRecycled() && copy != bitmap) {
            bitmap.recycle();
        }
        return copy;
    }

    public static Bitmap addReflection(Bitmap bitmap, int i8, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, height - i8, width, i8, matrix, false);
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height + i8, bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        float f8 = height;
        canvas.drawBitmap(createBitmap, 0.0f, f8, (Paint) null);
        Paint paint = new Paint(1);
        paint.setShader(new LinearGradient(0.0f, height, 0.0f, createBitmap2.getHeight(), 1895825407, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.MIRROR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0f, f8, width, createBitmap2.getHeight(), paint);
        if (!createBitmap.isRecycled()) {
            createBitmap.recycle();
        }
        if (z7 && !bitmap.isRecycled() && createBitmap2 != bitmap) {
            bitmap.recycle();
        }
        return createBitmap2;
    }

    public static Bitmap addTextWatermark(Bitmap bitmap, String str, float f8, @ColorInt int i8, float f9, float f10, boolean z7) {
        if (isEmptyBitmap(bitmap) || str == null) {
            return null;
        }
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        Paint paint = new Paint(1);
        Canvas canvas = new Canvas(copy);
        paint.setColor(i8);
        paint.setTextSize(f8);
        paint.getTextBounds(str, 0, str.length(), new Rect());
        canvas.drawText(str, f9, f10 + f8, paint);
        if (z7 && !bitmap.isRecycled() && copy != bitmap) {
            bitmap.recycle();
        }
        return copy;
    }

    public static byte[] bitmap2Bytes(@Nullable Bitmap bitmap, @NonNull Bitmap.CompressFormat compressFormat, int i8) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i8, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap clip(Bitmap bitmap, int i8, int i9, int i10, int i11, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i8, i9, i10, i11);
        if (z7 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static byte[] compressByQuality(Bitmap bitmap, @IntRange(from = 0, to = 100) int i8, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i8, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z7 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return byteArray;
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i8, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z7 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public static Bitmap compressByScale(Bitmap bitmap, int i8, int i9, boolean z7) {
        return scale(bitmap, i8, i9, z7);
    }

    public static Bitmap drawColor(@NonNull Bitmap bitmap, @ColorInt int i8, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (!z7) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        new Canvas(bitmap).drawColor(i8, PorterDuff.Mode.DARKEN);
        return bitmap;
    }

    public static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat, int i8) {
        if (drawable == null) {
            return null;
        }
        return bitmap2Bytes(drawable2Bitmap(drawable), compressFormat, i8);
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d) float f8, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f9, boolean z7) {
        return fastBlur(bitmap, f8, f9, z7, false);
    }

    public static Bitmap getBitmap(File file, int i8, int i9) {
        if (file == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = calculateInSampleSize(options, i8, i9);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x001d -> B:12:0x0032). Please report as a decompilation issue!!! */
    public static ImageType getImageType(File file) {
        FileInputStream fileInputStream;
        ImageType imageType;
        FileInputStream fileInputStream2 = null;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        if (file == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                imageType = getImageType(fileInputStream);
            } catch (IOException e9) {
                e = e9;
                e.printStackTrace();
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            }
        } catch (IOException e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            throw th;
        }
        if (imageType == null) {
            fileInputStream.close();
            return null;
        }
        try {
            fileInputStream.close();
        } catch (IOException e12) {
            e12.printStackTrace();
        }
        return imageType;
    }

    public static int[] getSize(File file) {
        if (file == null) {
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return new int[]{options.outWidth, options.outHeight};
    }

    @RequiresApi(17)
    public static Bitmap renderScriptBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f8, boolean z7) {
        if (!z7) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        RenderScript renderScript = null;
        try {
            renderScript = RenderScript.create(z0.getApp());
            renderScript.setMessageHandler(new RenderScript.RSMessageHandler());
            Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
            ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            create.setInput(createFromBitmap);
            create.setRadius(f8);
            create.forEach(createTyped);
            createTyped.copyTo(bitmap);
            renderScript.destroy();
            return bitmap;
        } catch (Throwable th) {
            if (renderScript != null) {
                renderScript.destroy();
            }
            throw th;
        }
    }

    public static Bitmap rotate(Bitmap bitmap, int i8, float f8, float f9, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (i8 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i8, f8, f9);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z7 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, file, compressFormat, 100, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z7) {
        return save2Album(bitmap, "", compressFormat, 100, z7);
    }

    public static Bitmap scale(Bitmap bitmap, int i8, int i9, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i8, i9, true);
        if (z7 && !bitmap.isRecycled() && createScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return createScaledBitmap;
    }

    public static Bitmap skew(Bitmap bitmap, float f8, float f9, boolean z7) {
        return skew(bitmap, f8, f9, 0.0f, 0.0f, z7);
    }

    public static Bitmap stackBlur(Bitmap bitmap, int i8, boolean z7) {
        int[] iArr;
        Bitmap copy = z7 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        int i9 = i8 < 1 ? 1 : i8;
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i10 = width * height;
        int[] iArr2 = new int[i10];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i11 = width - 1;
        int i12 = height - 1;
        int i13 = i9 + i9;
        int i14 = i13 + 1;
        int[] iArr3 = new int[i10];
        int[] iArr4 = new int[i10];
        int[] iArr5 = new int[i10];
        int[] iArr6 = new int[Math.max(width, height)];
        int i15 = (i13 + 2) >> 1;
        int i16 = i15 * i15;
        int i17 = i16 * 256;
        int[] iArr7 = new int[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            iArr7[i18] = i18 / i16;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i14, 3);
        int i19 = i9 + 1;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i20 < height) {
            Bitmap bitmap2 = copy;
            int i23 = height;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = -i9;
            int i33 = 0;
            while (i32 <= i9) {
                int i34 = i12;
                int[] iArr9 = iArr6;
                int i35 = iArr2[i21 + Math.min(i11, Math.max(i32, 0))];
                int[] iArr10 = iArr8[i32 + i9];
                iArr10[0] = (i35 & 16711680) >> 16;
                iArr10[1] = (i35 & 65280) >> 8;
                iArr10[2] = i35 & 255;
                int abs = i19 - Math.abs(i32);
                int i36 = iArr10[0];
                i33 += i36 * abs;
                int i37 = iArr10[1];
                i24 += i37 * abs;
                int i38 = iArr10[2];
                i25 += abs * i38;
                if (i32 > 0) {
                    i29 += i36;
                    i30 += i37;
                    i31 += i38;
                } else {
                    i26 += i36;
                    i27 += i37;
                    i28 += i38;
                }
                i32++;
                i12 = i34;
                iArr6 = iArr9;
            }
            int i39 = i12;
            int[] iArr11 = iArr6;
            int i40 = i33;
            int i41 = i9;
            int i42 = 0;
            while (i42 < width) {
                iArr3[i21] = iArr7[i40];
                iArr4[i21] = iArr7[i24];
                iArr5[i21] = iArr7[i25];
                int i43 = i40 - i26;
                int i44 = i24 - i27;
                int i45 = i25 - i28;
                int[] iArr12 = iArr8[((i41 - i9) + i14) % i14];
                int i46 = i26 - iArr12[0];
                int i47 = i27 - iArr12[1];
                int i48 = i28 - iArr12[2];
                if (i20 == 0) {
                    iArr = iArr7;
                    iArr11[i42] = Math.min(i42 + i9 + 1, i11);
                } else {
                    iArr = iArr7;
                }
                int i49 = iArr2[i22 + iArr11[i42]];
                int i50 = (i49 & 16711680) >> 16;
                iArr12[0] = i50;
                int i51 = (i49 & 65280) >> 8;
                iArr12[1] = i51;
                int i52 = i49 & 255;
                iArr12[2] = i52;
                int i53 = i29 + i50;
                int i54 = i30 + i51;
                int i55 = i31 + i52;
                i40 = i43 + i53;
                i24 = i44 + i54;
                i25 = i45 + i55;
                i41 = (i41 + 1) % i14;
                int[] iArr13 = iArr8[i41 % i14];
                int i56 = iArr13[0];
                i26 = i46 + i56;
                int i57 = iArr13[1];
                i27 = i47 + i57;
                int i58 = iArr13[2];
                i28 = i48 + i58;
                i29 = i53 - i56;
                i30 = i54 - i57;
                i31 = i55 - i58;
                i21++;
                i42++;
                iArr7 = iArr;
            }
            i22 += width;
            i20++;
            copy = bitmap2;
            height = i23;
            i12 = i39;
            iArr6 = iArr11;
        }
        Bitmap bitmap3 = copy;
        int i59 = i12;
        int[] iArr14 = iArr6;
        int i60 = height;
        int[] iArr15 = iArr7;
        int i61 = 0;
        while (i61 < width) {
            int i62 = -i9;
            int i63 = i14;
            int[] iArr16 = iArr2;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = 0;
            int i71 = i62;
            int i72 = i62 * width;
            int i73 = 0;
            int i74 = 0;
            while (i71 <= i9) {
                int i75 = width;
                int max = Math.max(0, i72) + i61;
                int[] iArr17 = iArr8[i71 + i9];
                iArr17[0] = iArr3[max];
                iArr17[1] = iArr4[max];
                iArr17[2] = iArr5[max];
                int abs2 = i19 - Math.abs(i71);
                i73 += iArr3[max] * abs2;
                i74 += iArr4[max] * abs2;
                i64 += iArr5[max] * abs2;
                if (i71 > 0) {
                    i68 += iArr17[0];
                    i69 += iArr17[1];
                    i70 += iArr17[2];
                } else {
                    i65 += iArr17[0];
                    i66 += iArr17[1];
                    i67 += iArr17[2];
                }
                int i76 = i59;
                if (i71 < i76) {
                    i72 += i75;
                }
                i71++;
                i59 = i76;
                width = i75;
            }
            int i77 = width;
            int i78 = i59;
            int i79 = i61;
            int i80 = i9;
            int i81 = i60;
            int i82 = 0;
            while (i82 < i81) {
                iArr16[i79] = (iArr16[i79] & (-16777216)) | (iArr15[i73] << 16) | (iArr15[i74] << 8) | iArr15[i64];
                int i83 = i73 - i65;
                int i84 = i74 - i66;
                int i85 = i64 - i67;
                int[] iArr18 = iArr8[((i80 - i9) + i63) % i63];
                int i86 = i65 - iArr18[0];
                int i87 = i66 - iArr18[1];
                int i88 = i67 - iArr18[2];
                int i89 = i9;
                if (i61 == 0) {
                    iArr14[i82] = Math.min(i82 + i19, i78) * i77;
                }
                int i90 = iArr14[i82] + i61;
                int i91 = iArr3[i90];
                iArr18[0] = i91;
                int i92 = iArr4[i90];
                iArr18[1] = i92;
                int i93 = iArr5[i90];
                iArr18[2] = i93;
                int i94 = i68 + i91;
                int i95 = i69 + i92;
                int i96 = i70 + i93;
                i73 = i83 + i94;
                i74 = i84 + i95;
                i64 = i85 + i96;
                i80 = (i80 + 1) % i63;
                int[] iArr19 = iArr8[i80];
                int i97 = iArr19[0];
                i65 = i86 + i97;
                int i98 = iArr19[1];
                i66 = i87 + i98;
                int i99 = iArr19[2];
                i67 = i88 + i99;
                i68 = i94 - i97;
                i69 = i95 - i98;
                i70 = i96 - i99;
                i79 += i77;
                i82++;
                i9 = i89;
            }
            i61++;
            i59 = i78;
            i60 = i81;
            i14 = i63;
            iArr2 = iArr16;
            width = i77;
        }
        int i100 = width;
        bitmap3.setPixels(iArr2, 0, i100, 0, 0, i100, i60);
        return bitmap3;
    }

    public static Bitmap toAlpha(Bitmap bitmap, Boolean bool) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap extractAlpha = bitmap.extractAlpha();
        if (bool.booleanValue() && !bitmap.isRecycled() && extractAlpha != bitmap) {
            bitmap.recycle();
        }
        return extractAlpha;
    }

    public static Bitmap toGray(Bitmap bitmap, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (z7 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap toRound(Bitmap bitmap, boolean z7) {
        return toRound(bitmap, 0, 0, z7);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f8, boolean z7) {
        return toRoundCorner(bitmap, f8, 0.0f, 0, z7);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f8, @ColorInt int i8, float[] fArr, boolean z7) {
        return addBorder(bitmap, f8, i8, false, fArr, z7);
    }

    public static Bitmap compressByScale(Bitmap bitmap, float f8, float f9) {
        return scale(bitmap, f8, f9, false);
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d) float f8, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f9, boolean z7, boolean z8) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(f8, f8);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Paint paint = new Paint(3);
        Canvas canvas = new Canvas();
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.scale(f8, f8);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        Bitmap renderScriptBlur = renderScriptBlur(createBitmap, f9, z7);
        if (f8 != 1.0f && !z8) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(renderScriptBlur, width, height, true);
            if (!renderScriptBlur.isRecycled()) {
                renderScriptBlur.recycle();
            }
            if (z7 && !bitmap.isRecycled() && createScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return createScaledBitmap;
        }
        if (z7 && !bitmap.isRecycled() && renderScriptBlur != bitmap) {
            bitmap.recycle();
        }
        return renderScriptBlur;
    }

    public static boolean isImage(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (options.outWidth > 0) {
                return options.outHeight > 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z7) {
        return save(bitmap, str, compressFormat, 100, z7);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i8) {
        return save2Album(bitmap, "", compressFormat, i8, false);
    }

    public static Bitmap skew(Bitmap bitmap, float f8, float f9, float f10, float f11) {
        return skew(bitmap, f8, f9, f10, f11, false);
    }

    public static Bitmap toRound(Bitmap bitmap, @IntRange(from = 0) int i8, @ColorInt int i9) {
        return toRound(bitmap, i8, i9, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f8, @FloatRange(from = 0.0d) float f9, @ColorInt int i8) {
        return toRoundCorner(bitmap, f8, f9, i8, false);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f8, @ColorInt int i8, @FloatRange(from = 0.0d) float f9, boolean z7) {
        return addBorder(bitmap, f8, i8, false, f9, z7);
    }

    public static Bitmap compressByScale(Bitmap bitmap, float f8, float f9, boolean z7) {
        return scale(bitmap, f8, f9, z7);
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z7) {
        return save(bitmap, file, compressFormat, 100, z7);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i8, boolean z7) {
        return save2Album(bitmap, "", compressFormat, i8, z7);
    }

    public static Bitmap skew(Bitmap bitmap, float f8, float f9, float f10, float f11, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setSkew(f8, f9, f10, f11);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z7 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap toRound(Bitmap bitmap, @IntRange(from = 0) int i8, @ColorInt int i9, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int min = Math.min(width, height);
        Paint paint = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        float f8 = min;
        float f9 = f8 / 2.0f;
        float f10 = width;
        float f11 = height;
        RectF rectF = new RectF(0.0f, 0.0f, f10, f11);
        rectF.inset((width - min) / 2.0f, (height - min) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.setTranslate(rectF.left, rectF.top);
        if (width != height) {
            matrix.preScale(f8 / f10, f8 / f11);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawRoundRect(rectF, f9, f9, paint);
        if (i8 > 0) {
            paint.setShader(null);
            paint.setColor(i9);
            paint.setStyle(Paint.Style.STROKE);
            float f12 = i8;
            paint.setStrokeWidth(f12);
            canvas.drawCircle(f10 / 2.0f, f11 / 2.0f, f9 - (f12 / 2.0f), paint);
        }
        if (z7 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float[] fArr, @FloatRange(from = 0.0d) float f8, @ColorInt int i8) {
        return toRoundCorner(bitmap, fArr, f8, i8, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i8) {
        return save(bitmap, c1.getFileByPath(str), compressFormat, i8, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save2Album(bitmap, str, compressFormat, 100, false);
    }

    public static Bitmap scale(Bitmap bitmap, float f8, float f9) {
        return scale(bitmap, f8, f9, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f8, @FloatRange(from = 0.0d) float f9, @ColorInt int i8, boolean z7) {
        return toRoundCorner(bitmap, new float[]{f8, f8, f8, f8, f8, f8, f8, f8}, f9, i8, z7);
    }

    public static Bitmap getBitmap(String str) {
        if (c1.isSpace(str)) {
            return null;
        }
        return BitmapFactory.decodeFile(str);
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i8) {
        return save(bitmap, file, compressFormat, i8, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z7) {
        return save2Album(bitmap, str, compressFormat, 100, z7);
    }

    public static Bitmap scale(Bitmap bitmap, float f8, float f9, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f8, f9);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z7 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float[] fArr, @FloatRange(from = 0.0d) float f8, @ColorInt int i8, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Paint paint = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f9 = f8 / 2.0f;
        rectF.inset(f9, f9);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        if (f8 > 0.0f) {
            paint.setShader(null);
            paint.setColor(i8);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f8);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawPath(path, paint);
        }
        if (z7 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static byte[] compressByQuality(Bitmap bitmap, long j8) {
        return compressByQuality(bitmap, j8, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i8, boolean z7) {
        return save(bitmap, c1.getFileByPath(str), compressFormat, i8, z7);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i8) {
        return save2Album(bitmap, str, compressFormat, i8, false);
    }

    public static byte[] compressByQuality(Bitmap bitmap, long j8, boolean z7) {
        byte[] byteArray;
        int i8 = 0;
        if (isEmptyBitmap(bitmap) || j8 <= 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        int i9 = 100;
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.size() <= j8) {
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            byteArrayOutputStream.reset();
            bitmap.compress(compressFormat, 0, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= j8) {
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                int i10 = 0;
                while (i8 < i9) {
                    i10 = (i8 + i9) / 2;
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
                    long size = byteArrayOutputStream.size();
                    if (size == j8) {
                        break;
                    }
                    if (size > j8) {
                        i9 = i10 - 1;
                    } else {
                        i8 = i10 + 1;
                    }
                }
                if (i9 == i10 - 1) {
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i8, byteArrayOutputStream);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
        }
        if (z7 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return byteArray;
    }

    public static Bitmap getBitmap(String str, int i8, int i9) {
        if (c1.isSpace(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(options, i8, i9);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0061 -> B:27:0x0070). Please report as a decompilation issue!!! */
    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i8, boolean z7) {
        BufferedOutputStream bufferedOutputStream;
        boolean z8 = false;
        if (isEmptyBitmap(bitmap)) {
            Log.e("ImageUtils", "bitmap is empty.");
            return false;
        }
        if (bitmap.isRecycled()) {
            Log.e("ImageUtils", "bitmap is recycled.");
            return false;
        }
        if (!c1.createFileByDeleteOldFile(file)) {
            Log.e("ImageUtils", "create or delete file <" + file + "> failed.");
            return false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                } catch (IOException e8) {
                    e = e8;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        }
        try {
            z8 = bitmap.compress(compressFormat, i8, bufferedOutputStream);
            if (z7 && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            bufferedOutputStream.close();
        } catch (IOException e10) {
            e = e10;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            return z8;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            throw th;
        }
        return z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i8, boolean z7) {
        Uri uri;
        OutputStream outputStream;
        if (TextUtils.isEmpty(str)) {
            str = z0.getApp().getPackageName();
        }
        String str2 = System.currentTimeMillis() + "_" + i8 + "." + (Bitmap.CompressFormat.JPEG.equals(compressFormat) ? "JPG" : compressFormat.name());
        OutputStream outputStream2 = null;
        if (Build.VERSION.SDK_INT < 29) {
            if (!c1.isGranted("android.permission.WRITE_EXTERNAL_STORAGE")) {
                Log.e("ImageUtils", "save to album need storage permission");
                return null;
            }
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), str + "/" + str2);
            if (!save(bitmap, file, compressFormat, i8, z7)) {
                return null;
            }
            c1.notifySystemToScan(file);
            return file;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str2);
        contentValues.put("mime_type", com.crrepa.x.a.f13978d);
        if (Environment.getExternalStorageState().equals("mounted")) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        }
        contentValues.put("relative_path", Environment.DIRECTORY_DCIM + "/" + str);
        contentValues.put("is_pending", (Integer) 1);
        Uri insert = z0.getApp().getContentResolver().insert(uri, contentValues);
        if (insert == null) {
            return null;
        }
        try {
            outputStream = z0.getApp().getContentResolver().openOutputStream(insert);
            try {
                try {
                    bitmap.compress(compressFormat, i8, outputStream);
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    z0.getApp().getContentResolver().update(insert, contentValues, null, null);
                    File uri2File = c1.uri2File(insert);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    return uri2File;
                } catch (Exception e9) {
                    e = e9;
                    z0.getApp().getContentResolver().delete(insert, null, null);
                    e.printStackTrace();
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                outputStream2 = outputStream;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            outputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (outputStream2 != null) {
            }
            throw th;
        }
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i8, int i9) {
        return compressBySampleSize(bitmap, i8, i9, false);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i8, int i9, boolean z7) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        options.inSampleSize = calculateInSampleSize(options, i8, i9);
        options.inJustDecodeBounds = false;
        if (z7 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    private static ImageType getImageType(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[12];
            if (inputStream.read(bArr) != -1) {
                return getImageType(bArr);
            }
            return null;
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static Bitmap getBitmap(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return BitmapFactory.decodeStream(inputStream);
    }

    public static Bitmap getBitmap(InputStream inputStream, int i8, int i9) {
        if (inputStream == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        options.inSampleSize = calculateInSampleSize(options, i8, i9);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    private static ImageType getImageType(byte[] bArr) {
        String upperCase = c1.bytes2HexString(bArr).toUpperCase();
        if (upperCase.contains("FFD8FF")) {
            return ImageType.TYPE_JPG;
        }
        if (upperCase.contains("89504E47")) {
            return ImageType.TYPE_PNG;
        }
        if (upperCase.contains("47494638")) {
            return ImageType.TYPE_GIF;
        }
        if (!upperCase.contains("49492A00") && !upperCase.contains("4D4D002A")) {
            if (upperCase.contains("424D")) {
                return ImageType.TYPE_BMP;
            }
            if (upperCase.startsWith("52494646") && upperCase.endsWith("57454250")) {
                return ImageType.TYPE_WEBP;
            }
            if (!upperCase.contains("00000100") && !upperCase.contains("00000200")) {
                return ImageType.TYPE_UNKNOWN;
            }
            return ImageType.TYPE_ICO;
        }
        return ImageType.TYPE_TIFF;
    }

    public static Bitmap getBitmap(byte[] bArr, int i8) {
        if (bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, i8, bArr.length);
    }

    public static Bitmap getBitmap(byte[] bArr, int i8, int i9, int i10) {
        if (bArr.length == 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, i8, bArr.length, options);
        options.inSampleSize = calculateInSampleSize(options, i9, i10);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, i8, bArr.length, options);
    }

    public static Bitmap getBitmap(@DrawableRes int i8) {
        Drawable drawable = ContextCompat.getDrawable(z0.getApp(), i8);
        if (drawable == null) {
            return null;
        }
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap getBitmap(@DrawableRes int i8, int i9, int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Resources resources = z0.getApp().getResources();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i8, options);
        options.inSampleSize = calculateInSampleSize(options, i9, i10);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i8, options);
    }

    public static Bitmap getBitmap(FileDescriptor fileDescriptor) {
        if (fileDescriptor == null) {
            return null;
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap getBitmap(FileDescriptor fileDescriptor, int i8, int i9) {
        if (fileDescriptor == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = calculateInSampleSize(options, i8, i9);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }
}
