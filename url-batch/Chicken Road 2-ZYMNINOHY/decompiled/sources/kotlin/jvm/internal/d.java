package kotlin.jvm.internal;

import c3.C0292d;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o3.InterfaceC1328a;
import o3.InterfaceC1329b;
import o3.InterfaceC1330c;
import o3.InterfaceC1331d;
import o3.InterfaceC1332e;
import o3.InterfaceC1333f;
import o3.InterfaceC1334g;
import o3.InterfaceC1335h;
import o3.InterfaceC1336i;
import o3.InterfaceC1337j;
import o3.InterfaceC1338k;
import o3.InterfaceC1339l;
import o3.InterfaceC1340m;
import o3.InterfaceC1341n;
import o3.t;
import o3.u;
import o3.v;
import o3.w;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class d implements u3.c, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f14152b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f14153a;

    static {
        List W4 = d3.j.W(InterfaceC1328a.class, InterfaceC1339l.class, o3.p.class, o3.q.class, o3.r.class, o3.s.class, t.class, u.class, v.class, w.class, InterfaceC1329b.class, InterfaceC1330c.class, InterfaceC1331d.class, InterfaceC1332e.class, InterfaceC1333f.class, InterfaceC1334g.class, InterfaceC1335h.class, InterfaceC1336i.class, InterfaceC1337j.class, InterfaceC1338k.class, InterfaceC1340m.class, InterfaceC1341n.class, o3.o.class);
        ArrayList arrayList = new ArrayList(d3.k.Y(W4));
        int i4 = 0;
        for (Object obj : W4) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                d3.j.X();
                throw null;
            }
            arrayList.add(new C0292d((Class) obj, Integer.valueOf(i4)));
            i4 = i5;
        }
        f14152b = d3.t.F(arrayList);
    }

    public d(Class jClass) {
        i.e(jClass, "jClass");
        this.f14153a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f14153a;
    }

    public final String b() {
        String d4;
        Class jClass = this.f14153a;
        i.e(jClass, "jClass");
        String str = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String d5 = s.d(jClass.getName());
                return d5 == null ? jClass.getSimpleName() : d5;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (d4 = s.d(componentType.getName())) != null) {
                str = d4.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC1510g.p0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return AbstractC1510g.p0(simpleName, enclosingConstructor.getName() + '$');
        }
        int g02 = AbstractC1510g.g0(simpleName, '$', 0, 6);
        if (g02 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(g02 + 1, simpleName.length());
        i.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && AbstractC0347t0.k(this).equals(AbstractC0347t0.k((u3.c) obj));
    }

    public final int hashCode() {
        return AbstractC0347t0.k(this).hashCode();
    }

    public final String toString() {
        return this.f14153a.toString() + " (Kotlin reflection is not available)";
    }
}
