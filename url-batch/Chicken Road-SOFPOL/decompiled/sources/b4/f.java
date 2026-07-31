package b4;

import a4.h;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;
import d6.m;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import q6.i;
import x.v0;
import y3.u0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1246a = new f();

    public final a a(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            a4.e o2 = a4.e.o(fileInputStream);
            a aVar = new a(false);
            d[] dVarArr = (d[]) Arrays.copyOf(new d[0], 0);
            i.e(dVarArr, "pairs");
            aVar.b();
            if (dVarArr.length > 0) {
                d dVar = dVarArr[0];
                throw null;
            }
            Map m7 = o2.m();
            i.d(m7, "getPreferencesMap(...)");
            for (Map.Entry entry : m7.entrySet()) {
                String str = (String) entry.getKey();
                a4.i iVar = (a4.i) entry.getValue();
                i.b(str);
                i.b(iVar);
                int C = iVar.C();
                switch (C == 0 ? -1 : e.f1245a[w2.e.a(C)]) {
                    case -1:
                        throw new y3.b("Value case is null.", null);
                    case 0:
                    default:
                        throw new a5.c();
                    case 1:
                        aVar.d(new c(str), Boolean.valueOf(iVar.t()));
                        break;
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        aVar.d(new c(str), Float.valueOf(iVar.x()));
                        break;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        aVar.d(new c(str), Double.valueOf(iVar.w()));
                        break;
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        aVar.d(new c(str), Integer.valueOf(iVar.y()));
                        break;
                    case 5:
                        aVar.d(new c(str), Long.valueOf(iVar.z()));
                        break;
                    case 6:
                        aVar.d(new c(str), iVar.A());
                        break;
                    case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        c cVar = new c(str);
                        x n6 = iVar.B().n();
                        i.d(n6, "getStringsList(...)");
                        aVar.d(cVar, m.j0(n6));
                        break;
                    case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                        c cVar2 = new c(str);
                        g u7 = iVar.u();
                        int size = u7.size();
                        if (size == 0) {
                            bArr = y.f795b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u7.e(bArr2, size);
                            bArr = bArr2;
                        }
                        aVar.d(cVar2, bArr);
                        break;
                    case v0.f8304b /* 9 */:
                        throw new y3.b("Value not set.", null);
                }
            }
            return new a(new LinkedHashMap(aVar.a()), true);
        } catch (a0 e8) {
            throw new y3.b("Unable to parse preferences proto.", e8);
        }
    }

    public final void b(Object obj, u0 u0Var) {
        w a8;
        Map a9 = ((a) obj).a();
        a4.c n6 = a4.e.n();
        for (Map.Entry entry : a9.entrySet()) {
            c cVar = (c) entry.getKey();
            Object value = entry.getValue();
            String str = cVar.f1244a;
            if (value instanceof Boolean) {
                h D = a4.i.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D.c();
                a4.i.q((a4.i) D.f783e, booleanValue);
                a8 = D.a();
            } else if (value instanceof Float) {
                h D2 = a4.i.D();
                float floatValue = ((Number) value).floatValue();
                D2.c();
                a4.i.r((a4.i) D2.f783e, floatValue);
                a8 = D2.a();
            } else if (value instanceof Double) {
                h D3 = a4.i.D();
                double doubleValue = ((Number) value).doubleValue();
                D3.c();
                a4.i.o((a4.i) D3.f783e, doubleValue);
                a8 = D3.a();
            } else if (value instanceof Integer) {
                h D4 = a4.i.D();
                int intValue = ((Number) value).intValue();
                D4.c();
                a4.i.s((a4.i) D4.f783e, intValue);
                a8 = D4.a();
            } else if (value instanceof Long) {
                h D5 = a4.i.D();
                long longValue = ((Number) value).longValue();
                D5.c();
                a4.i.l((a4.i) D5.f783e, longValue);
                a8 = D5.a();
            } else if (value instanceof String) {
                h D6 = a4.i.D();
                D6.c();
                a4.i.m((a4.i) D6.f783e, (String) value);
                a8 = D6.a();
            } else if (value instanceof Set) {
                h D7 = a4.i.D();
                a4.f o2 = a4.g.o();
                o2.c();
                a4.g.l((a4.g) o2.f783e, (Set) value);
                D7.c();
                a4.i.n((a4.i) D7.f783e, (a4.g) o2.a());
                a8 = D7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                h D8 = a4.i.D();
                byte[] bArr = (byte[]) value;
                g c8 = g.c(bArr, 0, bArr.length);
                D8.c();
                a4.i.p((a4.i) D8.f783e, c8);
                a8 = D8.a();
            }
            n6.getClass();
            n6.c();
            a4.e.l((a4.e) n6.f783e).put(str, (a4.i) a8);
        }
        a4.e eVar = (a4.e) n6.a();
        int a10 = eVar.a(null);
        Logger logger = androidx.datastore.preferences.protobuf.m.f725p;
        if (a10 > 4096) {
            a10 = 4096;
        }
        androidx.datastore.preferences.protobuf.m mVar = new androidx.datastore.preferences.protobuf.m(u0Var, a10);
        eVar.b(mVar);
        if (mVar.f730n > 0) {
            mVar.O();
        }
    }
}
