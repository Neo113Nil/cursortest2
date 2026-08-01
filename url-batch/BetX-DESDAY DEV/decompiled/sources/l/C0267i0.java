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

/* renamed from: l.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267i0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f3371l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f3372m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f3373a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3374b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f3375c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f3376d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f3377e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3378f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f3379g = false;
    public TextPaint h;
    public final TextView i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f3380j;

    /* renamed from: k, reason: collision with root package name */
    public final C0261f0 f3381k;

    public C0267i0(TextView textView) {
        this.i = textView;
        this.f3380j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3381k = new C0263g0();
        } else {
            this.f3381k = new C0261f0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f3372m;
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
        if (f()) {
            if (this.f3374b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f3381k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3371l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c2 = c(rectF);
                        if (c2 != this.i.getTextSize()) {
                            g(0, c2);
                        }
                    } finally {
                    }
                }
            }
            this.f3374b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f3378f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= i) {
            int i4 = (i3 + i) / 2;
            int i5 = this.f3378f[i4];
            TextView textView = this.i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.h;
            if (textPaint == null) {
                this.h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.h.set(textView.getPaint());
            this.h.setTextSize(i5);
            StaticLayout a2 = AbstractC0259e0.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.i, this.h, this.f3381k);
            if ((maxLines == -1 || (a2.getLineCount() <= maxLines && a2.getLineEnd(a2.getLineCount() - 1) == text.length())) && a2.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
        return this.f3378f[i2];
    }

    public final boolean f() {
        return j() && this.f3373a != 0;
    }

    public final void g(int i, float f2) {
        Context context = this.f3380j;
        float applyDimension = TypedValue.applyDimension(i, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f3374b = false;
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

    public final boolean h() {
        if (j() && this.f3373a == 1) {
            if (!this.f3379g || this.f3378f.length == 0) {
                int floor = ((int) Math.floor((this.f3377e - this.f3376d) / this.f3375c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f3375c) + this.f3376d);
                }
                this.f3378f = b(iArr);
            }
            this.f3374b = true;
        } else {
            this.f3374b = false;
        }
        return this.f3374b;
    }

    public final boolean i() {
        boolean z2 = this.f3378f.length > 0;
        this.f3379g = z2;
        if (z2) {
            this.f3373a = 1;
            this.f3376d = r0[0];
            this.f3377e = r0[r1 - 1];
            this.f3375c = -1.0f;
        }
        return z2;
    }

    public final boolean j() {
        return !(this.i instanceof C0296x);
    }

    public final void k(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f3373a = 1;
        this.f3376d = f2;
        this.f3377e = f3;
        this.f3375c = f4;
        this.f3379g = false;
    }
}
