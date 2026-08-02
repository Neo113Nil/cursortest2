package L;

import I.C0068c;
import I.m0;
import K.i;
import K.j;
import K.k;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0159w;
import androidx.datastore.preferences.protobuf.AbstractC0161y;
import androidx.datastore.preferences.protobuf.C0144g;
import androidx.datastore.preferences.protobuf.C0150m;
import androidx.datastore.preferences.protobuf.InterfaceC0160x;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f764a = new g();

    public final b a(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            K.f q2 = K.f.q(fileInputStream);
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            Q0.h.e(eVarArr, "pairs");
            bVar.b();
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map o2 = q2.o();
            Q0.h.d(o2, "preferencesProto.preferencesMap");
            for (Map.Entry entry : o2.entrySet()) {
                String str = (String) entry.getKey();
                k kVar = (k) entry.getValue();
                Q0.h.d(str, "name");
                Q0.h.d(kVar, "value");
                int E2 = kVar.E();
                switch (E2 == 0 ? -1 : f.f763a[j.b(E2)]) {
                    case -1:
                        throw new C0068c("Value case is null.", null);
                    case 0:
                    default:
                        throw new F0.b();
                    case 1:
                        bVar.d(new d(str), Boolean.valueOf(kVar.v()));
                        break;
                    case 2:
                        bVar.d(new d(str), Float.valueOf(kVar.z()));
                        break;
                    case 3:
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
                        Q0.h.d(C2, "value.string");
                        bVar.d(dVar, C2);
                        break;
                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
                        d dVar2 = new d(str);
                        InterfaceC0160x p2 = kVar.D().p();
                        Q0.h.d(p2, "value.stringSet.stringsList");
                        bVar.d(dVar2, G0.d.T(p2));
                        break;
                    case k.BYTES_FIELD_NUMBER /* 8 */:
                        d dVar3 = new d(str);
                        C0144g w2 = kVar.w();
                        int size = w2.size();
                        if (size == 0) {
                            bArr = AbstractC0161y.f1762b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            w2.d(bArr2, size);
                            bArr = bArr2;
                        }
                        Q0.h.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case 9:
                        throw new C0068c("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (A e2) {
            throw new C0068c("Unable to parse preferences proto.", e2);
        }
    }

    public final void b(Object obj, m0 m0Var) {
        AbstractC0159w a2;
        Map a3 = ((b) obj).a();
        K.d p2 = K.f.p();
        for (Map.Entry entry : a3.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f762a;
            if (value instanceof Boolean) {
                i F2 = k.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F2.c();
                k.s((k) F2.f1760f, booleanValue);
                a2 = F2.a();
            } else if (value instanceof Float) {
                i F3 = k.F();
                float floatValue = ((Number) value).floatValue();
                F3.c();
                k.t((k) F3.f1760f, floatValue);
                a2 = F3.a();
            } else if (value instanceof Double) {
                i F4 = k.F();
                double doubleValue = ((Number) value).doubleValue();
                F4.c();
                k.q((k) F4.f1760f, doubleValue);
                a2 = F4.a();
            } else if (value instanceof Integer) {
                i F5 = k.F();
                int intValue = ((Number) value).intValue();
                F5.c();
                k.u((k) F5.f1760f, intValue);
                a2 = F5.a();
            } else if (value instanceof Long) {
                i F6 = k.F();
                long longValue = ((Number) value).longValue();
                F6.c();
                k.n((k) F6.f1760f, longValue);
                a2 = F6.a();
            } else if (value instanceof String) {
                i F7 = k.F();
                F7.c();
                k.o((k) F7.f1760f, (String) value);
                a2 = F7.a();
            } else if (value instanceof Set) {
                i F8 = k.F();
                K.g q2 = K.h.q();
                Q0.h.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q2.c();
                K.h.n((K.h) q2.f1760f, (Set) value);
                F8.c();
                k.p((k) F8.f1760f, (K.h) q2.a());
                a2 = F8.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                i F9 = k.F();
                byte[] bArr = (byte[]) value;
                C0144g c0144g = C0144g.f1685g;
                C0144g c2 = C0144g.c(bArr, 0, bArr.length);
                F9.c();
                k.r((k) F9.f1760f, c2);
                a2 = F9.a();
            }
            p2.getClass();
            str.getClass();
            p2.c();
            K.f.n((K.f) p2.f1760f).put(str, (k) a2);
        }
        K.f fVar = (K.f) p2.a();
        int a4 = fVar.a(null);
        Logger logger = C0150m.f1720o;
        if (a4 > 4096) {
            a4 = 4096;
        }
        C0150m c0150m = new C0150m(m0Var, a4);
        fVar.b(c0150m);
        if (c0150m.f1725m > 0) {
            c0150m.s0();
        }
    }
}
