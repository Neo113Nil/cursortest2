package I;

import F.C0021c;
import F.n0;
import H.i;
import H.j;
import H.k;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0110w;
import androidx.datastore.preferences.protobuf.AbstractC0112y;
import androidx.datastore.preferences.protobuf.C0095g;
import androidx.datastore.preferences.protobuf.C0101m;
import androidx.datastore.preferences.protobuf.InterfaceC0111x;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f521a = new g();

    public final b a(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            H.f o2 = H.f.o(fileInputStream);
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            P0.h.e(eVarArr, "pairs");
            bVar.b();
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map m2 = o2.m();
            P0.h.d(m2, "preferencesProto.preferencesMap");
            for (Map.Entry entry : m2.entrySet()) {
                String str = (String) entry.getKey();
                k kVar = (k) entry.getValue();
                P0.h.d(str, "name");
                P0.h.d(kVar, "value");
                int C2 = kVar.C();
                switch (C2 == 0 ? -1 : f.f520a[j.a(C2)]) {
                    case -1:
                        throw new C0021c("Value case is null.", null);
                    case 0:
                    default:
                        throw new D0.b();
                    case 1:
                        bVar.d(new d(str), Boolean.valueOf(kVar.t()));
                        break;
                    case k.FLOAT_FIELD_NUMBER /* 2 */:
                        bVar.d(new d(str), Float.valueOf(kVar.x()));
                        break;
                    case k.INTEGER_FIELD_NUMBER /* 3 */:
                        bVar.d(new d(str), Double.valueOf(kVar.w()));
                        break;
                    case k.LONG_FIELD_NUMBER /* 4 */:
                        bVar.d(new d(str), Integer.valueOf(kVar.y()));
                        break;
                    case k.STRING_FIELD_NUMBER /* 5 */:
                        bVar.d(new d(str), Long.valueOf(kVar.z()));
                        break;
                    case k.STRING_SET_FIELD_NUMBER /* 6 */:
                        d dVar = new d(str);
                        String A2 = kVar.A();
                        P0.h.d(A2, "value.string");
                        bVar.d(dVar, A2);
                        break;
                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
                        d dVar2 = new d(str);
                        InterfaceC0111x n2 = kVar.B().n();
                        P0.h.d(n2, "value.stringSet.stringsList");
                        bVar.d(dVar2, E0.f.T(n2));
                        break;
                    case k.BYTES_FIELD_NUMBER /* 8 */:
                        d dVar3 = new d(str);
                        C0095g u2 = kVar.u();
                        int size = u2.size();
                        if (size == 0) {
                            bArr = AbstractC0112y.f1603b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u2.d(bArr2, size);
                            bArr = bArr2;
                        }
                        P0.h.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case 9:
                        throw new C0021c("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (A e2) {
            throw new C0021c("Unable to parse preferences proto.", e2);
        }
    }

    public final void b(Object obj, n0 n0Var) {
        AbstractC0110w a2;
        Map a3 = ((b) obj).a();
        H.d n2 = H.f.n();
        for (Map.Entry entry : a3.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f519a;
            if (value instanceof Boolean) {
                i D2 = k.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D2.c();
                k.q((k) D2.f1601f, booleanValue);
                a2 = D2.a();
            } else if (value instanceof Float) {
                i D3 = k.D();
                float floatValue = ((Number) value).floatValue();
                D3.c();
                k.r((k) D3.f1601f, floatValue);
                a2 = D3.a();
            } else if (value instanceof Double) {
                i D4 = k.D();
                double doubleValue = ((Number) value).doubleValue();
                D4.c();
                k.o((k) D4.f1601f, doubleValue);
                a2 = D4.a();
            } else if (value instanceof Integer) {
                i D5 = k.D();
                int intValue = ((Number) value).intValue();
                D5.c();
                k.s((k) D5.f1601f, intValue);
                a2 = D5.a();
            } else if (value instanceof Long) {
                i D6 = k.D();
                long longValue = ((Number) value).longValue();
                D6.c();
                k.l((k) D6.f1601f, longValue);
                a2 = D6.a();
            } else if (value instanceof String) {
                i D7 = k.D();
                D7.c();
                k.m((k) D7.f1601f, (String) value);
                a2 = D7.a();
            } else if (value instanceof Set) {
                i D8 = k.D();
                H.g o2 = H.h.o();
                P0.h.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                o2.c();
                H.h.l((H.h) o2.f1601f, (Set) value);
                D8.c();
                k.n((k) D8.f1601f, (H.h) o2.a());
                a2 = D8.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                i D9 = k.D();
                byte[] bArr = (byte[]) value;
                C0095g c0095g = C0095g.f1525g;
                C0095g c2 = C0095g.c(bArr, 0, bArr.length);
                D9.c();
                k.p((k) D9.f1601f, c2);
                a2 = D9.a();
            }
            n2.getClass();
            str.getClass();
            n2.c();
            H.f.l((H.f) n2.f1601f).put(str, (k) a2);
        }
        H.f fVar = (H.f) n2.a();
        int a4 = fVar.a(null);
        Logger logger = C0101m.f1560j;
        if (a4 > 4096) {
            a4 = 4096;
        }
        C0101m c0101m = new C0101m(n0Var, a4);
        fVar.b(c0101m);
        if (c0101m.f1565h > 0) {
            c0101m.Y();
        }
    }
}
