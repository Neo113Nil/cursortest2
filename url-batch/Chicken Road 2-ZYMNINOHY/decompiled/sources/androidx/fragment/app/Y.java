package androidx.fragment.app;

import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: b, reason: collision with root package name */
    public static final p.j f4785b = new p.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f4786a;

    public Y(f0 f0Var) {
        this.f4786a = f0Var;
    }

    public static Class a(ClassLoader classLoader, String str) {
        p.j jVar = f4785b;
        p.j jVar2 = (p.j) jVar.get(classLoader);
        if (jVar2 == null) {
            jVar2 = new p.j(0);
            jVar.put(classLoader, jVar2);
        }
        Class cls = (Class) jVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        jVar2.put(str, cls2);
        return cls2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e4) {
            throw new G1.a(AbstractC1514c.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e4);
        } catch (ClassNotFoundException e5) {
            throw new G1.a(AbstractC1514c.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e5);
        }
    }
}
