package Q4;

import P4.N;
import P4.O;
import P4.c0;
import f4.C0440q;
import java.util.Iterator;
import n2.AbstractC1341c;
import z4.InterfaceC1586c;

/* loaded from: classes.dex */
public final class t implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f2558a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final N f2559b;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    static {
        N4.c cVar = N4.c.f2173j;
        if (B4.k.Z("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Iterator it = O.f2338a.keySet().iterator();
        while (it.hasNext()) {
            String b6 = ((kotlin.jvm.internal.d) ((InterfaceC1586c) it.next())).b();
            kotlin.jvm.internal.i.b(b6);
            String a6 = O.a(b6);
            if ("kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase("kotlin." + a6) || "kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase(a6)) {
                throw new IllegalArgumentException(B4.l.E("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + O.a(a6) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f2559b = new N("kotlinx.serialization.json.JsonLiteral", cVar);
    }

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        l z02 = AbstractC1341c.c(decoder).z0();
        if (z02 instanceof s) {
            return (s) z02;
        }
        throw R4.m.b(-1, "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.t.a(z02.getClass()), z02.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    @Override // M4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(R4.s sVar, Object obj) {
        Double d6;
        s value = (s) obj;
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC1341c.a(sVar);
        boolean z = value.f2555a;
        String str = value.f2557c;
        if (z) {
            sVar.o(str);
            return;
        }
        N4.e eVar = value.f2556b;
        if (eVar != null) {
            sVar.h(eVar).o(str);
            return;
        }
        Long Q5 = B4.r.Q(str);
        if (Q5 != null) {
            sVar.k(Q5.longValue());
            return;
        }
        C0440q L5 = AbstractC1341c.L(str);
        if (L5 != null) {
            sVar.h(c0.f2361b).k(L5.f5684a);
            return;
        }
        Boolean bool = null;
        if (B4.q.G(str)) {
            d6 = Double.valueOf(Double.parseDouble(str));
            if (d6 == null) {
                sVar.e(d6.doubleValue());
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
        d6 = null;
        if (d6 == null) {
        }
    }

    @Override // M4.a
    public final N4.e c() {
        return f2559b;
    }
}
