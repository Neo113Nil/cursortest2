package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class it {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private md e;
    private md f;
    private md g;
    private md h;
    private md i;
    private md j;
    private final ix k;
    public int a = 0;
    private int l = -1;
    private String m = null;

    public it(TextView textView) {
        this.d = textView;
        this.k = new ix(textView);
    }

    public static void b(TextView textView, Typeface typeface, int i) {
        String fontVariationSettings;
        qs qsVar = ir.a;
        fontVariationSettings = textView.getFontVariationSettings();
        if (!TextUtils.isEmpty(fontVariationSettings)) {
            ir.b(textView, null);
        }
        textView.setTypeface(typeface, i);
        if (TextUtils.isEmpty(fontVariationSettings)) {
            return;
        }
        ir.b(textView, fontVariationSettings);
    }

    public static final void f(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        tw.F(text);
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i = editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelEnd : editorInfo.initialSelStart;
        int i2 = editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelStart : editorInfo.initialSelEnd;
        int length = text.length();
        if (i < 0 || i2 > length) {
            aat.a(editorInfo, null, 0, 0);
            return;
        }
        int i3 = editorInfo.inputType & 4095;
        if (i3 == 129 || i3 == 225 || i3 == 18) {
            aat.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            aat.a(editorInfo, text, i, i2);
            return;
        }
        int i4 = i2 - i;
        int length2 = text.length() - i2;
        int i5 = i4 > 1024 ? 0 : i4;
        int i6 = 2048 - i5;
        int min = Math.min(length2, i6 - Math.min(i, (int) (i6 * 0.8d)));
        int min2 = Math.min(i, i6 - min);
        int i7 = i - min2;
        if (aat.b(text, i7, 0)) {
            i7++;
            min2--;
        }
        if (aat.b(text, (i2 + min) - 1, 1)) {
            min--;
        }
        int i8 = min2 + i5;
        aat.a(editorInfo, i5 != i4 ? TextUtils.concat(text.subSequence(i7, i7 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i7, min + i8 + i7), min2, i8);
    }

    private static md g(Context context, hx hxVar, int i) {
        ColorStateList a = hxVar.a(context, i);
        if (a == null) {
            return null;
        }
        md mdVar = new md();
        mdVar.d = true;
        mdVar.a = a;
        return mdVar;
    }

    private final void h(Drawable drawable, md mdVar) {
        if (drawable == null || mdVar == null) {
            return;
        }
        ls.g(drawable, mdVar, this.d.getDrawableState());
    }

    private final void i(boolean z) {
        Typeface typeface = this.b;
        if (typeface != null) {
            int i = this.l;
            TextView textView = this.d;
            if (i == -1) {
                textView.setTypeface(typeface, this.a);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            this.d.setTypeface(null);
        }
        String str = this.m;
        if (str != null) {
            ir.b(this.d, str);
        }
    }

    private final boolean j(Context context, byo byoVar) {
        String m;
        Typeface create;
        Typeface create2;
        Typeface typeface;
        Typeface create3;
        Typeface typeface2;
        int[] iArr = em.a;
        this.a = byoVar.e(2, this.a);
        int e = byoVar.e(11, -1);
        this.l = e;
        if (e != -1) {
            this.a &= 2;
        }
        if (byoVar.p(13)) {
            this.m = byoVar.m(13);
        }
        if (!byoVar.p(10) && !byoVar.p(12)) {
            if (!byoVar.p(1)) {
                int i = this.l;
                if (i == -1 || (typeface = this.b) == null) {
                    return false;
                }
                create3 = Typeface.create(typeface, i, (2 & this.a) != 0);
                this.b = create3;
                return true;
            }
            this.c = false;
            int e2 = byoVar.e(1, 1);
            if (e2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else {
                if (e2 != 2) {
                    if (e2 == 3) {
                        typeface2 = Typeface.MONOSPACE;
                    }
                    return true;
                }
                typeface2 = Typeface.SERIF;
            }
            this.b = typeface2;
            return true;
        }
        Typeface typeface3 = null;
        this.b = null;
        int i2 = true == byoVar.p(12) ? 12 : 10;
        int i3 = this.l;
        int i4 = this.a;
        if (!context.isRestricted()) {
            ip ipVar = new ip(this, i3, i4, new WeakReference(this.d));
            try {
                int i5 = this.a;
                int resourceId = ((TypedArray) byoVar.a).getResourceId(i2, 0);
                if (resourceId != 0) {
                    if (byoVar.b == null) {
                        byoVar.b = new TypedValue();
                    }
                    Object obj = byoVar.c;
                    Object obj2 = byoVar.b;
                    ThreadLocal threadLocal = uy.a;
                    if (!((Context) obj).isRestricted()) {
                        typeface3 = uy.a((Context) obj, resourceId, (TypedValue) obj2, i5, ipVar, true, false);
                    }
                }
                if (typeface3 != null) {
                    if (this.l != -1) {
                        create2 = Typeface.create(Typeface.create(typeface3, 0), this.l, (this.a & 2) != 0);
                        this.b = create2;
                    } else {
                        this.b = typeface3;
                    }
                }
                this.c = this.b == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.b == null && (m = byoVar.m(i2)) != null) {
            if (this.l != -1) {
                create = Typeface.create(Typeface.create(m, 0), this.l, (2 & this.a) != 0);
                this.b = create;
            } else {
                this.b = Typeface.create(m, this.a);
            }
        }
        return true;
    }

    public final void a() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            h(compoundDrawables[0], this.e);
            h(compoundDrawables[1], this.f);
            h(compoundDrawables[2], this.g);
            h(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        h(compoundDrawablesRelative[0], this.i);
        h(compoundDrawablesRelative[2], this.j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x032d, code lost:
    
        if (r5 != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x037f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x037d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x037b, code lost:
    
        if (r5 != null) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        int i2;
        boolean z3;
        int d;
        int d2;
        float f;
        int i3;
        int autoSizeStepGranularity;
        int i4;
        int resourceId;
        LocaleList forLanguageTags;
        TextView textView = this.d;
        Context context = textView.getContext();
        hx d3 = hx.d();
        int[] iArr = em.h;
        byo u = byo.u(context, attributeSet, iArr, i, 0);
        yq.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) u.a, i, 0);
        int h = u.h(0, -1);
        if (u.p(3)) {
            this.e = g(context, d3, u.h(3, 0));
        }
        if (u.p(1)) {
            this.f = g(context, d3, u.h(1, 0));
        }
        if (u.p(4)) {
            this.g = g(context, d3, u.h(4, 0));
        }
        if (u.p(2)) {
            this.h = g(context, d3, u.h(2, 0));
        }
        if (u.p(5)) {
            this.i = g(context, d3, u.h(5, 0));
        }
        if (u.p(6)) {
            this.j = g(context, d3, u.h(6, 0));
        }
        u.n();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (h != -1) {
            byo s = byo.s(context, h, em.x);
            if (z4 || !s.p(14)) {
                z = false;
                z2 = false;
            } else {
                z = s.o(14, false);
                z2 = true;
            }
            j(context, s);
            str = s.p(15) ? s.m(15) : null;
            s.n();
        } else {
            z = false;
            z2 = false;
            str = null;
        }
        byo u2 = byo.u(context, attributeSet, em.x, i, 0);
        if (!z4 && u2.p(14)) {
            z = u2.o(14, false);
            z2 = true;
        }
        if (u2.p(15)) {
            str = u2.m(15);
        }
        if (u2.p(0) && u2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, u2);
        u2.n();
        if (!z4 && z2) {
            e(z);
        }
        i(false);
        if (str != null) {
            forLanguageTags = LocaleList.forLanguageTags(str);
            textView.setTextLocales(forLanguageTags);
        }
        ix ixVar = this.k;
        Context context2 = ixVar.h;
        int[] iArr2 = em.i;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        TextView textView2 = ixVar.g;
        yq.k(textView2, textView2.getContext(), iArr2, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            ixVar.a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) <= 0) {
            i2 = 0;
        } else {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            i2 = 0;
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr3[i5] = obtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                ixVar.e = ix.b(iArr3);
                boolean z5 = ixVar.e.length > 0;
                ixVar.f = z5;
                if (z5) {
                    ixVar.a = 1;
                    ixVar.c = r10[0];
                    ixVar.d = r10[r13 - 1];
                    ixVar.b = -1.0f;
                }
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!ixVar.a()) {
            ixVar.a = i2;
        } else if (ixVar.a == 1) {
            boolean z6 = ixVar.f;
            if (!z6) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                ixVar.a = 1;
                ixVar.c = dimension2;
                ixVar.d = dimension3;
                ixVar.b = dimension;
                ixVar.f = i2;
                z6 = false;
            }
            if (ixVar.a() && (!z6 || ixVar.e.length == 0)) {
                int floor = ((int) Math.floor((ixVar.d - ixVar.c) / ixVar.b)) + 1;
                int[] iArr4 = new int[floor];
                for (int i6 = 0; i6 < floor; i6++) {
                    iArr4[i6] = Math.round(ixVar.c + (i6 * ixVar.b));
                }
                ixVar.e = ix.b(iArr4);
            }
        }
        if (ixVar.a != 0) {
            int[] iArr5 = ixVar.e;
            if (iArr5.length > 0) {
                qs qsVar = ir.a;
                autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(ixVar.c), Math.round(ixVar.d), Math.round(ixVar.b), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr5, 0);
                }
            }
        }
        byo t = byo.t(context, attributeSet, iArr2);
        int h2 = t.h(8, -1);
        Drawable c = h2 != -1 ? d3.c(context, h2) : null;
        int h3 = t.h(13, -1);
        Drawable c2 = h3 != -1 ? d3.c(context, h3) : null;
        int h4 = t.h(9, -1);
        Drawable c3 = h4 != -1 ? d3.c(context, h4) : null;
        int h5 = t.h(6, -1);
        Drawable c4 = h5 != -1 ? d3.c(context, h5) : null;
        int h6 = t.h(10, -1);
        Drawable c5 = h6 != -1 ? d3.c(context, h6) : null;
        int h7 = t.h(7, -1);
        Drawable c6 = h7 != -1 ? d3.c(context, h7) : null;
        if (c5 == null) {
            if (c6 == null) {
                if (c != null || c2 != null || c3 != null || c4 != null) {
                    Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                    Drawable drawable = compoundDrawablesRelative[0];
                    if (drawable == null && compoundDrawablesRelative[2] == null) {
                        Drawable[] compoundDrawables = textView.getCompoundDrawables();
                        if (c == null) {
                            c = compoundDrawables[0];
                        }
                        if (c2 == null) {
                            c2 = compoundDrawables[1];
                        }
                        if (c3 == null) {
                            c3 = compoundDrawables[2];
                        }
                        if (c4 == null) {
                            c4 = compoundDrawables[3];
                        }
                        textView.setCompoundDrawablesWithIntrinsicBounds(c, c2, c3, c4);
                    } else {
                        if (c2 == null) {
                            c2 = compoundDrawablesRelative[1];
                        }
                        if (c4 == null) {
                            c4 = compoundDrawablesRelative[3];
                        }
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, c2, compoundDrawablesRelative[2], c4);
                    }
                }
                if (t.p(11)) {
                    textView.setCompoundDrawableTintList(t.i(11));
                }
                if (t.p(12)) {
                    int e = t.e(12, -1);
                    Rect rect = jl.a;
                    textView.setCompoundDrawableTintMode(a.q(e, null));
                }
                d = t.d(15, -1);
                d2 = t.d(18, -1);
                if (t.p(19)) {
                    f = -1.0f;
                } else {
                    TypedValue peekValue = ((TypedArray) t.a).peekValue(19);
                    if (peekValue != null && peekValue.type == 5) {
                        i3 = peekValue.data & 15;
                        f = TypedValue.complexToFloat(peekValue.data);
                        t.n();
                        if (d != -1) {
                            tw.E(d);
                            textView.setFirstBaselineToTopHeight(d);
                        }
                        if (d2 != -1) {
                            tw.E(d2);
                            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
                            int i7 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
                            if (d2 > Math.abs(i7)) {
                                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), d2 - i7);
                            }
                        }
                        if (f != -1.0f) {
                            if (i3 == -1) {
                                zy.b(textView, (int) f);
                                return;
                            } else {
                                zy.c(textView, i3, f);
                                return;
                            }
                        }
                        return;
                    }
                    f = t.d(19, -1);
                }
                i3 = -1;
                t.n();
                if (d != -1) {
                }
                if (d2 != -1) {
                }
                if (f != -1.0f) {
                }
            }
        }
        Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
        if (c5 == null) {
            c5 = compoundDrawablesRelative2[0];
        }
        if (c2 == null) {
            c2 = compoundDrawablesRelative2[1];
        }
        if (c6 == null) {
            c6 = compoundDrawablesRelative2[2];
        }
        if (true == z3) {
            c4 = compoundDrawablesRelative2[3];
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(c5, c2, c6, c4);
        if (t.p(11)) {
        }
        if (t.p(12)) {
        }
        d = t.d(15, -1);
        d2 = t.d(18, -1);
        if (t.p(19)) {
        }
        i3 = -1;
        t.n();
        if (d != -1) {
        }
        if (d2 != -1) {
        }
        if (f != -1.0f) {
        }
    }

    public final void d(Context context, int i) {
        byo s = byo.s(context, i, em.x);
        if (s.p(14)) {
            e(s.o(14, false));
        }
        if (s.p(0) && s.d(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        boolean j = j(context, s);
        s.n();
        i(j);
    }

    final void e(boolean z) {
        this.d.setAllCaps(z);
    }
}
