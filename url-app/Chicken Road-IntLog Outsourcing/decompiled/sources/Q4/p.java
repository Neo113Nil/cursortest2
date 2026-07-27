package Q4;

import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class p implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p f2552a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final N4.f f2553b = e5.g.h("kotlinx.serialization.json.JsonElement", N4.b.f2164b, new N4.e[0], o.f2549f);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return AbstractC1341c.c(decoder).z0();
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        l value = (l) obj;
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC1341c.a(sVar);
        if (value instanceof C) {
            sVar.m(D.f2496a, value);
        } else if (value instanceof y) {
            sVar.m(A.f2494a, value);
        } else if (value instanceof e) {
            sVar.m(g.f2508a, value);
        }
    }

    @Override // M4.a
    public final N4.e c() {
        return f2553b;
    }
}
