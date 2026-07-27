package l;

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

/* renamed from: l.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247t {

    /* renamed from: k, reason: collision with root package name */
    public static final RectF f10966k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f10967l = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f10968a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10969b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f10970c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f10971d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f10972e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f10973f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f10974g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f10975h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10976i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f10977j;

    static {
        new ConcurrentHashMap();
    }

    public C1247t(TextView textView) {
        this.f10976i = textView;
        this.f10977j = textView.getContext();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f10967l;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e3);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return obj2;
        }
    }

    public final void a() {
        if (this.f10968a != 0) {
            if (this.f10969b) {
                if (this.f10976i.getMeasuredHeight() <= 0 || this.f10976i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f10976i.isHorizontallyScrollable() : ((Boolean) e(this.f10976i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f10976i.getMeasuredWidth() - this.f10976i.getTotalPaddingLeft()) - this.f10976i.getTotalPaddingRight();
                int height = (this.f10976i.getHeight() - this.f10976i.getCompoundPaddingBottom()) - this.f10976i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f10966k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c2 = c(rectF);
                        if (c2 != this.f10976i.getTextSize()) {
                            f(0, c2);
                        }
                    } finally {
                    }
                }
            }
            this.f10969b = true;
        }
    }

    public final int c(RectF rectF) {
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        int length = this.f10973f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 1;
        int i6 = 0;
        while (i3 <= i2) {
            int i7 = (i3 + i2) / 2;
            int i8 = this.f10973f[i7];
            TextView textView = this.f10976i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int i9 = Build.VERSION.SDK_INT;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f10975h;
            if (textPaint == null) {
                this.f10975h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f10975h.set(textView.getPaint());
            this.f10975h.setTextSize(i8);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f10975h, Math.round(rectF.right));
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
                i6 = i3;
                i3 = i10;
            } else {
                i6 = i7 - 1;
                i2 = i6;
            }
        }
        return this.f10973f[i6];
    }

    public final void f(int i2, float f3) {
        Context context = this.f10977j;
        float applyDimension = TypedValue.applyDimension(i2, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f10976i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f10969b = false;
                try {
                    Method d6 = d("nullLayouts");
                    if (d6 != null) {
                        d6.invoke(textView, null);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
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
        if (this.f10968a == 1) {
            if (!this.f10974g || this.f10973f.length == 0) {
                int floor = ((int) Math.floor((this.f10972e - this.f10971d) / this.f10970c)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f10970c) + this.f10971d);
                }
                this.f10973f = b(iArr);
            }
            this.f10969b = true;
        } else {
            this.f10969b = false;
        }
        return this.f10969b;
    }

    public final boolean h() {
        boolean z = this.f10973f.length > 0;
        this.f10974g = z;
        if (z) {
            this.f10968a = 1;
            this.f10971d = r0[0];
            this.f10972e = r0[r1 - 1];
            this.f10970c = -1.0f;
        }
        return z;
    }

    public final void i(float f3, float f6, float f7) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f6 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f6 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f7 + "px) is less or equal to (0px)");
        }
        this.f10968a = 1;
        this.f10971d = f3;
        this.f10972e = f6;
        this.f10970c = f7;
        this.f10974g = false;
    }
}
