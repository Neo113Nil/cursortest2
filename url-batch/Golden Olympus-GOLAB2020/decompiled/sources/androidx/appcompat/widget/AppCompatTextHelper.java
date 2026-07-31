package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.f;
import androidx.core.view.AbstractC1281a0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AppCompatTextHelper {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f10616a;

    /* renamed from: b, reason: collision with root package name */
    private X f10617b;

    /* renamed from: c, reason: collision with root package name */
    private X f10618c;

    /* renamed from: d, reason: collision with root package name */
    private X f10619d;

    /* renamed from: e, reason: collision with root package name */
    private X f10620e;

    /* renamed from: f, reason: collision with root package name */
    private X f10621f;

    /* renamed from: g, reason: collision with root package name */
    private X f10622g;

    /* renamed from: h, reason: collision with root package name */
    private X f10623h;

    /* renamed from: i, reason: collision with root package name */
    private final C1272v f10624i;

    /* renamed from: j, reason: collision with root package name */
    private int f10625j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f10626k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f10627l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f10628m;

    class a extends f.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f10629a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10630b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f10631c;

        a(int i4, int i5, WeakReference weakReference) {
            this.f10629a = i4;
            this.f10630b = i5;
            this.f10631c = weakReference;
        }

        @Override // androidx.core.content.res.f.e
        public void onFontRetrievalFailed(int i4) {
        }

        @Override // androidx.core.content.res.f.e
        public void onFontRetrieved(Typeface typeface) {
            int i4;
            if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f10629a) != -1) {
                typeface = e.a(typeface, i4, (this.f10630b & 2) != 0);
            }
            AppCompatTextHelper.this.n(this.f10631c, typeface);
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f10633b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Typeface f10634c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10635d;

        b(TextView textView, Typeface typeface, int i4) {
            this.f10633b = textView;
            this.f10634c = typeface;
            this.f10635d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10633b.setTypeface(this.f10634c, this.f10635d);
        }
    }

    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i4, int i5, int i6, int i7) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }

        static void c(TextView textView, int[] iArr, int i4) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class e {
        static Typeface a(Typeface typeface, int i4, boolean z4) {
            return Typeface.create(typeface, i4, z4);
        }
    }

    AppCompatTextHelper(TextView textView) {
        this.f10616a = textView;
        this.f10624i = new C1272v(textView);
    }

    private void B(int i4, float f4) {
        this.f10624i.t(i4, f4);
    }

    private void C(Context context, Z z4) {
        String o4;
        this.f10625j = z4.k(e.j.f36453V2, this.f10625j);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int k4 = z4.k(e.j.f36465Y2, -1);
            this.f10626k = k4;
            if (k4 != -1) {
                this.f10625j &= 2;
            }
        }
        if (!z4.s(e.j.f36461X2) && !z4.s(e.j.f36469Z2)) {
            if (z4.s(e.j.f36449U2)) {
                this.f10628m = false;
                int k5 = z4.k(e.j.f36449U2, 1);
                if (k5 == 1) {
                    this.f10627l = Typeface.SANS_SERIF;
                    return;
                } else if (k5 == 2) {
                    this.f10627l = Typeface.SERIF;
                    return;
                } else {
                    if (k5 != 3) {
                        return;
                    }
                    this.f10627l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f10627l = null;
        int i5 = z4.s(e.j.f36469Z2) ? e.j.f36469Z2 : e.j.f36461X2;
        int i6 = this.f10626k;
        int i7 = this.f10625j;
        if (!context.isRestricted()) {
            try {
                Typeface j4 = z4.j(i5, this.f10625j, new a(i6, i7, new WeakReference(this.f10616a)));
                if (j4 != null) {
                    if (i4 < 28 || this.f10626k == -1) {
                        this.f10627l = j4;
                    } else {
                        this.f10627l = e.a(Typeface.create(j4, 0), this.f10626k, (this.f10625j & 2) != 0);
                    }
                }
                this.f10628m = this.f10627l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f10627l != null || (o4 = z4.o(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f10626k == -1) {
            this.f10627l = Typeface.create(o4, this.f10625j);
        } else {
            this.f10627l = e.a(Typeface.create(o4, 0), this.f10626k, (this.f10625j & 2) != 0);
        }
    }

    private void a(Drawable drawable, X x4) {
        if (drawable == null || x4 == null) {
            return;
        }
        C1259h.i(drawable, x4, this.f10616a.getDrawableState());
    }

    private static X d(Context context, C1259h c1259h, int i4) {
        ColorStateList f4 = c1259h.f(context, i4);
        if (f4 == null) {
            return null;
        }
        X x4 = new X();
        x4.f10856d = true;
        x4.f10853a = f4;
        return x4;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f10616a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f10616a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f10616a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f10616a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f10616a.getCompoundDrawables();
        TextView textView2 = this.f10616a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        X x4 = this.f10623h;
        this.f10617b = x4;
        this.f10618c = x4;
        this.f10619d = x4;
        this.f10620e = x4;
        this.f10621f = x4;
        this.f10622g = x4;
    }

    void A(int i4, float f4) {
        if (k0.f10951c || l()) {
            return;
        }
        B(i4, f4);
    }

    void b() {
        if (this.f10617b != null || this.f10618c != null || this.f10619d != null || this.f10620e != null) {
            Drawable[] compoundDrawables = this.f10616a.getCompoundDrawables();
            a(compoundDrawables[0], this.f10617b);
            a(compoundDrawables[1], this.f10618c);
            a(compoundDrawables[2], this.f10619d);
            a(compoundDrawables[3], this.f10620e);
        }
        if (this.f10621f == null && this.f10622g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f10616a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f10621f);
        a(compoundDrawablesRelative[2], this.f10622g);
    }

    void c() {
        this.f10624i.a();
    }

    int e() {
        return this.f10624i.f();
    }

    int f() {
        return this.f10624i.g();
    }

    int g() {
        return this.f10624i.h();
    }

    int[] h() {
        return this.f10624i.i();
    }

    int i() {
        return this.f10624i.j();
    }

    ColorStateList j() {
        X x4 = this.f10623h;
        if (x4 != null) {
            return x4.f10853a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        X x4 = this.f10623h;
        if (x4 != null) {
            return x4.f10854b;
        }
        return null;
    }

    boolean l() {
        return this.f10624i.n();
    }

    void m(AttributeSet attributeSet, int i4) {
        boolean z4;
        boolean z5;
        String str;
        String str2;
        boolean z6;
        int i5;
        float f4;
        Context context = this.f10616a.getContext();
        C1259h b4 = C1259h.b();
        Z v4 = Z.v(context, attributeSet, e.j.f36462Y, i4, 0);
        TextView textView = this.f10616a;
        AbstractC1281a0.m0(textView, textView.getContext(), e.j.f36462Y, attributeSet, v4.r(), i4, 0);
        int n4 = v4.n(e.j.f36466Z, -1);
        if (v4.s(e.j.f36481c0)) {
            this.f10617b = d(context, b4, v4.n(e.j.f36481c0, 0));
        }
        if (v4.s(e.j.f36471a0)) {
            this.f10618c = d(context, b4, v4.n(e.j.f36471a0, 0));
        }
        if (v4.s(e.j.f36486d0)) {
            this.f10619d = d(context, b4, v4.n(e.j.f36486d0, 0));
        }
        if (v4.s(e.j.f36476b0)) {
            this.f10620e = d(context, b4, v4.n(e.j.f36476b0, 0));
        }
        if (v4.s(e.j.f36491e0)) {
            this.f10621f = d(context, b4, v4.n(e.j.f36491e0, 0));
        }
        if (v4.s(e.j.f36496f0)) {
            this.f10622g = d(context, b4, v4.n(e.j.f36496f0, 0));
        }
        v4.x();
        boolean z7 = this.f10616a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (n4 != -1) {
            Z t4 = Z.t(context, n4, e.j.f36441S2);
            if (z7 || !t4.s(e.j.f36479b3)) {
                z4 = false;
                z5 = false;
            } else {
                z4 = t4.a(e.j.f36479b3, false);
                z5 = true;
            }
            C(context, t4);
            int i6 = Build.VERSION.SDK_INT;
            str2 = t4.s(e.j.f36484c3) ? t4.o(e.j.f36484c3) : null;
            str = (i6 < 26 || !t4.s(e.j.f36474a3)) ? null : t4.o(e.j.f36474a3);
            t4.x();
        } else {
            z4 = false;
            z5 = false;
            str = null;
            str2 = null;
        }
        Z v5 = Z.v(context, attributeSet, e.j.f36441S2, i4, 0);
        if (z7 || !v5.s(e.j.f36479b3)) {
            z6 = z5;
        } else {
            z4 = v5.a(e.j.f36479b3, false);
            z6 = true;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (v5.s(e.j.f36484c3)) {
            str2 = v5.o(e.j.f36484c3);
        }
        if (i7 >= 26 && v5.s(e.j.f36474a3)) {
            str = v5.o(e.j.f36474a3);
        }
        if (i7 >= 28 && v5.s(e.j.f36445T2) && v5.f(e.j.f36445T2, -1) == 0) {
            this.f10616a.setTextSize(0, 0.0f);
        }
        C(context, v5);
        v5.x();
        if (!z7 && z6) {
            s(z4);
        }
        Typeface typeface = this.f10627l;
        if (typeface != null) {
            if (this.f10626k == -1) {
                this.f10616a.setTypeface(typeface, this.f10625j);
            } else {
                this.f10616a.setTypeface(typeface);
            }
        }
        if (str != null) {
            d.d(this.f10616a, str);
        }
        if (str2 != null) {
            c.b(this.f10616a, c.a(str2));
        }
        this.f10624i.o(attributeSet, i4);
        if (k0.f10951c && this.f10624i.j() != 0) {
            int[] i8 = this.f10624i.i();
            if (i8.length > 0) {
                if (d.a(this.f10616a) != -1.0f) {
                    d.b(this.f10616a, this.f10624i.g(), this.f10624i.f(), this.f10624i.h(), 0);
                } else {
                    d.c(this.f10616a, i8, 0);
                }
            }
        }
        Z u4 = Z.u(context, attributeSet, e.j.f36501g0);
        int n5 = u4.n(e.j.f36541o0, -1);
        Drawable c4 = n5 != -1 ? b4.c(context, n5) : null;
        int n6 = u4.n(e.j.f36566t0, -1);
        Drawable c5 = n6 != -1 ? b4.c(context, n6) : null;
        int n7 = u4.n(e.j.f36546p0, -1);
        Drawable c6 = n7 != -1 ? b4.c(context, n7) : null;
        int n8 = u4.n(e.j.f36531m0, -1);
        Drawable c7 = n8 != -1 ? b4.c(context, n8) : null;
        int n9 = u4.n(e.j.f36551q0, -1);
        Drawable c8 = n9 != -1 ? b4.c(context, n9) : null;
        int n10 = u4.n(e.j.f36536n0, -1);
        y(c4, c5, c6, c7, c8, n10 != -1 ? b4.c(context, n10) : null);
        if (u4.s(e.j.f36556r0)) {
            androidx.core.widget.j.h(this.f10616a, u4.c(e.j.f36556r0));
        }
        if (u4.s(e.j.f36561s0)) {
            androidx.core.widget.j.i(this.f10616a, F.e(u4.k(e.j.f36561s0, -1), null));
        }
        int f5 = u4.f(e.j.f36576v0, -1);
        int f6 = u4.f(e.j.f36581w0, -1);
        if (u4.s(e.j.f36586x0)) {
            TypedValue w4 = u4.w(e.j.f36586x0);
            if (w4 == null || w4.type != 5) {
                f4 = u4.f(e.j.f36586x0, -1);
                i5 = -1;
            } else {
                i5 = A.k.a(w4.data);
                f4 = TypedValue.complexToFloat(w4.data);
            }
        } else {
            i5 = -1;
            f4 = -1.0f;
        }
        u4.x();
        if (f5 != -1) {
            androidx.core.widget.j.k(this.f10616a, f5);
        }
        if (f6 != -1) {
            androidx.core.widget.j.l(this.f10616a, f6);
        }
        if (f4 != -1.0f) {
            if (i5 == -1) {
                androidx.core.widget.j.m(this.f10616a, (int) f4);
            } else {
                androidx.core.widget.j.n(this.f10616a, i5, f4);
            }
        }
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f10628m) {
            this.f10627l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f10625j));
                } else {
                    textView.setTypeface(typeface, this.f10625j);
                }
            }
        }
    }

    void o(boolean z4, int i4, int i5, int i6, int i7) {
        if (k0.f10951c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i4) {
        String o4;
        Z t4 = Z.t(context, i4, e.j.f36441S2);
        if (t4.s(e.j.f36479b3)) {
            s(t4.a(e.j.f36479b3, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (t4.s(e.j.f36445T2) && t4.f(e.j.f36445T2, -1) == 0) {
            this.f10616a.setTextSize(0, 0.0f);
        }
        C(context, t4);
        if (i5 >= 26 && t4.s(e.j.f36474a3) && (o4 = t4.o(e.j.f36474a3)) != null) {
            d.d(this.f10616a, o4);
        }
        t4.x();
        Typeface typeface = this.f10627l;
        if (typeface != null) {
            this.f10616a.setTypeface(typeface, this.f10625j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        E.a.e(editorInfo, textView.getText());
    }

    void s(boolean z4) {
        this.f10616a.setAllCaps(z4);
    }

    void t(int i4, int i5, int i6, int i7) {
        this.f10624i.p(i4, i5, i6, i7);
    }

    void u(int[] iArr, int i4) {
        this.f10624i.q(iArr, i4);
    }

    void v(int i4) {
        this.f10624i.r(i4);
    }

    void w(ColorStateList colorStateList) {
        if (this.f10623h == null) {
            this.f10623h = new X();
        }
        X x4 = this.f10623h;
        x4.f10853a = colorStateList;
        x4.f10856d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f10623h == null) {
            this.f10623h = new X();
        }
        X x4 = this.f10623h;
        x4.f10854b = mode;
        x4.f10855c = mode != null;
        z();
    }
}
