package k3;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.t;
import androidx.emoji2.text.u;
import androidx.fragment.app.w0;
import b1.z0;
import c3.r;
import c3.y;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import f1.x;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.i0;
import k0.j0;
import k0.n0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2825a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2826b = false;
    public static Method c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2827d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Field f2828e;

    public d() {
        new ConcurrentHashMap();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static y A(String str) {
        u2.c.e(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return y.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return y.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return y.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return y.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return y.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static final String B(long j4) {
        String str;
        if (j4 <= -999500000) {
            str = ((j4 - 500000000) / 1000000000) + " s ";
        } else if (j4 <= -999500) {
            str = ((j4 - 500000) / 1000000) + " ms";
        } else if (j4 <= 0) {
            str = ((j4 - 500) / 1000) + " µs";
        } else if (j4 < 999500) {
            str = ((j4 + 500) / 1000) + " µs";
        } else if (j4 < 999500000) {
            str = ((j4 + 500000) / 1000000) + " ms";
        } else {
            str = ((j4 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static r C(String str) {
        if (str.equals("http/1.0")) {
            return r.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return r.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return r.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return r.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return r.SPDY_3;
        }
        if (str.equals("quic")) {
            return r.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList D(Context context, int i4) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        b0.i iVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        b0.j jVar = new b0.j(resources, theme);
        synchronized (b0.m.c) {
            try {
                SparseArray sparseArray = (SparseArray) b0.m.f717b.get(jVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (iVar = (b0.i) sparseArray.get(i4)) != null) {
                    if (iVar.f712b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (iVar.c != 0) {
                            }
                            colorStateList2 = iVar.f711a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i4);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = b0.m.f716a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i4, typedValue, true);
        int i5 = typedValue.type;
        if (i5 < 28 || i5 > 31) {
            try {
                colorStateList = b0.c.a(resources, resources.getXml(i4), theme);
            } catch (Exception e4) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e4);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i4, theme);
        }
        synchronized (b0.m.c) {
            try {
                WeakHashMap weakHashMap = b0.m.f717b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(jVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(jVar, sparseArray2);
                }
                sparseArray2.append(i4, new b0.i(colorStateList, jVar.f713a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static Set F() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static c3.k Q(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            String str = strArr2[i5];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i5] = b3.e.q0(str).toString();
        }
        int j4 = l0.g.j(0, strArr2.length - 1, 2);
        if (j4 >= 0) {
            while (true) {
                String str2 = strArr2[i4];
                String str3 = strArr2[i4 + 1];
                g(str2);
                j(str3, str2);
                if (i4 == j4) {
                    break;
                }
                i4 += 2;
            }
        }
        return new c3.k(strArr2);
    }

    public static b0.d T(String str) {
        int i4;
        String str2;
        u2.c.e(str, "statusLine");
        boolean b02 = b3.m.b0(str, "HTTP/1.", false);
        r rVar = r.HTTP_1_0;
        if (b02) {
            i4 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                rVar = r.HTTP_1_1;
            }
        } else {
            if (!b3.m.b0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i4 = 4;
        }
        int i5 = i4 + 3;
        if (str.length() < i5) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i4, i5);
            u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i5) {
                str2 = "";
            } else {
                if (str.charAt(i5) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i4 + 4);
                u2.c.d(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new b0.d(rVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static long U(String str, int i4) {
        int u3 = u(str, 0, i4, false);
        Matcher matcher = c3.i.f1058m.matcher(str);
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        while (u3 < i4) {
            int u4 = u(str, u3 + 1, i4, true);
            matcher.region(u3, u4);
            if (i6 == -1 && matcher.usePattern(c3.i.f1058m).matches()) {
                String group = matcher.group(1);
                u2.c.d(group, "matcher.group(1)");
                i6 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                u2.c.d(group2, "matcher.group(2)");
                i9 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                u2.c.d(group3, "matcher.group(3)");
                i10 = Integer.parseInt(group3);
            } else if (i7 == -1 && matcher.usePattern(c3.i.f1057l).matches()) {
                String group4 = matcher.group(1);
                u2.c.d(group4, "matcher.group(1)");
                i7 = Integer.parseInt(group4);
            } else {
                if (i8 == -1) {
                    Pattern pattern = c3.i.f1056k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        u2.c.d(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        u2.c.d(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        u2.c.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        u2.c.d(pattern2, "MONTH_PATTERN.pattern()");
                        i8 = b3.e.h0(pattern2, lowerCase, 0, 6) / 4;
                    }
                }
                if (i5 == -1 && matcher.usePattern(c3.i.f1055j).matches()) {
                    String group6 = matcher.group(1);
                    u2.c.d(group6, "matcher.group(1)");
                    i5 = Integer.parseInt(group6);
                }
            }
            u3 = u(str, u4 + 1, i4, false);
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
        GregorianCalendar gregorianCalendar = new GregorianCalendar(d3.c.f1493e);
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

    public static void W(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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

    public static TypedValue X(Resources.Theme theme, int i4) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean Y(Resources.Theme theme, int i4, boolean z3) {
        TypedValue X = X(theme, i4);
        return (X == null || X.type != 18) ? z3 : X.data != 0;
    }

    public static TypedValue Z(Context context, int i4, String str) {
        TypedValue X = X(context.getTheme(), i4);
        if (X != null) {
            return X;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i4)));
    }

    public static final void a(f3.a aVar, f3.c cVar, String str) {
        f3.d.f1747i.fine(cVar.f1743b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f1737a);
    }

    public static TypedValue a0(View view, int i4) {
        return Z(view.getContext(), i4, view.getClass().getCanonicalName());
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
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

    public static void d0(Window window, boolean z3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            n0.c(window, z3);
        } else {
            if (i4 >= 30) {
                n0.b(window, z3);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void e(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z3 = onLongClickListener != null;
        boolean z4 = hasOnClickListeners || z3;
        checkableImageButton.setFocusable(z4);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z3);
        checkableImageButton.setImportantForAccessibility(z4 ? 1 : 2);
    }

    public static void f(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(d3.c.f("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i4), str).toString());
            }
        }
    }

    public static void g0(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            x.b(viewGroup, z3);
        } else if (f2825a) {
            try {
                x.b(viewGroup, z3);
            } catch (NoSuchMethodError unused) {
                f2825a = false;
            }
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int h0(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i4});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void i(int i4) {
        if (2 > i4 || i4 >= 37) {
            throw new IllegalArgumentException("radix " + i4 + " was not in valid range " + new y2.c(2, 36, 1));
        }
    }

    public static final String i0(String str) {
        u2.c.e(str, "<this>");
        int i4 = -1;
        int i5 = 0;
        if (!b3.e.d0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                u2.c.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                u2.c.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                u2.c.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i6 = 0; i6 < length; i6++) {
                    char charAt = lowerCase.charAt(i6);
                    if (u2.c.f(charAt, 31) <= 0 || u2.c.f(charAt, 127) >= 0 || b3.e.g0(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress v3 = (b3.m.b0(str, "[", false) && str.endsWith("]")) ? v(str, 1, str.length() - 1) : v(str, 0, str.length());
        if (v3 == null) {
            return null;
        }
        byte[] address = v3.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return v3.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < address.length) {
            int i9 = i7;
            while (i9 < 16 && address[i9] == 0 && address[i9 + 1] == 0) {
                i9 += 2;
            }
            int i10 = i9 - i7;
            if (i10 > i8 && i10 >= 4) {
                i4 = i7;
                i8 = i10;
            }
            i7 = i9 + 2;
        }
        p3.f fVar = new p3.f();
        while (i5 < address.length) {
            if (i5 == i4) {
                fVar.x(58);
                i5 += i8;
                if (i5 == 16) {
                    fVar.x(58);
                }
            } else {
                if (i5 > 0) {
                    fVar.x(58);
                }
                byte b2 = address[i5];
                byte[] bArr = d3.c.f1490a;
                fVar.y(((b2 & 255) << 8) | (address[i5 + 1] & 255));
                i5 += 2;
            }
        }
        return fVar.r(fVar.g, b3.a.f967a);
    }

    public static void j(String str, String str2) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(d3.c.f("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i4), str2));
                sb.append(d3.c.n(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static int k(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }

    public static void k0(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static int l(z0 z0Var, androidx.emoji2.text.g gVar, View view, View view2, b1.n0 n0Var, boolean z3) {
        if (n0Var.v() == 0 || z0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(b1.n0.H(view) - b1.n0.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int m(z0 z0Var, androidx.emoji2.text.g gVar, View view, View view2, b1.n0 n0Var, boolean z3, boolean z4) {
        if (n0Var.v() == 0 || z0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z4 ? Math.max(0, (z0Var.b() - Math.max(b1.n0.H(view), b1.n0.H(view2))) - 1) : Math.max(0, Math.min(b1.n0.H(view), b1.n0.H(view2)));
        if (z3) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(b1.n0.H(view) - b1.n0.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int n(z0 z0Var, androidx.emoji2.text.g gVar, View view, View view2, b1.n0 n0Var, boolean z3) {
        if (n0Var.v() == 0 || z0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return z0Var.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(b1.n0.H(view) - b1.n0.H(view2)) + 1)) * z0Var.b());
    }

    public static ImageView.ScaleType o(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 5 ? i4 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u p(Context context) {
        ProviderInfo providerInfo;
        h0.d dVar;
        ApplicationInfo applicationInfo;
        g2.f cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(2) : new g2.f(2);
        PackageManager packageManager = context.getPackageManager();
        h(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] m4 = cVar.m(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : m4) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new h0.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e4) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e4);
            }
            if (dVar != null) {
                return null;
            }
            return new u(new t(context, dVar));
        }
        dVar = null;
        if (dVar != null) {
        }
    }

    public static int u(String str, int i4, int i5, boolean z3) {
        while (i4 < i5) {
            char charAt = str.charAt(i4);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z3)) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress v(String str, int i4, int i5) {
        int i6;
        byte[] bArr = new byte[16];
        int i7 = i4;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            if (i7 >= i5) {
                break;
            }
            if (i8 == 16) {
                return null;
            }
            int i11 = i7 + 2;
            if (i11 <= i5 && b3.m.a0(str, "::", i7, false)) {
                if (i9 != -1) {
                    return null;
                }
                i8 += 2;
                i9 = i8;
                if (i11 == i5) {
                    break;
                }
                i10 = i11;
                int i12 = 0;
                i7 = i10;
                while (i7 < i5) {
                }
                i6 = i7 - i10;
                return i6 == 0 ? null : null;
            }
            if (i8 != 0) {
                if (b3.m.a0(str, ":", i7, false)) {
                    i7++;
                } else {
                    if (!b3.m.a0(str, ".", i7, false)) {
                        return null;
                    }
                    int i13 = i8 - 2;
                    int i14 = i13;
                    while (i10 < i5) {
                        if (i14 == 16) {
                            return null;
                        }
                        if (i14 != i13) {
                            if (str.charAt(i10) != '.') {
                                return null;
                            }
                            i10++;
                        }
                        int i15 = 0;
                        int i16 = i10;
                        while (i16 < i5) {
                            char charAt = str.charAt(i16);
                            if (u2.c.f(charAt, 48) < 0 || u2.c.f(charAt, 57) > 0) {
                                break;
                            }
                            if ((i15 == 0 && i10 != i16) || ((i15 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i16++;
                        }
                        if (i16 - i10 == 0) {
                            return null;
                        }
                        bArr[i14] = (byte) i15;
                        i14++;
                        i10 = i16;
                    }
                    if (i14 != i8 + 2) {
                        return null;
                    }
                    i8 += 2;
                }
            }
            i10 = i7;
            int i122 = 0;
            i7 = i10;
            while (i7 < i5) {
                int o4 = d3.c.o(str.charAt(i7));
                if (o4 == -1) {
                    break;
                }
                i122 = (i122 << 4) + o4;
                i7++;
            }
            i6 = i7 - i10;
            if (i6 == 0 && i6 <= 4) {
                int i17 = i8 + 1;
                bArr[i8] = (byte) (255 & (i122 >>> 8));
                i8 += 2;
                bArr[i17] = (byte) (i122 & 255);
            }
        }
        if (i8 != 16) {
            if (i9 == -1) {
                return null;
            }
            int i18 = i8 - i9;
            System.arraycopy(bArr, i9, bArr, 16 - i18, i18);
            Arrays.fill(bArr, i9, (16 - i8) + i9, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static boolean w(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = j0.f2752a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = i0.f2743d;
        i0 i0Var = (i0) view.getTag(com.gglhk.bofio.fortunetiger.R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (i0Var == null) {
            i0Var = new i0();
            i0Var.f2744a = null;
            i0Var.f2745b = null;
            i0Var.c = null;
            view.setTag(com.gglhk.bofio.fortunetiger.R.id.tag_unhandled_key_event_manager, i0Var);
        }
        WeakReference weakReference2 = i0Var.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        i0Var.c = new WeakReference(keyEvent);
        if (i0Var.f2745b == null) {
            i0Var.f2745b = new SparseArray();
        }
        SparseArray sparseArray = i0Var.f2745b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(com.gglhk.bofio.fortunetiger.R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw w0.d(arrayList, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(k0.i iVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z3 = false;
        if (iVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return iVar.b(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f2826b) {
                            try {
                                c = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f2826b = true;
                        }
                        Method method = c;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z3 = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z3) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (j0.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f2827d) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f2828e = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f2827d = true;
                }
                Field field = f2828e;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (j0.c(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && j0.c(view, keyEvent)) || iVar.b(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y(char c4, char c5, boolean z3) {
        if (c4 == c5) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c4);
        char upperCase2 = Character.toUpperCase(c5);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public abstract void E(g2.y yVar, float f4, float f5);

    public abstract int G();

    public abstract int H();

    public abstract int I();

    public abstract int J();

    public abstract int K(View view);

    public abstract int L(CoordinatorLayout coordinatorLayout);

    public abstract int M();

    public abstract boolean N(float f4);

    public abstract boolean O(View view);

    public abstract boolean P(float f4, float f5);

    public abstract void R(int i4);

    public abstract void S(Typeface typeface, boolean z3);

    public abstract Object V(Intent intent, int i4);

    public abstract void b0(boolean z3);

    public abstract int c(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract void c0(boolean z3);

    public abstract float d(int i4);

    public abstract boolean f0(View view, float f4);

    public abstract void j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i5);

    public abstract Typeface q(Context context, b0.f fVar, Resources resources, int i4);

    public abstract Typeface r(Context context, h0.i[] iVarArr, int i4);

    public Typeface s(Context context, List list, int i4) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface t(Context context, Resources resources, int i4, String str, int i5) {
        File z3 = m.z(context);
        if (z3 == null) {
            return null;
        }
        try {
            if (m.m(z3, resources, i4)) {
                return Typeface.createFromFile(z3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            z3.delete();
        }
    }

    public h0.i z(h0.i[] iVarArr, int i4) {
        new g2.f(8);
        int i5 = (i4 & 1) == 0 ? 400 : 700;
        boolean z3 = (i4 & 2) != 0;
        h0.i iVar = null;
        int i6 = Integer.MAX_VALUE;
        for (h0.i iVar2 : iVarArr) {
            int abs = (Math.abs(iVar2.c - i5) * 2) + (iVar2.f1996d == z3 ? 0 : 1);
            if (iVar == null || i6 > abs) {
                iVar = iVar2;
                i6 = abs;
            }
        }
        return iVar;
    }
}
