package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dq0 extends hq0 {
    public IconCompat e;
    public IconCompat f;
    public boolean g;

    @Override // defpackage.hq0
    public final void a(i8 i8Var) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) i8Var.e).setBigContentTitle(this.b);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                cq0.a(bigContentTitle, iconCompat.c());
            } else {
                int i = iconCompat.a;
                if (i == -1) {
                    i = ((Icon) iconCompat.b).getType();
                }
                if (i == 1) {
                    IconCompat iconCompat2 = this.e;
                    int i2 = iconCompat2.a;
                    if (i2 == -1) {
                        Object obj = iconCompat2.b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i2 == 1) {
                        bitmap = (Bitmap) iconCompat2.b;
                    } else {
                        if (i2 != 5) {
                            af.i(iconCompat2, "called getBitmap() on ");
                            return;
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.b;
                        int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        float f = min;
                        float f2 = 0.5f * f;
                        float f3 = 0.9166667f * f2;
                        float f4 = 0.010416667f * f;
                        paint.setColor(0);
                        paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f2, f2, f3, paint);
                        canvas.setBitmap(null);
                        bitmap = createBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.g) {
            IconCompat iconCompat3 = this.f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bq0.a(bigContentTitle, iconCompat3.c());
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            cq0.c(bigContentTitle, false);
            cq0.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.hq0
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
