package com.baidu.ar;

import java.io.PrintStream;

/* loaded from: classes.dex */
public final class jd {

    /* renamed from: a, reason: collision with root package name */
    public static b f2619a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2620b = false;

    public static final class b extends SecurityManager {
        public b() {
        }

        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static Class<?> a() {
        int i8;
        b b8 = b();
        if (b8 == null) {
            return null;
        }
        Class<?>[] classContext = b8.getClassContext();
        String name = jd.class.getName();
        int i9 = 0;
        while (i9 < classContext.length && !name.equals(classContext[i9].getName())) {
            i9++;
        }
        if (i9 >= classContext.length || (i8 = i9 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i8];
    }

    public static b b() {
        b bVar = f2619a;
        if (bVar != null) {
            return bVar;
        }
        if (f2620b) {
            return null;
        }
        b c8 = c();
        f2619a = c8;
        f2620b = true;
        return c8;
    }

    public static b c() {
        try {
            return new b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final void a(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static boolean b(String str) {
        String c8 = c(str);
        if (c8 == null) {
            return false;
        }
        return c8.equalsIgnoreCase("true");
    }

    public static String c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final void a(String str, Throwable th) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th.printStackTrace();
    }
}
