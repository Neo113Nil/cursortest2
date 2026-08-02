package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpk {
    public final WeakReference a;
    public final Object b;
    public final eeq c;
    public final dov d;
    public boolean e;
    private final Executor f;

    public dpk(Object obj, eeq eeqVar, ImageView imageView, Executor executor, dov dovVar) {
        this.a = new WeakReference(imageView);
        this.c = eeqVar;
        this.b = obj;
        this.f = executor;
        this.d = dovVar;
    }

    public final Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        hel helVar = this.c.c;
        if (helVar != null && !helVar.isEmpty()) {
            int i = ((his) helVar).c;
            int i2 = 0;
            while (i2 < i) {
                if (((eep) helVar.get(i2)).ordinal() != 0) {
                    throw new RuntimeException(null, null);
                }
                Map map = dpl.a;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int min = Math.min(width, height);
                int i3 = min - width;
                int i4 = min - height;
                Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(1);
                paint.setColor(-16777216);
                float f = min / 2;
                canvas.drawCircle(f, f, f, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, i3 / 2, i4 / 2, paint);
                i2++;
                bitmap = createBitmap;
            }
        }
        return bitmap;
    }

    public final void b() {
        fao.c();
        ImageView imageView = (ImageView) this.a.get();
        if (this.e || imageView == null) {
            return;
        }
        dpl.b(imageView, null);
    }

    public final void c(Runnable runnable) {
        if (fao.g()) {
            this.f.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void d(Drawable drawable, boolean z) {
        fao.c();
        ImageView imageView = (ImageView) this.a.get();
        if (this.e || imageView == null) {
            return;
        }
        dpj dpjVar = new dpj(this, drawable, z);
        imageView.addOnAttachStateChangeListener(dpjVar);
        int i = yq.a;
        if (imageView.isAttachedToWindow()) {
            imageView.post(new dgc(dpjVar, imageView, 15));
        }
    }
}
