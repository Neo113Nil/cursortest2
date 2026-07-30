package com.github.mikephil.charting.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.audio.AacUtil;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class i {
    public static final double DEG2RAD = 0.017453292519943295d;
    public static final float FDEG2RAD = 0.017453292f;
    private static int mMaximumFlingVelocity = 8000;
    private static DisplayMetrics mMetrics = null;
    private static int mMinimumFlingVelocity = 50;
    public static final double DOUBLE_EPSILON = Double.longBitsToDouble(1);
    public static final float FLOAT_EPSILON = Float.intBitsToFloat(1);
    private static Rect mCalcTextHeightRect = new Rect();
    private static Paint.FontMetrics mFontMetrics = new Paint.FontMetrics();
    private static Rect mCalcTextSizeRect = new Rect();
    private static final int[] POW_10 = {1, 10, 100, 1000, 10000, AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND, 1000000, 10000000, 100000000, 1000000000};
    private static com.github.mikephil.charting.formatter.g mDefaultValueFormatter = generateDefaultValueFormatter();
    private static Rect mDrawableBoundsCache = new Rect();
    private static Rect mDrawTextRectBuffer = new Rect();
    private static Paint.FontMetrics mFontMetricsBuffer = new Paint.FontMetrics();

    public static int calcTextHeight(Paint paint, String str) {
        Rect rect = mCalcTextHeightRect;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static b calcTextSize(Paint paint, String str) {
        b bVar = b.getInstance(0.0f, 0.0f);
        calcTextSize(paint, str, bVar);
        return bVar;
    }

    public static int calcTextWidth(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static float convertDpToPixel(float f8) {
        DisplayMetrics displayMetrics = mMetrics;
        if (displayMetrics != null) {
            return f8 * displayMetrics.density;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return f8;
    }

    public static int[] convertIntegers(List<Integer> list) {
        int[] iArr = new int[list.size()];
        copyIntegers(list, iArr);
        return iArr;
    }

    public static float convertPixelsToDp(float f8) {
        DisplayMetrics displayMetrics = mMetrics;
        if (displayMetrics != null) {
            return f8 / displayMetrics.density;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertPixelsToDp(...). Otherwise conversion does not take place.");
        return f8;
    }

    public static String[] convertStrings(List<String> list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i8 = 0; i8 < size; i8++) {
            strArr[i8] = list.get(i8);
        }
        return strArr;
    }

    public static void copyIntegers(List<Integer> list, int[] iArr) {
        int length = iArr.length < list.size() ? iArr.length : list.size();
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = list.get(i8).intValue();
        }
    }

    public static void copyStrings(List<String> list, String[] strArr) {
        int length = strArr.length < list.size() ? strArr.length : list.size();
        for (int i8 = 0; i8 < length; i8++) {
            strArr[i8] = list.get(i8);
        }
    }

    public static void drawImage(Canvas canvas, Drawable drawable, int i8, int i9, int i10, int i11) {
        e eVar = e.getInstance();
        eVar.f14114x = i8 - (i10 / 2);
        eVar.f14115y = i9 - (i11 / 2);
        drawable.copyBounds(mDrawableBoundsCache);
        Rect rect = mDrawableBoundsCache;
        int i12 = rect.left;
        int i13 = rect.top;
        drawable.setBounds(i12, i13, i12 + i10, i10 + i13);
        int save = canvas.save();
        canvas.translate(eVar.f14114x, eVar.f14115y);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public static void drawMultilineText(Canvas canvas, StaticLayout staticLayout, float f8, float f9, TextPaint textPaint, e eVar, float f10) {
        float fontMetrics = textPaint.getFontMetrics(mFontMetricsBuffer);
        float width = staticLayout.getWidth();
        float lineCount = staticLayout.getLineCount() * fontMetrics;
        float f11 = 0.0f - mDrawTextRectBuffer.left;
        float f12 = lineCount + 0.0f;
        Paint.Align textAlign = textPaint.getTextAlign();
        textPaint.setTextAlign(Paint.Align.LEFT);
        if (f10 != 0.0f) {
            float f13 = f11 - (width * 0.5f);
            float f14 = f12 - (lineCount * 0.5f);
            if (eVar.f14114x != 0.5f || eVar.f14115y != 0.5f) {
                b sizeOfRotatedRectangleByDegrees = getSizeOfRotatedRectangleByDegrees(width, lineCount, f10);
                f8 -= sizeOfRotatedRectangleByDegrees.width * (eVar.f14114x - 0.5f);
                f9 -= sizeOfRotatedRectangleByDegrees.height * (eVar.f14115y - 0.5f);
                b.recycleInstance(sizeOfRotatedRectangleByDegrees);
            }
            canvas.save();
            canvas.translate(f8, f9);
            canvas.rotate(f10);
            canvas.translate(f13, f14);
            staticLayout.draw(canvas);
            canvas.restore();
        } else {
            float f15 = eVar.f14114x;
            if (f15 != 0.0f || eVar.f14115y != 0.0f) {
                f11 -= width * f15;
                f12 -= lineCount * eVar.f14115y;
            }
            canvas.save();
            canvas.translate(f11 + f8, f12 + f9);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        textPaint.setTextAlign(textAlign);
    }

    public static void drawXAxisValue(Canvas canvas, String str, float f8, float f9, Paint paint, e eVar, float f10) {
        float fontMetrics = paint.getFontMetrics(mFontMetricsBuffer);
        paint.getTextBounds(str, 0, str.length(), mDrawTextRectBuffer);
        float f11 = 0.0f - mDrawTextRectBuffer.left;
        float f12 = (-mFontMetricsBuffer.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f10 != 0.0f) {
            float width = f11 - (mDrawTextRectBuffer.width() * 0.5f);
            float f13 = f12 - (fontMetrics * 0.5f);
            if (eVar.f14114x != 0.5f || eVar.f14115y != 0.5f) {
                b sizeOfRotatedRectangleByDegrees = getSizeOfRotatedRectangleByDegrees(mDrawTextRectBuffer.width(), fontMetrics, f10);
                f8 -= sizeOfRotatedRectangleByDegrees.width * (eVar.f14114x - 0.5f);
                f9 -= sizeOfRotatedRectangleByDegrees.height * (eVar.f14115y - 0.5f);
                b.recycleInstance(sizeOfRotatedRectangleByDegrees);
            }
            canvas.save();
            canvas.translate(f8, f9);
            canvas.rotate(f10);
            canvas.drawText(str, width, f13, paint);
            canvas.restore();
        } else {
            if (eVar.f14114x != 0.0f || eVar.f14115y != 0.0f) {
                f11 -= mDrawTextRectBuffer.width() * eVar.f14114x;
                f12 -= fontMetrics * eVar.f14115y;
            }
            canvas.drawText(str, f11 + f8, f12 + f9, paint);
        }
        paint.setTextAlign(textAlign);
    }

    public static String formatNumber(float f8, int i8, boolean z7) {
        return formatNumber(f8, i8, z7, '.');
    }

    private static com.github.mikephil.charting.formatter.g generateDefaultValueFormatter() {
        return new com.github.mikephil.charting.formatter.c(1);
    }

    public static int getDecimals(float f8) {
        float roundToNextSignificant = roundToNextSignificant(f8);
        if (Float.isInfinite(roundToNextSignificant)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10(roundToNextSignificant))) + 2;
    }

    public static com.github.mikephil.charting.formatter.g getDefaultValueFormatter() {
        return mDefaultValueFormatter;
    }

    public static float getLineHeight(Paint paint) {
        return getLineHeight(paint, mFontMetrics);
    }

    public static float getLineSpacing(Paint paint) {
        return getLineSpacing(paint, mFontMetrics);
    }

    public static int getMaximumFlingVelocity() {
        return mMaximumFlingVelocity;
    }

    public static int getMinimumFlingVelocity() {
        return mMinimumFlingVelocity;
    }

    public static float getNormalizedAngle(float f8) {
        while (f8 < 0.0f) {
            f8 += 360.0f;
        }
        return f8 % 360.0f;
    }

    public static e getPosition(e eVar, float f8, float f9) {
        e eVar2 = e.getInstance(0.0f, 0.0f);
        getPosition(eVar, f8, f9, eVar2);
        return eVar2;
    }

    public static int getSDKInt() {
        return Build.VERSION.SDK_INT;
    }

    public static b getSizeOfRotatedRectangleByDegrees(b bVar, float f8) {
        return getSizeOfRotatedRectangleByRadians(bVar.width, bVar.height, f8 * 0.017453292f);
    }

    public static b getSizeOfRotatedRectangleByRadians(b bVar, float f8) {
        return getSizeOfRotatedRectangleByRadians(bVar.width, bVar.height, f8);
    }

    public static void init(Context context) {
        if (context == null) {
            mMinimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
            mMaximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
            mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            mMetrics = context.getResources().getDisplayMetrics();
        }
    }

    public static double nextUp(double d8) {
        if (d8 == Double.POSITIVE_INFINITY) {
            return d8;
        }
        double d9 = d8 + DOUBLE_EPSILON;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d9) + (d9 >= DOUBLE_EPSILON ? 1L : -1L));
    }

    @SuppressLint({"NewApi"})
    public static void postInvalidateOnAnimation(View view) {
        view.postInvalidateOnAnimation();
    }

    public static float roundToNextSignificant(double d8) {
        if (Double.isInfinite(d8) || Double.isNaN(d8) || d8 == DOUBLE_EPSILON) {
            return 0.0f;
        }
        return Math.round(d8 * r0) / ((float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d8 < DOUBLE_EPSILON ? -d8 : d8)))));
    }

    public static void velocityTrackerPointerUpCleanUpIfNecessary(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i8 = 0; i8 < pointerCount; i8++) {
            if (i8 != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i8);
                if ((velocityTracker.getXVelocity(pointerId2) * xVelocity) + (velocityTracker.getYVelocity(pointerId2) * yVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }

    public static String formatNumber(float f8, int i8, boolean z7, char c8) {
        boolean z8;
        float f9 = f8;
        char[] cArr = new char[35];
        if (f9 == 0.0f) {
            return "0";
        }
        int i9 = 0;
        boolean z9 = f9 < 1.0f && f9 > -1.0f;
        if (f9 < 0.0f) {
            f9 = -f9;
            z8 = true;
        } else {
            z8 = false;
        }
        int[] iArr = POW_10;
        int length = i8 > iArr.length ? iArr.length - 1 : i8;
        long round = Math.round(f9 * iArr[length]);
        int i10 = 34;
        boolean z10 = false;
        while (true) {
            if (round == 0 && i9 >= length + 1) {
                break;
            }
            int i11 = (int) (round % 10);
            round /= 10;
            int i12 = i10 - 1;
            cArr[i10] = (char) (i11 + 48);
            int i13 = i9 + 1;
            if (i13 == length) {
                i10 -= 2;
                cArr[i12] = ',';
                i9 += 2;
                z10 = true;
            } else {
                if (z7 && round != 0 && i13 > length) {
                    if (z10) {
                        if ((i13 - length) % 4 == 0) {
                            i10 -= 2;
                            cArr[i12] = c8;
                            i9 += 2;
                        }
                    } else if ((i13 - length) % 4 == 3) {
                        i10 -= 2;
                        cArr[i12] = c8;
                        i9 += 2;
                    }
                }
                i9 = i13;
                i10 = i12;
            }
        }
        if (z9) {
            cArr[i10] = '0';
            i9++;
            i10--;
        }
        if (z8) {
            cArr[i10] = '-';
            i9++;
        }
        int i14 = 35 - i9;
        return String.valueOf(cArr, i14, 35 - i14);
    }

    public static float getLineHeight(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float getLineSpacing(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static b getSizeOfRotatedRectangleByDegrees(float f8, float f9, float f10) {
        return getSizeOfRotatedRectangleByRadians(f8, f9, f10 * 0.017453292f);
    }

    public static b getSizeOfRotatedRectangleByRadians(float f8, float f9, float f10) {
        double d8 = f10;
        return b.getInstance(Math.abs(((float) Math.cos(d8)) * f8) + Math.abs(((float) Math.sin(d8)) * f9), Math.abs(f8 * ((float) Math.sin(d8))) + Math.abs(f9 * ((float) Math.cos(d8))));
    }

    public static void calcTextSize(Paint paint, String str, b bVar) {
        Rect rect = mCalcTextSizeRect;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        bVar.width = rect.width();
        bVar.height = rect.height();
    }

    public static void getPosition(e eVar, float f8, float f9, e eVar2) {
        double d8 = f8;
        double d9 = f9;
        eVar2.f14114x = (float) (eVar.f14114x + (Math.cos(Math.toRadians(d9)) * d8));
        eVar2.f14115y = (float) (eVar.f14115y + (d8 * Math.sin(Math.toRadians(d9))));
    }

    @Deprecated
    public static void init(Resources resources) {
        mMetrics = resources.getDisplayMetrics();
        mMinimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
        mMaximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
    }

    public static void drawMultilineText(Canvas canvas, String str, float f8, float f9, TextPaint textPaint, b bVar, e eVar, float f10) {
        drawMultilineText(canvas, new StaticLayout(str, 0, str.length(), textPaint, (int) Math.max(Math.ceil(bVar.width), 1.0d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false), f8, f9, textPaint, eVar, f10);
    }
}
