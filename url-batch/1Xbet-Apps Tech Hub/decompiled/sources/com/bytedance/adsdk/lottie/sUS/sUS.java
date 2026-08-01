package com.bytedance.adsdk.lottie.sUS;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.bytedance.adsdk.lottie.pvs.pvs.rCZ;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class sUS {
    private static final ThreadLocal<PathMeasure> pvs = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.lottie.sUS.sUS.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> icD = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.lottie.sUS.sUS.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> vG = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.lottie.sUS.sUS.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> Jd = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.lottie.sUS.sUS.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float NB = (float) (Math.sqrt(2.0d) / 2.0d);

    public static int pvs(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    public static boolean pvs(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    public static Path pvs(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void pvs(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float pvs(Matrix matrix) {
        float[] fArr = Jd.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = NB;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean icD(Matrix matrix) {
        float[] fArr = Jd.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void pvs(Path path, rCZ rcz) {
        if (rcz == null || rcz.sUS()) {
            return;
        }
        pvs(path, ((com.bytedance.adsdk.lottie.pvs.icD.Jd) rcz.vG()).Mxy() / 100.0f, ((com.bytedance.adsdk.lottie.pvs.icD.Jd) rcz.Jd()).Mxy() / 100.0f, ((com.bytedance.adsdk.lottie.pvs.icD.Jd) rcz.NB()).Mxy() / 360.0f);
    }

    public static void pvs(Path path, float f, float f2, float f3) {
        com.bytedance.adsdk.lottie.NB.pvs("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = pvs.get();
        Path path2 = icD.get();
        Path path3 = vG.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            com.bytedance.adsdk.lottie.NB.icD("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            com.bytedance.adsdk.lottie.NB.icD("applyTrimPathIfNeeded");
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float min = Math.min(f4, f5) + f6;
        float max = Math.max(f4, f5) + f6;
        if (min >= length && max >= length) {
            min = NB.pvs(min, length);
            max = NB.pvs(max, length);
        }
        if (min < 0.0f) {
            min = NB.pvs(min, length);
        }
        if (max < 0.0f) {
            max = NB.pvs(max, length);
        }
        if (min == max) {
            path.reset();
            com.bytedance.adsdk.lottie.NB.icD("applyTrimPathIfNeeded");
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
        com.bytedance.adsdk.lottie.NB.icD("applyTrimPathIfNeeded");
    }

    public static float pvs() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float pvs(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap pvs(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static boolean pvs(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void pvs(Canvas canvas, RectF rectF, Paint paint) {
        pvs(canvas, rectF, paint, 31);
    }

    public static void pvs(Canvas canvas, RectF rectF, Paint paint, int i) {
        com.bytedance.adsdk.lottie.NB.pvs("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.lottie.NB.icD("Utils#saveLayer");
    }
}
