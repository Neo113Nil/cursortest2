package m;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f6085l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f6086m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f6087a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6088b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f6089c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f6090d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f6091e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f6092f = new int[0];
    public boolean g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f6093h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f6094i;
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f6095k;

    public h0(TextView textView) {
        this.f6094i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6095k = new f0();
        } else {
            this.f6095k = new e0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i3 : iArr) {
                if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f6086m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public final void a() {
        if (this.f6087a != 0) {
            if (this.f6088b) {
                if (this.f6094i.getMeasuredHeight() <= 0 || this.f6094i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f6095k.b(this.f6094i) ? 1048576 : (this.f6094i.getMeasuredWidth() - this.f6094i.getTotalPaddingLeft()) - this.f6094i.getTotalPaddingRight();
                int height = (this.f6094i.getHeight() - this.f6094i.getCompoundPaddingBottom()) - this.f6094i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f6085l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c10 = c(rectF);
                        if (c10 != this.f6094i.getTextSize()) {
                            f(0, c10);
                        }
                    } finally {
                    }
                }
            }
            this.f6088b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f6092f.length;
        if (length == 0) {
            kotlin.collections.i0.l("No available text sizes to choose from.");
            return 0;
        }
        int i3 = length - 1;
        int i10 = 0;
        int i11 = 1;
        while (true) {
            int[] iArr = this.f6092f;
            if (i11 > i3) {
                return iArr[i10];
            }
            int i12 = (i11 + i3) / 2;
            int i13 = iArr[i12];
            TextView textView = this.f6094i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f6093h;
            if (textPaint == null) {
                this.f6093h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f6093h.set(textView.getPaint());
            this.f6093h.setTextSize(i13);
            StaticLayout a9 = d0.a(text, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, textView, this.f6093h, this.f6095k);
            if ((maxLines == -1 || (a9.getLineCount() <= maxLines && a9.getLineEnd(a9.getLineCount() - 1) == text.length())) && a9.getHeight() <= rectF.bottom) {
                int i14 = i12 + 1;
                i10 = i11;
                i11 = i14;
            } else {
                i10 = i12 - 1;
                i3 = i10;
            }
        }
    }

    public final void f(int i3, float f3) {
        Context context = this.j;
        float applyDimension = TypedValue.applyDimension(i3, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f6094i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f6088b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, null);
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
        if (this.f6087a == 1) {
            if (!this.g || this.f6092f.length == 0) {
                int floor = ((int) Math.floor((this.f6091e - this.f6090d) / this.f6089c)) + 1;
                int[] iArr = new int[floor];
                for (int i3 = 0; i3 < floor; i3++) {
                    iArr[i3] = Math.round((i3 * this.f6089c) + this.f6090d);
                }
                this.f6092f = b(iArr);
            }
            this.f6088b = true;
        } else {
            this.f6088b = false;
        }
        return this.f6088b;
    }

    public final boolean h() {
        boolean z10 = this.f6092f.length > 0;
        this.g = z10;
        if (z10) {
            this.f6087a = 1;
            this.f6090d = r0[0];
            this.f6091e = r0[r1 - 1];
            this.f6089c = -1.0f;
        }
        return z10;
    }

    public final void i(float f3, float f10, float f11) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f10 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        }
        this.f6087a = 1;
        this.f6090d = f3;
        this.f6091e = f10;
        this.f6089c = f11;
        this.g = false;
    }
}
