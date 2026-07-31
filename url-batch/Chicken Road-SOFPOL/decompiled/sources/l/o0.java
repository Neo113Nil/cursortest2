package l;

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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f4362l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f4363m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f4364a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4365b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f4366c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f4367d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f4368e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f4369f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f4370g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f4371h;
    public final TextView i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f4372j;

    /* renamed from: k, reason: collision with root package name */
    public final l0 f4373k;

    public o0(TextView textView) {
        this.i = textView;
        this.f4372j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4373k = new m0();
        } else {
            this.f4373k = new l0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i8 = 0; i8 < size; i8++) {
                    iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f4363m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e8);
            return null;
        }
    }

    public static Object e(TextView textView, String str, Object obj) {
        try {
            return d(str).invoke(textView, null);
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e8);
            return obj;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f4365b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f4373k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f4362l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c8 = c(rectF);
                        if (c8 != this.i.getTextSize()) {
                            g(0, c8);
                        }
                    } finally {
                    }
                }
            }
            this.f4365b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f4369f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i8 = 0;
        int i9 = 1;
        while (i9 <= i) {
            int i10 = (i9 + i) / 2;
            int i11 = this.f4369f[i10];
            TextView textView = this.i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f4371h;
            if (textPaint == null) {
                this.f4371h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f4371h.set(textView.getPaint());
            this.f4371h.setTextSize(i11);
            StaticLayout a8 = k0.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, textView, this.f4371h, this.f4373k);
            if ((maxLines == -1 || (a8.getLineCount() <= maxLines && a8.getLineEnd(a8.getLineCount() - 1) == text.length())) && a8.getHeight() <= rectF.bottom) {
                int i12 = i10 + 1;
                i8 = i9;
                i9 = i12;
            } else {
                i8 = i10 - 1;
                i = i8;
            }
        }
        return this.f4369f[i8];
    }

    public final boolean f() {
        return j() && this.f4364a != 0;
    }

    public final void g(int i, float f6) {
        Context context = this.f4372j;
        float applyDimension = TypedValue.applyDimension(i, f6, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f4365b = false;
                try {
                    Method d8 = d("nullLayouts");
                    if (d8 != null) {
                        d8.invoke(textView, null);
                    }
                } catch (Exception e8) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e8);
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
        if (j() && this.f4364a == 1) {
            if (!this.f4370g || this.f4369f.length == 0) {
                int floor = ((int) Math.floor((this.f4368e - this.f4367d) / this.f4366c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f4366c) + this.f4367d);
                }
                this.f4369f = b(iArr);
            }
            this.f4365b = true;
        } else {
            this.f4365b = false;
        }
        return this.f4365b;
    }

    public final boolean i() {
        boolean z3 = this.f4369f.length > 0;
        this.f4370g = z3;
        if (z3) {
            this.f4364a = 1;
            this.f4367d = r0[0];
            this.f4368e = r0[r1 - 1];
            this.f4366c = -1.0f;
        }
        return z3;
    }

    public final boolean j() {
        return !(this.i instanceof u);
    }

    public final void k(float f6, float f8, float f9) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        }
        if (f8 <= f6) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f8 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        }
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f9 + "px) is less or equal to (0px)");
        }
        this.f4364a = 1;
        this.f4367d = f6;
        this.f4368e = f8;
        this.f4366c = f9;
        this.f4370g = false;
    }
}
