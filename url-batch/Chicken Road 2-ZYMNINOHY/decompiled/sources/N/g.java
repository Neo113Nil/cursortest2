package N;

import K.C0053b;
import K.j0;
import M.j;
import M.k;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0189w;
import androidx.datastore.preferences.protobuf.AbstractC0191y;
import androidx.datastore.preferences.protobuf.C0174g;
import androidx.datastore.preferences.protobuf.C0180m;
import androidx.datastore.preferences.protobuf.InterfaceC0190x;
import d3.t;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1792a = new g();

    public final b a(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            M.f o = M.f.o(fileInputStream);
            b bVar = new b(false);
            e[] pairs = (e[]) Arrays.copyOf(new e[0], 0);
            i.e(pairs, "pairs");
            bVar.b();
            if (pairs.length > 0) {
                e eVar = pairs[0];
                throw null;
            }
            Map m4 = o.m();
            i.d(m4, "preferencesProto.preferencesMap");
            for (Map.Entry entry : m4.entrySet()) {
                String name = (String) entry.getKey();
                k value = (k) entry.getValue();
                i.d(name, "name");
                i.d(value, "value");
                int C4 = value.C();
                switch (C4 == 0 ? -1 : f.f1791a[j.b(C4)]) {
                    case -1:
                        throw new C0053b("Value case is null.", null);
                    case 0:
                    default:
                        throw new G1.a();
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
                        String A4 = value.A();
                        i.d(A4, "value.string");
                        bVar.d(dVar, A4);
                        break;
                    case 7:
                        d dVar2 = new d(name);
                        InterfaceC0190x n = value.B().n();
                        i.d(n, "value.stringSet.stringsList");
                        bVar.d(dVar2, d3.i.p0(n));
                        break;
                    case 8:
                        d dVar3 = new d(name);
                        C0174g u4 = value.u();
                        int size = u4.size();
                        if (size == 0) {
                            bArr = AbstractC0191y.f4713b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u4.e(size, bArr2);
                            bArr = bArr2;
                        }
                        i.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case 9:
                        throw new C0053b("Value not set.", null);
                }
            }
            return new b(t.H(bVar.a()), true);
        } catch (A e4) {
            throw new C0053b("Unable to parse preferences proto.", e4);
        }
    }

    public final void b(Object obj, j0 j0Var) {
        AbstractC0189w a3;
        Map a4 = ((b) obj).a();
        M.d n = M.f.n();
        for (Map.Entry entry : a4.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f1790a;
            if (value instanceof Boolean) {
                M.i D3 = k.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D3.c();
                k.q((k) D3.f4711b, booleanValue);
                a3 = D3.a();
            } else if (value instanceof Float) {
                M.i D4 = k.D();
                float floatValue = ((Number) value).floatValue();
                D4.c();
                k.r((k) D4.f4711b, floatValue);
                a3 = D4.a();
            } else if (value instanceof Double) {
                M.i D5 = k.D();
                double doubleValue = ((Number) value).doubleValue();
                D5.c();
                k.o((k) D5.f4711b, doubleValue);
                a3 = D5.a();
            } else if (value instanceof Integer) {
                M.i D6 = k.D();
                int intValue = ((Number) value).intValue();
                D6.c();
                k.s((k) D6.f4711b, intValue);
                a3 = D6.a();
            } else if (value instanceof Long) {
                M.i D7 = k.D();
                long longValue = ((Number) value).longValue();
                D7.c();
                k.l((k) D7.f4711b, longValue);
                a3 = D7.a();
            } else if (value instanceof String) {
                M.i D8 = k.D();
                D8.c();
                k.m((k) D8.f4711b, (String) value);
                a3 = D8.a();
            } else if (value instanceof Set) {
                M.i D9 = k.D();
                M.g o = M.h.o();
                i.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                o.c();
                M.h.l((M.h) o.f4711b, (Set) value);
                D9.c();
                k.n((k) D9.f4711b, (M.h) o.a());
                a3 = D9.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                M.i D10 = k.D();
                byte[] bArr = (byte[]) value;
                C0174g c0174g = C0174g.f4635c;
                C0174g d4 = C0174g.d(bArr, 0, bArr.length);
                D10.c();
                k.p((k) D10.f4711b, d4);
                a3 = D10.a();
            }
            n.getClass();
            str.getClass();
            n.c();
            M.f.l((M.f) n.f4711b).put(str, (k) a3);
        }
        M.f fVar = (M.f) n.a();
        int a5 = fVar.a(null);
        Logger logger = C0180m.f4670f;
        if (a5 > 4096) {
            a5 = 4096;
        }
        C0180m c0180m = new C0180m(j0Var, a5);
        fVar.b(c0180m);
        if (c0180m.f4675d > 0) {
            c0180m.d0();
        }
    }
}
