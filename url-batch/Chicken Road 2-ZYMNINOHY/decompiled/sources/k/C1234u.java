package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: k.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1234u {

    /* renamed from: k, reason: collision with root package name */
    public static final RectF f14108k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f14109l = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f14110a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14111b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f14112c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f14113d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f14114e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f14115f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f14116g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f14117h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f14118i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f14119j;

    static {
        new ConcurrentHashMap();
    }

    public C1234u(TextView textView) {
        this.f14118i = textView;
        this.f14119j = textView.getContext();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i4 : iArr) {
                if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i5 = 0; i5 < size; i5++) {
                    iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f14109l;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return obj2;
        }
    }

    public final void a() {
        if (this.f14110a != 0) {
            if (this.f14111b) {
                if (this.f14118i.getMeasuredHeight() <= 0 || this.f14118i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f14118i.isHorizontallyScrollable() : ((Boolean) e(this.f14118i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f14118i.getMeasuredWidth() - this.f14118i.getTotalPaddingLeft()) - this.f14118i.getTotalPaddingRight();
                int height = (this.f14118i.getHeight() - this.f14118i.getCompoundPaddingBottom()) - this.f14118i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f14108k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c4 = c(rectF);
                        if (c4 != this.f14118i.getTextSize()) {
                            f(c4, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f14111b = true;
        }
    }

    public final int c(RectF rectF) {
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        int length = this.f14115f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i4 = length - 1;
        int i5 = 1;
        int i6 = 0;
        while (i5 <= i4) {
            int i7 = (i5 + i4) / 2;
            int i8 = this.f14115f[i7];
            TextView textView = this.f14118i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int i9 = Build.VERSION.SDK_INT;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f14117h;
            if (textPaint == null) {
                this.f14117h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f14117h.set(textView.getPaint());
            this.f14117h.setTextSize(i8);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f14117h, Math.round(rectF.right));
            obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            if (i9 >= 29) {
                try {
                    textDirectionHeuristic = textView.getTextDirectionHeuristic();
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
            } else {
                textDirectionHeuristic = (TextDirectionHeuristic) e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            obtain.setTextDirection(textDirectionHeuristic);
            StaticLayout build = obtain.build();
            if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                int i10 = i7 + 1;
                i6 = i5;
                i5 = i10;
            } else {
                i6 = i7 - 1;
                i4 = i6;
            }
        }
        return this.f14115f[i6];
    }

    public final void f(float f4, int i4) {
        Context context = this.f14119j;
        float applyDimension = TypedValue.applyDimension(i4, f4, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f14118i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f14111b = false;
                try {
                    Method d4 = d("nullLayouts");
                    if (d4 != null) {
                        d4.invoke(textView, null);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (this.f14110a == 1) {
            if (!this.f14116g || this.f14115f.length == 0) {
                int floor = ((int) Math.floor((this.f14114e - this.f14113d) / this.f14112c)) + 1;
                int[] iArr = new int[floor];
                for (int i4 = 0; i4 < floor; i4++) {
                    iArr[i4] = Math.round((i4 * this.f14112c) + this.f14113d);
                }
                this.f14115f = b(iArr);
            }
            this.f14111b = true;
        } else {
            this.f14111b = false;
        }
        return this.f14111b;
    }

    public final boolean h() {
        boolean z = this.f14115f.length > 0;
        this.f14116g = z;
        if (z) {
            this.f14110a = 1;
            this.f14113d = r0[0];
            this.f14114e = r0[r1 - 1];
            this.f14112c = -1.0f;
        }
        return z;
    }

    public final void i(float f4, float f5, float f6) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
        }
        if (f5 <= f4) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        }
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
        this.f14110a = 1;
        this.f14113d = f4;
        this.f14114e = f5;
        this.f14112c = f6;
        this.f14116g = false;
    }
}
