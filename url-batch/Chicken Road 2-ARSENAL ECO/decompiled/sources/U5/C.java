package U5;

import l5.AbstractC0505i;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class C implements Q5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C f2630a = new C();

    /* renamed from: b, reason: collision with root package name */
    public static final R5.f f2631b;

    static {
        R5.c cVar = R5.c.f2156j;
        R5.e[] eVarArr = new R5.e[0];
        if (F5.j.T("kotlinx.serialization.json.JsonPrimitive")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (cVar.equals(R5.i.f2172b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        R5.a aVar = new R5.a("kotlinx.serialization.json.JsonPrimitive");
        f2631b = new R5.f("kotlinx.serialization.json.JsonPrimitive", cVar, aVar.f2142b.size(), AbstractC0505i.M(eVarArr), aVar);
    }

    @Override // Q5.a
    public final void a(V5.s sVar, Object obj) {
        B value = (B) obj;
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC0521b.a(sVar);
        if (value instanceof u) {
            sVar.m(v.f2670a, u.INSTANCE);
        } else {
            sVar.m(s.f2667a, (r) value);
        }
    }

    @Override // Q5.a
    public final Object b(S5.b bVar) {
        k o02 = AbstractC0521b.b(bVar).o0();
        if (o02 instanceof B) {
            return (B) o02;
        }
        throw V5.n.b(-1, o02.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.t.a(o02.getClass()));
    }

    @Override // Q5.a
    public final R5.e c() {
        return f2631b;
    }
}
