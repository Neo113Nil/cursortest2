package l1;

import S1.B;
import S1.l;
import T2.w;
import T2.x;
import T2.y;
import T2.z;
import androidx.datastore.preferences.protobuf.AbstractC0267v;
import androidx.datastore.preferences.protobuf.AbstractC0269x;
import androidx.datastore.preferences.protobuf.C0253g;
import androidx.datastore.preferences.protobuf.C0258l;
import androidx.datastore.preferences.protobuf.C0271z;
import androidx.datastore.preferences.protobuf.InterfaceC0268w;
import f2.j;
import h1.C0484b;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import k1.C0567c;
import k1.i;
import m.AbstractC0625j;
import r.AbstractC0856c;

/* renamed from: l1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0599h f6594a = new C0599h();

    public final C0593b a(z zVar) {
        byte[] bArr;
        try {
            k1.e q3 = k1.e.q(new y(zVar));
            C0593b c0593b = new C0593b(false);
            AbstractC0596e[] abstractC0596eArr = (AbstractC0596e[]) Arrays.copyOf(new AbstractC0596e[0], 0);
            j.f(abstractC0596eArr, "pairs");
            c0593b.b();
            if (abstractC0596eArr.length > 0) {
                AbstractC0596e abstractC0596e = abstractC0596eArr[0];
                throw null;
            }
            Map o3 = q3.o();
            j.e(o3, "preferencesProto.preferencesMap");
            for (Map.Entry entry : o3.entrySet()) {
                String str = (String) entry.getKey();
                i iVar = (i) entry.getValue();
                j.e(str, "name");
                j.e(iVar, "value");
                int E3 = iVar.E();
                switch (E3 == 0 ? -1 : AbstractC0598g.f6593a[AbstractC0625j.b(E3)]) {
                    case -1:
                        throw new C0484b("Value case is null.", null);
                    case 0:
                    default:
                        throw new C1.c();
                    case 1:
                        c0593b.c(new C0595d(str), Boolean.valueOf(iVar.v()));
                        break;
                    case i.FLOAT_FIELD_NUMBER /* 2 */:
                        c0593b.c(new C0595d(str), Float.valueOf(iVar.z()));
                        break;
                    case i.INTEGER_FIELD_NUMBER /* 3 */:
                        c0593b.c(new C0595d(str), Double.valueOf(iVar.y()));
                        break;
                    case i.LONG_FIELD_NUMBER /* 4 */:
                        c0593b.c(new C0595d(str), Integer.valueOf(iVar.A()));
                        break;
                    case 5:
                        c0593b.c(new C0595d(str), Long.valueOf(iVar.B()));
                        break;
                    case 6:
                        C0595d c0595d = new C0595d(str);
                        String C = iVar.C();
                        j.e(C, "value.string");
                        c0593b.c(c0595d, C);
                        break;
                    case i.DOUBLE_FIELD_NUMBER /* 7 */:
                        C0595d c0595d2 = new C0595d(str);
                        InterfaceC0268w p3 = iVar.D().p();
                        j.e(p3, "value.stringSet.stringsList");
                        c0593b.c(c0595d2, l.d1(p3));
                        break;
                    case i.BYTES_FIELD_NUMBER /* 8 */:
                        C0595d c0595d3 = new C0595d(str);
                        C0253g w2 = iVar.w();
                        int size = w2.size();
                        if (size == 0) {
                            bArr = AbstractC0269x.f5136b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            w2.i(size, bArr2);
                            bArr = bArr2;
                        }
                        j.e(bArr, "value.bytes.toByteArray()");
                        c0593b.c(c0595d3, bArr);
                        break;
                    case AbstractC0856c.f8037c /* 9 */:
                        throw new C0484b("Value not set.", null);
                }
            }
            return new C0593b(B.N(c0593b.a()), true);
        } catch (C0271z e3) {
            throw new C0484b("Unable to parse preferences proto.", e3);
        }
    }

    public final void b(Object obj, x xVar) {
        AbstractC0267v a3;
        Map a4 = ((C0593b) obj).a();
        C0567c p3 = k1.e.p();
        for (Map.Entry entry : a4.entrySet()) {
            C0595d c0595d = (C0595d) entry.getKey();
            Object value = entry.getValue();
            String str = c0595d.f6589a;
            if (value instanceof Boolean) {
                k1.h F3 = i.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F3.c();
                i.s((i) F3.f5132e, booleanValue);
                a3 = F3.a();
            } else if (value instanceof Float) {
                k1.h F4 = i.F();
                float floatValue = ((Number) value).floatValue();
                F4.c();
                i.t((i) F4.f5132e, floatValue);
                a3 = F4.a();
            } else if (value instanceof Double) {
                k1.h F5 = i.F();
                double doubleValue = ((Number) value).doubleValue();
                F5.c();
                i.q((i) F5.f5132e, doubleValue);
                a3 = F5.a();
            } else if (value instanceof Integer) {
                k1.h F6 = i.F();
                int intValue = ((Number) value).intValue();
                F6.c();
                i.u((i) F6.f5132e, intValue);
                a3 = F6.a();
            } else if (value instanceof Long) {
                k1.h F7 = i.F();
                long longValue = ((Number) value).longValue();
                F7.c();
                i.n((i) F7.f5132e, longValue);
                a3 = F7.a();
            } else if (value instanceof String) {
                k1.h F8 = i.F();
                F8.c();
                i.o((i) F8.f5132e, (String) value);
                a3 = F8.a();
            } else if (value instanceof Set) {
                k1.h F9 = i.F();
                k1.f q3 = k1.g.q();
                j.d(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q3.c();
                k1.g.n((k1.g) q3.f5132e, (Set) value);
                F9.c();
                i.p((i) F9.f5132e, (k1.g) q3.a());
                a3 = F9.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                k1.h F10 = i.F();
                byte[] bArr = (byte[]) value;
                C0253g c0253g = C0253g.f5064f;
                C0253g d3 = C0253g.d(bArr, 0, bArr.length);
                F10.c();
                i.r((i) F10.f5132e, d3);
                a3 = F10.a();
            }
            p3.getClass();
            str.getClass();
            p3.c();
            k1.e.n((k1.e) p3.f5132e).put(str, (i) a3);
        }
        k1.e eVar = (k1.e) p3.a();
        w wVar = new w(xVar);
        int a5 = eVar.a(null);
        Logger logger = C0258l.f5097h;
        if (a5 > 4096) {
            a5 = 4096;
        }
        C0258l c0258l = new C0258l(wVar, a5);
        eVar.b(c0258l);
        if (c0258l.f5102f > 0) {
            c0258l.I();
        }
    }
}
