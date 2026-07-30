package com.baidu.ar;

import com.baidu.ar.constants.HttpConstants;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import orgar.slf4j.impl.StaticLoggerBinder;

/* loaded from: classes.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f2328a;

    /* renamed from: b, reason: collision with root package name */
    public static final jc f2329b = new jc();

    /* renamed from: c, reason: collision with root package name */
    public static final f9 f2330c = new f9();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2331d = jd.b("slf4j.detectLoggerNameMismatch");

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f2332e = {"1.6", "1.7"};

    /* renamed from: f, reason: collision with root package name */
    public static String f2333f = "orgar/slf4j/impl/StaticLoggerBinder.class";

    public static f8 a(Class<?> cls) {
        Class<?> a8;
        f8 a9 = a(cls.getName());
        if (f2331d && (a8 = jd.a()) != null && a(cls, a8)) {
            jd.a(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", a9.getName(), a8.getName()));
            jd.a("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return a9;
    }

    public static void b() {
        jd.a("The following set of substitute loggers may have been accessed");
        jd.a("during the initialization phase. Logging calls during this");
        jd.a("phase were not honored. However, subsequent logging calls to these");
        jd.a("loggers will work as normally expected.");
        jd.a("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    public static Set<URL> c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = g8.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f2333f) : classLoader.getResources(f2333f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e8) {
            jd.a("Error getting resources from path", e8);
        }
        return linkedHashSet;
    }

    public static void d() {
        jc jcVar = f2329b;
        synchronized (jcVar) {
            try {
                jcVar.d();
                for (ic icVar : jcVar.c()) {
                    icVar.a(a(icVar.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static i6 e() {
        if (f2328a == 0) {
            synchronized (g8.class) {
                try {
                    if (f2328a == 0) {
                        f2328a = 1;
                        g();
                    }
                } finally {
                }
            }
        }
        int i8 = f2328a;
        if (i8 == 1) {
            return f2329b;
        }
        if (i8 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i8 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i8 == 4) {
            return f2330c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static boolean f() {
        String c8 = jd.c("java.vendor.url");
        if (c8 == null) {
            return false;
        }
        return c8.toLowerCase().contains(HttpConstants.OS_TYPE_VALUE);
    }

    public static final void g() {
        a();
        if (f2328a == 3) {
            i();
        }
    }

    public static void h() {
        LinkedBlockingQueue<kc> b8 = f2329b.b();
        int size = b8.size();
        ArrayList<kc> arrayList = new ArrayList(128);
        int i8 = 0;
        while (b8.drainTo(arrayList, 128) != 0) {
            for (kc kcVar : arrayList) {
                a(kcVar);
                int i9 = i8 + 1;
                if (i8 == 0) {
                    a(kcVar, size);
                }
                i8 = i9;
            }
            arrayList.clear();
        }
    }

    public static final void i() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z7 = false;
            for (String str2 : f2332e) {
                if (str.startsWith(str2)) {
                    z7 = true;
                }
            }
            if (z7) {
                return;
            }
            jd.a("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f2332e).toString());
            jd.a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            jd.a("Unexpected problem occured during version sanity check", th);
        }
    }

    public static f8 a(String str) {
        return e().a(str);
    }

    public static void b(Set<URL> set) {
        if (set == null || !a(set)) {
            return;
        }
        jd.a("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    public static void c(Set<URL> set) {
        if (a(set)) {
            jd.a("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                jd.a("Found binding in [" + it.next() + "]");
            }
            jd.a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void a() {
        Set<URL> set;
        try {
            if (f()) {
                set = null;
            } else {
                set = c();
                c(set);
            }
            StaticLoggerBinder.getSingleton();
            f2328a = 3;
            b(set);
            d();
            h();
            f2329b.a();
        } catch (Exception e8) {
            a(e8);
            throw new IllegalStateException("Unexpected initialization failure", e8);
        } catch (NoClassDefFoundError e9) {
            if (!b(e9.getMessage())) {
                a(e9);
                throw e9;
            }
            f2328a = 4;
            jd.a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            jd.a("Defaulting to no-operation (NOP) logger implementation");
            jd.a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f2328a = 2;
                jd.a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                jd.a("Your binding is version 1.5.5 or earlier.");
                jd.a("Upgrade your binding to version 1.6.x.");
            }
            throw e10;
        }
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("orgar/slf4j/impl/StaticLoggerBinder") || str.contains("orgar.slf4j.impl.StaticLoggerBinder");
    }

    public static void a(int i8) {
        jd.a("A number (" + i8 + ") of logging calls during the initialization phase have been intercepted and are");
        jd.a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        jd.a("See also http://www.slf4j.org/codes.html#replay");
    }

    public static void a(kc kcVar) {
        if (kcVar == null) {
            return;
        }
        ic a8 = kcVar.a();
        String name = a8.getName();
        if (a8.f()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (a8.e()) {
            return;
        }
        if (a8.d()) {
            a8.a(kcVar);
        } else {
            jd.a(name);
        }
    }

    public static void a(kc kcVar, int i8) {
        if (kcVar.a().d()) {
            a(i8);
        } else {
            if (kcVar.a().e()) {
                return;
            }
            b();
        }
    }

    public static void a(Throwable th) {
        f2328a = 2;
        jd.a("Failed to instantiate SLF4J LoggerFactory", th);
    }

    public static boolean a(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    public static boolean a(Set<URL> set) {
        return set.size() > 1;
    }
}
