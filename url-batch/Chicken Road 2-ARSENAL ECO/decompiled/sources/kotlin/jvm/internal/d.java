package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k5.C0477g;
import l5.AbstractC0507k;
import l5.AbstractC0508l;
import m1.AbstractC0521b;
import x5.InterfaceC0732a;
import x5.InterfaceC0733b;
import x5.InterfaceC0734c;
import x5.InterfaceC0735d;
import x5.InterfaceC0736e;
import x5.InterfaceC0737f;
import x5.InterfaceC0738g;
import x5.InterfaceC0739h;
import x5.InterfaceC0740i;
import x5.InterfaceC0741j;
import x5.InterfaceC0742k;
import x5.InterfaceC0743l;
import x5.InterfaceC0744m;
import x5.InterfaceC0745n;
import x5.InterfaceC0746o;
import x5.InterfaceC0747p;
import x5.InterfaceC0748q;
import x5.InterfaceC0749r;
import x5.InterfaceC0750s;
import x5.InterfaceC0751t;
import x5.InterfaceC0752u;
import x5.InterfaceC0753v;
import x5.InterfaceC0754w;

/* loaded from: classes.dex */
public final class d implements D5.c, c {

    /* renamed from: g, reason: collision with root package name */
    public static final Map f5227g;

    /* renamed from: f, reason: collision with root package name */
    public final Class f5228f;

    static {
        List z5 = AbstractC0507k.z(InterfaceC0732a.class, InterfaceC0743l.class, InterfaceC0747p.class, InterfaceC0748q.class, InterfaceC0749r.class, InterfaceC0750s.class, InterfaceC0751t.class, InterfaceC0752u.class, InterfaceC0753v.class, InterfaceC0754w.class, InterfaceC0733b.class, InterfaceC0734c.class, InterfaceC0735d.class, InterfaceC0736e.class, InterfaceC0737f.class, InterfaceC0738g.class, InterfaceC0739h.class, InterfaceC0740i.class, InterfaceC0741j.class, InterfaceC0742k.class, InterfaceC0744m.class, InterfaceC0745n.class, InterfaceC0746o.class);
        ArrayList arrayList = new ArrayList(AbstractC0508l.C(z5, 10));
        int i7 = 0;
        for (Object obj : z5) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC0507k.B();
                throw null;
            }
            arrayList.add(new C0477g((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        f5227g = l5.t.t0(arrayList);
    }

    public d(Class jClass) {
        i.e(jClass, "jClass");
        this.f5228f = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f5228f;
    }

    public final String b() {
        String k4;
        Class jClass = this.f5228f;
        i.e(jClass, "jClass");
        String str = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String k7 = i.k(jClass.getName());
                return k7 == null ? jClass.getSimpleName() : k7;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (k4 = i.k(componentType.getName())) != null) {
                str = k4.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return F5.j.e0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return F5.j.e0(simpleName, enclosingConstructor.getName() + '$');
        }
        int Q6 = F5.j.Q(simpleName, '$', 0, 6);
        if (Q6 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(Q6 + 1, simpleName.length());
        i.d(substring, "substring(...)");
        return substring;
    }

    public final boolean c(Object obj) {
        Class jClass = this.f5228f;
        i.e(jClass, "jClass");
        Map map = f5227g;
        i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return v.c(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = AbstractC0521b.n(t.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && AbstractC0521b.n(this).equals(AbstractC0521b.n((D5.c) obj));
    }

    public final int hashCode() {
        return AbstractC0521b.n(this).hashCode();
    }

    public final String toString() {
        return this.f5228f.toString() + " (Kotlin reflection is not available)";
    }
}
