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

/* renamed from: k.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466z {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f5144l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f5145m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f5146a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5147b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f5148c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f5149d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f5150e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f5151f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f5152g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f5153h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f5154i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f5155j;

    /* renamed from: k, reason: collision with root package name */
    public final C0463w f5156k;

    static {
        new ConcurrentHashMap();
    }

    public C0466z(TextView textView) {
        this.f5154i = textView;
        this.f5155j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5156k = new C0464x();
        } else {
            this.f5156k = new C0463w();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr) {
                if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                    arrayList.add(Integer.valueOf(i7));
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
            ConcurrentHashMap concurrentHashMap = f5145m;
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

    public static Object e(TextView textView, String str, Object obj) {
        try {
            return d(str).invoke(textView, null);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return obj;
        }
    }

    public final void a() {
        if (this.f5146a != 0) {
            if (this.f5147b) {
                if (this.f5154i.getMeasuredHeight() <= 0 || this.f5154i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f5156k.a(this.f5154i) ? 1048576 : (this.f5154i.getMeasuredWidth() - this.f5154i.getTotalPaddingLeft()) - this.f5154i.getTotalPaddingRight();
                int height = (this.f5154i.getHeight() - this.f5154i.getCompoundPaddingBottom()) - this.f5154i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f5144l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c7 = c(rectF);
                        if (c7 != this.f5154i.getTextSize()) {
                            f(0, c7);
                        }
                    } finally {
                    }
                }
            }
            this.f5147b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f5151f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = length - 1;
        int i8 = 1;
        int i9 = 0;
        while (i8 <= i7) {
            int i10 = (i8 + i7) / 2;
            int i11 = this.f5151f[i10];
            TextView textView = this.f5154i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f5153h;
            if (textPaint == null) {
                this.f5153h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f5153h.set(textView.getPaint());
            this.f5153h.setTextSize(i11);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f5153h, Math.round(rectF.right));
            obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            try {
                this.f5156k.b(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            StaticLayout build = obtain.build();
            if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                int i12 = i10 + 1;
                i9 = i8;
                i8 = i12;
            } else {
                i9 = i10 - 1;
                i7 = i9;
            }
        }
        return this.f5151f[i9];
    }

    public final void f(int i7, float f7) {
        Context context = this.f5155j;
        float applyDimension = TypedValue.applyDimension(i7, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f5154i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f5147b = false;
                try {
                    Method d7 = d("nullLayouts");
                    if (d7 != null) {
                        d7.invoke(textView, null);
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

    public final boolean g() {
        if (this.f5146a == 1) {
            if (!this.f5152g || this.f5151f.length == 0) {
                int floor = ((int) Math.floor((this.f5150e - this.f5149d) / this.f5148c)) + 1;
                int[] iArr = new int[floor];
                for (int i7 = 0; i7 < floor; i7++) {
                    iArr[i7] = Math.round((i7 * this.f5148c) + this.f5149d);
                }
                this.f5151f = b(iArr);
            }
            this.f5147b = true;
        } else {
            this.f5147b = false;
        }
        return this.f5147b;
    }

    public final boolean h() {
        boolean z5 = this.f5151f.length > 0;
        this.f5152g = z5;
        if (z5) {
            this.f5146a = 1;
            this.f5149d = r0[0];
            this.f5150e = r0[r1 - 1];
            this.f5148c = -1.0f;
        }
        return z5;
    }

    public final void i(float f7, float f8, float f9) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f7 + "px) is less or equal to (0px)");
        }
        if (f8 <= f7) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f8 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        }
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f9 + "px) is less or equal to (0px)");
        }
        this.f5146a = 1;
        this.f5149d = f7;
        this.f5150e = f8;
        this.f5148c = f9;
        this.f5152g = false;
    }
}
