package b2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class a {
    public static Bitmap createCircleMaskBitmap(int i8, int i9, int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(-16777216);
        float f8 = i8;
        float f9 = i9;
        canvas.drawRect(0.0f, 0.0f, f8, f9, paint);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawCircle(f8 / 2.0f, f9 / 2.0f, i10, paint2);
        return createBitmap;
    }

    public static Bitmap createCornerMaskBitmap(int i8, int i9, float f8) {
        return createCornerMaskBitmap(i8, i9, 0.0f, 0.0f, f8);
    }

    public static void saveBitmapToSDCard(Bitmap bitmap, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public static void saveCircleMaskToSDCard(int i8, int i9, String str) {
        saveBitmapToSDCard(createCircleMaskBitmap(i8, i9, i8 / 2), str);
    }

    public static void saveCornerMaskToSDCard(int i8, int i9, int i10, String str) {
        saveBitmapToSDCard(createCornerMaskBitmap(i8, i9, i10), str);
    }

    public static Bitmap createCornerMaskBitmap(int i8, int i9, float f8, float f9, float f10) {
        Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(-16777216);
        float f11 = i8;
        float f12 = i9;
        canvas.drawRect(0.0f, 0.0f, f11, f12, paint);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setAntiAlias(true);
        Path path = new Path();
        path.addRoundRect(new RectF(f9, f8, f11 - f9, f12 - f8), f10, f10, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        return createBitmap;
    }

    public static void saveCornerMaskToSDCard(int i8, int i9, float f8, float f9, int i10, String str) {
        saveBitmapToSDCard(createCornerMaskBitmap(i8, i9, f8, f9, i10), str);
    }
}
