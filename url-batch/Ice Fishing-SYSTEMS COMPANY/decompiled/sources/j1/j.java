package j1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Matrix f38533a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public static final H7.b f38534b = new H7.b(9);

    /* renamed from: c, reason: collision with root package name */
    public static final H7.b f38535c = new H7.b(10);

    /* renamed from: d, reason: collision with root package name */
    public static final H7.b f38536d = new H7.b(11);

    /* renamed from: e, reason: collision with root package name */
    public static final H7.b f38537e = new H7.b(12);

    /* renamed from: f, reason: collision with root package name */
    public static final float f38538f = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f6, float f9, float f10) {
        PathMeasure pathMeasure = (PathMeasure) f38534b.get();
        Path path2 = (Path) f38535c.get();
        Path path3 = (Path) f38536d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f6 == 1.0f && f9 == 0.0f) && length >= 1.0f && Math.abs((f9 - f6) - 1.0f) >= 0.01d) {
            float f11 = f6 * length;
            float f12 = f9 * length;
            float f13 = f10 * length;
            float min = Math.min(f11, f12) + f13;
            float max = Math.max(f11, f12) + f13;
            if (min >= length && max >= length) {
                min = h.d(min, length);
                max = h.d(max, length);
            }
            if (min < 0.0f) {
                min = h.d(min, length);
            }
            if (max < 0.0f) {
                max = h.d(max, length);
            }
            if (min == max) {
                path.reset();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap, int i, int i4) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i4) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i4, true);
        bitmap.recycle();
        return createScaledBitmap;
    }
}
