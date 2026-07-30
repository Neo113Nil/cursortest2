package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import android.view.MotionEvent;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import defpackage.a52;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class x6 {
    public static void a(Canvas canvas) {
        canvas.disableZ();
    }

    public static void b(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public static void c(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static void d(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    public static void e(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static void f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void h(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static void i(Canvas canvas) {
        canvas.enableZ();
    }

    public static void j(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static ContentCaptureSession k(View view) {
        return view.getContentCaptureSession();
    }

    public static String l(Context context) {
        return context.getOpPackageName();
    }

    public static final void m(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }

    public static final long n(t7 t7Var) {
        return t7Var.getUniqueDrawingId();
    }

    public static Insets o(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void p(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void q(Activity activity, a52.a aVar) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static void r(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void s(Paint paint, int i) {
        paint.setBlendMode(v(i));
    }

    public static void t(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void u(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static final BlendMode v(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            blendMode2 = BlendMode.SRC_OVER;
            return blendMode2;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        if (i == 28) {
            return BlendMode.LUMINOSITY;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final PorterDuff.Mode w(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static long x(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        float rawY = motionEvent.getRawY(i);
        return (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }
}
