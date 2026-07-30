package A6;

import java.util.Iterator;
import k6.InterfaceC0608c;
import kotlin.jvm.internal.C0643h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import z6.O;
import z6.P;
import z6.d0;

/* loaded from: classes.dex */
public final class t implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f136a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final O f137b;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    static {
        x6.c kind = x6.c.j;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.z("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object obj = P.f8753a;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Iterator it = P.f8753a.keySet().iterator();
        while (it.hasNext()) {
            String b7 = ((C0643h) ((InterfaceC0608c) it.next())).b();
            Intrinsics.b(b7);
            String a7 = P.a(b7);
            if ("kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase("kotlin." + a7) || "kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase(a7)) {
                throw new IllegalArgumentException(kotlin.text.j.b("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + P.a(a7) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f137b = new O("kotlinx.serialization.json.JsonLiteral", kind);
    }

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        l d02 = P0.f.d(decoder).d0();
        if (d02 instanceof s) {
            return (s) d02;
        }
        throw B6.m.b(-1, "Unexpected JSON element, expected JsonLiteral, had " + E.a(d02.getClass()), d02.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    @Override // w6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(B6.t encoder, Object obj) {
        Double d7;
        s value = (s) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        P0.f.b(encoder);
        boolean z7 = value.f134d;
        String str = value.f135e;
        if (z7) {
            encoder.o(str);
            return;
        }
        Long I7 = StringsKt.I(str);
        if (I7 != null) {
            encoder.k(I7.longValue());
            return;
        }
        R5.A e7 = kotlin.text.u.e(str);
        if (e7 != null) {
            long j = e7.f2401d;
            Intrinsics.checkNotNullParameter(R5.A.f2400e, "<this>");
            encoder.h(d0.f8778b).k(j);
            return;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Boolean bool = null;
        if (kotlin.text.o.d(str)) {
            d7 = Double.valueOf(Double.parseDouble(str));
            if (d7 == null) {
                encoder.e(d7.doubleValue());
                return;
            }
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.equals("true")) {
                bool = Boolean.TRUE;
            } else if (str.equals("false")) {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                encoder.b(bool.booleanValue());
                return;
            } else {
                encoder.o(str);
                return;
            }
        }
        d7 = null;
        if (d7 == null) {
        }
    }

    @Override // w6.a
    public final x6.e c() {
        return f137b;
    }
}
