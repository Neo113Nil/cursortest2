package com.bytedance.adsdk.fs.hhw;

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
import com.bytedance.adsdk.fs.zmn.zmn.phc;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes13.dex */
public final class hhw {
    private static final ThreadLocal<PathMeasure> zmn = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.fs.hhw.hhw.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> fs = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.fs.hhw.hhw.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> zn = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.fs.hhw.hhw.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> fb = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.fs.hhw.hhw.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float btk = (float) (Math.sqrt(2.0d) / 2.0d);

    public static int zmn(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    public static boolean zmn(int i, int i2, int i3, int i4, int i5, int i6) {
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

    public static Path zmn(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void zmn(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float zmn(Matrix matrix) {
        float[] fArr = fb.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = btk;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean fs(Matrix matrix) {
        float[] fArr = fb.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void zmn(Path path, phc phcVar) {
        if (phcVar == null || phcVar.hhw()) {
            return;
        }
        zmn(path, ((com.bytedance.adsdk.fs.zmn.fs.fb) phcVar.zn()).bvs() / 100.0f, ((com.bytedance.adsdk.fs.zmn.fs.fb) phcVar.fb()).bvs() / 100.0f, ((com.bytedance.adsdk.fs.zmn.fs.fb) phcVar.btk()).bvs() / 360.0f);
    }

    public static void zmn(Path path, float f, float f2, float f3) {
        com.bytedance.adsdk.fs.btk.zmn("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = zmn.get();
        Path path2 = fs.get();
        Path path3 = zn.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            com.bytedance.adsdk.fs.btk.fs("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            com.bytedance.adsdk.fs.btk.fs("applyTrimPathIfNeeded");
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float min = Math.min(f4, f5) + f6;
        float max = Math.max(f4, f5) + f6;
        if (min >= length && max >= length) {
            min = btk.zmn(min, length);
            max = btk.zmn(max, length);
        }
        if (min < 0.0f) {
            min = btk.zmn(min, length);
        }
        if (max < 0.0f) {
            max = btk.zmn(max, length);
        }
        if (min == max) {
            path.reset();
            com.bytedance.adsdk.fs.btk.fs("applyTrimPathIfNeeded");
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
        com.bytedance.adsdk.fs.btk.fs("applyTrimPathIfNeeded");
    }

    public static float zmn() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float zmn(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap zmn(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static boolean zmn(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void zmn(Canvas canvas, RectF rectF, Paint paint) {
        zmn(canvas, rectF, paint, 31);
    }

    public static void zmn(Canvas canvas, RectF rectF, Paint paint, int i) {
        com.bytedance.adsdk.fs.btk.zmn("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.fs.btk.fs("Utils#saveLayer");
    }
}
