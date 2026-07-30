package kotlin.jvm.internal;

import a.AbstractC0169a;
import e6.InterfaceC0377a;
import e6.InterfaceC0378b;
import e6.InterfaceC0379c;
import e6.InterfaceC0380d;
import e6.InterfaceC0381e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k6.InterfaceC0608c;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* renamed from: kotlin.jvm.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643h implements InterfaceC0608c, InterfaceC0641f {

    /* renamed from: e, reason: collision with root package name */
    public static final C0642g f6160e = new C0642g(null);

    /* renamed from: i, reason: collision with root package name */
    public static final Map f6161i;

    /* renamed from: d, reason: collision with root package name */
    public final Class f6162d;

    static {
        List d7 = kotlin.collections.r.d(Function0.class, Function1.class, Function2.class, e6.n.class, e6.o.class, e6.p.class, e6.q.class, e6.r.class, e6.s.class, e6.t.class, InterfaceC0377a.class, InterfaceC0378b.class, InterfaceC0379c.class, InterfaceC0380d.class, InterfaceC0381e.class, e6.f.class, e6.g.class, e6.h.class, e6.i.class, e6.j.class, e6.k.class, e6.l.class, e6.m.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.s.g(d7, 10));
        int i2 = 0;
        for (Object obj : d7) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.r.f();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i2)));
            i2 = i5;
        }
        f6161i = kotlin.collections.I.h(arrayList);
    }

    public C0643h(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f6162d = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC0641f
    public final Class a() {
        return this.f6162d;
    }

    public final String b() {
        f6160e.getClass();
        Class jClass = this.f6162d;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String str = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String name = jClass.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                String b7 = C0642g.b(name);
                return b7 == null ? jClass.getSimpleName() : b7;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive()) {
                String name2 = componentType.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                String b8 = C0642g.b(name2);
                if (b8 != null) {
                    str = b8.concat("Array");
                }
            }
            return str == null ? "Array" : str;
        }
        String missingDelimiterValue = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            String H7 = StringsKt.H(missingDelimiterValue, enclosingMethod.getName() + '$');
            if (H7 != null) {
                return H7;
            }
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return StringsKt.H(missingDelimiterValue, enclosingConstructor.getName() + '$');
        }
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int x7 = StringsKt.x(missingDelimiterValue, '$', 0, 6);
        if (x7 == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(x7 + 1, missingDelimiterValue.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final boolean c(Object obj) {
        f6160e.getClass();
        Class jClass = this.f6162d;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Map map = f6161i;
        Intrinsics.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return I.c(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            Intrinsics.checkNotNullParameter(jClass, "<this>");
            jClass = AbstractC0169a.k(E.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0643h) && AbstractC0169a.k(this).equals(AbstractC0169a.k((InterfaceC0608c) obj));
    }

    public final int hashCode() {
        return AbstractC0169a.k(this).hashCode();
    }

    public final String toString() {
        return this.f6162d.toString() + " (Kotlin reflection is not available)";
    }
}
