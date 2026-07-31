package U5;

import T5.O;
import T5.P;
import T5.d0;
import java.util.Iterator;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class s implements Q5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final s f2667a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final O f2668b;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    static {
        R5.c cVar = R5.c.f2156j;
        if (F5.j.T("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Iterator it = P.f2401a.keySet().iterator();
        while (it.hasNext()) {
            String b7 = ((kotlin.jvm.internal.d) ((D5.c) it.next())).b();
            kotlin.jvm.internal.i.b(b7);
            String a7 = P.a(b7);
            if ("kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase("kotlin." + a7) || "kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase(a7)) {
                throw new IllegalArgumentException(F5.k.y("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + P.a(a7) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f2668b = new O("kotlinx.serialization.json.JsonLiteral", cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // Q5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(V5.s sVar, Object obj) {
        Double d7;
        r value = (r) obj;
        kotlin.jvm.internal.i.e(value, "value");
        String str = value.f2666g;
        AbstractC0521b.a(sVar);
        if (value.f2665f) {
            sVar.o(str);
            return;
        }
        Long K6 = F5.q.K(str);
        if (K6 != null) {
            sVar.k(K6.longValue());
            return;
        }
        k5.q k0 = A3.c.k0(str);
        if (k0 != null) {
            sVar.h(d0.f2426b).k(k0.f5214f);
            return;
        }
        Boolean bool = null;
        if (F5.p.A(str)) {
            d7 = Double.valueOf(Double.parseDouble(str));
            if (d7 == null) {
                sVar.e(d7.doubleValue());
                return;
            }
            if (str.equals("true")) {
                bool = Boolean.TRUE;
            } else if (str.equals("false")) {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                sVar.b(bool.booleanValue());
                return;
            } else {
                sVar.o(str);
                return;
            }
        }
        d7 = null;
        if (d7 == null) {
        }
    }

    @Override // Q5.a
    public final Object b(S5.b bVar) {
        k o02 = AbstractC0521b.b(bVar).o0();
        if (o02 instanceof r) {
            return (r) o02;
        }
        throw V5.n.b(-1, o02.toString(), "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.t.a(o02.getClass()));
    }

    @Override // Q5.a
    public final R5.e c() {
        return f2668b;
    }
}
