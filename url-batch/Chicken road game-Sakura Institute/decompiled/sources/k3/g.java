package k3;

import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import com.android.installreferrer.api.InstallReferrerClient;
import e6.c0;
import e6.l;
import f8.a0;
import f8.y;
import f8.z;
import j3.i;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import l.h;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f5355a = new g();

    public final b a(a0 a0Var) {
        byte[] bArr;
        try {
            j3.e o2 = j3.e.o(new z(a0Var));
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            k.f(eVarArr, "pairs");
            bVar.b();
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map m8 = o2.m();
            k.e(m8, "preferencesProto.preferencesMap");
            for (Map.Entry entry : m8.entrySet()) {
                String str = (String) entry.getKey();
                i iVar = (i) entry.getValue();
                k.e(str, "name");
                k.e(iVar, "value");
                int C = iVar.C();
                switch (C == 0 ? -1 : f.f5354a[h.d(C)]) {
                    case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                        throw new g3.b("Value case is null.", null);
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    default:
                        throw new b4.c();
                    case 1:
                        bVar.c(new d(str), Boolean.valueOf(iVar.t()));
                        break;
                    case 2:
                        bVar.c(new d(str), Float.valueOf(iVar.x()));
                        break;
                    case 3:
                        bVar.c(new d(str), Double.valueOf(iVar.w()));
                        break;
                    case 4:
                        bVar.c(new d(str), Integer.valueOf(iVar.y()));
                        break;
                    case 5:
                        bVar.c(new d(str), Long.valueOf(iVar.z()));
                        break;
                    case 6:
                        d dVar = new d(str);
                        String A = iVar.A();
                        k.e(A, "value.string");
                        bVar.c(dVar, A);
                        break;
                    case i.DOUBLE_FIELD_NUMBER /* 7 */:
                        d dVar2 = new d(str);
                        w n8 = iVar.B().n();
                        k.e(n8, "value.stringSet.stringsList");
                        bVar.c(dVar2, l.z0(n8));
                        break;
                    case 8:
                        d dVar3 = new d(str);
                        androidx.datastore.preferences.protobuf.g u8 = iVar.u();
                        int size = u8.size();
                        if (size == 0) {
                            bArr = x.f923b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u8.w(size, bArr2);
                            bArr = bArr2;
                        }
                        k.e(bArr, "value.bytes.toByteArray()");
                        bVar.c(dVar3, bArr);
                        break;
                    case q.c.f7259c /* 9 */:
                        throw new g3.b("Value not set.", null);
                }
            }
            return new b(c0.n0(bVar.a()), true);
        } catch (androidx.datastore.preferences.protobuf.z e9) {
            throw new g3.b("Unable to parse preferences proto.", e9);
        }
    }

    public final void b(Object obj, y yVar) {
        v a3;
        Map a9 = ((b) obj).a();
        j3.c n8 = j3.e.n();
        for (Map.Entry entry : a9.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f5353a;
            if (value instanceof Boolean) {
                j3.h D = i.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D.c();
                i.q((i) D.f914g, booleanValue);
                a3 = D.a();
            } else if (value instanceof Float) {
                j3.h D2 = i.D();
                float floatValue = ((Number) value).floatValue();
                D2.c();
                i.r((i) D2.f914g, floatValue);
                a3 = D2.a();
            } else if (value instanceof Double) {
                j3.h D3 = i.D();
                double doubleValue = ((Number) value).doubleValue();
                D3.c();
                i.o((i) D3.f914g, doubleValue);
                a3 = D3.a();
            } else if (value instanceof Integer) {
                j3.h D4 = i.D();
                int intValue = ((Number) value).intValue();
                D4.c();
                i.s((i) D4.f914g, intValue);
                a3 = D4.a();
            } else if (value instanceof Long) {
                j3.h D5 = i.D();
                long longValue = ((Number) value).longValue();
                D5.c();
                i.l((i) D5.f914g, longValue);
                a3 = D5.a();
            } else if (value instanceof String) {
                j3.h D6 = i.D();
                D6.c();
                i.m((i) D6.f914g, (String) value);
                a3 = D6.a();
            } else if (value instanceof Set) {
                j3.h D7 = i.D();
                j3.f o2 = j3.g.o();
                o2.c();
                j3.g.l((j3.g) o2.f914g, (Set) value);
                D7.c();
                i.n((i) D7.f914g, (j3.g) o2.a());
                a3 = D7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                j3.h D8 = i.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.g m8 = androidx.datastore.preferences.protobuf.g.m(bArr, 0, bArr.length);
                D8.c();
                i.p((i) D8.f914g, m8);
                a3 = D8.a();
            }
            n8.getClass();
            str.getClass();
            n8.c();
            j3.e.l((j3.e) n8.f914g).put(str, (i) a3);
        }
        j3.e eVar = (j3.e) n8.a();
        f8.x xVar = new f8.x(yVar);
        int a10 = eVar.a(null);
        Logger logger = androidx.datastore.preferences.protobuf.l.f855h;
        if (a10 > 4096) {
            a10 = 4096;
        }
        androidx.datastore.preferences.protobuf.l lVar = new androidx.datastore.preferences.protobuf.l(xVar, a10);
        eVar.b(lVar);
        if (lVar.f860f > 0) {
            lVar.v();
        }
    }
}
