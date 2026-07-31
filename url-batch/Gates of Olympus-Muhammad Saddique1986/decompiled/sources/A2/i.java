package A2;

import D2.o;
import D2.w;
import R1.y;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import java.util.Arrays;
import java.util.Map;
import q2.AbstractC0831s;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC0424c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f254d;

    public /* synthetic */ i(int i3) {
        this.f254d = i3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        CharSequence string$lambda$1;
        switch (this.f254d) {
            case 0:
                f2.j.f((a) obj, "<this>");
                return y.f4171a;
            case 1:
                a aVar = (a) obj;
                f2.j.f(aVar, "$this$buildSerialDescriptor");
                final int i3 = 0;
                a.a(aVar, "JsonPrimitive", new o(new InterfaceC0422a() { // from class: D2.m
                    @Override // e2.InterfaceC0422a
                    public final Object b() {
                        switch (i3) {
                            case 0:
                                return B.f867b;
                            case 1:
                                return u.f904b;
                            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                                return r.f902a;
                            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                                return y.f909b;
                            default:
                                return g.f878b;
                        }
                    }
                }));
                final int i4 = 1;
                a.a(aVar, "JsonNull", new o(new InterfaceC0422a() { // from class: D2.m
                    @Override // e2.InterfaceC0422a
                    public final Object b() {
                        switch (i4) {
                            case 0:
                                return B.f867b;
                            case 1:
                                return u.f904b;
                            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                                return r.f902a;
                            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                                return y.f909b;
                            default:
                                return g.f878b;
                        }
                    }
                }));
                final int i5 = 2;
                a.a(aVar, "JsonLiteral", new o(new InterfaceC0422a() { // from class: D2.m
                    @Override // e2.InterfaceC0422a
                    public final Object b() {
                        switch (i5) {
                            case 0:
                                return B.f867b;
                            case 1:
                                return u.f904b;
                            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                                return r.f902a;
                            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                                return y.f909b;
                            default:
                                return g.f878b;
                        }
                    }
                }));
                final int i6 = 3;
                a.a(aVar, "JsonObject", new o(new InterfaceC0422a() { // from class: D2.m
                    @Override // e2.InterfaceC0422a
                    public final Object b() {
                        switch (i6) {
                            case 0:
                                return B.f867b;
                            case 1:
                                return u.f904b;
                            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                                return r.f902a;
                            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                                return y.f909b;
                            default:
                                return g.f878b;
                        }
                    }
                }));
                final int i7 = 4;
                a.a(aVar, "JsonArray", new o(new InterfaceC0422a() { // from class: D2.m
                    @Override // e2.InterfaceC0422a
                    public final Object b() {
                        switch (i7) {
                            case 0:
                                return B.f867b;
                            case 1:
                                return u.f904b;
                            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                                return r.f902a;
                            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                                return y.f909b;
                            default:
                                return g.f878b;
                        }
                    }
                }));
                return y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                string$lambda$1 = w.toString$lambda$1((Map.Entry) obj);
                return string$lambda$1;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                Byte b3 = (Byte) obj;
                b3.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b3}, 1));
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                J1.b bVar = (J1.b) obj;
                f2.j.f(bVar, "it");
                return Long.valueOf(bVar.f3164a.f3159a);
            case 5:
                J1.d dVar = (J1.d) obj;
                f2.j.f(dVar, "it");
                return Long.valueOf(dVar.f3175a);
            case 6:
                J1.e eVar = (J1.e) obj;
                f2.j.f(eVar, "it");
                return eVar.f3182a;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                J1.d dVar2 = (J1.d) obj;
                f2.j.f(dVar2, "it");
                return Long.valueOf(dVar2.f3175a);
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                f2.j.f((String) obj, "it");
                return y.f4171a;
            default:
                V1.g gVar = (V1.g) obj;
                if (gVar instanceof AbstractC0831s) {
                    return (AbstractC0831s) gVar;
                }
                return null;
        }
    }
}
