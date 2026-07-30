package com.my.lib;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.my.lib.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0416h {
    public static Bitmap a(Bitmap oldBmp, int i8, int i9) {
        int width;
        int height;
        kotlin.jvm.internal.s.checkNotNullParameter(oldBmp, "oldBmp");
        float f8 = i8 * 1.0f;
        float width2 = (oldBmp.getWidth() * 1.0f) / f8;
        float f9 = i9 * 1.0f;
        float height2 = (oldBmp.getHeight() * 1.0f) / f9;
        if (width2 >= height2) {
            width2 = height2;
        }
        float f10 = f8 * width2;
        float f11 = width2 * f9;
        if (f10 < oldBmp.getWidth()) {
            width = oldBmp.getWidth();
        } else {
            f10 = (f10 - (f10 - oldBmp.getWidth())) - 4;
            width = oldBmp.getWidth();
        }
        float f12 = (width - f10) / 2;
        if (f11 < oldBmp.getHeight()) {
            height = oldBmp.getHeight();
        } else {
            f11 = (f11 - (f11 - oldBmp.getHeight())) - 4;
            height = oldBmp.getHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(oldBmp, (int) f12, (int) ((height - f11) / 2), (int) f10, (int) f11);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Bitmap createBitmap2 = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(createBitmap2, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap2);
        Matrix matrix = new Matrix();
        matrix.postScale(f8 / (createBitmap.getWidth() * 1.0f), f9 / (createBitmap.getHeight() * 1.0f));
        canvas.drawBitmap(createBitmap, matrix, new Paint());
        return createBitmap2;
    }

    public static boolean a(Bitmap bitmap, String filePath, String formatStr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bitmap, "bitmap");
        kotlin.jvm.internal.s.checkNotNullParameter(filePath, "filePath");
        kotlin.jvm.internal.s.checkNotNullParameter(formatStr, "formatStr");
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        if (kotlin.jvm.internal.s.areEqual(formatStr, "png")) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(filePath));
            bitmap.compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (IOException e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
