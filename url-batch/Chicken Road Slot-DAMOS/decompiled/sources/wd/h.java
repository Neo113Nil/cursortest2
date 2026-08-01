package wd;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements ce.b, f {

    /* renamed from: b, reason: collision with root package name */
    public static final g f10153b = new g(null);

    /* renamed from: c, reason: collision with root package name */
    public static final Map f10154c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f10155a;

    static {
        List f3 = kotlin.collections.y.f(Function0.class, Function1.class, Function2.class, vd.n.class, vd.o.class, vd.p.class, vd.q.class, vd.r.class, vd.s.class, vd.t.class, vd.a.class, vd.b.class, vd.c.class, vd.d.class, vd.e.class, vd.f.class, vd.g.class, vd.h.class, vd.i.class, vd.j.class, vd.k.class, vd.l.class, vd.m.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.z.j(f3, 10));
        int i3 = 0;
        for (Object obj : f3) {
            int i10 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.y.i();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i3)));
            i3 = i10;
        }
        f10154c = p0.g(arrayList);
    }

    public h(Class cls) {
        cls.getClass();
        this.f10155a = cls;
    }

    @Override // wd.f
    public final Class a() {
        return this.f10155a;
    }

    public final String b() {
        String a9;
        f10153b.getClass();
        Class cls = this.f10155a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String a10 = g.a(cls.getName());
            return a10 == null ? cls.getCanonicalName() : a10;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (a9 = g.a(componentType.getName())) != null) {
            str = a9.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String c() {
        String b10;
        f10153b.getClass();
        Class cls = this.f10155a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String b11 = g.b(cls.getName());
                return b11 == null ? cls.getSimpleName() : b11;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (b10 = g.b(componentType.getName())) != null) {
                str = b10.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return StringsKt.w(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int q3 = StringsKt.q(simpleName, '$', 0, 6);
            return q3 == -1 ? simpleName : simpleName.substring(q3 + 1, simpleName.length());
        }
        return StringsKt.w(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean d(Object obj) {
        f10153b.getClass();
        Class cls = this.f10155a;
        cls.getClass();
        Map map = f10154c;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return g0.d(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = a.a.E(c0.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h) && a.a.E(this).equals(a.a.E((ce.b) obj));
    }

    public final int hashCode() {
        return a.a.E(this).hashCode();
    }

    public final String toString() {
        return this.f10155a.toString() + " (Kotlin reflection is not available)";
    }
}
