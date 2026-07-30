package kotlin.jvm.internal;

import E7.v;
import E7.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q7.C4938g;
import r7.AbstractC4980k;
import r7.AbstractC4981l;

/* loaded from: classes2.dex */
public final class d implements K7.c, c {

    /* renamed from: u, reason: collision with root package name */
    public static final Map f38853u;

    /* renamed from: n, reason: collision with root package name */
    public final Class f38854n;

    static {
        List B8 = AbstractC4980k.B(E7.a.class, E7.l.class, E7.p.class, E7.q.class, E7.r.class, E7.s.class, E7.t.class, E7.u.class, v.class, w.class, E7.b.class, E7.c.class, E7.d.class, E7.e.class, E7.f.class, E7.g.class, E7.h.class, E7.i.class, E7.j.class, E7.k.class, E7.m.class, E7.n.class, E7.o.class);
        ArrayList arrayList = new ArrayList(AbstractC4981l.E(B8, 10));
        int i = 0;
        for (Object obj : B8) {
            int i4 = i + 1;
            if (i < 0) {
                AbstractC4980k.D();
                throw null;
            }
            arrayList.add(new C4938g((Class) obj, Integer.valueOf(i)));
            i = i4;
        }
        f38853u = r7.t.D(arrayList);
    }

    public d(Class jClass) {
        h.e(jClass, "jClass");
        this.f38854n = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f38854n;
    }

    public final String b() {
        String j9;
        Class jClass = this.f38854n;
        h.e(jClass, "jClass");
        String str = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String j10 = h.j(jClass.getName());
                return j10 == null ? jClass.getSimpleName() : j10;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (j9 = h.j(componentType.getName())) != null) {
                str = j9.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return M7.j.e0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return M7.j.e0(simpleName, enclosingConstructor.getName() + '$');
        }
        int Q3 = M7.j.Q(simpleName, '$', 0, 6);
        if (Q3 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(Q3 + 1, simpleName.length());
        h.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && S0.f.i(this).equals(S0.f.i((K7.c) obj));
    }

    public final int hashCode() {
        return S0.f.i(this).hashCode();
    }

    public final String toString() {
        return this.f38854n.toString() + " (Kotlin reflection is not available)";
    }
}
