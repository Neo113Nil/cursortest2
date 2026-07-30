package G;

import D.C0002c;
import D.o0;
import F.j;
import F.k;
import F0.i;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0092w;
import androidx.datastore.preferences.protobuf.AbstractC0094y;
import androidx.datastore.preferences.protobuf.C0077g;
import androidx.datastore.preferences.protobuf.C0083m;
import androidx.datastore.preferences.protobuf.InterfaceC0093x;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f334a = new g();

    public final b a(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            F.f q2 = F.f.q(fileInputStream);
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            i.e(eVarArr, "pairs");
            bVar.b();
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map o2 = q2.o();
            i.d(o2, "preferencesProto.preferencesMap");
            for (Map.Entry entry : o2.entrySet()) {
                String str = (String) entry.getKey();
                k kVar = (k) entry.getValue();
                i.d(str, "name");
                i.d(kVar, "value");
                int E2 = kVar.E();
                switch (E2 == 0 ? -1 : f.f333a[j.b(E2)]) {
                    case -1:
                        throw new C0002c("Value case is null.", null);
                    case 0:
                    default:
                        throw new M.c();
                    case 1:
                        bVar.d(new d(str), Boolean.valueOf(kVar.v()));
                        break;
                    case k.FLOAT_FIELD_NUMBER /* 2 */:
                        bVar.d(new d(str), Float.valueOf(kVar.z()));
                        break;
                    case k.INTEGER_FIELD_NUMBER /* 3 */:
                        bVar.d(new d(str), Double.valueOf(kVar.y()));
                        break;
                    case k.LONG_FIELD_NUMBER /* 4 */:
                        bVar.d(new d(str), Integer.valueOf(kVar.A()));
                        break;
                    case k.STRING_FIELD_NUMBER /* 5 */:
                        bVar.d(new d(str), Long.valueOf(kVar.B()));
                        break;
                    case k.STRING_SET_FIELD_NUMBER /* 6 */:
                        d dVar = new d(str);
                        String C2 = kVar.C();
                        i.d(C2, "value.string");
                        bVar.d(dVar, C2);
                        break;
                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
                        d dVar2 = new d(str);
                        InterfaceC0093x p2 = kVar.D().p();
                        i.d(p2, "value.stringSet.stringsList");
                        bVar.d(dVar2, v0.d.G(p2));
                        break;
                    case k.BYTES_FIELD_NUMBER /* 8 */:
                        d dVar3 = new d(str);
                        C0077g w2 = kVar.w();
                        int size = w2.size();
                        if (size == 0) {
                            bArr = AbstractC0094y.f1513b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            w2.d(bArr2, size);
                            bArr = bArr2;
                        }
                        i.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case 9:
                        throw new C0002c("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (A e2) {
            throw new C0002c("Unable to parse preferences proto.", e2);
        }
    }

    public final void b(Object obj, o0 o0Var) {
        AbstractC0092w a2;
        Map a3 = ((b) obj).a();
        F.d p2 = F.f.p();
        for (Map.Entry entry : a3.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f332a;
            if (value instanceof Boolean) {
                F.i F2 = k.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F2.c();
                k.s((k) F2.f1511f, booleanValue);
                a2 = F2.a();
            } else if (value instanceof Float) {
                F.i F3 = k.F();
                float floatValue = ((Number) value).floatValue();
                F3.c();
                k.t((k) F3.f1511f, floatValue);
                a2 = F3.a();
            } else if (value instanceof Double) {
                F.i F4 = k.F();
                double doubleValue = ((Number) value).doubleValue();
                F4.c();
                k.q((k) F4.f1511f, doubleValue);
                a2 = F4.a();
            } else if (value instanceof Integer) {
                F.i F5 = k.F();
                int intValue = ((Number) value).intValue();
                F5.c();
                k.u((k) F5.f1511f, intValue);
                a2 = F5.a();
            } else if (value instanceof Long) {
                F.i F6 = k.F();
                long longValue = ((Number) value).longValue();
                F6.c();
                k.n((k) F6.f1511f, longValue);
                a2 = F6.a();
            } else if (value instanceof String) {
                F.i F7 = k.F();
                F7.c();
                k.o((k) F7.f1511f, (String) value);
                a2 = F7.a();
            } else if (value instanceof Set) {
                F.i F8 = k.F();
                F.g q2 = F.h.q();
                i.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q2.c();
                F.h.n((F.h) q2.f1511f, (Set) value);
                F8.c();
                k.p((k) F8.f1511f, (F.h) q2.a());
                a2 = F8.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                F.i F9 = k.F();
                byte[] bArr = (byte[]) value;
                C0077g c0077g = C0077g.f1437g;
                C0077g c2 = C0077g.c(bArr, 0, bArr.length);
                F9.c();
                k.r((k) F9.f1511f, c2);
                a2 = F9.a();
            }
            p2.getClass();
            str.getClass();
            p2.c();
            F.f.n((F.f) p2.f1511f).put(str, (k) a2);
        }
        F.f fVar = (F.f) p2.a();
        int a4 = fVar.a(null);
        Logger logger = C0083m.f1471n;
        if (a4 > 4096) {
            a4 = 4096;
        }
        C0083m c0083m = new C0083m(o0Var, a4);
        fVar.b(c0083m);
        if (c0083m.f1476l > 0) {
            c0083m.p0();
        }
    }
}
