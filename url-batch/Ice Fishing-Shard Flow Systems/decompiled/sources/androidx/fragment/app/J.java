package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import u.C0939j;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final C0939j f3589b = new C0939j(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f3590a;

    public J(Q q4) {
        this.f3590a = q4;
    }

    public static Class b(ClassLoader classLoader, String str) {
        C0939j c0939j = f3589b;
        C0939j c0939j2 = (C0939j) c0939j.get(classLoader);
        if (c0939j2 == null) {
            c0939j2 = new C0939j(0);
            c0939j.put(classLoader, c0939j2);
        }
        Class cls = (Class) c0939j2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0939j2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e7) {
            throw new E1.i(r4.f.d("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e7);
        } catch (ClassNotFoundException e8) {
            throw new E1.i(r4.f.d("Unable to instantiate fragment ", str, ": make sure class name exists"), e8);
        }
    }

    public final ComponentCallbacksC0228t a(String str) {
        try {
            return (ComponentCallbacksC0228t) c(this.f3590a.f3633v.f3823e.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e7) {
            throw new E1.i(r4.f.d("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (InstantiationException e8) {
            throw new E1.i(r4.f.d("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e8);
        } catch (NoSuchMethodException e9) {
            throw new E1.i(r4.f.d("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e9);
        } catch (InvocationTargetException e10) {
            throw new E1.i(r4.f.d("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e10);
        }
    }
}
