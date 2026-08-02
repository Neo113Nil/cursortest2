package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class bkv {
    private static void a(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(String.valueOf(cls))), exc);
    }

    public static bkt c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                a(cls, e);
            } catch (InstantiationException e2) {
                a(cls, e2);
            } catch (NoSuchMethodException e3) {
                a(cls, e3);
            } catch (InvocationTargetException e4) {
                a(cls, e4);
            }
            if (obj instanceof bkt) {
                return (bkt) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(String.valueOf(obj))));
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }
}
