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
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235g0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f3389l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f3390m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f3391a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3392b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f3393c = -1.0f;
    public float d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f3394e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3395f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f3396g = false;
    public TextPaint h;
    public final TextView i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f3397j;

    /* renamed from: k, reason: collision with root package name */
    public final C0227c0 f3398k;

    public C0235g0(TextView textView) {
        this.i = textView;
        this.f3397j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3398k = new C0231e0();
        } else {
            this.f3398k = new C0227c0();
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
            ConcurrentHashMap concurrentHashMap = f3390m;
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
            if (this.f3392b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f3398k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3389l;
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
            this.f3392b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f3395f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= i) {
            int i4 = (i3 + i) / 2;
            int i5 = this.f3395f[i4];
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
            StaticLayout a2 = AbstractC0225b0.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.i, this.h, this.f3398k);
            if ((maxLines == -1 || (a2.getLineCount() <= maxLines && a2.getLineEnd(a2.getLineCount() - 1) == text.length())) && a2.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
        return this.f3395f[i2];
    }

    public final boolean f() {
        return j() && this.f3391a != 0;
    }

    public final void g(int i, float f2) {
        Context context = this.f3397j;
        float applyDimension = TypedValue.applyDimension(i, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f3392b = false;
                try {
                    Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke(textView, null);
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
        if (j() && this.f3391a == 1) {
            if (!this.f3396g || this.f3395f.length == 0) {
                int floor = ((int) Math.floor((this.f3394e - this.d) / this.f3393c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f3393c) + this.d);
                }
                this.f3395f = b(iArr);
            }
            this.f3392b = true;
        } else {
            this.f3392b = false;
        }
        return this.f3392b;
    }

    public final boolean i() {
        boolean z2 = this.f3395f.length > 0;
        this.f3396g = z2;
        if (z2) {
            this.f3391a = 1;
            this.d = r0[0];
            this.f3394e = r0[r1 - 1];
            this.f3393c = -1.0f;
        }
        return z2;
    }

    public final boolean j() {
        return !(this.i instanceof C0264v);
    }

    public final void k(float f2, float f3, float f4) {
        if (f2 <= RecyclerView.f1937A0) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= RecyclerView.f1937A0) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f3391a = 1;
        this.d = f2;
        this.f3394e = f3;
        this.f3393c = f4;
        this.f3396g = false;
    }
}
