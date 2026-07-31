package a6;

import kotlin.jvm.internal.i;
import l6.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f261a;

    static {
        a aVar;
        Object newInstance;
        Object newInstance2;
        int a7 = a();
        if (a7 >= 65544 || a7 < 65536) {
            try {
                newInstance = c6.a.class.newInstance();
                i.c(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                    } catch (ClassCastException e7) {
                        ClassLoader classLoader = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader2 = a.class.getClassLoader();
                        if (i.a(classLoader, classLoader2)) {
                            throw e7;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e7);
                    }
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                i.c(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) newInstance3;
                } catch (ClassCastException e8) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = a.class.getClassLoader();
                    if (i.a(classLoader3, classLoader4)) {
                        throw e8;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e8);
                }
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            aVar = (a) newInstance;
            f261a = aVar;
        }
        if (a7 >= 65543 || a7 < 65536) {
            try {
                try {
                    newInstance2 = b6.a.class.newInstance();
                    i.c(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                    } catch (ClassCastException e9) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = a.class.getClassLoader();
                        if (i.a(classLoader5, classLoader6)) {
                            throw e9;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e9);
                    }
                } catch (ClassNotFoundException unused3) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    i.c(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        aVar = (a) newInstance4;
                    } catch (ClassCastException e10) {
                        ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader8 = a.class.getClassLoader();
                        if (i.a(classLoader7, classLoader8)) {
                            throw e10;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e10);
                    }
                }
            } catch (ClassNotFoundException unused4) {
            }
            if (newInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            aVar = (a) newInstance2;
            f261a = aVar;
        }
        aVar = new a();
        f261a = aVar;
    }

    private static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int z6 = n.z(property, '.', 0, false, 6, null);
        if (z6 < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i7 = z6 + 1;
        int z7 = n.z(property, '.', i7, false, 4, null);
        if (z7 < 0) {
            z7 = property.length();
        }
        String substring = property.substring(0, z6);
        i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = property.substring(i7, z7);
        i.c(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
