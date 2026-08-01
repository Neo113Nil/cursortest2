package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f2528l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f2529m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f2530a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2531b = false;
    public float c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f2532d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f2533e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2534f = new int[0];
    public boolean g = false;
    public TextPaint h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f2535i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f2536j;

    /* renamed from: k, reason: collision with root package name */
    public final b1 f2537k;

    public e1(TextView textView) {
        this.f2535i = textView;
        this.f2536j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2537k = new c1();
        } else {
            this.f2537k = new b1();
        }
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
            ConcurrentHashMap concurrentHashMap = f2529m;
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
        if (f()) {
            if (this.f2531b) {
                if (this.f2535i.getMeasuredHeight() <= 0 || this.f2535i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2537k.b(this.f2535i) ? 1048576 : (this.f2535i.getMeasuredWidth() - this.f2535i.getTotalPaddingLeft()) - this.f2535i.getTotalPaddingRight();
                int height = (this.f2535i.getHeight() - this.f2535i.getCompoundPaddingBottom()) - this.f2535i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2528l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c = c(rectF);
                        if (c != this.f2535i.getTextSize()) {
                            g(0, c);
                        }
                    } finally {
                    }
                }
            }
            this.f2531b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f2534f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i4 = length - 1;
        int i5 = 0;
        int i6 = 1;
        while (i6 <= i4) {
            int i7 = (i6 + i4) / 2;
            int i8 = this.f2534f[i7];
            TextView textView = this.f2535i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.h;
            if (textPaint == null) {
                this.h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.h.set(textView.getPaint());
            this.h.setTextSize(i8);
            StaticLayout a4 = a1.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f2535i, this.h, this.f2537k);
            if ((maxLines == -1 || (a4.getLineCount() <= maxLines && a4.getLineEnd(a4.getLineCount() - 1) == charSequence.length())) && a4.getHeight() <= rectF.bottom) {
                int i9 = i7 + 1;
                i5 = i6;
                i6 = i9;
            } else {
                i5 = i7 - 1;
                i4 = i5;
            }
        }
        return this.f2534f[i5];
    }

    public final boolean f() {
        return j() && this.f2530a != 0;
    }

    public final void g(int i4, float f4) {
        Context context = this.f2536j;
        float applyDimension = TypedValue.applyDimension(i4, f4, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f2535i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f2531b = false;
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

    public final boolean h() {
        if (j() && this.f2530a == 1) {
            if (!this.g || this.f2534f.length == 0) {
                int floor = ((int) Math.floor((this.f2533e - this.f2532d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i4 = 0; i4 < floor; i4++) {
                    iArr[i4] = Math.round((i4 * this.c) + this.f2532d);
                }
                this.f2534f = b(iArr);
            }
            this.f2531b = true;
        } else {
            this.f2531b = false;
        }
        return this.f2531b;
    }

    public final boolean i() {
        boolean z3 = this.f2534f.length > 0;
        this.g = z3;
        if (z3) {
            this.f2530a = 1;
            this.f2532d = r0[0];
            this.f2533e = r0[r1 - 1];
            this.c = -1.0f;
        }
        return z3;
    }

    public final boolean j() {
        return !(this.f2535i instanceof u);
    }

    public final void k(float f4, float f5, float f6) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
        }
        if (f5 <= f4) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        }
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
        this.f2530a = 1;
        this.f2532d = f4;
        this.f2533e = f5;
        this.c = f6;
        this.g = false;
    }
}
