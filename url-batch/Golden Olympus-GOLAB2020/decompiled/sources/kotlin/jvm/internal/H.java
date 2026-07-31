package kotlin.jvm.internal;

import java.util.Collections;

/* loaded from: classes3.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private static final I f41133a;

    /* renamed from: b, reason: collision with root package name */
    private static final m2.c[] f41134b;

    static {
        I i4 = null;
        try {
            i4 = (I) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (i4 == null) {
            i4 = new I();
        }
        f41133a = i4;
        f41134b = new m2.c[0];
    }

    public static m2.f a(o oVar) {
        return f41133a.a(oVar);
    }

    public static m2.c b(Class cls) {
        return f41133a.b(cls);
    }

    public static m2.e c(Class cls) {
        return f41133a.c(cls, "");
    }

    public static m2.g d(u uVar) {
        return f41133a.d(uVar);
    }

    public static m2.k e(Class cls) {
        return f41133a.i(b(cls), Collections.EMPTY_LIST, true);
    }

    public static m2.i f(y yVar) {
        return f41133a.e(yVar);
    }

    public static m2.j g(A a4) {
        return f41133a.f(a4);
    }

    public static String h(InterfaceC3248n interfaceC3248n) {
        return f41133a.g(interfaceC3248n);
    }

    public static String i(s sVar) {
        return f41133a.h(sVar);
    }
}
