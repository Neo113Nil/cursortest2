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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f2326l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f2327m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f2328a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2329b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f2330c = -1.0f;
    public float d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f2331e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2332f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f2333g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f2334h;
    public final TextView i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f2335j;

    /* renamed from: k, reason: collision with root package name */
    public final e1 f2336k;

    public h1(TextView textView) {
        this.i = textView;
        this.f2335j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2336k = new f1();
        } else {
            this.f2336k = new e1();
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
                for (int i4 = 0; i4 < size; i4++) {
                    iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f2327m;
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
            if (this.f2329b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2336k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2326l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c4 = c(rectF);
                        if (c4 != this.i.getTextSize()) {
                            g(0, c4);
                        }
                    } finally {
                    }
                }
            }
            this.f2329b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f2332f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i4 = 0;
        int i5 = 1;
        while (i5 <= i) {
            int i6 = (i5 + i) / 2;
            int i7 = this.f2332f[i6];
            TextView textView = this.i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f2334h;
            if (textPaint == null) {
                this.f2334h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f2334h.set(textView.getPaint());
            this.f2334h.setTextSize(i7);
            StaticLayout a2 = d1.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.i, this.f2334h, this.f2336k);
            if ((maxLines == -1 || (a2.getLineCount() <= maxLines && a2.getLineEnd(a2.getLineCount() - 1) == charSequence.length())) && a2.getHeight() <= rectF.bottom) {
                int i8 = i6 + 1;
                i4 = i5;
                i5 = i8;
            } else {
                i4 = i6 - 1;
                i = i4;
            }
        }
        return this.f2332f[i4];
    }

    public final boolean f() {
        return j() && this.f2328a != 0;
    }

    public final void g(int i, float f2) {
        Context context = this.f2335j;
        float applyDimension = TypedValue.applyDimension(i, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f2329b = false;
                try {
                    Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke(textView, null);
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
        if (j() && this.f2328a == 1) {
            if (!this.f2333g || this.f2332f.length == 0) {
                int floor = ((int) Math.floor((this.f2331e - this.d) / this.f2330c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f2330c) + this.d);
                }
                this.f2332f = b(iArr);
            }
            this.f2329b = true;
        } else {
            this.f2329b = false;
        }
        return this.f2329b;
    }

    public final boolean i() {
        boolean z3 = this.f2332f.length > 0;
        this.f2333g = z3;
        if (z3) {
            this.f2328a = 1;
            this.d = r0[0];
            this.f2331e = r0[r1 - 1];
            this.f2330c = -1.0f;
        }
        return z3;
    }

    public final boolean j() {
        return !(this.i instanceof w);
    }

    public final void k(float f2, float f4, float f5) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f4 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
        }
        this.f2328a = 1;
        this.d = f2;
        this.f2331e = f4;
        this.f2330c = f5;
        this.f2333g = false;
    }
}
