package com.moyoung.dafit.module.common.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public class g {
    private static final int COMPRESSOR_QUALITY = 100;

    public static BitmapDrawable blur(Context context, Bitmap bitmap) {
        RenderScript create = RenderScript.create(context);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        bitmap.recycle();
        create.destroy();
        return new BitmapDrawable(createBitmap);
    }

    public static Bitmap byteToBitmap(byte[] bArr, int i8, int i9) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        if (i11 > i8 || i12 > i9) {
            int i13 = i11 / 2;
            int i14 = i12 / 2;
            while (i13 / i10 >= i8 && i14 / i10 >= i9) {
                i10 *= 2;
            }
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    public static Bitmap changeBitmapSize(Bitmap bitmap, int i8, int i9) {
        return changeBitmapSize(bitmap, i8, i9, -1);
    }

    public static void changeBitmapSizeAndSave(String str, int i8) {
        int i9;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null || decodeFile.isRecycled()) {
            return;
        }
        float width = decodeFile.getWidth();
        float height = decodeFile.getHeight();
        if (width > height) {
            i9 = (int) ((height * i8) / width);
        } else {
            int i10 = (int) ((width * i8) / height);
            i9 = i8;
            i8 = i10;
        }
        saveBitmap(changeBitmapSize(decodeFile, i8, i9, readPictureDegree(str)), new File(str));
    }

    public static Bitmap copyBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return bitmap.copy(Bitmap.Config.ARGB_8888, true);
    }

    public static Bitmap cropBitmap(Bitmap bitmap, int i8, int i9) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        return (width > i8 || height > i9) ? Bitmap.createBitmap(bitmap, (width - i8) / 2, (height - i9) / 2, i8, i9) : bitmap;
    }

    public static Bitmap drawableResToBitmap(@DrawableRes int i8, int i9, int i10) {
        return drawableToBitmap(ContextCompat.getDrawable(d.get(), i8), i9, i10);
    }

    public static Bitmap drawableToBitmap(Drawable drawable, int i8, int i9) {
        if (drawable == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i8, i9, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, i8, i9);
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap getCirleBitmap(Bitmap bitmap) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f8 = min / 2;
        canvas.drawCircle(f8, f8, f8, paint);
        return createBitmap;
    }

    public static Bitmap getRoundBitmap(Bitmap bitmap, int i8, int i9, int i10) {
        Log.d("getRoundBitmap", "outWidth:" + i8 + " outHeight:" + i9 + " radius:" + i10);
        if (bitmap == null) {
            return null;
        }
        float f8 = i8;
        float f9 = i9;
        Matrix matrix = new Matrix();
        matrix.setScale((f8 * 1.0f) / bitmap.getWidth(), (1.0f * f9) / bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f10 = i10;
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, f8, f9), f10, f10, paint);
        return createBitmap;
    }

    public static int readPictureDegree(String str) {
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
            return 0;
        }
    }

    public static Bitmap rotaingBitmap(Bitmap bitmap, int i8) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i8);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (createBitmap != bitmap && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.Bitmap] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0026 -> B:12:0x003c). Please report as a decompilation issue!!! */
    public static void saveBitmap(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream;
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        ?? r02 = 0;
        FileOutputStream fileOutputStream2 = null;
        r02 = 0;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FileNotFoundException e8) {
                e = e8;
            }
        } catch (IOException e9) {
            e9.printStackTrace();
            r02 = r02;
        }
        try {
            r02 = 100;
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            fileOutputStream2.flush();
            fileOutputStream2.close();
            r02 = fileOutputStream2;
        } catch (Throwable th2) {
            th = th2;
            r02 = fileOutputStream;
            try {
                r02.flush();
                r02.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            throw th;
        }
    }

    public static Bitmap scaleAndCropBitmap(Bitmap bitmap, int i8, int i9) {
        int i10;
        int i11;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i9 > i8) {
            i11 = (int) (width * (i9 / height));
            i10 = i9;
        } else {
            i10 = (int) (height * (i8 / width));
            i11 = i8;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i11, i10, true);
        int i12 = i11 > i8 ? (i11 - i8) / 2 : 0;
        int i13 = i10 > i9 ? (i10 - i9) / 2 : 0;
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, i12, i13, Math.min(i8, createScaledBitmap.getWidth() - i12), Math.min(i9, createScaledBitmap.getHeight() - i13));
        if (bitmap != createScaledBitmap) {
            bitmap.recycle();
        }
        createScaledBitmap.recycle();
        return createBitmap;
    }

    public static void scaleAndCropBitmapAndSave(String str, int i8, int i9) {
        saveBitmap(scaleAndCropBitmap(BitmapFactory.decodeFile(str), i8, i9), new File(str));
    }

    public static Bitmap changeBitmapSize(Bitmap bitmap, int i8, int i9, int i10) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i8 == width && i9 == height) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(i8 / width, i9 / height);
        if (i10 != -1) {
            matrix.postRotate(i10);
        }
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }
}
