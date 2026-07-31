package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidPaint.android.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\f\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u0011*\u00060\u0003j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0014\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0017\u001a\u00020\u0016*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u001b\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020\u0016H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001e\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020\u001cH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u000b\u001a\u0017\u0010\u001f\u001a\u00020\u0011*\u00060\u0003j\u0002`\u0006H\u0000¢\u0006\u0004\b\u001f\u0010\u0013\u001a\u001f\u0010 \u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020\u0011H\u0000¢\u0006\u0004\b \u0010\u0015\u001a\u001a\u0010\"\u001a\u00020!*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a%\u0010%\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020!H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u000b\u001a\u001a\u0010'\u001a\u00020&*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010#\u001a%\u0010)\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020&H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u000b\u001a\u0017\u0010*\u001a\u00020\u0011*\u00060\u0003j\u0002`\u0006H\u0000¢\u0006\u0004\b*\u0010\u0013\u001a\u001f\u0010+\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020\u0011H\u0000¢\u0006\u0004\b+\u0010\u0015\u001a\u001a\u0010-\u001a\u00020,*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010#\u001a%\u0010/\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020,H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010\u000b\u001a'\u00102\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u000e\u0010\u000e\u001a\n\u0018\u000100j\u0004\u0018\u0001`1H\u0000¢\u0006\u0004\b2\u00103\u001a!\u00105\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\b\u0010\u000e\u001a\u0004\u0018\u000104H\u0000¢\u0006\u0004\b5\u00106*\n\u00107\"\u00020\u00032\u00020\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/ui/graphics/Paint;", "Paint", "()Landroidx/compose/ui/graphics/Paint;", "Landroid/graphics/Paint;", "makeNativePaint", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "Landroidx/compose/ui/graphics/BlendMode;", X3.a.t, "", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeBlendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "setNativeColorFilter", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/ColorFilter;)V", "", "getNativeAlpha", "(Landroid/graphics/Paint;)F", "setNativeAlpha", "(Landroid/graphics/Paint;F)V", "Landroidx/compose/ui/graphics/Color;", "getNativeColor", "(Landroid/graphics/Paint;)J", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColor", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeStyle--5YerkU", "setNativeStyle", "getNativeStrokeWidth", "setNativeStrokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeCap", "(Landroid/graphics/Paint;)I", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeJoin", "getNativeStrokeMiterLimit", "setNativeStrokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativeFilterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeShader", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "Landroidx/compose/ui/graphics/PathEffect;", "setNativePathEffect", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/PathEffect;)V", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidPaint_androidKt {

    /* compiled from: AndroidPaint.android.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            iArr[Paint.Style.STROKE.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            iArr3[Paint.Join.MITER.ordinal()] = 1;
            iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            iArr3[Paint.Join.ROUND.ordinal()] = 3;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m1372setNativeBlendModeGB0RdKg(android.graphics.Paint setNativeBlendMode, int i) {
        Intrinsics.checkNotNullParameter(setNativeBlendMode, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m1634setBlendModeGB0RdKg(setNativeBlendMode, i);
        } else {
            setNativeBlendMode.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m1345toPorterDuffModes9anfk8(i)));
        }
    }

    public static final void setNativeColorFilter(android.graphics.Paint paint, ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    public static final float getNativeAlpha(android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final void setNativeAlpha(android.graphics.Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final long getNativeColor(android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return ColorKt.Color(paint.getColor());
    }

    /* renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m1373setNativeColor4WTKRHQ(android.graphics.Paint setNativeColor, long j) {
        Intrinsics.checkNotNullParameter(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(ColorKt.m1471toArgb8_81llA(j));
    }

    /* renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m1377setNativeStyle5YerkU(android.graphics.Paint setNativeStyle, int i) {
        Intrinsics.checkNotNullParameter(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(PaintingStyle.m1534equalsimpl0(i, PaintingStyle.INSTANCE.m1539getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public static final float getNativeStrokeWidth(android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final void setNativeStrokeWidth(android.graphics.Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    public static final int getNativeStrokeCap(android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        if (i == 1) {
            return StrokeCap.INSTANCE.m1594getButtKaPHkGw();
        }
        if (i == 2) {
            return StrokeCap.INSTANCE.m1595getRoundKaPHkGw();
        }
        if (i == 3) {
            return StrokeCap.INSTANCE.m1596getSquareKaPHkGw();
        }
        return StrokeCap.INSTANCE.m1594getButtKaPHkGw();
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m1375setNativeStrokeCapCSYIeUk(android.graphics.Paint setNativeStrokeCap, int i) {
        Paint.Cap cap;
        Intrinsics.checkNotNullParameter(setNativeStrokeCap, "$this$setNativeStrokeCap");
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        if (StrokeCap.m1590equalsimpl0(i, companion.m1596getSquareKaPHkGw())) {
            cap = Paint.Cap.SQUARE;
        } else if (StrokeCap.m1590equalsimpl0(i, companion.m1595getRoundKaPHkGw())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = StrokeCap.m1590equalsimpl0(i, companion.m1594getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        setNativeStrokeCap.setStrokeCap(cap);
    }

    public static final int getNativeStrokeJoin(android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        if (i == 1) {
            return StrokeJoin.INSTANCE.m1605getMiterLxFBmk8();
        }
        if (i == 2) {
            return StrokeJoin.INSTANCE.m1604getBevelLxFBmk8();
        }
        if (i == 3) {
            return StrokeJoin.INSTANCE.m1606getRoundLxFBmk8();
        }
        return StrokeJoin.INSTANCE.m1605getMiterLxFBmk8();
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m1376setNativeStrokeJoinkLtJ_vA(android.graphics.Paint setNativeStrokeJoin, int i) {
        Paint.Join join;
        Intrinsics.checkNotNullParameter(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        if (StrokeJoin.m1600equalsimpl0(i, companion.m1605getMiterLxFBmk8())) {
            join = Paint.Join.MITER;
        } else if (StrokeJoin.m1600equalsimpl0(i, companion.m1604getBevelLxFBmk8())) {
            join = Paint.Join.BEVEL;
        } else {
            join = StrokeJoin.m1600equalsimpl0(i, companion.m1606getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        setNativeStrokeJoin.setStrokeJoin(join);
    }

    public static final float getNativeStrokeMiterLimit(android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final void setNativeStrokeMiterLimit(android.graphics.Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public static final int getNativeFilterQuality(android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        if (!paint.isFilterBitmap()) {
            return FilterQuality.INSTANCE.m1483getNonefv9h1I();
        }
        return FilterQuality.INSTANCE.m1482getLowfv9h1I();
    }

    /* renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m1374setNativeFilterQuality50PEsBU(android.graphics.Paint setNativeFilterQuality, int i) {
        Intrinsics.checkNotNullParameter(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(!FilterQuality.m1478equalsimpl0(i, FilterQuality.INSTANCE.m1483getNonefv9h1I()));
    }

    public static final void setNativeShader(android.graphics.Paint paint, Shader shader) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setShader(shader);
    }

    public static final void setNativePathEffect(android.graphics.Paint paint, PathEffect pathEffect) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }
}
