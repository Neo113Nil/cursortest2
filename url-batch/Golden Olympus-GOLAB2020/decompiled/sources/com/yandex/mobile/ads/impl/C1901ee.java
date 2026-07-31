package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
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
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.yandex.mobile.ads.impl.ee, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1901ee {

    /* renamed from: j, reason: collision with root package name */
    private static final RectF f25249j = new RectF();

    /* renamed from: k, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f25250k = new ConcurrentHashMap<>();

    /* renamed from: l, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f25251l = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private int f25252a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25253b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f25254c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f25255d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int[] f25256e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private TextPaint f25257f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final TextView f25258g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f25259h;

    /* renamed from: i, reason: collision with root package name */
    private final c f25260i;

    /* renamed from: com.yandex.mobile.ads.impl.ee$a */
    private static class a extends c {
        a() {
        }

        @Override // com.yandex.mobile.ads.impl.C1901ee.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C1901ee.a((Object) textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ee$b */
    private static class b extends a {
        b() {
        }

        @Override // com.yandex.mobile.ads.impl.C1901ee.a, com.yandex.mobile.ads.impl.C1901ee.c
        final void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // com.yandex.mobile.ads.impl.C1901ee.c
        final boolean a(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ee$c */
    private static class c {
        c() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean a(TextView textView) {
            return ((Boolean) C1901ee.a((Object) textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C1901ee(@NonNull TextView textView) {
        this.f25258g = textView;
        this.f25259h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f25260i = new b();
        } else {
            this.f25260i = new a();
        }
    }

    private static Object a(@NonNull TextView textView, @NonNull String str, @NonNull Object obj) {
        try {
            Field a4 = a(str);
            return a4 == null ? obj : a4.get(textView);
        } catch (IllegalAccessException e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e4);
            return obj;
        }
    }

    public final boolean b() {
        return ((this.f25258g instanceof EditText) || this.f25252a == 0) ? false : true;
    }

    private static Method b(@NonNull String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f25250k;
            Method method = concurrentHashMap.get(str);
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

    public final void a() {
        if (b()) {
            if (this.f25253b) {
                if (this.f25258g.getMeasuredHeight() <= 0 || this.f25258g.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f25260i.a(this.f25258g) ? 1048576 : (this.f25258g.getMeasuredWidth() - this.f25258g.getTotalPaddingLeft()) - this.f25258g.getTotalPaddingRight();
                int height = (this.f25258g.getHeight() - this.f25258g.getCompoundPaddingBottom()) - this.f25258g.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f25249j;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float a4 = a(rectF);
                        if (a4 != this.f25258g.getTextSize()) {
                            a(0, a4);
                        }
                    } finally {
                    }
                }
            }
            this.f25253b = true;
        }
    }

    private int a(RectF rectF) {
        CharSequence transformation;
        int length = this.f25256e.length;
        if (length != 0) {
            int i4 = length - 1;
            int i5 = 1;
            int i6 = 0;
            while (i5 <= i4) {
                int i7 = (i5 + i4) / 2;
                int i8 = this.f25256e[i7];
                CharSequence text = this.f25258g.getText();
                TransformationMethod transformationMethod = this.f25258g.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f25258g)) != null) {
                    text = transformation;
                }
                int maxLines = this.f25258g.getMaxLines();
                TextPaint textPaint = this.f25257f;
                if (textPaint == null) {
                    this.f25257f = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f25257f.set(this.f25258g.getPaint());
                this.f25257f.setTextSize(i8);
                Layout.Alignment alignment = (Layout.Alignment) a((Object) this.f25258g, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f25257f, Math.round(rectF.right));
                obtain.setAlignment(alignment).setLineSpacing(this.f25258g.getLineSpacingExtra(), this.f25258g.getLineSpacingMultiplier()).setIncludePad(this.f25258g.getIncludeFontPadding()).setBreakStrategy(this.f25258g.getBreakStrategy()).setHyphenationFrequency(this.f25258g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.f25260i.a(obtain, this.f25258g);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                    int i9 = i7 + 1;
                    i6 = i5;
                    i5 = i9;
                } else {
                    i6 = i7 - 1;
                    i4 = i6;
                }
            }
            return this.f25256e[i6];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    static <T> T a(@NonNull Object obj, @NonNull String str, @NonNull T t4) {
        try {
            return (T) b(str).invoke(obj, null);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return t4;
        }
    }

    public final void a(int i4) {
        if (this.f25258g instanceof EditText) {
            return;
        }
        if (i4 == 0) {
            this.f25252a = 0;
            this.f25255d = -1.0f;
            this.f25254c = -1.0f;
            this.f25256e = new int[0];
            this.f25253b = false;
            return;
        }
        if (i4 == 1) {
            DisplayMetrics displayMetrics = this.f25259h.getResources().getDisplayMetrics();
            float applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
            float applyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
            if (applyDimension <= 0.0f) {
                throw new IllegalArgumentException("Minimum auto-size text size (" + applyDimension + "px) is less or equal to (0px)");
            }
            if (applyDimension2 > applyDimension) {
                this.f25252a = 1;
                this.f25255d = applyDimension;
                this.f25254c = 1.0f;
                if (!(this.f25258g instanceof EditText)) {
                    int floor = ((int) Math.floor((applyDimension2 - applyDimension) / 1.0f)) + 1;
                    int[] iArr = new int[floor];
                    for (int i5 = 0; i5 < floor; i5++) {
                        iArr[i5] = Math.round((i5 * this.f25254c) + this.f25255d);
                    }
                    if (floor != 0) {
                        Arrays.sort(iArr);
                        ArrayList arrayList = new ArrayList();
                        for (int i6 = 0; i6 < floor; i6++) {
                            int i7 = iArr[i6];
                            if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                                arrayList.add(Integer.valueOf(i7));
                            }
                        }
                        if (floor != arrayList.size()) {
                            int size = arrayList.size();
                            iArr = new int[size];
                            for (int i8 = 0; i8 < size; i8++) {
                                iArr[i8] = ((Integer) arrayList.get(i8)).intValue();
                            }
                        }
                    }
                    this.f25256e = iArr;
                    this.f25253b = true;
                } else {
                    this.f25253b = false;
                }
                if (this.f25253b) {
                    a();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + applyDimension2 + "px) is less or equal to minimum auto-size text size (" + applyDimension + "px)");
        }
        throw new IllegalArgumentException(C1877de.a("Unknown auto-size text type: ", i4));
    }

    public final void a(int i4, float f4) {
        Resources resources;
        Context context = this.f25259h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i4, f4, resources.getDisplayMetrics());
        if (applyDimension != this.f25258g.getPaint().getTextSize()) {
            this.f25258g.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f25258g.isInLayout();
            if (this.f25258g.getLayout() != null) {
                this.f25253b = false;
                try {
                    Method b4 = b("nullLayouts");
                    if (b4 != null) {
                        b4.invoke(this.f25258g, null);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (!isInLayout) {
                    this.f25258g.requestLayout();
                } else {
                    this.f25258g.forceLayout();
                }
                this.f25258g.invalidate();
            }
        }
    }

    private static Field a(@NonNull String str) {
        try {
            ConcurrentHashMap<String, Field> concurrentHashMap = f25251l;
            Field field = concurrentHashMap.get(str);
            if (field != null || (field = TextView.class.getDeclaredField(str)) == null) {
                return field;
            }
            field.setAccessible(true);
            concurrentHashMap.put(str, field);
            return field;
        } catch (NoSuchFieldException e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e4);
            return null;
        }
    }
}
