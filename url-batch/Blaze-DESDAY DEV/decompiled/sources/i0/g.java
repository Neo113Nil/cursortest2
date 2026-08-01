package i0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.winworm.neongrid.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.ProtocolException;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l0.y;
import n1.l;
import r1.i;
import r1.k;
import r1.r;
import r1.w;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2568a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2569b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2570c;

    public static final void a(u1.a aVar, u1.c cVar, String str) {
        u1.d.i.fine(cVar.f3782b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f3776a);
    }

    public static void b(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(s1.b.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static void c(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new k1.c(2, 36, 1));
        }
    }

    public static void d(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(s1.b.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                sb.append(s1.b.o(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static int e(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static int f(String str, int i, int i2, boolean z2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z2)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean g(char c2, char c3, boolean z2) {
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

    public static View h(View view, int i) {
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
    public static w i(String str) {
        g1.d.e(str, "javaName");
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

    public static final String j(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static r k(String str) {
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

    public static k m(String... strArr) {
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
            strArr2[i2] = n1.d.O(str).toString();
        }
        int N2 = z1.d.N(0, strArr2.length - 1, 2);
        if (N2 >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                b(str2);
                d(str3, str2);
                if (i == N2) {
                    break;
                }
                i += 2;
            }
        }
        return new k(strArr2);
    }

    public static B.d n(String str) {
        int i;
        String str2;
        g1.d.e(str, "statusLine");
        boolean y2 = l.y(str, "HTTP/1.", false);
        r rVar = r.HTTP_1_0;
        if (y2) {
            i = 9;
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
            if (!l.y(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i, i2);
            g1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
                g1.d.d(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new B.d(rVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static long o(String str, int i) {
        int f2 = f(str, 0, i, false);
        Matcher matcher = i.f3445m.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (f2 < i) {
            int f3 = f(str, f2 + 1, i, true);
            matcher.region(f2, f3);
            if (i3 == -1 && matcher.usePattern(i.f3445m).matches()) {
                String group = matcher.group(1);
                g1.d.d(group, "matcher.group(1)");
                i3 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                g1.d.d(group2, "matcher.group(2)");
                i6 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                g1.d.d(group3, "matcher.group(3)");
                i7 = Integer.parseInt(group3);
            } else if (i4 == -1 && matcher.usePattern(i.f3444l).matches()) {
                String group4 = matcher.group(1);
                g1.d.d(group4, "matcher.group(1)");
                i4 = Integer.parseInt(group4);
            } else {
                if (i5 == -1) {
                    Pattern pattern = i.f3443k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        g1.d.d(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        g1.d.d(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        g1.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        g1.d.d(pattern2, "MONTH_PATTERN.pattern()");
                        i5 = n1.d.E(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(i.f3442j).matches()) {
                    String group6 = matcher.group(1);
                    g1.d.d(group6, "matcher.group(1)");
                    i2 = Integer.parseInt(group6);
                }
            }
            f2 = f(str, f3 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i5 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i4 || i4 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i3 < 0 || i3 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 < 0 || i6 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(s1.b.f3724e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final void p(View view, f fVar) {
        g1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static k1.a s(k1.c cVar, int i) {
        g1.d.e(cVar, "<this>");
        boolean z2 = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z2) {
            if (cVar.f2787c <= 0) {
                i = -i;
            }
            return new k1.a(cVar.f2785a, cVar.f2786b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static k1.c t(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new k1.c(i, i2 - 1, 1);
        }
        k1.c cVar = k1.c.d;
        return k1.c.d;
    }

    public float l(View view) {
        if (f2568a) {
            try {
                return y.a(view);
            } catch (NoSuchMethodError unused) {
                f2568a = false;
            }
        }
        return view.getAlpha();
    }

    public void q(View view, float f2) {
        if (f2568a) {
            try {
                y.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2568a = false;
            }
        }
        view.setAlpha(f2);
    }

    public void r(View view, int i) {
        if (!f2570c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2569b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2570c = true;
        }
        Field field = f2569b;
        if (field != null) {
            try {
                f2569b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
