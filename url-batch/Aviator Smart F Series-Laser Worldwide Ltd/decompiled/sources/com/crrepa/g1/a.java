package com.crrepa.g1;

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
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12912a = 100;

    public static Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return bitmap.copy(Bitmap.Config.ARGB_8888, true);
    }

    public static Bitmap b(Bitmap bitmap) {
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

    public static Bitmap a(Bitmap bitmap, int i8) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i8);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (createBitmap != bitmap && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap b(Bitmap bitmap, int i8, int i9) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        return (width > i8 || height > i9) ? Bitmap.createBitmap(bitmap, (width - i8) / 2, (height - i9) / 2, i8, i9) : bitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i8, int i9) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i8 == width && i9 == height) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(i8 / width, i9 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    public static void b(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream;
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (FileNotFoundException e8) {
                    e = e8;
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (FileNotFoundException e9) {
                e = e9;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                fileOutputStream2.flush();
                fileOutputStream2.close();
            } catch (Throwable th2) {
                th = th2;
                try {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    public static Bitmap a(Bitmap bitmap, int i8, int i9, int i10) {
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

    public static void b(String str, int i8, int i9) {
        a(a(str, i8, i9), new File(str));
    }

    public static Bitmap a(Drawable drawable, int i8, int i9) {
        if (drawable == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i8, i9, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, i8, i9);
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap a(String str, int i8, int i9) {
        int i10;
        int i11;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            return null;
        }
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        if (i9 > i8) {
            i11 = (int) (width * (i9 / height));
            i10 = i9;
        } else {
            i10 = (int) (height * (i8 / width));
            i11 = i8;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, i11, i10, true);
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, i11 > i8 ? (i11 - i8) / 2 : 0, i10 > i9 ? (i10 - i9) / 2 : 0, i8, i9);
        if (decodeFile != createScaledBitmap) {
            decodeFile.recycle();
        }
        createScaledBitmap.recycle();
        return createBitmap;
    }

    public static Bitmap a(byte[] bArr, int i8, int i9) {
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

    public static BitmapDrawable a(Context context, Bitmap bitmap) {
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

    public static void a(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream;
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (FileNotFoundException e8) {
                    e = e8;
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (FileNotFoundException e9) {
                e = e9;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                fileOutputStream2.flush();
                fileOutputStream2.close();
            } catch (Throwable th2) {
                th = th2;
                try {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }
}
