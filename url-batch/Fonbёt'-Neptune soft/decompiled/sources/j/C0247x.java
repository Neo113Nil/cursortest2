package j;

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

/* renamed from: j.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247x {

    /* renamed from: k, reason: collision with root package name */
    public static final RectF f3089k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f3090l = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f3091a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3092b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f3093c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f3094d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f3095e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3096f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f3097g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f3098h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f3099i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f3100j;

    static {
        new ConcurrentHashMap();
    }

    public C0247x(TextView textView) {
        this.f3099i = textView;
        this.f3100j = textView.getContext();
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
            ConcurrentHashMap concurrentHashMap = f3090l;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public final void a() {
        if (this.f3091a != 0) {
            if (this.f3092b) {
                if (this.f3099i.getMeasuredHeight() <= 0 || this.f3099i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f3099i.isHorizontallyScrollable() : ((Boolean) e(this.f3099i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f3099i.getMeasuredWidth() - this.f3099i.getTotalPaddingLeft()) - this.f3099i.getTotalPaddingRight();
                int height = (this.f3099i.getHeight() - this.f3099i.getCompoundPaddingBottom()) - this.f3099i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3089k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c2 = c(rectF);
                        if (c2 != this.f3099i.getTextSize()) {
                            f(0, c2);
                        }
                    } finally {
                    }
                }
            }
            this.f3092b = true;
        }
    }

    public final int c(RectF rectF) {
        int i2;
        int i3;
        StaticLayout staticLayout;
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        int breakStrategy;
        StaticLayout.Builder breakStrategy2;
        int hyphenationFrequency;
        StaticLayout.Builder hyphenationFrequency2;
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        int length = this.f3096f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i4 = length - 1;
        int i5 = 1;
        int i6 = 0;
        while (i5 <= i4) {
            int i7 = (i5 + i4) / 2;
            int i8 = this.f3096f[i7];
            TextView textView = this.f3099i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int i9 = Build.VERSION.SDK_INT;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f3098h;
            if (textPaint == null) {
                this.f3098h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f3098h.set(textView.getPaint());
            this.f3098h.setTextSize(i8);
            Layout.Alignment alignment2 = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int round = Math.round(rectF.right);
            if (i9 >= 23) {
                obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f3098h, round);
                alignment = obtain.setAlignment(alignment2);
                lineSpacing = alignment.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
                includePad = lineSpacing.setIncludePad(textView.getIncludeFontPadding());
                breakStrategy = textView.getBreakStrategy();
                breakStrategy2 = includePad.setBreakStrategy(breakStrategy);
                hyphenationFrequency = textView.getHyphenationFrequency();
                hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(hyphenationFrequency);
                hyphenationFrequency2.setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
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
                staticLayout = obtain.build();
                i3 = maxLines;
                i2 = -1;
            } else {
                i2 = -1;
                i3 = maxLines;
                staticLayout = new StaticLayout(text, this.f3098h, round, alignment2, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
            }
            if (i3 != i2) {
                if (staticLayout.getLineCount() <= i3) {
                    if (staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length()) {
                    }
                }
                i6 = i7 - 1;
                i4 = i6;
            }
            if (staticLayout.getHeight() > rectF.bottom) {
                i6 = i7 - 1;
                i4 = i6;
            } else {
                int i10 = i7 + 1;
                i6 = i5;
                i5 = i10;
            }
        }
        return this.f3096f[i6];
    }

    public final void f(int i2, float f2) {
        Context context = this.f3100j;
        float applyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f3099i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f3092b = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(textView, null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
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
        if (this.f3091a == 1) {
            if (!this.f3097g || this.f3096f.length == 0) {
                int floor = ((int) Math.floor((this.f3095e - this.f3094d) / this.f3093c)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f3093c) + this.f3094d);
                }
                this.f3096f = b(iArr);
            }
            this.f3092b = true;
        } else {
            this.f3092b = false;
        }
        return this.f3092b;
    }

    public final boolean h() {
        boolean z2 = this.f3096f.length > 0;
        this.f3097g = z2;
        if (z2) {
            this.f3091a = 1;
            this.f3094d = r0[0];
            this.f3095e = r0[r1 - 1];
            this.f3093c = -1.0f;
        }
        return z2;
    }

    public final void i(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f3091a = 1;
        this.f3094d = f2;
        this.f3095e = f3;
        this.f3093c = f4;
        this.f3097g = false;
    }
}
