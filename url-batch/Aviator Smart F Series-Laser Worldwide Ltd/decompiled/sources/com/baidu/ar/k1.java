package com.baidu.ar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class k1 {
    public static Bitmap a(Context context, String str) {
        Bitmap bitmap = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream open = context.getAssets().open(str);
            bitmap = BitmapFactory.decodeStream(open);
            open.close();
            return bitmap;
        } catch (IOException e8) {
            e8.printStackTrace();
            return bitmap;
        }
    }

    public static Bitmap a(Bitmap bitmap, int i8) {
        float f8;
        Bitmap bitmap2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        float f9 = width / 2.0f;
        float f10 = height / 2.0f;
        matrix.setRotate(i8, f9, f10);
        float f11 = 0.0f;
        if (i8 != 90 && i8 != 270) {
            f8 = 0.0f;
        } else if (width > height) {
            float f12 = f10 - f9;
            f8 = 0.0f - f12;
            f11 = f12;
        } else {
            f8 = f9 - f10;
            f11 = 0.0f - f8;
        }
        matrix.postTranslate(f11, f8);
        try {
            bitmap2 = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), Bitmap.Config.ARGB_8888);
        } catch (Exception e8) {
            e8.printStackTrace();
            bitmap2 = null;
        }
        new Canvas(bitmap2).drawBitmap(bitmap, matrix, new Paint());
        return bitmap2;
    }
}
