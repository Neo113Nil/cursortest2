package U5;

import m1.AbstractC0521b;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class o implements Q5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o f2662a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final R5.f f2663b = AbstractC0676f.d("kotlinx.serialization.json.JsonElement", R5.b.f2147b, new R5.e[0], n.f2659g);

    @Override // Q5.a
    public final void a(V5.s sVar, Object obj) {
        k value = (k) obj;
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC0521b.a(sVar);
        if (value instanceof B) {
            sVar.m(C.f2630a, value);
        } else if (value instanceof x) {
            sVar.m(z.f2676a, value);
        } else if (value instanceof e) {
            sVar.m(g.f2642a, value);
        }
    }

    @Override // Q5.a
    public final Object b(S5.b bVar) {
        return AbstractC0521b.b(bVar).o0();
    }

    @Override // Q5.a
    public final R5.e c() {
        return f2663b;
    }
}
