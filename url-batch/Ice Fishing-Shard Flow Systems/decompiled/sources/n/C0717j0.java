package n;

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

/* renamed from: n.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717j0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f6816l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f6817m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f6818a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6819b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f6820c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f6821d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f6822e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f6823f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f6824g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f6825h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f6826i;
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public final C0711g0 f6827k;

    static {
        new ConcurrentHashMap();
    }

    public C0717j0(TextView textView) {
        this.f6826i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6827k = new C0713h0();
        } else {
            this.f6827k = new C0711g0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
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
            ConcurrentHashMap concurrentHashMap = f6817m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f6819b) {
                if (this.f6826i.getMeasuredHeight() <= 0 || this.f6826i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f6827k.b(this.f6826i) ? 1048576 : (this.f6826i.getMeasuredWidth() - this.f6826i.getTotalPaddingLeft()) - this.f6826i.getTotalPaddingRight();
                int height = (this.f6826i.getHeight() - this.f6826i.getCompoundPaddingBottom()) - this.f6826i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f6816l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c7 = c(rectF);
                        if (c7 != this.f6826i.getTextSize()) {
                            g(0, c7);
                        }
                    } finally {
                    }
                }
            }
            this.f6819b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f6823f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i5 = 0;
        int i7 = 1;
        while (i7 <= i2) {
            int i8 = (i7 + i2) / 2;
            int i9 = this.f6823f[i8];
            TextView textView = this.f6826i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int b7 = AbstractC0705d0.b(textView);
            TextPaint textPaint = this.f6825h;
            if (textPaint == null) {
                this.f6825h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f6825h.set(textView.getPaint());
            this.f6825h.setTextSize(i9);
            StaticLayout a7 = AbstractC0709f0.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b7, this.f6826i, this.f6825h, this.f6827k);
            if ((b7 == -1 || (a7.getLineCount() <= b7 && a7.getLineEnd(a7.getLineCount() - 1) == charSequence.length())) && a7.getHeight() <= rectF.bottom) {
                int i10 = i8 + 1;
                i5 = i7;
                i7 = i10;
            } else {
                i5 = i8 - 1;
                i2 = i5;
            }
        }
        return this.f6823f[i5];
    }

    public final boolean f() {
        return j() && this.f6818a != 0;
    }

    public final void g(int i2, float f7) {
        Context context = this.j;
        float applyDimension = TypedValue.applyDimension(i2, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f6826i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a7 = AbstractC0707e0.a(textView);
            if (textView.getLayout() != null) {
                this.f6819b = false;
                try {
                    Method d7 = d("nullLayouts");
                    if (d7 != null) {
                        d7.invoke(textView, null);
                    }
                } catch (Exception e7) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (a7) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f6818a == 1) {
            if (!this.f6824g || this.f6823f.length == 0) {
                int floor = ((int) Math.floor((this.f6822e - this.f6821d) / this.f6820c)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f6820c) + this.f6821d);
                }
                this.f6823f = b(iArr);
            }
            this.f6819b = true;
        } else {
            this.f6819b = false;
        }
        return this.f6819b;
    }

    public final boolean i() {
        boolean z7 = this.f6823f.length > 0;
        this.f6824g = z7;
        if (z7) {
            this.f6818a = 1;
            this.f6821d = r0[0];
            this.f6822e = r0[r1 - 1];
            this.f6820c = -1.0f;
        }
        return z7;
    }

    public final boolean j() {
        return !(this.f6826i instanceof C0737u);
    }

    public final void k(float f7, float f8, float f9) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f7 + "px) is less or equal to (0px)");
        }
        if (f8 <= f7) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f8 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        }
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f9 + "px) is less or equal to (0px)");
        }
        this.f6818a = 1;
        this.f6821d = f7;
        this.f6822e = f8;
        this.f6820c = f9;
        this.f6824g = false;
    }
}
