package D1;

import h1.C0438i;
import java.util.Arrays;
import java.util.Map;
import k2.AbstractC0546s;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements Y1.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f528d;

    public /* synthetic */ E(int i3) {
        this.f528d = i3;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        CharSequence string$lambda$1;
        switch (this.f528d) {
            case 0:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b2}, 1));
            case 1:
                com.gates.olympus.miruv.data.b bVar = (com.gates.olympus.miruv.data.b) obj;
                Z1.i.f(bVar, "it");
                return bVar.getId();
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                I1.c cVar = (I1.c) obj;
                Z1.i.f(cVar, "it");
                return Integer.valueOf(cVar.f2457a);
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                com.gates.olympus.miruv.data.b bVar2 = (com.gates.olympus.miruv.data.b) obj;
                Z1.i.f(bVar2, "it");
                return bVar2.getId();
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                P1.g gVar = (P1.g) obj;
                if (gVar instanceof AbstractC0546s) {
                    return (AbstractC0546s) gVar;
                }
                return null;
            case 5:
                Z1.i.f((u2.a) obj, "<this>");
                return L1.z.f2729a;
            case 6:
                u2.a aVar = (u2.a) obj;
                Z1.i.f(aVar, "$this$buildSerialDescriptor");
                final int i3 = 0;
                u2.a.a(aVar, "JsonPrimitive", new x2.o(new Y1.a() { // from class: x2.m
                    @Override // Y1.a
                    public final Object b() {
                        switch (i3) {
                            case 0:
                                return B.f8728b;
                            case 1:
                                return u.f8764b;
                            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                                return r.f8762a;
                            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                                return y.f8769b;
                            default:
                                return g.f8739b;
                        }
                    }
                }));
                final int i4 = 1;
                u2.a.a(aVar, "JsonNull", new x2.o(new Y1.a() { // from class: x2.m
                    @Override // Y1.a
                    public final Object b() {
                        switch (i4) {
                            case 0:
                                return B.f8728b;
                            case 1:
                                return u.f8764b;
                            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                                return r.f8762a;
                            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                                return y.f8769b;
                            default:
                                return g.f8739b;
                        }
                    }
                }));
                final int i5 = 2;
                u2.a.a(aVar, "JsonLiteral", new x2.o(new Y1.a() { // from class: x2.m
                    @Override // Y1.a
                    public final Object b() {
                        switch (i5) {
                            case 0:
                                return B.f8728b;
                            case 1:
                                return u.f8764b;
                            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                                return r.f8762a;
                            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                                return y.f8769b;
                            default:
                                return g.f8739b;
                        }
                    }
                }));
                final int i6 = 3;
                u2.a.a(aVar, "JsonObject", new x2.o(new Y1.a() { // from class: x2.m
                    @Override // Y1.a
                    public final Object b() {
                        switch (i6) {
                            case 0:
                                return B.f8728b;
                            case 1:
                                return u.f8764b;
                            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                                return r.f8762a;
                            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                                return y.f8769b;
                            default:
                                return g.f8739b;
                        }
                    }
                }));
                final int i7 = 4;
                u2.a.a(aVar, "JsonArray", new x2.o(new Y1.a() { // from class: x2.m
                    @Override // Y1.a
                    public final Object b() {
                        switch (i7) {
                            case 0:
                                return B.f8728b;
                            case 1:
                                return u.f8764b;
                            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                                return r.f8762a;
                            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                                return y.f8769b;
                            default:
                                return g.f8739b;
                        }
                    }
                }));
                return L1.z.f2729a;
            default:
                string$lambda$1 = x2.w.toString$lambda$1((Map.Entry) obj);
                return string$lambda$1;
        }
    }
}
