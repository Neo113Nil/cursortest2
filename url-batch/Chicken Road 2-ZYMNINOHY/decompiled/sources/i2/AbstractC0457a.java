package i2;

import E.AbstractC0005f;
import E.K;
import E0.e;
import G3.j;
import T.E;
import T3.c;
import T3.d;
import T3.n;
import Y.h;
import a.AbstractC0124a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import c2.m;
import d3.g;
import d3.s;
import d3.u;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import l1.C1245B;
import l1.t;
import o1.AbstractC1325a;
import o3.InterfaceC1339l;
import t3.C1443c;
import w3.AbstractC1510g;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0457a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f9312a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f9313b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f9314c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f9315d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f9316e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f9317f;

    /* renamed from: g, reason: collision with root package name */
    public static long f9318g;

    /* renamed from: h, reason: collision with root package name */
    public static Method f9319h;

    /* renamed from: i, reason: collision with root package name */
    public static Method f9320i;

    /* renamed from: j, reason: collision with root package name */
    public static Method f9321j;

    public static void A(Window window, boolean z) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            K.d(window, z);
        } else {
            if (i4 >= 30) {
                K.c(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static Set B(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return s.f8335a;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(u.z(objArr.length));
            g.W(objArr, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(objArr[0]);
        i.d(singleton, "singleton(...)");
        return singleton;
    }

    public static final c C(Socket socket) {
        Logger logger = n.f2990a;
        T3.u uVar = new T3.u(socket);
        OutputStream outputStream = socket.getOutputStream();
        i.d(outputStream, "getOutputStream()");
        return new c(uVar, new c(outputStream, uVar));
    }

    public static final d D(Socket socket) {
        Logger logger = n.f2990a;
        T3.u uVar = new T3.u(socket);
        InputStream inputStream = socket.getInputStream();
        i.d(inputStream, "getInputStream()");
        return new d(uVar, 0, new d(inputStream, 1, uVar));
    }

    public static String E(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static void F(int i4, Object[] objArr) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(AbstractC0005f.j(i5, "at index "));
            }
        }
    }

    public static boolean G(byte b4) {
        return b4 > -65;
    }

    public static void c(long j4, String str) {
        if (j4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j4 + ") must be >= 0");
    }

    public static void d(int i4) {
        if (2 > i4 || i4 >= 37) {
            StringBuilder r4 = AbstractC0005f.r(i4, "radix ", " was not in valid range ");
            r4.append(new C1443c(2, 36, 1));
            throw new IllegalArgumentException(r4.toString());
        }
    }

    public static void e(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void f(h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int h(C1245B c1245b, e eVar, View view, View view2, t tVar, boolean z) {
        if (tVar.p() == 0 || c1245b.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return Math.min(eVar.f(), eVar.b(view2) - eVar.c(view));
        }
        ((l1.u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int i(C1245B c1245b, e eVar, View view, View view2, t tVar, boolean z) {
        if (tVar.p() == 0 || c1245b.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c1245b.a();
        }
        eVar.b(view2);
        eVar.c(view);
        ((l1.u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static String j(Object value, String str) {
        i.e(value, "value");
        return str + " value: " + value;
    }

    public static void k(String str, String str2, Object obj) {
        String r4 = r(str);
        if (Log.isLoggable(r4, 3)) {
            Log.d(r4, String.format(str2, obj));
        }
    }

    public static int l(int i4, int i5, String str, boolean z) {
        while (i4 < i5) {
            int i6 = i4 + 1;
            char charAt = str.charAt(i4);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt <= '9' && '0' <= charAt) || ((charAt <= 'z' && 'a' <= charAt) || ((charAt <= 'Z' && 'A' <= charAt) || charAt == ':'))) == (!z)) {
                return i4;
            }
            i4 = i6;
        }
        return i5;
    }

    public static void o(String str, String str2, Exception exc) {
        String r4 = r(str);
        if (Log.isLoggable(r4, 6)) {
            Log.e(r4, str2, exc);
        }
    }

    public static final boolean p(char c4, char c5, boolean z) {
        if (c4 == c5) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c4);
        char upperCase2 = Character.toUpperCase(c5);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static InvocationHandler q() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static String r(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static void s(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final boolean t(AssertionError assertionError) {
        Logger logger = n.f2990a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC1510g.c0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static boolean u() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1325a.c();
        }
        try {
            if (f9319h == null) {
                f9318g = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f9319h = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f9319h.invoke(null, Long.valueOf(f9318g))).booleanValue();
        } catch (Exception e4) {
            s("isTagEnabled", e4);
            return false;
        }
    }

    public static boolean v(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f9314c == null) {
            f9314c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f9314c.booleanValue();
        if (f9315d == null) {
            f9315d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!f9315d.booleanValue()) {
            return false;
        }
        int i4 = Build.VERSION.SDK_INT;
        return i4 < 26 || i4 >= 30;
    }

    public static final boolean w(char c4) {
        return Character.isWhitespace(c4) || Character.isSpaceChar(c4);
    }

    public static long x(int i4, String str) {
        int l4 = l(0, i4, str, false);
        Matcher matcher = j.f920m.matcher(str);
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        while (l4 < i4) {
            int l5 = l(l4 + 1, i4, str, true);
            matcher.region(l4, l5);
            if (i6 == -1 && matcher.usePattern(j.f920m).matches()) {
                String group = matcher.group(1);
                i.d(group, "matcher.group(1)");
                i6 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                i.d(group2, "matcher.group(2)");
                i9 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                i.d(group3, "matcher.group(3)");
                i10 = Integer.parseInt(group3);
            } else if (i7 == -1 && matcher.usePattern(j.f919l).matches()) {
                String group4 = matcher.group(1);
                i.d(group4, "matcher.group(1)");
                i7 = Integer.parseInt(group4);
            } else {
                if (i8 == -1) {
                    Pattern pattern = j.f918k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        i.d(group5, "matcher.group(1)");
                        Locale US = Locale.US;
                        i.d(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        i.d(pattern2, "MONTH_PATTERN.pattern()");
                        i8 = AbstractC1510g.h0(pattern2, lowerCase, 0, 6) / 4;
                    }
                }
                if (i5 == -1 && matcher.usePattern(j.f917j).matches()) {
                    String group6 = matcher.group(1);
                    i.d(group6, "matcher.group(1)");
                    i5 = Integer.parseInt(group6);
                }
            }
            l4 = l(l5 + 1, i4, str, false);
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
        GregorianCalendar gregorianCalendar = new GregorianCalendar(H3.b.f1106d);
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

    public static final boolean y(String method) {
        i.e(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public b2.c a(Context context, Looper looper, L1.h hVar, Object obj, b2.g gVar, b2.h hVar2) {
        return b(context, looper, hVar, obj, (m) gVar, (m) hVar2);
    }

    public b2.c b(Context context, Looper looper, L1.h hVar, Object obj, m mVar, m mVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract Object g();

    public E m(H0.a aVar) {
        ByteBuffer byteBuffer = aVar.f3781e;
        byteBuffer.getClass();
        AbstractC0124a.h(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return n(aVar, byteBuffer);
    }

    public abstract E n(H0.a aVar, ByteBuffer byteBuffer);

    public abstract AbstractC0457a z(String str, InterfaceC1339l interfaceC1339l);
}
