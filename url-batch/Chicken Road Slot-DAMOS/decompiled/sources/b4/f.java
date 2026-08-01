package b4;

import a2.r;
import a4.g;
import a4.h;
import a4.i;
import a4.j;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import x3.v0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {
    public static a a(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            a4.e o6 = a4.e.o(fileInputStream);
            a aVar = new a(false);
            d[] dVarArr = (d[]) Arrays.copyOf(new d[0], 0);
            aVar.b();
            if (dVarArr.length > 0) {
                d dVar = dVarArr[0];
                throw null;
            }
            Map m10 = o6.m();
            m10.getClass();
            for (Map.Entry entry : m10.entrySet()) {
                String str = (String) entry.getKey();
                j jVar = (j) entry.getValue();
                str.getClass();
                jVar.getClass();
                int C = jVar.C();
                switch (C == 0 ? -1 : e.f1099a[i.b(C)]) {
                    case -1:
                        throw new x3.b("Value case is null.", null);
                    case 0:
                    default:
                        r.p();
                        return null;
                    case 1:
                        aVar.d(new c(str), Boolean.valueOf(jVar.t()));
                        break;
                    case 2:
                        aVar.d(new c(str), Float.valueOf(jVar.x()));
                        break;
                    case j.INTEGER_FIELD_NUMBER /* 3 */:
                        aVar.d(new c(str), Double.valueOf(jVar.w()));
                        break;
                    case j.LONG_FIELD_NUMBER /* 4 */:
                        aVar.d(new c(str), Integer.valueOf(jVar.y()));
                        break;
                    case j.STRING_FIELD_NUMBER /* 5 */:
                        aVar.d(new c(str), Long.valueOf(jVar.z()));
                        break;
                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                        aVar.d(new c(str), jVar.A());
                        break;
                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                        c cVar = new c(str);
                        w n10 = jVar.B().n();
                        n10.getClass();
                        aVar.d(cVar, CollectionsKt.T(n10));
                        break;
                    case j.BYTES_FIELD_NUMBER /* 8 */:
                        c cVar2 = new c(str);
                        androidx.datastore.preferences.protobuf.f u2 = jVar.u();
                        int size = u2.size();
                        if (size == 0) {
                            bArr = x.f648b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u2.f(size, bArr2);
                            bArr = bArr2;
                        }
                        aVar.d(cVar2, bArr);
                        break;
                    case 9:
                        throw new x3.b("Value not set.", null);
                }
            }
            return new a(new LinkedHashMap(aVar.a()), true);
        } catch (z e2) {
            throw new x3.b("Unable to parse preferences proto.", e2);
        }
    }

    public static Unit b(Object obj, v0 v0Var) {
        v a9;
        Map a10 = ((a) obj).a();
        a4.c n10 = a4.e.n();
        for (Map.Entry entry : a10.entrySet()) {
            c cVar = (c) entry.getKey();
            Object value = entry.getValue();
            String str = cVar.f1098a;
            if (value instanceof Boolean) {
                h D = j.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D.c();
                j.q((j) D.f635e, booleanValue);
                a9 = D.a();
            } else if (value instanceof Float) {
                h D2 = j.D();
                float floatValue = ((Number) value).floatValue();
                D2.c();
                j.r((j) D2.f635e, floatValue);
                a9 = D2.a();
            } else if (value instanceof Double) {
                h D3 = j.D();
                double doubleValue = ((Number) value).doubleValue();
                D3.c();
                j.o((j) D3.f635e, doubleValue);
                a9 = D3.a();
            } else if (value instanceof Integer) {
                h D4 = j.D();
                int intValue = ((Number) value).intValue();
                D4.c();
                j.s((j) D4.f635e, intValue);
                a9 = D4.a();
            } else if (value instanceof Long) {
                h D5 = j.D();
                long longValue = ((Number) value).longValue();
                D5.c();
                j.l((j) D5.f635e, longValue);
                a9 = D5.a();
            } else if (value instanceof String) {
                h D6 = j.D();
                D6.c();
                j.m((j) D6.f635e, (String) value);
                a9 = D6.a();
            } else if (value instanceof Set) {
                h D7 = j.D();
                a4.f o6 = g.o();
                o6.c();
                g.l((g) o6.f635e, (Set) value);
                D7.c();
                j.n((j) D7.f635e, (g) o6.a());
                a9 = D7.a();
            } else {
                if (!(value instanceof byte[])) {
                    i0.l("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return null;
                }
                h D8 = j.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.f e2 = androidx.datastore.preferences.protobuf.f.e(bArr, 0, bArr.length);
                D8.c();
                j.p((j) D8.f635e, e2);
                a9 = D8.a();
            }
            n10.getClass();
            str.getClass();
            n10.c();
            a4.e.l((a4.e) n10.f635e).put(str, (j) a9);
        }
        a4.e eVar = (a4.e) n10.a();
        int a11 = eVar.a(null);
        Logger logger = l.f577f;
        if (a11 > 4096) {
            a11 = 4096;
        }
        l lVar = new l(v0Var, a11);
        eVar.b(lVar);
        if (lVar.f581d > 0) {
            lVar.k();
        }
        return Unit.f5554a;
    }
}
