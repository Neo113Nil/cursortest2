package b1;

import H1.l;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import c1.AbstractC0091d;
import g0.H;
import g0.U;
import j1.p;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p0.x;
import s1.AbstractC0318a;
import z1.q;
import z1.u;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2047a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2048b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2049c;

    public static void A(p pVar, AbstractC0318a abstractC0318a, AbstractC0318a abstractC0318a2) {
        try {
            w1.a.c(AbstractC0091d.m(AbstractC0091d.e(abstractC0318a, abstractC0318a2, pVar)), X0.g.f1277c, null);
        } catch (Throwable th) {
            abstractC0318a2.b(l.w(th));
            throw th;
        }
    }

    public static o1.a B(o1.c cVar, int i) {
        k1.e.e(cVar, "<this>");
        boolean z2 = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z2) {
            if (cVar.f3597c <= 0) {
                i = -i;
            }
            return new o1.a(cVar.f3595a, cVar.f3596b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static o1.c C(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new o1.c(i, i2 - 1, 1);
        }
        o1.c cVar = o1.c.d;
        return o1.c.d;
    }

    public static void a(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(A1.c.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static void b(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new o1.c(2, 36, 1));
        }
    }

    public static void c(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(A1.c.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                sb.append(A1.c.o(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void d(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                H1.d.b(th, th2);
            }
        }
    }

    public static int e(int i, int i2) {
        if (i2 >= 0) {
            if (i < 0) {
                return 0;
            }
            return i > i2 ? i2 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i2 + " is less than minimum 0.");
    }

    public static int f(U u2, U.g gVar, View view, View view2, H h, boolean z2) {
        if (h.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(H.H(view) - H.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int g(U u2, U.g gVar, View view, View view2, H h, boolean z2, boolean z3) {
        if (h.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (u2.b() - Math.max(H.H(view), H.H(view2))) - 1) : Math.max(0, Math.min(H.H(view), H.H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(H.H(view) - H.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int h(U u2, U.g gVar, View view, View view2, H h, boolean z2) {
        if (h.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return u2.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(H.H(view) - H.H(view2)) + 1)) * u2.b());
    }

    public static int i(String str, int i, int i2, boolean z2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z2)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean j(String str, String str2) {
        k1.e.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    k1.e.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return k1.e.a(r1.d.T(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final boolean k(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static View l(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static u m(String str) {
        k1.e.e(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return u.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return u.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return u.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return u.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return u.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static h n(h hVar, i iVar) {
        k1.e.e(iVar, "key");
        if (k1.e.a(hVar.getKey(), iVar)) {
            return hVar;
        }
        return null;
    }

    public static q o(String str) {
        if (str.equals("http/1.0")) {
            return q.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return q.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return q.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return q.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return q.SPDY_3;
        }
        if (str.equals("quic")) {
            return q.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static final Class p(k1.c cVar) {
        Class a2 = cVar.a();
        k1.e.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class q(p1.b bVar) {
        k1.e.e(bVar, "<this>");
        Class a2 = ((k1.b) bVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a2;
    }

    public static j s(h hVar, i iVar) {
        k1.e.e(iVar, "key");
        return k1.e.a(hVar.getKey(), iVar) ? k.f2050a : hVar;
    }

    public static z1.j t(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = r1.d.T(str).toString();
        }
        int k2 = AbstractC0091d.k(0, strArr2.length - 1, 2);
        if (k2 >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                a(str2);
                c(str3, str2);
                if (i == k2) {
                    break;
                }
                i += 2;
            }
        }
        return new z1.j(strArr2);
    }

    public static void u(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static long v(String str, int i) {
        int i2 = i(str, 0, i, false);
        Matcher matcher = z1.h.f4675m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (i2 < i) {
            int i9 = i(str, i2 + 1, i, true);
            matcher.region(i2, i9);
            if (i4 == -1 && matcher.usePattern(z1.h.f4675m).matches()) {
                String group = matcher.group(1);
                k1.e.d(group, "matcher.group(1)");
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                k1.e.d(group2, "matcher.group(2)");
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                k1.e.d(group3, "matcher.group(3)");
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(z1.h.f4674l).matches()) {
                String group4 = matcher.group(1);
                k1.e.d(group4, "matcher.group(1)");
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = z1.h.f4673k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        k1.e.d(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        k1.e.d(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        k1.e.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        k1.e.d(pattern2, "MONTH_PATTERN.pattern()");
                        i6 = r1.d.J(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(z1.h.f4672j).matches()) {
                    String group6 = matcher.group(1);
                    k1.e.d(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
            }
            i2 = i(str, i9 + 1, i, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i5 || i5 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i4 < 0 || i4 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 < 0 || i8 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(A1.c.f16e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static j x(h hVar, j jVar) {
        k1.e.e(jVar, "context");
        return l.Z(hVar, jVar);
    }

    public float r(View view) {
        if (f2047a) {
            try {
                return x.a(view);
            } catch (NoSuchMethodError unused) {
                f2047a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract Object w(Intent intent, int i);

    public void y(View view, float f2) {
        if (f2047a) {
            try {
                x.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2047a = false;
            }
        }
        view.setAlpha(f2);
    }

    public void z(View view, int i) {
        if (!f2049c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2048b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2049c = true;
        }
        Field field = f2048b;
        if (field != null) {
            try {
                f2048b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
