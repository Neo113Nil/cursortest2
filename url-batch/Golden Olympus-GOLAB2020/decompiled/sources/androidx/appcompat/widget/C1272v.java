package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.AbstractC1281a0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1272v {

    /* renamed from: l, reason: collision with root package name */
    private static final RectF f10974l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f10975m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private int f10976a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10977b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f10978c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f10979d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f10980e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f10981f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f10982g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f10983h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f10984i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f10985j;

    /* renamed from: k, reason: collision with root package name */
    private final d f10986k;

    /* renamed from: androidx.appcompat.widget.v$a */
    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i4, int i5, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i4);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i5 == -1) {
                i5 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i5);
            try {
                dVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: androidx.appcompat.widget.v$b */
    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.C1272v.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C1272v.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.v$c */
    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.C1272v.b, androidx.appcompat.widget.C1272v.d
        void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.C1272v.d
        boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* renamed from: androidx.appcompat.widget.v$d */
    private static class d {
        d() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        boolean b(TextView textView) {
            return ((Boolean) C1272v.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C1272v(TextView textView) {
        this.f10984i = textView;
        this.f10985j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f10986k = new c();
        } else {
            this.f10986k = new b();
        }
    }

    private int[] b(int[] iArr) {
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

    private void c() {
        this.f10976a = 0;
        this.f10979d = -1.0f;
        this.f10980e = -1.0f;
        this.f10978c = -1.0f;
        this.f10981f = new int[0];
        this.f10977b = false;
    }

    private int e(RectF rectF) {
        int length = this.f10981f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i4 = 1;
        int i5 = length - 1;
        int i6 = 0;
        while (i4 <= i5) {
            int i7 = (i4 + i5) / 2;
            if (x(this.f10981f[i7], rectF)) {
                int i8 = i7 + 1;
                i6 = i4;
                i4 = i8;
            } else {
                i6 = i7 - 1;
                i5 = i6;
            }
        }
        return this.f10981f[i6];
    }

    private static Method k(String str) {
        try {
            Method method = (Method) f10975m.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            f10975m.put(str, method);
            return method;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return obj2;
        }
    }

    private void s(float f4) {
        if (f4 != this.f10984i.getPaint().getTextSize()) {
            this.f10984i.getPaint().setTextSize(f4);
            boolean isInLayout = this.f10984i.isInLayout();
            if (this.f10984i.getLayout() != null) {
                this.f10977b = false;
                try {
                    Method k4 = k("nullLayouts");
                    if (k4 != null) {
                        k4.invoke(this.f10984i, null);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (isInLayout) {
                    this.f10984i.forceLayout();
                } else {
                    this.f10984i.requestLayout();
                }
                this.f10984i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f10976a == 1) {
            if (!this.f10982g || this.f10981f.length == 0) {
                int floor = ((int) Math.floor((this.f10980e - this.f10979d) / this.f10978c)) + 1;
                int[] iArr = new int[floor];
                for (int i4 = 0; i4 < floor; i4++) {
                    iArr[i4] = Math.round(this.f10979d + (i4 * this.f10978c));
                }
                this.f10981f = b(iArr);
            }
            this.f10977b = true;
        } else {
            this.f10977b = false;
        }
        return this.f10977b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = typedArray.getDimensionPixelSize(i4, -1);
            }
            this.f10981f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z4 = this.f10981f.length > 0;
        this.f10982g = z4;
        if (z4) {
            this.f10976a = 1;
            this.f10979d = r0[0];
            this.f10980e = r0[r1 - 1];
            this.f10978c = -1.0f;
        }
        return z4;
    }

    private boolean x(int i4, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f10984i.getText();
        TransformationMethod transformationMethod = this.f10984i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f10984i)) != null) {
            text = transformation;
        }
        int maxLines = this.f10984i.getMaxLines();
        l(i4);
        StaticLayout d4 = d(text, (Layout.Alignment) m(this.f10984i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d4.getLineCount() <= maxLines && d4.getLineEnd(d4.getLineCount() - 1) == text.length())) && ((float) d4.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f10984i instanceof C1260i);
    }

    private void z(float f4, float f5, float f6) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
        }
        if (f5 <= f4) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        }
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
        this.f10976a = 1;
        this.f10979d = f4;
        this.f10980e = f5;
        this.f10978c = f6;
        this.f10982g = false;
    }

    void a() {
        if (n()) {
            if (this.f10977b) {
                if (this.f10984i.getMeasuredHeight() <= 0 || this.f10984i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f10986k.b(this.f10984i) ? 1048576 : (this.f10984i.getMeasuredWidth() - this.f10984i.getTotalPaddingLeft()) - this.f10984i.getTotalPaddingRight();
                int height = (this.f10984i.getHeight() - this.f10984i.getCompoundPaddingBottom()) - this.f10984i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f10974l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float e4 = e(rectF);
                        if (e4 != this.f10984i.getTextSize()) {
                            t(0, e4);
                        }
                    } finally {
                    }
                }
            }
            this.f10977b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i4, int i5) {
        return a.a(charSequence, alignment, i4, i5, this.f10984i, this.f10983h, this.f10986k);
    }

    int f() {
        return Math.round(this.f10980e);
    }

    int g() {
        return Math.round(this.f10979d);
    }

    int h() {
        return Math.round(this.f10978c);
    }

    int[] i() {
        return this.f10981f;
    }

    int j() {
        return this.f10976a;
    }

    void l(int i4) {
        TextPaint textPaint = this.f10983h;
        if (textPaint == null) {
            this.f10983h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f10983h.set(this.f10984i.getPaint());
        this.f10983h.setTextSize(i4);
    }

    boolean n() {
        return y() && this.f10976a != 0;
    }

    void o(AttributeSet attributeSet, int i4) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f10985j.obtainStyledAttributes(attributeSet, e.j.f36501g0, i4, 0);
        TextView textView = this.f10984i;
        AbstractC1281a0.m0(textView, textView.getContext(), e.j.f36501g0, attributeSet, obtainStyledAttributes, i4, 0);
        if (obtainStyledAttributes.hasValue(e.j.f36526l0)) {
            this.f10976a = obtainStyledAttributes.getInt(e.j.f36526l0, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(e.j.f36521k0) ? obtainStyledAttributes.getDimension(e.j.f36521k0, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(e.j.f36511i0) ? obtainStyledAttributes.getDimension(e.j.f36511i0, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(e.j.f36506h0) ? obtainStyledAttributes.getDimension(e.j.f36506h0, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(e.j.f36516j0) && (resourceId = obtainStyledAttributes.getResourceId(e.j.f36516j0, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f10976a = 0;
            return;
        }
        if (this.f10976a == 1) {
            if (!this.f10982g) {
                DisplayMetrics displayMetrics = this.f10985j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i4, int i5, int i6, int i7) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f10985j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i7, i4, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i4) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i4 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f10985j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                this.f10981f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f10982g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i4) {
        if (y()) {
            if (i4 == 0) {
                c();
                return;
            }
            if (i4 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i4);
            }
            DisplayMetrics displayMetrics = this.f10985j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i4, float f4) {
        Context context = this.f10985j;
        s(TypedValue.applyDimension(i4, f4, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
