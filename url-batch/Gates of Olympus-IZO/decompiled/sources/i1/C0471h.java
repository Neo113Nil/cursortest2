package i1;

import M1.B;
import M1.l;
import N2.w;
import N2.x;
import N2.y;
import N2.z;
import Z1.i;
import androidx.datastore.preferences.protobuf.AbstractC0211v;
import androidx.datastore.preferences.protobuf.AbstractC0213x;
import androidx.datastore.preferences.protobuf.C0197g;
import androidx.datastore.preferences.protobuf.C0202l;
import androidx.datastore.preferences.protobuf.C0215z;
import androidx.datastore.preferences.protobuf.InterfaceC0212w;
import e1.C0353b;
import f.AbstractC0382a;
import h1.C0432c;
import h1.C0434e;
import h1.C0435f;
import h1.C0436g;
import h1.C0437h;
import h1.C0438i;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import m.AbstractC0600j;

/* renamed from: i1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0471h f5115a = new C0471h();

    public final C0465b a(z zVar) {
        byte[] bArr;
        try {
            C0434e q2 = C0434e.q(new y(zVar));
            C0465b c0465b = new C0465b(false);
            AbstractC0468e[] abstractC0468eArr = (AbstractC0468e[]) Arrays.copyOf(new AbstractC0468e[0], 0);
            i.f(abstractC0468eArr, "pairs");
            c0465b.b();
            if (abstractC0468eArr.length > 0) {
                AbstractC0468e abstractC0468e = abstractC0468eArr[0];
                throw null;
            }
            Map o3 = q2.o();
            i.e(o3, "preferencesProto.preferencesMap");
            for (Map.Entry entry : o3.entrySet()) {
                String str = (String) entry.getKey();
                C0438i c0438i = (C0438i) entry.getValue();
                i.e(str, "name");
                i.e(c0438i, "value");
                int E3 = c0438i.E();
                switch (E3 == 0 ? -1 : AbstractC0470g.f5114a[AbstractC0600j.a(E3)]) {
                    case -1:
                        throw new C0353b("Value case is null.", null);
                    case 0:
                    default:
                        throw new L1.f();
                    case 1:
                        c0465b.c(new C0467d(str), Boolean.valueOf(c0438i.v()));
                        break;
                    case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                        c0465b.c(new C0467d(str), Float.valueOf(c0438i.z()));
                        break;
                    case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                        c0465b.c(new C0467d(str), Double.valueOf(c0438i.y()));
                        break;
                    case C0438i.LONG_FIELD_NUMBER /* 4 */:
                        c0465b.c(new C0467d(str), Integer.valueOf(c0438i.A()));
                        break;
                    case 5:
                        c0465b.c(new C0467d(str), Long.valueOf(c0438i.B()));
                        break;
                    case 6:
                        C0467d c0467d = new C0467d(str);
                        String C = c0438i.C();
                        i.e(C, "value.string");
                        c0465b.c(c0467d, C);
                        break;
                    case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                        C0467d c0467d2 = new C0467d(str);
                        InterfaceC0212w p = c0438i.D().p();
                        i.e(p, "value.stringSet.stringsList");
                        c0465b.c(c0467d2, l.F0(p));
                        break;
                    case 8:
                        C0467d c0467d3 = new C0467d(str);
                        C0197g w3 = c0438i.w();
                        int size = w3.size();
                        if (size == 0) {
                            bArr = AbstractC0213x.f3935b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            w3.i(size, bArr2);
                            bArr = bArr2;
                        }
                        i.e(bArr, "value.bytes.toByteArray()");
                        c0465b.c(c0467d3, bArr);
                        break;
                    case AbstractC0382a.f4777a /* 9 */:
                        throw new C0353b("Value not set.", null);
                }
            }
            return new C0465b(B.R(c0465b.a()), true);
        } catch (C0215z e3) {
            throw new C0353b("Unable to parse preferences proto.", e3);
        }
    }

    public final void b(Object obj, x xVar) {
        AbstractC0211v a3;
        Map a4 = ((C0465b) obj).a();
        C0432c p = C0434e.p();
        for (Map.Entry entry : a4.entrySet()) {
            C0467d c0467d = (C0467d) entry.getKey();
            Object value = entry.getValue();
            String str = c0467d.f5110a;
            if (value instanceof Boolean) {
                C0437h F3 = C0438i.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F3.c();
                C0438i.s((C0438i) F3.f3931e, booleanValue);
                a3 = F3.a();
            } else if (value instanceof Float) {
                C0437h F4 = C0438i.F();
                float floatValue = ((Number) value).floatValue();
                F4.c();
                C0438i.t((C0438i) F4.f3931e, floatValue);
                a3 = F4.a();
            } else if (value instanceof Double) {
                C0437h F5 = C0438i.F();
                double doubleValue = ((Number) value).doubleValue();
                F5.c();
                C0438i.q((C0438i) F5.f3931e, doubleValue);
                a3 = F5.a();
            } else if (value instanceof Integer) {
                C0437h F6 = C0438i.F();
                int intValue = ((Number) value).intValue();
                F6.c();
                C0438i.u((C0438i) F6.f3931e, intValue);
                a3 = F6.a();
            } else if (value instanceof Long) {
                C0437h F7 = C0438i.F();
                long longValue = ((Number) value).longValue();
                F7.c();
                C0438i.n((C0438i) F7.f3931e, longValue);
                a3 = F7.a();
            } else if (value instanceof String) {
                C0437h F8 = C0438i.F();
                F8.c();
                C0438i.o((C0438i) F8.f3931e, (String) value);
                a3 = F8.a();
            } else if (value instanceof Set) {
                C0437h F9 = C0438i.F();
                C0435f q2 = C0436g.q();
                i.d(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q2.c();
                C0436g.n((C0436g) q2.f3931e, (Set) value);
                F9.c();
                C0438i.p((C0438i) F9.f3931e, (C0436g) q2.a());
                a3 = F9.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                C0437h F10 = C0438i.F();
                byte[] bArr = (byte[]) value;
                C0197g c0197g = C0197g.f3863f;
                C0197g d3 = C0197g.d(bArr, 0, bArr.length);
                F10.c();
                C0438i.r((C0438i) F10.f3931e, d3);
                a3 = F10.a();
            }
            p.getClass();
            str.getClass();
            p.c();
            C0434e.n((C0434e) p.f3931e).put(str, (C0438i) a3);
        }
        C0434e c0434e = (C0434e) p.a();
        w wVar = new w(xVar);
        int a5 = c0434e.a(null);
        Logger logger = C0202l.f3896h;
        if (a5 > 4096) {
            a5 = 4096;
        }
        C0202l c0202l = new C0202l(wVar, a5);
        c0434e.b(c0202l);
        if (c0202l.f3901f > 0) {
            c0202l.I();
        }
    }
}
