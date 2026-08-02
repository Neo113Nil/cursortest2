package N;

import K.C0038b;
import K.k0;
import M.i;
import M.k;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0155w;
import androidx.datastore.preferences.protobuf.AbstractC0157y;
import androidx.datastore.preferences.protobuf.C0140g;
import androidx.datastore.preferences.protobuf.C0146m;
import androidx.datastore.preferences.protobuf.InterfaceC0156x;
import c2.p;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f983a = new g();

    public final b a(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            M.f o = M.f.o(fileInputStream);
            b bVar = new b(false);
            e[] pairs = (e[]) Arrays.copyOf(new e[0], 0);
            j.e(pairs, "pairs");
            bVar.b();
            if (pairs.length > 0) {
                e eVar = pairs[0];
                throw null;
            }
            Map m3 = o.m();
            j.d(m3, "preferencesProto.preferencesMap");
            for (Map.Entry entry : m3.entrySet()) {
                String name = (String) entry.getKey();
                k value = (k) entry.getValue();
                j.d(name, "name");
                j.d(value, "value");
                int C3 = value.C();
                switch (C3 == 0 ? -1 : f.f982a[M.j.b(C3)]) {
                    case -1:
                        throw new C0038b("Value case is null.", null);
                    case 0:
                    default:
                        throw new O0.b();
                    case 1:
                        bVar.d(new d(name), Boolean.valueOf(value.t()));
                        break;
                    case 2:
                        bVar.d(new d(name), Float.valueOf(value.x()));
                        break;
                    case 3:
                        bVar.d(new d(name), Double.valueOf(value.w()));
                        break;
                    case 4:
                        bVar.d(new d(name), Integer.valueOf(value.y()));
                        break;
                    case 5:
                        bVar.d(new d(name), Long.valueOf(value.z()));
                        break;
                    case 6:
                        d dVar = new d(name);
                        String A3 = value.A();
                        j.d(A3, "value.string");
                        bVar.d(dVar, A3);
                        break;
                    case 7:
                        d dVar2 = new d(name);
                        InterfaceC0156x n3 = value.B().n();
                        j.d(n3, "value.stringSet.stringsList");
                        bVar.d(dVar2, c2.e.a0(n3));
                        break;
                    case 8:
                        d dVar3 = new d(name);
                        C0140g u3 = value.u();
                        int size = u3.size();
                        if (size == 0) {
                            bArr = AbstractC0157y.f2365b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u3.e(size, bArr2);
                            bArr = bArr2;
                        }
                        j.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case 9:
                        throw new C0038b("Value not set.", null);
                }
            }
            return new b(p.g0(bVar.a()), true);
        } catch (A e3) {
            throw new C0038b("Unable to parse preferences proto.", e3);
        }
    }

    public final void b(Object obj, k0 k0Var) {
        AbstractC0155w a3;
        Map a4 = ((b) obj).a();
        M.d n3 = M.f.n();
        for (Map.Entry entry : a4.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f981a;
            if (value instanceof Boolean) {
                i D3 = k.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D3.c();
                k.q((k) D3.f2363b, booleanValue);
                a3 = D3.a();
            } else if (value instanceof Float) {
                i D4 = k.D();
                float floatValue = ((Number) value).floatValue();
                D4.c();
                k.r((k) D4.f2363b, floatValue);
                a3 = D4.a();
            } else if (value instanceof Double) {
                i D5 = k.D();
                double doubleValue = ((Number) value).doubleValue();
                D5.c();
                k.o((k) D5.f2363b, doubleValue);
                a3 = D5.a();
            } else if (value instanceof Integer) {
                i D6 = k.D();
                int intValue = ((Number) value).intValue();
                D6.c();
                k.s((k) D6.f2363b, intValue);
                a3 = D6.a();
            } else if (value instanceof Long) {
                i D7 = k.D();
                long longValue = ((Number) value).longValue();
                D7.c();
                k.l((k) D7.f2363b, longValue);
                a3 = D7.a();
            } else if (value instanceof String) {
                i D8 = k.D();
                D8.c();
                k.m((k) D8.f2363b, (String) value);
                a3 = D8.a();
            } else if (value instanceof Set) {
                i D9 = k.D();
                M.g o = M.h.o();
                j.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                o.c();
                M.h.l((M.h) o.f2363b, (Set) value);
                D9.c();
                k.n((k) D9.f2363b, (M.h) o.a());
                a3 = D9.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                i D10 = k.D();
                byte[] bArr = (byte[]) value;
                C0140g c0140g = C0140g.f2294c;
                C0140g d3 = C0140g.d(bArr, 0, bArr.length);
                D10.c();
                k.p((k) D10.f2363b, d3);
                a3 = D10.a();
            }
            n3.getClass();
            str.getClass();
            n3.c();
            M.f.l((M.f) n3.f2363b).put(str, (k) a3);
        }
        M.f fVar = (M.f) n3.a();
        int a5 = fVar.a(null);
        Logger logger = C0146m.f2326n;
        if (a5 > 4096) {
            a5 = 4096;
        }
        C0146m c0146m = new C0146m(k0Var, a5);
        fVar.b(c0146m);
        if (c0146m.f2330l > 0) {
            c0146m.a0();
        }
    }
}
