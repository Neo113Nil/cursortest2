package U5;

import l5.AbstractC0505i;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class v implements Q5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f2670a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final R5.f f2671b;

    static {
        R5.h hVar = R5.h.f2171c;
        R5.e[] eVarArr = new R5.e[0];
        if (F5.j.T("kotlinx.serialization.json.JsonNull")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (hVar.equals(R5.i.f2172b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        R5.a aVar = new R5.a("kotlinx.serialization.json.JsonNull");
        f2671b = new R5.f("kotlinx.serialization.json.JsonNull", hVar, aVar.f2142b.size(), AbstractC0505i.M(eVarArr), aVar);
    }

    @Override // Q5.a
    public final void a(V5.s sVar, Object obj) {
        u value = (u) obj;
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC0521b.a(sVar);
        sVar.f2760a.g("null");
    }

    @Override // Q5.a
    public final Object b(S5.b bVar) {
        AbstractC0521b.b(bVar);
        if (bVar.g()) {
            throw new V5.i("Expected 'null' literal");
        }
        return u.INSTANCE;
    }

    @Override // Q5.a
    public final R5.e c() {
        return f2671b;
    }
}
