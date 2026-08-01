package r1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.widget.ImageView;
import com.gdmhkmf.belbet.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n0.r0;
import o2.z;
import t3.h;
import t3.j;
import t3.p;
import t3.w;
import x2.i;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class b {
    public static void A(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z4 = onLongClickListener != null;
        boolean z5 = hasOnClickListeners || z4;
        checkableImageButton.setFocusable(z5);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z4);
        checkableImageButton.setImportantForAccessibility(z5 ? 1 : 2);
    }

    public static final void C(Object obj) {
        if (obj instanceof w2.b) {
            throw ((w2.b) obj).f3816f;
        }
    }

    public static void E(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final void b(View view) {
        i3.d.e(view, "<this>");
        o3.f fVar = new o3.f();
        r0 r0Var = new r0(view, fVar);
        r0Var.h = fVar;
        fVar.i = r0Var;
        while (fVar.hasNext()) {
            View view2 = (View) fVar.next();
            s0.a aVar = (s0.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new s0.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f3234a;
            int A = i.A(arrayList);
            if (-1 < A) {
                arrayList.get(A).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static void c(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(u3.b.f("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static void d(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(u3.b.f("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                sb.append(u3.b.n(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static ImageView.ScaleType g(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final void h(int i, int i4) {
        if (i <= i4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i4 + ").");
    }

    public static int i(String str, int i, int i4, boolean z4) {
        while (i < i4) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z4)) {
                return i;
            }
            i++;
        }
        return i4;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static w j(String str) {
        i3.d.e(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return w.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return w.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return w.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return w.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return w.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static p k(String str) {
        if (str.equals("http/1.0")) {
            return p.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return p.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return p.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return p.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return p.SPDY_3;
        }
        if (str.equals("quic")) {
            return p.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static j p(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr2[i4];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i4] = p3.d.E0(str).toString();
        }
        int z4 = b4.d.z(0, strArr2.length - 1, 2);
        if (z4 >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                c(str2);
                d(str3, str2);
                if (i == z4) {
                    break;
                }
                i += 2;
            }
        }
        return new j(strArr2);
    }

    public static long u(String str, int i) {
        int i4 = i(str, 0, i, false);
        Matcher matcher = h.f3443m.matcher(str);
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        while (i4 < i) {
            int i11 = i(str, i4 + 1, i, true);
            matcher.region(i4, i11);
            if (i6 == -1 && matcher.usePattern(h.f3443m).matches()) {
                String group = matcher.group(1);
                i3.d.d(group, "matcher.group(1)");
                i6 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                i3.d.d(group2, "matcher.group(2)");
                i9 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                i3.d.d(group3, "matcher.group(3)");
                i10 = Integer.parseInt(group3);
            } else if (i7 == -1 && matcher.usePattern(h.f3442l).matches()) {
                String group4 = matcher.group(1);
                i3.d.d(group4, "matcher.group(1)");
                i7 = Integer.parseInt(group4);
            } else {
                if (i8 == -1) {
                    Pattern pattern = h.f3441k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        i3.d.d(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        i3.d.d(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        i3.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        i3.d.d(pattern2, "MONTH_PATTERN.pattern()");
                        i8 = p3.d.u0(pattern2, lowerCase, 0, false) / 4;
                    }
                }
                if (i5 == -1 && matcher.usePattern(h.f3440j).matches()) {
                    String group6 = matcher.group(1);
                    i3.d.d(group6, "matcher.group(1)");
                    i5 = Integer.parseInt(group6);
                }
            }
            i4 = i(str, i11 + 1, i, false);
        }
        if (70 <= i5 && i5 < 100) {
            i5 += 1900;
        }
        if (i5 >= 0 && i5 < 70) {
            i5 += 2000;
        }
        if (i5 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i7 || i7 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 < 0 || i6 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0 || i9 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i10 < 0 || i10 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(u3.b.f3584e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i5);
        gregorianCalendar.set(2, i8 - 1);
        gregorianCalendar.set(5, i7);
        gregorianCalendar.set(11, i6);
        gregorianCalendar.set(12, i9);
        gregorianCalendar.set(13, i10);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final boolean v(String str) {
        i3.d.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static void w(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static void x(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public abstract void B(z zVar, float f5);

    public abstract boolean D(View view, int i);

    public abstract int e(View view, int i);

    public abstract int f(View view, int i);

    public abstract InputFilter[] l(InputFilter[] inputFilterArr);

    public abstract float m(z zVar);

    public int n(View view) {
        return 0;
    }

    public int o() {
        return 0;
    }

    public abstract void r(int i);

    public abstract void s(View view, int i, int i4);

    public abstract void t(View view, float f5, float f6);

    public abstract void y(boolean z4);

    public abstract void z(boolean z4);

    public void q(View view, int i) {
    }
}
