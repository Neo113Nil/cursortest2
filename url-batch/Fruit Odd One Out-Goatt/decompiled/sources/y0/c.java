package y0;

import d1.h;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1251a;

    static {
        b bVar;
        try {
            Object newInstance = a1.b.class.newInstance();
            newInstance.getClass();
            try {
                try {
                    bVar = (b) newInstance;
                } catch (ClassCastException e2) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = b.class.getClassLoader();
                    if (h.a(classLoader, classLoader2)) {
                        throw e2;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e2);
                }
            } catch (ClassNotFoundException unused) {
                Object newInstance2 = z0.b.class.newInstance();
                newInstance2.getClass();
                try {
                    try {
                        bVar = (b) newInstance2;
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader4 = b.class.getClassLoader();
                        if (h.a(classLoader3, classLoader4)) {
                            throw e3;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e3);
                    }
                } catch (ClassNotFoundException unused2) {
                    bVar = new b();
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            newInstance3.getClass();
            try {
                try {
                    bVar = (b) newInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    newInstance4.getClass();
                    try {
                        bVar = (b) newInstance4;
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = b.class.getClassLoader();
                        if (h.a(classLoader5, classLoader6)) {
                            throw e4;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e4);
                    }
                }
            } catch (ClassCastException e5) {
                ClassLoader classLoader7 = newInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = b.class.getClassLoader();
                if (h.a(classLoader7, classLoader8)) {
                    throw e5;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e5);
            }
        }
        f1251a = bVar;
    }
}
